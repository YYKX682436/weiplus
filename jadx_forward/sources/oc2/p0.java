package oc2;

/* loaded from: classes8.dex */
public final class p0 extends oz5.a implements p3325xe03a0797.p3326xc267989b.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p3325xe03a0797.p3326xc267989b.q0 q0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b) {
        super(q0Var);
        this.f425772d = c13738xbdff117b;
    }

    @Override // p3325xe03a0797.p3326xc267989b.r0
    /* renamed from: handleException */
    public void mo565x9514ef07(oz5.l lVar, java.lang.Throwable th6) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch coroutine error, uuid:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b = this.f425772d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo = c13738xbdff117b.getCtrlInfo();
        sb6.append(ctrlInfo != null ? ctrlInfo.f65882x5364c75d : null);
        sb6.append(", tipsId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo2 = c13738xbdff117b.getCtrlInfo();
        sb6.append(ctrlInfo2 != null ? ctrlInfo2.f65880x11c19d58 : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String h17 = c13738xbdff117b.h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(h17, th6, sb7, new java.lang.Object[0]);
        java.lang.StackTraceElement[] stackTrace = th6.getStackTrace();
        pm0.z.b(xy2.b.f539688b, "RenderView_launch_coroutine_error", false, pm0.w.f438339g, null, false, false, new oc2.n0(h17, sb7, th6, stackTrace != null ? kz5.n0.g0(kz5.z.s0(stackTrace, 10), "\n", null, null, 0, null, oc2.o0.f425771d, 30, null) : null), 56, null);
    }
}
