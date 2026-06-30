package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class t extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f252802d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f252803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 f252804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617, android.content.Context context) {
        super(context);
        this.f252804f = c18401x8b62a617;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-16711936);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f252802d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(-16711936);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        this.f252803e = paint2;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$initDebugOverlay$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18401x8b62a617 c18401x8b62a617 = this.f252804f;
        if (!a84.b0.b(c18401x8b62a617.m71217x5b819ce().f484221a) && bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19899xf4ead4f4()) == 1) {
            for (android.graphics.PointF pointF : c18401x8b62a617.m71217x5b819ce().f484221a) {
                canvas.drawCircle(pointF.x + c18401x8b62a617.m71217x5b819ce().f484223c, pointF.y + c18401x8b62a617.m71217x5b819ce().f484224d, 10.0f, this.f252802d);
                canvas.drawCircle(pointF.x + c18401x8b62a617.m71217x5b819ce().f484223c, pointF.y + c18401x8b62a617.m71217x5b819ce().f484224d, c18401x8b62a617.m71217x5b819ce().f484222b, this.f252803e);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$initDebugOverlay$1");
    }
}
