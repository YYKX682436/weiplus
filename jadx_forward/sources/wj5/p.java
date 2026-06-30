package wj5;

/* loaded from: classes8.dex */
public final class p extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f528363e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d f528364f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.p f528365g;

    public p(yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext, yj5.p processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        this.f528363e = ui6;
        this.f528364f = tipsBarContext;
        this.f528365g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.brr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        xj5.f item = (xj5.f) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ifm);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ife);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ifh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) p17;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        java.lang.String x17 = this.f528363e.x();
        relativeLayout.setVisibility(8);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        oo0.a aVar = item.f536435u;
        oo0.d dVar = (oo0.d) aVar;
        java.lang.String str2 = dVar.f67835x7240533c;
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f374654e;
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("主播：");
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = dVar.f67831x1e43a490;
        java.util.HashSet hashSet = com.p314xaae8f345.mm.ui.u9.f292606d;
        if (str3 == null) {
            str = "";
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String a17 = c01.a2.a(str3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(x17);
                if (z07 == null) {
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    str = c01.a2.e(str3);
                } else {
                    a17 = z07.z0(str3);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                        str = c01.a2.e(str3);
                    }
                }
            }
            str = a17;
        }
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar2).getClass();
        sb6.append((java.lang.Object) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        textView2.setText(sb6.toString());
        itemView.setOnClickListener(new wj5.m(x17, this, aVar, holder));
        relativeLayout.setOnClickListener(new wj5.n(item, x17, this, aVar));
        n(itemView, i17, this.f528364f, new wj5.o(relativeLayout));
    }

    @Override // wj5.c, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
