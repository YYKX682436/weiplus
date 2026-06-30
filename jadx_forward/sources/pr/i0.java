package pr;

/* loaded from: classes15.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.k0 f439250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr.e0 f439251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pr.k0 k0Var, pr.e0 e0Var) {
        super(0);
        this.f439250d = k0Var;
        this.f439251e = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pr.k0 k0Var = this.f439250d;
        java.util.LinkedList linkedList = k0Var.f439271k;
        pr.e0 e0Var = this.f439251e;
        if (!linkedList.contains(e0Var)) {
            k0Var.f439271k.add(e0Var);
        }
        return jz5.f0.f384359a;
    }
}
