package bm2;

/* loaded from: classes3.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z42 f103386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103387f;

    public e0(bm2.v0 v0Var, r45.z42 z42Var, android.content.Context context) {
        this.f103385d = v0Var;
        this.f103386e = z42Var;
        this.f103387f = context;
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
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        bm2.v0 v0Var = this.f103385d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v0Var.f103894d, "pushBtn-1, fastClick return");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = v0Var.f103894d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pushBtn-1, presenter is null:");
        sb6.append(v0Var.f103901n == null);
        sb6.append(", promoteItem:");
        r45.z42 z42Var = this.f103386e;
        sb6.append(pm0.b0.g(z42Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        wt2.a aVar = v0Var.f103901n;
        if (aVar != null) {
            android.content.Context context = this.f103387f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            aVar.J3(context, z42Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
