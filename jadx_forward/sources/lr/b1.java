package lr;

/* loaded from: classes12.dex */
public final class b1 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f402032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f564805a50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f402032f = (android.widget.ImageView) findViewById;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        ir.a1 a1Var = (ir.a1) this.f402114e;
        if (a1Var != null) {
            com.p314xaae8f345.mm.p2614xca6eae71.e1 b17 = com.p314xaae8f345.mm.p2614xca6eae71.e1.b();
            gr.c0 c0Var = a1Var.f375347b;
            android.graphics.drawable.Drawable c17 = b17.c(c0Var.f356196a);
            android.widget.ImageView imageView = this.f402032f;
            imageView.setImageDrawable(c17);
            com.p314xaae8f345.mm.p2614xca6eae71.e1 b18 = com.p314xaae8f345.mm.p2614xca6eae71.e1.b();
            java.lang.String key = c0Var.f356196a;
            java.lang.String d17 = b18.d(key);
            if (a1Var.f375348c) {
                if (c17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("smiley", "smiley_log d " + key + ", d " + d17 + ", d " + c17.getConstantState());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("smiley", "smiley_log d " + key + ", d " + d17 + ", d is null");
                    if (!android.text.TextUtils.isEmpty(key)) {
                        com.p314xaae8f345.mm.p2614xca6eae71.n1 n1Var = com.p314xaae8f345.mm.p2614xca6eae71.t1.f274908m;
                        com.p314xaae8f345.mm.p2614xca6eae71.t1 a17 = n1Var.a();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21054xf494c2df f17 = a17.f(key);
                        if (f17 != null) {
                            com.p314xaae8f345.mm.p2614xca6eae71.t1 a18 = n1Var.a();
                            int i17 = f17.f67255x4a55a2ce;
                            if (i17 >= 0) {
                                a18.c(i17);
                            } else {
                                a18.b(f17.f67252xf1e8cfcc);
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("smiley", "smiley_log si is null false");
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smiley_log si is null ");
                            com.p314xaae8f345.mm.p2614xca6eae71.g b19 = com.p314xaae8f345.mm.p2614xca6eae71.g.b();
                            com.p314xaae8f345.mm.p2614xca6eae71.b2 c18 = com.p314xaae8f345.mm.p2614xca6eae71.g.b().c(key);
                            b19.getClass();
                            boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
                            com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.getClass();
                            int i18 = com.p314xaae8f345.mm.p2614xca6eae71.e.f274769b;
                            sb6.append(com.p314xaae8f345.mm.p2614xca6eae71.d.f274766a.a(c18, true) == null);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("smiley", sb6.toString());
                        }
                    }
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                d17 = this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzu);
            }
            imageView.setContentDescription(d17);
        }
    }
}
