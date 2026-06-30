package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public class v extends ud.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f88796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.j f88797g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.appbrand.service.j jVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, android.content.Context context2) {
        super(context, tVar);
        this.f88797g = jVar;
        this.f88796f = context2;
    }

    @Override // ud.c, ud.g
    public void d(com.tencent.magicbrush.a aVar) {
        super.d(aVar);
        float i17 = ha1.i.f279769c.i(this.f88796f);
        f06.v[] vVarArr = com.tencent.magicbrush.c0.I;
        aVar.f48611m.b(aVar, vVarArr[6], java.lang.Float.valueOf(i17));
        aVar.f48616r.b(aVar, vVarArr[9], java.lang.Boolean.valueOf(((java.lang.Boolean) ha1.n.f279781c.e()).booleanValue()));
        if ((this.f426568b instanceof com.tencent.mm.plugin.appbrand.jsruntime.o0) && ((java.lang.Boolean) ha1.s.f279786c.e()).booleanValue()) {
            aVar.e(gh.b.NativeLocker);
        }
        aVar.f48607i = new com.tencent.mm.plugin.appbrand.service.t(this);
        com.tencent.mm.plugin.appbrand.service.j jVar = this.f88797g;
        aVar.f(jVar.O().f47398a.getNativeHandle());
        aVar.f48622x.b(aVar, vVarArr[15], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.d.f279764c.e()).intValue() != 0));
        aVar.G.b(aVar, vVarArr[24], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_enable_unified_cmdbuffer, 0) != 0));
        aVar.E.b(aVar, vVarArr[22], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_enable_cmdbuffer_canvas2d, 0) != 0));
        aVar.F.b(aVar, vVarArr[23], java.lang.Boolean.FALSE);
        java.lang.String a17 = com.tencent.mm.plugin.appbrand.jsruntime.l1.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            a17 = com.tencent.mm.vfs.w6.i(a17, true);
        }
        aVar.g(a17);
        aVar.f48605g = new com.tencent.mm.plugin.appbrand.service.u(this, new java.lang.ref.WeakReference((com.tencent.mm.plugin.appbrand.service.c0) jVar.F()));
        int i18 = com.tencent.magicbrush.MBRuntime.f48576j;
    }

    @Override // ud.g
    public void e(com.tencent.magicbrush.MagicBrush magicBrush, long j17) {
        com.tencent.mm.plugin.appbrand.report.quality.j jVar = com.tencent.mm.plugin.appbrand.report.quality.e.f88172a;
        com.tencent.mm.plugin.appbrand.service.j jVar2 = this.f88797g;
        jVar.i(((com.tencent.mm.plugin.appbrand.service.c0) jVar2.F()).H0(), ((com.tencent.mm.plugin.appbrand.service.c0) jVar2.F()).getAppId(), j17);
    }
}
