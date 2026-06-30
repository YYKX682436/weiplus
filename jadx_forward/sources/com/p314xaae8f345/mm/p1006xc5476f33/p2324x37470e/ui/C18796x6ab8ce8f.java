package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/SliderTrackView;", "Landroid/view/View;", "", "pointCount", "Ljz5/f0;", "setPointCount", ya.b.f77479x42930b2, "setSelection", "color", "setTrackColor", "", "lineWidth", "setTrackLineWidth", "offset", "setStartOffset", "Landroid/graphics/drawable/Drawable;", "drawable", "setThumbDrawable", "", "getTrackPoint", "Lyo4/b;", "z", "Lyo4/b;", "getCallback", "()Lyo4/b;", "setCallback", "(Lyo4/b;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.SliderTrackView */
/* loaded from: classes10.dex */
public final class C18796x6ab8ce8f extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f257422d;

    /* renamed from: e, reason: collision with root package name */
    public final int f257423e;

    /* renamed from: f, reason: collision with root package name */
    public float f257424f;

    /* renamed from: g, reason: collision with root package name */
    public float f257425g;

    /* renamed from: h, reason: collision with root package name */
    public float f257426h;

    /* renamed from: i, reason: collision with root package name */
    public float f257427i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f257428m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f257429n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f257430o;

    /* renamed from: p, reason: collision with root package name */
    public int f257431p;

    /* renamed from: q, reason: collision with root package name */
    public int f257432q;

    /* renamed from: r, reason: collision with root package name */
    public final int f257433r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f257434s;

    /* renamed from: t, reason: collision with root package name */
    public int f257435t;

    /* renamed from: u, reason: collision with root package name */
    public float f257436u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f257437v;

    /* renamed from: w, reason: collision with root package name */
    public int f257438w;

    /* renamed from: x, reason: collision with root package name */
    public int f257439x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.drawable.Drawable f257440y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yo4.b callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18796x6ab8ce8f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f257422d = "MicroMsg.LabelSlider";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f257430o = paint;
        this.f257431p = 5;
        this.f257432q = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        this.f257433r = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f257434s = new java.util.LinkedList();
        this.f257437v = new android.graphics.Rect();
        this.f257438w = 48;
        this.f257439x = 48;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(-855638017);
        paint.setStrokeWidth(i65.a.g(context));
        this.f257423e = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a() {
        float f17 = this.f257436u;
        float f18 = this.f257439x / 2;
        android.graphics.Rect rect = this.f257437v;
        rect.top = (int) (f17 - f18);
        rect.bottom = (int) (f17 + f18);
        float f19 = ((android.graphics.PointF) this.f257434s.get(this.f257435t)).x;
        float f27 = this.f257438w / 2;
        rect.left = (int) (f19 - f27);
        rect.right = (int) (f19 + f27);
    }

    public final void b() {
        int width = getWidth();
        int i17 = this.f257432q;
        int i18 = (width - (i17 * 2)) / (this.f257431p - 1);
        float f17 = i17;
        float height = getHeight() / 2.0f;
        java.util.LinkedList linkedList = this.f257434s;
        linkedList.clear();
        linkedList.add(new android.graphics.PointF(f17, height));
        int i19 = this.f257431p - 1;
        for (int i27 = 0; i27 < i19; i27++) {
            linkedList.add(new android.graphics.PointF((i18 * i27) + f17 + i18, height));
        }
        this.f257436u = height;
        a();
        postInvalidate();
    }

    public final yo4.b getCallback() {
        return this.callback;
    }

    /* renamed from: getTrackPoint */
    public final java.util.List<java.lang.Float> m72548x328e42fb() {
        java.util.LinkedList linkedList = this.f257434s;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(((android.graphics.PointF) it.next()).x));
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        java.util.LinkedList linkedList = this.f257434s;
        if (linkedList.size() < 2) {
            return;
        }
        float height = getHeight() / 2.0f;
        int i17 = this.f257433r;
        float f17 = height - (i17 / 2);
        float f18 = (i17 / 2) + height;
        int i18 = 0;
        float f19 = ((android.graphics.PointF) linkedList.get(0)).x;
        float f27 = ((android.graphics.PointF) linkedList.get(0)).x;
        android.graphics.Paint paint = this.f257430o;
        canvas.drawLine(f19, f17, f27, f18, paint);
        int i19 = this.f257431p - 1;
        while (i18 < i19) {
            float f28 = ((android.graphics.PointF) linkedList.get(i18)).x;
            i18++;
            canvas.drawLine(f28, height, ((android.graphics.PointF) linkedList.get(i18)).x, height, paint);
            canvas.drawLine(((android.graphics.PointF) linkedList.get(i18)).x, f17, ((android.graphics.PointF) linkedList.get(i18)).x, f18, paint);
        }
        android.graphics.drawable.Drawable drawable = this.f257440y;
        if (drawable != null) {
            drawable.setBounds(this.f257437v);
        }
        android.graphics.drawable.Drawable drawable2 = this.f257440y;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0 != 3) goto L49;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18796x6ab8ce8f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setCallback */
    public final void m72549x6c4ebec7(yo4.b bVar) {
        this.callback = bVar;
    }

    /* renamed from: setPointCount */
    public final void m72550x66520b61(int i17) {
        if (i17 < 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f257422d, "invalid pointCount " + i17);
            return;
        }
        this.f257431p = i17;
        b();
        if (this.f257435t >= i17) {
            int i18 = i17 - 1;
            this.f257435t = i18;
            yo4.b bVar = this.callback;
            if (bVar != null) {
                bVar.a(i18);
            }
        }
    }

    /* renamed from: setSelection */
    public final void m72551xf579a34a(int i17) {
        this.f257435t = i17;
        a();
        invalidate();
    }

    /* renamed from: setStartOffset */
    public final void m72552xf9627dd3(int i17) {
        this.f257432q = i17;
        b();
    }

    /* renamed from: setThumbDrawable */
    public final void m72553x28548352(android.graphics.drawable.Drawable drawable) {
        this.f257440y = drawable;
        this.f257438w = drawable != null ? drawable.getIntrinsicWidth() : 0;
        android.graphics.drawable.Drawable drawable2 = this.f257440y;
        this.f257439x = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
    }

    /* renamed from: setTrackColor */
    public final void m72554x5ffb6ada(int i17) {
        this.f257430o.setColor(i17);
        postInvalidate();
    }

    /* renamed from: setTrackLineWidth */
    public final void m72555xeac80e29(float f17) {
        this.f257430o.setStrokeWidth(f17);
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18796x6ab8ce8f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
