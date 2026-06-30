package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03;

/* renamed from: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage */
/* loaded from: classes15.dex */
public class C15840x9669df9a extends android.widget.LinearLayout implements u33.l, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f220258d;

    /* renamed from: e, reason: collision with root package name */
    public long f220259e;

    /* renamed from: f, reason: collision with root package name */
    public long f220260f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f220261g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f220262h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f220263i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a f220264m;

    /* renamed from: mViewPager */
    private com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f36920x1c18ee31;

    /* renamed from: n, reason: collision with root package name */
    public u33.k f220265n;

    /* renamed from: o, reason: collision with root package name */
    public int f220266o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f220267p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f220268q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15717x73bbc431 f220269r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f220270s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f220271t;

    /* renamed from: u, reason: collision with root package name */
    public int f220272u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f220273v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f220274w;

    public C15840x9669df9a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220271t = false;
        this.f220272u = -1;
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f220273v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.5
            {
                this.f39173x3fe91575 = -409260457;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5239x4881ea67 c5239x4881ea67) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a c15840x9669df9a = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a.this;
                am.d2 d2Var = c5239x4881ea67.f135572g;
                c15840x9669df9a.e(d2Var.f87961a, d2Var.f87962b, d2Var.f87963c, d2Var.f87964d);
                return false;
            }
        };
        this.f220274w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5597xdd66dc5a>(a0Var) { // from class: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelPage.6
            {
                this.f39173x3fe91575 = 891116138;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5597xdd66dc5a c5597xdd66dc5a) {
                c5597xdd66dc5a.f135922g.f89243a = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a.this.f220266o;
                return false;
            }
        };
        android.content.Context context2 = getContext();
        this.f220258d = context2;
        this.f220259e = ((android.app.Activity) context2).getIntent().getLongExtra("game_report_sourceid", 0L);
        this.f220260f = ((android.app.Activity) this.f220258d).getIntent().getLongExtra("game_report_ssid", 0L);
        this.f220272u = ((android.app.Activity) this.f220258d).getIntent().getIntExtra("target_channel_id", -1);
        ((android.app.Activity) this.f220258d).getIntent().getLongExtra("target_seq", -1L);
        ((android.app.Activity) this.f220258d).getIntent().getBooleanExtra("is_real_time_room", false);
        android.view.LayoutInflater.from(this.f220258d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569916ru, this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.nts);
        this.f220263i = viewGroup;
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.b(this));
        this.f36920x1c18ee31 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d) findViewById(com.p314xaae8f345.mm.R.id.p1t);
        this.f220264m = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a(((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) this.f220258d).mo7595x9cdc264());
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a c15840x9669df9a, oa.i iVar, boolean z17) {
        c15840x9669df9a.getClass();
        android.view.View view = iVar.f425316f;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568731nv2);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nvc);
        if (z17) {
            textView2.setVisibility(8);
        }
        textView.setTextColor(c15840x9669df9a.f220258d.getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
    }

    @Override // u33.l
    public void I(java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            aVar.I(map);
        }
    }

    public final void c() {
        this.f220266o = 0;
        this.f220262h.setVisibility(8);
        int mo8338x7444f759 = this.f220264m.mo8338x7444f759();
        ((java.util.ArrayList) this.f220264m.f220278m).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db(this.f220268q, this.f220272u);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3();
        c15716x8f4414e3.f36470x8cea31d7 = 0;
        c15839xf36ce1db.f220244g = c15716x8f4414e3;
        c15839xf36ce1db.f220247m = 0;
        c15839xf36ce1db.f220245h = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = c15839xf36ce1db.f220242e;
        if (c15859x7405890d != null) {
            c15859x7405890d.t1(0, null);
        }
        ((java.util.ArrayList) this.f220264m.f220278m).add(c15839xf36ce1db);
        if (this.f36920x1c18ee31.m80829xf939df19() == null) {
            this.f36920x1c18ee31.mo79164x6cab2c8d(this.f220264m);
        }
        if (mo8338x7444f759 != 0) {
            this.f220264m.mo8343xced61ae5();
        }
        this.f36920x1c18ee31.m80844x940d026a(0);
    }

    @Override // u33.l
    public void c0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            aVar.c0(i17);
        }
    }

    public final android.view.View d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f220258d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569915rt, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568731nv2);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.nvc);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int i17 = c15716x8f4414e3.f36470x8cea31d7;
        if (!(i17 == 0)) {
            if (!(i17 == 1)) {
                stringBuffer.append("# ");
            }
        }
        stringBuffer.append(c15716x8f4414e3.f36472x337a8b);
        textView.setText(stringBuffer);
        if (c15716x8f4414e3.f36474xd8fdd641 != 0) {
            textView2.setVisibility(0);
            textView2.setText("+" + c15716x8f4414e3.f36474xd8fdd641);
        } else {
            textView2.setVisibility(8);
        }
        return inflate;
    }

    public void e(int i17, long j17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar == null || this.f36920x1c18ee31 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db b18 = aVar.b(i17);
        int indexOf = b18 != null ? ((java.util.ArrayList) aVar.f220278m).indexOf(b18) : -1;
        if (indexOf < 0) {
            return;
        }
        this.f36920x1c18ee31.m80844x940d026a(indexOf);
        if (z18 || (b17 = this.f220264m.b(i17)) == null || (c15859x7405890d = b17.f220242e) == null) {
            return;
        }
        c15859x7405890d.r1(j17, z17);
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f220278m).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next()).f220242e;
                if (c15859x7405890d != null) {
                    c15859x7405890d.s1();
                }
            }
        }
    }

    public synchronized void g(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15717x73bbc431 c15717x73bbc431, boolean z17) {
        u33.k kVar;
        if (c15717x73bbc431 != null) {
            try {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c15717x73bbc431.f36475xfb26965a)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15717x73bbc431 c15717x73bbc4312 = this.f220269r;
                    if (c15717x73bbc4312 != null && e43.f.a(c15717x73bbc4312, c15717x73bbc431)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatChannelPage", "setData channelInfo is same");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatChannelPage", "channel tab init");
                    this.f220269r = c15717x73bbc431;
                    this.f220267p = true;
                    boolean z18 = false;
                    this.f220262h.setVisibility(0);
                    this.f220262h.n();
                    this.f220262h.K.clear();
                    this.f220262h.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.d(this));
                    this.f36920x1c18ee31.m80821xa5a25773(new oa.j(this.f220262h));
                    if (this.f220264m.mo8338x7444f759() != 0 && (kVar = this.f220265n) != null) {
                        kVar.a(true, "");
                        this.f220265n.b(false, null, false);
                    }
                    int mo8338x7444f759 = this.f220264m.mo8338x7444f759();
                    ((java.util.ArrayList) this.f220264m.f220278m).clear();
                    for (int i17 = 0; i17 < c15717x73bbc431.f36475xfb26965a.size(); i17++) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3 = c15717x73bbc431.f36475xfb26965a.get(i17);
                        int i18 = this.f220272u;
                        if (i18 == c15716x8f4414e3.f36470x8cea31d7) {
                            c15717x73bbc431.f36476xac2dee95 = i18;
                        }
                    }
                    int i19 = 0;
                    int i27 = 0;
                    while (i19 < c15717x73bbc431.f36475xfb26965a.size()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e32 = c15717x73bbc431.f36475xfb26965a.get(i19);
                        oa.i l17 = this.f220262h.l();
                        l17.f425316f = d(c15716x8f4414e32);
                        l17.f();
                        this.f220262h.d(l17, z18);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db(str, c15717x73bbc431.f36476xac2dee95);
                        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3> linkedList = c15717x73bbc431.f36475xfb26965a;
                        c15839xf36ce1db.f220244g = c15716x8f4414e32;
                        int i28 = c15716x8f4414e32.f36470x8cea31d7;
                        c15839xf36ce1db.f220247m = i28;
                        c15839xf36ce1db.f220245h = linkedList;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = c15839xf36ce1db.f220242e;
                        if (c15859x7405890d != null) {
                            c15859x7405890d.t1(i28, linkedList);
                        }
                        ((java.util.ArrayList) this.f220264m.f220278m).add(c15839xf36ce1db);
                        int i29 = c15717x73bbc431.f36476xac2dee95;
                        int i37 = c15716x8f4414e32.f36470x8cea31d7;
                        if (i29 == i37) {
                            i27 = i19;
                        }
                        i19++;
                        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.o(i19, 1L, this.f220260f, this.f220259e, i37);
                        l17.f425311a = java.lang.Integer.valueOf(i19);
                        i27 = i27;
                        z18 = false;
                    }
                    if (mo8338x7444f759 != 0) {
                        this.f220264m.mo8343xced61ae5();
                    }
                    this.f36920x1c18ee31.m80853x40341e13(20);
                    if (this.f36920x1c18ee31.m80829xf939df19() == null) {
                        this.f36920x1c18ee31.mo79164x6cab2c8d(this.f220264m);
                    }
                    this.f220262h.k(i27).b();
                    return;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        if (!z17) {
            c();
        }
    }

    /* renamed from: getRookieChannel */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 m64398x4ec76fd8() {
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3> linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15717x73bbc431 c15717x73bbc431 = this.f220269r;
        if (c15717x73bbc431 == null || (linkedList = c15717x73bbc431.f36475xfb26965a) == null) {
            return null;
        }
        java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3> it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 next = it.next();
            if (next.f36470x8cea31d7 == 2) {
                return next;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm0.j1.d().a(4383, this);
        gm0.j1.d().a(4569, this);
        gm0.j1.d().a(4989, this);
        gm0.j1.d().a(4565, this);
        this.f220273v.mo48813x58998cd();
        this.f220274w.mo48813x58998cd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm0.j1.d().q(4383, this);
        gm0.j1.d().q(4569, this);
        gm0.j1.d().q(4989, this);
        gm0.j1.d().q(4565, this);
        this.f220273v.mo48814x2efc64();
        this.f220274w.mo48814x2efc64();
        if (this.f220269r != null && this.f220268q != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc c5580x225208dc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5580x225208dc();
            am.we weVar = c5580x225208dc.f135902g;
            weVar.f89811a = 2;
            weVar.f89812b = "cache_game_chat_msg#" + this.f220268q + "#channel";
            try {
                weVar.f89813c = this.f220269r.mo14344x5f01b1f6();
            } catch (java.io.IOException unused) {
            }
            c5580x225208dc.e();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f220270s;
        if (z2Var != null) {
            z2Var.B();
            this.f220270s = null;
        }
        this.f220271t = false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936 c15774x7e2f6936;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15836xb007e78 c15836xb007e78;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        if (mo808xfb85f7b0 == 4383) {
            boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15814x988b8d71) ((v33.u) m1Var).f514684e.f152243a.f152217a).f36857xca863027;
            if (i17 == 0 && i18 == 0) {
                db5.t7.h(this.f220258d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.axu : com.p314xaae8f345.mm.R.C30867xcad56011.axw));
                return;
            } else {
                db5.t7.g(this.f220258d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.axt : com.p314xaae8f345.mm.R.C30867xcad56011.axv));
                return;
            }
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        if (mo808xfb85f7b0 == 4569) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_CHAT_ROOM_VOTE_EDUCATION_INT, 1);
            v33.y yVar = (v33.y) m1Var;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = yVar.f514693e.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15836xb007e78 c15836xb007e782 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15836xb007e78) fVar2;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = yVar.f514693e.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgResponse");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15837x58370578 c15837x58370578 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15837x58370578) fVar3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c = c15837x58370578.f36915x5efe8648;
            if (c15780xf49d6a1c != null) {
                s33.y.h(this.f220258d, c15780xf49d6a1c);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad82 = c15837x58370578.f36917xc460ce3;
            if (c15835xa11d0ad82 != null) {
                if (c15835xa11d0ad82.f36911x9c46cbb) {
                    android.content.Context context = this.f220258d;
                    db5.t7.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw8), new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.f(this));
                    c15835xa11d0ad8 = c15835xa11d0ad82;
                    c15836xb007e78 = c15836xb007e782;
                    fVar.h(yVar.f514696h.intValue(), 37L, this.f220260f, this.f220259e, yVar.f514694f.longValue(), yVar.f514695g, 0L, this.f220266o, c15837x58370578.f36916x673436b7);
                } else {
                    c15835xa11d0ad8 = c15835xa11d0ad82;
                    c15836xb007e78 = c15836xb007e782;
                    fVar.h(yVar.f514696h.intValue(), 2L, this.f220260f, this.f220259e, yVar.f514694f.longValue(), yVar.f514695g, 0L, this.f220266o, c15837x58370578.f36916x673436b7);
                }
                long j17 = c15836xb007e78.seq;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
                if (aVar != null) {
                    java.util.Iterator it = ((java.util.ArrayList) aVar.f220278m).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next()).f220242e;
                        if (c15859x7405890d != null && (i3Var = c15859x7405890d.f220493f2) != null) {
                            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.f3(i3Var, j17, c15835xa11d0ad8));
                            java.util.Iterator it6 = ((java.util.HashSet) i3Var.f220703i).iterator();
                            while (it6.hasNext()) {
                                c43.x xVar = (c43.x) it6.next();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = xVar.f120028m;
                                if (c15731x94356d67 != null && c15731x94356d67.seq == j17) {
                                    xVar.j(c15835xa11d0ad8);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (mo808xfb85f7b0 == 4989) {
            v33.h hVar = (v33.h) m1Var;
            if (hVar.f514649f != 19527) {
                return;
            }
            this.f220271t = false;
            if (i17 != 0 || i18 != 0 || (c15774x7e2f6936 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15774x7e2f6936) hVar.f514648e.f152244b.f152233a) == null || this.f220264m == null) {
                return;
            }
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15793xe0873b6d> linkedList = c15774x7e2f6936.f36725xcf9821f6;
            if (this.f220270s == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                return;
            }
            this.f220270s.B();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15860xd36e4e26 c15860xd36e4e26 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15860xd36e4e26(this.f220258d);
            c15860xd36e4e26.m64438xe922de6b(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.c(this));
            c15860xd36e4e26.m64437x76491f2c(linkedList);
            this.f220270s.k(c15860xd36e4e26, 0, 0);
            this.f220270s.C();
            return;
        }
        if (mo808xfb85f7b0 == 4565 && i17 == 0 && i18 == 0) {
            android.content.Context context2 = this.f220258d;
            db5.t7.h(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fl9));
            v33.r rVar = (v33.r) m1Var;
            java.lang.Object mo141623x754a37bb = rVar.f514677g.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = ((com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb).f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse");
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15803xe9573740 c15803xe9573740 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15803xe9573740) fVar4;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d = c15803xe9573740.f36824xce4135be;
            if (c15828x8e93965d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15828x8e93965d.f36885xe8d344a9)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.n.b(this.f220258d, c15803xe9573740.f36824xce4135be.f36885xe8d344a9, -1, false, "");
            long j18 = this.f220260f;
            long j19 = this.f220259e;
            java.lang.Object mo141623x754a37bb2 = rVar.f514677g.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = ((com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb2).f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest");
            fVar.g(22L, 7L, j18, j19, ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15802xfaef3b0) fVar5).seq, "", 0L, 1);
            long j27 = this.f220260f;
            long j28 = this.f220259e;
            java.lang.Object mo141623x754a37bb3 = rVar.f514677g.mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar6 = ((com.p314xaae8f345.mm.p944x882e457a.o) mo141623x754a37bb3).f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar6, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest");
            fVar.g(22L, 14L, j27, j28, ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15802xfaef3b0) fVar6).seq, "", 0L, 1);
        }
    }

    /* renamed from: setChatRoomJumpInfo */
    public void m64399xb8727ff1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15724x3096736f c15724x3096736f) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f220278m).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next();
                c15839xf36ce1db.f220251q = c15724x3096736f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = c15839xf36ce1db.f220242e;
                if (c15859x7405890d != null) {
                    c15859x7405890d.m64432xb8727ff1(c15724x3096736f);
                }
            }
        }
    }

    /* renamed from: setHostContact */
    public void m64400x21b25396(u33.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f220278m).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next();
                c15839xf36ce1db.f220250p = hVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = c15839xf36ce1db.f220242e;
                if (c15859x7405890d != null) {
                    c15859x7405890d.m64433x21b25396(hVar);
                }
            }
        }
    }

    /* renamed from: setJumpFirstSeq */
    public void m64401x97990b5f(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f220278m).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next();
                c15839xf36ce1db.f220254t = j17;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = c15839xf36ce1db.f220242e;
                if (c15859x7405890d != null) {
                    c15859x7405890d.m64434x97990b5f(j17);
                }
            }
        }
    }

    /* renamed from: setPreloadInfo */
    public void m64402x49fad495(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15780xf49d6a1c c15780xf49d6a1c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f220278m).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next();
                c15839xf36ce1db.f220252r = c15780xf49d6a1c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = c15839xf36ce1db.f220242e;
                if (c15859x7405890d != null) {
                    c15859x7405890d.m64435x49fad495(c15780xf49d6a1c);
                }
            }
        }
    }

    /* renamed from: setPremadeCardInfo */
    public void m64403xb9ff1174(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.a aVar = this.f220264m;
        if (aVar != null) {
            java.util.Iterator it = ((java.util.ArrayList) aVar.f220278m).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) it.next();
                c15839xf36ce1db.f220253s = str;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d c15859x7405890d = c15839xf36ce1db.f220242e;
                if (c15859x7405890d != null) {
                    c15859x7405890d.m64436xb9ff1174(str);
                }
            }
        }
    }

    /* renamed from: setUICallback */
    public void m64404x30fe4db(u33.k kVar) {
        this.f220265n = kVar;
    }
}
