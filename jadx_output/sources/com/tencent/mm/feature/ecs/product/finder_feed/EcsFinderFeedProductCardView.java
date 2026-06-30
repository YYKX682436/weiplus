package com.tencent.mm.feature.ecs.product.finder_feed;

@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B.\b\u0007\u0012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001\u0012\f\b\u0002\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u0001\u0012\t\b\u0002\u0010\u008e\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u0017\u0010(\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00101\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010:\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010\u001c\u001a\u0004\b9\u0010\u001eR\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010C\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0017\u0010I\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010L\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?R\u0017\u0010R\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010U\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bS\u0010=\u001a\u0004\bT\u0010?R\u0017\u0010X\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bV\u0010F\u001a\u0004\bW\u0010HR\u0017\u0010[\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bY\u0010=\u001a\u0004\bZ\u0010?R\u0017\u0010a\u001a\u00020\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010d\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bb\u0010+\u001a\u0004\bc\u0010-R\u0017\u0010g\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\be\u0010\u001c\u001a\u0004\bf\u0010\u001eR\u0017\u0010j\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bh\u0010\u001c\u001a\u0004\bi\u0010\u001eR\u0017\u0010m\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bk\u0010\u0010\u001a\u0004\bl\u0010\u0012R\u0017\u0010p\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bn\u0010+\u001a\u0004\bo\u0010-R\u0017\u0010s\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bq\u0010+\u001a\u0004\br\u0010-R$\u0010{\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001d\u0010\u0081\u0001\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018F¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0089\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0086\u00018F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/EcsFinderFeedProductCardView;", "Landroid/widget/FrameLayout;", "Ll20/p0;", "", "naviHeight", "Ljz5/f0;", "setNaviHeight", "Lk20/g;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFeedBackListener", "", "jsonStr", "setFinderCardInfo", "getEcsReportDataForFinder", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getImgSingleHeader", "()Landroid/widget/ImageView;", "imgSingleHeader", "Lcom/tencent/mm/feature/ecs/product/player/EcsVideoView;", "e", "Lcom/tencent/mm/feature/ecs/product/player/EcsVideoView;", "getVideoViewTop", "()Lcom/tencent/mm/feature/ecs/product/player/EcsVideoView;", "videoViewTop", "Landroid/widget/LinearLayout;", "f", "Landroid/widget/LinearLayout;", "getLlHeaderRightContainer", "()Landroid/widget/LinearLayout;", "llHeaderRightContainer", "g", "getImgHeaderRight1", "imgHeaderRight1", "h", "getImgHeaderRight2", "imgHeaderRight2", "i", "getImgHeaderRight3", "imgHeaderRight3", "Landroid/view/View;", "m", "Landroid/view/View;", "getBgNavi", "()Landroid/view/View;", "bgNavi", "n", "getBgNaviCart", "bgNaviCart", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "getTvFeedBack", "()Landroid/widget/TextView;", "tvFeedBack", "p", "getBgPrice", "bgPrice", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "q", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "getTvPrice", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextLabelView;", "tvPrice", "r", "getTvPriceSubTitle", "tvPriceSubTitle", "Lcom/tencent/mm/feature/ecs/product/view/EcsLabelBoxView;", "s", "Lcom/tencent/mm/feature/ecs/product/view/EcsLabelBoxView;", "getPriceDescBox", "()Lcom/tencent/mm/feature/ecs/product/view/EcsLabelBoxView;", "priceDescBox", "t", "getTvSoldCount", "tvSoldCount", "Landroidx/constraintlayout/widget/ConstraintLayout;", "u", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getClBottom", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "clBottom", org.chromium.base.BaseSwitches.V, "getTvTitle", "tvTitle", "w", "getLabelBox", "labelBox", "x", "getReviewsBox", "reviewsBox", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "y", "Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "getBtBuy", "()Lcom/tencent/mm/feature/ecs/product/view/EcsRichTextButtonView;", "btBuy", "z", "getFlBuyCart", "flBuyCart", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getLlWeStore", "llWeStore", "B", "getLlMoreFinder", "llMoreFinder", "C", "getImgWaistBg", "imgWaistBg", "D", "getPaddingLeftPriceBg", "paddingLeftPriceBg", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "getPaddingRightPriceBg", "paddingRightPriceBg", "Lbw5/qf;", "F", "Lbw5/qf;", "getData", "()Lbw5/qf;", "setData", "(Lbw5/qf;)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Ll20/m0;", "J", "Ljz5/g;", "getVideoReportTask", "()Ll20/m0;", "videoReportTask", "Lbw5/kf;", com.tencent.mm.plugin.appbrand.jsapi.media.g6.NAME, "()Lbw5/kf;", "videoInfo", "", "getImageInfoList", "()Ljava/util/List;", "imageInfoList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsFinderFeedProductCardView extends android.widget.FrameLayout implements l20.p0 {
    public static final /* synthetic */ int L = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public final android.widget.LinearLayout llWeStore;

    /* renamed from: B, reason: from kotlin metadata */
    public final android.widget.LinearLayout llMoreFinder;

    /* renamed from: C, reason: from kotlin metadata */
    public final android.widget.ImageView imgWaistBg;

    /* renamed from: D, reason: from kotlin metadata */
    public final android.view.View paddingLeftPriceBg;

    /* renamed from: E, reason: from kotlin metadata */
    public final android.view.View paddingRightPriceBg;

    /* renamed from: F, reason: from kotlin metadata */
    public bw5.qf data;
    public java.lang.String G;
    public k20.g H;
    public o20.c0 I;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoReportTask;
    public long K;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.widget.ImageView imgSingleHeader;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.player.EcsVideoView videoViewTop;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final android.widget.LinearLayout llHeaderRightContainer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final android.widget.ImageView imgHeaderRight1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final android.widget.ImageView imgHeaderRight2;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final android.widget.ImageView imgHeaderRight3;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final android.view.View bgNavi;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final android.view.View bgNaviCart;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView tvFeedBack;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final android.widget.LinearLayout bgPrice;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvPrice;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvPriceSubTitle;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView priceDescBox;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvSoldCount;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final androidx.constraintlayout.widget.ConstraintLayout clBottom;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView tvTitle;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView labelBox;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView reviewsBox;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView btBuy;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final android.view.View flBuyCart;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final l20.m0 getVideoReportTask() {
        return (l20.m0) ((jz5.n) this.videoReportTask).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0.C[13] == true) goto L10;
     */
    @Override // l20.p0, k20.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6) {
        /*
            r5 = this;
            java.lang.String r0 = "feeds_spu_card"
            if (r6 == 0) goto L27
            long r1 = android.os.SystemClock.uptimeMillis()
            r5.K = r1
            java.lang.String r6 = "element_expose"
            r1 = 0
            r5.d(r0, r6, r1)
            bw5.qf r0 = r5.data
            if (r0 == 0) goto L1e
            boolean[] r0 = r0.C
            r2 = 13
            boolean r0 = r0[r2]
            r2 = 1
            if (r0 != r2) goto L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 == 0) goto L46
            java.lang.String r0 = "feeds_add_shopping_cart"
            r5.d(r0, r6, r1)
            goto L46
        L27:
            long r1 = android.os.SystemClock.uptimeMillis()
            long r3 = r5.K
            long r1 = r1 - r3
            r6 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r6
            long r1 = r1 / r3
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            jz5.l r1 = new jz5.l
            java.lang.String r2 = "stay_duration"
            r1.<init>(r2, r6)
            java.util.Map r6 = kz5.b1.e(r1)
            java.lang.String r1 = "module_exit"
            r5.d(r0, r1, r6)
        L46:
            bw5.kf r6 = r5.getVideoInfo()
            if (r6 == 0) goto L53
            java.util.List r6 = r5.getImageInfoList()
            r6.size()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.product.finder_feed.EcsFinderFeedProductCardView.a(boolean):void");
    }

    @Override // k20.h
    public void b() {
        o20.c0 c0Var = this.I;
        if (c0Var != null) {
            ((o20.i) c0Var).b();
        }
        this.videoViewTop.c();
    }

    @Override // l20.p0
    public void c(bw5.qf data) {
        l20.q qVar;
        com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView;
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(data, "data");
        this.data = data;
        bw5.Cif d17 = data.d();
        kotlin.jvm.internal.o.f(d17, "getHeaderInfo(...)");
        boolean z17 = getVideoInfo() != null && getImageInfoList().size() == 3;
        int i17 = 2;
        android.widget.ImageView imageView2 = this.imgHeaderRight3;
        android.widget.ImageView imageView3 = this.imgHeaderRight2;
        android.widget.ImageView imageView4 = this.imgHeaderRight1;
        com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView2 = this.videoViewTop;
        android.widget.ImageView imageView5 = this.imgSingleHeader;
        if (z17) {
            imageView5.setVisibility(8);
            ecsVideoView2.setVisibility(0);
            imageView4.setVisibility(0);
            imageView3.setVisibility(0);
            imageView2.setVisibility(0);
            l20.q qVar2 = new l20.q(this);
            imageView4.setImageBitmap(null);
            imageView3.setImageBitmap(null);
            imageView2.setImageBitmap(null);
            int i18 = 0;
            for (java.lang.Object obj : getImageInfoList()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                bw5.kf kfVar = (bw5.kf) obj;
                java.lang.String b17 = kfVar.c().b();
                android.widget.ImageView imageView6 = i18 != 0 ? i18 != 1 ? i18 != i17 ? null : imageView2 : imageView3 : imageView4;
                if (imageView6 != null) {
                    kotlin.jvm.internal.o.d(b17);
                    q00.f fVar = new q00.f();
                    bw5.c7 c7Var = new bw5.c7();
                    c7Var.d(b17);
                    fVar.f359251a = c7Var;
                    fVar.f359252b = imageView6;
                    fVar.a();
                }
                if (imageView6 != null) {
                    qVar = qVar2;
                    ecsVideoView = ecsVideoView2;
                    imageView = imageView4;
                    imageView6.setOnClickListener(new b30.y(new l20.n(b17, i18, this, qVar, kfVar)));
                } else {
                    qVar = qVar2;
                    ecsVideoView = ecsVideoView2;
                    imageView = imageView4;
                }
                ecsVideoView2 = ecsVideoView;
                i18 = i19;
                qVar2 = qVar;
                imageView4 = imageView;
                i17 = 2;
            }
            l20.q qVar3 = qVar2;
            com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView3 = ecsVideoView2;
            bw5.kf videoInfo = getVideoInfo();
            if (videoInfo != null) {
                if (this.I == null) {
                    o20.i iVar = new o20.i();
                    ((kk4.v) iVar.f342382a).A(true);
                    l20.m0 task = getVideoReportTask();
                    kotlin.jvm.internal.o.g(task, "task");
                    q20.j jVar = (q20.j) iVar.f342383b;
                    jVar.getClass();
                    jVar.f359799a.add(task);
                    this.I = iVar;
                }
                o20.c0 c0Var = this.I;
                if (c0Var != null) {
                    ecsVideoView3.setOnThumbnailBitmapLoad(new l20.o(this));
                    ecsVideoView3.setPlayer(c0Var);
                    bw5.w9 d18 = videoInfo.d();
                    kotlin.jvm.internal.o.f(d18, "getVideo(...)");
                    o20.i iVar2 = (o20.i) c0Var;
                    iVar2.d(d18);
                    kk4.b.a(iVar2.f342382a, null, 1, null);
                }
                ecsVideoView3.setOnClickListener(new b30.y(new l20.p(this, qVar3, videoInfo)));
            }
        } else {
            imageView5.setVisibility(0);
            ecsVideoView2.setVisibility(8);
            imageView4.setVisibility(8);
            imageView3.setVisibility(8);
            imageView2.setVisibility(8);
            imageView5.setImageBitmap(null);
            this.bgNavi.setBackground(null);
            this.bgNaviCart.setBackground(null);
            java.util.LinkedList linkedList = d17.f28566d;
            kotlin.jvm.internal.o.f(linkedList, "getHeadMediaInfos(...)");
            bw5.kf kfVar2 = (bw5.kf) kz5.n0.a0(linkedList, 0);
            if (kfVar2 != null) {
                java.lang.String b18 = kfVar2.c().b();
                kotlin.jvm.internal.o.d(b18);
                q00.f fVar2 = new q00.f();
                bw5.c7 c7Var2 = new bw5.c7();
                c7Var2.d(b18);
                fVar2.f359251a = c7Var2;
                fVar2.f359252b = imageView5;
                fVar2.b(new l20.l(b18, this));
                fVar2.a();
                imageView5.setOnClickListener(new b30.y(new l20.m(b18, this, kfVar2)));
            }
        }
        boolean[] zArr = data.C;
        bw5.a9 a9Var = zArr[2] ? data.f32068e : new bw5.a9();
        kotlin.jvm.internal.o.f(a9Var, "getProductTitle(...)");
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView = this.tvTitle;
        ecsRichTextLabelView.a(a9Var);
        b30.z zVar = b30.z.f17588a;
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView2 = this.reviewsBox;
        zVar.a(ecsRichTextLabelView2);
        com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView ecsLabelBoxView = this.labelBox;
        zVar.a(ecsLabelBoxView);
        boolean z18 = zArr[18];
        if (z18) {
            bw5.a9 a9Var2 = z18 ? data.f32084x : new bw5.a9();
            kotlin.jvm.internal.o.f(a9Var2, "getReviewsInfo(...)");
            ecsRichTextLabelView2.a(a9Var2);
            zVar.c(ecsRichTextLabelView2);
        } else {
            boolean z19 = zArr[3];
            if (z19) {
                bw5.o9 o9Var = z19 ? data.f32069f : new bw5.o9();
                kotlin.jvm.internal.o.f(o9Var, "getProductTag(...)");
                ecsLabelBoxView.a(o9Var);
                zVar.c(ecsLabelBoxView);
            }
        }
        bw5.a9 a9Var3 = zArr[4] ? data.f32070g : new bw5.a9();
        kotlin.jvm.internal.o.f(a9Var3, "getPrice(...)");
        this.tvPrice.a(a9Var3);
        bw5.o9 o9Var2 = zArr[5] ? data.f32071h : new bw5.o9();
        kotlin.jvm.internal.o.f(o9Var2, "getPriceDescTag(...)");
        this.priceDescBox.a(o9Var2);
        boolean z27 = zArr[16];
        com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView ecsRichTextLabelView3 = this.tvPriceSubTitle;
        if (z27) {
            bw5.a9 a9Var4 = z27 ? data.f32082v : new bw5.a9();
            kotlin.jvm.internal.o.f(a9Var4, "getPriceSubTitle(...)");
            ecsRichTextLabelView3.a(a9Var4);
            ecsRichTextLabelView3.setVisibility(0);
        } else {
            ecsRichTextLabelView3.setVisibility(8);
        }
        bw5.a9 a9Var5 = zArr[17] ? data.f32083w : new bw5.a9();
        kotlin.jvm.internal.o.f(a9Var5, "getSoldCount(...)");
        this.tvSoldCount.a(a9Var5);
        bw5.d9 d9Var = zArr[6] ? data.f32072i : new bw5.d9();
        kotlin.jvm.internal.o.f(d9Var, "getBuyButton(...)");
        com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView ecsRichTextButtonView = this.btBuy;
        ecsRichTextButtonView.a(d9Var);
        boolean z28 = zArr[13];
        android.view.View view = this.flBuyCart;
        if (z28) {
            zVar.c(view);
            zVar.b(view, new l20.j(this, data));
        } else {
            zVar.a(view);
        }
        l20.h hVar = new l20.h(this);
        android.widget.TextView textView = this.tvFeedBack;
        kotlin.jvm.internal.o.g(textView, "<this>");
        textView.setOnClickListener(new b30.y(hVar));
        l20.g gVar = new l20.g(this);
        l20.f fVar3 = new l20.f(this, data);
        ecsRichTextButtonView.setPreOnCLick(new l20.a(gVar));
        ecsRichTextLabelView.setOnClickListener(new b30.y(new l20.b(gVar, fVar3)));
        l20.c cVar = new l20.c(gVar, fVar3);
        android.widget.LinearLayout linearLayout = this.bgPrice;
        kotlin.jvm.internal.o.g(linearLayout, "<this>");
        linearLayout.setOnClickListener(new b30.y(cVar));
        ecsRichTextLabelView2.setOnClickListener(new b30.y(new l20.d(gVar, fVar3)));
        ecsLabelBoxView.setPreOnCLick(new l20.e(gVar));
        bw5.pf pfVar = zArr[19] ? data.f32085y : new bw5.pf();
        java.lang.String str = pfVar.f31600g[1] ? pfVar.f31597d : "";
        kotlin.jvm.internal.o.f(str, "getImgUrl(...)");
        android.widget.ImageView imageView7 = this.imgWaistBg;
        kotlin.jvm.internal.o.g(imageView7, "<this>");
        q00.f fVar4 = new q00.f();
        bw5.c7 c7Var3 = new bw5.c7();
        c7Var3.d(str);
        fVar4.f359251a = c7Var3;
        fVar4.f359252b = imageView7;
        fVar4.a();
        b30.m mVar = b30.m.f17570a;
        boolean[] zArr2 = pfVar.f31600g;
        java.lang.Integer a17 = mVar.a(zArr2[2] ? pfVar.f31598e : "");
        this.paddingLeftPriceBg.setBackgroundColor(a17 != null ? a17.intValue() : -65536);
        java.lang.Integer a18 = mVar.a(zArr2[3] ? pfVar.f31599f : "");
        this.paddingRightPriceBg.setBackgroundColor(a18 != null ? a18.intValue() : -65536);
    }

    public final void d(java.lang.String str, java.lang.String str2, java.util.Map map) {
        java.lang.String b17;
        java.util.Map l17 = kz5.c1.l(new jz5.l("element_id", str), new jz5.l("action_type", str2));
        java.lang.String str3 = this.G;
        if (str3 != null) {
            if (str3.length() > 0) {
                l17.put("finder_card_info", str3);
            }
        }
        bw5.qf qfVar = this.data;
        if (qfVar != null && (b17 = qfVar.b()) != null) {
            if (b17.length() > 0) {
                l17.put("wxec_card_info", b17);
            }
        }
        if (map != null && (!map.isEmpty())) {
            java.lang.String g07 = map.isEmpty() ? null : kz5.n0.g0(map.entrySet(), ";", "{", "}", 0, null, b30.d.f17560d, 24, null);
            if (g07 == null) {
                g07 = "";
            }
            l17.put("element_info", g07);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj(str, str2, kz5.c1.s(l17), 12, false);
    }

    public final android.view.View getBgNavi() {
        return this.bgNavi;
    }

    public final android.view.View getBgNaviCart() {
        return this.bgNaviCart;
    }

    public final android.widget.LinearLayout getBgPrice() {
        return this.bgPrice;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView getBtBuy() {
        return this.btBuy;
    }

    public final androidx.constraintlayout.widget.ConstraintLayout getClBottom() {
        return this.clBottom;
    }

    public final bw5.qf getData() {
        return this.data;
    }

    @Override // k20.h
    public java.lang.String getEcsReportDataForFinder() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"productid\": ");
        bw5.qf qfVar = this.data;
        sb6.append(qfVar != null ? qfVar.f32067d : 0L);
        sb6.append("; \"extraJson\": ");
        bw5.qf qfVar2 = this.data;
        java.lang.String b17 = qfVar2 != null ? qfVar2.b() : null;
        if (b17 == null) {
            b17 = "";
        }
        sb6.append(b17);
        return sb6.toString();
    }

    public final android.view.View getFlBuyCart() {
        return this.flBuyCart;
    }

    public final java.util.List<bw5.kf> getImageInfoList() {
        bw5.qf qfVar = this.data;
        bw5.Cif d17 = qfVar != null ? qfVar.d() : null;
        if (d17 == null) {
            return kz5.p0.f313996d;
        }
        java.util.LinkedList linkedList = d17.f28566d;
        kotlin.jvm.internal.o.f(linkedList, "getHeadMediaInfos(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((bw5.kf) obj).f29362d == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final android.widget.ImageView getImgHeaderRight1() {
        return this.imgHeaderRight1;
    }

    public final android.widget.ImageView getImgHeaderRight2() {
        return this.imgHeaderRight2;
    }

    public final android.widget.ImageView getImgHeaderRight3() {
        return this.imgHeaderRight3;
    }

    public final android.widget.ImageView getImgSingleHeader() {
        return this.imgSingleHeader;
    }

    public final android.widget.ImageView getImgWaistBg() {
        return this.imgWaistBg;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView getLabelBox() {
        return this.labelBox;
    }

    public final android.widget.LinearLayout getLlHeaderRightContainer() {
        return this.llHeaderRightContainer;
    }

    public final android.widget.LinearLayout getLlMoreFinder() {
        return this.llMoreFinder;
    }

    public final android.widget.LinearLayout getLlWeStore() {
        return this.llWeStore;
    }

    public final android.view.View getPaddingLeftPriceBg() {
        return this.paddingLeftPriceBg;
    }

    public final android.view.View getPaddingRightPriceBg() {
        return this.paddingRightPriceBg;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView getPriceDescBox() {
        return this.priceDescBox;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getReviewsBox() {
        return this.reviewsBox;
    }

    public final android.widget.TextView getTvFeedBack() {
        return this.tvFeedBack;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTvPrice() {
        return this.tvPrice;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTvPriceSubTitle() {
        return this.tvPriceSubTitle;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTvSoldCount() {
        return this.tvSoldCount;
    }

    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView getTvTitle() {
        return this.tvTitle;
    }

    public final bw5.kf getVideoInfo() {
        bw5.qf qfVar = this.data;
        bw5.Cif d17 = qfVar != null ? qfVar.d() : null;
        if (d17 == null) {
            return null;
        }
        java.util.LinkedList linkedList = d17.f28566d;
        kotlin.jvm.internal.o.f(linkedList, "getHeadMediaInfos(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                return (bw5.kf) kz5.n0.a0(arrayList, 0);
            }
            java.lang.Object next = it.next();
            if (((bw5.kf) next).f29362d == 2) {
                arrayList.add(next);
            }
        }
    }

    public final com.tencent.mm.feature.ecs.product.player.EcsVideoView getVideoViewTop() {
        return this.videoViewTop;
    }

    @Override // k20.h
    public void onPause() {
    }

    @Override // k20.h
    public void onResume() {
    }

    public final void setData(bw5.qf qfVar) {
        this.data = qfVar;
    }

    @Override // k20.h
    public void setFinderCardInfo(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        this.G = jsonStr;
    }

    @Override // k20.h
    public void setNaviHeight(int i17) {
        this.bgNavi.getLayoutParams().height = i17;
    }

    @Override // k20.h
    public void setOnFeedBackListener(k20.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.H = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.videoReportTask = jz5.h.b(new l20.t(this));
        android.view.View.inflate(context, com.tencent.mm.R.layout.e4d, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.u47);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.imgSingleHeader = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vlv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.videoViewTop = (com.tencent.mm.feature.ecs.product.player.EcsVideoView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ubw);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.llHeaderRightContainer = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f485324u44);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.imgHeaderRight1 = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f485325u45);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.imgHeaderRight2 = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.f485326u46);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.imgHeaderRight3 = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.sho);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.bgNavi = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.shp);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.bgNaviCart = findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f487408vh3);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.tvFeedBack = (android.widget.TextView) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.shq);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.bgPrice = (android.widget.LinearLayout) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.okn);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.tvPrice = (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.vh7);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.tvPriceSubTitle = (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.vh8);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.tvSoldCount = (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById13;
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.uti);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.priceDescBox = (com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView) findViewById14;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.ssc);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.clBottom = (androidx.constraintlayout.widget.ConstraintLayout) findViewById15;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.okp);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.tvTitle = (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById16;
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.u8g);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.labelBox = (com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView) findViewById17;
        android.view.View findViewById18 = findViewById(com.tencent.mm.R.id.uz_);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.reviewsBox = (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById18;
        android.view.View findViewById19 = findViewById(com.tencent.mm.R.id.slf);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.btBuy = (com.tencent.mm.feature.ecs.product.view.EcsRichTextButtonView) findViewById19;
        android.view.View findViewById20 = findViewById(com.tencent.mm.R.id.twn);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.flBuyCart = findViewById20;
        android.view.View findViewById21 = findViewById(com.tencent.mm.R.id.uby);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.llWeStore = (android.widget.LinearLayout) findViewById21;
        android.view.View findViewById22 = findViewById(com.tencent.mm.R.id.ubx);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.llMoreFinder = (android.widget.LinearLayout) findViewById22;
        android.view.View findViewById23 = findViewById(com.tencent.mm.R.id.u48);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        this.imgWaistBg = (android.widget.ImageView) findViewById23;
        android.view.View findViewById24 = findViewById(com.tencent.mm.R.id.uoa);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        this.paddingLeftPriceBg = findViewById24;
        android.view.View findViewById25 = findViewById(com.tencent.mm.R.id.uob);
        kotlin.jvm.internal.o.f(findViewById25, "findViewById(...)");
        this.paddingRightPriceBg = findViewById25;
    }
}
