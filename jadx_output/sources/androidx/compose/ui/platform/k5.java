package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public abstract class k5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f10620a = new java.util.LinkedHashMap();

    public static final kotlinx.coroutines.flow.f3 a(android.content.Context context) {
        kotlinx.coroutines.flow.f3 f3Var;
        java.util.Map map = f10620a;
        synchronized (map) {
            java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
            java.lang.Object obj = linkedHashMap.get(context);
            if (obj == null) {
                android.content.ContentResolver contentResolver = context.getContentResolver();
                android.net.Uri uriFor = android.provider.Settings.Global.getUriFor("animator_duration_scale");
                u26.w a17 = u26.z.a(-1, null, null, 6, null);
                kotlinx.coroutines.flow.m2 m2Var = new kotlinx.coroutines.flow.m2(new androidx.compose.ui.platform.i5(contentResolver, uriFor, new androidx.compose.ui.platform.j5(a17, j3.k.a(android.os.Looper.getMainLooper())), a17, context, null));
                kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
                int i17 = kotlinx.coroutines.flow.w2.f310443a;
                obj = kotlinx.coroutines.flow.l.q(m2Var, b17, new kotlinx.coroutines.flow.e3(0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue), java.lang.Float.valueOf(android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            f3Var = (kotlinx.coroutines.flow.f3) obj;
        }
        return f3Var;
    }

    public static final n0.g1 b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f483038ux);
        if (tag instanceof n0.g1) {
            return (n0.g1) tag;
        }
        return null;
    }
}
