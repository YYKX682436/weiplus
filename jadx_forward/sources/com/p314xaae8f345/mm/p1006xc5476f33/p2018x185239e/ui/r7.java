package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class r7 implements android.content.DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f239454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f239456f;

    public r7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017) {
        this.f239454d = z2Var;
        this.f239455e = c17147x9fa5370e;
        this.f239456f = c22621x7603e017;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(android.content.DialogInterface dialogInterface, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f239454d;
        if (!z2Var.h()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e = this.f239455e;
        if (c17147x9fa5370e.f239100m > 0) {
            c17147x9fa5370e.f239094d.mo53060x36654fab(this.f239456f);
            return false;
        }
        z2Var.B();
        return false;
    }
}
