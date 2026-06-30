package lf5;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f400056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e f400057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f400058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 f400059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f400060h;

    public c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        this.f400056d = f9Var;
        this.f400057e = c16565x9bc03d4e;
        this.f400058f = dVar;
        this.f400059g = g0Var;
        this.f400060h = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f400056d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemQuoteHelper", "sourceTV click msgId:%s", java.lang.Long.valueOf(m124847x74d37ac6));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.d(this.f400058f, this.f400059g, this.f400060h, view, m124847x74d37ac6, Q0, this.f400057e);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemQuoteHelper", "sourceTV click Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
