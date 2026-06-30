package j3;

/* loaded from: classes7.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f378875a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f378876b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Method f378877c;

    static {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            try {
                f378875a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                java.lang.Class cls = java.lang.Long.TYPE;
                android.os.Trace.class.getMethod("isTagEnabled", cls);
                java.lang.Class cls2 = java.lang.Integer.TYPE;
                f378876b = android.os.Trace.class.getMethod("asyncTraceBegin", cls, java.lang.String.class, cls2);
                f378877c = android.os.Trace.class.getMethod("asyncTraceEnd", cls, java.lang.String.class, cls2);
                android.os.Trace.class.getMethod("traceCounter", cls, java.lang.String.class, cls2);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
