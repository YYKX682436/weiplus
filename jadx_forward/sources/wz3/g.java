package wz3;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wz3.h f532316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd f532317e;

    public g(wz3.h hVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        this.f532316d = hVar;
        this.f532317e = c5255x5f3208fd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = this.f532317e;
        java.lang.String filePath = c5255x5f3208fd.f135586g.f89294c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        wz3.h.wi(this.f532316d, filePath, r2Var.f89292a, r2Var.f89293b, r2Var.f89295d);
    }
}
