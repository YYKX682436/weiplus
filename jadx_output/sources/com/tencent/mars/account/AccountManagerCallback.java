package com.tencent.mars.account;

/* loaded from: classes12.dex */
public class AccountManagerCallback implements com.tencent.mars.account.AccountManager.Callback {
    private static final java.lang.String TAG = "MicroMsg.AccountManagerCallback";

    @Override // com.tencent.mars.account.AccountManager.Callback
    public int calcNoticeid(byte[] bArr, int i17, int i18) {
        return 0;
    }

    @Override // com.tencent.mars.account.AccountManager.Callback
    public int genCheckSum(int i17, byte[] bArr, int i18) {
        int genSignature = com.tencent.mm.protocal.MMProtocalJni.genSignature(i17, com.tencent.mm.network.x2.c().f71993n.f71904q, bArr);
        int length = bArr.length;
        int length2 = com.tencent.mm.network.x2.c().f71993n.f71904q.length;
        return genSignature;
    }

    @Override // com.tencent.mars.account.AccountManager.Callback
    public int getGroupKey() {
        if (!z65.c.a() && !bm5.o1.f22719a.a()) {
            return 0;
        }
        com.tencent.mm.booter.s sVar = ((km0.c) gm0.j1.p().a()).f308992f;
        int P = sVar != null ? com.tencent.mm.sdk.platformtools.t8.P(sVar.d(".com.tencent.mm.debug.groupKey"), 0) : 0;
        bm5.o1 o1Var = bm5.o1.f22719a;
        if (o1Var.h(new com.tencent.mm.repairer.config.debugger.RepairerConfigAssistEnable()) == 1) {
            P = com.tencent.mm.sdk.platformtools.t8.P(o1Var.l(new com.tencent.mm.repairer.config.debugger.RepairerConfigAssistGroupKey()), 0);
        }
        int i17 = P;
        com.tencent.mars.xlog.Log.i(TAG, "assist groupKey %d", java.lang.Integer.valueOf(i17));
        return i17;
    }

    @Override // com.tencent.mars.account.AccountManager.Callback
    public void reportKV(int i17, java.lang.String str, boolean z17, boolean z18, int i18, boolean z19) {
        jx3.f.INSTANCE.kvStat(i17, str);
    }

    @Override // com.tencent.mars.account.AccountManager.Callback
    public byte[] sm4gcmDecryptBuffer(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length <= 28 || bArr2 == null || bArr2.length < 16) {
            if (bArr == null || bArr.length <= 28) {
                jx3.f.INSTANCE.idkeyStat(1934L, 4L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(1934L, 5L, 1L, false);
            }
            com.tencent.mars.xlog.Log.w(TAG, "sm4gcm protobuf length to short.");
            return bArr;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, 0, 16);
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr, 0, (bArr.length - 12) - 16);
        byte[] sm4GcmDecrypt = com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm4GcmDecrypt(copyOfRange2, java.util.Arrays.copyOfRange(bArr, copyOfRange2.length + 12, bArr.length), copyOfRange, java.util.Arrays.copyOfRange(bArr, copyOfRange2.length, bArr.length - 16), new byte[0]);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(1934L, 2L, 1L, false);
        fVar.idkeyStat(1934L, 3L, currentTimeMillis2, false);
        return sm4GcmDecrypt;
    }

    @Override // com.tencent.mars.account.AccountManager.Callback
    public byte[] sm4gcmEncryptBuffer(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length < 16) {
            com.tencent.mars.xlog.Log.e(TAG, "sm4gcm key is null or too short");
            return null;
        }
        if (bArr == null) {
            com.tencent.mars.xlog.Log.e(TAG, "sm4gcm inputData is null");
            return null;
        }
        java.lang.System.currentTimeMillis();
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, 0, 16);
        byte[] randomBytes = com.tenpay.ndk.WxSmCryptoUtil.getInstance().randomBytes(12);
        byte[][] sm4GcmEncrypt = com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm4GcmEncrypt(bArr, copyOfRange, randomBytes, new byte[0]);
        byte[] array = java.nio.ByteBuffer.wrap(new byte[sm4GcmEncrypt[0].length + randomBytes.length + sm4GcmEncrypt[1].length]).put(sm4GcmEncrypt[0]).put(randomBytes).put(sm4GcmEncrypt[1]).array();
        java.lang.System.currentTimeMillis();
        return array;
    }
}
