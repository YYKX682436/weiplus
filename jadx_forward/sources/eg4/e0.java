package eg4;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f334226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.ib f334228f;

    public e0(eg4.i0 i0Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar) {
        this.f334226d = i0Var;
        this.f334227e = context;
        this.f334228f = ibVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f334227e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        eg4.i0.n(this.f334226d, context, this.f334228f);
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
