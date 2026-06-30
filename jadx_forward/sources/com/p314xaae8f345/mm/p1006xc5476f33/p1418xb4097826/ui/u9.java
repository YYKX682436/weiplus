package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class u9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96 f211440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f211441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f211442f;

    public u9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96 activityC15043xd880dd96, r45.zc4 zc4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f211440d = activityC15043xd880dd96;
        this.f211441e = zc4Var;
        this.f211442f = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15043xd880dd96 activityC15043xd880dd96 = this.f211440d;
        if (valueOf == null || valueOf.intValue() != 0) {
            if (valueOf != null && valueOf.intValue() == 1) {
                activityC15043xd880dd96.setResult(1);
                activityC15043xd880dd96.finish();
            } else {
                r45.zc4 zc4Var = this.f211441e;
                if (valueOf != null && valueOf.intValue() == 2) {
                    az2.f a17 = az2.c.a(az2.f.f97658d, this.f211440d, null, 0L, null, 14, null);
                    a17.a();
                    r45.zm4 zm4Var = new r45.zm4();
                    zm4Var.set(1, zc4Var.m75945x2fec8307(0));
                    zm4Var.set(2, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(zc4Var.m75945x2fec8307(2))));
                    zm4Var.set(3, zc4Var.m75945x2fec8307(8));
                    zm4Var.set(5, zc4Var.m75945x2fec8307(27));
                    pq5.g l17 = zm4Var.d().l();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
                    pm0.v.T(l17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t9(a17, activityC15043xd880dd96));
                } else if (valueOf != null && valueOf.intValue() == 3) {
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    ya2.e1 e1Var = ya2.e1.f542005a;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15043xd880dd96.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    java.lang.String m75945x2fec8307 = zc4Var.m75945x2fec8307(12);
                    java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
                    java.lang.String m75945x2fec83072 = zc4Var.m75945x2fec8307(13);
                    e1Var.K(mo55332x76847179, str, "", m75945x2fec83072 == null ? "" : m75945x2fec83072, "");
                }
            }
        }
        this.f211442f.u();
        activityC15043xd880dd96.finish();
    }
}
