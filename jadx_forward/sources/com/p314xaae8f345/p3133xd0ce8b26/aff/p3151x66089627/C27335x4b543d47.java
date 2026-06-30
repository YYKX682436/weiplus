package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.iam_scan.ZIDL_hY0gdKVCK */
/* loaded from: classes15.dex */
public class C27335x4b543d47 {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* renamed from: ZIDL_BX */
    private void m113058x1964d19e(java.lang.Object obj, int i17) {
        zs5.k kVar = (zs5.k) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f0) obj);
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", "doInitQBar callback ret: " + i17 + ", cost: " + (java.lang.System.currentTimeMillis() - kVar.f556976a));
        ((ku5.t0) ku5.t0.f394148d).D(new zs5.j(i17, kVar.f556976a, kVar.f556977b));
    }

    /* renamed from: ZIDL_FX */
    private void m113059x1964d21a(java.lang.Object obj) {
        zs5.x xVar = (zs5.x) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.g0) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopSession callback sessionId: ");
        sb6.append(xVar.f557031a);
        sb6.append(", tryStartSessionWhenStopDone: ");
        zs5.y yVar = xVar.f557032b;
        sb6.append(yVar.f557046n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        yVar.i(new zs5.w(yVar));
    }

    /* renamed from: ZIDL_GX */
    private void m113060x1964d239(java.lang.Object obj, byte[] bArr) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(obj);
        throw null;
    }

    /* renamed from: ZIDL_HX */
    private void m113061x1964d258(java.lang.Object obj, byte[] bArr, boolean z17, boolean z18, byte[] bArr2) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x xVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.x.f298684r, bArr);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y.f298712g, bArr2);
        zs5.h hVar = (zs5.h) ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.e0) obj);
        hVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addDecodeTask complete bufferKey:");
        sb6.append(xVar != null ? java.lang.Long.valueOf(xVar.f298685d) : null);
        sb6.append(", added: ");
        sb6.append(z17);
        sb6.append(", cached: ");
        sb6.append(z18);
        sb6.append(", cost: ");
        sb6.append(java.lang.System.currentTimeMillis() - hVar.f556927a);
        sb6.append(", scanFrameNum: ");
        sb6.append(hVar.f556928b.f557033a);
        sb6.append(", success: ");
        sb6.append(yVar != null ? java.lang.Boolean.valueOf(yVar.f298713d) : null);
        sb6.append(", handledDecodeSuccess: ");
        sb6.append(hVar.f556928b.f557048p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanDecodeQueue", sb6.toString());
        if (z17) {
            d75.b.g(new zs5.e(hVar.f556928b));
        }
        zs5.y yVar2 = hVar.f556928b;
        yVar2.i(new zs5.g(yVar2, z17, yVar, hVar.f556929c, hVar.f556930d, hVar.f556931e, hVar.f556932f, z18, hVar.f556933g, hVar.f556934h));
    }

    /* renamed from: ZIDL_A */
    public native void m113062x9db8edf9(long j17, byte[] bArr);

    /* renamed from: ZIDL_BV */
    public native void m113063x1964d19c(long j17, java.lang.Object obj, long j18, byte[] bArr);

    /* renamed from: ZIDL_C */
    public native void m113064x9db8edfb(long j17, long j18);

    /* renamed from: ZIDL_D */
    public native void m113065x9db8edfc(long j17, byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27695xd9fb0a86 c27695xd9fb0a86);

    /* renamed from: ZIDL_E */
    public native void m113066x9db8edfd(long j17, byte[] bArr);

    /* renamed from: ZIDL_FV */
    public native void m113067x1964d218(long j17, java.lang.Object obj, byte[] bArr);

    /* renamed from: ZIDL_GV */
    public native void m113068x1964d237(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, int i27, int i28, byte[] bArr);

    /* renamed from: ZIDL_HV */
    public native void m113069x1964d256(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, byte[] bArr);

    /* renamed from: ZIDL_I */
    public native void m113070x9db8ee01(long j17, byte[] bArr, int i17);

    /* renamed from: ZIDL_J */
    public native void m113071x9db8ee02(long j17, boolean z17, int i17);

    /* renamed from: ZIDL_K */
    public native byte[] m113072x9db8ee03(long j17);

    /* renamed from: ZIDL_L */
    public native void m113073x9db8ee04(long j17);

    /* renamed from: ZIDL_M */
    public native void m113074x9db8ee05(long j17, int i17);

    /* renamed from: ZIDL_hY0gdKVCC */
    public native void m113075x4b543d3f(java.lang.Object obj, java.lang.String str, java.lang.String str2);
}
