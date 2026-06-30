package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%B%\b\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Landroid/view/View;", "getContentView", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getBrandWordingTv", "()Landroid/widget/TextView;", "brandWordingTv", "e", "getResultTv", "resultTv", "Landroid/graphics/drawable/Drawable;", "f", "getLoadingDrawable", "()Landroid/graphics/drawable/Drawable;", "loadingDrawable", "<set-?>", "g", "Landroid/view/View;", "getTranslateLayout", "()Landroid/view/View;", "translateLayout", "Luc4/z;", "i", "Luc4/z;", "getMenuHandler", "()Luc4/z;", "setMenuHandler", "(Luc4/z;)V", "menuHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout */
/* loaded from: classes4.dex */
public abstract class AbstractC18279x648ad7a0 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 {

    /* renamed from: n, reason: collision with root package name */
    public static final int f250714n = android.graphics.Color.parseColor("#19000000");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g brandWordingTv;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g resultTv;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadingDrawable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.view.View translateLayout;

    /* renamed from: h, reason: collision with root package name */
    public bd4.f2 f250719h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public uc4.z menuHandler;

    /* renamed from: m, reason: collision with root package name */
    public boolean f250721m;

    public AbstractC18279x648ad7a0(android.content.Context context) {
        super(context);
        this.brandWordingTv = jz5.h.b(new bd4.d1(this));
        this.resultTv = jz5.h.b(new bd4.g1(this));
        this.loadingDrawable = jz5.h.b(new bd4.f1(this));
        setOrientation(1);
        android.view.View mo70997xc2a54588 = mo70997xc2a54588();
        if (mo70997xc2a54588 != null) {
            addView(mo70997xc2a54588, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(bd4.c1.f100836d);
    }

    public static final /* synthetic */ android.widget.TextView c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.AbstractC18279x648ad7a0 abstractC18279x648ad7a0) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        android.widget.TextView m71033x67d67cf5 = abstractC18279x648ad7a0.m71033x67d67cf5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return m71033x67d67cf5;
    }

    /* renamed from: getBrandWordingTv */
    private final android.widget.TextView m71031x9a26ea69() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBrandWordingTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        java.lang.Object mo141623x754a37bb = this.brandWordingTv.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBrandWordingTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return textView;
    }

    /* renamed from: getLoadingDrawable */
    private final android.graphics.drawable.Drawable m71032xa0a29bc4() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoadingDrawable", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        java.lang.Object mo141623x754a37bb = this.loadingDrawable.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoadingDrawable", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return drawable;
    }

    /* renamed from: getResultTv */
    private final android.widget.TextView m71033x67d67cf5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        java.lang.Object mo141623x754a37bb = this.resultTv.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getResultTv", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return textView;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroyResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        bd4.f2 f2Var = this.f250719h;
        if (f2Var != null) {
            f2Var.k();
        }
        this.f250719h = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroyResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    /* renamed from: getContentView */
    public abstract android.view.View mo70997xc2a54588();

    /* renamed from: getMenuHandler */
    public final uc4.z m71034x5c0527b5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        uc4.z zVar = this.menuHandler;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return zVar;
    }

    /* renamed from: getTranslateLayout */
    public final android.view.View m71035x764ff7e2() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        android.view.View view = this.translateLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTranslateLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        return view;
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 r6Var, int i17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTranslateResultSizeAndColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        m71033x67d67cf5().setTextSize(1, 15 * i65.a.q(getContext()));
        if (i17 == 1) {
            m71033x67d67cf5().setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a6m));
            m71033x67d67cf5().setBackground(pc4.d.f434943a.b(false) ? null : i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.b2i));
        } else if (i17 == 2) {
            m71033x67d67cf5().setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a6k));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTranslateResultSizeAndColor", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m71033x67d67cf5().setText(com.p314xaae8f345.mm.R.C30867xcad56011.jgm);
            e();
        } else {
            m71033x67d67cf5().setText(str);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(m71033x67d67cf5(), 2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
            uc4.z zVar = this.menuHandler;
            if (pc4.d.f434943a.b(false)) {
                java.lang.CharSequence text = m71033x67d67cf5().getText();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(text != null ? text.toString() : null) && zVar != null) {
                    e();
                    android.content.Context context = getContext();
                    android.widget.TextView m71033x67d67cf5 = m71033x67d67cf5();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimelineMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimelineMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
                    uc4.y yVar = zVar.f508000f;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c e17 = zVar.e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
                    bd4.f2 f2Var = new bd4.f2(context, m71033x67d67cf5, snsInfo, yVar, e17, null, null, 0, null, 480, null);
                    this.f250719h = f2Var;
                    f2Var.j();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initResultSelectableHelper", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        }
        m71033x67d67cf5().setCompoundDrawables(null, null, null, null);
        if (z17 && fp.h.c(11)) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.l5.b(m71033x67d67cf5(), new bd4.e1(r6Var));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            m71031x9a26ea69().setText(com.p314xaae8f345.mm.R.C30867xcad56011.b6e);
        } else {
            m71031x9a26ea69().setText(str2);
        }
        m71031x9a26ea69().setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("finishTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public final void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        e();
        android.view.View view = this.translateLayout;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "hideTranslate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "hideTranslate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public final void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        android.view.View view = this.translateLayout;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "setupTranslateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveTranslateLayout", "setupTranslateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f250721m) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
            return;
        }
        this.f250721m = true;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570716bl5, (android.view.ViewGroup) this, false);
        this.translateLayout = inflate;
        addView(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupTranslateView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public final void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        e();
        k();
        m71033x67d67cf5().setCompoundDrawables(m71032xa0a29bc4(), null, null, null);
        m71033x67d67cf5().setCompoundDrawablePadding(i65.a.b(getContext(), 3));
        m71033x67d67cf5().setText(com.p314xaae8f345.mm.R.C30867xcad56011.jgo);
        com.p314xaae8f345.mm.ui.p2740x696c9db.l5.b(m71033x67d67cf5(), null);
        m71031x9a26ea69().setVisibility(4);
        m71033x67d67cf5().setTextSize(0, m71031x9a26ea69().getTextSize());
        m71033x67d67cf5().setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a6l));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startTranslate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        e();
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    /* renamed from: setMenuHandler */
    public final void m71036xf26a9b29(uc4.z zVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
        this.menuHandler = zVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMenuHandler", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTranslateLayout");
    }

    public AbstractC18279x648ad7a0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.brandWordingTv = jz5.h.b(new bd4.d1(this));
        this.resultTv = jz5.h.b(new bd4.g1(this));
        this.loadingDrawable = jz5.h.b(new bd4.f1(this));
        setOrientation(1);
        android.view.View mo70997xc2a54588 = mo70997xc2a54588();
        if (mo70997xc2a54588 != null) {
            addView(mo70997xc2a54588, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(bd4.c1.f100836d);
    }

    public AbstractC18279x648ad7a0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.brandWordingTv = jz5.h.b(new bd4.d1(this));
        this.resultTv = jz5.h.b(new bd4.g1(this));
        this.loadingDrawable = jz5.h.b(new bd4.f1(this));
        setOrientation(1);
        android.view.View mo70997xc2a54588 = mo70997xc2a54588();
        if (mo70997xc2a54588 != null) {
            addView(mo70997xc2a54588, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
        setOnTouchListener(bd4.c1.f100836d);
    }
}
