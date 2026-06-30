package ze5;

/* loaded from: classes9.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.f f553423f;

    public e(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, ze5.f fVar) {
        this.f553421d = dVar;
        this.f553422e = f9Var;
        this.f553423f = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$ChattingItemAppBrandTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f553421d;
        boolean D = dVar.D();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f553422e;
        ot0.q v17 = ot0.q.v(c01.w9.l(D, f9Var.j(), f9Var.A0()));
        int i17 = v17.f430199i;
        if (i17 == 33) {
            te5.t.f500282a.d(dVar, f9Var);
        } else if (i17 == 36) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            te5.t.e(v17, dVar, view, f9Var, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq(this.f553423f));
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$ChattingItemAppBrandTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
