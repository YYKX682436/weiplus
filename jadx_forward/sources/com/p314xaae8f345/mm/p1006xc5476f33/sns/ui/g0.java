package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f249926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 f249927e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4, android.content.Context context) {
        this.f249927e = c17939xe65f30d4;
        this.f249926d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4 = this.f249927e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.a(c17939xe65f30d4) != null && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.a(c17939xe65f30d4).isShowing()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.b(c17939xe65f30d4) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(c17939xe65f30d4.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3s, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2(c17939xe65f30d4.getContext(), com.p314xaae8f345.mm.R.C30868x68b1db1.f576323wc);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        c17939xe65f30d4.f247729f = k2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.a(c17939xe65f30d4).setCanceledOnTouchOutside(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.a(c17939xe65f30d4).setContentView(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.a(c17939xe65f30d4).show();
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gxg);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        c17939xe65f30d4.f247730g = imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) inflate.findViewById(com.p314xaae8f345.mm.R.id.gxh);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$302", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        c17939xe65f30d4.f247731h = progressBar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$302", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gxi);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        c17939xe65f30d4.f247732i = findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
        r45.jj4 jj4Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.b(c17939xe65f30d4).f473378h.f451412d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.widget.ImageView imageView2 = c17939xe65f30d4.f247730g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        hj6.o(jj4Var, imageView2, this.f249926d.hashCode(), true, com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k, false, "", new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f0(this));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1");
    }
}
