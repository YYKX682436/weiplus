package ok5;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ok5.c f427598a = new ok5.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f427599b = new java.util.LinkedHashMap();

    public final void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.util.Map b17 = b(intent);
        if (b17 == null || !b17.isEmpty()) {
            return;
        }
        f427599b.remove(java.lang.Integer.valueOf(intent.getIntExtra("KEY_PUT_OBJECT_MAP_ID", 0)));
    }

    public final java.util.Map b(android.content.Intent intent) {
        if (!intent.hasExtra("KEY_PUT_OBJECT_MAP_ID")) {
            return null;
        }
        int intExtra = intent.getIntExtra("KEY_PUT_OBJECT_MAP_ID", 0);
        return (java.util.Map) ((java.util.LinkedHashMap) f427599b).get(java.lang.Integer.valueOf(intExtra));
    }
}
