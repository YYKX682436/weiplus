package pz0;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f440659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f440659e = c0Var;
        this.f440660f = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        pz0.h hVar = new pz0.h(this.f440659e, this.f440660f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        hVar.f440658d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f440658d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startMovieCreation: ");
        sb6.append(th6 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", sb6.toString());
        if (th6 == null && !this.f440659e.f391645d) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            this.f440660f.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
        }
        return jz5.f0.f384359a;
    }
}
