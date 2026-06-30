package cw1;

/* loaded from: classes3.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f304518h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304519i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304520m;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, android.view.View view, android.view.View view2, android.view.View view3, boolean z17, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f304514d = activityC13107x4291ddb8;
        this.f304515e = view;
        this.f304516f = view2;
        this.f304517g = view3;
        this.f304518h = z17;
        this.f304519i = textView;
        this.f304520m = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304514d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC13107x4291ddb8.f177181e;
        if (k0Var != null) {
            k0Var.u();
        }
        activityC13107x4291ddb8.f177181e = null;
        android.view.View view = this.f304515e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f304516f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f304517g;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$cleanCb$1$onDeleteDone$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = this.f304518h;
        android.widget.TextView textView = this.f304520m;
        android.widget.TextView textView2 = this.f304519i;
        if (z17) {
            textView2.setText(activityC13107x4291ddb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8k));
            textView.setVisibility(0);
        } else {
            textView2.setText(activityC13107x4291ddb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_l));
            textView.setVisibility(8);
        }
        activityC13107x4291ddb8.setResult(-1);
    }
}
