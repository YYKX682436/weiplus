package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class e9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 f191506d;

    public e9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8) {
        this.f191506d = activityC13997x866e3aa8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8.f190893m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13997x866e3aa8 activityC13997x866e3aa8 = this.f191506d;
        activityC13997x866e3aa8.getClass();
        android.content.Intent intent = new android.content.Intent();
        bm2.m2 m2Var = activityC13997x866e3aa8.f190894d;
        intent.putExtra("Select_Contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(m2Var.x(), ","));
        activityC13997x866e3aa8.setResult(-1, intent);
        activityC13997x866e3aa8.finish();
        activityC13997x866e3aa8.T6();
        m2Var.m8146xced61ae5();
        return true;
    }
}
