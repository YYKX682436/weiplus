package androidx.lifecycle;

/* loaded from: classes5.dex */
public abstract class d1 {
    public static final kotlinx.coroutines.y0 a(androidx.lifecycle.c1 viewModelScope) {
        kotlin.jvm.internal.o.g(viewModelScope, "$this$viewModelScope");
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) viewModelScope.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (y0Var != null) {
            return y0Var;
        }
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object tagIfAbsent = viewModelScope.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new androidx.lifecycle.e(((kotlinx.coroutines.c3) a17).plus(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h)));
        kotlin.jvm.internal.o.f(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (kotlinx.coroutines.y0) tagIfAbsent;
    }
}
