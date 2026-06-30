package h13;

/* loaded from: classes4.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final h13.h0 f359665d = new h13.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("ForceNotifyService", 5);
        a17.start();
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(a17.getLooper());
    }
}
