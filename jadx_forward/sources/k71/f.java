package k71;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f386214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f386215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f386216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, int i17) {
        super(1);
        this.f386214d = activityC0065xcd7aa112;
        this.f386215e = k0Var;
        this.f386216f = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.Button it = (android.widget.Button) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f386214d;
        if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc) activityC0065xcd7aa112;
            activityC11453xa58e34bc.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", activityC11453xa58e34bc.S, 34575);
        } else if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d activityC11438x77a05b9d = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11438x77a05b9d) activityC0065xcd7aa112;
            activityC11438x77a05b9d.getClass();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_actionsheet", "view_exp", activityC11438x77a05b9d.A, 34575);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f386215e;
        k0Var.v();
        db5.g4 g4Var = k0Var.L;
        k71.m mVar = k71.m.f386226f;
        android.view.MenuItem findItem = g4Var.findItem(5005);
        int i17 = this.f386216f;
        if (findItem != null) {
            v61.d.h("register_account", i17);
        }
        if (g4Var.findItem(com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28) != null) {
            v61.d.h("security_center_login", i17);
        }
        if (g4Var.findItem(7012) != null) {
            v61.d.h("frozen_account_login", i17);
        }
        return jz5.f0.f384359a;
    }
}
