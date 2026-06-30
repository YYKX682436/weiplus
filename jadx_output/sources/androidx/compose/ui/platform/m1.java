package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class m1 implements n0.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.Choreographer f10641d;

    public m1(android.view.Choreographer choreographer) {
        kotlin.jvm.internal.o.g(choreographer, "choreographer");
        this.f10641d = choreographer;
    }

    @Override // oz5.l
    public java.lang.Object fold(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // oz5.l
    public oz5.i get(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.a(this, key);
    }

    @Override // oz5.i
    public oz5.j getKey() {
        return n0.q2.f333685d;
    }

    @Override // n0.r2
    public java.lang.Object l(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        oz5.l context = continuation.getContext();
        int i17 = oz5.f.Y0;
        oz5.i iVar = context.get(oz5.e.f350327d);
        androidx.compose.ui.platform.i1 i1Var = iVar instanceof androidx.compose.ui.platform.i1 ? (androidx.compose.ui.platform.i1) iVar : null;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        androidx.compose.ui.platform.l1 l1Var = new androidx.compose.ui.platform.l1(rVar, this, lVar);
        if (i1Var == null || !kotlin.jvm.internal.o.b(i1Var.f10589e, this.f10641d)) {
            this.f10641d.postFrameCallback(l1Var);
            rVar.m(new androidx.compose.ui.platform.k1(this, l1Var));
        } else {
            synchronized (i1Var.f10591g) {
                i1Var.f10593i.add(l1Var);
                if (!i1Var.f10596o) {
                    i1Var.f10596o = true;
                    i1Var.f10589e.postFrameCallback(i1Var.f10597p);
                }
            }
            rVar.m(new androidx.compose.ui.platform.j1(i1Var, l1Var));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    @Override // oz5.l
    public oz5.l minusKey(oz5.j key) {
        kotlin.jvm.internal.o.g(key, "key");
        return oz5.h.b(this, key);
    }

    @Override // oz5.l
    public oz5.l plus(oz5.l context) {
        kotlin.jvm.internal.o.g(context, "context");
        return oz5.g.a(this, context);
    }
}
