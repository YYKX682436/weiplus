package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f154413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z1 f154414e;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z1 z1Var, android.view.View view) {
        this.f154414e = z1Var;
        this.f154413d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a32;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a33;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a34;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a35;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z1 z1Var = this.f154414e;
        view = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39900xbab696ce;
        boolean isShown = view.isShown();
        android.view.View view2 = this.f154413d;
        if (!isShown && view2.isShown()) {
            if (z1Var.f154438e) {
                z1Var.f154442i.m83139x8022ec1f();
            } else {
                z17 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39895x123dbf17;
                if (!z17) {
                    z1Var.f154442i.m83139x8022ec1f();
                }
            }
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39895x123dbf17 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.AbstractActivityC11345xc0d00306.Z6(z1Var.f154442i, z1Var.f154439f);
        }
        android.view.View view3 = z1Var.f154440g;
        if (view3 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) view3;
            if ((c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 100) && (!c01.z1.I() || viewOnFocusChangeListenerC22907xe18534c2.m83170x84e6382c() == 0)) {
                c27990xda3033a34 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39901x43041b74;
                c27990xda3033a34.m121468xa24be148();
                z1Var.f154439f.setAccessibilityDelegate(null);
            } else {
                com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
                c27990xda3033a35 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39901x43041b74;
                c27990xda3033a35.m121472x2408cb55(eVar);
                z1Var.f154439f.setAccessibilityDelegate(eVar);
            }
        }
        if (z1Var.f154440g instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
            com.p314xaae8f345.mm.p2802xd031a825.e eVar2 = new com.p314xaae8f345.mm.p2802xd031a825.e(true);
            z1Var.f154442i.mo55332x76847179();
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
            c27990xda3033a33 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39901x43041b74;
            c27990xda3033a33.m121472x2408cb55(eVar2);
            z1Var.f154439f.setAccessibilityDelegate(eVar2);
        }
        android.view.View view4 = z1Var.f154440g;
        java.util.regex.Pattern pattern2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        if (view4 instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14) {
            c27990xda3033a32 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39901x43041b74;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.N(view4, c27990xda3033a32);
        }
        z1Var.f154442i.m83128x12a99e7c(z1Var.f154441h);
        c27990xda3033a3 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) z1Var.f154442i).f39901x43041b74;
        c27990xda3033a3.m121469xce4186ff((android.widget.EditText) view2);
        ((android.view.inputmethod.InputMethodManager) z1Var.f154442i.mo55332x76847179().getSystemService("input_method")).hideSoftInputFromWindow(view2.getWindowToken(), 0);
    }
}
