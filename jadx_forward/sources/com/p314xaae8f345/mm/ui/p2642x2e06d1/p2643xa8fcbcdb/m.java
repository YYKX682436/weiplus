package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* loaded from: classes11.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f279374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 f279375e;

    public m(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5, android.widget.EditText editText) {
        this.f279375e = c21545xcb424ea5;
        this.f279374d = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21545xcb424ea5 c21545xcb424ea5 = this.f279375e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = c21545xcb424ea5.N;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        c21545xcb424ea5.P = this.f279374d.getText().toString();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.o oVar = c21545xcb424ea5.M;
        if (oVar != null) {
            oVar.a(true);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var = c21545xcb424ea5.L;
        if (q0Var != null) {
            q0Var.a(c21545xcb424ea5, c21545xcb424ea5.P);
        }
    }
}
