package yg0;

/* loaded from: classes.dex */
public final class z3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f543845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f543846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.s3 f543847f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, zg0.s3 s3Var) {
        super(1);
        this.f543845d = c0Var;
        this.f543846e = c0Var2;
        this.f543847f = s3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f543845d;
        if (!booleanValue) {
            c0Var.f391645d = true;
        }
        if (!this.f543846e.f391645d && c0Var.f391645d) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Qk(booleanValue, this.f543847f.f554313a.hashCode(), false);
        }
        return jz5.f0.f384359a;
    }
}
