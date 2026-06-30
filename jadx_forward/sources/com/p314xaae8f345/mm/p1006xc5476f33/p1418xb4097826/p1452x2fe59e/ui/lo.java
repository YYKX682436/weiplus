package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class lo implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14117xff3e44f f191817d;

    public lo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14117xff3e44f activityC14117xff3e44f) {
        this.f191817d = activityC14117xff3e44f;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14117xff3e44f.f191132h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14117xff3e44f activityC14117xff3e44f = this.f191817d;
        activityC14117xff3e44f.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = activityC14117xff3e44f.f191134e;
        if (c21571x8a410717 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
            throw null;
        }
        if (c21571x8a410717.P) {
            i17 = 2;
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = activityC14117xff3e44f.f191135f;
            if (c21571x8a4107172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            if (!c21571x8a4107172.P) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = activityC14117xff3e44f.f191136g;
                if (c21571x8a4107173 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                    throw null;
                }
                if (c21571x8a4107173.P) {
                    i17 = 1;
                }
                return true;
            }
            i17 = 3;
        }
        ot5.g.c(activityC14117xff3e44f.f191133d, "output = " + i17);
        intent.putExtra("key_output_interact", i17);
        intent.putExtra("key_interact_scene", 1);
        activityC14117xff3e44f.setResult(-1, intent);
        activityC14117xff3e44f.finish();
        return true;
    }
}
