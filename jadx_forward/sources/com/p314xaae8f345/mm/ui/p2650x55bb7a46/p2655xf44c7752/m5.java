package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282726d;

    public m5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282726d = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.CheckBox checkBox;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282726d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        if (k1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.r4 r4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a;
        if (r4Var.f282867b && (checkBox = viewOnClickListenerC21748xb3d38e6b.f282200v3) != null) {
            checkBox.setChecked(r4Var.d(k1Var.w()));
            viewOnClickListenerC21748xb3d38e6b.f282203w3.setOnClickListener(viewOnClickListenerC21748xb3d38e6b);
        }
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.d2.f282382o;
        if (viewOnClickListenerC21748xb3d38e6b.f282170n.m80830xfda78ef6() != i17) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2 B = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.B(viewOnClickListenerC21748xb3d38e6b.f282144g.y(i17));
        if (!viewOnClickListenerC21748xb3d38e6b.C2 && B == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.video) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var2 = viewOnClickListenerC21748xb3d38e6b.f282144g;
            k1Var2.f282631p.A(k1Var2.y(i17), i17);
        }
        if (B == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.f2.sight) {
            viewOnClickListenerC21748xb3d38e6b.f282144g.P(i17);
        }
    }
}
