package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0019\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "", "Ljz5/f0;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setSelectChangeListener", "bgDrawable", "setIndicatorBg", "", "isSelectBold", "setSelectToBold", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "jw2/b", "jw2/e", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView */
/* loaded from: classes9.dex */
public final class C15207xe9913b6c extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f212324d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f212325e;

    /* renamed from: f, reason: collision with root package name */
    public int f212326f;

    /* renamed from: g, reason: collision with root package name */
    public final jw2.e f212327g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15206x9fc9f265 f212328h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f212329i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f212330m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f212331n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15207xe9913b6c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212325e = new java.util.ArrayList();
        jw2.e eVar = new jw2.e(this, context);
        this.f212327g = eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15206x9fc9f265 c15206x9fc9f265 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15206x9fc9f265(context);
        this.f212328h = c15206x9fc9f265;
        jw2.b bVar = new jw2.b(this);
        this.f212330m = new jw2.f(this);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570617b83, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mka);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.lpv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f212324d = (android.widget.TextView) findViewById2;
        c1163xf1deaba4.mo7967x900dcbe1(c15206x9fc9f265);
        c1163xf1deaba4.mo7960x6cab2c8d(eVar);
        bVar.b(c1163xf1deaba4);
    }

    /* renamed from: setIndicatorBg */
    public final void m61565x20d438f2(int i17) {
        this.f212324d.setBackgroundResource(i17);
    }

    /* renamed from: setSelectChangeListener */
    public final void m61566x10ee1022(yz5.l lVar) {
        this.f212329i = lVar;
    }

    /* renamed from: setSelectToBold */
    public final void m61567x1239093e(boolean z17) {
        this.f212331n = z17;
    }
}
