package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.AlphabetScrollBar */
/* loaded from: classes15.dex */
public class C21465x84498b3 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 {
    public int C;
    public android.graphics.drawable.Drawable D;
    public android.graphics.drawable.Drawable E;
    public int F;
    public android.graphics.drawable.Drawable G;
    public android.graphics.drawable.Drawable H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.drawable.Drawable f278756J;
    public android.graphics.drawable.Drawable K;
    public int L;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 M;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 N;

    public C21465x84498b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = -1;
        this.F = 0;
        this.I = 0;
        this.L = 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    public void a(android.graphics.Canvas canvas, float f17, float f18, float f19, android.graphics.Paint paint, int i17) {
        java.lang.String[] strArr = this.f279239f;
        if (i17 < strArr.length && strArr[i17].equals("🔍")) {
            f18 -= 10.0f;
        }
        canvas.drawCircle(f17, f18, f19, paint);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    public void b(android.graphics.Canvas canvas, float f17, float f18, android.graphics.Paint paint, int i17, boolean z17) {
        java.lang.String[] strArr = this.f279239f;
        if (i17 < strArr.length && "🔍".equals(strArr[i17])) {
            if (this.D == null || this.E == null) {
                if (this.C != -1) {
                    android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79899x267f2c0);
                    com.p314xaae8f345.mm.ui.uk.f(drawable, this.C);
                    this.D = drawable;
                } else if (com.p314xaae8f345.mm.ui.bk.C()) {
                    android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79899x267f2c0);
                    com.p314xaae8f345.mm.ui.uk.f(drawable2, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    this.D = drawable2;
                } else {
                    android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79899x267f2c0);
                    com.p314xaae8f345.mm.ui.uk.f(drawable3, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    this.D = drawable3;
                }
                this.F = i65.a.b(getContext(), 13);
                android.graphics.drawable.Drawable drawable4 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79899x267f2c0);
                com.p314xaae8f345.mm.ui.uk.f(drawable4, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                this.E = drawable4;
            }
            if (!z17) {
                android.graphics.drawable.Drawable drawable5 = this.D;
                int i18 = this.F;
                drawable5.setBounds((int) (f17 - (i18 / 2)), (int) ((f18 - (i18 / 2)) - 10.0f), (int) (f17 + (i18 / 2)), (int) ((f18 + (i18 / 2)) - 10.0f));
                this.D.draw(canvas);
                return;
            }
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f279251u);
            canvas.drawCircle(f17, f18 - 10.0f, this.f279252v, paint);
            android.graphics.drawable.Drawable drawable6 = this.E;
            int i19 = this.F;
            drawable6.setBounds((int) (f17 - (i19 / 2)), (int) ((f18 - (i19 / 2)) - 10.0f), (int) (f17 + (i19 / 2)), (int) ((f18 + (i19 / 2)) - 10.0f));
            this.E.draw(canvas);
            return;
        }
        java.lang.String[] strArr2 = this.f279239f;
        if (i17 < strArr2.length && (com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46637xcc18ebaa.equals(strArr2[i17]) || "owner".equals(this.f279239f[i17]))) {
            if (this.G == null || this.H == null) {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    android.graphics.drawable.Drawable drawable7 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80162xfee9d8f0);
                    com.p314xaae8f345.mm.ui.uk.f(drawable7, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                    this.G = drawable7;
                } else {
                    android.graphics.drawable.Drawable drawable8 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80162xfee9d8f0);
                    com.p314xaae8f345.mm.ui.uk.f(drawable8, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    this.G = drawable8;
                }
                this.I = i65.a.b(getContext(), 13);
                android.graphics.drawable.Drawable drawable9 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80162xfee9d8f0);
                com.p314xaae8f345.mm.ui.uk.f(drawable9, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                this.H = drawable9;
            }
            if (!z17) {
                android.graphics.drawable.Drawable drawable10 = this.G;
                int i27 = this.I;
                drawable10.setBounds((int) (f17 - (i27 / 2)), (int) ((f18 - (i27 / 2)) - 10.0f), (int) (f17 + (i27 / 2)), (int) ((f18 + (i27 / 2)) - 10.0f));
                this.G.draw(canvas);
                return;
            }
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(this.f279251u);
            canvas.drawCircle(f17, f18 - 10.0f, this.f279252v, paint);
            android.graphics.drawable.Drawable drawable11 = this.H;
            int i28 = this.I;
            drawable11.setBounds((int) (f17 - (i28 / 2)), (int) ((f18 - (i28 / 2)) - 10.0f), (int) (f17 + (i28 / 2)), (int) ((f18 + (i28 / 2)) - 10.0f));
            this.H.draw(canvas);
            return;
        }
        java.lang.String[] strArr3 = this.f279239f;
        if (i17 >= strArr3.length || !"openIm".equals(strArr3[i17])) {
            super.b(canvas, f17, f18, paint, i17, z17);
            return;
        }
        if (this.f278756J == null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                android.graphics.drawable.Drawable drawable12 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80790xaa663081);
                com.p314xaae8f345.mm.ui.uk.f(drawable12, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                this.f278756J = drawable12;
            } else {
                android.graphics.drawable.Drawable drawable13 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80790xaa663081);
                com.p314xaae8f345.mm.ui.uk.f(drawable13, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                this.f278756J = drawable13;
            }
            android.graphics.drawable.Drawable drawable14 = getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f80790xaa663081);
            com.p314xaae8f345.mm.ui.uk.f(drawable14, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            this.K = drawable14;
            this.L = i65.a.b(getContext(), 13);
        }
        if (!z17) {
            android.graphics.drawable.Drawable drawable15 = this.f278756J;
            int i29 = this.L;
            drawable15.setBounds((int) (f17 - (i29 / 2)), (int) ((f18 - (i29 / 2)) - 10.0f), (int) (f17 + (i29 / 2)), (int) ((f18 + (i29 / 2)) - 10.0f));
            this.f278756J.draw(canvas);
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(this.f279251u);
        canvas.drawCircle(f17, f18 - 10.0f, this.f279252v, paint);
        android.graphics.drawable.Drawable drawable16 = this.K;
        int i37 = this.L;
        drawable16.setBounds((int) (f17 - (i37 / 2)), (int) ((f18 - (i37 / 2)) - 10.0f), (int) (f17 + (i37 / 2)), (int) ((f18 + (i37 / 2)) - 10.0f));
        this.K.draw(canvas);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    public void c() {
        this.f279239f = new java.lang.String[]{"↑", "☆", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "B", "C", "D", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "U", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f, "X", "Y", "Z", "#"};
        this.f279237d = 1.6f;
        this.f279238e = 79;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    public void d(java.lang.String str) {
        if (this.M == null) {
            this.M = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f279256z.findViewById(com.p314xaae8f345.mm.R.id.mvc);
        }
        if (this.N == null) {
            this.N = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f279256z.findViewById(com.p314xaae8f345.mm.R.id.mvn);
        }
        if (str.equals("🔍")) {
            this.M.setImageResource(com.p314xaae8f345.mm.R.raw.f79899x267f2c0);
            this.M.setVisibility(0);
            this.f279246p.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.N;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
                return;
            }
            return;
        }
        if (str.equals(com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46637xcc18ebaa) || str.equals("owner")) {
            this.M.setImageResource(com.p314xaae8f345.mm.R.raw.f80162xfee9d8f0);
            this.M.setVisibility(0);
            this.f279246p.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.N;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(8);
                return;
            }
            return;
        }
        if (str.equals("openIm")) {
            this.M.setVisibility(8);
            this.f279246p.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.N;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.setVisibility(0);
                return;
            }
            return;
        }
        this.f279246p.setVisibility(0);
        this.M.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.N;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setVisibility(8);
        }
        super.d(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    /* renamed from: getToastLayoutId */
    public int mo65174x34508176() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cna;
    }

    /* renamed from: setAlphabet */
    public void m78861xe90b84f5(java.lang.String[] strArr) {
        this.f279239f = strArr;
        this.f279242i = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        this.f279251u = i17;
    }

    /* renamed from: setSearchIconColor */
    public void m78862x5756e8e0(int i17) {
        this.C = i17;
    }

    /* renamed from: setTextColor */
    public void m78863x1c5c5ff4(int i17) {
        this.f279249s = i17;
    }

    /* renamed from: setWhiteTextColor */
    public void m78864xd266550f(int i17) {
        this.f279250t = i17;
    }
}
