package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class y00 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f218043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f218044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f218045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 f218046g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f218047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t10 t10Var, in5.s0 s0Var) {
        super(0);
        this.f218043d = abstractActivityC21394xb3d2c0cf;
        this.f218044e = z17;
        this.f218045f = abstractC14490x69736cb5;
        this.f218046g = t10Var;
        this.f218047h = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f218043d;
        android.content.res.Resources resources = abstractActivityC21394xb3d2c0cf.getResources();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f218045f;
        boolean z17 = this.f218044e;
        db5.t7.h(abstractActivityC21394xb3d2c0cf, resources.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.nin : hc2.o0.g(abstractC14490x69736cb5.getFeedObject().getFeedObject()) ? com.p314xaae8f345.mm.R.C30867xcad56011.f573499ny5 : com.p314xaae8f345.mm.R.C30867xcad56011.f573498ny4));
        r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
        if (m76806xdef68064 != null) {
            if (z17) {
                m76806xdef68064.set(30, java.lang.Long.valueOf(m76806xdef68064.m75942xfb822ef2(30) & (-2049)));
            } else {
                m76806xdef68064.set(30, java.lang.Long.valueOf(m76806xdef68064.m75942xfb822ef2(30) | 2048));
                abstractC14490x69736cb5.getFeedObject().getFeedObject().m76903x60cfeedd(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76810x98d986d1() & (-2049));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = this.f218046g.f217495h;
        in5.s0 s0Var = this.f218047h;
        if (k8Var != null) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4 u4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.A;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) a17).O6(s0Var, k8Var, true);
        }
        bb2.p0 p0Var = bb2.p0.f100473a;
        android.view.View itemView = s0Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        bb2.a1 a18 = p0Var.a(itemView);
        if (a18 != null) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            p012xc85e97e9.p093xedfae76a.c1 a19 = pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
            java.lang.Object obj = s0Var.f374658i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u4 u4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.A;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) a19).e7(s0Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj, false);
            a18.a(true);
        }
        return jz5.f0.f384359a;
    }
}
