package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f146031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.u2 f146032e;

    public s2(com.p314xaae8f345.mm.p648x55baa833.ui.u2 u2Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f146032e = u2Var;
        this.f146031d = z3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p648x55baa833.ui.u2 u2Var = this.f146032e;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c = u2Var.f146096d.f146123e;
        boolean z17 = activityC10342x4f979a0c.f145288p;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f146031d;
        if (!z17) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.T6(activityC10342x4f979a0c, z3Var.d1(), false);
            return;
        }
        activityC10342x4f979a0c.f145289q = null;
        gd0.f V6 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.V6(activityC10342x4f979a0c.f145281f, activityC10342x4f979a0c.f145291s, 2, z3Var.d1(), new com.p314xaae8f345.mm.p648x55baa833.ui.r2(this));
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c2 = u2Var.f146096d.f146123e;
        android.app.ProgressDialog progressDialog = activityC10342x4f979a0c2.f145290r;
        if (progressDialog == null) {
            activityC10342x4f979a0c2.f145290r = db5.e1.Q(activityC10342x4f979a0c2, activityC10342x4f979a0c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC10342x4f979a0c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i4_), true, true, new com.p314xaae8f345.mm.p648x55baa833.ui.p2(activityC10342x4f979a0c2, V6));
        } else {
            progressDialog.show();
        }
    }
}
