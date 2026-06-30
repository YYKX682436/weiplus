package c32;

/* loaded from: classes10.dex */
public final class d implements c32.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f119708a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f119709b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f119710c;

    /* renamed from: d, reason: collision with root package name */
    public final c32.a f119711d;

    public d(java.lang.String[] fontPaths, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontPaths, "fontPaths");
        this.f119709b = "";
        this.f119710c = new java.util.HashMap();
        this.f119711d = new c32.a();
        for (java.lang.String str : fontPaths) {
            c32.c cVar = new c32.c(str, i17);
            if (cVar.f119705a.f149682a != 0) {
                this.f119710c.put(str, cVar);
            }
        }
    }

    @Override // c32.e
    public void a() {
        for (c32.c cVar : ((java.util.HashMap) this.f119710c).values()) {
            java.lang.CharSequence charSequence = this.f119708a;
            java.util.ArrayList arrayList = (java.util.ArrayList) cVar.f119706b;
            arrayList.clear();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) cVar.f119707c;
            arrayList2.clear();
            if (charSequence != null) {
                for (int i17 = 0; i17 < charSequence.length(); i17++) {
                    char charAt = charSequence.charAt(i17);
                    android.graphics.Path path = new android.graphics.Path();
                    android.graphics.RectF rectF = new android.graphics.RectF();
                    if (cVar.f119705a.a(charAt, path, rectF)) {
                        arrayList.add(path);
                        arrayList2.add(rectF);
                    } else {
                        arrayList.add(null);
                        arrayList2.add(null);
                    }
                }
            }
        }
    }

    @Override // c32.e
    public void b(java.lang.String fontPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontPath, "fontPath");
        this.f119709b = fontPath;
    }

    @Override // c32.e
    public void c(android.graphics.Canvas canvas, int i17, int i18, float f17, float f18, android.graphics.Paint paint, boolean z17) {
        float measureText;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(this.f119708a)) {
            return;
        }
        c32.c cVar = (c32.c) ((java.util.HashMap) this.f119710c).get(this.f119709b);
        if (cVar == null) {
            this.f119711d.c(canvas, i17, i18, f17, f18, paint, z17);
            return;
        }
        canvas.save();
        canvas.translate(f17, f18);
        int i19 = -1;
        int i27 = i17;
        int i28 = -1;
        while (i27 < i18) {
            java.util.ArrayList arrayList = (java.util.ArrayList) cVar.f119706b;
            if (arrayList.get(i27) != null) {
                java.lang.Object obj = arrayList.get(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                canvas.drawPath((android.graphics.Path) obj, paint);
                measureText = paint.measureText(this.f119708a, i27, i27 + 1);
            } else {
                java.lang.CharSequence charSequence = this.f119708a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
                char charAt = charSequence.charAt(i27);
                boolean z18 = false;
                if ((55296 <= charAt && charAt < 57344) && i28 == i19) {
                    i28 = i27;
                } else if (i28 != i19) {
                    java.lang.CharSequence charSequence2 = this.f119708a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence2);
                    if (i27 < charSequence2.length() + i19) {
                        java.lang.CharSequence charSequence3 = this.f119708a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence3);
                        char charAt2 = charSequence3.charAt(i27 + 1);
                        if (55296 <= charAt2 && charAt2 < 57344) {
                            z18 = true;
                        }
                        if (z18) {
                        }
                    }
                    canvas.save();
                    java.lang.CharSequence charSequence4 = this.f119708a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence4);
                    int i29 = i27 + 1;
                    canvas.drawText(charSequence4, i28, i29, 0.0f, 0.0f, paint);
                    canvas.restore();
                    measureText = paint.measureText(this.f119708a, i28, i29);
                    i28 = -1;
                } else {
                    java.lang.CharSequence charSequence5 = this.f119708a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence5);
                    int i37 = i27 + 1;
                    canvas.drawText(charSequence5, i27, i37, 0.0f, 0.0f, paint);
                    measureText = paint.measureText(this.f119708a, i27, i37);
                }
                i27++;
                i19 = -1;
            }
            canvas.translate(measureText, 0.0f);
            i27++;
            i19 = -1;
        }
        if (z17) {
            canvas.drawText("...", 0.0f, 0.0f, paint);
        }
        canvas.restore();
    }

    @Override // c32.e
    /* renamed from: setText */
    public void mo14070x765074af(java.lang.CharSequence text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f119708a = text;
        c32.a aVar = this.f119711d;
        aVar.getClass();
        aVar.f119703a = text;
    }
}
