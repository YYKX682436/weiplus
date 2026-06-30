package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class i1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178107a;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1) {
        this.f178107a = abstractActivityC13156x6363e8e1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar) {
        r45.gp0 gp0Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.SUCC;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = this.f178107a;
        if (bVar == bVar2) {
            abstractActivityC13156x6363e8e1.f178040q.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.g1(this, cVar));
        }
        if (cVar != null && (gp0Var = cVar.f178068a) != null && (str = gp0Var.P1) != null && str.equals("WeNoteHtmlFile")) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1.f178029J;
            abstractActivityC13156x6363e8e1.a7();
        }
        if (bVar == com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b.ERR) {
            abstractActivityC13156x6363e8e1.U6();
            android.app.ProgressDialog progressDialog = abstractActivityC13156x6363e8e1.f178048y;
            if (progressDialog != null) {
                progressDialog.dismiss();
                abstractActivityC13156x6363e8e1.f178048y = null;
            }
            if (cVar.f178077j) {
                abstractActivityC13156x6363e8e1.f178040q.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.h1(this));
            }
        }
    }
}
