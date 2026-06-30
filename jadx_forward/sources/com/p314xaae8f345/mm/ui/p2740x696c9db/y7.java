package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public class y7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079 f292458d;

    public y7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079 activityC22516x5499f079) {
        this.f292458d = activityC22516x5499f079;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dkwt dlg imgSid:");
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079 activityC22516x5499f079 = this.f292458d;
        sb6.append(activityC22516x5499f079.f291668f.f292014b);
        sb6.append(" img len");
        sb6.append(activityC22516x5499f079.f291668f.f292016d.length);
        sb6.append(" ");
        sb6.append(fp.k.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTaskUI", sb6.toString());
        com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db = activityC22516x5499f079.f291667e;
        if (c21463x46cf9db == null) {
            return;
        }
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = new com.p314xaae8f345.mm.p957x53236a1b.v0(activityC22516x5499f079.f291668f.f292017e, c21463x46cf9db.m78854x2bc566b5(), activityC22516x5499f079.f291667e.m78856x8dcccb06(), activityC22516x5499f079.f291667e.m78855x1761a082());
        c01.d9.e().g(v0Var);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22516x5499f079 activityC22516x5499f0792 = this.f292458d;
        activityC22516x5499f0792.f291669g = db5.e1.Q(activityC22516x5499f0792, activityC22516x5499f0792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC22516x5499f079.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, new com.p314xaae8f345.mm.ui.p2740x696c9db.x7(this, v0Var));
    }
}
