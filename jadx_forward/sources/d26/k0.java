package d26;

/* loaded from: classes16.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.l0 f307550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(d26.l0 l0Var) {
        super(0);
        this.f307550d = l0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        d26.l0 l0Var = this.f307550d;
        java.util.Set n17 = l0Var.n();
        if (n17 == null) {
            return null;
        }
        return kz5.q1.i(kz5.q1.i(l0Var.m(), ((java.util.LinkedHashMap) ((d26.i0) l0Var.f307555c).f307538c).keySet()), n17);
    }
}
