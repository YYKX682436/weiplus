package zy3;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd f559201d;

    public n(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        this.f559201d = c5255x5f3208fd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = this.f559201d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5255x5f3208fd.f135586g.f89294c) || !c5255x5f3208fd.f135586g.f89296e) {
            return;
        }
        rh0.u uVar = (rh0.u) i95.n0.c(rh0.u.class);
        java.lang.String filePath = c5255x5f3208fd.f135586g.f89294c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPassportResUpdateListener", "[callback] resource file update result success？： " + ((qh0.m) uVar).Bi(filePath));
    }
}
