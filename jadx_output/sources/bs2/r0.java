package bs2;

/* loaded from: classes2.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(bs2.n1 n1Var) {
        super(1);
        this.f23948d = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bs2.i0 ret = (bs2.i0) obj;
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i(this.f23948d.f23909c, "[outSideDelayRunnable] preload result = " + ret);
        return jz5.f0.f302826a;
    }
}
