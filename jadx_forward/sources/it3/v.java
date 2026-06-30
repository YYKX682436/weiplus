package it3;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376116d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        this.f376116d = activityC16983x775783e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376116d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16983x775783e2.f237157s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String string = activityC16983x775783e2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573838g01);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC16983x775783e2, "", string, true, true, new it3.u(activityC16983x775783e2));
        activityC16983x775783e2.f237157s = Q;
        if (Q != null) {
            Q.show();
        }
    }
}
