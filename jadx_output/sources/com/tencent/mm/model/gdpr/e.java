package com.tencent.mm.model.gdpr;

/* loaded from: classes4.dex */
public class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.model.gdpr.a f70378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70379b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.model.gdpr.b f70380c;

    public e(com.tencent.mm.model.gdpr.a aVar, java.lang.String str, com.tencent.mm.model.gdpr.b bVar) {
        this.f70378a = aVar;
        this.f70379b = str;
        this.f70380c = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.model.gdpr.a aVar = this.f70378a;
        if (aVar.f70371e == 0) {
            return java.lang.Boolean.TRUE;
        }
        km5.b c17 = km5.u.c();
        r45.hg3 hg3Var = new r45.hg3();
        hg3Var.f376136d = this.f70379b;
        hg3Var.f376137e = aVar.f70371e;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2575;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/getgdrpauth";
        lVar.f70664a = hg3Var;
        lVar.f70665b = new r45.ig3();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new com.tencent.mm.model.gdpr.d(this, c17));
        return null;
    }
}
