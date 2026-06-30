package ze5;

/* loaded from: classes9.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f553673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553675f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.s2 f553676g;

    public p2(ot0.q qVar, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ze5.s2 s2Var) {
        this.f553673d = qVar;
        this.f553674e = dVar;
        this.f553675f = f9Var;
        this.f553676g = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553675f;
        ot0.q qVar = this.f553673d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o9.c(qVar, view, this.f553674e, f9Var, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq(this.f553676g));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemAppMsgGameShareMvvm", th6, "handleClick error", new java.lang.Object[0]);
        }
        ((l63.h) ((m63.g) i95.n0.c(m63.g.class))).wi(qVar, java.lang.Long.valueOf(f9Var.I0()), 2);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgGameShareMvvm$preDealData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
