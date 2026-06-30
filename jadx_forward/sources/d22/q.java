package d22;

/* loaded from: classes15.dex */
public final class q implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d22.v f307400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d22.p f307401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f307402c;

    public q(d22.v vVar, d22.p pVar, android.content.Context context) {
        this.f307400a = vVar;
        this.f307401b = pVar;
        this.f307402c = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "OpenLiteApp fail");
        d22.p pVar = this.f307401b;
        if (pVar.l()) {
            pVar.k(this.f307402c, this.f307400a);
        }
    }

    @Override // q80.f0
    /* renamed from: listenOnCreate */
    public boolean mo25803x625332a2() {
        return true;
    }

    @Override // q80.f0
    /* renamed from: onCreate */
    public void mo25804x3e5a77bb(long j17, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        d22.v vVar = this.f307400a;
        java.lang.Object g17 = vVar.b().g(vVar);
        if (g17 == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).dk(j17, vVar.b().c(), g17);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "OpenLiteApp success");
    }
}
