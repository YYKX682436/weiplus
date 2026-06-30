package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class im implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 f250154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f250155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f250156f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f250157g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f250158h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 f250159i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm f250160m;

    public im(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm bmVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522, android.view.ViewGroup viewGroup2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var2) {
        this.f250160m = bmVar;
        this.f250154d = v1Var;
        this.f250155e = viewGroup;
        this.f250156f = c22699x3dcdb352;
        this.f250157g = c22699x3dcdb3522;
        this.f250158h = viewGroup2;
        this.f250159i = v1Var2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "bless sns id:%s cmt id:%d", ca4.z0.t0(this.f250154d.f67469x29d1290e), java.lang.Integer.valueOf(this.f250154d.S));
        this.f250154d.f67470x67fdfbc5 = 1;
        this.f250155e.performHapticFeedback(0, 3);
        this.f250156f.setVisibility(4);
        this.f250157g.setVisibility(0);
        xa4.g.f534363d.F(this.f250157g, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gm(this), 150L);
        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hm(this));
        xa4.b.f534354a.e("view_clk", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.Z6(this.f250160m.f249495w, this.f250159i), this.f250159i, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5");
    }
}
