package pj5;

/* loaded from: classes9.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f436936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj5.l f436937e;

    public r(in5.s0 s0Var, pj5.l lVar) {
        this.f436936d = s0Var;
        this.f436937e = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            in5.s0 s0Var = this.f436936d;
            java.lang.Object obj = s0Var.f374654e;
            p012xc85e97e9.p093xedfae76a.y yVar = obj instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj : null;
            if (yVar != null) {
                p012xc85e97e9.p093xedfae76a.q a17 = p012xc85e97e9.p093xedfae76a.z.a(yVar);
                r45.lo5 lo5Var = new r45.lo5();
                pj5.l lVar = this.f436937e;
                lo5Var.f461208d = lVar.f436920d.f461208d;
                com.p314xaae8f345.mm.p957x53236a1b.t1.a(a17, 2, lo5Var, new pj5.q(s0Var, lVar));
            }
        }
    }
}
