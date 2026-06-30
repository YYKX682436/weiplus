package e0;

/* loaded from: classes10.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f327148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.q0 f327149e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.util.List list, e0.q0 q0Var) {
        super(1);
        this.f327148d = list;
        this.f327149e = q0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e0.q0 q0Var;
        s1.n1 invoke = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invoke, "$this$invoke");
        java.util.List list = this.f327148d;
        int size = list.size();
        int i17 = 0;
        while (true) {
            q0Var = this.f327149e;
            if (i17 >= size) {
                break;
            }
            e0.q0 q0Var2 = (e0.q0) list.get(i17);
            if (q0Var2 != q0Var) {
                q0Var2.d(invoke);
            }
            i17++;
        }
        if (q0Var != null) {
            q0Var.d(invoke);
        }
        return jz5.f0.f384359a;
    }
}
