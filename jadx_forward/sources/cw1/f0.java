package cw1;

/* loaded from: classes3.dex */
public final class f0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304464g;

    public f0(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, android.widget.TextView textView2, android.view.View view) {
        this.f304461d = textView;
        this.f304462e = activityC13107x4291ddb8;
        this.f304463f = textView2;
        this.f304464g = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304462e;
        this.f304461d.setText(activityC13107x4291ddb8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8h));
        this.f304463f.setText("");
        android.view.View view = this.f304464g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = activityC13107x4291ddb8.f177180d;
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108007xae7a2e7a();
        }
        activityC13107x4291ddb8.f177180d = null;
    }
}
