package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes5.dex */
public final class w5 implements hh4.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hh4.m f158153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x5 f158154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f158155c;

    public w5(hh4.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x5 x5Var, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d) {
        this.f158153a = mVar;
        this.f158154b = x5Var;
        this.f158155c = c10756x2a5d7b2d;
    }

    public void a(java.lang.String openSessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openSessionId, "openSessionId");
        gh4.s0 s0Var = (gh4.s0) this.f158153a;
        s0Var.getClass();
        ((java.util.concurrent.CopyOnWriteArrayList) s0Var.f353488e).remove(this);
        java.lang.String str = this.f158154b.f158183a;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = this.f158155c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[AppBrandGuideStruct]appBrandSessionId:%s, openSessionId:%s", c10756x2a5d7b2d, openSessionId);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6312x88875c0b c6312x88875c0b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6312x88875c0b();
        c6312x88875c0b.f136682d = c6312x88875c0b.b("AppBrandSessionId", fp.s0.b(c10756x2a5d7b2d.f149939d, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), true);
        c6312x88875c0b.f136683e = c6312x88875c0b.b("TaskBarOpenSessionId", openSessionId, true);
        c6312x88875c0b.f136684f = java.lang.System.currentTimeMillis();
        c6312x88875c0b.k();
    }
}
