package zl2;

/* loaded from: classes.dex */
public final class d0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f555244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f555245f;

    public d0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, r45.zc4 zc4Var) {
        this.f555243d = k0Var;
        this.f555244e = activityC0065xcd7aa112;
        this.f555245f = zc4Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        this.f555243d.o(null);
        g4Var.clear();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f555244e;
        g4Var.j(0, activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lel), com.p314xaae8f345.mm.R.raw.f79181x28396080, activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), false);
        r45.zc4 zc4Var = this.f555245f;
        if (zc4Var.m75933x41a8a7f2(25)) {
            g4Var.j(5, activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573608f54), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, !zc4Var.m75933x41a8a7f2(26));
        }
        if (zc4Var.m75933x41a8a7f2(21)) {
            return;
        }
        boolean m75933x41a8a7f2 = zc4Var.m75933x41a8a7f2(20);
        g4Var.j(4, activityC0065xcd7aa112.getResources().getString(m75933x41a8a7f2 ? com.p314xaae8f345.mm.R.C30867xcad56011.nvg : com.p314xaae8f345.mm.R.C30867xcad56011.nvh), com.p314xaae8f345.mm.R.raw.f79753xc84e5c48, activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.alt), !m75933x41a8a7f2);
    }
}
