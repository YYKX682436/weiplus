package yb5;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yb5.e f542265d = new yb5.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List k17 = kz5.c0.k(new jz5.l(android.os.Handler.class, kz5.b0.c("handleMessage")), new jz5.l(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d.class, kz5.b0.c("callback")), new jz5.l(com.p314xaae8f345.mm.p944x882e457a.u0.class, kz5.b0.c("onSceneEnd")), new jz5.l(java.lang.Runnable.class, kz5.b0.c("run")));
        try {
            k17.add(new jz5.l(p3321xbce91901.jvm.p3324x21ffc6bd.q.class, kz5.b0.c("invoke")));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChatCheck.checker", th6, "parse kt lambda err", new java.lang.Object[0]);
        }
        try {
            k17.add(new jz5.l(qz5.l.class, kz5.b0.c("invokeSuspend")));
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChatCheck.checker", th7, "parse kt suspend lambda err", new java.lang.Object[0]);
        }
        return k17;
    }
}
