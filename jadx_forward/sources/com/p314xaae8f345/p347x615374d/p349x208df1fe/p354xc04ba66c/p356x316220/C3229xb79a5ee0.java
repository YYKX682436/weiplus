package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl */
/* loaded from: classes12.dex */
public class C3229xb79a5ee0 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be {
    private final java.lang.String TAG = "KindaCacheServiceImpl";

    /* renamed from: lastOpen */
    private boolean f12397xa900f200 = false;

    /* renamed from: isUseMMKVCache */
    private boolean m25855x87e737da() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_cache_to_mmkv, false);
        if (fj6 != this.f12397xa900f200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaCacheServiceImpl", "isUseMMKVCache:%s %s", java.lang.Boolean.valueOf(fj6), java.lang.Integer.valueOf(hashCode()));
            this.f12397xa900f200 = fj6;
        }
        return fj6;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be
    public byte[] get(java.lang.String str) {
        if (!m25855x87e737da()) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 c3122x5da4a908 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().get(str);
            if (c3122x5da4a908 == null || c3122x5da4a908.f69397xa987964e < java.lang.System.currentTimeMillis() / 1000) {
                return null;
            }
            return c3122x5da4a908.f69399x29f571ec;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
        if (M == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCacheServiceImpl", "get %s, but payMMKV is null", str);
        } else {
            byte[] j17 = M.j(str);
            if (j17 != null) {
                return j17;
            }
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 c3122x5da4a9082 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().get(str);
        if (c3122x5da4a9082 != null) {
            if (c3122x5da4a9082.f69397xa987964e < java.lang.System.currentTimeMillis() / 1000) {
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().mo9951xb06685ab(c3122x5da4a9082, new java.lang.String[0]);
                return null;
            }
            if (M != null) {
                M.I(str, c3122x5da4a9082.f69399x29f571ec, (int) (c3122x5da4a9082.f69397xa987964e - (java.lang.System.currentTimeMillis() / 1000)));
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().mo9951xb06685ab(c3122x5da4a9082, new java.lang.String[0]);
                return c3122x5da4a9082.f69399x29f571ec;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be
    /* renamed from: getBool */
    public boolean mo25856xfb7da360(java.lang.String str) {
        byte[] bArr = get(str);
        return bArr != null && bArr.length > 0 && bArr[0] == 1;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be
    /* renamed from: getInt64 */
    public long mo25857x74990537(java.lang.String str, long j17) {
        byte[] bArr = get(str);
        if (bArr == null || bArr.length < 8) {
            return j17;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.put(bArr);
        allocate.rewind();
        return allocate.getLong();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be
    /* renamed from: remove */
    public boolean mo25858xc84af884(java.lang.String str) {
        if (!m25855x87e737da()) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 c3122x5da4a908 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().get(str);
            if (c3122x5da4a908 != null) {
                return com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().mo9951xb06685ab(c3122x5da4a908, new java.lang.String[0]);
            }
            return true;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
        if (M == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCacheServiceImpl", "remove %s, but payMMKV is null", str);
        } else {
            M.W(str);
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 c3122x5da4a9082 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().get(str);
        if (c3122x5da4a9082 != null) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().mo9951xb06685ab(c3122x5da4a9082, new java.lang.String[0]);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be
    public void set(java.lang.String str, byte[] bArr, long j17) {
        if (m25855x87e737da()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet");
            if (M == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaCacheServiceImpl", "set %s, but payMMKV is null", str);
                return;
            } else {
                M.I(str, bArr, (int) j17);
                return;
            }
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 c3122x5da4a908 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908();
        c3122x5da4a908.f69398x4b6e619a = str;
        c3122x5da4a908.f69399x29f571ec = bArr;
        if (j17 == 0) {
            c3122x5da4a908.f69397xa987964e = (java.lang.System.currentTimeMillis() / 1000) + 315360000;
        } else {
            c3122x5da4a908.f69397xa987964e = (java.lang.System.currentTimeMillis() / 1000) + j17;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3159x26f940ae.m25492xfb7e1815().m25493x62038cba().m25113x35c17d(c3122x5da4a908);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be
    /* renamed from: setBool */
    public void mo25859x76486a6c(java.lang.String str, boolean z17, long j17) {
        byte[] bArr = new byte[1];
        if (z17) {
            bArr[0] = 1;
        }
        set(str, bArr, j17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3431xd80fd4be
    /* renamed from: setInt64 */
    public void mo25860x53271fab(java.lang.String str, long j17, long j18) {
        byte[] bArr = new byte[8];
        for (int i17 = 0; i17 < 8; i17++) {
            bArr[(8 - i17) - 1] = (byte) (255 & j17);
            j17 >>= 8;
        }
        set(str, bArr, j18);
    }
}
