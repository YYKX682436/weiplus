package bg2;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(bg2.x0 x0Var) {
        super(1);
        this.f20375d = x0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.zf it = (dk2.zf) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bg2.x0 x0Var = this.f20375d;
        x0Var.f20623r++;
        java.lang.String v17 = it.v();
        if (v17 != null) {
            if (!(v17.length() > 0)) {
                v17 = null;
            }
            if (v17 != null) {
                x0Var.f20626u.add(v17);
            }
        }
        return jz5.f0.f302826a;
    }
}
