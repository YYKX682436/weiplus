package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class d0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.q0 f91385e;

    public d0(com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var, int i17) {
        this.f91385e = q0Var;
        this.f91384d = i17;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != this.f91384d) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.widget.input.p0 p0Var = com.tencent.mm.plugin.appbrand.widget.input.p0.CONFIRM_KEYBOARD_CLICKED;
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = this.f91385e;
        q0Var.f91608m = p0Var;
        com.tencent.mm.plugin.appbrand.widget.input.q0.j(q0Var);
        q0Var.f91608m = null;
        return true;
    }
}
