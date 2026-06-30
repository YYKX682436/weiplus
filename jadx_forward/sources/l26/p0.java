package l26;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l26.q0 f396796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l26.q0 q0Var) {
        super(1);
        this.f396796d = q0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Integer.valueOf(this.f396796d.f396803b.getAndIncrement());
    }
}
