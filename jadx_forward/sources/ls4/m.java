package ls4;

/* loaded from: classes8.dex */
public final class m implements ms4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.fc5 f402614b;

    public m(ls4.u uVar, r45.fc5 fc5Var) {
        this.f402613a = uVar;
        this.f402614b = fc5Var;
    }

    @Override // ms4.b
    public void a(r45.ma5 ma5Var) {
        ls4.u uVar = this.f402613a;
        if (ma5Var == null || ma5Var.f461840e != 3) {
            uVar.d(new pr4.a(pr4.j.f439547f));
        } else {
            uVar.h(this.f402614b);
        }
    }
}
