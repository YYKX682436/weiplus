package vs4;

/* loaded from: classes9.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(java.lang.String str, java.lang.String str2) {
        r45.bn4 bn4Var = new r45.bn4();
        r45.cn4 cn4Var = new r45.cn4();
        bn4Var.f452425f = wo.w0.n();
        java.lang.String j17 = gm0.j1.b().j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getUinString(...)");
        bn4Var.f452424e = java.lang.Long.parseLong(j17);
        bn4Var.f452426g = java.lang.System.currentTimeMillis();
        bn4Var.f452428i = str;
        if (str2 != null) {
            if (str2.length() > 15360) {
                java.lang.String substring = str2.substring(0, 15360);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                bn4Var.f452427h = substring;
            } else {
                bn4Var.f452427h = str2;
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = bn4Var;
        lVar.f152198b = cn4Var;
        lVar.f152199c = "/cgi-bin/mmpay-bin/sec/report_mmpaysecreport";
        lVar.f152200d = 28828;
        lVar.f152211o = 2;
        p(lVar.a());
    }
}
