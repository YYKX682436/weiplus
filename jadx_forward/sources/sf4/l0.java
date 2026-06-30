package sf4;

/* loaded from: classes4.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if4.f f489059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502, if4.f fVar) {
        super(0);
        this.f489058d = c18497x85806502;
        this.f489059e = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if4.h hVar = this.f489059e.f372780e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
        this.f489058d.getClass();
        if (!hVar.a()) {
            ef4.v vVar = ef4.w.f334001t;
            nf4.j J0 = vVar.i().J0(hVar.f372786a);
            if (J0 != null) {
                J0.f69406x52c1d072 &= -5;
                r45.ye6 v07 = J0.v0();
                v07.f472551e = 0;
                v07.f472552f = c01.id.e();
                v07.f472554h = "";
                v07.f472555i = 3;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(vVar.e());
                sb6.append("");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(android.os.SystemClock.elapsedRealtime());
                sb6.append(c01.id.c());
                byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                v07.f472550d = kk.k.g(bytes);
                J0.f69403xac3be4e = c01.id.e();
                byte[] mo14344x5f01b1f6 = v07.mo14344x5f01b1f6();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
                J0.f69407x5d40d76e = mo14344x5f01b1f6;
                vVar.i().i1((int) J0.f72763xa3c65b86, J0);
            }
        }
        return jz5.f0.f384359a;
    }
}
