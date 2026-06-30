package ju1;

/* loaded from: classes9.dex */
public final class j1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383281d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76) {
        this.f383281d = activityC13077xb3b83e76;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ju1.k kVar = this.f383281d.f176958n;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        p012xc85e97e9.p093xedfae76a.j0 j0Var = kVar.f383283e;
        java.util.List list = (java.util.List) kVar.f383282d.mo3195x754a37bb();
        j0Var.mo7808x76db6cb1(list != null ? (r45.xt) list.get(i17) : null);
    }
}
