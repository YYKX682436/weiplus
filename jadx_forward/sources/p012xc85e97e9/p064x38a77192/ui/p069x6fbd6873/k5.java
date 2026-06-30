package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public abstract class k5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f92153a = new java.util.LinkedHashMap();

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 a(android.content.Context context) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        java.util.Map map = f92153a;
        synchronized (map) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            java.lang.Object obj = linkedHashMap.get(context);
            if (obj == null) {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                u26.w a17 = u26.z.a(-1, null, null, 6, null);
                p3325xe03a0797.p3326xc267989b.p3328x30012e.m2 m2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i5(contentResolver, uriFor, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.j5(a17, j3.k.a(android.os.Looper.getMainLooper())), a17, context, null));
                p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
                int i17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.w2.f391976a;
                obj = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.q(m2Var, b17, new p3325xe03a0797.p3326xc267989b.p3328x30012e.e3(0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            f3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.f3) obj;
        }
        return f3Var;
    }

    public static final n0.g1 b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f564571ux);
        if (tag instanceof n0.g1) {
            return (n0.g1) tag;
        }
        return null;
    }
}
