package lf5;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f400052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f400053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f400054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e f400055g;

    public b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        this.f400052d = f9Var;
        this.f400053e = dVar;
        this.f400054f = a0Var;
        this.f400055g = c16565x9bc03d4e;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            long m124847x74d37ac6 = this.f400052d.m124847x74d37ac6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemQuoteHelper", "sourceTV long click msgId:%s", java.lang.Long.valueOf(m124847x74d37ac6));
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bj) ((sb5.o1) this.f400053e.f542241c.a(sb5.o1.class))).n0(view, new lf5.a(this.f400053e, this.f400054f, this.f400052d, m124847x74d37ac6, this.f400055g));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemQuoteHelper", e17, "sourceTV long click Exception", new java.lang.Object[0]);
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/viewitems/quote/ChattingItemQuoteHelper$fillingReferMsgWithHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
