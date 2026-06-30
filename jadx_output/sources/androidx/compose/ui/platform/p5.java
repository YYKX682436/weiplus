package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.WrappedComposition f10701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f10702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(androidx.compose.ui.platform.WrappedComposition wrappedComposition, yz5.p pVar) {
        super(1);
        this.f10701d = wrappedComposition;
        this.f10702e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.compose.ui.platform.m it = (androidx.compose.ui.platform.m) obj;
        kotlin.jvm.internal.o.g(it, "it");
        androidx.compose.ui.platform.WrappedComposition wrappedComposition = this.f10701d;
        if (!wrappedComposition.f10498f) {
            androidx.lifecycle.o mo133getLifecycle = it.f10638a.mo133getLifecycle();
            kotlin.jvm.internal.o.f(mo133getLifecycle, "it.lifecycleOwner.lifecycle");
            yz5.p pVar = this.f10702e;
            wrappedComposition.f10500h = pVar;
            if (wrappedComposition.f10499g == null) {
                wrappedComposition.f10499g = mo133getLifecycle;
                mo133getLifecycle.a(wrappedComposition);
            } else if (mo133getLifecycle.b().a(androidx.lifecycle.n.CREATED)) {
                wrappedComposition.f10497e.b(u0.j.c(-2000640158, true, new androidx.compose.ui.platform.o5(wrappedComposition, pVar)));
            }
        }
        return jz5.f0.f302826a;
    }
}
