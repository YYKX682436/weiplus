package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class m2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i2 {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f229978g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f229979h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f229980i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e, android.content.Context context, android.view.View view) {
        super(activityC16480xce80140e, context, view);
        this.f229980i = activityC16480xce80140e;
        this.f229979h = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i2
    public void a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jkk);
        this.f229978g = linearLayout;
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f569176pb0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f229980i;
        activityC16480xce80140e.f229789f = textView;
        activityC16480xce80140e.f229823J = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19152xaaf0e35d) this.f229978g.findViewById(com.p314xaae8f345.mm.R.id.f569177pb1);
        activityC16480xce80140e.K = (android.widget.ProgressBar) this.f229978g.findViewById(com.p314xaae8f345.mm.R.id.pcr);
        activityC16480xce80140e.f229826z = (android.widget.RelativeLayout) this.f229978g.findViewById(com.p314xaae8f345.mm.R.id.paz);
        if (j65.e.b()) {
            activityC16480xce80140e.f229789f.setAlpha(1.0f);
            activityC16480xce80140e.f229823J.setAlpha(1.0f);
        }
        activityC16480xce80140e.mo273xed6858b4().a(activityC16480xce80140e.f229823J);
        activityC16480xce80140e.f229823J.m73933xaf1ebe0c(activityC16480xce80140e.K);
        activityC16480xce80140e.f229823J.m73936xb2ceec4c("¥");
        activityC16480xce80140e.f229823J.m73938x1c5c5ff4(-1);
        activityC16480xce80140e.f229823J.m73939x3abfd950(i65.a.b(activityC16480xce80140e.mo55332x76847179(), 15));
        this.f229941e = (android.widget.ImageView) this.f229978g.findViewById(com.p314xaae8f345.mm.R.id.jkl);
        this.f229942f = (android.widget.TextView) this.f229978g.findViewById(com.p314xaae8f345.mm.R.id.jkn);
        this.f229978g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.l2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return "wallet";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f229978g;
    }
}
