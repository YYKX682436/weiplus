package com.tencent.mm.plugin.battery.stats.chart;

/* loaded from: classes5.dex */
public class SimpleLineChart extends android.view.View {
    public static final java.text.DateFormat C = new java.text.SimpleDateFormat("HH:mm", java.util.Locale.US);
    public final float A;
    public int B;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Paint f93834d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f93835e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float[] f93836f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long[] f93837g;

    /* renamed from: h, reason: collision with root package name */
    public float f93838h;

    /* renamed from: i, reason: collision with root package name */
    public float f93839i;

    /* renamed from: m, reason: collision with root package name */
    public float f93840m;

    /* renamed from: n, reason: collision with root package name */
    public final float f93841n;

    /* renamed from: o, reason: collision with root package name */
    public final float f93842o;

    /* renamed from: p, reason: collision with root package name */
    public final float f93843p;

    /* renamed from: q, reason: collision with root package name */
    public final float f93844q;

    /* renamed from: r, reason: collision with root package name */
    public float f93845r;

    /* renamed from: s, reason: collision with root package name */
    public float f93846s;

    /* renamed from: t, reason: collision with root package name */
    public final float f93847t;

    /* renamed from: u, reason: collision with root package name */
    public final float f93848u;

    /* renamed from: v, reason: collision with root package name */
    public final float f93849v;

    /* renamed from: w, reason: collision with root package name */
    public final float f93850w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Path f93851x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Path f93852y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f93853z;

    public SimpleLineChart(android.content.Context context, android.util.AttributeSet attributeSet) {
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
                float floatValue = ((java.lang.Float) ((m3.d) list.get(i19)).f323092a).floatValue() - f17;
                if (java.lang.Math.abs(floatValue) > f18) {
                    i18 = i19;
                    f18 = floatValue;
                }
            }
        }
        list2.add(java.lang.Integer.valueOf(i18));
        a(list, list2, f17, i17);
    }

    private float getMaxData() {
        float f17 = 0.0f;
        for (java.lang.Float f18 : this.f93836f) {
            f17 = java.lang.Math.max(f17, f18.floatValue());
        }
        return f17;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.f93834d = new android.graphics.Paint(1);
        this.f93835e = new android.graphics.Paint(1);
        this.f93851x = new android.graphics.Path();
        this.f93852y = new android.graphics.Path();
        android.graphics.Rect rect = new android.graphics.Rect();
        long longValue = this.f93837g[0].longValue();
        java.text.DateFormat dateFormat = C;
        java.lang.String format = longValue <= 0 ? "NULL" : dateFormat.format(new java.util.Date(longValue));
        this.f93834d.getTextBounds(format, 0, format.length(), rect);
        rect.width();
        this.f93840m = rect.height();
        float f17 = this.f93838h;
        float f18 = this.f93841n;
        this.f93845r = (f17 - (f18 * 2.0f)) / this.f93837g.length;
        float f19 = this.f93839i;
        float f27 = this.f93847t;
        float maxData = ((f19 - f27) - this.f93846s) / getMaxData();
        float f28 = (this.f93845r / 2.0f) + f18;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f93853z;
        arrayList.clear();
        for (java.lang.Float f29 : this.f93836f) {
            arrayList.add(new android.graphics.PointF(f28, (this.f93839i - this.f93846s) - (f29.floatValue() * maxData)));
            f28 += this.f93845r;
        }
        float f37 = (this.f93845r / 2.0f) + f18;
        float f38 = this.f93839i;
        float f39 = this.f93842o;
        float f47 = f38 - f39;
        this.f93834d.setTextSize((int) ((getContext().getResources().getDisplayMetrics().scaledDensity * 13.0f) + 0.5f));
        this.f93834d.setColor(getResources().getColor(com.tencent.mm.R.color.FG_2));
        this.f93834d.setTextAlign(android.graphics.Paint.Align.CENTER);
        java.lang.Long[] lArr = this.f93837g;
        int length = lArr.length;
        int i17 = 0;
        while (i17 < length) {
            float f48 = f27;
            long longValue2 = lArr[i17].longValue();
            canvas.drawText(longValue2 <= 0 ? "NULL" : dateFormat.format(new java.util.Date(longValue2)), f37, f47, this.f93834d);
            f37 += this.f93845r;
            i17++;
            f27 = f48;
        }
        float f49 = f27;
        float f57 = this.f93841n;
        float f58 = this.f93838h - f57;
        float f59 = this.f93839i - this.f93840m;
        float f66 = this.f93844q;
        float f67 = (f59 - f66) - f39;
        this.f93834d.setColor(getResources().getColor(com.tencent.mm.R.color.f478532ac));
        android.graphics.Paint paint = this.f93834d;
        float f68 = this.f93850w;
        paint.setStrokeWidth(f68);
        canvas.drawLine(f57, f67, f58, f67, this.f93834d);
        float f69 = ((this.f93839i - this.f93840m) - f66) - f39;
        float f76 = f69 + this.f93843p;
        if (this.B == 1) {
            float f77 = f18;
            int i18 = 0;
            for (int i19 = 1; i18 < this.f93837g.length + i19; i19 = 1) {
                canvas.drawLine(f77, f69, f77, f76, this.f93834d);
                f77 += this.f93845r;
                i18++;
            }
        }
        float f78 = this.f93839i;
        float f79 = f78 - f69;
        this.f93846s = f79;
        float maxData2 = ((f78 - f49) - f79) / getMaxData();
        this.f93852y.reset();
        this.f93852y.moveTo((this.f93845r / 2.0f) + f18, this.f93839i - this.f93846s);
        for (int i27 = 0; i27 < arrayList.size(); i27++) {
            this.f93852y.lineTo(((android.graphics.PointF) arrayList.get(i27)).x, ((android.graphics.PointF) arrayList.get(i27)).y);
        }
        this.f93852y.lineTo(((android.graphics.PointF) arrayList.get(arrayList.size() - 1)).x, this.f93839i - this.f93846s);
        this.f93852y.close();
        this.f93835e.setStyle(android.graphics.Paint.Style.FILL);
        float f86 = f18 + (this.f93845r / 2.0f);
        this.f93835e.setShader(new android.graphics.LinearGradient(f86, (this.f93839i - this.f93846s) - (getMaxData() * maxData2), f86, (this.f93839i - this.f93846s) - f49, android.graphics.Color.parseColor("#4DFFB59C"), android.graphics.Color.parseColor("#4DFFF5F1"), android.graphics.Shader.TileMode.CLAMP));
        canvas.drawPath(this.f93852y, this.f93835e);
        for (int i28 = 0; i28 < arrayList.size(); i28++) {
            if (this.B == 1) {
                this.f93834d.setColor(getResources().getColor(com.tencent.mm.R.color.Red_170));
                canvas.drawCircle(((android.graphics.PointF) arrayList.get(i28)).x, ((android.graphics.PointF) arrayList.get(i28)).y, this.f93849v, this.f93834d);
            }
            this.f93834d.setColor(getResources().getColor(com.tencent.mm.R.color.f478532ac));
            canvas.drawCircle(((android.graphics.PointF) arrayList.get(i28)).x, ((android.graphics.PointF) arrayList.get(i28)).y, this.f93848u, this.f93834d);
        }
        this.f93851x.reset();
        for (int i29 = 0; i29 < arrayList.size(); i29++) {
            if (i29 == 0) {
                this.f93851x.moveTo(((android.graphics.PointF) arrayList.get(i29)).x, ((android.graphics.PointF) arrayList.get(i29)).y);
            } else {
                this.f93851x.lineTo(((android.graphics.PointF) arrayList.get(i29)).x, ((android.graphics.PointF) arrayList.get(i29)).y);
            }
        }
        this.f93834d.setStyle(android.graphics.Paint.Style.STROKE);
        this.f93834d.setStrokeWidth(f68);
        this.f93834d.setColor(getResources().getColor(com.tencent.mm.R.color.f478532ac));
        canvas.drawPath(this.f93851x, this.f93834d);
        new android.graphics.Rect();
        this.f93834d.setStyle(android.graphics.Paint.Style.FILL);
        this.f93834d.setColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        this.f93834d.setTextAlign(android.graphics.Paint.Align.CENTER);
        for (int i37 = 0; i37 < this.f93836f.length; i37++) {
            float f87 = ((android.graphics.PointF) arrayList.get(i37)).x;
            float f88 = ((android.graphics.PointF) arrayList.get(i37)).y - this.A;
            float floatValue = this.f93836f[i37].floatValue();
            canvas.drawText(floatValue < 0.0f ? "" : ((int) floatValue) + "%", f87, f88, this.f93834d);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f93838h = i17;
        this.f93839i = i18;
    }

    public void setData(java.util.List<m3.d> list) {
        if (list.size() > 7) {
            java.util.Iterator<m3.d> it = list.iterator();
            float f17 = 0.0f;
            while (it.hasNext()) {
                f17 += ((java.lang.Float) it.next().f323092a).floatValue();
            }
            float size = f17 / list.size();
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(0);
            hashSet.add(java.lang.Integer.valueOf(list.size() - 1));
            if (list.isEmpty()) {
                throw new java.lang.IllegalStateException("Input list in empty");
            }
            float floatValue = ((java.lang.Float) list.get(0).f323092a).floatValue();
            float floatValue2 = ((java.lang.Float) list.get(0).f323092a).floatValue();
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 1; i19 < list.size(); i19++) {
                m3.d dVar = list.get(i19);
                float floatValue3 = ((java.lang.Float) dVar.f323092a).floatValue();
                java.lang.Object obj = dVar.f323092a;
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
            arrayList3.add((java.lang.Float) dVar2.f323092a);
            arrayList4.add((java.lang.Long) dVar2.f323093b);
        }
        this.f93836f = (java.lang.Float[]) arrayList3.toArray(new java.lang.Float[0]);
        this.f93837g = (java.lang.Long[]) arrayList4.toArray(new java.lang.Long[0]);
        invalidate();
    }

    public void setMode(int i17) {
        this.B = i17;
    }

    public SimpleLineChart(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f93836f = new java.lang.Float[]{java.lang.Float.valueOf(70.0f), java.lang.Float.valueOf(100.0f), java.lang.Float.valueOf(95.0f), java.lang.Float.valueOf(88.0f)};
        this.f93837g = new java.lang.Long[]{0L, 0L, 0L, 0L};
        this.f93841n = 10.0f;
        this.f93842o = 10.0f;
        this.f93843p = 20.0f;
        this.f93844q = 20.0f + 20.0f;
        this.f93847t = 120.0f;
        this.f93848u = 6.0f;
        this.f93849v = 12.0f;
        this.f93850w = 1.0f;
        this.f93853z = new java.util.ArrayList();
        this.A = 20.0f;
        this.B = 1;
    }
}
