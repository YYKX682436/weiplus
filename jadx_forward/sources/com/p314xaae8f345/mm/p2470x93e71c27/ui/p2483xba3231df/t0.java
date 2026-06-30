package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public final class t0 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 f272524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n3 f272525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0 f272526f;

    public t0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n3 n3Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0 u0Var) {
        this.f272524d = g2Var;
        this.f272525e = n3Var;
        this.f272526f = u0Var;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (data.f272551h) {
            this.f272524d.f270852l = null;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n3 n3Var = this.f272525e;
            if (n3Var != null) {
                n3Var.a();
            }
        }
        android.content.Context context = itemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f272526f.c(context, data);
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0 u0Var = this.f272526f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = u0Var.f272530p;
        u0Var.k(c22848x6ddd90cf != null ? c22848x6ddd90cf.b0() : null, i17, com.p314xaae8f345.mm.R.id.e1s, data.b(), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.s0(u0Var));
        return true;
    }
}
