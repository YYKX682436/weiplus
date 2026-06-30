package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class no implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14118xff3e450 f191886d;

    public no(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14118xff3e450 activityC14118xff3e450) {
        this.f191886d = activityC14118xff3e450;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14118xff3e450.f191137h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14118xff3e450 activityC14118xff3e450 = this.f191886d;
        activityC14118xff3e450.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = activityC14118xff3e450.f191139e;
        if (c21571x8a410717 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
            throw null;
        }
        if (c21571x8a410717.P) {
            i17 = 2;
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = activityC14118xff3e450.f191140f;
            if (c21571x8a4107172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            if (!c21571x8a4107172.P) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = activityC14118xff3e450.f191141g;
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
        ot5.g.c(activityC14118xff3e450.f191138d, "output = " + i17);
        intent.putExtra("key_output_interact", i17);
        intent.putExtra("key_interact_scene", 2);
        activityC14118xff3e450.setResult(-1, intent);
        activityC14118xff3e450.finish();
        return true;
    }
}
