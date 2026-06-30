package aq4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final aq4.a f94734a = new aq4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f94735b = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public final synchronized void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemuxBackgroundManager", "removeRunningWorkInList >> " + str);
        if (str != null) {
            f94735b.remove(str);
        }
    }
}
