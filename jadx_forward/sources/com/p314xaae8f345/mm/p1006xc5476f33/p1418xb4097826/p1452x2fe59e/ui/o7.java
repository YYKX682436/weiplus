package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class o7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13984x21e25c61 f191898d;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13984x21e25c61 activityC13984x21e25c61) {
        this.f191898d = activityC13984x21e25c61;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13984x21e25c61 activityC13984x21e25c61 = this.f191898d;
        java.lang.String stringExtra = activityC13984x21e25c61.getIntent().getStringExtra("finderlivecreateparamusername");
        long longExtra = activityC13984x21e25c61.getIntent().getLongExtra("finderlivecreateparamobjectid", 0L);
        pq5.g l17 = new ly2.c(stringExtra, null, longExtra).l();
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n7(activityC13984x21e25c61, stringExtra, longExtra));
        l17.f(activityC13984x21e25c61);
        return true;
    }
}
