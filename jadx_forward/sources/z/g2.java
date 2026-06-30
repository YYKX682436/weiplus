package z;

/* loaded from: classes14.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z.l2 f550202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f550203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(z.l2 l2Var, float f17) {
        super(1);
        this.f550202d = l2Var;
        this.f550203e = f17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        z.l2 l2Var = this.f550202d;
        if (!l2Var.e()) {
            l2Var.f(longValue / 1, this.f550203e);
        }
        return jz5.f0.f384359a;
    }
}
