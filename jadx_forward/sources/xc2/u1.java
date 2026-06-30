package xc2;

/* loaded from: classes9.dex */
public final class u1 implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f534842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f534843b;

    public u1(in5.s0 s0Var, xc2.p0 p0Var) {
        this.f534842a = s0Var;
        this.f534843b = p0Var;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        in5.s0 s0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBundle, "appBundle");
        if (appBundle instanceof l81.b1) {
            l81.b1 b1Var = (l81.b1) appBundle;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b1Var.G, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.Y) || (s0Var = this.f534842a) == null) {
                return;
            }
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4 a4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class);
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = ((sc2.a8) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(sc2.a8.class)).m158358x197d1fc6();
            xc2.p0 p0Var = this.f534843b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15360x63e3b670 c15360x63e3b670 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15360x63e3b670(true, a4Var.T6(m158358x197d1fc6, p0Var.f534777f, s0Var));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = b1Var.G;
            if (c11816x5915d2c1 != null) {
                c11816x5915d2c1.f158899p = c15360x63e3b670;
            }
            b1Var.L = new xc2.t1();
            eq.a.f337311b = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpEcs in Finder, isHalfMiniProgramShowing, feedid is ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var.f534777f;
            sb6.append(abstractC14490x69736cb5 != null ? java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", sb6.toString());
        }
    }
}
