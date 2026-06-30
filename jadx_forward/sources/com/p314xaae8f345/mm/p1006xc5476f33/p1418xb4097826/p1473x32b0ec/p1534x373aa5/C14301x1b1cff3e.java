package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveAvatarGroupLayout;", "Landroid/widget/FrameLayout;", "", "Lcom/tencent/mm/plugin/finder/live/view/l2;", "options", "Ljz5/f0;", "setClipConfigs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveAvatarGroupLayout */
/* loaded from: classes5.dex */
public final class C14301x1b1cff3e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f197340d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f197341e;

    /* renamed from: f, reason: collision with root package name */
    public final float f197342f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f197343g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14301x1b1cff3e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int saveLayer = canvas.saveLayer(this.f197341e, null);
        q26.h hVar = new q26.h((q26.i) q26.h0.j(q26.h0.o(new n3.r1(this), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.m2.f198003d), q26.c0.f441365d));
        int i17 = 0;
        while (hVar.hasNext()) {
            java.lang.Object next = hVar.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) next;
            float width = imageView.getWidth() / 2.0f;
            canvas.translate(imageView.getLeft(), imageView.getTop());
            java.util.List list = this.f197343g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l2) ((i17 < 0 || i17 > kz5.c0.h(list)) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l2.f197987e : list.get(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l2 l2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l2.f197986d;
            android.graphics.Paint paint = this.f197340d;
            if (l2Var == l2Var2) {
                canvas.drawCircle(width, width, width, paint);
                imageView.draw(canvas);
            } else if (l2Var == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l2.f197987e) {
                float width2 = imageView.getWidth();
                float height = imageView.getHeight();
                float f17 = this.f197342f;
                canvas.drawRoundRect(0.0f, 0.0f, width2, height, f17, f17, paint);
                imageView.draw(canvas);
            }
            canvas.translate(-imageView.getLeft(), -imageView.getTop());
            i17 = i18;
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f197341e.set(0.0f, 0.0f, i17, i18);
    }

    /* renamed from: setClipConfigs */
    public final void m57243xf2273a3f(java.util.List<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.l2> options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        this.f197343g = kz5.n0.x0(options);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14301x1b1cff3e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        this.f197340d = paint;
        this.f197341e = new android.graphics.RectF();
        this.f197342f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context, 2);
        this.f197343g = kz5.p0.f395529d;
    }
}
