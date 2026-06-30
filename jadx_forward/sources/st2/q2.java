package st2;

/* loaded from: classes3.dex */
public final class q2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f493961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f493962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f493963f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, st2.r2 r2Var, r45.qt2 qt2Var, gk2.e eVar) {
        super(0);
        this.f493961d = h0Var;
        this.f493962e = qt2Var;
        this.f493963f = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f493961d;
        java.util.LinkedList linkedList = (java.util.LinkedList) h0Var.f391656d;
        int i17 = 0;
        int size = linkedList != null ? linkedList.size() : 0;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) h0Var.f391656d;
        if (linkedList2 != null) {
            for (java.lang.Object obj : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                long longValue = ((java.lang.Number) obj).longValue();
                if (i17 >= 9) {
                    break;
                }
                sb6.append(longValue);
                if (i17 < size - 1) {
                    sb6.append("|");
                }
                i17 = i18;
            }
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        zl2.r4 r4Var = zl2.r4.f555483a;
        gk2.e eVar = this.f493963f;
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        ((c61.p2) ybVar).Kj(this.f493962e, 18054, zl2.r4.k0(r4Var, eVar, 32, sb7, 0, null, 24, null));
        return jz5.f0.f384359a;
    }
}
