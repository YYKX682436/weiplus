package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class k3 extends com.tencent.mm.modelbase.i {
    public k3(int i17, int i18, int i19, int i27, int i28, java.lang.String str, r45.ut4 ut4Var, r45.fd4 fd4Var, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ct3 ct3Var = new r45.ct3();
        ct3Var.f371820d = i17;
        ct3Var.f371824h = i18;
        ct3Var.f371821e = i19;
        ct3Var.f371822f = i27;
        ct3Var.f371823g = i28;
        ct3Var.f371825i = str;
        if (ut4Var != null) {
            ct3Var.f371827n = ut4Var;
        }
        if (fd4Var != null) {
            ct3Var.f371826m = fd4Var;
        }
        ct3Var.f371828o = str2;
        lVar.f70664a = ct3Var;
        lVar.f70665b = new r45.dt3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getwxausagerecord";
        lVar.f70667d = 1148;
        p(lVar.a());
    }
}
