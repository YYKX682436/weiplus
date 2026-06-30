package com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0004\b0\u00101B\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00102J\"\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/tencent/mm/videocomposition/play/VideoCompositionPlayView;", "Landroid/view/TextureView;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlin/Function2;", "", "Ljz5/f0;", "onSizeChanged", "setOnSizeChangedListener", "Lvm5/a;", "callback", "setPlayerCallback", "Lvm5/c;", "profileCallback", "setPlayerProfileCallback", "", "loop", "setLoop", "", "getPosition", "getLaggingTime", "Lvm5/g;", "d", "Lvm5/g;", "getPlayer", "()Lvm5/g;", "setPlayer", "(Lvm5/g;)V", "player", "Lrm5/v;", "i", "Lrm5/v;", "getComposition", "()Lrm5/v;", "setComposition", "(Lrm5/v;)V", "composition", "q", "Z", "getFirstFrame", "()Z", "setFirstFrame", "(Z)V", "firstFrame", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "composer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.videocomposition.play.VideoCompositionPlayView */
/* loaded from: classes10.dex */
public class TextureViewSurfaceTextureListenerC22778x581fb68 extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public vm5.g player;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f294818e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.SurfaceTexture f294819f;

    /* renamed from: g, reason: collision with root package name */
    public int f294820g;

    /* renamed from: h, reason: collision with root package name */
    public int f294821h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public rm5.v composition;

    /* renamed from: m, reason: collision with root package name */
    public boolean f294823m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f294824n;

    /* renamed from: o, reason: collision with root package name */
    public vm5.a f294825o;

    /* renamed from: p, reason: collision with root package name */
    public vm5.c f294826p;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean firstFrame;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC22778x581fb68(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f294824n = true;
        this.firstFrame = true;
        setSurfaceTextureListener(this);
        xm5.b.c("VideoCompositionPlayView", "create VLogCompositionPlayView", new java.lang.Object[0]);
    }

    public void c() {
        vm5.g gVar;
        if (this.composition == null || this.f294819f == null) {
            return;
        }
        xm5.b.c("VideoCompositionPlayView", "do createPlayer, composition:" + this.composition, new java.lang.Object[0]);
        rm5.v vVar = this.composition;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVar);
        vm5.g gVar2 = new vm5.g(vVar);
        this.player = gVar2;
        android.graphics.SurfaceTexture surfaceTexture = this.f294819f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surfaceTexture);
        int i17 = this.f294820g;
        int i18 = this.f294821h;
        gVar2.f519695f = i17;
        gVar2.f519696g = i18;
        xm5.b.c("VideoCompositionPlayer", "createPlayerLayerBySurfaceTexture: " + surfaceTexture + ", size:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
        new com.p314xaae8f345.tav.p2967xc53e9ae1.C25845x838a96d0(surfaceTexture, i17, i18).m98176x1d8af1e3(gVar2.f519691b);
        xm5.b.c("VideoCompositionPlayer", "setSurfaceTexture: " + surfaceTexture + ", width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        vm5.g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.b(this.f294824n);
        }
        vm5.a aVar = this.f294825o;
        if (aVar != null && (gVar = this.player) != null) {
            gVar.f519694e = aVar;
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.mo98042x2ccf87b7(new vm5.d(gVar));
            }
        }
        vm5.g gVar4 = this.player;
        if (gVar4 != null) {
            gVar4.f519699j = this.f294826p;
        }
    }

    public final void e() {
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "refreshSurface isStarted:" + gVar.f519697h, new java.lang.Object[0]);
            if (gVar.f519697h) {
                return;
            }
            android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.m98076x31091552(null);
            }
        }
    }

    public final void f(boolean z17) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701;
        vm5.g gVar = this.player;
        if (gVar == null || (c25839x8ea38701 = gVar.f519691b) == null) {
            return;
        }
        c25839x8ea38701.mo98043x27f73e1c(z17 ? 0.0f : 1.0f);
    }

    public final void g() {
        xm5.b.c("VideoCompositionPlayView", "release", new java.lang.Object[0]);
        this.f294823m = false;
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "release", new java.lang.Object[0]);
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.mo98036x41012807();
            }
            gVar.f519691b = null;
            gVar.f519697h = false;
        }
    }

    public final rm5.v getComposition() {
        return this.composition;
    }

    public final boolean getFirstFrame() {
        return this.firstFrame;
    }

    /* renamed from: getLaggingTime */
    public final long m82507x213de1e4() {
        vm5.g gVar = this.player;
        if (gVar != null) {
            return gVar.f519693d.m98117x213de1e4();
        }
        return 0L;
    }

    public final vm5.g getPlayer() {
        return this.player;
    }

    /* renamed from: getPosition */
    public final long m82509xa86cd69f() {
        vm5.g gVar = this.player;
        if (gVar != null) {
            return gVar.a();
        }
        return 0L;
    }

    public final void h() {
        xm5.b.c("VideoCompositionPlayView", "resume", new java.lang.Object[0]);
        this.f294823m = true;
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.c();
        }
    }

    /* renamed from: isPlaying */
    public final boolean m82510xc00617a4() {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701;
        vm5.g gVar = this.player;
        if (gVar == null || (c25839x8ea38701 = gVar.f519691b) == null) {
            return false;
        }
        return c25839x8ea38701.mo98032xc00617a4();
    }

    public final void j(long j17) {
        xm5.b.c("VideoCompositionPlayView", "seekTo:" + j17, new java.lang.Object[0]);
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "seekTo:" + j17 + ", isUpdatingComposition:" + gVar.f519698i, new java.lang.Object[0]);
            if (gVar.f519698i) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.mo98038xe9aa2080(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(j17, 1000), new vm5.f(currentTimeMillis, j17, gVar));
            }
        }
    }

    public final void k(long j17, long j18) {
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701;
        vm5.g gVar = this.player;
        if (gVar == null || (c25839x8ea38701 = gVar.f519691b) == null) {
            return;
        }
        c25839x8ea38701.mo98041xeb18d027(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(j17, 1000), new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(j18 - j17, 1000)));
    }

    public void o(rm5.v composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        xm5.b.e("VideoCompositionPlayView", hashCode() + " start, surface:" + this.f294819f + ", player:" + this.player + ", surfaceWidth:" + this.f294820g + ", surfaceHeight:" + this.f294821h + ", composition:" + composition.hashCode(), new java.lang.Object[0]);
        if (this.player != null && this.f294819f != null && this.f294820g > 0 && this.f294821h > 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(composition, this.composition)) {
            xm5.b.c("VideoCompositionPlayView", "startWithUpdateComposition", new java.lang.Object[0]);
            vm5.g gVar = this.player;
            if (gVar != null) {
                gVar.d(composition, true, false, -1L);
            }
            this.composition = composition;
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(composition, this.composition)) {
            if (this.f294819f == null) {
                xm5.b.c("VideoCompositionPlayView", "same composition but surface is null", new java.lang.Object[0]);
                this.f294823m = true;
                return;
            }
            xm5.b.c("VideoCompositionPlayView", "same composition directly start", new java.lang.Object[0]);
            this.f294823m = true;
            vm5.g gVar2 = this.player;
            if (gVar2 != null) {
                gVar2.d(composition, true, false, -1L);
                return;
            }
            return;
        }
        this.composition = composition;
        if (this.f294819f != null && this.f294820g > 0 && this.f294821h > 0) {
            c();
        }
        this.f294823m = true;
        vm5.g gVar3 = this.player;
        if (gVar3 != null) {
            gVar3.c();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        vm5.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        xm5.b.c("VideoCompositionPlayView", "surfaceAvailable, surfaceTexture:" + getSurfaceTexture() + ", width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        this.f294819f = surface;
        this.f294820g = i17;
        this.f294821h = i18;
        if (this.composition != null) {
            c();
            if (!this.f294823m || (gVar = this.player) == null) {
                return;
            }
            gVar.c();
        }
    }

    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        xm5.b.c("VideoCompositionPlayView", "surfaceDestroy", new java.lang.Object[0]);
        surface.release();
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "release", new java.lang.Object[0]);
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.mo98036x41012807();
            }
            gVar.f519691b = null;
            gVar.f519697h = false;
        }
        this.f294820g = 0;
        this.f294821h = 0;
        this.f294819f = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        xm5.b.c("VideoCompositionPlayView", "surfaceSizeChanged, surfaceTexture:" + getSurfaceTexture() + ", width:" + i17 + ", height:" + i18, new java.lang.Object[0]);
        this.f294820g = i17;
        this.f294821h = i18;
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "updateDisplaySize:[" + i17 + ", " + i18 + ']', new java.lang.Object[0]);
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.m98091x7b31bc8f(i17, i18);
            }
        }
        yz5.p pVar = this.f294818e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        if (this.firstFrame && this.f294823m) {
            xm5.b.c("VideoCompositionPlayView", "onSurfaceTextureUpdated", new java.lang.Object[0]);
            vm5.a aVar = this.f294825o;
            if (aVar != null) {
                aVar.x();
            }
            this.firstFrame = false;
        }
        vm5.a aVar2 = this.f294825o;
        vm5.b bVar = aVar2 instanceof vm5.b ? (vm5.b) aVar2 : null;
        if (bVar != null) {
            bVar.r();
        }
    }

    /* renamed from: pause */
    public boolean mo58788x65825f6() {
        xm5.b.c("VideoCompositionPlayView", "pause", new java.lang.Object[0]);
        this.f294823m = false;
        vm5.g gVar = this.player;
        if (gVar == null) {
            return true;
        }
        xm5.b.c("VideoCompositionPlayer", "pause", new java.lang.Object[0]);
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
        if (c25839x8ea38701 != null) {
            c25839x8ea38701.mo98033x65825f6();
        }
        gVar.f519697h = false;
        return true;
    }

    public void q(rm5.v composition, boolean z17, boolean z18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        xm5.b.c("VideoCompositionPlayView", "updateComposition, playAfterUpdate:" + z17 + ", seekToOriginPosition:" + z18 + ", seekTo:" + j17, new java.lang.Object[0]);
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.d(composition, z17, z18, j17);
        }
        this.composition = composition;
    }

    /* renamed from: setComposition */
    public final void m82511x3e3ac3e8(rm5.v vVar) {
        this.composition = vVar;
    }

    /* renamed from: setFirstFrame */
    public final void m82512x116e1a9f(boolean z17) {
        this.firstFrame = z17;
    }

    /* renamed from: setLoop */
    public final void m82513x764cf626(boolean z17) {
        xm5.b.c("VideoCompositionPlayView", "setLoop:" + z17, new java.lang.Object[0]);
        this.f294824n = z17;
        vm5.g gVar = this.player;
        if (gVar == null) {
            this.f294824n = z17;
        } else if (gVar != null) {
            gVar.b(z17);
        }
    }

    /* renamed from: setOnSizeChangedListener */
    public final void m82514x138029a6(yz5.p pVar) {
        this.f294818e = pVar;
    }

    /* renamed from: setPlayer */
    public final void m82515x1d8af1e3(vm5.g gVar) {
        this.player = gVar;
    }

    /* renamed from: setPlayerCallback */
    public final void m82516xd24ee348(vm5.a aVar) {
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.f519694e = aVar;
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.mo98042x2ccf87b7(new vm5.d(gVar));
            }
        }
        this.f294825o = aVar;
    }

    /* renamed from: setPlayerProfileCallback */
    public final void m82517xf1b8b8ab(vm5.c cVar) {
        this.f294826p = cVar;
        vm5.g gVar = this.player;
        if (gVar != null) {
            gVar.f519699j = cVar;
        }
    }

    /* renamed from: stop */
    public void mo58801x360802() {
        xm5.b.c("VideoCompositionPlayView", "stop", new java.lang.Object[0]);
        this.f294823m = false;
        this.firstFrame = true;
        vm5.g gVar = this.player;
        if (gVar != null) {
            xm5.b.c("VideoCompositionPlayer", "stop", new java.lang.Object[0]);
            com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = gVar.f519691b;
            if (c25839x8ea38701 != null) {
                c25839x8ea38701.mo98044x360802();
            }
            gVar.f519697h = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC22778x581fb68(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f294824n = true;
        this.firstFrame = true;
        setSurfaceTextureListener(this);
        xm5.b.c("VideoCompositionPlayView", "create VLogCompositionPlayView", new java.lang.Object[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextureViewSurfaceTextureListenerC22778x581fb68(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f294824n = true;
        this.firstFrame = true;
        setSurfaceTextureListener(this);
        xm5.b.c("VideoCompositionPlayView", "create VLogCompositionPlayView", new java.lang.Object[0]);
    }
}
