package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f254672e;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b, android.widget.TextView textView) {
        this.f254671d = activityC18590xc3d8bf2b;
        this.f254672e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b.f254433r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254671d;
        if (activityC18590xc3d8bf2b.i7()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("IntentResult_GoVerifyPwd", true);
            activityC18590xc3d8bf2b.setResult(0, intent);
            activityC18590xc3d8bf2b.finish();
        } else {
            android.widget.TextView textView = this.f254672e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(textView.getContext(), new android.content.Intent(textView.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18591xe20dd59b.class), new android.content.Intent(textView.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18580x3cc47ed9.class));
            activityC18590xc3d8bf2b.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$onCreate$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
