package it3;

/* loaded from: classes10.dex */
public final class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376115d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        this.f376115d = activityC16983x775783e2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2.f237144t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376115d;
        activityC16983x775783e2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "[cancelUpload]");
        pm0.v.K(null, new it3.h(activityC16983x775783e2));
        java.lang.String string = activityC16983x775783e2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16983x775783e2.mo55332x76847179();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = string;
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
    }
}
