package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class n5 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f267389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 f267390e;

    public n5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f267390e = b5Var;
        this.f267389d = c22633x83752a59;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        hy4.h0 h0Var = new hy4.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = this.f267390e;
        b5Var.f265473h = h0Var;
        h0Var.f367644e = 1;
        h0Var.f367640a = java.lang.System.currentTimeMillis();
        b5Var.f265466a.clear();
        b5Var.f265469d = null;
        b5Var.f265468c = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) b5Var.f265472g).n();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f267389d;
        if (c22633x83752a59 == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        java.lang.String j17 = b5Var.j();
        b5Var.f265474i = j17;
        if (!((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265461u).containsKey(b5Var.m(j17))) {
            java.lang.String str = b5Var.f265474i;
            if ((str == null || gm0.j1.s(zq1.a0.class) == null) ? false : ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(str)) {
                c22633x83752a59.mo14660x738236e6("javascript:(typeof window.getWXLongPressImageEventConfig === 'function')?window.getWXLongPressImageEventConfig():{}", new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m5(this, view));
                yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.a(b5Var, view);
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/WebViewLongClickHelper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
