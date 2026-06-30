package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class m1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i1 {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f229976g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 f229977h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212, android.content.Context context, android.view.View view) {
        super(activityC16479x8f884212, context, view);
        this.f229977h = activityC16479x8f884212;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i1
    public void a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jkk);
        this.f229976g = linearLayout;
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f569176pb0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16479x8f884212 activityC16479x8f884212 = this.f229977h;
        activityC16479x8f884212.f229774f = textView;
        activityC16479x8f884212.F = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d) this.f229976g.findViewById(com.p314xaae8f345.mm.R.id.f569177pb1);
        activityC16479x8f884212.G = (android.widget.ProgressBar) this.f229976g.findViewById(com.p314xaae8f345.mm.R.id.pcr);
        activityC16479x8f884212.mo273xed6858b4().a(activityC16479x8f884212.F);
        activityC16479x8f884212.F.m73933xaf1ebe0c(activityC16479x8f884212.G);
        activityC16479x8f884212.F.m73936xb2ceec4c("¥");
        activityC16479x8f884212.F.m73938x1c5c5ff4(-1);
        activityC16479x8f884212.F.m73939x3abfd950(i65.a.b(activityC16479x8f884212.mo55332x76847179(), 15));
        this.f229938e = (android.widget.ImageView) this.f229976g.findViewById(com.p314xaae8f345.mm.R.id.jkl);
        this.f229939f = (android.widget.TextView) this.f229976g.findViewById(com.p314xaae8f345.mm.R.id.jkn);
        this.f229976g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return "wallet";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f229976g;
    }
}
