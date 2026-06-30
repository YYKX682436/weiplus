package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class n3 extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final r45.it6 f76521m;

    public n3(int i17, boolean z17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2) {
        this(i17, z17, i18, i19, i27, str, i28, str2, 0);
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.jt6 jt6Var = (r45.jt6) fVar;
        r45.it6 it6Var = this.f76521m;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiUpdateWxaUsageRecord", "onCgiBack, req [scene %d, background %b, versionType %d, recordType %d, op %d, username %s]resp [errType %d, errCode %d, errMsg %s, resp %s]", java.lang.Integer.valueOf(it6Var.f377319d), java.lang.Integer.valueOf(it6Var.f377320e), java.lang.Integer.valueOf(it6Var.f377321f), java.lang.Integer.valueOf(it6Var.f377322g), java.lang.Integer.valueOf(it6Var.f377323h), it6Var.f377324i, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, jt6Var);
    }

    public n3(int i17, boolean z17, int i18, int i19, int i27, java.lang.String str, int i28, java.lang.String str2, int i29) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.it6 it6Var = new r45.it6();
        it6Var.f377319d = i17 == 0 ? 1000 : i17;
        it6Var.f377320e = z17 ? 1 : 0;
        it6Var.f377321f = i18;
        it6Var.f377322g = i19;
        it6Var.f377323h = i27;
        it6Var.f377324i = str;
        it6Var.f377325m = i28;
        it6Var.f377326n = str2;
        it6Var.f377327o = i29;
        this.f76521m = it6Var;
        lVar.f70664a = it6Var;
        lVar.f70665b = new r45.jt6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/updatewxausagerecord";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.finder.f0.CTRL_INDEX;
        p(lVar.a());
    }
}
