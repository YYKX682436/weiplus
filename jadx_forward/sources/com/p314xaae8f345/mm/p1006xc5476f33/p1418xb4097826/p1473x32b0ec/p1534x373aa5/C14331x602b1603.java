package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "Ljz5/f0;", "m", "Lyz5/l;", "getTabOnclickListener", "()Lyz5/l;", "setTabOnclickListener", "(Lyz5/l;)V", "tabOnclickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator */
/* loaded from: classes5.dex */
public final class C14331x602b1603 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f197532d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f197533e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f197534f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f197535g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f197536h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f197537i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.l tabOnclickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14331x602b1603(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.atc, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f566235f72);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f197532d = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f7k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f197533e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f197534f = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f7m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f7l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f197535g = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.f566236f73);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f197536h = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.f566237f74);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f197537i = findViewById7;
        findViewById.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.z5(this));
        findViewById6.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.a6(this));
        findViewById7.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.b6(this));
    }

    public final yz5.l getTabOnclickListener() {
        return this.tabOnclickListener;
    }

    /* renamed from: setTabOnclickListener */
    public final void m57363xc15bba8a(yz5.l lVar) {
        this.tabOnclickListener = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14331x602b1603(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
