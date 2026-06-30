package m3;

/* loaded from: classes5.dex */
public abstract class b {
    public static void a(java.lang.Object obj, java.lang.StringBuilder sb6) {
        int lastIndexOf;
        if (obj == null) {
            sb6.append("null");
            return;
        }
        java.lang.String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb6.append(simpleName);
        sb6.append('{');
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
    }
}
