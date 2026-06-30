package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public final class i6 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f154220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a6 f154221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f154222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 f154223g;

    public i6(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a6 a6Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06) {
        this.f154220d = z2Var;
        this.f154221e = a6Var;
        this.f154222f = c22621x7603e017;
        this.f154223g = c11354x3aa9ae06;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 1)) {
            return false;
        }
        android.widget.Button button = this.f154220d.f293602u;
        if (!(button != null && button.isEnabled())) {
            return true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f154222f;
        android.text.Editable text = c22621x7603e017.getText();
        java.lang.String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.c7) this.f154221e).a(false, obj);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06 = this.f154223g;
        c11354x3aa9ae06.f154068d.mo53060x36654fab(c22621x7603e017);
        c11354x3aa9ae06.a();
        return true;
    }
}
