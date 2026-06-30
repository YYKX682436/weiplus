package fe1;

/* loaded from: classes15.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f343011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f343013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fe1.l f343014g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f343015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, fe1.l lVar2, int i17) {
        super(1);
        this.f343011d = j17;
        this.f343012e = str;
        this.f343013f = lVar;
        this.f343014g = lVar2;
        this.f343015h = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        he1.k result = (he1.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ie1.b bVar = ie1.b.f372511a;
        boolean z17 = result instanceof he1.j;
        long j17 = this.f343011d;
        boolean z18 = result instanceof he1.i;
        int i17 = z18 ? ((he1.i) result).f362415a : 0;
        java.lang.String str = z18 ? ((he1.i) result).f362416b : "";
        java.lang.String issuerID = this.f343012e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(issuerID, "$issuerID");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f343013f;
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        bVar.a(fe1.l.f69743x24728b, z17, j17, currentTimeMillis, i17, str, issuerID, mo48798x74292566);
        this.f343014g.D(lVar, this.f343015h, result, fe1.j.f343010d);
        return jz5.f0.f384359a;
    }
}
