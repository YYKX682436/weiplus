package cq0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final cq0.a f302858a = new cq0.a();

    public final float a(float f17) {
        return (float) java.lang.Math.ceil(f17 / (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().density : 0.0f));
    }

    public final java.util.HashMap b(android.graphics.RectF frame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frame, "frame");
        java.util.HashMap hashMap = new java.util.HashMap();
        cq0.a aVar = f302858a;
        hashMap.put("x", java.lang.Float.valueOf(aVar.a(frame.left)));
        hashMap.put("y", java.lang.Float.valueOf(aVar.a(frame.top)));
        hashMap.put("w", java.lang.Float.valueOf(aVar.a(frame.width())));
        hashMap.put("h", java.lang.Float.valueOf(aVar.a(frame.height())));
        return hashMap;
    }
}
