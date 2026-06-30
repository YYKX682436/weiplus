package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1528x306930;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0015\u0018\u00002\u00020\u0001:\u0001#B\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B#\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\"J\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "touchBlock", "setTouchBlock", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "f", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "setRv", "(Lcom/tencent/mm/view/recyclerview/WxRecyclerView;)V", "rv", "", "value", "m", "I", "setSelectedTabIndex", "(I)V", "selectedTabIndex", "dl2/i0", "p", "Ljz5/g;", "getAdapter", "()Ldl2/i0;", "adapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dl2/g0", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView */
/* loaded from: classes3.dex */
public final class C14279xd5b5745d extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f196286d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f196287e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 rv;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f196289g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f196290h;

    /* renamed from: i, reason: collision with root package name */
    public int f196291i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int selectedTabIndex;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f196293n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f196294o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g adapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14279xd5b5745d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f196291i = -1;
        this.adapter = jz5.h.b(new dl2.j0(this));
        d(context);
    }

    /* renamed from: getAdapter */
    private final dl2.i0 m57099xf939df19() {
        return (dl2.i0) this.adapter.mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setSelectedTabIndex */
    public final void m57100xca767a(int i17) {
        if (this.selectedTabIndex == m57101x5db1c3a().getChildCount() - 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dk2.u7.f315722i, "<get-pkgGiftCache>(...)");
            if (!r0.isEmpty()) {
                zl2.r4.f555483a.T2(6);
            }
        }
        this.selectedTabIndex = i17;
    }

    public final void b(int i17) {
        m57100xca767a(c(i17));
        m57099xf939df19().m8146xced61ae5();
    }

    public final int c(int i17) {
        int i18;
        java.util.List list = this.f196290h;
        jz5.f0 f0Var = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = 0;
                    break;
                }
                java.lang.Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (i17 < ((java.lang.Number) next).intValue()) {
                    break;
                }
                i18 = i19;
            }
            f0Var = jz5.f0.f384359a;
        } else {
            i18 = 0;
        }
        if (f0Var == null) {
            return 0;
        }
        return i18;
    }

    public final void d(android.content.Context context) {
        this.f196286d = context;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.asa, this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f196287e = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f3c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        m57102x6843646((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById);
        m57101x5db1c3a().mo7960x6cab2c8d(m57099xf939df19());
        m57101x5db1c3a().mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
    }

    public final void e(java.util.LinkedHashMap giftTabMap, java.util.LinkedList eachTabEndIndexList, boolean z17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftTabMap, "giftTabMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eachTabEndIndexList, "eachTabEndIndexList");
        java.util.Set keySet = giftTabMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        this.f196289g = kz5.n0.S0(keySet);
        this.f196290h = eachTabEndIndexList;
        this.f196293n = lVar;
        this.f196294o = z17;
        m57099xf939df19().m8146xced61ae5();
    }

    /* renamed from: getRv */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m57101x5db1c3a() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.rv;
        if (c22849x81a93d25 != null) {
            return c22849x81a93d25;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rv");
        throw null;
    }

    /* renamed from: setRv */
    public final void m57102x6843646(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c22849x81a93d25, "<set-?>");
        this.rv = c22849x81a93d25;
    }

    /* renamed from: setTouchBlock */
    public final void m57103xbb97aa90(yz5.a touchBlock) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchBlock, "touchBlock");
        m57101x5db1c3a().setOnTouchListener(new dl2.k0(touchBlock));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14279xd5b5745d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f196291i = -1;
        this.adapter = jz5.h.b(new dl2.j0(this));
        d(context);
    }
}
