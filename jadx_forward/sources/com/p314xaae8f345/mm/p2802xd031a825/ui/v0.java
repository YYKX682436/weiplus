package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.x0 f295774e;

    public v0(com.p314xaae8f345.mm.p2802xd031a825.ui.x0 x0Var, android.view.View view) {
        this.f295774e = x0Var;
        this.f295773d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.x0 x0Var = this.f295774e;
        boolean isShown = x0Var.f295801i.f39900xbab696ce.isShown();
        android.view.View view = this.f295773d;
        if (!isShown && view.isShown()) {
            x0Var.f295801i.m83139x8022ec1f();
        }
        android.view.View view2 = x0Var.f295797e;
        if (view2 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) view2;
            if ((c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 100) && (!c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 0)) {
                x0Var.f295801i.f39901x43041b74.m121468xa24be148();
                x0Var.f295798f.setAccessibilityDelegate(null);
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
                x0Var.f295801i.f39901x43041b74.m121472x2408cb55(eVar);
                x0Var.f295798f.setAccessibilityDelegate(eVar);
            }
        }
        if (x0Var.f295797e instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
            com.p314xaae8f345.mm.p2802xd031a825.e eVar2 = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
            x0Var.f295801i.mo55332x76847179();
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
            x0Var.f295801i.f39901x43041b74.m121472x2408cb55(eVar2);
            x0Var.f295798f.setAccessibilityDelegate(eVar2);
        }
        android.view.View view3 = x0Var.f295797e;
        java.util.regex.Pattern pattern2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        if (view3 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.N(view3, x0Var.f295801i.f39901x43041b74);
        }
        x0Var.f295801i.m83128x12a99e7c(x0Var.f295799g);
        x0Var.f295801i.f39901x43041b74.m121469xce4186ff((android.widget.EditText) view);
        ((android.view.inputmethod.InputMethodManager) x0Var.f295801i.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
