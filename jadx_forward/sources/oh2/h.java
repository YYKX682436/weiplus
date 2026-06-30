package oh2;

/* loaded from: classes10.dex */
public final class h extends oh2.d {
    public final float A;
    public final jz5.g B;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f426906x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f426907y;

    /* renamed from: z, reason: collision with root package name */
    public final float f426908z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, java.lang.String rotateCharsPattern) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rotateCharsPattern, "rotateCharsPattern");
        this.f426906x = rotateCharsPattern;
        this.f426907y = "FinderLiveNormalRoomVerticalLyricsDrawer";
        this.f426908z = i65.a.a(context, 24.0f);
        this.A = i65.a.a(context, 0.0f);
        this.B = jz5.h.b(new oh2.g(this));
    }

    @Override // oh2.d
    public void c(android.graphics.Canvas canvas, int i17) {
        int i18;
        int i19;
        float f17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        my5.a aVar = this.f426882g;
        if (aVar == null || (i18 = this.f426887l) > (i19 = this.f426888m + 1)) {
            return;
        }
        while (true) {
            java.util.ArrayList arrayList = aVar.f414385a;
            if (i18 >= 0 && i18 < arrayList.size()) {
                my5.c cVar = (my5.c) arrayList.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
                java.lang.String str = cVar.f414390a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (!(str.length() == 0)) {
                    android.graphics.Paint paint = this.f426881f;
                    paint.setColor(i18 < this.f426886k ? this.f426884i : this.f426883h);
                    paint.setTypeface(i18 == this.f426886k ? android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1) : android.graphics.Typeface.DEFAULT);
                    if (i18 == this.f426886k) {
                        f17 = this.f426891p;
                    } else {
                        int i27 = this.f426887l;
                        f17 = (i18 != i27 || i27 < 0) ? this.f426877b : this.f426892q;
                    }
                    paint.setTextSize(f17);
                    i(i18);
                    float f19 = this.f426880e;
                    float f27 = this.f426908z;
                    float f28 = f19 + f27;
                    float f29 = 2;
                    float f37 = f27 / f29;
                    float f38 = ((i18 * f28) + f37) - this.f426890o;
                    float p17 = p(str);
                    float f39 = this.f426895t;
                    if (p17 <= f39) {
                        f18 = (f39 - p17) / f29;
                    } else {
                        f18 = 0.0f;
                        if (i18 == this.f426886k) {
                            float f47 = -(o(cVar, i17) - (this.f426895t * 0.7f));
                            if (f47 <= 0.0f) {
                                f18 = f47;
                            }
                        }
                    }
                    m(canvas, str, f38, f18);
                    if (i18 == this.f426886k) {
                        float o17 = o(cVar, i17);
                        paint.setColor(this.f426884i);
                        canvas.save();
                        canvas.clipRect(new android.graphics.RectF(f38 - f37, f18, f37 + f38, o17 + f18));
                        m(canvas, str, f38, f18);
                        canvas.restore();
                    }
                }
            }
            if (i18 == i19) {
                return;
            } else {
                i18++;
            }
        }
    }

    @Override // oh2.d
    public java.lang.String e() {
        return this.f426907y;
    }

    @Override // oh2.d
    public void f(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        canvas.translate(this.f426896u, 0.0f);
        float f17 = this.f426908z / 2;
        android.graphics.Rect rect = this.f426898w;
        rect.left = -((int) f17);
        rect.right = (int) (this.f426894s + f17);
        rect.top = 0;
        rect.bottom = (int) this.f426895t;
        canvas.clipRect(rect);
    }

    @Override // oh2.d
    public void h() {
        this.f426886k = 0;
        this.f426890o = 0.0f;
        this.f426887l = -1;
        this.f426888m = this.f426889n - 1;
        float f17 = this.f426876a;
        this.f426891p = f17;
        this.f426892q = f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomVerticalLyricsDrawer", "reset");
    }

    @Override // oh2.d
    public void k(int i17) {
        b(i17 * (this.f426908z + this.f426880e), false).start();
    }

    public final void m(android.graphics.Canvas canvas, java.lang.String str, float f17, float f18) {
        java.lang.Character ch6 = null;
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            boolean q17 = q(charAt, ch6);
            float n17 = n(charAt, ch6);
            canvas.save();
            float f19 = 2;
            canvas.translate(f17, (n17 / f19) + f18);
            if (q17) {
                canvas.rotate(90.0f);
            }
            android.graphics.Paint paint = this.f426881f;
            paint.setTextAlign(android.graphics.Paint.Align.CENTER);
            canvas.drawText(java.lang.String.valueOf(charAt), 0.0f, java.lang.Math.abs(paint.ascent() + paint.descent()) / f19, paint);
            canvas.restore();
            f18 += n17 + this.A;
            ch6 = java.lang.Character.valueOf(charAt);
        }
    }

    public final float n(char c17, java.lang.Character ch6) {
        android.graphics.Paint paint = this.f426881f;
        float abs = java.lang.Math.abs(paint.ascent() - paint.descent());
        boolean z17 = true;
        if (!(19968 <= c17 && c17 < 40960)) {
            if (!(13312 <= c17 && c17 < 19904)) {
                if (!(63744 <= c17 && c17 < 64256)) {
                    if (!(65280 <= c17 && c17 < 65520)) {
                        z17 = false;
                    }
                }
            }
        }
        return z17 ? abs : q(c17, ch6) ? paint.measureText(java.lang.String.valueOf(c17)) : paint.measureText(java.lang.String.valueOf(c17));
    }

    public final float o(my5.c cVar, int i17) {
        int d17 = d(cVar, i17);
        if (d17 >= 0) {
            java.util.ArrayList mCharacters = cVar.f414393d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mCharacters, "mCharacters");
            if (!mCharacters.isEmpty()) {
                my5.b bVar = (my5.b) cVar.f414393d.get(d17);
                java.lang.String mText = cVar.f414390a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mText, "mText");
                java.lang.String substring = mText.substring(0, bVar.f414388c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                float p17 = p(substring);
                float f17 = ((float) (i17 - bVar.f414386a)) / ((float) bVar.f414387b);
                r1 = f17 <= 1.0f ? f17 : 1.0f;
                java.lang.String mText2 = cVar.f414390a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mText2, "mText");
                java.lang.String substring2 = mText2.substring(bVar.f414388c, bVar.f414389d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                return p17 + (p(substring2) * r1);
            }
        }
        int i18 = (int) cVar.f414391b;
        int i19 = (int) cVar.f414392c;
        int i27 = i18 + i19;
        if (i17 < i18) {
            r1 = 0.0f;
        } else if (i17 < i27) {
            r1 = (i17 - i18) / i19;
        }
        java.lang.String mText3 = cVar.f414390a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mText3, "mText");
        return p(mText3) * r1;
    }

    public final float p(java.lang.String str) {
        float f17 = 0.0f;
        java.lang.Character ch6 = null;
        int i17 = 0;
        int i18 = 0;
        while (i17 < str.length()) {
            char charAt = str.charAt(i17);
            int i19 = i18 + 1;
            f17 += n(charAt, ch6);
            if (i18 < str.length() - 1) {
                f17 += this.A;
            }
            ch6 = java.lang.Character.valueOf(charAt);
            i17++;
            i18 = i19;
        }
        return f17;
    }

    public final boolean q(char c17, java.lang.Character ch6) {
        jz5.g gVar = this.B;
        if (c17 == '\'' && ch6 != null && ((r26.t) ((jz5.n) gVar).mo141623x754a37bb()).e(ch6.toString())) {
            return true;
        }
        return ((r26.t) ((jz5.n) gVar).mo141623x754a37bb()).e(java.lang.String.valueOf(c17));
    }
}
