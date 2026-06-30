package bg2;

/* loaded from: classes3.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f101908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(bg2.x0 x0Var) {
        super(1);
        this.f101908d = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dk2.zf it = (dk2.zf) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bg2.x0 x0Var = this.f101908d;
        x0Var.f102156r++;
        java.lang.String v17 = it.v();
        if (v17 != null) {
            if (!(v17.length() > 0)) {
                v17 = null;
            }
            if (v17 != null) {
                x0Var.f102159u.add(v17);
            }
        }
        return jz5.f0.f384359a;
    }
}
