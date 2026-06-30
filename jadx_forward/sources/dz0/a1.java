package dz0;

/* loaded from: classes5.dex */
public final class a1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326303g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f326301e = c11015x5b190a3b;
        this.f326302f = str;
        this.f326303g = str2;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = this.f326303g;
        dz0.a1 a1Var = new dz0.a1(this.f326301e, this.f326302f, str, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        a1Var.f326300d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        a1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((java.lang.Throwable) this.f326300d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", "release after export");
            com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326301e;
            c11015x5b190a3b.n7();
            az0.n7 n7Var = c11015x5b190a3b.f151316d;
            if (n7Var != null) {
                n7Var.k();
            }
            bz0.j jVar = bz0.j.f118283a;
            java.lang.String templateId = this.f326302f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
            java.lang.String musicId = this.f326303g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6711x3736c3bf c6711x3736c3bf = bz0.j.f118284b;
            c6711x3736c3bf.f140524o = c6711x3736c3bf.b("savetid", templateId, true);
            c6711x3736c3bf.f140525p = c6711x3736c3bf.b("savesid", musicId, true);
            jVar.c(1);
            c11015x5b190a3b.f151316d = null;
        }
        return jz5.f0.f384359a;
    }
}
