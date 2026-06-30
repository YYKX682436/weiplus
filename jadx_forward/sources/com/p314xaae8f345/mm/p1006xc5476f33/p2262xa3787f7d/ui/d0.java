package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f254495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18570xe27ff90a f254496e;

    public d0(android.widget.RelativeLayout relativeLayout, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18570xe27ff90a activityC18570xe27ff90a) {
        this.f254495d = relativeLayout;
        this.f254496e = activityC18570xe27ff90a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        android.content.Context context = this.f254495d.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18570xe27ff90a activityC18570xe27ff90a = this.f254496e;
        c0Var.u6(context, activityC18570xe27ff90a.getIntent().getIntExtra("intent_extra_type", 0), activityC18570xe27ff90a.getIntent().getStringExtra("intent_extra_key"), activityC18570xe27ff90a.getIntent().getStringExtra("intent_extra_title"), activityC18570xe27ff90a.getIntent().getStringExtra("intent_extra_digest"), activityC18570xe27ff90a.getIntent().getStringExtra("intent_extra_content"), null, new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.c0(activityC18570xe27ff90a));
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationRequestUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
