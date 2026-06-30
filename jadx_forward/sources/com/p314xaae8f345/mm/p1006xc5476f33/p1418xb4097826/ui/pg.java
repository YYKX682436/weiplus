package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class pg implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd f211178a;

    public pg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd activityC15065x39babbd) {
        this.f211178a = activityC15065x39babbd;
    }

    public void a(java.lang.String username, android.widget.ImageView icon, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15065x39babbd activityC15065x39babbd = this.f211178a;
        if (activityC15065x39babbd.f210248m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC15065x39babbd.f210242d, "error self contact is null");
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        ya2.b2 b2Var = activityC15065x39babbd.f210248m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b2Var);
        a17.c(new mn2.n(b2Var.f69301x81118c51, null, 2, null), icon, g1Var.h(mn2.f1.f411490h));
    }
}
