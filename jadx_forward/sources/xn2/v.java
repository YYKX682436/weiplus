package xn2;

/* loaded from: classes2.dex */
public final class v implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f537115e;

    public v(xn2.p0 p0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f537114d = p0Var;
        this.f537115e = c1163xf1deaba4;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f374658i;
        boolean z17 = j5Var instanceof zn2.a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f537115e;
        xn2.p0 p0Var = this.f537114d;
        if (z17) {
            zn2.a aVar = (zn2.a) j5Var;
            p0Var.o(aVar, i17);
            android.content.Context context = c1163xf1deaba4.getContext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = aVar.getFeedObject();
            java.lang.String str = aVar.f556021i;
            boolean h17 = p0Var.h();
            xn2.p0 p0Var2 = this.f537114d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            p0Var2.n(1, context, holder, feedObject, i17, str, h17);
            return;
        }
        if (!(j5Var instanceof zn2.c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "click position=" + i17 + " feed:" + j5Var);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "click position=" + i17 + ",finderContextId=" + p0Var.f537077b + ",SeeLaterCardFeed:" + j5Var);
        android.content.Context context2 = c1163xf1deaba4.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = ((zn2.c) j5Var).getFeedObject();
        int i18 = qg3.g1.f444353d;
        java.lang.String m169879x21b8cb32 = p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32();
        xn2.p0 p0Var3 = this.f537114d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        p0Var3.n(3, context2, holder, feedObject2, i17, m169879x21b8cb32, false);
    }
}
