package eg4;

/* loaded from: classes11.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.m7 f334313e;

    public q(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var) {
        this.f334312d = context;
        this.f334313e = m7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = this.f334313e;
        eg4.g1.a(this.f334312d, m7Var, m7Var.f66376x114ef53e, false);
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordFMessageItemConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
