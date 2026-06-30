package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.ChatRoomStateView */
/* loaded from: classes15.dex */
public class C15852x6de633a3 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f220458d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f220459e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15847x71fbf6b5 f220460f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f220461g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f220462h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f220463i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f220464m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f220465n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f220466o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f220467p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15796x2d45dd0b f220468q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f220469r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f220470s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f220471t;

    public C15852x6de633a3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220467p = new java.util.concurrent.CopyOnWriteArrayList();
        this.f220470s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.o0(this), false);
        this.f220471t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p0(this), false);
        this.f220458d = context;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569925s2, this);
        this.f220460f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15847x71fbf6b5) findViewById(com.p314xaae8f345.mm.R.id.bgb);
    }

    public final void a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f220469r)) {
            return;
        }
        this.f220465n.setTextColor(this.f220458d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        this.f220465n.setText(this.f220469r);
        this.f220465n.setVisibility(0);
        this.f220465n.setTag(1);
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15796x2d45dd0b c15796x2d45dd0b) {
        if (this.f220459e == null || c15796x2d45dd0b == null) {
            return;
        }
        this.f220468q = c15796x2d45dd0b;
        android.view.View view = this.f220461g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView", "showNotification", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Notification;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomStateView", "showNotification", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/Notification;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f220461g.setClickable(false);
        if (c15796x2d45dd0b.f36797x28d1961f != null) {
            this.f220461g.setClickable(true);
            this.f220461g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.q0(this, c15796x2d45dd0b));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = c15796x2d45dd0b.f36794x7966cd12;
        if (c15748x3e43f43 != null) {
            java.lang.String str = c15748x3e43f43.f36646xa0e2915a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.Integer l17 = s33.y.l(str);
            if (l17 != null) {
                ((android.graphics.drawable.GradientDrawable) this.f220461g.getBackground()).setColor(l17.intValue());
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15796x2d45dd0b.f36798x8631f5e1)) {
            this.f220462h.setVisibility(8);
        } else {
            this.f220462h.setVisibility(0);
            if (!(this.f220462h.getTag() instanceof java.lang.String) || !this.f220462h.getTag().equals(c15796x2d45dd0b.f36798x8631f5e1)) {
                this.f220462h.setTag(c15796x2d45dd0b.f36798x8631f5e1);
                r53.y.a().e(this.f220462h, c15796x2d45dd0b.f36798x8631f5e1, null, null);
            }
        }
        this.f220463i.setText(c15796x2d45dd0b.f36804x5ae4fc98);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f432 = c15796x2d45dd0b.f36803x6bc869ee;
        if (c15748x3e43f432 != null) {
            java.lang.String str2 = c15748x3e43f432.f36646xa0e2915a;
            java.lang.Integer l18 = s33.y.l(str2 != null ? str2 : "");
            if (l18 != null) {
                this.f220463i.setTextColor(l18.intValue());
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15796x2d45dd0b.f36801x88995b6c)) {
            this.f220464m.setVisibility(8);
            return;
        }
        this.f220464m.setVisibility(0);
        if (!(this.f220464m.getTag() instanceof java.lang.String) || !this.f220464m.getTag().equals(c15796x2d45dd0b.f36801x88995b6c)) {
            this.f220464m.setTag(c15796x2d45dd0b.f36801x88995b6c);
            r53.y.a().e(this.f220464m, c15796x2d45dd0b.f36801x88995b6c, null, null);
        }
        this.f220464m.setClickable(false);
        if (c15796x2d45dd0b.f36800xd8d50906) {
            this.f220464m.setClickable(true);
            this.f220464m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.r0(this, c15796x2d45dd0b));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f220470s;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f220471t;
        if (b4Var2 != null) {
            b4Var2.d();
        }
    }

    /* renamed from: setPremadeCardInfo */
    public void m64413xb9ff1174(java.lang.String str) {
        this.f220460f.m64408xb9ff1174(str);
    }

    /* renamed from: setStateChangeListener */
    public void m64414x599de7b3(u33.l lVar) {
        this.f220460f.m64409x599de7b3(lVar);
    }

    public C15852x6de633a3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f220467p = new java.util.concurrent.CopyOnWriteArrayList();
        this.f220470s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.o0(this), false);
        this.f220471t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p0(this), false);
        this.f220458d = context;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569925s2, this);
        this.f220460f = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15847x71fbf6b5) findViewById(com.p314xaae8f345.mm.R.id.bgb);
    }
}
