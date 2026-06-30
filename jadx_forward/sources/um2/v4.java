package um2;

/* loaded from: classes3.dex */
public final class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510529d;

    public v4(um2.x5 x5Var) {
        this.f510529d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fm2.c cVar;
        um2.x5 x5Var = this.f510529d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = x5Var.f101138b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (((pl2.x) pf5.z.f435481a.a(activity).a(pl2.x.class)).f438216f) {
            fm2.c cVar2 = x5Var.f101139c;
            if (cVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = cVar2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419) cVar2 : null;
                if (c14353xe7c1f419 != null) {
                    c14353xe7c1f419.m57466x92cd3060();
                    return;
                }
                return;
            }
        }
        if (!((mm2.c1) x5Var.c(mm2.c1.class)).N1 || (cVar = x5Var.f101139c) == null) {
            return;
        }
        cVar.mo57730x186ef1e2(((mm2.c1) x5Var.c(mm2.c1.class)).N1);
    }
}
