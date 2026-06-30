package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB%\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/game/chatroom/view/ChatRoomPanelController;", "Landroid/widget/LinearLayout;", "", "pageCount", "Ljz5/f0;", "setDotView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "game-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomPanelController */
/* loaded from: classes15.dex */
public final class C15851x897977cd extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final long f220451d;

    /* renamed from: e, reason: collision with root package name */
    public final long f220452e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f220453f;

    /* renamed from: g, reason: collision with root package name */
    public final x33.a f220454g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 f220455h;

    /* renamed from: i, reason: collision with root package name */
    public int f220456i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f220457m;

    public C15851x897977cd(android.content.Context context, long j17, long j18) {
        super(context, null);
        x33.a a17 = x33.a.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f220454g = a17;
        this.f220457m = new java.util.HashMap();
        a17.f533144c.m78927xe7c66a1b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l0(this));
        a17.f533145d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m0(this));
        a17.f533143b.m78918xecb3a999(true);
        this.f220451d = j17;
        this.f220452e = j18;
    }

    /* renamed from: setDotView */
    private final void m64412x1f22f0cc(int i17) {
        x33.a aVar = this.f220454g;
        if (i17 < 2) {
            aVar.f533143b.setVisibility(8);
        } else {
            aVar.f533143b.setVisibility(0);
            aVar.f533143b.m78919xc4325fc8(i17);
        }
    }

    public final void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 c15739x67e9c971) {
        this.f220457m.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        int i18 = i17 * 8;
        int i19 = (i17 + 1) * 8;
        if (c15739x67e9c971.f36596x4d5f01f9.size() <= i19) {
            i19 = c15739x67e9c971.f36596x4d5f01f9.size();
        }
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4> subList = c15739x67e9c971.f36596x4d5f01f9.subList(i18, i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
        int i27 = 0;
        for (java.lang.Object obj : subList) {
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
            long j17 = (i17 * 4 * 2) + i28;
            long j18 = this.f220451d;
            long j19 = this.f220452e;
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15799x49519e4) obj).f36815x2efe91;
            if (str == null) {
                str = "";
            }
            fVar.c(j17, 1L, j18, j19, str);
            i27 = i28;
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15739x67e9c971 c15739x67e9c971) {
        if (c15739x67e9c971 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15739x67e9c971.f36596x4d5f01f9)) {
            return;
        }
        this.f220455h = c15739x67e9c971;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(getContext(), 0, 0, true, true);
        this.f220453f = z2Var;
        if (z2Var.h()) {
            return;
        }
        int size = ((c15739x67e9c971.f36596x4d5f01f9.size() - 1) / 8) + 1;
        this.f220456i = size;
        m64412x1f22f0cc(size);
        int i17 = this.f220456i;
        int i18 = 0;
        while (i18 < i17) {
            android.view.LayoutInflater from = android.view.LayoutInflater.from(getContext());
            x33.a aVar = this.f220454g;
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569921ry, (android.view.ViewGroup) aVar.f533144c, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15866x722f810f c15866x722f810f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15866x722f810f) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565152bg4);
            c15866x722f810f.f220549f2 = this.f220451d;
            c15866x722f810f.f220550g2 = this.f220452e;
            aVar.f533144c.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
            int i19 = i18 * 8;
            int i27 = i18 + 1;
            int i28 = i27 * 8;
            if (c15739x67e9c971.f36596x4d5f01f9.size() <= i28) {
                i28 = c15739x67e9c971.f36596x4d5f01f9.size();
            }
            c15866x722f810f.m64440x76491f2c(c15739x67e9c971.f36596x4d5f01f9.subList(i19, i28));
            if (i18 == 0) {
                a(0, c15739x67e9c971);
            }
            c15866x722f810f.f220551h2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.n0(this);
            i18 = i27;
        }
        z2Var.k(this, 0, 0);
        z2Var.C();
    }

    public C15851x897977cd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        x33.a a17 = x33.a.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f220454g = a17;
        this.f220457m = new java.util.HashMap();
        a17.f533144c.m78927xe7c66a1b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l0(this));
        a17.f533145d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m0(this));
        a17.f533143b.m78918xecb3a999(true);
    }

    public C15851x897977cd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        x33.a a17 = x33.a.a(android.view.LayoutInflater.from(getContext()), this, true);
        this.f220454g = a17;
        this.f220457m = new java.util.HashMap();
        a17.f533144c.m78927xe7c66a1b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l0(this));
        a17.f533145d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.m0(this));
        a17.f533143b.m78918xecb3a999(true);
    }
}
