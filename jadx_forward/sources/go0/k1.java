package go0;

/* loaded from: classes14.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f355327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(go0.q1 q1Var) {
        super(0);
        this.f355327d = q1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.q1 q1Var = this.f355327d;
        go0.s1 s1Var = q1Var.f355361o;
        if (s1Var != null) {
            s1Var.a();
        }
        rs0.h hVar = q1Var.f355358i;
        if (hVar != null) {
            rs0.i.f480829a.u(hVar);
        }
        if (q1Var.f355364r) {
            q1Var.f355358i = null;
            q1Var.f355363q = false;
        }
        q1Var.f355357h.mo50302x6b17ad39(null);
        q1Var.f355356g.quitSafely();
        return jz5.f0.f384359a;
    }
}
