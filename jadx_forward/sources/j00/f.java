package j00;

/* loaded from: classes9.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f378300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f378301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f378303g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bw5.x7 x7Var, boolean z17, java.lang.String str, int i17) {
        super(0);
        this.f378300d = x7Var;
        this.f378301e = z17;
        this.f378302f = str;
        this.f378303g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bw5.x7 x7Var;
        java.lang.String str;
        p3325xe03a0797.p3326xc267989b.z zVar;
        p3325xe03a0797.p3326xc267989b.z zVar2;
        j00.n nVar = j00.n.f378370a;
        boolean z17 = this.f378301e;
        int i17 = this.f378303g;
        b00.t2 t2Var = (b00.t2) ((c00.f4) i95.n0.c(c00.f4.class));
        java.lang.String str2 = this.f378302f;
        c00.j3 j3Var = new c00.j3(str2, t2Var.wi(str2, null));
        int wi6 = z17 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) : 1;
        p3325xe03a0797.p3326xc267989b.z a17 = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.z a18 = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
        j00.g gVar = new j00.g(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftEntrancePreloadLogicNew", "fetchPresentJumpInfoAsync");
        bw5.t8 b17 = n00.g.f415354a.b();
        int i18 = (b17.f114842g[4] ? b17.f114841f : new bw5.r8()).f113969e;
        int i19 = x02.g.f532514d;
        x02.e eVar = (x02.e) p3380x6a61f93.p3384xf5161200.C30568x21b2a623.m169981x21b0d463();
        bw5.x7 ecs_jump_info = this.f378300d;
        if (eVar != null) {
            j00.l lVar = new j00.l(gVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecs_jump_info, "ecs_jump_info");
            byte[] mo14344x5f01b1f6 = ecs_jump_info.mo14344x5f01b1f6();
            x02.d dVar = new x02.d();
            dVar.f532510d = lVar;
            long m105978x2737f10 = ((x02.g) eVar).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            x7Var = ecs_jump_info;
            str = "MicroMsg.EcsGiftEntrancePreloadLogicNew";
            zVar = a18;
            zVar2 = a17;
            p3380x6a61f93.p3384xf5161200.C30568x21b2a623.m169983x21b8c304(m105978x2737f10, mo14344x5f01b1f6, z17 ? 1 : 0, str2, i17, i18, dVar);
        } else {
            x7Var = ecs_jump_info;
            str = "MicroMsg.EcsGiftEntrancePreloadLogicNew";
            zVar = a18;
            zVar2 = a17;
        }
        b00.d dVar2 = b00.d.f98181a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ecs.c a19 = dVar2.a();
        java.lang.String a27 = a19.a(z17 ? 1 : 0, str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a27)) {
            dVar2.a().c(z17 ? 1 : 0, str2, new j00.k(z17 ? 1 : 0, str2, new j00.h(zVar)));
        } else {
            ((p3325xe03a0797.p3326xc267989b.a0) zVar).U(a27);
        }
        try {
            p3325xe03a0797.p3326xc267989b.l.f(null, new j00.j(zVar2, zVar, j3Var, z17, wi6, null), 1, null);
        } catch (p3325xe03a0797.p3326xc267989b.x3 unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "checkPreloadWhenExposure: timeout after 1000ms");
            bw5.x7 x7Var2 = ((p3325xe03a0797.p3326xc267989b.c3) zVar2).A() ? (bw5.x7) ((p3325xe03a0797.p3326xc267989b.a0) zVar2).J() : x7Var;
            java.lang.String a28 = ((p3325xe03a0797.p3326xc267989b.c3) zVar).A() ? (java.lang.String) ((p3325xe03a0797.p3326xc267989b.a0) zVar).J() : a19.a(z17 ? 1 : 0, str2);
            if (x7Var2 != null) {
                nVar.a(j3Var, z17, wi6, x7Var2, a28, 1, 0L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "checkPreloadWhenExposure: error " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
