package az0;

/* loaded from: classes5.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final az0.i4 f15556d = new az0.i4();

    public i4() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.MJMaasCore.OnComplete it = (com.tencent.maas.MJMaasCore.OnComplete) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasManager", "release maasCore");
        return az0.i5.f15557a.q().v(it);
    }
}
