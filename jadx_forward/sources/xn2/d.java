package xn2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537016d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xn2.p0 p0Var) {
        super(0);
        this.f537016d = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xn2.p0 p0Var = this.f537016d;
        do2.b bVar = p0Var.f537100y;
        if (bVar != null) {
            if (bVar.isShowing()) {
                bVar.dismiss();
            }
            p0Var.f537100y = null;
        }
        return jz5.f0.f384359a;
    }
}
