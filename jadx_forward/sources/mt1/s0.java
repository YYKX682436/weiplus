package mt1;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public long f412796a = java.lang.System.currentTimeMillis();

    public final void a(java.lang.String tag, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "(" + (currentTimeMillis - this.f412796a) + " ms) " + message);
        this.f412796a = currentTimeMillis;
    }
}
