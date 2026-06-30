package eg4;

/* loaded from: classes4.dex */
public final class i2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.m7 f334265d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f334266e;

    public i2(com.p314xaae8f345.mm.p2621x8fb0427b.m7 fMsgConv, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fMsgConv, "fMsgConv");
        this.f334265d = fMsgConv;
        this.f334266e = str;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        long j17 = this.f334265d.f66370x5ea2cb68;
        if (j17 > 0) {
            return j17;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = eg4.c2.f334218a;
        return eg4.c2.f334218a.decrementAndGet();
    }

    @Override // in5.c
    public int h() {
        eg4.e2 e2Var = eg4.f2.f334236e;
        return 3;
    }

    public /* synthetic */ i2(com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(m7Var, (i17 & 2) != 0 ? null : str);
    }
}
