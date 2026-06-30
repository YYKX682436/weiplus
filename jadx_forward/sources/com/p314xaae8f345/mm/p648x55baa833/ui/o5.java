package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes4.dex */
public final class o5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.x5 f145939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xy f145940e;

    public o5(com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var, r45.xy xyVar) {
        this.f145939d = x5Var;
        this.f145940e = xyVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "onClick : left");
        com.p314xaae8f345.mm.p648x55baa833.ui.x5 x5Var = this.f145939d;
        android.content.Context context = x5Var.f146185i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, null);
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120 = x5Var.f146191r;
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) activityC10349x67700120.f145366h).mo141623x754a37bb(), null, new com.p314xaae8f345.mm.p648x55baa833.ui.v5(this.f145940e, activityC10349x67700120, Q, null), 1, null);
    }
}
