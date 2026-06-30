package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q f295470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 f295471e;

    public m0(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q qVar) {
        this.f295471e = p0Var;
        this.f295470d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpRemind", "onClick2");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = this.f295471e;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var = p0Var.f295500f;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.q qVar = this.f295470d;
        if (o0Var == null || !o0Var.f295490c.equals("left_button_wording")) {
            qVar.mo66210x3d6f0539();
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.o0 o0Var2 = p0Var.f295500f;
            qVar.a(o0Var2.f295488a, o0Var2.f295489b);
        }
    }
}
