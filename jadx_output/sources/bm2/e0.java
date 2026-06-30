package bm2;

/* loaded from: classes3.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f21852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z42 f21853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21854f;

    public e0(bm2.v0 v0Var, r45.z42 z42Var, android.content.Context context) {
        this.f21852d = v0Var;
        this.f21853e = z42Var;
        this.f21854f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        bm2.v0 v0Var = this.f21852d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(v0Var.f22361d, "pushBtn-1, fastClick return");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = v0Var.f22361d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pushBtn-1, presenter is null:");
        sb6.append(v0Var.f22368n == null);
        sb6.append(", promoteItem:");
        r45.z42 z42Var = this.f21853e;
        sb6.append(pm0.b0.g(z42Var));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        wt2.a aVar = v0Var.f22368n;
        if (aVar != null) {
            android.content.Context context = this.f21854f;
            kotlin.jvm.internal.o.f(context, "$context");
            aVar.J3(context, z42Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
