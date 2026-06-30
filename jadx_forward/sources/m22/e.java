package m22;

/* loaded from: classes4.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f404569d;

    /* renamed from: e, reason: collision with root package name */
    public final int f404570e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f404571f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f404572g;

    /* renamed from: h, reason: collision with root package name */
    public final float f404573h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f404574i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f404575m;

    /* renamed from: n, reason: collision with root package name */
    public final int f404576n;

    public e(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f404569d = recyclerView;
        this.f404570e = i17;
        this.f404571f = z17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f404572g = paint;
        float a17 = ym5.x.a(recyclerView.getContext(), 2.0f);
        this.f404573h = a17;
        this.f404576n = ym5.x.a(recyclerView.getContext(), 4.0f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(a17);
        paint.setPathEffect(new android.graphics.DashPathEffect(new float[]{a17, a17}, 1.0f));
        paint.setColor(b3.l.m9702x7444d5ad(recyclerView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        int u07 = parent.u0(view);
        int i17 = this.f404570e;
        int i18 = u07 % i17;
        boolean z17 = this.f404571f;
        int i19 = this.f404576n;
        if (z17) {
            outRect.left = i19 - ((i18 * i19) / i17);
            outRect.right = ((i18 + 1) * i19) / i17;
            if (u07 < i17) {
                outRect.top = i19;
            }
            outRect.bottom = i19;
            return;
        }
        outRect.left = (i18 * i19) / i17;
        outRect.right = i19 - (((i18 + 1) * i19) / i17);
        if (u07 >= i17) {
            outRect.top = i19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r4 == (r5.mo1894x7e414b06() - 1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r6 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r12.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r4 % r5) < (r5 - 1)) goto L23;
     */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDrawOver */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo7903x73cebf37(android.graphics.Canvas r10, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 r11, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 r12) {
        /*
            r9 = this;
            java.lang.String r0 = "canvas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "parent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "state"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            boolean r12 = r9.f404574i
            if (r12 != 0) goto L16
            return
        L16:
            r12 = 13
            float r12 = (float) r12
            float r0 = r9.f404573h
            float r0 = r0 * r12
            int r12 = r11.getChildCount()
            r1 = 0
            e06.k r12 = e06.p.m(r1, r12)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
        L2e:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L45
            r3 = r12
            kz5.x0 r3 = (kz5.x0) r3
            int r3 = r3.b()
            android.view.View r3 = r11.getChildAt(r3)
            if (r3 == 0) goto L2e
            r2.add(r3)
            goto L2e
        L45:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r2 = r2.iterator()
        L4e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L81
            java.lang.Object r3 = r2.next()
            r4 = r3
            android.view.View r4 = (android.view.View) r4
            int r4 = r11.u0(r4)
            boolean r5 = r9.f404575m
            r6 = 1
            if (r5 != 0) goto L73
            androidx.recyclerview.widget.f2 r5 = r11.mo7946xf939df19()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)
            int r5 = r5.mo1894x7e414b06()
            int r5 = r5 - r6
            if (r4 != r5) goto L73
            goto L7a
        L73:
            int r5 = r9.f404570e
            int r4 = r4 % r5
            int r5 = r5 - r6
            if (r4 >= r5) goto L7a
            goto L7b
        L7a:
            r6 = r1
        L7b:
            if (r6 == 0) goto L4e
            r12.add(r3)
            goto L4e
        L81:
            java.util.Iterator r11 = r12.iterator()
        L85:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r11.next()
            android.view.View r12 = (android.view.View) r12
            int r1 = r12.getRight()
            float r1 = (float) r1
            int r2 = r9.f404576n
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r6 = r1 + r2
            int r1 = r12.getBottom()
            int r12 = r12.getHeight()
            r2 = 2
            int r12 = r12 / r2
            int r1 = r1 - r12
            float r12 = (float) r1
            float r1 = (float) r2
            float r1 = r0 / r1
            float r5 = r12 - r1
            float r7 = r5 + r0
            android.graphics.Paint r8 = r9.f404572g
            r3 = r10
            r4 = r6
            r3.drawLine(r4, r5, r6, r7, r8)
            goto L85
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m22.e.mo7903x73cebf37(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.h3):void");
    }
}
