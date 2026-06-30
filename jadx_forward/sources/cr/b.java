package cr;

/* loaded from: classes12.dex */
public final class b implements cr.h {

    /* renamed from: a, reason: collision with root package name */
    public cr.i f303086a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f303087b;

    /* renamed from: c, reason: collision with root package name */
    public final cr.a f303088c = new cr.a(this);

    @Override // cr.h
    public void a(cr.i fetcherConfig, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fetcherConfig, "fetcherConfig");
        this.f303086a = fetcherConfig;
        this.f303087b = lVar;
        sx.e0 e0Var = (sx.e0) i95.n0.c(sx.e0.class);
        dn.m mVar = new dn.m();
        mVar.f323322h = -3;
        mVar.f323318d = "task_EmojiCdnFetcher";
        cr.i iVar = this.f303086a;
        if (iVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fetcherConfig");
            throw null;
        }
        mVar.f69582x4e093552 = iVar.f303104d;
        mVar.f69592xf1ebe47b = 19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downemoji_");
        cr.i iVar2 = this.f303086a;
        if (iVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fetcherConfig");
            throw null;
        }
        sb6.append(iVar2.f303101a.mo42933xb5885648());
        mVar.f69601xaca5bdda = sb6.toString();
        cr.i iVar3 = this.f303086a;
        if (iVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fetcherConfig");
            throw null;
        }
        mVar.f69595x6d25b0d9 = iVar3.f303103c;
        mVar.f323344z = iVar3.f303102b;
        mVar.f323320f = this.f303088c;
        if (((rx.l) e0Var).wi(mVar)) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("create task failed ");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = fetcherConfig.f303101a;
        sb7.append(c21053xdbf1e5f4.mo42933xb5885648());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader.EmojiFetcher", sb7.toString());
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader.EmojiFetcher", "callback is null " + c21053xdbf1e5f4.mo42933xb5885648());
    }
}
