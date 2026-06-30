package gm2;

/* loaded from: classes3.dex */
public final class j extends gm2.a {

    /* renamed from: e, reason: collision with root package name */
    public static final gm2.h f354947e = new gm2.h(null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f354948f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);

    /* renamed from: d, reason: collision with root package name */
    public gm2.i f354949d;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansSpan", "initMemoryTrim");
        ki.i.f389634c.c(new gm2.g());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f354949d = new gm2.i(null, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524287, null);
    }

    @Override // gm2.y1
    public int a() {
        gm2.i iVar = this.f354949d;
        return iVar.a() + iVar.f354937o + iVar.f354938p;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        int i29 = i28 - i19;
        gm2.i iVar = this.f354949d;
        int i37 = iVar.f354936n;
        if (i29 < i37) {
            return;
        }
        float f18 = f17 + iVar.f354937o;
        float f19 = i19 + (i29 > i37 ? (i29 - i37) / 2 : 0);
        float f27 = i37 + f19;
        if (!(java.lang.Integer.valueOf(iVar.f354939q) != null) || this.f354949d.f354939q <= 0) {
            paint.setColor(this.f354949d.f354935m);
            canvas.drawRoundRect(new android.graphics.RectF(f18, f19, this.f354949d.a() + f18, f27), 45.0f, 45.0f, paint);
        } else {
            android.graphics.drawable.Drawable drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(this.f354949d.f354939q);
            drawable.setBounds((int) f18, (int) f19, (int) (this.f354949d.a() + f18), (int) f27);
            drawable.draw(canvas);
        }
        gm2.i iVar2 = this.f354949d;
        android.graphics.drawable.Drawable drawable2 = iVar2.f354929g;
        if (drawable2 != null) {
            int i38 = i19 + ((i29 - iVar2.f354931i) / 2);
            gm2.i iVar3 = this.f354949d;
            int i39 = iVar3.f354941s;
            drawable2.setBounds(new android.graphics.Rect(((int) f18) + i39, i38, (int) (iVar3.f354930h + f18 + i39), iVar3.f354931i + i38));
            drawable2.draw(canvas);
        }
        com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f354949d.f354924b);
        paint.setTextSize(this.f354949d.f354925c);
        float f28 = 2;
        float abs = (java.lang.Math.abs(paint.ascent() + paint.descent()) / f28) + (i29 / 2);
        java.lang.String str = this.f354949d.f354923a;
        float measureText = paint.measureText(str, 0, str.length());
        gm2.i iVar4 = this.f354949d;
        float f29 = iVar4.f354930h;
        canvas.drawText(iVar4.f354923a, (f29 > measureText ? (f29 - measureText) / f28 : 0.0f) + f18, abs, paint);
        com.p314xaae8f345.mm.ui.bk.t0(paint);
        com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
        paint.setColor(this.f354949d.f354927e);
        paint.setTextSize(this.f354949d.f354928f);
        int i47 = this.f354949d.f354936n;
        int i48 = i29 > i47 ? (i29 - i47) / 2 : 0;
        float abs2 = java.lang.Math.abs(paint.ascent() + paint.descent()) / f28;
        gm2.i iVar5 = this.f354949d;
        float f37 = abs2 + (iVar5.f354936n / 2) + i48;
        float f38 = iVar5.f354930h + iVar5.f354941s + iVar5.f354940r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint.getFontMetrics(), "getFontMetrics(...)");
        canvas.drawText(this.f354949d.f354926d, f38 + f18, f37, paint);
        com.p314xaae8f345.mm.ui.bk.t0(paint);
        android.graphics.drawable.Drawable drawable3 = this.f354949d.f354932j;
        if (drawable3 != null) {
            paint.setTextSize(r6.f354928f);
            java.lang.String str2 = this.f354949d.f354926d;
            float measureText2 = paint.measureText(str2, 0, str2.length());
            float f39 = (((((f18 + r9.f354930h) + r9.f354941s) + r9.f354940r) + 1) + measureText2) - (r9.f354933k / 2);
            int i49 = i19 + ((i29 - this.f354949d.f354934l) / 2);
            drawable3.setBounds(new android.graphics.Rect((int) f39, i49, (int) (f39 + r10.f354933k), this.f354949d.f354934l + i49));
            drawable3.draw(canvas);
        }
        paint.setColor(color);
        paint.setTextSize(textSize);
    }
}
