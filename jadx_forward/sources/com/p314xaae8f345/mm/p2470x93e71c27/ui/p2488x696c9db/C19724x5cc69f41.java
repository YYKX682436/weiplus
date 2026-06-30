package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR#\u0010\u0012\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0015\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/AppChooseItemCheckedView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getRoot", "Landroid/widget/ImageView;", "getIconImg", "Landroid/widget/TextView;", "getTitleTv", "getCheckImg", "", "checked", "Ljz5/f0;", "setChecked", "e", "Ljz5/g;", "getNotSetRoot", "()Landroid/view/View;", "notSetRoot", "f", "getAppRoot", "appRoot", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-appchooser_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView */
/* loaded from: classes4.dex */
public final class C19724x5cc69f41 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f272859d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g notSetRoot;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g appRoot;

    /* renamed from: g, reason: collision with root package name */
    public boolean f272862g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19724x5cc69f41(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.notSetRoot = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d(this));
        this.appRoot = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c(this));
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.acv, (android.view.ViewGroup) this, false);
        setSelected(false);
    }

    /* renamed from: getAppRoot */
    private final android.view.View m75742xe79b26d() {
        return (android.view.View) this.appRoot.mo141623x754a37bb();
    }

    /* renamed from: getNotSetRoot */
    private final android.view.View m75743x1b0c1207() {
        return (android.view.View) this.notSetRoot.mo141623x754a37bb();
    }

    public final void a() {
        android.view.View m75746xfb84e958 = m75746xfb84e958();
        if (getChildCount() == 0 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(getChildAt(0), m75746xfb84e958)) {
            removeAllViews();
            addView(m75746xfb84e958);
        }
        m75744xd774fb11().setVisibility(this.f272862g ? 0 : 8);
    }

    /* renamed from: getCheckImg */
    public final android.widget.ImageView m75744xd774fb11() {
        android.view.View findViewById = m75746xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.e1l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    /* renamed from: getIconImg */
    public final android.widget.ImageView m75745x9f7aa054() {
        return (android.widget.ImageView) m75746xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.e1q);
    }

    /* renamed from: getRoot */
    public final android.view.View m75746xfb84e958() {
        return this.f272859d ? m75742xe79b26d() : m75743x1b0c1207();
    }

    /* renamed from: getTitleTv */
    public final android.widget.TextView m75747xefe232c4() {
        android.view.View findViewById = m75746xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.e1x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.TextView) findViewById;
    }

    /* renamed from: setChecked */
    public final void m75748xdd7d58e5(boolean z17) {
        this.f272862g = z17;
        setSelected(z17);
        if (z17) {
            m75744xd774fb11().setVisibility(0);
        } else {
            m75744xd774fb11().setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19724x5cc69f41(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.notSetRoot = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d(this));
        this.appRoot = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c(this));
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.acv, (android.view.ViewGroup) this, false);
        setSelected(false);
    }
}
