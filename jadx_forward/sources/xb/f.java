package xb;

/* loaded from: classes15.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f534401a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f534402b;

    /* renamed from: c, reason: collision with root package name */
    public float f534403c;

    /* renamed from: d, reason: collision with root package name */
    public float f534404d;

    /* renamed from: e, reason: collision with root package name */
    public xb.i f534405e;

    public f(android.graphics.Paint paint) {
        java.util.HashMap hashMap = new java.util.HashMap(256);
        this.f534402b = hashMap;
        this.f534405e = xb.i.ANY;
        this.f534401a = paint;
        hashMap.clear();
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f17 = fontMetrics.bottom;
        float f18 = fontMetrics.top;
        this.f534403c = f17 - f18;
        this.f534404d = -f18;
    }

    public float a(char c17) {
        if (c17 == 0) {
            return 0.0f;
        }
        java.util.Map map = this.f534402b;
        java.lang.Float f17 = (java.lang.Float) ((java.util.HashMap) map).get(java.lang.Character.valueOf(c17));
        if (f17 != null) {
            return f17.floatValue();
        }
        float measureText = this.f534401a.measureText(java.lang.Character.toString(c17));
        ((java.util.HashMap) map).put(java.lang.Character.valueOf(c17), java.lang.Float.valueOf(measureText));
        return measureText;
    }
}
