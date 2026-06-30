package pr;

/* loaded from: classes15.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr.q0 f439281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr.e0 f439282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(pr.q0 q0Var, pr.e0 e0Var) {
        super(0);
        this.f439281d = q0Var;
        this.f439282e = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pr.q0 q0Var = this.f439281d;
        java.util.LinkedList linkedList = q0Var.f439305f;
        pr.e0 e0Var = this.f439282e;
        if (!linkedList.contains(e0Var)) {
            q0Var.f439305f.add(e0Var);
        }
        return jz5.f0.f384359a;
    }
}
