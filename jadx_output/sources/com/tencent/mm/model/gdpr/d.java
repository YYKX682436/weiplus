package com.tencent.mm.model.gdpr;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f70376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.model.gdpr.e f70377b;

    public d(com.tencent.mm.model.gdpr.e eVar, km5.b bVar) {
        this.f70377b = eVar;
        this.f70376a = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        boolean z17 = i17 == 0 && i18 == 0 && ((r45.js5) fVar) != null;
        km5.b bVar = this.f70376a;
        com.tencent.mm.model.gdpr.e eVar = this.f70377b;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d %s)", eVar.f70378a.f70370d, eVar.f70379b, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str);
            eVar.f70380c.a(0);
            bVar.a(java.lang.Boolean.FALSE);
            return;
        }
        r45.ig3 ig3Var = (r45.ig3) fVar;
        if (ig3Var.f377015d == null) {
            r45.ed7 ed7Var = new r45.ed7();
            ig3Var.f377015d = ed7Var;
            ed7Var.f373337d = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MPGdprPolicyUtil", "onGetAuthCgiBack, business(%s), appId(%s), back(%d %d)", eVar.f70378a.f70370d, eVar.f70379b, java.lang.Integer.valueOf(ig3Var.f377015d.f373337d), java.lang.Integer.valueOf(ig3Var.f377016e));
        if (ig3Var.f377015d.f373337d != 0) {
            eVar.f70380c.a(0);
            bVar.a(java.lang.Boolean.FALSE);
        } else if (ig3Var.f377016e <= 0) {
            bVar.c(java.lang.Boolean.TRUE);
        } else {
            eVar.f70380c.a(0);
            bVar.a(java.lang.Boolean.FALSE);
        }
    }
}
