package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class u8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f229022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f229023e;

    public u8(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d, android.view.View view) {
        this.f229022d = activityC16371xf216ae6d;
        this.f229023e = view;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f229022d;
        java.lang.String string = activityC16371xf216ae6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gnk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 c16337xbe204522 = activityC16371xf216ae6d.f227716f2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(c16337xbe204522 != null ? java.lang.Integer.valueOf(c16337xbe204522.f226689g) : null, 0)) {
            string = activityC16371xf216ae6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gkp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        } else {
            g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.gm6);
        }
        g4Var.f(2, string);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(this.f229023e.getTag(), "nodelete")) {
            return;
        }
        g4Var.d(3, activityC16371xf216ae6d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560897xj), activityC16371xf216ae6d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gjr));
    }
}
