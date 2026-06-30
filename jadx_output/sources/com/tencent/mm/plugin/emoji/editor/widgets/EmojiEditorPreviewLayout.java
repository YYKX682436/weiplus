package com.tencent.mm.plugin.emoji.editor.widgets;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\b\u001a\u00020\u0002R(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\r¨\u0006."}, d2 = {"Lcom/tencent/mm/plugin/emoji/editor/widgets/EmojiEditorPreviewLayout;", "Landroid/view/ViewGroup;", "Landroid/graphics/Rect;", "bounds", "Ljz5/f0;", "setFitBounds", "rect", "setVideoClipBounds", "getInvisibleBounds", "<set-?>", "g", "Landroid/graphics/Rect;", "getVideoClipBounds", "()Landroid/graphics/Rect;", "videoClipBounds", "", "h", "F", "getFitBoundsScaleX", "()F", "fitBoundsScaleX", "i", "getFitBoundsScaleY", "fitBoundsScaleY", "m", "getFitBoundsRect", "fitBoundsRect", "Lkotlin/Function0;", "n", "Lyz5/a;", "getOnFitBoundsUpdated", "()Lyz5/a;", "setOnFitBoundsUpdated", "(Lyz5/a;)V", "onFitBoundsUpdated", "o", "getVisibleBounds", "visibleBounds", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class EmojiEditorPreviewLayout extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public float f97479d;

    /* renamed from: e, reason: collision with root package name */
    public float f97480e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Rect f97481f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Rect videoClipBounds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float fitBoundsScaleX;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float fitBoundsScaleY;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public android.graphics.Rect fitBoundsRect;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.a onFitBoundsUpdated;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Rect visibleBounds;

    /* renamed from: p, reason: collision with root package name */
    public int f97488p;

    /* renamed from: q, reason: collision with root package name */
    public int f97489q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmojiEditorPreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorPreviewLayout", "setMediaSize: width=" + i17 + ", height=" + i18 + ", old baseWidth=" + this.f97488p + ", baseHeight=" + this.f97489q);
        this.f97479d = (float) i17;
        this.f97480e = (float) i18;
        this.f97488p = 0;
        this.f97489q = 0;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.videoClipBounds == null) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(this.visibleBounds);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final android.graphics.Rect getFitBoundsRect() {
        return this.fitBoundsRect;
    }

    public final float getFitBoundsScaleX() {
        return this.fitBoundsScaleX;
    }

    public final float getFitBoundsScaleY() {
        return this.fitBoundsScaleY;
    }

    public final android.graphics.Rect getInvisibleBounds() {
        if (getChildCount() <= 0) {
            return new android.graphics.Rect();
        }
        android.view.View childAt = getChildAt(0);
        return new android.graphics.Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
    }

    public final yz5.a getOnFitBoundsUpdated() {
        return this.onFitBoundsUpdated;
    }

    public final android.graphics.Rect getVideoClipBounds() {
        return this.videoClipBounds;
    }

    public final android.graphics.Rect getVisibleBounds() {
        return this.visibleBounds;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        yz5.a aVar;
        e06.k m17 = e06.p.m(0, getChildCount());
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add(getChildAt(((kz5.x0) it).b()));
        }
        for (android.view.View view : arrayList) {
            int paddingTop = i18 + getPaddingTop() + ((int) ((((i27 - i18) - getPaddingTop()) - getPaddingBottom()) * 0.45f));
            int paddingLeft = i17 + getPaddingLeft() + (((i19 - getPaddingRight()) - (i17 + getPaddingLeft())) / 2);
            android.graphics.Rect rect = this.f97481f;
            android.graphics.Rect rect2 = this.visibleBounds;
            if (rect != null) {
                kotlin.jvm.internal.o.d(rect);
                rect2.set(rect);
                float width = this.f97488p == 0 ? 1.0f : rect.width() / this.f97488p;
                float height = this.f97489q != 0 ? rect.height() / this.f97489q : 1.0f;
                view.setScaleX(width);
                view.setScaleY(height);
                int centerX = rect.centerX();
                int centerY = rect.centerY();
                int i28 = this.f97488p;
                int i29 = this.f97489q;
                view.layout(centerX - (i28 / 2), centerY - (i29 / 2), centerX + (i28 / 2), centerY + (i29 / 2));
                float f17 = this.fitBoundsScaleX;
                float f18 = this.fitBoundsScaleY;
                this.fitBoundsScaleX = width;
                this.fitBoundsScaleY = height;
                boolean z18 = !kotlin.jvm.internal.o.b(this.fitBoundsRect, rect);
                android.graphics.Rect rect3 = this.fitBoundsRect;
                if (rect3 == null) {
                    this.fitBoundsRect = new android.graphics.Rect(rect);
                } else if (rect3 != null) {
                    rect3.set(rect);
                }
                if (f17 == width) {
                    if ((f18 == height) && !z18) {
                    }
                }
                yz5.a aVar2 = this.onFitBoundsUpdated;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } else {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                if (this.fitBoundsScaleX == 1.0f) {
                    if ((this.fitBoundsScaleY == 1.0f) && this.fitBoundsRect == null) {
                        r7 = false;
                    }
                }
                this.fitBoundsScaleX = 1.0f;
                this.fitBoundsScaleY = 1.0f;
                this.fitBoundsRect = null;
                if (r7 && (aVar = this.onFitBoundsUpdated) != null) {
                    aVar.invoke();
                }
                android.graphics.Rect rect4 = this.videoClipBounds;
                if (rect4 == null) {
                    rect2.set(paddingLeft - (view.getMeasuredWidth() / 2), paddingTop - (view.getMeasuredHeight() / 2), paddingLeft + (view.getMeasuredWidth() / 2), paddingTop + (view.getMeasuredHeight() / 2));
                    view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
                } else if (this.f97479d > 0.0f && rect4 != null) {
                    float measuredWidth = view.getMeasuredWidth() / this.f97479d;
                    int width2 = ((int) (rect4.width() * measuredWidth)) / 2;
                    int height2 = ((int) (rect4.height() * measuredWidth)) / 2;
                    rect2.set(paddingLeft - width2, paddingTop - height2, width2 + paddingLeft, height2 + paddingTop);
                    int width3 = (int) ((paddingLeft - (rect2.width() / 2.0f)) - (rect4.left * measuredWidth));
                    int height3 = (int) ((paddingTop - (rect2.height() / 2.0f)) - (rect4.top * measuredWidth));
                    view.layout(width3, height3, view.getMeasuredWidth() + width3, view.getMeasuredHeight() + height3);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27;
        super.onMeasure(i17, i18);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        float f17 = this.f97479d;
        if (f17 > 0.0f) {
            float f18 = this.f97480e;
            if (f18 <= 0.0f || measuredWidth <= 0) {
                return;
            }
            if (this.f97488p == 0 || this.f97489q == 0) {
                if (f17 < f18) {
                    this.f97489q = measuredWidth;
                    this.f97488p = (int) (f17 / (f18 / measuredWidth));
                } else {
                    this.f97488p = measuredWidth;
                    this.f97489q = (int) (f18 / (f17 / measuredWidth));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiEditorPreviewLayout", "onMeasure calculate baseSize: baseWidth=" + this.f97488p + ", baseHeight=" + this.f97489q + ", mediaWidth=" + this.f97479d + ", mediaHeight=" + this.f97480e + ", maxSize=" + measuredWidth);
            }
            android.graphics.Rect rect = this.videoClipBounds;
            if (rect != null) {
                kotlin.jvm.internal.o.d(rect);
                if (rect.width() < rect.height()) {
                    measuredWidth = (int) (rect.width() / (rect.height() / measuredWidth));
                }
                float width = measuredWidth / rect.width();
                i19 = (int) (this.f97479d * width);
                i27 = (int) (this.f97480e * width);
            } else {
                i19 = this.f97488p;
                i27 = this.f97489q;
            }
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
            e06.k m17 = e06.p.m(0, getChildCount());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (it.hasNext()) {
                arrayList.add(getChildAt(((kz5.x0) it).b()));
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ((android.view.View) it6.next()).measure(makeMeasureSpec, makeMeasureSpec2);
            }
        }
    }

    public final void setFitBounds(android.graphics.Rect rect) {
        this.f97481f = rect;
        requestLayout();
    }

    public final void setOnFitBoundsUpdated(yz5.a aVar) {
        this.onFitBoundsUpdated = aVar;
    }

    public final void setVideoClipBounds(android.graphics.Rect rect) {
        this.videoClipBounds = rect;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiEditorPreviewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.fitBoundsScaleX = 1.0f;
        this.fitBoundsScaleY = 1.0f;
        this.visibleBounds = new android.graphics.Rect();
    }
}
