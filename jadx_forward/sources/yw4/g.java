package yw4;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yw4.i f548488b;

    public g(yw4.i iVar) {
        this.f548488b = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void k(int i17, java.lang.String reqUrl, r45.s83 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        super.k(i17, reqUrl, response);
        boolean z17 = this.f548488b.f548491c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g3
    public void r(hy4.k0 performanceHelper) {
        java.lang.String[][] strArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performanceHelper, "performanceHelper");
        if (nw4.w2.a()) {
            zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
            yw4.i iVar = this.f548488b;
            java.lang.String url = iVar.w();
            java.lang.String v17 = iVar.v();
            ((yq1.x0) m0Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a;
            java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.i(url, false);
            r45.o97 a17 = ts1.q.f503147a.a(i17, v17);
            if (a17 != null) {
                strArr = new java.lang.String[8];
                strArr[0] = new java.lang.String[]{"section", "PreAuthInfo"};
                strArr[1] = new java.lang.String[]{"webId", i17};
                strArr[2] = new java.lang.String[]{"authorized", java.lang.String.valueOf(a17.f463590g)};
                strArr[3] = new java.lang.String[]{"antiSpam", java.lang.String.valueOf(a17.f463589f)};
                java.lang.String date = new java.util.Date(a17.f463588e).toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(date, "toString(...)");
                strArr[4] = new java.lang.String[]{"modifyTime", date};
                strArr[5] = new java.lang.String[]{"bizScene", java.lang.String.valueOf(a17.f463596p)};
                java.lang.String[] strArr2 = new java.lang.String[2];
                strArr2[0] = "appId";
                java.lang.String str = a17.f463598r;
                if (str == null) {
                    str = "";
                }
                strArr2[1] = str;
                strArr[6] = strArr2;
                java.lang.String[] strArr3 = new java.lang.String[2];
                strArr3[0] = "businessData";
                java.lang.String b17 = x51.j1.b(a17.f463602v);
                strArr3[1] = b17 != null ? b17 : "";
                strArr[7] = strArr3;
            } else {
                strArr = null;
            }
            performanceHelper.f367655d = strArr;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.g3
    public void s(hy4.k0 performanceHelper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performanceHelper, "performanceHelper");
        zq1.m0 x17 = this.f548488b.x();
        zg0.q2 q2Var = this.f263366a;
        if (q2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controller");
            throw null;
        }
        int c17 = ((yq1.x0) x17).c(q2Var.i());
        jz5.g gVar = cx4.s.f306187a;
        if (performanceHelper.f367656e) {
            cx4.s.c(1L, 1L, c17);
        }
    }
}
