package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1489xbf29e7f4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveNormalRoomLyricsRenderView;", "Landroid/widget/FrameLayout;", "Lnh2/b;", "Lph2/d;", "", "getCurrentTime", "Lmy5/a;", "getCurrentLyric", "Lnf2/j1;", "alignment", "Ljz5/f0;", "setHorizontalAlignment", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView */
/* loaded from: classes10.dex */
public final class C14199x90952ee3 extends android.widget.FrameLayout implements nh2.b, ph2.d {

    /* renamed from: d, reason: collision with root package name */
    public nf2.f1 f193123d;

    /* renamed from: e, reason: collision with root package name */
    public pf2.b f193124e;

    /* renamed from: f, reason: collision with root package name */
    public my5.a f193125f;

    /* renamed from: g, reason: collision with root package name */
    public nh2.c f193126g;

    /* renamed from: h, reason: collision with root package name */
    public ph2.e f193127h;

    /* renamed from: i, reason: collision with root package name */
    public int f193128i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f193129m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14199x90952ee3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // nh2.b
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "onViewChanged");
    }

    @Override // ph2.d
    public void b() {
        pf2.b bVar;
        try {
            nh2.c cVar = this.f193126g;
            if (cVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderView");
                throw null;
            }
            android.graphics.Canvas mo149601x18d65a63 = ((nh2.j) cVar).mo149601x18d65a63();
            if (mo149601x18d65a63 != null) {
                mo149601x18d65a63.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                int i17 = this.f193128i;
                if (i17 >= 0 && (bVar = this.f193124e) != null) {
                    bVar.a(mo149601x18d65a63, i17, getMeasuredWidth(), getMeasuredHeight());
                }
                nh2.c cVar2 = this.f193126g;
                if (cVar2 != null) {
                    ((nh2.j) cVar2).mo149602x65a3f1bb(mo149601x18d65a63);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderView");
                    throw null;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("NormalRoomLyricsRenderView", th6, "draw error", new java.lang.Object[0]);
        }
    }

    @Override // nh2.b
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "onViewCreated");
        if (this.f193129m) {
            ph2.e eVar = this.f193127h;
            if (eVar != null) {
                eVar.c();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerLooper");
                throw null;
            }
        }
    }

    @Override // nh2.b
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "onViewDestroyed");
        ph2.e eVar = this.f193127h;
        if (eVar != null) {
            ((ph2.c) eVar).a();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerLooper");
            throw null;
        }
    }

    public final void e() {
        int color = getContext().getResources().getColor(this.f193123d.f418252a);
        nf2.l1 l1Var = this.f193123d.f418269r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getContext(), "getContext(...)");
        l1Var.getClass();
        pf2.b bVar = this.f193124e;
        int i17 = l1Var.f418308d;
        if (bVar != null) {
            bVar.c(color, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "applyConfig: normal=" + color + ", highlight=" + i17);
    }

    public final void f(my5.a lyric) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyric, "lyric");
        this.f193125f = lyric;
        pf2.b bVar = this.f193124e;
        if (bVar != null) {
            bVar.b(lyric);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "bindLyrics: size=" + lyric.b());
    }

    public final void g() {
        pf2.b aVar;
        pf2.b bVar = this.f193124e;
        if (bVar != null) {
            bVar.mo158338x41012807();
        }
        int ordinal = this.f193123d.f418266o.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "createRenderer: HORIZONTAL");
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            aVar = new pf2.a(context);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "createRenderer: VERTICAL with rotateCharsPattern=" + this.f193123d.f418267p);
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            aVar = new pf2.c(context2, this.f193123d.f418267p);
        }
        this.f193124e = aVar;
        e();
        my5.a aVar2 = this.f193125f;
        if (aVar2 != null) {
            pf2.b bVar2 = this.f193124e;
            if (bVar2 != null) {
                bVar2.b(aVar2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "createRenderer: re-bind lyrics to new renderer");
        }
    }

    /* renamed from: getCurrentLyric, reason: from getter */
    public final my5.a getF193125f() {
        return this.f193125f;
    }

    /* renamed from: getCurrentTime, reason: from getter */
    public final int getF193128i() {
        return this.f193128i;
    }

    public final void h() {
        if (this.f193129m) {
            return;
        }
        this.f193128i = 0;
        ph2.e eVar = this.f193127h;
        if (eVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerLooper");
            throw null;
        }
        ((ph2.c) eVar).c();
        this.f193129m = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "startRender");
    }

    public final void i() {
        ph2.e eVar = this.f193127h;
        if (eVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("drawerLooper");
            throw null;
        }
        ((ph2.c) eVar).a();
        pf2.b bVar = this.f193124e;
        if (bVar != null) {
            bVar.mo158339x6761d4f();
        }
        this.f193128i = 0;
        this.f193129m = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "stopRender");
    }

    public final void j(nf2.f1 newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        nf2.f1 f1Var = this.f193123d;
        nf2.k1 k1Var = f1Var.f418266o;
        nf2.k1 k1Var2 = newConfig.f418266o;
        boolean z17 = k1Var != k1Var2;
        this.f193123d = newConfig;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "updateConfig: render direction changed from " + f1Var.f418266o + " to " + k1Var2);
            setAlpha(0.0f);
            animate().alpha(1.0f).setDuration(this.f193123d.f418268q).start();
            g();
        } else {
            e();
        }
        invalidate();
    }

    /* renamed from: setHorizontalAlignment */
    public final void m56805xf4623a5d(nf2.j1 alignment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        pf2.b bVar = this.f193124e;
        if (bVar != null) {
            bVar.d(alignment);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14199x90952ee3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193123d = new nf2.f1(0, 0.0f, false, 0L, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, nf2.a.f418181e, nf2.k1.f418300d, null, 0L, null, 237567, null);
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        textureView.setOpaque(false);
        addView(textureView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        nh2.j jVar = new nh2.j(textureView, null);
        this.f193126g = jVar;
        jVar.a(this);
        ph2.c cVar = new ph2.c();
        cVar.f435912d = this;
        this.f193127h = cVar;
        g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NormalRoomLyricsRenderView", "initView completed with config=" + this.f193123d);
    }
}
