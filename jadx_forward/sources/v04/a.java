package v04;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2.class})
/* loaded from: classes4.dex */
public class a extends i95.w implements w04.j {
    @Override // w04.j
    public void A9(int i17, java.lang.String str, int i18) {
        wi(i17, str, i18, null);
    }

    @Override // w04.j
    public void W8(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        byte[] bArr;
        r45.da7 da7Var = new r45.da7();
        da7Var.f453812d = i19;
        da7Var.f453813e = str2;
        try {
            bArr = da7Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClipBordReportImpl", "getExtInfo exp %s", e17.getMessage());
            bArr = null;
        }
        wi(i17, str, i18, bArr);
    }

    public void wi(int i17, java.lang.String str, int i18, byte[] bArr) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClipBordReportImpl", "operationInfo isNullOrNil");
            return;
        }
        if (gm0.j1.a()) {
            r45.r40 r40Var = new r45.r40();
            r40Var.f466050d = i17;
            r40Var.f466052f = i18;
            byte[] bytes = str.getBytes(java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(bytes);
            r40Var.f466051e = cu5Var;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                r45.cu5 cu5Var2 = new r45.cu5();
                cu5Var2.d(bArr);
                r40Var.f466053g = cu5Var2;
            }
            r45.s40 s40Var = new r45.s40();
            java.util.LinkedList linkedList = s40Var.f467025e;
            linkedList.add(r40Var);
            s40Var.f467024d = linkedList.size();
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(211, s40Var));
        }
    }

    @Override // w04.j
    public void xd(int i17, int i18, java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        r45.qm4 qm4Var = new r45.qm4();
        qm4Var.f465626d = str;
        qm4Var.f465627e = str2;
        try {
            bArr = qm4Var.mo14344x5f01b1f6();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ClipBordReportImpl", "getExtInfo exp %s", e17.getMessage());
            bArr = null;
        }
        wi(i17, "", i18, bArr);
    }
}
