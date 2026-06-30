package jw5;

/* loaded from: classes4.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final jw5.e f383886d = new jw5.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("waitingChannel");
        handlerThread.start();
        return new android.os.Handler(handlerThread.getLooper());
    }
}
