package ot0;

/* loaded from: classes4.dex */
public class m extends ot0.h {
    @Override // ot0.h
    public ot0.h a() {
        return new ot0.m();
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430179d)) {
            java.lang.String str2 = qVar.Y1;
            r45.td6 td6Var = new r45.td6();
            if (str2 != null) {
                try {
                    td6Var.mo11468x92b714fd(android.util.Base64.decode(str2, 0));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppContentStatExtStrPiece", e17, "", new java.lang.Object[0]);
                }
            }
            r45.rd6 rd6Var = new r45.rd6();
            td6Var.f467864f = rd6Var;
            rd6Var.f466285d = qVar.f430179d;
            try {
                str2 = android.util.Base64.encodeToString(td6Var.mo14344x5f01b1f6(), 0).replace("\n", "");
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppContentStatExtStrPiece", e18, "", new java.lang.Object[0]);
            }
            qVar.Y1 = str2;
        }
        sb6.append("<statextstr>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(qVar.Y1) + "</statextstr>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
    }
}
