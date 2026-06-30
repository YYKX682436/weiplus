package a71;

/* loaded from: classes.dex */
public final class a implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83428g;

    public a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f83425d = i17;
        this.f83426e = str;
        this.f83427f = str2;
        this.f83428g = str3;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        o01.a aVar = (o01.a) obj;
        if (aVar.f440817a == q01.f.f440809e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Account.AccountComplianceReceiver", "onSceneEnd " + aVar.f440818b + ' ' + aVar.f440819c + ' ' + aVar.f440820d);
            z61.c cVar = new z61.c(z61.b.f551855e, this.f83425d, this.f83426e, this.f83427f, this.f83428g);
            ((z61.a) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(z61.a.class)).O6(cVar);
            java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(z61.h.class)).all()).iterator();
            while (it.hasNext()) {
                fs.q qVar = (fs.q) it.next();
                if (fs.g.d(fs.g.f347619c, qVar)) {
                    z61.h iStaticAccountPolicyAgree = (z61.h) ((fs.n) qVar.get());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iStaticAccountPolicyAgree, "iStaticAccountPolicyAgree");
                    ((b71.i) iStaticAccountPolicyAgree).mo2231x7bb163d5(cVar);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
