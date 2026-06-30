package ea1;

/* loaded from: classes12.dex */
public class d extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f332044n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f332045o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ea1.g f332046p;

    public d(ea1.g gVar, java.lang.String str) {
        this.f332046p = gVar;
        this.f332044n = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InsertWeAppTask";
    }

    @Override // p13.c
    public boolean i() {
        ea1.g gVar = this.f332046p;
        gVar.f332051f.h();
        ea1.h hVar = gVar.f332051f;
        int[] iArr = o13.d.f423751d;
        java.lang.String str = this.f332044n;
        hVar.m0(iArr, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(str);
        if (wi6 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = wi6.f157887v;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            long hashCode = str3.hashCode();
            gVar.f332051f.u(393216, 1, hashCode, str3, currentTimeMillis, wi6.f157889x);
            ea1.h hVar2 = gVar.f332051f;
            java.lang.String str4 = wi6.f157889x;
            hVar2.u(393216, 2, hashCode, str3, currentTimeMillis, o13.n.i(str4, false));
            gVar.f332051f.u(393216, 3, hashCode, str3, currentTimeMillis, o13.n.i(str4, true));
            this.f332045o = str4;
        }
        gVar.f332051f.j();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{name: %s id: %s}", this.f332045o, this.f332044n);
    }
}
