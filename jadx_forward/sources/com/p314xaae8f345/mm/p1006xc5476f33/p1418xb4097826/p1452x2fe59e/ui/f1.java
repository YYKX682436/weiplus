package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f191529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f191530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f191531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d f191532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f191533h;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, long j17, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d, android.content.Context context) {
        this.f191529d = c14994x9b99c079;
        this.f191530e = j17;
        this.f191531f = i17;
        this.f191532g = activityC13941x58ed078d;
        this.f191533h = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f191529d;
        intent.putExtra("feed_object_id", c14994x9b99c079.m59251x5db1b11());
        intent.putExtra("mention_id", this.f191530e);
        intent.putExtra("mention_create_time", this.f191531f);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13941x58ed078d activityC13941x58ed078d = this.f191532g;
        activityC13941x58ed078d.getClass();
        intent.putExtra("from_scene", hc2.o0.H(c14994x9b99c079.getFeedObject()) ? 1 : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.u2());
        intent.putExtra("from_comment_ui", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1.c(this.f191533h, intent);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Xj(activityC13941x58ed078d, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderCommentUI$initBuilder$1$onBuildDrawerHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
