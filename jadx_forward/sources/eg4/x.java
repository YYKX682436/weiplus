package eg4;

/* loaded from: classes4.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.d2 f334360e;

    public x(android.content.Context context, eg4.d2 d2Var) {
        this.f334359d = context;
        this.f334360e = d2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordHeaderItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (r61.q0.b() != js.x0.SUCC) {
            android.content.Intent intent = new android.content.Intent(this.f334359d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
            intent.putExtra("key_upload_scene", 5);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this.f334359d, intent);
        } else {
            android.content.Context context = this.f334359d;
            android.content.Intent intent2 = new android.content.Intent(this.f334359d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordHeaderItemConvert$onBindViewHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordHeaderItemConvert$onBindViewHolder$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ((ku5.t0) ku5.t0.f394148d).q(new eg4.w(this.f334360e));
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/AddFriendVerifyRecordHeaderItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
