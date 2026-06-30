package zd1;

/* loaded from: classes7.dex */
public final class w implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd1.a0 f553113d;

    public w(zd1.a0 a0Var) {
        this.f553113d = a0Var;
    }

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        zd1.x xVar;
        int i17 = bVar == null ? -1 : zd1.v.f553112a[bVar.ordinal()];
        boolean z17 = false;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SecuritySnapshotContext", "runtime(" + this.f553113d.f553054a.f156336n + ")->BACKGROUND, stop");
            this.f553113d.b(false);
            return;
        }
        zd1.a0 a0Var = this.f553113d;
        if (!a0Var.f553055b.get() && (xVar = (zd1.x) a0Var.f553058e.get()) != null) {
            a0Var.a(xVar.f553114a, xVar.f553115b);
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SecuritySnapshotContext", "runtime(" + this.f553113d.f553054a.f156336n + ")->FOREGROUND, started:" + z17);
    }
}
