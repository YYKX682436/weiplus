package it3;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        super(4);
        this.f376099d = activityC16983x775783e2;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.MotionEvent e27 = (android.view.MotionEvent) obj2;
        float floatValue = ((java.lang.Number) obj3).floatValue();
        float floatValue2 = ((java.lang.Number) obj4).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e27, "e2");
        it3.a aVar = this.f376099d.f237151m;
        if (aVar != null) {
            float f17 = -floatValue;
            float f18 = -floatValue2;
            vh3.b renderView = aVar.getRenderView();
            com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 c16526x1c450e56 = renderView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) renderView : null;
            if (c16526x1c450e56 != null) {
                android.graphics.Matrix transform = c16526x1c450e56.getTransform(null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(transform, "getTransform(...)");
                vh3.b renderView2 = aVar.getRenderView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(renderView2, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
                float width = ((com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) renderView2).getWidth();
                vh3.b renderView3 = aVar.getRenderView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(renderView3, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
                float height = ((com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) renderView3).getHeight();
                android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
                transform.mapRect(rectF);
                float f19 = rectF.left;
                if (f19 + f17 > 0.0f) {
                    f17 = -f19;
                } else {
                    float f27 = rectF.right;
                    if (f27 + f17 < width) {
                        f17 = width - f27;
                    }
                }
                float f28 = rectF.top;
                if (f28 + f18 > 0.0f) {
                    f18 = -f28;
                } else {
                    float f29 = rectF.bottom;
                    if (f29 + f18 < height) {
                        f18 = height - f29;
                    }
                }
                transform.postTranslate(f17, f18);
                c16526x1c450e56.setTransform(transform);
            }
        }
        return jz5.f0.f384359a;
    }
}
