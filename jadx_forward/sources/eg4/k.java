package eg4;

/* loaded from: classes11.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.t f334277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y35.r f334279f;

    public k(eg4.t tVar, android.content.Context context, y35.r rVar) {
        this.f334277d = tVar;
        this.f334278e = context;
        this.f334279f = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$handleState$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eg4.t tVar = this.f334277d;
        tVar.getClass();
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        android.content.Context context = this.f334278e;
        ((ms.a) kVar).Ai(context, new eg4.h(context, this.f334279f, tVar));
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$handleState$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
