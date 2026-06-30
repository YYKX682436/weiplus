package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p737xc53e9ae1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001.B%\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u0019\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010-J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R6\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/player/EcsVideoView;", "Landroid/widget/FrameLayout;", "", "Lo20/w;", "Lo20/v;", "Lo20/c0;", "player", "Ljz5/f0;", "setPlayer", "Lq20/k;", "reportTask", "setEcsPlayerReportTask", "Landroid/graphics/Bitmap;", "getBitmap", "Landroid/widget/ImageView;", "e", "Ljz5/g;", "getThumbnailImg", "()Landroid/widget/ImageView;", "thumbnailImg", "Lkotlin/Function2;", "", "f", "Lyz5/p;", "getOnThumbnailBitmapLoad", "()Lyz5/p;", "setOnThumbnailBitmapLoad", "(Lyz5/p;)V", "onThumbnailBitmapLoad", "", "n", "Z", "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "autoPlay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "o20/y", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.product.player.EcsVideoView */
/* loaded from: classes14.dex */
public final class C10556x2b36b1cb extends android.widget.FrameLayout implements o20.w, o20.v {

    /* renamed from: d, reason: collision with root package name */
    public final pk4.b f147466d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g thumbnailImg;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.p onThumbnailBitmapLoad;

    /* renamed from: g, reason: collision with root package name */
    public volatile android.graphics.SurfaceTexture f147469g;

    /* renamed from: h, reason: collision with root package name */
    public volatile android.view.Surface f147470h;

    /* renamed from: i, reason: collision with root package name */
    public o20.c0 f147471i;

    /* renamed from: m, reason: collision with root package name */
    public q20.k f147472m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean autoPlay;

    /* renamed from: o, reason: collision with root package name */
    public final o20.a0 f147474o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10556x2b36b1cb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((cf0.c0) tVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749 c18693x84c11749 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749(context2);
        this.f147466d = c18693x84c11749;
        this.thumbnailImg = jz5.h.b(new o20.b0(context, attributeSet, i17));
        this.autoPlay = true;
        this.f147474o = new o20.a0(this);
        c18693x84c11749.mo71998x6978ea71(true);
        c18693x84c11749.mo72000x90002592(new o20.y(this));
        c18693x84c11749.mo71999xebd28962(0);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(c18693x84c11749, layoutParams);
        m44391x4baea9ad().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(m44391x4baea9ad(), layoutParams2);
        m44391x4baea9ad().setVisibility(0);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "ecs_video_view");
        aVar.Ai(this, new o20.x(this));
        aVar.Tj(this, 160, 12, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getThumbnailImg */
    public final android.widget.ImageView m44391x4baea9ad() {
        return (android.widget.ImageView) ((jz5.n) this.thumbnailImg).mo141623x754a37bb();
    }

    public void b(java.lang.String imgUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgUrl, "imgUrl");
        android.widget.ImageView m44391x4baea9ad = m44391x4baea9ad();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m44391x4baea9ad, "<this>");
        q00.f fVar = new q00.f();
        bw5.c7 c7Var = new bw5.c7();
        c7Var.d(imgUrl);
        fVar.f440784a = c7Var;
        fVar.f440785b = m44391x4baea9ad;
        fVar.b(new o20.z(this, imgUrl));
        fVar.a();
    }

    public void c() {
        o20.c0 c0Var = this.f147471i;
        if (c0Var != null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((o20.i) c0Var).f423920f;
            if (copyOnWriteArrayList.contains(this)) {
                copyOnWriteArrayList.remove(this);
            }
        }
        o20.c0 c0Var2 = this.f147471i;
        if (c0Var2 != null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = ((o20.i) c0Var2).f423919e;
            if (copyOnWriteArrayList2.contains(this)) {
                copyOnWriteArrayList2.remove(this);
            }
        }
        o20.c0 c0Var3 = this.f147471i;
        if (c0Var3 != null) {
            ((o20.i) c0Var3).c(this.f147474o);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18692xd171d8a0) this.f147466d).h();
        android.view.Surface surface = this.f147470h;
        if (surface != null) {
            surface.release();
        }
        this.f147470h = null;
        this.f147469g = null;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    /* renamed from: getBitmap */
    public android.graphics.Bitmap m44393x12501425() {
        return ((android.view.TextureView) this.f147466d).getBitmap();
    }

    public yz5.p getOnThumbnailBitmapLoad() {
        return this.onThumbnailBitmapLoad;
    }

    /* renamed from: setAutoPlay */
    public final void m44395xcc520c05(boolean z17) {
        this.autoPlay = z17;
    }

    /* renamed from: setEcsPlayerReportTask */
    public void m44396x361f48d(q20.k reportTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportTask, "reportTask");
        this.f147472m = reportTask;
    }

    /* renamed from: setOnThumbnailBitmapLoad */
    public void m44397xf3b2cd20(yz5.p pVar) {
        this.onThumbnailBitmapLoad = pVar;
    }

    /* renamed from: setPlayer */
    public void m44398x1d8af1e3(o20.c0 player) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        android.view.Surface surface = this.f147470h;
        if (surface != null) {
            kk4.b.h(((o20.i) player).f423915a, surface, false, 2, null);
        }
        this.f147471i = player;
        o20.i iVar = (o20.i) player;
        iVar.f423919e.add(this);
        iVar.f423920f.add(this);
        o20.a0 listener = this.f147474o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        iVar.f423918d.add(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10556x2b36b1cb(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
