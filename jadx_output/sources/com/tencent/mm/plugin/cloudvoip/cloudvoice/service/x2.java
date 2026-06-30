package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f96130a = new java.util.concurrent.ConcurrentHashMap(1);

    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2 t2Var, boolean z17, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 w2Var) {
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u2(this, w2Var, i17, i18, str, t2Var, z17));
    }

    public void b(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.w2 w2Var) {
        java.util.Map map = this.f96130a;
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2 t2Var = (com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t2) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (t2Var != null && t2Var.a()) {
            if (w2Var != null) {
                a(0, 0, "", t2Var, false, w2Var);
                return;
            }
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) map).remove(str);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gd3();
        lVar.f70665b = new r45.hd3();
        lVar.f70667d = 2985;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getcloudimsession";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.gd3 gd3Var = (r45.gd3) a17.f70710a.f70684a;
        gd3Var.f375131d = str;
        gd3Var.f375132e = str2;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.v2(this, w2Var, str));
    }

    public void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceSessionMgr", "hy: on exit");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f96130a).remove(str);
    }
}
