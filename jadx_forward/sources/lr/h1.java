package lr;

/* loaded from: classes13.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.j1 f402059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(lr.j1 j1Var) {
        super(1);
        this.f402059d = j1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.v75 v75Var = (r45.v75) obj;
        if (v75Var != null) {
            lr.j1 j1Var = this.f402059d;
            r45.v75 v75Var2 = j1Var.f402081s;
            if (v75Var2 != null && v75Var.f469497d == v75Var2.f469497d) {
                j1Var.f402081s = v75Var;
                j1Var.l();
            }
        }
        return jz5.f0.f384359a;
    }
}
