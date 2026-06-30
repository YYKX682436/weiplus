package com.tencent.mm.feature.ecs.product.finder_feed.v3;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u0004¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/tencent/mm/feature/ecs/product/finder_feed/v3/EcsFinderFeedProductViewV3;", "Landroid/widget/FrameLayout;", "Ll20/p0;", "Ll20/o0;", "", "naviHeight", "Ljz5/f0;", "setNaviHeight", "Lk20/g;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnFeedBackListener", "", "jsonStr", "setFinderCardInfo", "getEcsReportDataForFinder", "", "getParams", "Lbw5/qf;", "d", "Lbw5/qf;", "getData", "()Lbw5/qf;", "setData", "(Lbw5/qf;)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lem/e0;", "e", "Lem/e0;", "getVb", "()Lem/e0;", "vb", "f", "I", "get_naviHeight", "()I", "set_naviHeight", "(I)V", "_naviHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsFinderFeedProductViewV3 extends android.widget.FrameLayout implements l20.p0, l20.o0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public bw5.qf data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final em.e0 vb;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int _naviHeight;

    /* renamed from: g, reason: collision with root package name */
    public k20.g f65926g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f65927h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductViewV3(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l20.p0, k20.h
    public void a(boolean z17) {
        this.vb.d().getClass();
    }

    @Override // k20.h
    public void b() {
        this.vb.d().b();
    }

    @Override // l20.p0
    public void c(bw5.qf data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.data = data;
        em.e0 e0Var = this.vb;
        if (e0Var.f254275j == null) {
            e0Var.f254275j = (android.widget.TextView) e0Var.f254266a.findViewById(com.tencent.mm.R.id.f487408vh3);
        }
        android.widget.TextView textView = e0Var.f254275j;
        kotlin.jvm.internal.o.f(textView, "getTvFeedBack(...)");
        textView.setOnClickListener(new b30.y(new n20.p(this)));
        if (e0Var.f254268c == null) {
            e0Var.f254268c = e0Var.f254266a.findViewById(com.tencent.mm.R.id.shm);
        }
        e0Var.f254268c.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478512u : com.tencent.mm.R.color.aay));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(getContext().getColor(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.f478492d : com.tencent.mm.R.color.agl));
        gradientDrawable.setCornerRadius(i65.a.b(getContext(), 12));
        e0Var.f().setBackground(gradientDrawable);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.graphics.RenderEffect createBlurEffect = android.graphics.RenderEffect.createBlurEffect(50.0f, 50.0f, android.graphics.Shader.TileMode.MIRROR);
            kotlin.jvm.internal.o.f(createBlurEffect, "createBlurEffect(...)");
            e0Var.a().setRenderEffect(createBlurEffect);
        }
        e0Var.d().setVb(e0Var);
        e0Var.d().c(data);
        e0Var.g().c(data);
        e0Var.h().c(data);
        com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedHeadView d17 = e0Var.d();
        d17.getClass();
        d17.callback = this;
        com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedProductInfoView g17 = e0Var.g();
        g17.getClass();
        g17.callback = this;
        com.tencent.mm.feature.ecs.product.finder_feed.v3.EcsFinderFeedRecommendView h17 = e0Var.h();
        h17.getClass();
        h17.callback = this;
        post(new n20.o(this));
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

    @Override // l20.o0
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String str = this.f65927h;
        if (str == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_card_info", str);
        bw5.qf qfVar = this.data;
        java.lang.String b17 = qfVar != null ? qfVar.b() : null;
        lVarArr[1] = new jz5.l("wxec_card_info", b17 != null ? b17 : "");
        return kz5.c1.l(lVarArr);
    }

    public final em.e0 getVb() {
        return this.vb;
    }

    public final int get_naviHeight() {
        return this._naviHeight;
    }

    @Override // k20.h
    public void onPause() {
        this.vb.d().onPause();
    }

    @Override // k20.h
    public void onResume() {
        this.vb.d().onResume();
    }

    public final void setData(bw5.qf qfVar) {
        this.data = qfVar;
    }

    @Override // k20.h
    public void setFinderCardInfo(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        this.f65927h = jsonStr;
    }

    @Override // k20.h
    public void setNaviHeight(int i17) {
        this._naviHeight = i17;
        em.e0 e0Var = this.vb;
        android.view.ViewGroup.LayoutParams layoutParams = e0Var.b().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = e0Var.d().getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.topMargin = i17;
    }

    @Override // k20.h
    public void setOnFeedBackListener(k20.g listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f65926g = listener;
    }

    public final void set_naviHeight(int i17) {
        this._naviHeight = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsFinderFeedProductViewV3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e4c, (android.view.ViewGroup) null);
        this.vb = new em.e0(inflate);
        addView(inflate);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(this, "feeds_spu_card");
        aVar.Ai(this, new n20.n(this));
        aVar.Tj(this, 160, 12, false);
    }
}
