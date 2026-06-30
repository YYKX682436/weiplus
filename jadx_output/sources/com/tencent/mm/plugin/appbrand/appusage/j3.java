package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public class j3 extends com.tencent.mm.modelbase.i {
    public j3(int i17, java.lang.String str, r45.id7 id7Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetWxaCommUseApp", "scene:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.qs3 qs3Var = new r45.qs3();
        qs3Var.f384245d = i17;
        qs3Var.f384246e = str;
        qs3Var.f384247f = id7Var;
        lVar.f70664a = qs3Var;
        lVar.f70665b = new r45.rs3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getwxacommuseapp";
        lVar.f70667d = 4767;
        p(lVar.a());
    }
}
