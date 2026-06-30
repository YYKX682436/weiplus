package dn0;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final dn0.b f323358a = new dn0.b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f323359b;

    public final void a() {
        if (f323359b) {
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("live_karaoke");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/live/ap/karaoke/MMKaraoke", "loadKaraokeSo", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/mm/live/ap/karaoke/MMKaraoke", "loadKaraokeSo", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f323359b = true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKaraoke", "load error", th6);
        }
    }
}
