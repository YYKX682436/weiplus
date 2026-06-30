package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.p2024x2efde3.p2025x40b292db.p2027x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/view/DemoFooter;", "Landroid/widget/RelativeLayout;", "Lon5/c;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.view.DemoFooter */
/* loaded from: classes15.dex */
public final class C17176xaf9457e extends android.widget.RelativeLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f239637d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f239638e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f239639f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f239640g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f239641h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f239642i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f239643m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f239644n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239645o;

    /* renamed from: p, reason: collision with root package name */
    public final int f239646p;

    public C17176xaf9457e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f239646p = 500;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cf6, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m68);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f239637d = textView;
        this.f239638e = "上拉加载更多";
        this.f239639f = "释放立即加载";
        this.f239640g = "正在加载…";
        this.f239641h = "等待头部刷新完成…";
        this.f239642i = "加载完成";
        this.f239643m = "加载失败";
        this.f239644n = "没有更多数据了";
        textView.setText(isInEditMode() ? "正在加载…" : "上拉加载更多");
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        if (this.f239645o == z17) {
            return true;
        }
        this.f239645o = z17;
        android.widget.TextView textView = this.f239637d;
        if (z17) {
            textView.setText(this.f239644n);
            return true;
        }
        textView.setText(this.f239638e);
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
    public boolean e() {
        return false;
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
        if (this.f239645o) {
            return;
        }
        int ordinal = newState.ordinal();
        android.widget.TextView textView = this.f239637d;
        if (ordinal == 1 || ordinal == 2) {
            textView.setText(this.f239640g);
            return;
        }
        java.lang.String str = this.f239638e;
        if (ordinal == 3) {
            textView.setText(str);
            return;
        }
        if (ordinal == 7) {
            textView.setText(str);
        } else if (ordinal == 10) {
            textView.setText(this.f239641h);
        } else {
            if (ordinal != 11) {
                return;
            }
            textView.setText(this.f239639f);
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
        if (this.f239645o) {
            return 0;
        }
        this.f239637d.setText(z17 ? this.f239642i : this.f239643m);
        return this.f239646p;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }
}
