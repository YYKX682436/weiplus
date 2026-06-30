package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class n1 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o1 f281062d;

    public n1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o1 o1Var) {
        this.f281062d = o1Var;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "dealDelChatroomMemberImp errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        int i19 = this.f424756a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o1 o1Var = this.f281062d;
        if (i19 == 0) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = o1Var.f281145m;
            q2Var.f281278q = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2.m0(q2Var, o1Var.f281140e, o1Var.f281141f, o1Var.f281143h, o1Var.f281144i, o1Var.f281142g, true);
            return;
        }
        android.app.ProgressDialog progressDialog = o1Var.f281145m.f281272h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var2 = o1Var.f281145m;
        db5.e1.y(q2Var2.f280113d.g(), q2Var2.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ign), "", q2Var2.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m1(this));
        if (o1Var.f281142g == 1) {
            q2Var2.w0(o1Var.f281140e, q2Var2.f281277p.intValue(), o1Var.f281141f, o1Var.f281143h.size(), 1, 3, (java.lang.String) o1Var.f281141f.get(0));
        }
    }
}
