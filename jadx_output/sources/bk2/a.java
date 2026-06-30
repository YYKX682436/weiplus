package bk2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk2.c f21366d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bk2.c cVar) {
        super(0);
        this.f21366d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mm2.r4 P6;
        mm2.r4 P62;
        r45.f02 f02Var;
        bk2.c cVar = this.f21366d;
        cVar.f21370c--;
        java.lang.String str = cVar.f21371d;
        boolean z17 = str == null || str.length() == 0;
        gk2.e eVar = cVar.f21369b;
        if (!z17) {
            java.lang.String str2 = cVar.f21371d;
            mm2.r4 P63 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if (kotlin.jvm.internal.o.b(str2, (P63 == null || (f02Var = P63.f329379d) == null) ? null : f02Var.f373878d) && (P62 = ((mm2.v4) eVar.a(mm2.v4.class)).P6()) != null) {
                P62.f329377b = cVar.f21370c;
            }
        }
        if (cVar.f21370c >= 0) {
            mm2.r4 P64 = ((mm2.v4) eVar.a(mm2.v4.class)).P6();
            if ((P64 != null && P64.f329376a == 1) && (P6 = ((mm2.v4) eVar.a(mm2.v4.class)).P6()) != null) {
                mf2.p.a(cVar.f21368a, P6, true, false, false);
            }
        }
        int i17 = cVar.f21370c;
        if (i17 <= 0) {
            cVar.c(i17);
        }
        return jz5.f0.f302826a;
    }
}
