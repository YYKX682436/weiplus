package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class k2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i2 {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f229961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f229962h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e, android.content.Context context, android.view.View view) {
        super(activityC16480xce80140e, context, view);
        this.f229962h = activityC16480xce80140e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i2
    public void a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jkg);
        this.f229961g = linearLayout;
        this.f229941e = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.jkh);
        this.f229942f = (android.widget.TextView) this.f229961g.findViewById(com.p314xaae8f345.mm.R.id.jki);
        this.f229961g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.j2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        return "pay_receiveorpay";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f229961g;
    }
}
