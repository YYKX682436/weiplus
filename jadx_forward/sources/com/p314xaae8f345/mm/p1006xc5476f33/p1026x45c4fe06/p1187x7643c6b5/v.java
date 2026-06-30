package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public class v extends ud.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j f170330g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, android.content.Context context2) {
        super(context, tVar);
        this.f170330g = jVar;
        this.f170329f = context2;
    }

    @Override // ud.c, ud.g
    public void d(com.p314xaae8f345.p485x5dc4f1ad.a aVar) {
        super.d(aVar);
        float i17 = ha1.i.f361302c.i(this.f170329f);
        f06.v[] vVarArr = com.p314xaae8f345.p485x5dc4f1ad.c0.I;
        aVar.f130144m.b(aVar, vVarArr[6], java.lang.Float.valueOf(i17));
        aVar.f130149r.b(aVar, vVarArr[9], java.lang.Boolean.valueOf(((java.lang.Boolean) ha1.n.f361314c.e()).booleanValue()));
        if ((this.f508101b instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0) && ((java.lang.Boolean) ha1.s.f361319c.e()).booleanValue()) {
            aVar.e(gh.b.NativeLocker);
        }
        aVar.f130140i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar = this.f170330g;
        aVar.f(jVar.O().f128931a.m43142xdc4f8f95());
        aVar.f130155x.b(aVar, vVarArr[15], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.d.f361297c.e()).intValue() != 0));
        aVar.G.b(aVar, vVarArr[24], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_enable_unified_cmdbuffer, 0) != 0));
        aVar.E.b(aVar, vVarArr[22], java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_weapp_enable_cmdbuffer_canvas2d, 0) != 0));
        aVar.F.b(aVar, vVarArr[23], java.lang.Boolean.FALSE);
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l1.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            a17 = com.p314xaae8f345.mm.vfs.w6.i(a17, true);
        }
        aVar.g(a17);
        aVar.f130138g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u(this, new java.lang.ref.WeakReference((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) jVar.F()));
        int i18 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.f130109j;
    }

    @Override // ud.g
    public void e(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j jVar2 = this.f170330g;
        jVar.i(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) jVar2.F()).H0(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) jVar2.F()).mo48798x74292566(), j17);
    }
}
