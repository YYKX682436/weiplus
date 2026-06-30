package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class w1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f206340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xk f206341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z1 f206342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206343d;

    public w1(ya2.b2 b2Var, r45.xk xkVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z1 z1Var, java.lang.String str) {
        this.f206340a = b2Var;
        this.f206341b = xkVar;
        this.f206342c = z1Var;
        this.f206343d = str;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
            ya2.b2 b2Var = this.f206340a;
            java.lang.String D0 = b2Var != null ? b2Var.D0() : "";
            r45.xk xkVar = this.f206341b;
            java.lang.String m75945x2fec8307 = xkVar.m75945x2fec8307(0);
            java.lang.String str = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.z1 z1Var = this.f206342c;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = z1Var.f206374a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            o3Var.Ak(3, D0, str, "", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t2.f206896a.a(z1Var.f206374a, this.f206343d, false, xkVar.m75945x2fec8307(6), xkVar.m75945x2fec8307(0), z1Var.f206374a.getIntent().getLongExtra("finder_from_feed_id", 0L));
        }
    }
}
