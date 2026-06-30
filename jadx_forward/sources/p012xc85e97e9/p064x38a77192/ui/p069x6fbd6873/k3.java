package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes10.dex */
public abstract class k3 {
    public static final java.lang.String a(java.lang.Object obj, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('@');
        java.lang.String format = java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(format, *args)");
        sb6.append(format);
        return sb6.toString();
    }
}
