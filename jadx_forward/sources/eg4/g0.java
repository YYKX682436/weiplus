package eg4;

/* loaded from: classes11.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.i0 f334243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.ib f334245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.e9 f334246g;

    public g0(eg4.i0 i0Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar, com.p314xaae8f345.mm.p2621x8fb0427b.e9 e9Var) {
        this.f334243d = i0Var;
        this.f334244e = context;
        this.f334245f = ibVar;
        this.f334246g = e9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f334244e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        java.lang.String str = this.f334246g.f275392a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getFromUsername(...)");
        eg4.i0 i0Var = this.f334243d;
        i0Var.getClass();
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(context, new eg4.b0(context, str, i0Var, this.f334245f));
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordNewItemConvert$onBindViewHolder$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
