package com.tencent.mm.plugin.finder.convert.comment;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0004()*+B%\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010$\u001a\u00020\u0016¢\u0006\u0004\b%\u0010&B\u001d\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b%\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lcom/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView;", "Lcom/tencent/mm/ui/tools/MMGestureGallery;", "Lcom/tencent/mm/ui/tools/s5;", "singleClickOverListener", "Ljz5/f0;", "setSingleClickOverListener", "Lcom/tencent/mm/ui/tools/p5;", "longClickOverListener", "setLongClickOverListener", "Landroid/widget/AdapterView$OnItemSelectedListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemSelectedListener", "Lcom/tencent/mm/ui/tools/o5;", "setGalleryScaleListener", "Lgd2/n;", "p1", "Lgd2/n;", "getMenuData", "()Lgd2/n;", "setMenuData", "(Lgd2/n;)V", "menuData", "", "getBitmapWidth", "()I", "bitmapWidth", "getBitmapHeight", "bitmapHeight", "", "getLocalImagePath", "()Ljava/lang/String;", "localImagePath", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rb2/d1", "rb2/e1", "rb2/f1", "rb2/g1", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class FinderCommentImageGalleryView extends com.tencent.mm.ui.tools.MMGestureGallery {
    public com.tencent.mm.ui.tools.o5 A1;
    public float B1;
    public float C1;
    public boolean D1;
    public final rb2.g1 E1;
    public final rb2.f1 F1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f103078l1;

    /* renamed from: p1, reason: collision with root package name and from kotlin metadata */
    public gd2.n menuData;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f103080x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.tencent.mm.ui.tools.s5 f103081x1;

    /* renamed from: y0, reason: collision with root package name */
    public rb2.d1 f103082y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.ui.tools.p5 f103083y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f103084z1;

    public FinderCommentImageGalleryView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f103083y1 = new rb2.m1(this);
        this.E1 = new rb2.g1();
        this.F1 = new rb2.f1();
        e();
    }

    @Override // com.tencent.mm.ui.tools.MMGestureGallery, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.B1 = motionEvent.getX();
            this.C1 = motionEvent.getY();
            this.D1 = false;
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f103080x0) {
                com.tencent.mm.ui.tools.s5 s5Var = this.f103081x1;
                if (s5Var != null) {
                    s5Var.a();
                }
                this.f103080x0 = false;
            }
            if (java.lang.Math.abs(this.B1 - motionEvent.getX()) < 10.0f && java.lang.Math.abs(this.C1 - motionEvent.getY()) < 10.0f) {
                this.D1 = true;
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
            super.dispatchTouchEvent(obtain);
            obtain.recycle();
            return dispatchTouchEvent;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        this.f103082y0 = new rb2.d1(this, null, false, 3, null);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter((android.widget.SpinnerAdapter) this.f103082y0);
        setSelection(0);
        super.setSingleClickOverListener(new rb2.e1(this));
        super.setLongClickOverListener(new rb2.h1(this));
        super.setGalleryScaleListener(new rb2.i1(this));
        super.setOnItemSelectedListener(new rb2.j1(this));
    }

    public final void f(java.lang.String str, boolean z17) {
        this.f103078l1 = false;
        rb2.d1 d1Var = this.f103082y0;
        if (d1Var != null) {
            d1Var.a(null);
            d1Var.f393607f = null;
            d1Var.f393606e = str;
        }
        rb2.d1 d1Var2 = this.f103082y0;
        if (d1Var2 != null) {
            d1Var2.f393605d = z17;
        }
        if (d1Var2 != null) {
            d1Var2.notifyDataSetChanged();
        }
    }

    public final int getBitmapHeight() {
        android.graphics.Bitmap bitmap;
        rb2.d1 d1Var = this.f103082y0;
        if (d1Var == null || (bitmap = d1Var.f393607f) == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public final int getBitmapWidth() {
        android.graphics.Bitmap bitmap;
        rb2.d1 d1Var = this.f103082y0;
        if (d1Var == null || (bitmap = d1Var.f393607f) == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public final java.lang.String getLocalImagePath() {
        rb2.d1 d1Var = this.f103082y0;
        if (d1Var != null) {
            return d1Var.f393608g;
        }
        return null;
    }

    public final gd2.n getMenuData() {
        return this.menuData;
    }

    @Override // com.tencent.mm.ui.tools.MMGestureGallery
    public void setGalleryScaleListener(com.tencent.mm.ui.tools.o5 o5Var) {
        this.A1 = o5Var;
    }

    @Override // com.tencent.mm.ui.tools.MMGestureGallery
    public void setLongClickOverListener(com.tencent.mm.ui.tools.p5 p5Var) {
        this.f103083y1 = p5Var;
    }

    public final void setMenuData(gd2.n nVar) {
        this.menuData = nVar;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f103084z1 = onItemSelectedListener;
    }

    @Override // com.tencent.mm.ui.tools.MMGestureGallery
    public void setSingleClickOverListener(com.tencent.mm.ui.tools.s5 s5Var) {
        this.f103081x1 = s5Var;
    }

    public FinderCommentImageGalleryView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f103083y1 = new rb2.m1(this);
        this.E1 = new rb2.g1();
        this.F1 = new rb2.f1();
        e();
    }
}
