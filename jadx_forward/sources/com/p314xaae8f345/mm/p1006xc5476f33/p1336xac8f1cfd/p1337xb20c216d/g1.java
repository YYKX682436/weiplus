package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c f178094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.i1 f178095e;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.i1 i1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar) {
        this.f178095e = i1Var;
        this.f178094d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c cVar = this.f178094d;
        boolean z17 = cVar.f178077j;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.i1 i1Var = this.f178095e;
        if (!z17) {
            if (cVar.f178079l >= 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = i1Var.f178107a.f178030d.mo7946xf939df19();
                int i17 = cVar.f178079l;
                ((fx1.b) i1Var.f178107a.f178030d.mo7946xf939df19()).getClass();
                mo7946xf939df19.m8147xed6e4d18(i17 + 0);
                return;
            }
            return;
        }
        i1Var.f178107a.H.remove(cVar.f178069b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = i1Var.f178107a;
        if (abstractActivityC13156x6363e8e1.H.isEmpty()) {
            abstractActivityC13156x6363e8e1.F.f67638x7d4eb57c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            abstractActivityC13156x6363e8e1.F.f67659xa783a79b = java.lang.System.currentTimeMillis();
            o72.r2 r2Var = abstractActivityC13156x6363e8e1.F;
            r2Var.f67640x5ab01132.g(r2Var.f67638x7d4eb57c);
            java.lang.String G0 = o72.r2.G0(abstractActivityC13156x6363e8e1.F);
            java.lang.String str = "";
            boolean z18 = true;
            for (int i18 = 0; i18 < nx1.d.q().B(); i18++) {
                if (i18 != 0 && !str.endsWith("\n")) {
                    str = str.concat("\n");
                }
                ix1.a l17 = nx1.d.q().l(i18);
                str = str + com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.k(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.b(abstractActivityC13156x6363e8e1, l17));
                if (l17.b() != 1) {
                    z18 = false;
                }
            }
            abstractActivityC13156x6363e8e1.b7(str, G0, z18);
            android.app.ProgressDialog progressDialog = abstractActivityC13156x6363e8e1.f178048y;
            if (progressDialog != null) {
                progressDialog.dismiss();
                abstractActivityC13156x6363e8e1.f178048y = null;
            }
        }
    }
}
