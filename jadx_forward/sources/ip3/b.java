package ip3;

/* loaded from: classes5.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {
    public b(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, java.lang.Integer num2, java.lang.Integer num3) {
        r45.p10 p10Var = new r45.p10();
        r45.r10 r10Var = new r45.r10();
        r45.q10 q10Var = new r45.q10();
        q10Var.set(0, str == null ? "" : str);
        q10Var.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        q10Var.set(2, str2 == null ? "" : str2);
        q10Var.set(3, wo.w0.n());
        q10Var.set(4, 1);
        q10Var.set(5, str3 != null ? str3 : "");
        q10Var.set(6, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 1));
        q10Var.set(7, java.lang.Integer.valueOf(num3 != null ? num3.intValue() : 4));
        p10Var.set(1, q10Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[param] sessionId: ");
        sb6.append(str);
        sb6.append(", palmCaptureMode: ");
        sb6.append(num);
        sb6.append(", sdkVersion: ");
        sb6.append(str2);
        sb6.append(", phoneUuid: ");
        r45.q10 q10Var2 = (r45.q10) p10Var.m75936x14adae67(1);
        sb6.append(q10Var2 != null ? q10Var2.m75945x2fec8307(3) : null);
        sb6.append(", appVersion: ");
        sb6.append(str3);
        sb6.append(", palmSideLimit: ");
        sb6.append(num2);
        sb6.append(", languageType:");
        sb6.append(num3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiOpenPalmServiceAuth", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = p10Var;
        lVar.f152198b = r10Var;
        lVar.f152199c = "/cgi-bin/mmpay-bin/industry/checkonlineopenpalmserviceauth";
        lVar.f152200d = 5090;
        lVar.f152211o = 2;
        p(lVar.a());
    }
}
