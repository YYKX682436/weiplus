package dz0;

/* loaded from: classes5.dex */
public final class m1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f326469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, az0.n7 n7Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f326468e = c11015x5b190a3b;
        this.f326469f = n7Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        dz0.m1 m1Var = new dz0.m1(this.f326468e, this.f326469f, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        m1Var.f326467d = (java.lang.Throwable) obj2;
        return m1Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f326467d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (th6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasMultiTemplate.MaasSdkUIC", "performCreation: onCompletion failed, " + th6.getMessage());
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "performCreation: onComplete start");
        com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326468e;
        dz0.x xVar = c11015x5b190a3b.f151322m;
        az0.n7 n7Var = this.f326469f;
        java.util.List<com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356> m33396x98ac451d = n7Var.f97275a.m33396x98ac451d();
        if (m33396x98ac451d == null) {
            m33396x98ac451d = kz5.p0.f395529d;
        }
        xVar.b(m33396x98ac451d);
        dz0.x xVar2 = c11015x5b190a3b.f151322m;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 m33391x2f60e70 = n7Var.f97275a.m33391x2f60e70();
        if (m33391x2f60e70 == null) {
            m33391x2f60e70 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356("", "", "", com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44, new java.lang.Object[0]);
        }
        xVar2.a(m33391x2f60e70);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "startMovieCreationAutoRecommendTemplate onCompletion");
        n7Var.f97275a.m33437xd852eb7a(c11015x5b190a3b.f151335z);
        return f0Var;
    }
}
