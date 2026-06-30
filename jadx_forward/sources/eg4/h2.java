package eg4;

/* loaded from: classes4.dex */
public final class h2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.ib f334257d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f334258e;

    public h2(com.p314xaae8f345.mm.p2621x8fb0427b.ib msg, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f334257d = msg;
        this.f334258e = str;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        long j17 = this.f334257d.f68088xd09be28e;
        if (j17 > 0) {
            return j17;
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = eg4.c2.f334218a;
        return eg4.c2.f334218a.decrementAndGet();
    }

    @Override // in5.c
    public int h() {
        eg4.e2 e2Var = eg4.f2.f334236e;
        return 2;
    }

    public /* synthetic */ h2(com.p314xaae8f345.mm.p2621x8fb0427b.ib ibVar, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(ibVar, (i17 & 2) != 0 ? null : str);
    }
}
