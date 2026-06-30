package com.p314xaae8f345.p542x3306d5.p543xb9d38a2d;

/* renamed from: com.tencent.mars.account.AccountManagerCallback */
/* loaded from: classes12.dex */
public class C4438xc9063145 implements com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback {
    private static final java.lang.String TAG = "MicroMsg.AccountManagerCallback";

    @Override // com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback
    /* renamed from: calcNoticeid */
    public int mo37580x2c250768(byte[] bArr, int i17, int i18) {
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback
    /* renamed from: genCheckSum */
    public int mo37581x5dda8793(int i17, byte[] bArr, int i18) {
        int m75985x85b26348 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75985x85b26348(i17, com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153437q, bArr);
        int length = bArr.length;
        int length2 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153437q.length;
        return m75985x85b26348;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback
    /* renamed from: getGroupKey */
    public int mo37582x9a0868d6() {
        if (!z65.c.a() && !bm5.o1.f104252a.a()) {
            return 0;
        }
        com.p314xaae8f345.mm.p642xad8b531f.s sVar = ((km0.c) gm0.j1.p().a()).f390525f;
        int P = sVar != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(sVar.d(".com.tencent.mm.debug.groupKey"), 0) : 0;
        bm5.o1 o1Var = bm5.o1.f104252a;
        if (o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20116x20cdb068()) == 1) {
            P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(o1Var.l(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2525x20a6f421.C20117xe06f9105()), 0);
        }
        int i17 = P;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "assist groupKey %d", java.lang.Integer.valueOf(i17));
        return i17;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback
    /* renamed from: reportKV */
    public void mo37583xe68be19f(int i17, java.lang.String str, boolean z17, boolean z18, int i18, boolean z19) {
        jx3.f.INSTANCE.mo68478xbd3cda5f(i17, str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback
    /* renamed from: sm4gcmDecryptBuffer */
    public byte[] mo37584xdc9a69b6(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length <= 28 || bArr2 == null || bArr2.length < 16) {
            if (bArr == null || bArr.length <= 28) {
                jx3.f.INSTANCE.mo68477x336bdfd8(1934L, 4L, 1L, false);
            } else {
                jx3.f.INSTANCE.mo68477x336bdfd8(1934L, 5L, 1L, false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "sm4gcm protobuf length to short.");
            return bArr;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, 0, 16);
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr, 0, (bArr.length - 12) - 16);
        byte[] m121956xbad2fdf6 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121956xbad2fdf6(copyOfRange2, java.util.Arrays.copyOfRange(bArr, copyOfRange2.length + 12, bArr.length), copyOfRange, java.util.Arrays.copyOfRange(bArr, copyOfRange2.length, bArr.length - 16), new byte[0]);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(1934L, 2L, 1L, false);
        fVar.mo68477x336bdfd8(1934L, 3L, currentTimeMillis2, false);
        return m121956xbad2fdf6;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p543xb9d38a2d.C4437x20da8ce0.Callback
    /* renamed from: sm4gcmEncryptBuffer */
    public byte[] mo37585x105c408e(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length < 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "sm4gcm key is null or too short");
            return null;
        }
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "sm4gcm inputData is null");
            return null;
        }
        java.lang.System.currentTimeMillis();
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr2, 0, 16);
        byte[] m121938xd4b76d68 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121938xd4b76d68(12);
        byte[][] m121957xff14d6ce = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121957xff14d6ce(bArr, copyOfRange, m121938xd4b76d68, new byte[0]);
        byte[] array = java.nio.ByteBuffer.wrap(new byte[m121957xff14d6ce[0].length + m121938xd4b76d68.length + m121957xff14d6ce[1].length]).put(m121957xff14d6ce[0]).put(m121938xd4b76d68).put(m121957xff14d6ce[1]).array();
        java.lang.System.currentTimeMillis();
        return array;
    }
}
