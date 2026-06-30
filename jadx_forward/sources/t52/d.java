package t52;

/* loaded from: classes15.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(r45.u53 u53Var, long j17) {
        if (u53Var == null) {
            return;
        }
        java.util.LinkedList linkedList = u53Var.f468583g;
        if (linkedList.isEmpty()) {
            return;
        }
        r45.t53 t53Var = (r45.t53) linkedList.getLast();
        long j18 = j17 - t53Var.f467686e;
        if (j18 < 0) {
            j18 = 0;
        }
        t53Var.f467687f = j18;
        if (linkedList.size() == 1) {
            return;
        }
        for (int size = linkedList.size() - 1; size > 0; size--) {
            java.lang.Object obj = linkedList.get(size - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.t53 t53Var2 = (r45.t53) obj;
            if (t53Var2.f467687f <= 0) {
                long j19 = ((r45.t53) linkedList.get(size)).f467686e - t53Var2.f467686e;
                if (j19 < 0) {
                    j19 = 0;
                }
                t53Var2.f467687f = j19;
            }
        }
    }
}
