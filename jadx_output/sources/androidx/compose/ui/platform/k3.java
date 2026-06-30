package androidx.compose.ui.platform;

/* loaded from: classes10.dex */
public abstract class k3 {
    public static final java.lang.String a(java.lang.Object obj, java.lang.String str) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('@');
        java.lang.String format = java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
        kotlin.jvm.internal.o.f(format, "format(format, *args)");
        sb6.append(format);
        return sb6.toString();
    }
}
