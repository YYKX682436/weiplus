package com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29;

/* loaded from: classes9.dex */
public class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f295402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m7 f295403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f295404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e0 f295405g;

    public c0(android.content.Context context, r45.m7 m7Var, double d17, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e0 e0Var) {
        this.f295402d = context;
        this.f295403e = m7Var;
        this.f295404f = d17;
        this.f295405g = e0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JumpItemUtil", "showAmountRemindWin() right_button click!");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.f0.c(this.f295402d, this.f295403e.f461710f, java.lang.Double.valueOf(this.f295404f), this.f295405g);
    }
}
