package ze5;

/* loaded from: classes5.dex */
public final class p9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.q9 f553688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f553690f;

    public p9(ze5.q9 q9Var, yb5.d dVar, rd5.d dVar2) {
        this.f553688d = q9Var;
        this.f553689e = dVar;
        this.f553690f = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemTingSpaceMvvm$ChattingItemTingSpaceMvvmTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f553688d.R(view, this.f553689e, this.f553690f.f475787d.f526833b);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemTingSpaceMvvm$ChattingItemTingSpaceMvvmTo$preDealData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
