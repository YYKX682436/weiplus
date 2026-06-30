package af5;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f4623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l15.c f4624e;

    public p(com.tencent.mm.storage.f9 f9Var, l15.c cVar) {
        this.f4623d = f9Var;
        this.f4624e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAskShareMvvmView$onItemClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ji5.b bVar = ji5.b.f299961a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bVar.a(context, this.f4623d, this.f4624e);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAskShareMvvmView$onItemClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
