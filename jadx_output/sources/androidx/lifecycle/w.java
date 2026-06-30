package androidx.lifecycle;

/* loaded from: classes7.dex */
public abstract class w {
    public static final androidx.lifecycle.q a(androidx.lifecycle.o coroutineScope) {
        androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z17;
        kotlin.jvm.internal.o.g(coroutineScope, "$this$coroutineScope");
        do {
            java.util.concurrent.atomic.AtomicReference atomicReference = coroutineScope.f11639a;
            androidx.lifecycle.LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (androidx.lifecycle.LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl2 == null) {
                z17 = true;
                oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                lifecycleCoroutineScopeImpl = new androidx.lifecycle.LifecycleCoroutineScopeImpl(coroutineScope, ((kotlinx.coroutines.c3) a17).plus(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h));
                while (true) {
                    if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                        break;
                    }
                    if (atomicReference.get() != null) {
                        z17 = false;
                        break;
                    }
                }
            } else {
                return lifecycleCoroutineScopeImpl2;
            }
        } while (!z17);
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleCoroutineScopeImpl, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new androidx.lifecycle.r(lifecycleCoroutineScopeImpl, null), 2, null);
        return lifecycleCoroutineScopeImpl;
    }
}
