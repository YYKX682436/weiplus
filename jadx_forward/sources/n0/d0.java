package n0;

/* loaded from: classes14.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f415011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f415012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.j4 f415013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(n0.y0 y0Var, java.util.List list, n0.j4 j4Var, n0.u2 u2Var) {
        super(0);
        this.f415011d = y0Var;
        this.f415012e = list;
        this.f415013f = j4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List list = this.f415012e;
        n0.j4 j4Var = this.f415013f;
        n0.y0 y0Var = this.f415011d;
        java.util.List list2 = y0Var.f415298f;
        try {
            y0Var.f415298f = list;
            n0.j4 j4Var2 = y0Var.E;
            int[] iArr = y0Var.f415307o;
            y0Var.f415307o = null;
            try {
                y0Var.E = j4Var;
                throw null;
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            y0Var.f415298f = list2;
            throw th6;
        }
    }
}
