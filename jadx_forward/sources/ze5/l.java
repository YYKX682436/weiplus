package ze5;

/* loaded from: classes9.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f553588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f553589f;

    public l(yb5.d dVar, android.view.View view, android.widget.TextView textView) {
        this.f553587d = dVar;
        this.f553588e = view;
        this.f553589f = textView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$Companion$todoSourceViewCreator$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) view.getTag();
        android.view.View view2 = this.f553588e;
        android.widget.TextView textView = this.f553589f;
        yb5.d dVar = this.f553587d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.m(f9Var, dVar, 1, new ze5.k(view2, textView, dVar));
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandMvvm$Companion$todoSourceViewCreator$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
