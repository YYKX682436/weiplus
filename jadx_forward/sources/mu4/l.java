package mu4;

/* loaded from: classes7.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu4.j f412964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f412965e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(mu4.j jVar, int i17) {
        super(0);
        this.f412964d = jVar;
        this.f412965e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ku4.i iVar = ku4.i.f394047a;
        mu4.j jVar = this.f412964d;
        java.lang.String appId = jVar.f412962e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a17 = iVar.a(appId, 0);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasPackageDownManager", "getWxaPkgVersion pkgInfo is null");
        } else {
            i17 = a17.f67185x8987ca93;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20781, jVar.f412962e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f412965e), 3, "");
        return jz5.f0.f384359a;
    }
}
