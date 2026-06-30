package m84;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m84.u f406292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f406293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f406294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f406295g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f406296h;

    public c(m84.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f406292d = uVar;
        this.f406293e = c17702x544f64e9;
        this.f406294f = i17;
        this.f406295g = i18;
        this.f406296h = c17933xe8d1b226;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$bindClickArea$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent$bindClickArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m84.u uVar = this.f406292d;
        java.lang.String j17 = uVar.j();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = this.f406293e;
        int i17 = this.f406294f;
        int i18 = this.f406295g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f406296h;
        try {
            c17702x544f64e9.f244141t0 = m84.u.B(uVar, c17702x544f64e9.f244141t0, i17);
            c17702x544f64e9.f244102a = i18;
            w64.n K = uVar.K();
            if (K != null) {
                K.o(c17702x544f64e9, c17933xe8d1b226, i17);
            }
            w64.n K2 = uVar.K();
            if (K2 != null) {
                K2.k(view);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.j(), "click area, scene=" + i18 + ", subClickPos=" + i17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adworldcupavatar/AdWorldCupAvatarComponent$bindClickArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$bindClickArea$1");
    }
}
