package dz4;

/* loaded from: classes12.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.q3 f326905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m f326906e;

    public p3(dz4.q3 q3Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m mVar) {
        this.f326905d = q3Var;
        this.f326906e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.q3 q3Var = this.f326905d;
        dz4.b1 b1Var = (dz4.b1) ((jz5.n) ((ez4.u) q3Var.f326912a).f339496v).mo141623x754a37bb();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.m mVar = this.f326906e;
        java.lang.String str = mVar.f299243o[7] ? mVar.f299241m : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getNoteTitle(...)");
        b1Var.getClass();
        if (b1Var.b()) {
            iz4.r a17 = mz4.b0.c().a();
            a17.f377677i = str;
            mz4.b0.c().d(a17);
            java.util.Iterator it = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).f326931f.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.h2) ((ih0.s) it.next())).f269745a.i();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b1Var.f326703b, "checkUpdateTopItem: skip");
        }
        dz4.y1 a18 = ((ez4.u) q3Var.f326912a).a();
        java.lang.String str2 = mVar.f299243o[7] ? mVar.f299241m : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getNoteTitle(...)");
        a18.getClass();
        a18.f327000e = str2;
        cz4.f fVar = a18.f326998c;
        if (fVar != null) {
            fVar.Z(str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2451xb81dc63e.e eVar = a18.f326999d;
        if (eVar != null) {
            eVar.L(a18.f327000e);
        }
    }
}
