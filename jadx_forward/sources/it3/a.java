package it3;

/* loaded from: classes10.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c {

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f376080t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.p f376081u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f376082v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getLocalCropRectModel */
    public final r45.bb4 m139853x8d8bdf40() {
        vh3.b renderView = getRenderView();
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 c16526x1c450e56 = renderView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) renderView : null;
        if (c16526x1c450e56 == null) {
            return null;
        }
        android.graphics.Matrix transform = c16526x1c450e56.getTransform(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(transform, "getTransform(...)");
        vh3.b renderView2 = getRenderView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(renderView2, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
        float width = ((com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) renderView2).getWidth();
        vh3.b renderView3 = getRenderView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(renderView3, "null cannot be cast to non-null type com.tencent.mm.plugin.mmplayer.render.MMTextureViewRender");
        float height = ((com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16526x1c450e56) renderView3).getHeight();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
        transform.mapRect(rectF);
        r45.bb4 bb4Var = new r45.bb4();
        bb4Var.set(0, java.lang.Float.valueOf(java.lang.Math.abs(rectF.top) / rectF.height()));
        bb4Var.set(1, java.lang.Float.valueOf(java.lang.Math.abs(rectF.left) / rectF.width()));
        bb4Var.set(2, java.lang.Float.valueOf(width / rectF.width()));
        bb4Var.set(3, java.lang.Float.valueOf(height / rectF.height()));
        return bb4Var;
    }

    /* renamed from: getOnPreparedListener */
    public final yz5.l m139854xc6ac4606() {
        return this.f376082v;
    }

    /* renamed from: getOnProgressChange */
    public final yz5.p m139855x4995bb72() {
        return this.f376081u;
    }

    /* renamed from: getOnVideoSizeChange */
    public final yz5.p m139856xace6c557() {
        return this.f376080t;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void k(rh3.o mp6, rh3.s mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        super.k(mp6, mediaInfo);
        yz5.l lVar = this.f376082v;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(mp6.mo162434x37a7fa50()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void l(rh3.o mp6, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mp6, "mp");
        yz5.p pVar = this.f376081u;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c
    public void n(int i17, int i18) {
        yz5.p pVar = this.f376080t;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    /* renamed from: setOnPreparedListener */
    public final void m139857x5dd7c812(yz5.l lVar) {
        this.f376082v = lVar;
    }

    /* renamed from: setOnProgressChange */
    public final void m139858xed92507e(yz5.p pVar) {
        this.f376081u = pVar;
    }

    /* renamed from: setOnVideoSizeChange */
    public final void m139859x887cd1cb(yz5.p pVar) {
        this.f376080t = pVar;
    }

    public final void u(long j17, long j18) {
        java.lang.Object m17 = m66744x2a55bdd7().m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type com.tencent.thumbplayer.tplayer.TPPlayer");
        ((com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d) m17).mo100948xfd27780d(true, j17, j18);
    }
}
