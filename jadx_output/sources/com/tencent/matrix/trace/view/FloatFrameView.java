package com.tencent.matrix.trace.view;

/* loaded from: classes15.dex */
public class FloatFrameView extends android.widget.LinearLayout {
    public android.widget.TextView A;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f53028d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.matrix.trace.view.FloatFrameView.LineChartView f53029e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f53030f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f53031g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f53032h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f53033i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f53034m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f53035n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f53036o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f53037p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f53038q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f53039r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f53040s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f53041t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f53042u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f53043v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f53044w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f53045x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f53046y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f53047z;

    public FloatFrameView(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bas, this);
        this.f53028d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gd8);
        this.f53030f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dln);
        this.f53030f.setText("{other info}");
        this.f53031g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.osg);
        this.f53032h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hdm);
        this.f53033i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483055ve);
        this.f53034m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hxa);
        this.f53035n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.d4j);
        this.f53036o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nud);
        this.f53037p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c6c);
        this.f53038q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nss);
        this.f53039r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gte);
        this.f53040s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ohh);
        this.f53041t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ns8);
        this.f53042u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ns7);
        this.f53043v = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ns6);
        this.f53044w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487178ns5);
        this.f53045x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i0x);
        this.f53046y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i0w);
        this.f53047z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i0t);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.i0s);
        this.f53029e = (com.tencent.matrix.trace.view.FloatFrameView.LineChartView) findViewById(com.tencent.mm.R.id.bfl);
    }

    public FloatFrameView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    /* loaded from: classes5.dex */
    public static class LineChartView extends android.view.View {
        public final float A;

        /* renamed from: d, reason: collision with root package name */
        public final android.graphics.Paint f53048d;

        /* renamed from: e, reason: collision with root package name */
        public final android.text.TextPaint f53049e;

        /* renamed from: f, reason: collision with root package name */
        public final android.graphics.Paint f53050f;

        /* renamed from: g, reason: collision with root package name */
        public final android.graphics.Paint f53051g;

        /* renamed from: h, reason: collision with root package name */
        public final java.util.LinkedList f53052h;

        /* renamed from: i, reason: collision with root package name */
        public float f53053i;

        /* renamed from: m, reason: collision with root package name */
        public float f53054m;

        /* renamed from: n, reason: collision with root package name */
        public final android.graphics.Path f53055n;

        /* renamed from: o, reason: collision with root package name */
        public final android.graphics.Path f53056o;

        /* renamed from: p, reason: collision with root package name */
        public final float[] f53057p;

        /* renamed from: q, reason: collision with root package name */
        public final float[] f53058q;

        /* renamed from: r, reason: collision with root package name */
        public final int f53059r;

        /* renamed from: s, reason: collision with root package name */
        public final int f53060s;

        /* renamed from: t, reason: collision with root package name */
        public final int f53061t;

        /* renamed from: u, reason: collision with root package name */
        public final int f53062u;

        /* renamed from: v, reason: collision with root package name */
        public final int f53063v;

        /* renamed from: w, reason: collision with root package name */
        public final int f53064w;

        /* renamed from: x, reason: collision with root package name */
        public final float f53065x;

        /* renamed from: y, reason: collision with root package name */
        public float f53066y;

        /* renamed from: z, reason: collision with root package name */
        public float f53067z;

        public LineChartView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
            this.f53055n = new android.graphics.Path();
            this.f53056o = new android.graphics.Path();
            this.f53057p = new float[2];
            this.f53058q = new float[2];
            this.f53059r = getContext().getResources().getColor(com.tencent.mm.R.color.f479295vb);
            this.f53060s = getContext().getResources().getColor(com.tencent.mm.R.color.f479299vf);
            this.f53061t = getContext().getResources().getColor(com.tencent.mm.R.color.f479298ve);
            this.f53062u = getContext().getResources().getColor(com.tencent.mm.R.color.f479297vd);
            this.f53063v = getContext().getResources().getColor(com.tencent.mm.R.color.f479296vc);
            int color = getContext().getResources().getColor(com.tencent.mm.R.color.f478865jb);
            this.f53064w = color;
            this.f53065x = a(getContext(), 8.0f);
            this.f53048d = new android.graphics.Paint();
            android.text.TextPaint textPaint = new android.text.TextPaint(1);
            this.f53049e = textPaint;
            float a17 = a(getContext(), 8.0f);
            this.A = a17;
            textPaint.setTextSize(a17);
            textPaint.setStrokeWidth(a(getContext(), 1.0f));
            textPaint.setColor(color);
            android.text.TextPaint textPaint2 = new android.text.TextPaint(1);
            this.f53050f = textPaint2;
            textPaint2.setStrokeWidth(a(getContext(), 1.0f));
            textPaint2.setStyle(android.graphics.Paint.Style.STROKE);
            textPaint2.setPathEffect(new android.graphics.DashPathEffect(new float[]{6.0f, 6.0f}, 0.0f));
            android.graphics.Paint paint = new android.graphics.Paint(textPaint);
            this.f53051g = paint;
            paint.setStrokeWidth(a(getContext(), 1.0f));
            paint.setColor(color);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setPathEffect(new android.graphics.DashPathEffect(new float[]{6.0f, 6.0f}, 0.0f));
            this.f53052h = new java.util.LinkedList();
        }

        public static int a(android.content.Context context, float f17) {
            return (int) ((f17 * context.getResources().getDisplayMetrics().density) + 0.5f);
        }

        @Override // android.view.View
        public void draw(android.graphics.Canvas canvas) {
            super.draw(canvas);
            java.util.Iterator it = this.f53052h.iterator();
            char c17 = 0;
            int i17 = 1;
            int i18 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                int i19 = this.f53061t;
                int i27 = this.f53060s;
                int i28 = this.f53064w;
                float f17 = this.A;
                android.text.TextPaint textPaint = this.f53049e;
                if (!hasNext) {
                    textPaint.setColor(i28);
                    android.graphics.Paint paint = this.f53050f;
                    paint.setColor(i27);
                    canvas.drawPath(this.f53055n, paint);
                    float[] fArr = this.f53057p;
                    canvas.drawText("50", fArr[0] - (f17 / 2.0f), fArr[1] + f17, textPaint);
                    paint.setColor(i19);
                    canvas.drawPath(this.f53056o, paint);
                    float[] fArr2 = this.f53058q;
                    canvas.drawText(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, fArr2[0] - (f17 / 2.0f), fArr2[1] + f17, textPaint);
                    return;
                }
                com.tencent.matrix.trace.view.a aVar = (com.tencent.matrix.trace.view.a) it.next();
                int i29 = i18 + aVar.f53069b;
                com.tencent.matrix.trace.view.FloatFrameView.LineChartView lineChartView = aVar.f53071d;
                int color = lineChartView.f53048d.getColor();
                android.graphics.Paint paint2 = lineChartView.f53048d;
                int i37 = aVar.f53070c;
                if (color != i37) {
                    paint2.setColor(i37);
                }
                int i38 = i17 + 1;
                float f18 = i38 * lineChartView.f53053i;
                float[] fArr3 = aVar.f53068a;
                fArr3[1] = f18;
                fArr3[3] = f18;
                canvas.drawLine(fArr3[c17], f18, fArr3[2], f18, paint2);
                if (i17 % 25 == 0) {
                    android.graphics.Path path = new android.graphics.Path();
                    float f19 = fArr3[1];
                    path.moveTo(0.0f, f19);
                    path.lineTo(getMeasuredHeight(), f19);
                    canvas.drawPath(path, this.f53051g);
                    textPaint.setColor(i28);
                    canvas.drawText((i17 / 5) + "s", 0.0f, f19 + f17, textPaint);
                    if (i17 > 0) {
                        int i39 = i29 / i17;
                        if (i39 > 57) {
                            i19 = this.f53059r;
                        } else if (i39 > 51) {
                            i19 = i27;
                        } else if (i39 <= 36) {
                            i19 = i39 > 18 ? this.f53062u : this.f53063v;
                        }
                        textPaint.setColor(i19);
                        canvas.drawText(i39 + "FPS", 0.0f, f19 - (f17 / 2.0f), textPaint);
                    }
                }
                i17 = i38;
                i18 = i29;
                c17 = 0;
            }
        }

        @Override // android.view.View
        public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
            super.onLayout(z17, i17, i18, i19, i27);
            if (z17) {
                this.f53066y = getMeasuredWidth();
                getMeasuredHeight();
                float f17 = this.f53066y;
                float f18 = this.f53065x;
                this.f53067z = f17 - (3.0f * f18);
                float a17 = a(getContext(), 1.0f);
                this.f53054m = a17;
                this.f53048d.setStrokeWidth(a17);
                float f19 = this.f53054m * 2.0f;
                this.f53053i = f19;
                float f27 = this.f53067z;
                float f28 = f27 / 60.0f;
                float f29 = (10.0f * f28) + (this.f53066y - f27);
                float[] fArr = this.f53057p;
                fArr[0] = f29;
                float f37 = (f19 * 50.0f) + f18;
                fArr[1] = f37;
                android.graphics.Path path = this.f53055n;
                path.moveTo(f29, f37);
                path.lineTo(fArr[0], 0.0f);
                float f38 = (f28 * 30.0f) + (this.f53066y - this.f53067z);
                float[] fArr2 = this.f53058q;
                fArr2[0] = f38;
                float f39 = (this.f53053i * 50.0f) + f18;
                fArr2[1] = f39;
                android.graphics.Path path2 = this.f53056o;
                path2.moveTo(f38, f39);
                path2.lineTo(fArr2[0], 0.0f);
            }
        }

        public LineChartView(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }
    }
}
