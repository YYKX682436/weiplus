package fa1;

/* loaded from: classes7.dex */
public final class j extends ud.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fa1.a f342222g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fa1.a aVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, boolean z17) {
        super(context, tVar, z17);
        this.f342222g = aVar;
    }

    @Override // ud.g
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        boolean z17;
        super.c(c11510xdd90c2f2);
        fa1.a aVar = this.f342222g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) aVar.F()).mo48798x74292566(), true);
        if (b17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar = b17.f169687z;
        synchronized (tVar) {
            z17 = tVar.f169841h != null;
        }
        if (z17) {
            yg.h hVar = aVar.w().f130118i;
            synchronized (hVar.f543597a) {
                if (hVar.f543597a.f130110a != 0) {
                    com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = hVar.f543597a;
                    abstractC4208x204d5c83.m34787x417f2a94(abstractC4208x204d5c83.f130110a, true);
                }
            }
        }
    }

    @Override // ud.b, ud.g
    public void d(com.p314xaae8f345.p485x5dc4f1ad.a aVar) {
        super.d(aVar);
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_magicbrush_allow_antialias, false);
        f06.v[] vVarArr = com.p314xaae8f345.p485x5dc4f1ad.c0.I;
        aVar.f130142k.b(aVar, vVarArr[4], java.lang.Boolean.valueOf(fj6));
        ha1.i iVar = ha1.i.f361302c;
        fa1.a aVar2 = this.f342222g;
        aVar.f130144m.b(aVar, vVarArr[6], java.lang.Float.valueOf(iVar.i(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) aVar2.F()).getF229340d())));
        boolean booleanValue = ((java.lang.Boolean) ha1.r.f361318c.e()).booleanValue();
        if (aVar2.R0() && ((java.lang.Boolean) ha1.s.f361319c.e()).booleanValue()) {
            aVar.e(gh.b.NativeLocker);
        } else if (!booleanValue) {
            aVar.e(gh.b.EglSurfaceSwapLocker);
        } else if (aVar2.R0()) {
            aVar.e(gh.b.ChoreographerInMainThread);
        } else {
            aVar.e(gh.b.ChoreographerInJsThread);
        }
        if (((java.lang.Boolean) ha1.o.f361315c.e()).booleanValue()) {
            aVar.f130140i = new sa1.e(aVar2);
        } else {
            aVar.f130140i = new sa1.i(aVar2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: use animation handler: %s", aVar.a().toString());
        aVar.f130149r.b(aVar, vVarArr[9], java.lang.Boolean.valueOf(((java.lang.Boolean) ha1.n.f361314c.e()).booleanValue()));
        aVar.f130150s.b(aVar, vVarArr[10], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.c.f361296c.e()).intValue() != 0));
        aVar.f(aVar2.O().f128931a.m43142xdc4f8f95());
        aVar.f130153v.b(aVar, vVarArr[13], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.a.f361294c.e()).intValue() != 0));
        aVar.f130155x.b(aVar, vVarArr[15], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.d.f361297c.e()).intValue() != 0));
        aVar.C.b(aVar, vVarArr[20], java.lang.Integer.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_parallel_shader_compile_android, 0)));
        aVar.E.b(aVar, vVarArr[22], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.b.f361295c.e()).intValue() != 0));
        aVar.F.b(aVar, vVarArr[23], java.lang.Boolean.FALSE);
        aVar.G.b(aVar, vVarArr[24], java.lang.Boolean.valueOf(((java.lang.Integer) ha1.e.f361298c.e()).intValue() != 0));
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l1.a();
        if (!android.text.TextUtils.isEmpty(a17)) {
            a17 = com.p314xaae8f345.mm.vfs.w6.i(a17, true);
        }
        aVar.g(a17);
        aVar.f130138g = new fa1.i(this, new java.lang.ref.WeakReference((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) aVar2.F()));
        int i17 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.f130109j;
    }

    @Override // ud.g
    public void e(com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a;
        fa1.a aVar = this.f342222g;
        jVar.i(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) aVar.F()).H0(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) aVar.F()).mo48798x74292566(), j17);
    }
}
