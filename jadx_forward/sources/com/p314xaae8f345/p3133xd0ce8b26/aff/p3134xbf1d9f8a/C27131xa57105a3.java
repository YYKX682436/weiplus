package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.affroam.ZIDL_esFfd8OmK */
/* loaded from: classes5.dex */
public class C27131xa57105a3 {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_FX */
    private void m110853x1964d21a(java.lang.Object obj, int i17, byte[] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f1) obj).a(i17, (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f.f297356h, bArr));
    }

    /* renamed from: ZIDL_GX */
    private void m110854x1964d239(java.lang.Object obj, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.d1) obj);
        yVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - yVar.f174460a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete backup data complete, pkgId=");
        long j17 = yVar.f174461b;
        sb6.append(j17);
        sb6.append(", errorCode=");
        sb6.append(i17);
        sb6.append(", duration = ");
        sb6.append(currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        int size = yVar.f174463d.size();
        int i18 = yVar.f174464e.f297365g.f297521d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("isAll", java.lang.Long.valueOf(yVar.f174462c ? 1L : 0L));
        linkedHashMap.put("conversationListSize", java.lang.Long.valueOf(size));
        linkedHashMap.put("deviceType", java.lang.Long.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "reportDeleteData, extraInfoMap = " + linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.Y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k0(currentTimeMillis, linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 9L;
        c6839x89375b51.f141600e = 7L;
        k0Var.mo146xb9724478(c6839x89375b51);
        c6839x89375b51.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b.f174101a.b(j17);
        r0Var.q(j17);
        ((nv.v1) i95.n0.c(nv.v1.class)).Ri(j17);
        yz5.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174223g;
        if (qVar != null) {
            qVar.mo147xb9724478(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.FALSE);
        }
        r0Var.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.a(r0Var, yVar.f174461b, yVar.f174465f, yVar.f174466g, i17);
    }

    /* renamed from: ZIDL_JX */
    private void m110855x1964d296(java.lang.Object obj, int i17, byte[][] bArr) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119643x3ed538a1(bArr);
        throw null;
    }

    /* renamed from: ZIDL_KX */
    private void m110856x1964d2b5(java.lang.Object obj, long j17, int i17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.f1 f1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.f1) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g1) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.f174126a.f174206d, "[loadMediaAsync] invokeId=" + j17 + ", error=" + i17 + ", tempPath=" + str);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) f1Var.f174127b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Integer.valueOf(i17), str)));
    }

    /* renamed from: ZIDL_esFfd8OmD */
    public static native void m110857xa571059c(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: ZIDL_B */
    public native int m110858x9db8edfa(long j17, long j18);

    /* renamed from: ZIDL_C */
    public native byte[] m110859x9db8edfb(long j17);

    /* renamed from: ZIDL_D */
    public native byte[] m110860x9db8edfc(long j17, byte[] bArr);

    /* renamed from: ZIDL_E */
    public native byte[] m110861x9db8edfd(long j17, byte[] bArr);

    /* renamed from: ZIDL_FV */
    public native void m110862x1964d218(long j17, java.lang.Object obj, long j18, long j19);

    /* renamed from: ZIDL_GV */
    public native void m110863x1964d237(long j17, java.lang.Object obj, byte[][] bArr, boolean z17);

    /* renamed from: ZIDL_H */
    public native void m110864x9db8ee00(long j17, byte[] bArr);

    /* renamed from: ZIDL_I */
    public native void m110865x9db8ee01(long j17);

    /* renamed from: ZIDL_JV */
    public native void m110866x1964d294(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_KV */
    public native void m110867x1964d2b3(long j17, java.lang.Object obj, byte[] bArr, long j18, long j19, byte[] bArr2);

    /* renamed from: ZIDL_L */
    public native void m110868x9db8ee04(long j17, long j18, int i17);

    /* renamed from: ZIDL_M */
    public native byte[] m110869x9db8ee05(long j17);

    /* renamed from: ZIDL_N */
    public native int m110870x9db8ee06(long j17, byte[] bArr);

    /* renamed from: ZIDL_O */
    public native long m110871x9db8ee07(long j17, byte[] bArr);

    /* renamed from: ZIDL_esFfd8OmC */
    public native void m110872xa571059b(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
