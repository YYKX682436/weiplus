package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class w2 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d f183040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f183041b;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d activityC13567x4039ba2d, o72.r2 r2Var) {
        this.f183040a = activityC13567x4039ba2d;
        this.f183041b = r2Var;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13567x4039ba2d activityC13567x4039ba2d = this.f183040a;
        activityC13567x4039ba2d.mo48674x36654fab();
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC13567x4039ba2d.mo55332x76847179(), "", activityC13567x4039ba2d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            boolean z18 = extInfo.getBoolean("is_group_to_do");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13567x4039ba2d.mo55332x76847179();
            java.lang.String str2 = activityC13567x4039ba2d.f181884g;
            if (str2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.i(mo55332x76847179, str2, str, z18, this.f183041b, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v2(Q, activityC13567x4039ba2d));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("toUser");
                throw null;
            }
        }
    }
}
