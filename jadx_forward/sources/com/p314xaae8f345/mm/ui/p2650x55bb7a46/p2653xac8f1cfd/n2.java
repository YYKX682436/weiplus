package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class n2 extends o65.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o2 f281063d;

    public n2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o2 o2Var) {
        this.f281063d = o2Var;
    }

    @Override // o65.b
    public void a(int i17, int i18, java.lang.String str, o65.b bVar) {
        java.lang.String str2;
        o65.f fVar = (o65.f) bVar;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        str2 = "";
        objArr[2] = str == null ? "" : str;
        objArr[3] = fVar != null ? java.lang.Integer.valueOf(fVar.f424756a) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.ChatroomComponent", "revokeRecord errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o2 o2Var = this.f281063d;
        android.app.ProgressDialog progressDialog = o2Var.f281151i.f281271g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        java.util.LinkedList linkedList = o2Var.f281148f;
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList, ";");
        if (this.f424756a == 0) {
            o2Var.f281151i.w0(o2Var.f281146d, 4, o2Var.f281147e, linkedList.size(), linkedList.size(), 2, c17);
            return;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var = o2Var.f281151i;
        if (K0) {
            str = q2Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igq);
        }
        if (fVar != null) {
            java.lang.String str3 = fVar.f424757b;
            str2 = str3 != null ? str3 : "";
            str = fVar.f424758c;
            java.lang.String string = q2Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igq);
            if (str == null) {
                str = string;
            }
        }
        db5.e1.y(q2Var.f280113d.g(), str, str2, q2Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m2(this));
        o2Var.f281151i.w0(o2Var.f281146d, 4, o2Var.f281147e, linkedList.size(), linkedList.size(), 3, c17);
    }
}
