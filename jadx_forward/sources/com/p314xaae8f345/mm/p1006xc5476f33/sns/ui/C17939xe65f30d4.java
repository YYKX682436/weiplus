package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.ArtistHeader */
/* loaded from: classes4.dex */
public class C17939xe65f30d4 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.za f247727d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k0 f247728e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 f247729f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f247730g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f247731h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f247732i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Context f247733m;

    public C17939xe65f30d4(android.content.Context context) {
        super(context);
        this.f247727d = null;
        this.f247729f = null;
        this.f247733m = null;
        d(context);
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = c17939xe65f30d4.f247729f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        return k2Var;
    }

    public static /* synthetic */ r45.za b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        r45.za zaVar = c17939xe65f30d4.f247727d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        return zaVar;
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        c17939xe65f30d4.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showHDAvatar", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.widget.ImageView imageView = c17939xe65f30d4.f247730g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showHDAvatar", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public final void d(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqq, (android.view.ViewGroup) this, true);
        this.f247733m = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k0(this);
        this.f247728e = k0Var;
        k0Var.f251130a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a58);
        this.f247728e.f251131b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563817a8);
        this.f247728e.f251132c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563819aa);
        this.f247728e.f251133d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563818a9);
        this.f247728e.f251134e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_);
        this.f247728e.f251130a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g0(this, context));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        if (this.f247727d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 k2Var = this.f247729f;
        if (k2Var != null && k2Var.isShowing()) {
            if (!z17 && (str2 = this.f247727d.f473378h.f451412d.f459388d) != null && str2.equals(str)) {
                android.content.Context context = this.f247733m;
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_9), 0).show();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
                return;
            } else {
                android.widget.ImageView imageView = this.f247730g;
                if (imageView != null) {
                    imageView.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i0(this));
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSetbg */
    public void mo853xb04a0d88(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetbg", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetbg", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onThumbFinish */
    public void mo855x8dbd7aaa(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onThumbFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onThumbFinish", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    /* renamed from: setBackClickListener */
    public void m70545x31c61473(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j0 j0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setBackClickListener", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setBackClickListener", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    /* renamed from: setUserName */
    public void m70546x66ad9b78(r45.za zaVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
        if (zaVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ArtistHeader", "userName or selfName is null ");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            return;
        }
        this.f247727d = zaVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().e0(zaVar.f473378h.f451412d, this.f247728e.f251130a, this.f247733m.hashCode(), com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k);
        this.f247728e.f251132c.setText(zaVar.f473374d);
        this.f247728e.f251131b.setText(zaVar.f473377g);
        this.f247728e.f251134e.setText(zaVar.f473375e);
        this.f247728e.f251133d.setText(zaVar.f473376f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUserName", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
    }

    public C17939xe65f30d4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247727d = null;
        this.f247729f = null;
        this.f247733m = null;
        d(context);
    }
}
