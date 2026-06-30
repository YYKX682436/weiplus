package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1674xc086f2ae;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/refreshloader/FinderRefreshHeader;", "Landroid/widget/RelativeLayout;", "Lon5/d;", "", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.refreshloader.FinderRefreshHeader */
/* loaded from: classes15.dex */
public final class C15431x5ce3fea2 extends android.widget.RelativeLayout implements on5.d, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f214484d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f214485e;

    public C15431x5ce3fea2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kernel, "kernel");
    }

    @Override // on5.g
    public void c(on5.f refreshLayout, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
    }

    @Override // on5.g
    public void d(float f17, int i17, int i18) {
    }

    @Override // on5.g
    public void f(on5.f refreshLayout, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        android.widget.TextView textView = this.f214484d;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTips");
            throw null;
        }
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        int ordinal = newState.ordinal();
        if (ordinal == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f214485e;
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
                throw null;
            }
        }
        if (ordinal != 5) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = this.f214485e;
        if (c22627xa933f8e42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
            throw null;
        }
        if (c22627xa933f8e42.getVisibility() != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e43 = this.f214485e;
            if (c22627xa933f8e43 != null) {
                c22627xa933f8e43.setVisibility(0);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
                throw null;
            }
        }
    }

    @Override // on5.g
    public sn5.c getSpinnerStyle() {
        return sn5.c.f491707b;
    }

    @Override // on5.g
    public android.view.View getView() {
        return this;
    }

    @Override // on5.g
    public int h(on5.f refreshLayout, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f214485e;
        if (c22627xa933f8e4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingIcon");
            throw null;
        }
        c22627xa933f8e4.setVisibility(8);
        if (z17) {
            return 0;
        }
        android.widget.TextView textView = this.f214484d;
        if (textView != null) {
            textView.setVisibility(0);
            return 500;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTips");
        throw null;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565129be0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f214484d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568121lr5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById2;
        this.f214485e = c22627xa933f8e4;
        c22627xa933f8e4.setVisibility(8);
    }

    public C15431x5ce3fea2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, li0.a.f400284e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            android.view.View.inflate(getContext(), resourceId, this);
        }
        obtainStyledAttributes.recycle();
    }
}
