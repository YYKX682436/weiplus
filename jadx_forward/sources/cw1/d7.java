package cw1;

/* loaded from: classes3.dex */
public final class d7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f304410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304412g;

    public d7(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da, android.widget.TextView textView2, android.view.View view) {
        this.f304409d = textView;
        this.f304410e = activityC13123x212a66da;
        this.f304411f = textView2;
        this.f304412g = view;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da = this.f304410e;
        this.f304409d.setText(activityC13123x212a66da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b8h));
        this.f304411f.setText("");
        android.view.View view = this.f304412g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3$bs$1$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = activityC13123x212a66da.f177330g;
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108007xae7a2e7a();
        }
        activityC13123x212a66da.f177330g = null;
    }
}
