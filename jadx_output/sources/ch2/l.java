package ch2;

/* loaded from: classes10.dex */
public final class l implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.q f41397d;

    public l(ch2.q qVar) {
        this.f41397d = qVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        om2.d0 d0Var = (om2.d0) obj;
        if (d0Var != null) {
            this.f41397d.b7().c(d0Var);
        }
        return jz5.f0.f302826a;
    }
}
