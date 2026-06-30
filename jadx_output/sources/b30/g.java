package b30;

/* loaded from: classes9.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    public final b30.i a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        jz5.g gVar = b30.i.f17564c;
        if (!((java.util.WeakHashMap) ((jz5.n) gVar).getValue()).containsKey(activity)) {
            ((java.util.WeakHashMap) ((jz5.n) gVar).getValue()).put(activity, new b30.i());
        }
        java.lang.Object obj = ((java.util.WeakHashMap) ((jz5.n) gVar).getValue()).get(activity);
        kotlin.jvm.internal.o.d(obj);
        return (b30.i) obj;
    }
}
