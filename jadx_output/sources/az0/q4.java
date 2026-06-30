package az0;

/* loaded from: classes5.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.q4 f15832d = new az0.q4();

    public q4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "get maasCore " + java.lang.Thread.currentThread().getName());
        return new com.tencent.maas.MJMaasCore(new android.os.Handler(android.os.Looper.getMainLooper()));
    }
}
