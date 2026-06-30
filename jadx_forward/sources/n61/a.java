package n61;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f416709d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f416710e;

    public a(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zh();
        lVar.f152198b = new r45.ai();
        lVar.f152199c = "/cgi-bin/micromsg-bin/bindlinkedincontact";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4.f34497x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f416710e = a17;
        r45.zh zhVar = (r45.zh) a17.f152243a.f152217a;
        zhVar.f473578d = i17;
        zhVar.f473579e = i18;
        zhVar.f473580f = str;
        zhVar.f473581g = str2;
        zhVar.f473582h = str3;
        zhVar.f473583i = str4;
        zhVar.f473584m = str5;
        zhVar.f473585n = str6;
        zhVar.f473586o = str7;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f416709d = u0Var;
        return mo9409x10f9447a(sVar, this.f416710e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.q4.f34497x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f416710e;
        r45.zh zhVar = (r45.zh) oVar.f152243a.f152217a;
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(286722, zhVar.f473581g);
            gm0.j1.u().c().w(286721, zhVar.f473580f);
            gm0.j1.u().c().w(286723, zhVar.f473582h);
        }
        this.f416709d.mo815x76e0bfae(i18, i19, str, this);
    }
}
