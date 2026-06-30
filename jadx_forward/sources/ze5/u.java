package ze5;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553749e;

    public u(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f553748d = dVar;
        this.f553749e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandProfileCardMvvm$Companion$createViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te5.t.f500282a.d(this.f553748d, this.f553749e);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppBrandProfileCardMvvm$Companion$createViewModel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
