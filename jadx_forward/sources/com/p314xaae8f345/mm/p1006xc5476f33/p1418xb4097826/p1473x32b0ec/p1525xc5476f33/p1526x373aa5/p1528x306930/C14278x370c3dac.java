package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001b\u0018\u00002\u00020\u0001:\u0001)B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B#\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020\u0014¢\u0006\u0004\b%\u0010(J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveCustomGiftTagView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "touchBlock", "setTouchBlock", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "g", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRv", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "rv", "", "value", "i", "I", "setSelectedTabIndex", "(I)V", "selectedTabIndex", "dl2/c", "n", "Ljz5/g;", "getAdapter", "()Ldl2/c;", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dl2/a", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView */
/* loaded from: classes3.dex */
public final class C14278x370c3dac extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f196279e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f196280f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 rv;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f196282h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int selectedTabIndex;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f196284m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14278x370c3dac(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "FinderLiveCustomGiftTagView";
        this.adapter = jz5.h.b(new dl2.d(this));
        c(context);
    }

    /* renamed from: getAdapter */
    private final dl2.c m57093xf939df19() {
        return (dl2.c) this.adapter.mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSelectedTabIndex */
    public final void m57094xca767a(int i17) {
        if (this.selectedTabIndex == m57095x5db1c3a().getChildCount() - 1) {
            dk2.u7 u7Var = dk2.u7.f315714a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dk2.u7.f315722i, "<get-pkgGiftCache>(...)");
            if (!r0.isEmpty()) {
                zl2.r4.f555483a.T2(6);
            }
        }
        this.selectedTabIndex = i17;
    }

    public final void b(int i17) {
        m57094xca767a(i17);
        m57093xf939df19().m8146xced61ae5();
    }

    public final void c(android.content.Context context) {
        this.f196279e = context;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.asa, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f196280f = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f3c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m57097x6843646((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById);
        m57095x5db1c3a().mo7960x6cab2c8d(m57093xf939df19());
        m57095x5db1c3a().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
    }

    public final void d(java.util.List giftTabList, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftTabList, "giftTabList");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, this + ", giftTabList:" + giftTabList);
        this.f196282h = giftTabList;
        this.f196284m = lVar;
        m57093xf939df19().m8146xced61ae5();
    }

    /* renamed from: getRv */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m57095x5db1c3a() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.rv;
        if (c22849x81a93d25 != null) {
            return c22849x81a93d25;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rv");
        throw null;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    /* renamed from: setRv */
    public final void m57097x6843646(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22849x81a93d25, "<set-?>");
        this.rv = c22849x81a93d25;
    }

    /* renamed from: setTouchBlock */
    public final void m57098xbb97aa90(yz5.a touchBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchBlock, "touchBlock");
        m57095x5db1c3a().setOnTouchListener(new dl2.e(touchBlock));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14278x370c3dac(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "FinderLiveCustomGiftTagView";
        this.adapter = jz5.h.b(new dl2.d(this));
        c(context);
    }
}
