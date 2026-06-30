package gf0;

/* loaded from: classes.dex */
public final class q implements com.p314xaae8f345.mm.ui.yc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f352763a;

    public q(android.app.Activity activity) {
        this.f352763a = activity;
    }

    @Override // com.p314xaae8f345.mm.ui.yc
    public void a(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 == 80) {
            android.app.Activity activity = this.f352763a;
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78769xd0f357ed(this);
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
            u1Var.g(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn));
            u1Var.i(gf0.o.f352761a);
            u1Var.n(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z));
            u1Var.l(new gf0.p(activity));
            u1Var.q(false);
        }
    }
}
