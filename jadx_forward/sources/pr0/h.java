package pr0;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final pr0.h f439374d = new pr0.h();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map e17 = wo.w0.e();
        java.lang.String str = pr0.n.f439429q;
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) e17).get("hardware");
        pr0.n.f439429q = str2 != null ? r26.i0.t(str2, ",", " ", false) : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.Coroutines", "get cpu name:" + pr0.n.f439429q);
    }
}
