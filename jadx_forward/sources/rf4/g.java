package rf4;

/* loaded from: classes4.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd f476582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gf4.a f476583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 f476584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd, gf4.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7) {
        super(0);
        this.f476582d = c18475x542840cd;
        this.f476583e = aVar;
        this.f476584f = c18474x76daa3b7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f476582d.f253426d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: comment appear ");
        gf4.a aVar = this.f476583e;
        sb6.append(aVar.f352870h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        boolean z17 = aVar.f352870h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7 = this.f476584f;
        if (z17) {
            c18474x76daa3b7.getClass();
            aVar.f352870h = false;
        }
        if (aVar.f352868f) {
            android.graphics.drawable.Drawable background = c18474x76daa3b7.m71392x8c409d27().getBackground();
            if (background instanceof android.graphics.drawable.GradientDrawable) {
                android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(background, "color", c18474x76daa3b7.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560055a3), c18474x76daa3b7.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7g));
                ofInt.setEvaluator(new rf4.b());
                ofInt.setStartDelay(400L);
                ofInt.setDuration(2000L);
                ofInt.start();
            }
            aVar.f352868f = false;
        }
        return jz5.f0.f384359a;
    }
}
