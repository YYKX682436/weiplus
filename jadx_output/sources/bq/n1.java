package bq;

/* loaded from: classes.dex */
public final class n1 extends bq.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String qrCodeUrl) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(qrCodeUrl, "qrCodeUrl");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.zt2 zt2Var = new r45.zt2();
        zt2Var.set(1, db2.t4.f228171a.a(19558));
        zt2Var.set(2, qrCodeUrl);
        lVar.f70664a = zt2Var;
        r45.au2 au2Var = new r45.au2();
        au2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) au2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = au2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderscanqrcode";
        lVar.f70667d = 19558;
        p(lVar.a());
    }
}
