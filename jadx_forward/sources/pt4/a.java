package pt4;

/* loaded from: classes4.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f439795d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f439796e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f439797f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f439798g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.g75();
        lVar.f152198b = new r45.h75();
        lVar.f152199c = "/cgi-bin/mmpay-bin/payugenprepay";
        lVar.f152200d = com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.i.f29748x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f439796e = a17;
        r45.g75 g75Var = (r45.g75) a17.f152243a.f152217a;
        g75Var.f456483d = str;
        g75Var.f456486g = str4;
        g75Var.f456484e = str3;
        g75Var.f456487h = str5;
        g75Var.f456488i = str2;
        g75Var.f456485f = str6;
        g75Var.f456489m = str7;
        g75Var.f456490n = str8;
        g75Var.f456491o = i17;
        java.lang.String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", str, str4, str3, str5, str2, str6, str7, str8);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f439795d = u0Var;
        return mo9409x10f9447a(sVar, this.f439796e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.i.f29748x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        r45.h75 h75Var = (r45.h75) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            this.f439797f = h75Var.f457449d;
            this.f439798g = h75Var.f457450e;
        }
        this.f439795d.mo815x76e0bfae(i18, i19, h75Var.f457452g, this);
    }
}
