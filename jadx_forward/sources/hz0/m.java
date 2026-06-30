package hz0;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final hz0.m f367816a = new hz0.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f367817b = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public final synchronized void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundWorkManager", "removeRunningWorkInList >> " + str);
        if (str != null) {
            f367817b.remove(str);
        }
    }
}
