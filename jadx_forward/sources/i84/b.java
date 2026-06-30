package i84;

/* loaded from: classes4.dex */
public final class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f371184d;

    public b(android.content.Context context) {
        super(context);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        this.f371184d = paint;
    }

    /* renamed from: getP */
    public final android.graphics.Paint m134931x305bba() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getP", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        android.graphics.Paint paint = this.f371184d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getP", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        return paint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(0.0f, 0.0f, getHeight(), getHeight(), 0.0f, 360.0f, false, this.f371184d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
    }

    /* renamed from: setColor */
    public final void m134932x52d2f021(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setColor", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
        this.f371184d.setColor(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setColor", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$PointView");
    }
}
