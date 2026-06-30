package ne4;

/* loaded from: classes9.dex */
public class n implements d50.q {

    /* renamed from: a, reason: collision with root package name */
    public du5.c f418101a;

    /* renamed from: b, reason: collision with root package name */
    public ne4.m f418102b;

    /* renamed from: c, reason: collision with root package name */
    public ne4.l f418103c;

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterManager", "cancel");
        du5.c cVar = this.f418101a;
        if (cVar != null) {
            cVar.a(z17);
        }
        ne4.m mVar = this.f418102b;
        if (mVar != null) {
            mVar.f418099a = null;
        }
        ne4.l lVar = this.f418103c;
        if (lVar != null) {
            lVar.f418097a = null;
        }
    }

    public final void b(d50.p pVar, boolean z17, int i17, iu5.e eVar, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterManager", "prepare auth key internal: %s, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        cu5.b.e(new ne4.k(this, pVar, i18, eVar, z17, i17), z17, true, i17, eVar, new oe4.i());
    }

    public void c(d50.o oVar, android.content.Context context, int i17, int i18, java.lang.String str, d50.n nVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterManager", "request authorize and sign: %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (this.f418101a == null) {
            this.f418101a = new du5.c();
        }
        this.f418101a.b();
        ju5.c cVar = new ju5.c(null);
        cVar.f383602d = i18;
        cVar.f383599a = i17;
        cVar.f383601c = context;
        cVar.f383610l = this.f418101a;
        cVar.f383600b = str;
        if (nVar != null) {
            cVar.f383607i = true;
            cVar.f383603e = nVar.f308050a;
            cVar.f383604f = nVar.f308051b;
            cVar.f383605g = null;
            cVar.f383606h = nVar.f308052c;
        }
        ne4.l lVar = this.f418103c;
        if (lVar != null) {
            lVar.f418097a = null;
        }
        ne4.l lVar2 = new ne4.l(oVar, i18);
        this.f418103c = lVar2;
        cVar.f383611m = lVar2;
        ne4.m mVar = this.f418102b;
        if (mVar != null) {
            mVar.f418099a = null;
        }
        ne4.m mVar2 = new ne4.m(oVar, i17);
        this.f418102b = mVar2;
        cu5.b.g(mVar2, cVar);
    }
}
