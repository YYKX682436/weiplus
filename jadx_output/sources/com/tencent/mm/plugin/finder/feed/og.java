package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class og implements lj2.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f108642a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.y20 f108643b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.t0 f108644c;

    /* renamed from: d, reason: collision with root package name */
    public final int f108645d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f108646e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f108647f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.lg f108648g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.ng f108649h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f108650i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f108651j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f108652k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f108653l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f108654m;

    /* renamed from: n, reason: collision with root package name */
    public int f108655n;

    /* renamed from: o, reason: collision with root package name */
    public int f108656o;

    /* renamed from: p, reason: collision with root package name */
    public int f108657p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView f108658q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f108659r;

    public og(android.content.Context context, com.tencent.mm.plugin.finder.feed.y20 coverAbility, lj2.t0 buContextAbility, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(coverAbility, "coverAbility");
        kotlin.jvm.internal.o.g(buContextAbility, "buContextAbility");
        this.f108642a = context;
        this.f108643b = coverAbility;
        this.f108644c = buContextAbility;
        this.f108645d = i17;
        this.f108646e = "Finder.FeedVoiceRoomAdapter";
        this.f108647f = new java.util.LinkedList();
        this.f108648g = new com.tencent.mm.plugin.finder.feed.lg(this);
        this.f108649h = new com.tencent.mm.plugin.finder.feed.ng(this);
        this.f108650i = jz5.h.b(new com.tencent.mm.plugin.finder.feed.mg(this));
        this.f108651j = jz5.h.b(new com.tencent.mm.plugin.finder.feed.kg(this));
        this.f108652k = jz5.h.b(new com.tencent.mm.plugin.finder.feed.jg(this));
        this.f108653l = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ig(this));
        this.f108654m = jz5.h.b(new com.tencent.mm.plugin.finder.feed.gg(this));
        new android.graphics.Point(0, 0);
        this.f108659r = jz5.h.b(com.tencent.mm.plugin.finder.feed.hg.f106922d);
    }

    @Override // lj2.y0
    public void a(android.graphics.Point curWindowSize, int i17) {
        kotlin.jvm.internal.o.g(curWindowSize, "curWindowSize");
        float f17 = curWindowSize.x / ((android.graphics.Point) ((jz5.n) this.f108659r).getValue()).x;
        float m17 = fj2.r.f263182a.m(f17, curWindowSize, i17);
        com.tencent.mars.xlog.Log.i(this.f108646e, "updateWindowSize curWindowSize: " + curWindowSize + " scale = " + f17 + " translateY: " + m17);
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f108658q;
        if (liveVoiceRoomLayoutView != null) {
            liveVoiceRoomLayoutView.setTranslationY(-m17);
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView2 = this.f108658q;
        if (liveVoiceRoomLayoutView2 != null) {
            liveVoiceRoomLayoutView2.setScaleX(f17);
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView3 = this.f108658q;
        if (liveVoiceRoomLayoutView3 == null) {
            return;
        }
        liveVoiceRoomLayoutView3.setScaleY(f17);
    }

    @Override // lj2.y0
    public void b(com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView) {
        android.view.ViewGroup.LayoutParams layoutParams;
        this.f108658q = liveVoiceRoomLayoutView;
        if (liveVoiceRoomLayoutView != null) {
            ((fi2.e0) ((jz5.n) this.f108653l).getValue()).n(liveVoiceRoomLayoutView);
            ((fi2.k) ((jz5.n) this.f108654m).getValue()).g(liveVoiceRoomLayoutView);
        }
        if (liveVoiceRoomLayoutView == null || (layoutParams = liveVoiceRoomLayoutView.getLayoutParams()) == null) {
            return;
        }
        jz5.g gVar = this.f108659r;
        layoutParams.width = ((android.graphics.Point) ((jz5.n) gVar).getValue()).x;
        layoutParams.height = ((android.graphics.Point) ((jz5.n) gVar).getValue()).y;
    }

    @Override // lj2.y0
    public fi2.l c() {
        return (fi2.k) ((jz5.n) this.f108654m).getValue();
    }

    @Override // lj2.y0
    public void d(gk2.e buContext, int i17, int i18, int i19, int i27, android.graphics.Point curWindowSize, java.util.LinkedList dataList) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(curWindowSize, "curWindowSize");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f108655n = i17;
        this.f108656o = i18;
        this.f108657p = i19;
        java.util.LinkedList linkedList = this.f108647f;
        linkedList.clear();
        linkedList.addAll(dataList);
        a(curWindowSize, i27);
        f().j(linkedList, new android.graphics.Rect());
    }

    @Override // lj2.y0
    public ah2.f e() {
        return (fi2.e0) ((jz5.n) this.f108653l).getValue();
    }

    public final gi2.e f() {
        gi2.e d17;
        int i17 = this.f108655n;
        int i18 = this.f108656o;
        int i19 = this.f108657p;
        boolean z17 = false;
        if ((i17 == 0 && i19 == 1) || (i17 == 2 && i18 == 1)) {
            d17 = (gi2.e) ((jz5.n) this.f108650i).getValue();
        } else {
            if (i17 == 2 && i18 == 8) {
                d17 = (gi2.e) ((jz5.n) this.f108652k).getValue();
            } else {
                if ((i17 == 0 && i19 == 4) || (i17 == 2 && i18 == 16)) {
                    z17 = true;
                }
                d17 = z17 ? ((fi2.k) ((jz5.n) this.f108654m).getValue()).d() : (gi2.e) ((jz5.n) this.f108651j).getValue();
            }
        }
        com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = this.f108658q;
        if (liveVoiceRoomLayoutView != null) {
            liveVoiceRoomLayoutView.setAdapter(d17);
        }
        return d17;
    }

    @Override // lj2.y0
    public void onAttach() {
        ((fi2.e0) ((jz5.n) this.f108653l).getValue()).m();
    }

    @Override // lj2.y0
    public void reset() {
        java.util.LinkedList linkedList = this.f108647f;
        if (linkedList.size() > 0) {
            linkedList.clear();
            f().j(linkedList, new android.graphics.Rect());
        }
        ((fi2.e0) ((jz5.n) this.f108653l).getValue()).o();
    }
}
