package af5;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f86156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l15.c f86157e;

    public p(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, l15.c cVar) {
        this.f86156d = f9Var;
        this.f86157e = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAskShareMvvmView$onItemClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ji5.b bVar = ji5.b.f381494a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        bVar.a(context, this.f86156d, this.f86157e);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/ChattingAskShareMvvmView$onItemClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
