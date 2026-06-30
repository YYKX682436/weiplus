package com.tencent.kinda.framework.module.impl;

/* loaded from: classes12.dex */
public class KindaCacheServiceImpl implements com.tencent.kinda.gen.KCacheService {
    private final java.lang.String TAG = "KindaCacheServiceImpl";
    private boolean lastOpen = false;

    private boolean isUseMMKVCache() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_cache_to_mmkv, false);
        if (fj6 != this.lastOpen) {
            com.tencent.mars.xlog.Log.i("KindaCacheServiceImpl", "isUseMMKVCache:%s %s", java.lang.Boolean.valueOf(fj6), java.lang.Integer.valueOf(hashCode()));
            this.lastOpen = fj6;
        }
        return fj6;
    }

    @Override // com.tencent.kinda.gen.KCacheService
    public byte[] get(java.lang.String str) {
        if (!isUseMMKVCache()) {
            com.tencent.kinda.framework.app.KindaCacheItem kindaCacheItem = com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().get(str);
            if (kindaCacheItem == null || kindaCacheItem.field_expire_at < java.lang.System.currentTimeMillis() / 1000) {
                return null;
            }
            return kindaCacheItem.field_value;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
        if (M == null) {
            com.tencent.mars.xlog.Log.e("KindaCacheServiceImpl", "get %s, but payMMKV is null", str);
        } else {
            byte[] j17 = M.j(str);
            if (j17 != null) {
                return j17;
            }
        }
        com.tencent.kinda.framework.app.KindaCacheItem kindaCacheItem2 = com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().get(str);
        if (kindaCacheItem2 != null) {
            if (kindaCacheItem2.field_expire_at < java.lang.System.currentTimeMillis() / 1000) {
                com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().delete(kindaCacheItem2, new java.lang.String[0]);
                return null;
            }
            if (M != null) {
                M.I(str, kindaCacheItem2.field_value, (int) (kindaCacheItem2.field_expire_at - (java.lang.System.currentTimeMillis() / 1000)));
                com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().delete(kindaCacheItem2, new java.lang.String[0]);
                return kindaCacheItem2.field_value;
            }
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KCacheService
    public boolean getBool(java.lang.String str) {
        byte[] bArr = get(str);
        return bArr != null && bArr.length > 0 && bArr[0] == 1;
    }

    @Override // com.tencent.kinda.gen.KCacheService
    public long getInt64(java.lang.String str, long j17) {
        byte[] bArr = get(str);
        if (bArr == null || bArr.length < 8) {
            return j17;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.put(bArr);
        allocate.rewind();
        return allocate.getLong();
    }

    @Override // com.tencent.kinda.gen.KCacheService
    public boolean remove(java.lang.String str) {
        if (!isUseMMKVCache()) {
            com.tencent.kinda.framework.app.KindaCacheItem kindaCacheItem = com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().get(str);
            if (kindaCacheItem != null) {
                return com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().delete(kindaCacheItem, new java.lang.String[0]);
            }
            return true;
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
        if (M == null) {
            com.tencent.mars.xlog.Log.e("KindaCacheServiceImpl", "remove %s, but payMMKV is null", str);
        } else {
            M.W(str);
        }
        com.tencent.kinda.framework.app.KindaCacheItem kindaCacheItem2 = com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().get(str);
        if (kindaCacheItem2 != null) {
            com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().delete(kindaCacheItem2, new java.lang.String[0]);
        }
        return true;
    }

    @Override // com.tencent.kinda.gen.KCacheService
    public void set(java.lang.String str, byte[] bArr, long j17) {
        if (isUseMMKVCache()) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet");
            if (M == null) {
                com.tencent.mars.xlog.Log.e("KindaCacheServiceImpl", "set %s, but payMMKV is null", str);
                return;
            } else {
                M.I(str, bArr, (int) j17);
                return;
            }
        }
        com.tencent.kinda.framework.app.KindaCacheItem kindaCacheItem = new com.tencent.kinda.framework.app.KindaCacheItem();
        kindaCacheItem.field_key = str;
        kindaCacheItem.field_value = bArr;
        if (j17 == 0) {
            kindaCacheItem.field_expire_at = (java.lang.System.currentTimeMillis() / 1000) + 315360000;
        } else {
            kindaCacheItem.field_expire_at = (java.lang.System.currentTimeMillis() / 1000) + j17;
        }
        com.tencent.kinda.framework.app.SubCoreKinda.getCore().getCacheStg().save(kindaCacheItem);
    }

    @Override // com.tencent.kinda.gen.KCacheService
    public void setBool(java.lang.String str, boolean z17, long j17) {
        byte[] bArr = new byte[1];
        if (z17) {
            bArr[0] = 1;
        }
        set(str, bArr, j17);
    }

    @Override // com.tencent.kinda.gen.KCacheService
    public void setInt64(java.lang.String str, long j17, long j18) {
        byte[] bArr = new byte[8];
        for (int i17 = 0; i17 < 8; i17++) {
            bArr[(8 - i17) - 1] = (byte) (255 & j17);
            j17 >>= 8;
        }
        set(str, bArr, j18);
    }
}
