package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes11.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f243795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d f243796e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d activityC17665xba0f5e4d, android.view.View view) {
        this.f243796e = activityC17665xba0f5e4d;
        this.f243795d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17665xba0f5e4d activityC17665xba0f5e4d = this.f243796e;
        int i17 = activityC17665xba0f5e4d.f243639h + 8;
        activityC17665xba0f5e4d.f243639h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.a0 a0Var = activityC17665xba0f5e4d.f243636e;
        a0Var.c();
        a0Var.f243770q = i17;
        a0Var.q();
        if (activityC17665xba0f5e4d.f243640i <= activityC17665xba0f5e4d.f243639h) {
            activityC17665xba0f5e4d.f243637f.removeFooterView(this.f243795d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/shake/ui/ShakeMsgListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
