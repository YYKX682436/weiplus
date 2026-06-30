package ae3;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ae3.b f4349a = new ae3.b();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f4350b = jz5.h.b(ae3.a.f4348d);

    public final float a() {
        return ((java.lang.Number) ((jz5.n) f4350b).getValue()).floatValue();
    }

    public final java.util.HashMap b(android.app.Activity activity) {
        if (activity == null) {
            return new java.util.HashMap();
        }
        bf3.x0 x0Var = bf3.x0.f19674a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.Point a17 = x0Var.a(context);
        int i17 = a17.x;
        int i18 = a17.y;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.graphics.Rect m17 = com.tencent.mm.ui.bk.m(activity);
        kotlin.jvm.internal.o.f(m17, "getSafeAreaInsets(...)");
        int b17 = a06.d.b(m17.left / a());
        int b18 = a06.d.b(m17.top / a());
        int i19 = m17.right;
        if (i19 <= i17) {
            i17 = i19;
        }
        int b19 = a06.d.b(i17 / a());
        int i27 = m17.bottom;
        if (i27 <= i18) {
            i18 = i27;
        }
        int b27 = a06.d.b(i18 / a());
        hashMap.put("left", java.lang.Integer.valueOf(b17));
        hashMap.put("top", java.lang.Integer.valueOf(b18));
        hashMap.put("right", java.lang.Integer.valueOf(b19));
        hashMap.put("bottom", java.lang.Integer.valueOf(b27));
        hashMap.put("width", java.lang.Integer.valueOf(b19 - b17));
        hashMap.put("height", java.lang.Integer.valueOf(b27 - b18));
        return hashMap;
    }
}
