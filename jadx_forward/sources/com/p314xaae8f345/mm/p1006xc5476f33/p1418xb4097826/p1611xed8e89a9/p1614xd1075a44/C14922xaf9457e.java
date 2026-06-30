package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/widget/DemoFooter;", "Landroid/widget/RelativeLayout;", "Lon5/c;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.widget.DemoFooter */
/* loaded from: classes15.dex */
public final class C14922xaf9457e extends android.widget.RelativeLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f205989d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f205990e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f205991f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f205992g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f205993h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f205994i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f205995m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f205996n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f205997o;

    /* renamed from: p, reason: collision with root package name */
    public final int f205998p;

    public C14922xaf9457e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f205998p = 500;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.b6t, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m68);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f205989d = textView;
        this.f205990e = "上拉加载更多";
        this.f205991f = "释放立即加载";
        this.f205992g = "正在加载…";
        this.f205993h = "等待头部刷新完成…";
        this.f205994i = "加载完成";
        this.f205995m = "加载失败";
        this.f205996n = "没有更多数据了";
        textView.setText(isInEditMode() ? "正在加载…" : "上拉加载更多");
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        if (this.f205997o == z17) {
            return true;
        }
        this.f205997o = z17;
        android.widget.TextView textView = this.f205989d;
        if (z17) {
            textView.setText(this.f205996n);
            return true;
        }
        textView.setText(this.f205990e);
        return true;
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
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (this.f205997o) {
            return;
        }
        int ordinal = newState.ordinal();
        android.widget.TextView textView = this.f205989d;
        if (ordinal == 1 || ordinal == 2) {
            textView.setText(this.f205992g);
            return;
        }
        java.lang.String str = this.f205990e;
        if (ordinal == 3) {
            textView.setText(str);
            return;
        }
        if (ordinal == 7) {
            textView.setText(str);
        } else if (ordinal == 10) {
            textView.setText(this.f205993h);
        } else {
            if (ordinal != 11) {
                return;
            }
            textView.setText(this.f205991f);
        }
    }

    @Override // on5.g
    /* renamed from: getSpinnerStyle */
    public sn5.c mo56606x2a3c758e() {
        return sn5.c.f491707b;
    }

    @Override // on5.g
    /* renamed from: getView */
    public android.view.View mo56607xfb86a31b() {
        return this;
    }

    @Override // on5.g
    public int h(on5.f refreshLayout, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        if (this.f205997o) {
            return 0;
        }
        this.f205989d.setText(z17 ? this.f205994i : this.f205995m);
        return this.f205998p;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }
}
