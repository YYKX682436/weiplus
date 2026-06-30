package vu0;

/* loaded from: classes5.dex */
public final class g0 implements su0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f521625a;

    public g0(vu0.o0 o0Var) {
        this.f521625a = o0Var;
    }

    @Override // su0.l
    public void a(java.lang.String groupID, r45.ne4 ne4Var) {
        java.lang.Object mo12245xcc313de3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupID, "groupID");
        if (ne4Var != null && (mo12245xcc313de3 = ne4Var.mo12245xcc313de3()) != null) {
            mo12245xcc313de3.toString();
        }
        vu0.o0 o0Var = this.f521625a;
        o0Var.f521665e.b(groupID, ne4Var, true, new vu0.f0(ne4Var));
        java.util.List a17 = o0Var.f521665e.a();
        if (a17 != null) {
            o0Var.f521663c.c(a17);
        }
        wu0.d dVar = o0Var.f521666f;
        dVar.getClass();
        dVar.f531189c.removeMessages(100, groupID);
    }

    @Override // su0.l
    /* renamed from: onCancel */
    public void mo165245x3d6f0539() {
        this.f521625a.f521663c.mo132434x3d6f0539();
    }
}
