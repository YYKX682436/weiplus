package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class t implements o.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a f91234d;

    public t(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a) {
        this.f91234d = c0076xa566151a;
    }

    @Override // o.p
    public boolean b(o.r rVar, android.view.MenuItem menuItem) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u uVar = this.f91234d.G;
        if (uVar == null) {
            return false;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v2 v2Var = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.r2) uVar).f91229a.M;
        return v2Var != null ? ((n.m) ((p012xc85e97e9.p016x746ad0e3.app.m0) v2Var).f90730a.f90739c).onMenuItemSelected(0, menuItem) : false;
    }

    @Override // o.p
    public void d(o.r rVar) {
        o.p pVar = this.f91234d.B;
        if (pVar != null) {
            pVar.d(rVar);
        }
    }
}
