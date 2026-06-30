package com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b;

/* renamed from: com.tencent.mm.view.footer.SelectColorBar */
/* loaded from: classes10.dex */
public class C22825xd78e1eec extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f295125d;

    /* renamed from: e, reason: collision with root package name */
    public final float f295126e;

    /* renamed from: f, reason: collision with root package name */
    public final float f295127f;

    /* renamed from: g, reason: collision with root package name */
    public final float f295128g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect[] f295129h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f295130i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f295131m;

    /* renamed from: n, reason: collision with root package name */
    public dn5.f f295132n;

    /* renamed from: o, reason: collision with root package name */
    public final int f295133o;

    /* renamed from: p, reason: collision with root package name */
    public int f295134p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f295135q;

    public C22825xd78e1eec(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f295125d = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561943x5);
        this.f295126e = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561845u9);
        this.f295127f = 5.0f;
        this.f295128g = 6.0f;
        this.f295130i = new int[]{-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092, -7054596, -449092};
        this.f295133o = 0;
        this.f295134p = -1;
        this.f295135q = true;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i25.a.f369619a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f295130i = obtainStyledAttributes.getResources().getIntArray(resourceId);
        }
        this.f295133o = obtainStyledAttributes.getInt(1, 0);
        this.f295126e = obtainStyledAttributes.getDimension(3, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561845u9));
        this.f295125d = obtainStyledAttributes.getDimension(2, getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561943x5));
        this.f295127f = obtainStyledAttributes.getDimension(5, 5.0f);
        this.f295128g = obtainStyledAttributes.getDimension(4, 6.0f);
        obtainStyledAttributes.recycle();
        new android.graphics.Paint(1).setColor(-16711936);
        this.f295129h = new android.graphics.Rect[this.f295130i.length];
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f295131m = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f295131m.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        dn5.f fVar;
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        int i17 = 0;
        if (action == 0) {
            while (true) {
                android.graphics.Rect[] rectArr = this.f295129h;
                if (i17 >= rectArr.length) {
                    break;
                }
                if (rectArr[i17].contains(x17, y17)) {
                    this.f295134p = i17;
                    break;
                }
                i17++;
            }
        } else if (action == 1 || action == 3) {
            while (true) {
                android.graphics.Rect[] rectArr2 = this.f295129h;
                if (rectArr2 == null || i17 >= rectArr2.length) {
                    break;
                }
                if (rectArr2[i17].contains(x17, y17) && i17 == this.f295134p && (fVar = this.f295132n) != null) {
                    fVar.a(this.f295130i[i17]);
                    break;
                }
                i17++;
            }
            requestLayout();
            postInvalidate();
        }
        return true;
    }

    /* renamed from: getCurColor */
    public int m82870x9b946279() {
        int i17 = this.f295134p;
        int[] iArr = this.f295130i;
        return i17 == -1 ? iArr[2] : iArr[i17];
    }

    /* renamed from: getDetailHeight */
    public int m82871x6ce0e74e() {
        return (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561784sk);
    }

    /* renamed from: getPaddingLeftAndRight */
    public int m82872xa209cf27() {
        return (int) (this.f295125d * 2.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            super.onDraw(r17)
            r2 = 0
            r1.drawColor(r2)
            int r3 = r16.getMeasuredWidth()
            int r4 = r16.m82872xa209cf27()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r4 = r0.f295126e
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 * r5
            int[] r7 = r0.f295130i
            int r8 = r7.length
            float r8 = (float) r8
            float r8 = r8 * r6
            float r3 = r3 - r8
            int r8 = r7.length
            r9 = 1
            int r8 = r8 - r9
            float r8 = (float) r8
            float r3 = r3 / r8
            int r8 = r16.m82872xa209cf27()
            r10 = 2
            int r8 = r8 / r10
            float r8 = (float) r8
            float r8 = r8 + r4
            float r11 = r0.f295127f
            float r8 = r8 + r11
            int r12 = r16.m82871x6ce0e74e()
            float r12 = (float) r12
            r13 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r13
            float r12 = r12 / r5
            r5 = r2
        L3b:
            int r13 = r7.length
            if (r5 >= r13) goto L78
            int r13 = r0.f295134p
            r14 = 0
            if (r13 != r5) goto L46
            r0.f295135q = r2
            goto L4c
        L46:
            boolean r13 = r0.f295135q
            if (r13 == 0) goto L4f
            if (r5 != r10) goto L4f
        L4c:
            float r13 = r0.f295128g
            goto L50
        L4f:
            r13 = r14
        L50:
            android.graphics.Paint r15 = r0.f295131m
            r2 = -1
            r15.setColor(r2)
            float r2 = r4 + r11
            float r2 = r2 + r13
            android.graphics.Paint r15 = r0.f295131m
            r1.drawCircle(r8, r12, r2, r15)
            android.graphics.Paint r2 = r0.f295131m
            r15 = r7[r5]
            r2.setColor(r15)
            int r2 = r0.f295133o
            if (r2 != r9) goto L6a
            goto L6b
        L6a:
            r14 = r13
        L6b:
            float r14 = r14 + r4
            android.graphics.Paint r2 = r0.f295131m
            r1.drawCircle(r8, r12, r14, r2)
            float r2 = r6 + r3
            float r8 = r8 + r2
            int r5 = r5 + 1
            r2 = 0
            goto L3b
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        float f17 = this.f295126e;
        int[] iArr = this.f295130i;
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f295133o == 1 ? (int) ((this.f295125d * (iArr.length - 1)) + (f17 * 2.0f * iArr.length) + m82872xa209cf27()) : (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561784sk), 1073741824));
        if (this.f295129h == null) {
            this.f295129h = new android.graphics.Rect[iArr.length];
        }
        float f18 = 2.0f * f17;
        float measuredWidth = ((getMeasuredWidth() - m82872xa209cf27()) - (iArr.length * f18)) / (iArr.length - 1);
        int i19 = (int) f18;
        int m82872xa209cf27 = (int) ((m82872xa209cf27() / 2) + f17 + this.f295127f);
        int m82871x6ce0e74e = m82871x6ce0e74e() / 2;
        for (int i27 = 0; i27 < iArr.length; i27++) {
            this.f295129h[i27] = new android.graphics.Rect(m82872xa209cf27 - i19, m82871x6ce0e74e - i19, m82872xa209cf27 + i19, m82871x6ce0e74e + i19);
            m82872xa209cf27 = (int) (m82872xa209cf27 + f18 + measuredWidth);
        }
    }

    /* renamed from: setItemPadding */
    public void m82873x205907bc(float f17) {
        this.f295125d = f17;
    }

    /* renamed from: setSelectColor */
    public void m82874x7b868205(int i17) {
        int i18 = 0;
        while (true) {
            int[] iArr = this.f295130i;
            if (i18 >= iArr.length) {
                break;
            }
            if (iArr[i18] == i17) {
                this.f295134p = i18;
                break;
            }
            i18++;
        }
        this.f295135q = false;
        postInvalidate();
    }

    /* renamed from: setSelectColorListener */
    public void m82875x8f51d5d9(dn5.f fVar) {
        this.f295132n = fVar;
    }
}
