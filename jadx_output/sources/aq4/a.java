package aq4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final aq4.a f13201a = new aq4.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f13202b = java.util.Collections.synchronizedList(new java.util.ArrayList());

    public final synchronized void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemuxBackgroundManager", "removeRunningWorkInList >> " + str);
        if (str != null) {
            f13202b.remove(str);
        }
    }
}
