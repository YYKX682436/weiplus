package ut2;

/* loaded from: classes15.dex */
public final class e3 implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f512401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f512402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2.e f512403c;

    public e3(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, gk2.e eVar) {
        this.f512401a = g0Var;
        this.f512402b = c0Var;
        this.f512403c = eVar;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f512401a;
        if (g0Var.f391654d != -1) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0);
            com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f(0);
            ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(e42.c0.clicfg_finder_live_shelf_img_wxam_android, c19767x257d7f, c19767x257d7f2);
            y02.v0 a17 = y02.x0.f540167d.a();
            if (a17 != null) {
                bw5.d5 d5Var = bw5.d5.EcsLiveShelfImgLoadResult;
                boolean z17 = this.f512402b.f391645d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"totalTime\":");
                sb6.append(c01.id.c() - g0Var.f391654d);
                sb6.append(", \"size\":");
                sb6.append(eVar != null ? eVar.f364444c : 0);
                sb6.append(", \"liveId\":");
                sb6.append(pm0.v.u(((mm2.e1) this.f512403c.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)));
                sb6.append(", \"groupId\": ");
                sb6.append(c19767x257d7f2);
                sb6.append('}');
                a17.bb(d5Var, z17 ? 1 : 0, sb6.toString(), bw5.e5.SampleRate_OnePercent);
            }
        }
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        this.f512401a.f391654d = c01.id.c();
    }
}
