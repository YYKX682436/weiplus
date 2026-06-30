package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class r2 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.s2 f146004d;

    public r2(com.p314xaae8f345.mm.p648x55baa833.ui.s2 s2Var) {
        this.f146004d = s2Var;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        o65.f fVar = (o65.f) bVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[2] = str == null ? "" : str;
        objArr[3] = fVar != null ? java.lang.Integer.valueOf(fVar.f424756a) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.RoomOpLogResult", "dealDelChatroomMemberImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        int i19 = this.f424756a;
        com.p314xaae8f345.mm.p648x55baa833.ui.s2 s2Var = this.f146004d;
        if (i19 == 0) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c = s2Var.f146032e.f146096d.f146123e;
            activityC10342x4f979a0c.f145289q = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.T6(activityC10342x4f979a0c, s2Var.f146031d.d1(), true);
            return;
        }
        android.app.ProgressDialog progressDialog = s2Var.f146032e.f146096d.f146123e.f145290r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p648x55baa833.ui.u2 u2Var = s2Var.f146032e;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c2 = u2Var.f146096d.f146123e;
        java.lang.String string = activityC10342x4f979a0c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ign);
        com.p314xaae8f345.mm.p648x55baa833.ui.v2 v2Var = u2Var.f146096d;
        db5.e1.y(activityC10342x4f979a0c2, string, "", v2Var.f146123e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.p648x55baa833.ui.q2(this));
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c activityC10342x4f979a0c3 = v2Var.f146123e;
        if (activityC10342x4f979a0c3.f145286n == 1) {
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10342x4f979a0c.U6(activityC10342x4f979a0c3, activityC10342x4f979a0c3.f145291s, activityC10342x4f979a0c3.f145287o, activityC10342x4f979a0c3.f145283h, v2Var.getCount(), 1, 3, s2Var.f146031d.d1());
        }
    }
}
