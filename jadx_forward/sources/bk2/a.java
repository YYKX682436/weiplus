package bk2;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk2.c f102899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bk2.c cVar) {
        super(0);
        this.f102899d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mm2.r4 P6;
        mm2.r4 P62;
        r45.f02 f02Var;
        bk2.c cVar = this.f102899d;
        cVar.f102903c--;
        java.lang.String str = cVar.f102904d;
        boolean z17 = str == null || str.length() == 0;
        gk2.e eVar = cVar.f102902b;
        if (!z17) {
            java.lang.String str2 = cVar.f102904d;
            mm2.r4 P63 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, (P63 == null || (f02Var = P63.f410912d) == null) ? null : f02Var.f455411d) && (P62 = ((mm2.v4) eVar.a(mm2.v4.class)).P6()) != null) {
                P62.f410910b = cVar.f102903c;
            }
        }
        if (cVar.f102903c >= 0) {
            mm2.r4 P64 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if ((P64 != null && P64.f410909a == 1) && (P6 = ((mm2.v4) eVar.a(mm2.v4.class)).P6()) != null) {
                mf2.p.a(cVar.f102901a, P6, true, false, false);
            }
        }
        int i17 = cVar.f102903c;
        if (i17 <= 0) {
            cVar.c(i17);
        }
        return jz5.f0.f384359a;
    }
}
