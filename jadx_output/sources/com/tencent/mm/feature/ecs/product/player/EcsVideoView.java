package com.tencent.mm.feature.ecs.product.player;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001.B%\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B\u0019\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010-J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R6\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/player/EcsVideoView;", "Landroid/widget/FrameLayout;", "", "Lo20/w;", "Lo20/v;", "Lo20/c0;", "player", "Ljz5/f0;", "setPlayer", "Lq20/k;", "reportTask", "setEcsPlayerReportTask", "Landroid/graphics/Bitmap;", "getBitmap", "Landroid/widget/ImageView;", "e", "Ljz5/g;", "getThumbnailImg", "()Landroid/widget/ImageView;", "thumbnailImg", "Lkotlin/Function2;", "", "f", "Lyz5/p;", "getOnThumbnailBitmapLoad", "()Lyz5/p;", "setOnThumbnailBitmapLoad", "(Lyz5/p;)V", "onThumbnailBitmapLoad", "", "n", "Z", "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "autoPlay", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "o20/y", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class EcsVideoView extends android.widget.FrameLayout implements o20.w, o20.v {

    /* renamed from: d, reason: collision with root package name */
    public final pk4.b f65933d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g thumbnailImg;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.p onThumbnailBitmapLoad;

    /* renamed from: g, reason: collision with root package name */
    public volatile android.graphics.SurfaceTexture f65936g;

    /* renamed from: h, reason: collision with root package name */
    public volatile android.view.Surface f65937h;

    /* renamed from: i, reason: collision with root package name */
    public o20.c0 f65938i;

    /* renamed from: m, reason: collision with root package name */
    public q20.k f65939m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean autoPlay;

    /* renamed from: o, reason: collision with root package name */
    public final o20.a0 f65941o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        df0.t tVar = (df0.t) i95.n0.c(df0.t.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((cf0.c0) tVar).getClass();
        com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView mMThumbPlayerTextureView = new com.tencent.mm.plugin.thumbplayer.view.MMThumbPlayerTextureView(context2);
        this.f65933d = mMThumbPlayerTextureView;
        this.thumbnailImg = jz5.h.b(new o20.b0(context, attributeSet, i17));
        this.autoPlay = true;
        this.f65941o = new o20.a0(this);
        mMThumbPlayerTextureView.setOpaqueInfo(true);
        mMThumbPlayerTextureView.setTextureListenerCallback(new o20.y(this));
        mMThumbPlayerTextureView.setScaleType(0);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(mMThumbPlayerTextureView, layoutParams);
        getThumbnailImg().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        addView(getThumbnailImg(), layoutParams2);
        getThumbnailImg().setVisibility(0);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "ecs_video_view");
        aVar.Ai(this, new o20.x(this));
        aVar.Tj(this, 160, 12, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.ImageView getThumbnailImg() {
        return (android.widget.ImageView) ((jz5.n) this.thumbnailImg).getValue();
    }

    public void b(java.lang.String imgUrl) {
        kotlin.jvm.internal.o.g(imgUrl, "imgUrl");
        android.widget.ImageView thumbnailImg = getThumbnailImg();
        kotlin.jvm.internal.o.g(thumbnailImg, "<this>");
        q00.f fVar = new q00.f();
        bw5.c7 c7Var = new bw5.c7();
        c7Var.d(imgUrl);
        fVar.f359251a = c7Var;
        fVar.f359252b = thumbnailImg;
        fVar.b(new o20.z(this, imgUrl));
        fVar.a();
    }

    public void c() {
        o20.c0 c0Var = this.f65938i;
        if (c0Var != null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((o20.i) c0Var).f342387f;
            if (copyOnWriteArrayList.contains(this)) {
                copyOnWriteArrayList.remove(this);
            }
        }
        o20.c0 c0Var2 = this.f65938i;
        if (c0Var2 != null) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = ((o20.i) c0Var2).f342386e;
            if (copyOnWriteArrayList2.contains(this)) {
                copyOnWriteArrayList2.remove(this);
            }
        }
        o20.c0 c0Var3 = this.f65938i;
        if (c0Var3 != null) {
            ((o20.i) c0Var3).c(this.f65941o);
        }
        ((com.tencent.mm.plugin.thumbplayer.view.MMTextureView) this.f65933d).h();
        android.view.Surface surface = this.f65937h;
        if (surface != null) {
            surface.release();
        }
        this.f65937h = null;
        this.f65936g = null;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public android.graphics.Bitmap getBitmap() {
        return ((android.view.TextureView) this.f65933d).getBitmap();
    }

    public yz5.p getOnThumbnailBitmapLoad() {
        return this.onThumbnailBitmapLoad;
    }

    public final void setAutoPlay(boolean z17) {
        this.autoPlay = z17;
    }

    public void setEcsPlayerReportTask(q20.k reportTask) {
        kotlin.jvm.internal.o.g(reportTask, "reportTask");
        this.f65939m = reportTask;
    }

    public void setOnThumbnailBitmapLoad(yz5.p pVar) {
        this.onThumbnailBitmapLoad = pVar;
    }

    public void setPlayer(o20.c0 player) {
        kotlin.jvm.internal.o.g(player, "player");
        android.view.Surface surface = this.f65937h;
        if (surface != null) {
            kk4.b.h(((o20.i) player).f342382a, surface, false, 2, null);
        }
        this.f65938i = player;
        o20.i iVar = (o20.i) player;
        iVar.f342386e.add(this);
        iVar.f342387f.add(this);
        o20.a0 listener = this.f65941o;
        kotlin.jvm.internal.o.g(listener, "listener");
        iVar.f342385d.add(listener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsVideoView(android.content.Context context, android.util.AttributeSet attrs) {
        this(context, attrs, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
