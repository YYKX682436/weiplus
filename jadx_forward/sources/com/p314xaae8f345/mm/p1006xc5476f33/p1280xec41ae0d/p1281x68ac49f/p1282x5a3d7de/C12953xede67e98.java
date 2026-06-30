package com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.p1282x5a3d7de;

/* renamed from: com.tencent.mm.plugin.battery.stats.chart.SimpleLineChart */
/* loaded from: classes5.dex */
public class C12953xede67e98 extends android.view.View {
    public static final java.text.DateFormat C = new java.text.SimpleDateFormat("HH:mm", java.util.Locale.US);
    public final float A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f175367d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f175368e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float[] f175369f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long[] f175370g;

    /* renamed from: h, reason: collision with root package name */
    public float f175371h;

    /* renamed from: i, reason: collision with root package name */
    public float f175372i;

    /* renamed from: m, reason: collision with root package name */
    public float f175373m;

    /* renamed from: n, reason: collision with root package name */
    public final float f175374n;

    /* renamed from: o, reason: collision with root package name */
    public final float f175375o;

    /* renamed from: p, reason: collision with root package name */
    public final float f175376p;

    /* renamed from: q, reason: collision with root package name */
    public final float f175377q;

    /* renamed from: r, reason: collision with root package name */
    public float f175378r;

    /* renamed from: s, reason: collision with root package name */
    public float f175379s;

    /* renamed from: t, reason: collision with root package name */
    public final float f175380t;

    /* renamed from: u, reason: collision with root package name */
    public final float f175381u;

    /* renamed from: v, reason: collision with root package name */
    public final float f175382v;

    /* renamed from: w, reason: collision with root package name */
    public final float f175383w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Path f175384x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Path f175385y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f175386z;

    public C12953xede67e98(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(java.util.List list, java.util.List list2, float f17, int i17) {
        if (list.size() < i17 || list2.size() >= i17) {
            return;
        }
        int i18 = -1;
        float f18 = -1.0f;
        for (int i19 = 0; i19 < list.size(); i19++) {
            if (!list2.contains(java.lang.Integer.valueOf(i19))) {
                float floatValue = ((java.lang.Float) ((m3.d) list.get(i19)).f404625a).floatValue() - f17;
                if (java.lang.Math.abs(floatValue) > f18) {
                    i18 = i19;
                    f18 = floatValue;
                }
            }
        }
        list2.add(java.lang.Integer.valueOf(i18));
        a(list, list2, f17, i17);
    }

    /* renamed from: getMaxData */
    private float m54222x7015f2f8() {
        float f17 = 0.0f;
        for (java.lang.Float f18 : this.f175369f) {
            f17 = java.lang.Math.max(f17, f18.floatValue());
        }
        return f17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.f175367d = new android.graphics.Paint(1);
        this.f175368e = new android.graphics.Paint(1);
        this.f175384x = new android.graphics.Path();
        this.f175385y = new android.graphics.Path();
        android.graphics.Rect rect = new android.graphics.Rect();
        long longValue = this.f175370g[0].longValue();
        java.text.DateFormat dateFormat = C;
        java.lang.String format = longValue <= 0 ? "NULL" : dateFormat.format(new java.util.Date(longValue));
        this.f175367d.getTextBounds(format, 0, format.length(), rect);
        rect.width();
        this.f175373m = rect.height();
        float f17 = this.f175371h;
        float f18 = this.f175374n;
        this.f175378r = (f17 - (f18 * 2.0f)) / this.f175370g.length;
        float f19 = this.f175372i;
        float f27 = this.f175380t;
        float m54222x7015f2f8 = ((f19 - f27) - this.f175379s) / m54222x7015f2f8();
        float f28 = (this.f175378r / 2.0f) + f18;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f175386z;
        arrayList.clear();
        for (java.lang.Float f29 : this.f175369f) {
            arrayList.add(new android.graphics.PointF(f28, (this.f175372i - this.f175379s) - (f29.floatValue() * m54222x7015f2f8)));
            f28 += this.f175378r;
        }
        float f37 = (this.f175378r / 2.0f) + f18;
        float f38 = this.f175372i;
        float f39 = this.f175375o;
        float f47 = f38 - f39;
        this.f175367d.setTextSize((int) ((getContext().getResources().getDisplayMetrics().scaledDensity * 13.0f) + 0.5f));
        this.f175367d.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        this.f175367d.setTextAlign(android.graphics.Paint.Align.CENTER);
        java.lang.Long[] lArr = this.f175370g;
        int length = lArr.length;
        int i17 = 0;
        while (i17 < length) {
            float f48 = f27;
            long longValue2 = lArr[i17].longValue();
            canvas.drawText(longValue2 <= 0 ? "NULL" : dateFormat.format(new java.util.Date(longValue2)), f37, f47, this.f175367d);
            f37 += this.f175378r;
            i17++;
            f27 = f48;
        }
        float f49 = f27;
        float f57 = this.f175374n;
        float f58 = this.f175371h - f57;
        float f59 = this.f175372i - this.f175373m;
        float f66 = this.f175377q;
        float f67 = (f59 - f66) - f39;
        this.f175367d.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        android.graphics.Paint paint = this.f175367d;
        float f68 = this.f175383w;
        paint.setStrokeWidth(f68);
        canvas.drawLine(f57, f67, f58, f67, this.f175367d);
        float f69 = ((this.f175372i - this.f175373m) - f66) - f39;
        float f76 = f69 + this.f175376p;
        if (this.B == 1) {
            float f77 = f18;
            int i18 = 0;
            for (int i19 = 1; i18 < this.f175370g.length + i19; i19 = 1) {
                canvas.drawLine(f77, f69, f77, f76, this.f175367d);
                f77 += this.f175378r;
                i18++;
            }
        }
        float f78 = this.f175372i;
        float f79 = f78 - f69;
        this.f175379s = f79;
        float m54222x7015f2f82 = ((f78 - f49) - f79) / m54222x7015f2f8();
        this.f175385y.reset();
        this.f175385y.moveTo((this.f175378r / 2.0f) + f18, this.f175372i - this.f175379s);
        for (int i27 = 0; i27 < arrayList.size(); i27++) {
            this.f175385y.lineTo(((android.graphics.PointF) arrayList.get(i27)).x, ((android.graphics.PointF) arrayList.get(i27)).y);
        }
        this.f175385y.lineTo(((android.graphics.PointF) arrayList.get(arrayList.size() - 1)).x, this.f175372i - this.f175379s);
        this.f175385y.close();
        this.f175368e.setStyle(android.graphics.Paint.Style.FILL);
        float f86 = f18 + (this.f175378r / 2.0f);
        this.f175368e.setShader(new android.graphics.LinearGradient(f86, (this.f175372i - this.f175379s) - (m54222x7015f2f8() * m54222x7015f2f82), f86, (this.f175372i - this.f175379s) - f49, android.graphics.Color.parseColor("#4DFFB59C"), android.graphics.Color.parseColor("#4DFFF5F1"), android.graphics.Shader.TileMode.CLAMP));
        canvas.drawPath(this.f175385y, this.f175368e);
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            if (this.B == 1) {
                this.f175367d.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77885xa3c58dfc));
                canvas.drawCircle(((android.graphics.PointF) arrayList.get(i28)).x, ((android.graphics.PointF) arrayList.get(i28)).y, this.f175382v, this.f175367d);
            }
            this.f175367d.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            canvas.drawCircle(((android.graphics.PointF) arrayList.get(i28)).x, ((android.graphics.PointF) arrayList.get(i28)).y, this.f175381u, this.f175367d);
        }
        this.f175384x.reset();
        for (int i29 = 0; i29 < arrayList.size(); i29++) {
            if (i29 == 0) {
                this.f175384x.moveTo(((android.graphics.PointF) arrayList.get(i29)).x, ((android.graphics.PointF) arrayList.get(i29)).y);
            } else {
                this.f175384x.lineTo(((android.graphics.PointF) arrayList.get(i29)).x, ((android.graphics.PointF) arrayList.get(i29)).y);
            }
        }
        this.f175367d.setStyle(android.graphics.Paint.Style.STROKE);
        this.f175367d.setStrokeWidth(f68);
        this.f175367d.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        canvas.drawPath(this.f175384x, this.f175367d);
        new android.graphics.Rect();
        this.f175367d.setStyle(android.graphics.Paint.Style.FILL);
        this.f175367d.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        this.f175367d.setTextAlign(android.graphics.Paint.Align.CENTER);
        for (int i37 = 0; i37 < this.f175369f.length; i37++) {
            float f87 = ((android.graphics.PointF) arrayList.get(i37)).x;
            float f88 = ((android.graphics.PointF) arrayList.get(i37)).y - this.A;
            float floatValue = this.f175369f[i37].floatValue();
            canvas.drawText(floatValue < 0.0f ? "" : ((int) floatValue) + "%", f87, f88, this.f175367d);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f175371h = i17;
        this.f175372i = i18;
    }

    /* renamed from: setData */
    public void m54223x76491f2c(java.util.List<m3.d> list) {
        if (list.size() > 7) {
            java.util.Iterator<m3.d> it = list.iterator();
            float f17 = 0.0f;
            while (it.hasNext()) {
                f17 += ((java.lang.Float) it.next().f404625a).floatValue();
            }
            float size = f17 / list.size();
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(0);
            hashSet.add(java.lang.Integer.valueOf(list.size() - 1));
            if (list.isEmpty()) {
                throw new java.lang.IllegalStateException("Input list in empty");
            }
            float floatValue = ((java.lang.Float) list.get(0).f404625a).floatValue();
            float floatValue2 = ((java.lang.Float) list.get(0).f404625a).floatValue();
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 1; i19 < list.size(); i19++) {
                m3.d dVar = list.get(i19);
                float floatValue3 = ((java.lang.Float) dVar.f404625a).floatValue();
                java.lang.Object obj = dVar.f404625a;
                if (floatValue3 < floatValue) {
                    floatValue = ((java.lang.Float) obj).floatValue();
                    i17 = i19;
                }
                java.lang.Float f18 = (java.lang.Float) obj;
                if (f18.floatValue() > floatValue2) {
                    floatValue2 = f18.floatValue();
                    i18 = i19;
                }
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            hashSet.add(valueOf);
            hashSet.add(valueOf2);
            java.util.ArrayList arrayList = new java.util.ArrayList(hashSet);
            a(list, arrayList, size, 7);
            java.util.Collections.sort(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(7);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(list.get(((java.lang.Integer) it6.next()).intValue()));
            }
            list = arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (m3.d dVar2 : list) {
            arrayList3.add((java.lang.Float) dVar2.f404625a);
            arrayList4.add((java.lang.Long) dVar2.f404626b);
        }
        this.f175369f = (java.lang.Float[]) arrayList3.toArray(new java.lang.Float[0]);
        this.f175370g = (java.lang.Long[]) arrayList4.toArray(new java.lang.Long[0]);
        invalidate();
    }

    /* renamed from: setMode */
    public void m54224x764d6925(int i17) {
        this.B = i17;
    }

    public C12953xede67e98(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f175369f = new java.lang.Float[]{java.lang.Float.valueOf(70.0f), java.lang.Float.valueOf(100.0f), java.lang.Float.valueOf(95.0f), java.lang.Float.valueOf(88.0f)};
        this.f175370g = new java.lang.Long[]{0L, 0L, 0L, 0L};
        this.f175374n = 10.0f;
        this.f175375o = 10.0f;
        this.f175376p = 20.0f;
        this.f175377q = 20.0f + 20.0f;
        this.f175380t = 120.0f;
        this.f175381u = 6.0f;
        this.f175382v = 12.0f;
        this.f175383w = 1.0f;
        this.f175386z = new java.util.ArrayList();
        this.A = 20.0f;
        this.B = 1;
    }
}
