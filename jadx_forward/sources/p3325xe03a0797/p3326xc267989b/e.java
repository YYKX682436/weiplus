package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f391702b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.f1[] f391703a;

    /* renamed from: notCompletedCount */
    volatile /* synthetic */ int f72700x4e982b37;

    public e(p3325xe03a0797.p3326xc267989b.f1[] f1VarArr) {
        this.f391703a = f1VarArr;
        this.f72700x4e982b37 = f1VarArr.length;
    }

    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        java.lang.Object[] objArr = this.f391703a;
        int length = objArr.length;
        p3325xe03a0797.p3326xc267989b.c[] cVarArr = new p3325xe03a0797.p3326xc267989b.c[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            ((p3325xe03a0797.p3326xc267989b.c3) obj).mo143976x68ac462();
            p3325xe03a0797.p3326xc267989b.c cVar = new p3325xe03a0797.p3326xc267989b.c(this, rVar);
            cVar.f391680i = ((p3325xe03a0797.p3326xc267989b.c3) obj).p(cVar);
            cVarArr[i17] = cVar;
        }
        p3325xe03a0797.p3326xc267989b.d dVar = new p3325xe03a0797.p3326xc267989b.d(this, cVarArr);
        for (int i18 = 0; i18 < length; i18++) {
            cVarArr[i18].x(dVar);
        }
        if (rVar.o()) {
            dVar.d();
        } else {
            rVar.m(dVar);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
