package vh0;

/* loaded from: classes8.dex */
public final class e2 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final vh0.e2 f518385d = new vh0.e2();

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = i18 != 0;
        if (!z17 && i17 != 0) {
            z17 = true;
        }
        if (!z17 && oVar == null) {
            z17 = true;
        }
        boolean z18 = (z17 || oVar.f152244b.f152233a != null) ? z17 : true;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModServiceAgreementReq");
        r45.to4 to4Var = (r45.to4) fVar;
        java.util.LinkedList<r45.r6> agreement_info = to4Var.f468167e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(agreement_info, "agreement_info");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(agreement_info, 10));
        for (r45.r6 r6Var : agreement_info) {
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(r6Var.f466100d), java.lang.Integer.valueOf(r6Var.f466101e)));
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBotAgreementService", "[-] modserviceagreement cgi fail, errCode: " + i18 + ", errType: " + i17 + ", errMsg: " + str + ". op: " + to4Var.f468166d + ", rec: " + arrayList + ", resp: " + oVar.f152244b.f152233a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatBotAgreementService", "[+] modserviceagreement cgi success, op: " + to4Var.f468166d + ", rec: " + arrayList);
        }
        return 0;
    }
}
