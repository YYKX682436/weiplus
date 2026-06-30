package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class i0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f295445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 f295446e;

    public i0(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var, android.app.Activity activity) {
        this.f295446e = p0Var;
        this.f295445d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpRemind", "onClick1 ");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = this.f295446e;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var = p0Var.f295500f;
        if (o0Var == null || !o0Var.f295490c.equals("right_button_wording")) {
            p0Var.f295502h.mo25208x3d6f0539();
        } else {
            p0Var.e(this.f295445d);
        }
    }
}
