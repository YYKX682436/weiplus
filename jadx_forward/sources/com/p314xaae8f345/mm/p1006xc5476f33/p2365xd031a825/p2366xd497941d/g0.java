package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes10.dex */
public final class g0 implements zo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f260910a;

    public g0(yz5.l lVar) {
        this.f260910a = lVar;
    }

    @Override // zo0.c
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RealnameVerifySelectGuardianUI", "failed to load icon, send without thumb");
        this.f260910a.mo146xb9724478(null);
    }

    @Override // zo0.c
    public void b(hp0.i resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        jp0.f a17 = resp.a();
        this.f260910a.mo146xb9724478(a17 != null ? a17.a() : null);
        a17.close();
    }
}
