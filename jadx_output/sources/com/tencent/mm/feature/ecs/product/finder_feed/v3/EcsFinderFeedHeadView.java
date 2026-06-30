package com.tencent.mm.feature.ecs.product.finder_feed.v3;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010.\u001a\u00020-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u001b\u0010\b\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0013\u0010,\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b+\u0010\u0007¨\u00065"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedHeadView;", "Landroid/widget/FrameLayout;", "Ll20/p0;", "Lcom/tencent/mm/feature/ecs/product/player/EcsVideoView;", "d", "Ljz5/g;", "getVideoView", "()Lcom/tencent/mm/feature/ecs/product/player/EcsVideoView;", "videoView", "Landroid/widget/ImageView;", "e", "getImgView", "()Landroid/widget/ImageView;", "imgView", "Ll20/m0;", "g", "getVideoReportTask", "()Ll20/m0;", "videoReportTask", "Lbw5/if;", "h", "Lbw5/if;", "getData", "()Lbw5/if;", "setData", "(Lbw5/if;)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lem/e0;", "i", "Lem/e0;", "getVb", "()Lem/e0;", "setVb", "(Lem/e0;)V", "vb", "Ll20/o0;", "m", "Ll20/o0;", "getCallback", "()Ll20/o0;", "setCallback", "(Ll20/o0;)V", "callback", "getSafeVideoVew", "safeVideoVew", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsFinderFeedHeadView extends android.widget.FrameLayout implements l20.p0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g imgView;

    /* renamed from: f, reason: collision with root package name */
    public o20.c0 f65917f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoReportTask;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public bw5.Cif data;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public em.e0 vb;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public l20.o0 callback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedHeadView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final void d(com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView ecsFinderFeedHeadView, java.lang.String str, android.graphics.Bitmap bitmap) {
        em.e0 e0Var = ecsFinderFeedHeadView.vb;
        if (e0Var == null || bitmap == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            e0Var.a().setImageBitmap(bitmap);
        } else {
            e0Var.a().setBackgroundColor(i65.a.d(ecsFinderFeedHeadView.getContext(), com.tencent.mm.R.color.aay));
        }
        r00.g.a(str, r00.b.f367997d, bitmap, new n20.f(e0Var));
    }

    private final l20.m0 getVideoReportTask() {
        return (l20.m0) ((jz5.n) this.videoReportTask).getValue();
    }

    @Override // k20.h
    public void b() {
        com.tencent.mars.xlog.Log.i("EcsFinderFeedHeadView", "onRecycle");
        o20.c0 c0Var = this.f65917f;
        if (c0Var != null) {
            ((o20.i) c0Var).b();
        }
        com.tencent.mm.feature.ecs.product.player.EcsVideoView safeVideoVew = getSafeVideoVew();
        if (safeVideoVew != null) {
            safeVideoVew.c();
        }
    }

    @Override // l20.p0
    public void c(bw5.qf _data) {
        java.util.LinkedList linkedList;
        bw5.kf kfVar;
        em.e0 e0Var;
        kotlin.jvm.internal.o.g(_data, "_data");
        bw5.Cif d17 = _data.d();
        this.data = d17;
        if (d17 == null || (linkedList = d17.f28566d) == null || (kfVar = (bw5.kf) kz5.n0.a0(linkedList, 0)) == null || (e0Var = this.vb) == null) {
            return;
        }
        e0Var.b().setBackground(null);
        e0Var.c().setBackground(null);
        if (kfVar.f29362d == 2) {
            com.tencent.mm.feature.ecs.product.player.EcsVideoView view = getVideoView();
            kotlin.jvm.internal.o.g(view, "view");
            removeAllViews();
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            addView(view);
            if (this.f65917f == null) {
                o20.i iVar = new o20.i();
                ((kk4.v) iVar.f342382a).A(true);
                l20.m0 task = getVideoReportTask();
                kotlin.jvm.internal.o.g(task, "task");
                q20.j jVar = (q20.j) iVar.f342383b;
                jVar.getClass();
                jVar.f359799a.add(task);
                this.f65917f = iVar;
            }
            o20.c0 c0Var = this.f65917f;
            if (c0Var != null) {
                getVideoView().setOnThumbnailBitmapLoad(new n20.d(this));
                getVideoView().setPlayer(c0Var);
                getVideoView().setEcsPlayerReportTask(getVideoReportTask());
                bw5.w9 d18 = kfVar.d();
                kotlin.jvm.internal.o.f(d18, "getVideo(...)");
                o20.i iVar2 = (o20.i) c0Var;
                iVar2.d(d18);
                kk4.b.a(iVar2.f342382a, null, 1, null);
            }
        } else {
            android.widget.ImageView view2 = getImgView();
            kotlin.jvm.internal.o.g(view2, "view");
            removeAllViews();
            view2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            addView(view2);
            if (this.vb != null) {
                android.widget.ImageView imgView = getImgView();
                java.lang.String b17 = kfVar.c().b();
                kotlin.jvm.internal.o.f(b17, "getImgUrl(...)");
                kotlin.jvm.internal.o.g(imgView, "<this>");
                q00.f fVar = new q00.f();
                bw5.c7 c7Var = new bw5.c7();
                c7Var.d(b17);
                fVar.f359251a = c7Var;
                fVar.f359252b = imgView;
                fVar.b(new n20.c(this, kfVar));
                fVar.a();
            }
        }
        setOnClickListener(new b30.y(new n20.b(this, kfVar)));
    }

    public final l20.o0 getCallback() {
        return this.callback;
    }

    public final bw5.Cif getData() {
        return this.data;
    }

    @Override // k20.h
    public /* bridge */ /* synthetic */ java.lang.String getEcsReportDataForFinder() {
        return "";
    }

    public final android.widget.ImageView getImgView() {
        return (android.widget.ImageView) ((jz5.n) this.imgView).getValue();
    }

    public final com.tencent.mm.feature.ecs.product.player.EcsVideoView getSafeVideoVew() {
        if (getChildCount() == 0 || !(getChildAt(0) instanceof com.tencent.mm.feature.ecs.product.player.EcsVideoView)) {
            return null;
        }
        android.view.View childAt = getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.product.player.EcsVideoView");
        return (com.tencent.mm.feature.ecs.product.player.EcsVideoView) childAt;
    }

    public final em.e0 getVb() {
        return this.vb;
    }

    public final com.tencent.mm.feature.ecs.product.player.EcsVideoView getVideoView() {
        return (com.tencent.mm.feature.ecs.product.player.EcsVideoView) ((jz5.n) this.videoView).getValue();
    }

    @Override // k20.h
    public void onPause() {
        o20.c0 c0Var;
        com.tencent.mars.xlog.Log.i("EcsFinderFeedHeadView", "onPause");
        o20.c0 c0Var2 = this.f65917f;
        if (!kotlin.jvm.internal.o.b(c0Var2 != null ? ((o20.i) c0Var2).f342384c : null, o20.o.f342395a) || (c0Var = this.f65917f) == null) {
            return;
        }
        ((o20.i) c0Var).a();
    }

    @Override // k20.h
    public void onResume() {
        o20.c0 c0Var;
        com.tencent.mars.xlog.Log.i("EcsFinderFeedHeadView", "onResume");
        o20.c0 c0Var2 = this.f65917f;
        if (!kotlin.jvm.internal.o.b(c0Var2 != null ? ((o20.i) c0Var2).f342384c : null, o20.n.f342394a) || (c0Var = this.f65917f) == null) {
            return;
        }
        ((o20.i) c0Var).e();
    }

    public final void setCallback(l20.o0 o0Var) {
        this.callback = o0Var;
    }

    public final void setData(bw5.Cif cif) {
        this.data = cif;
    }

    @Override // k20.h
    public void setFinderCardInfo(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
    }

    @Override // k20.h
    public /* bridge */ /* synthetic */ void setNaviHeight(int i17) {
    }

    @Override // k20.h
    public void setOnFeedBackListener(k20.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
    }

    public final void setVb(em.e0 e0Var) {
        this.vb = e0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedHeadView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.videoView = jz5.h.b(new n20.i(context));
        this.imgView = jz5.h.b(new n20.e(context));
        this.videoReportTask = jz5.h.b(new n20.h(this));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "feeds_spu_card");
        aVar.Ai(this, new n20.a(this));
        aVar.Tj(this, 8, 12, false);
    }
}
