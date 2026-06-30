package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.affroam.ZIDL_esFfJ9_ZpK */
/* loaded from: classes5.dex */
public class C27128xdc66c97b {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_AX */
    private void m110745x1964d17f(java.lang.Object obj, int i17, long[] jArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y0) obj).a(i17, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119616xfc7c3156(jArr));
    }

    /* renamed from: ZIDL_BX */
    private void m110746x1964d19e(java.lang.Object obj, int i17, long[] jArr) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119616xfc7c3156(jArr);
        throw null;
    }

    /* renamed from: ZIDL_CX */
    private void m110747x1964d1bd(java.lang.Object obj, int i17, byte[][] bArr) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g.f297361p, bArr);
        throw null;
    }

    /* renamed from: ZIDL_DX */
    private void m110748x1964d1dc(java.lang.Object obj, int i17, byte[][] bArr) {
        ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a1) obj).a(i17, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g.f297361p, bArr));
    }

    /* renamed from: ZIDL_FX */
    private void m110749x1964d21a(java.lang.Object obj, int i17, byte[][] bArr) {
        java.lang.Object obj2;
        java.util.ArrayList m119629xd40dd8d = com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g.f297361p, bArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.q0 q0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.q0) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b1) obj);
        q0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[+] Update backup package complete, error = ");
        sb6.append(i17);
        sb6.append(", packageId = ");
        long j17 = q0Var.f174213a;
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m119629xd40dd8d);
        java.util.Iterator it = m119629xd40dd8d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj2).f297362d == j17) {
                    break;
                }
            }
        }
        q0Var.f174214b.mo149xb9724478(java.lang.Integer.valueOf(i17), (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj2);
    }

    /* renamed from: ZIDL_GX */
    private void m110750x1964d239(java.lang.Object obj, int i17, byte[][] bArr) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g.f297361p, bArr);
        throw null;
    }

    /* renamed from: ZIDL_HX */
    private void m110751x1964d258(java.lang.Object obj, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.b0) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z0) obj);
        b0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - b0Var.f174103a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[+] Delete backup package complete, error = " + i17 + ", packageId = " + b0Var.f174104b + ", duration = " + currentTimeMillis);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = b0Var.f174105c;
        long j17 = gVar.f297370o.f297371d;
        int i18 = gVar.f297365g.f297521d;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("duration", java.lang.Long.valueOf(currentTimeMillis));
        linkedHashMap.put("pkgSize", java.lang.Long.valueOf(j17));
        linkedHashMap.put("deviceType", java.lang.Long.valueOf(i18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "reportDeletePackage, extraInfoMap = " + linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1 y1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.R;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l0(currentTimeMillis, linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 8L;
        c6839x89375b51.f141600e = 8L;
        l0Var.mo146xb9724478(c6839x89375b51);
        c6839x89375b51.k();
        ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.z(b0Var.f174104b), 1500L);
        b0Var.f174106d.f374988d = 1.0f;
        r0Var.q(b0Var.f174104b);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a0(b0Var.f174104b, i17, b0Var.f174107e);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(a0Var, 500L, false);
    }

    /* renamed from: ZIDL_IX */
    private void m110752x1964d277(java.lang.Object obj, int i17) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_AV */
    public native void m110753x1964d17d(long j17, java.lang.Object obj, byte[][] bArr);

    /* renamed from: ZIDL_BV */
    public native void m110754x1964d19c(long j17, java.lang.Object obj, byte[][] bArr);

    /* renamed from: ZIDL_CV */
    public native void m110755x1964d1bb(long j17, java.lang.Object obj, boolean z17);

    /* renamed from: ZIDL_DV */
    public native void m110756x1964d1da(long j17, java.lang.Object obj, boolean z17);

    /* renamed from: ZIDL_E */
    public native byte[] m110757x9db8edfd(long j17, long j18);

    /* renamed from: ZIDL_FV */
    public native void m110758x1964d218(long j17, java.lang.Object obj, byte[][] bArr);

    /* renamed from: ZIDL_GV */
    public native void m110759x1964d237(long j17, java.lang.Object obj, byte[][] bArr);

    /* renamed from: ZIDL_HV */
    public native void m110760x1964d256(long j17, java.lang.Object obj, long[] jArr);

    /* renamed from: ZIDL_IV */
    public native void m110761x1964d275(long j17, java.lang.Object obj, long[] jArr);

    /* renamed from: ZIDL_J */
    public native int m110762x9db8ee02(long j17);

    /* renamed from: ZIDL_esFfJ9_ZpC */
    public native void m110763xdc66c973(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
