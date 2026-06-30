package o71;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 f424818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f424819e;

    public a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839, yz5.l lVar) {
        this.f424818d = c5868xe54ea839;
        this.f424819e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839 = this.f424818d;
        int i17 = c5868xe54ea839.f136177h.f88786a;
        boolean z17 = c5868xe54ea839.f136177h.f88787b;
        if (c5868xe54ea839.f136177h.f88786a < Integer.MAX_VALUE) {
            s71.a aVar = o71.l.Bi().f441872a;
            java.lang.Object obj = aVar != null ? aVar.f485502d : null;
            if (obj == null) {
                obj = kz5.p0.f395529d;
            }
            this.f424819e.mo146xb9724478(obj);
        }
    }
}
