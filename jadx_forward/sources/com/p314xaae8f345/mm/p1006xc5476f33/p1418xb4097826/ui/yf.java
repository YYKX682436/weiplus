package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class yf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15061x608fd9b8 f211596d;

    public yf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15061x608fd9b8 activityC15061x608fd9b8) {
        this.f211596d = activityC15061x608fd9b8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15061x608fd9b8.f210229h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15061x608fd9b8 activityC15061x608fd9b8 = this.f211596d;
        activityC15061x608fd9b8.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = activityC15061x608fd9b8.f210231e;
        if (c21571x8a410717 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectMale");
            throw null;
        }
        if (c21571x8a410717.P) {
            str = "male";
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = activityC15061x608fd9b8.f210232f;
            if (c21571x8a4107172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectFeMale");
                throw null;
            }
            if (c21571x8a4107172.P) {
                str = "female";
            } else {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = activityC15061x608fd9b8.f210233g;
                if (c21571x8a4107173 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectUnshow");
                    throw null;
                }
                if (!c21571x8a4107173.P) {
                    return true;
                }
                str = "unshow";
            }
        }
        ot5.g.c(activityC15061x608fd9b8.f210230d, "outputSex = ".concat(str));
        intent.putExtra("key_output_sex", str);
        activityC15061x608fd9b8.setResult(-1, intent);
        activityC15061x608fd9b8.finish();
        return true;
    }
}
