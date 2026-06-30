package ou3;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ou3.b f430470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd f430471e;

    public a(ou3.b bVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        this.f430470d = bVar;
        this.f430471e = c5255x5f3208fd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = this.f430471e;
        java.lang.String filePath = c5255x5f3208fd.f135586g.f89294c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
        am.r2 r2Var = c5255x5f3208fd.f135586g;
        this.f430470d.l(filePath, r2Var.f89292a, r2Var.f89293b, r2Var.f89295d);
    }
}
