package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class zb extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f202089d;

    /* renamed from: e, reason: collision with root package name */
    public float f202090e;

    /* renamed from: f, reason: collision with root package name */
    public float f202091f;

    /* renamed from: g, reason: collision with root package name */
    public float f202092g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f202093h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f202094i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f202093h = new android.graphics.Path();
        this.f202094i = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (!this.f202089d) {
            super.onDraw(canvas);
            return;
        }
        boolean z17 = this.f202094i;
        android.graphics.Path path = this.f202093h;
        if (z17) {
            path.reset();
            if (this.f202089d) {
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                path.addCircle(width, height, this.f202090e, android.graphics.Path.Direction.CW);
                android.graphics.Path path2 = new android.graphics.Path();
                path2.addCircle(width + this.f202091f, height, this.f202090e + this.f202092g, android.graphics.Path.Direction.CW);
                path.op(path2, android.graphics.Path.Op.DIFFERENCE);
                this.f202094i = false;
            } else {
                this.f202094i = false;
            }
        }
        int save = canvas.save();
        canvas.clipPath(path);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f202094i = true;
    }
}
