package ch2;

/* loaded from: classes10.dex */
public final class b1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41293d;

    public b1(ch2.o2 o2Var) {
        this.f41293d = o2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        om2.d0 d0Var = (om2.d0) obj;
        boolean z17 = d0Var instanceof om2.e0;
        ch2.o2 o2Var = this.f41293d;
        if (z17) {
            o2Var.a7(((om2.e0) d0Var).f346299a.f346360a);
        } else {
            o2Var.C7();
        }
        return jz5.f0.f302826a;
    }
}
