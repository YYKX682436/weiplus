package rc3;

/* loaded from: classes7.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f475569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f475570h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f475571i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rc3.w0 w0Var, int i17, int i18, int i19, int i27, int i28) {
        super(0);
        this.f475566d = w0Var;
        this.f475567e = i17;
        this.f475568f = i18;
        this.f475569g = i19;
        this.f475570h = i27;
        this.f475571i = i28;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f475566d.f475638z, "canvas view create " + this.f475567e + ' ' + this.f475568f + ' ' + this.f475569g + ' ' + this.f475570h + ' ' + this.f475571i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475566d.f475624i;
        jc3.r rVar = c16416x87606a7b != null ? c16416x87606a7b.f229362s : null;
        jc3.p pVar = c16416x87606a7b != null ? c16416x87606a7b.f229363t : null;
        if (rVar != null) {
            cf3.d dVar = new cf3.d(rVar);
            this.f475566d.f475629q.put(java.lang.Integer.valueOf(this.f475567e), dVar);
            rc3.w0 eventConsumer = this.f475566d;
            int i17 = this.f475567e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventConsumer, "eventConsumer");
            dVar.f122459k = eventConsumer;
            dVar.f122458j = i17;
            dVar.f122450b.post(new cf3.c(dVar, i17));
        } else if (pVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewCreated canvasId: " + this.f475567e + " stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            int i18 = this.f475567e;
            rc3.w0 consumer = this.f475566d;
            fh1.r0 r0Var = (fh1.r0) pVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumer, "consumer");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "setCanvasEventConsumer canvasId:" + i18 + " consumer:" + consumer);
            synchronized (r0Var) {
                fh1.x0.P = consumer;
            }
            fh1.x0.I.a();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26(this.f475566d.f475619d, null);
            this.f475566d.f475628p.put(java.lang.Integer.valueOf(this.f475567e), textureViewSurfaceTextureListenerC16468xc9008a26);
            rc3.w0 eventConsumer2 = this.f475566d;
            int i19 = this.f475567e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventConsumer2, "eventConsumer");
            textureViewSurfaceTextureListenerC16468xc9008a26.f229722i = eventConsumer2;
            textureViewSurfaceTextureListenerC16468xc9008a26.f229720g = i19;
            rc3.w0 w0Var = this.f475566d;
            w0Var.S(new rc3.m(w0Var, this.f475567e, textureViewSurfaceTextureListenerC16468xc9008a26));
        }
        return jz5.f0.f384359a;
    }
}
