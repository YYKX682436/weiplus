package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes11.dex */
public class s1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 f293500d;

    public s1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 v1Var) {
        this.f293500d = v1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v1 v1Var = this.f293500d;
        if (v1Var != null) {
            v1Var.a(true, dialogInterface == null ? null : ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) dialogInterface).h(), dialogInterface == null ? false : ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) dialogInterface).f293371s.isChecked());
        }
    }
}
