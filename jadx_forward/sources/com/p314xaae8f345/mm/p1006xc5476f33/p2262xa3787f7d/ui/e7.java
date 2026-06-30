package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b f254517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f254518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f254519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 f254520g;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b, boolean z17, int i17, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27998xb3daf402 c27998xb3daf402) {
        this.f254517d = activityC18590xc3d8bf2b;
        this.f254518e = z17;
        this.f254519f = i17;
        this.f254520g = c27998xb3daf402;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18590xc3d8bf2b activityC18590xc3d8bf2b = this.f254517d;
        android.view.View view2 = activityC18590xc3d8bf2b.f254443q;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mKBLayout");
            throw null;
        }
        boolean isShown = view2.isShown();
        boolean z17 = this.f254518e;
        if (!isShown && !z17) {
            activityC18590xc3d8bf2b.m71654x8022ec1f();
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3 = activityC18590xc3d8bf2b.f254442p;
            if (c27990xda3033a3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mKeyboard");
                throw null;
            }
            c27990xda3033a3.m121476x53eb72f9(this.f254519f);
        } else if (z17) {
            activityC18590xc3d8bf2b.m71653xd46dd964();
            java.lang.Object systemService = activityC18590xc3d8bf2b.mo55332x76847179().getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f254520g, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
