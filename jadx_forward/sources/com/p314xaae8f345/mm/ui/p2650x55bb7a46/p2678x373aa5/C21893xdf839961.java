package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\n¢\u0006\u0004\b,\u0010-R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006."}, d2 = {"Lcom/tencent/mm/ui/chatting/view/BubbleCornorLayout;", "Landroid/widget/RelativeLayout;", "", "d", "Ljava/lang/String;", "getBUBBLE_ORIENTATION", "()Ljava/lang/String;", "setBUBBLE_ORIENTATION", "(Ljava/lang/String;)V", "BUBBLE_ORIENTATION", "", "e", "I", "getBUBBLE_RADIUS", "()I", "setBUBBLE_RADIUS", "(I)V", "BUBBLE_RADIUS", "f", "getBUBBLE_OFFSET", "setBUBBLE_OFFSET", "BUBBLE_OFFSET", "g", "getCORNER_RADIUS", "setCORNER_RADIUS", "CORNER_RADIUS", "h", "getEXTRA_PADDING", "setEXTRA_PADDING", "EXTRA_PADDING", "Landroid/graphics/Path;", "i", "Landroid/graphics/Path;", "getMFinalPath", "()Landroid/graphics/Path;", "mFinalPath", "m", "getMBubbleCornerPath", "mBubbleCornerPath", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.view.BubbleCornorLayout */
/* loaded from: classes5.dex */
public final class C21893xdf839961 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public java.lang.String BUBBLE_ORIENTATION;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int BUBBLE_RADIUS;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int BUBBLE_OFFSET;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int CORNER_RADIUS;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int EXTRA_PADDING;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Path mFinalPath;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Path mBubbleCornerPath;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21893xdf839961(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final android.graphics.Matrix a(float f17, float f18) {
        int i17 = this.BUBBLE_OFFSET;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        java.lang.String str = this.BUBBLE_ORIENTATION;
        float f19 = 0.0f;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 3317767) {
                if (hashCode == 3387192) {
                    str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc);
                } else if (hashCode == 108511772 && str.equals("right")) {
                    f19 = i17 - 1;
                    matrix.postRotate(180.0f);
                }
            } else if (str.equals("left")) {
                matrix.postRotate(0.0f);
                f19 = i17;
                f17 = 0.0f;
            }
            matrix.postTranslate(f17, f19);
            return matrix;
        }
        f17 = 0.0f;
        matrix.postTranslate(f17, f19);
        return matrix;
    }

    public final int getBUBBLE_OFFSET() {
        return this.BUBBLE_OFFSET;
    }

    public final java.lang.String getBUBBLE_ORIENTATION() {
        return this.BUBBLE_ORIENTATION;
    }

    public final int getBUBBLE_RADIUS() {
        return this.BUBBLE_RADIUS;
    }

    public final int getCORNER_RADIUS() {
        return this.CORNER_RADIUS;
    }

    public final int getEXTRA_PADDING() {
        return this.EXTRA_PADDING;
    }

    public final android.graphics.Path getMBubbleCornerPath() {
        return this.mBubbleCornerPath;
    }

    public final android.graphics.Path getMFinalPath() {
        return this.mFinalPath;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Path path = this.mFinalPath;
        path.rewind();
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        java.lang.String str = this.BUBBLE_ORIENTATION;
        if (str != null) {
            int hashCode = str.hashCode();
            android.graphics.Path path2 = this.mBubbleCornerPath;
            if (hashCode != 3317767) {
                if (hashCode != 3387192) {
                    if (hashCode == 108511772 && str.equals("right")) {
                        path.addPath(path2, a(width, height));
                        android.graphics.RectF rectF = new android.graphics.RectF(this.EXTRA_PADDING, -1.0f, (width - this.BUBBLE_RADIUS) + 1, height);
                        int i17 = this.CORNER_RADIUS;
                        path.addRoundRect(rectF, i17, i17, android.graphics.Path.Direction.CW);
                    }
                } else if (str.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc)) {
                    android.graphics.RectF rectF2 = new android.graphics.RectF(this.EXTRA_PADDING, 0.0f, width + 3, height);
                    int i18 = this.CORNER_RADIUS;
                    path.addRoundRect(rectF2, i18, i18, android.graphics.Path.Direction.CW);
                }
            } else if (str.equals("left")) {
                path.addPath(path2, a(width, height));
                android.graphics.RectF rectF3 = new android.graphics.RectF(this.BUBBLE_RADIUS, 0.0f, width - this.EXTRA_PADDING, height);
                int i19 = this.CORNER_RADIUS;
                path.addRoundRect(rectF3, i19, i19, android.graphics.Path.Direction.CW);
            }
        }
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    /* renamed from: setBUBBLE_OFFSET */
    public final void m79847xba7c2a84(int i17) {
        this.BUBBLE_OFFSET = i17;
    }

    /* renamed from: setBUBBLE_ORIENTATION */
    public final void m79848x618f465f(java.lang.String str) {
        this.BUBBLE_ORIENTATION = str;
    }

    /* renamed from: setBUBBLE_RADIUS */
    public final void m79849xbf533283(int i17) {
        this.BUBBLE_RADIUS = i17;
    }

    /* renamed from: setCORNER_RADIUS */
    public final void m79850x79f9109a(int i17) {
        this.CORNER_RADIUS = i17;
    }

    /* renamed from: setEXTRA_PADDING */
    public final void m79851x56350d80(int i17) {
        this.EXTRA_PADDING = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:5:0x004d, B:7:0x0056, B:12:0x0062, B:13:0x0064), top: B:4:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C21893xdf839961(android.content.Context r5, android.util.AttributeSet r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            r4.<init>(r5, r6, r7)
            java.lang.String r7 = "none"
            r4.BUBBLE_ORIENTATION = r7
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r1 = 4
            int r0 = i65.a.b(r0, r1)
            r4.BUBBLE_RADIUS = r0
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r2 = 15
            int r0 = i65.a.b(r0, r2)
            r4.BUBBLE_OFFSET = r0
            android.content.Context r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            int r0 = i65.a.b(r0, r1)
            r4.CORNER_RADIUS = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.mFinalPath = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r4.mBubbleCornerPath = r0
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r4.setLayoutParams(r2)
            r2 = 1
            if (r6 == 0) goto L8e
            int[] r3 = rj.t.f477691h
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r3)
            java.lang.String r6 = "obtainStyledAttributes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            r6 = 3
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L89
            r4.BUBBLE_ORIENTATION = r6     // Catch: java.lang.Throwable -> L89
            r3 = 0
            if (r6 == 0) goto L5f
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L5d
            goto L5f
        L5d:
            r6 = r3
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 == 0) goto L64
            r4.BUBBLE_ORIENTATION = r7     // Catch: java.lang.Throwable -> L89
        L64:
            int r6 = r4.BUBBLE_RADIUS     // Catch: java.lang.Throwable -> L89
            int r6 = r5.getDimensionPixelSize(r1, r6)     // Catch: java.lang.Throwable -> L89
            r4.BUBBLE_RADIUS = r6     // Catch: java.lang.Throwable -> L89
            int r6 = r4.BUBBLE_OFFSET     // Catch: java.lang.Throwable -> L89
            r7 = 2
            int r6 = r5.getDimensionPixelSize(r7, r6)     // Catch: java.lang.Throwable -> L89
            r4.BUBBLE_OFFSET = r6     // Catch: java.lang.Throwable -> L89
            int r6 = r4.CORNER_RADIUS     // Catch: java.lang.Throwable -> L89
            int r6 = r5.getDimensionPixelSize(r3, r6)     // Catch: java.lang.Throwable -> L89
            r4.CORNER_RADIUS = r6     // Catch: java.lang.Throwable -> L89
            int r6 = r4.EXTRA_PADDING     // Catch: java.lang.Throwable -> L89
            int r6 = r5.getDimensionPixelSize(r2, r6)     // Catch: java.lang.Throwable -> L89
            r4.EXTRA_PADDING = r6     // Catch: java.lang.Throwable -> L89
            r5.recycle()
            goto L8e
        L89:
            r6 = move-exception
            r5.recycle()
            throw r6
        L8e:
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = 0
            r0.moveTo(r5, r6)
            int r5 = r4.BUBBLE_RADIUS
            float r5 = (float) r5
            float r6 = -r5
            float r7 = (float) r2
            float r6 = r6 - r7
            r0.lineTo(r5, r6)
            int r5 = r4.BUBBLE_RADIUS
            float r5 = (float) r5
            float r7 = r7 + r5
            r0.lineTo(r5, r7)
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21893xdf839961.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
