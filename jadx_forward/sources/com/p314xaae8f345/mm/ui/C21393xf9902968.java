package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.LiveTalkRoomTipsBar */
/* loaded from: classes8.dex */
public class C21393xf9902968 extends android.widget.LinearLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f278402v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f278403d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f278404e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f278405f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f278406g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f278407h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f278408i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f278409m;

    /* renamed from: n, reason: collision with root package name */
    public yb5.d f278410n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f278411o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f278412p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f278413q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f278414r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f278415s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f278416t;

    /* renamed from: u, reason: collision with root package name */
    public m40.m0 f278417u;

    public C21393xf9902968(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278411o = context;
        a();
    }

    public static void b(oo0.a aVar, android.content.Context context) {
        en0.g gVar = new en0.g();
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        if (iq.b.g(context) || iq.b.C(context) || iq.b.v(context) || iq.b.e(context)) {
            return;
        }
        gVar.f336779a = !((oo0.d) aVar).f67833xff015a4 ? 1 : 0;
        oo0.d dVar = (oo0.d) aVar;
        gVar.f336783e = dVar.f67836x7b284d5e;
        gVar.f336780b = dVar.f67832x7560f783;
        gVar.f336781c = dVar.f67834x41d5e0c;
        gVar.f336782d = dVar.f67835x7240533c;
        gVar.f336786h = 1;
        gVar.f336784f = dVar.f67831x1e43a490;
        gVar.a();
        if (dVar.f67833xff015a4) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickTipbarEnterLive");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1381L, 1L, 1L);
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.brn, this);
        this.f278403d = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.ifj);
        this.f278405f = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.ifh);
        this.f278412p = findViewById(com.p314xaae8f345.mm.R.id.aun);
        this.f278413q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.a4f);
        this.f278414r = findViewById(com.p314xaae8f345.mm.R.id.ifg);
        this.f278404e = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.ifq);
        this.f278407h = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.ifl);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f278411o).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bro, (android.view.ViewGroup) null);
        this.f278408i = inflate;
        this.f278407h.addFooterView(inflate);
        this.f278406g = findViewById(com.p314xaae8f345.mm.R.id.ifk);
        this.f278417u = (m40.m0) findViewById(com.p314xaae8f345.mm.R.id.ifn);
        c(true, false);
        this.f278403d.setOnClickListener(new com.p314xaae8f345.mm.ui.l9(this));
        this.f278405f.setVisibility(8);
        this.f278405f.setOnClickListener(new com.p314xaae8f345.mm.ui.m9(this));
        this.f278406g.setOnClickListener(new com.p314xaae8f345.mm.ui.n9(this));
    }

    public final void c(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2;
        if (z17) {
            if (this.f278404e.getVisibility() == 0 && z18) {
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559391dg);
                loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.o9(this));
                this.f278404e.startAnimation(loadAnimation);
            } else {
                this.f278404e.setVisibility(8);
                if (!this.f278415s) {
                    this.f278404e.setVisibility(8);
                    setVisibility(8);
                    m78470xc68cad45(false);
                    boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj6);
                    if (fj6 && (c22789xd23e9a9b2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) this.f278417u).f212737i) != null) {
                        c22789xd23e9a9b2.n();
                    }
                }
            }
            m78470xc68cad45(false);
            return;
        }
        if (this.f278404e.getVisibility() != 0) {
            this.f278404e.setVisibility(0);
            m78470xc68cad45(true);
            if (z18) {
                this.f278404e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559387dc));
                android.view.View view = this.f278409m;
                if (view != null) {
                    view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
                }
            }
        }
        if (!this.f278415s) {
            this.f278404e.setVisibility(8);
            setVisibility(8);
            m78470xc68cad45(false);
            boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj7);
            if (fj7 && (c22789xd23e9a9b = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) this.f278417u).f212737i) != null) {
                c22789xd23e9a9b.n();
            }
        }
        yb5.d dVar = this.f278410n;
        if (dVar != null) {
            dVar.y();
        }
    }

    /* renamed from: setChattingContext */
    public void m78466x4001c3c7(yb5.d dVar) {
        this.f278410n = dVar;
    }

    /* renamed from: setChattingUserName */
    public void m78467xd22231de(java.lang.String str) {
        this.f278416t = str;
    }

    /* renamed from: setInChatRoom */
    public void m78468x5d729e9a(boolean z17) {
        this.f278415s = z17;
    }

    /* renamed from: setRootTipsBarBackground */
    public void m78469xc68cad45(android.view.View view) {
        this.f278409m = view;
    }

    /* renamed from: setRootTipsBarBackground */
    public void m78470xc68cad45(boolean z17) {
        android.view.View view = this.f278409m;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f278409m.setOnClickListener(new com.p314xaae8f345.mm.ui.p9(this));
                android.view.View view2 = this.f278412p;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f278413q;
                if (c22699x3dcdb352 != null) {
                    c22699x3dcdb352.setVisibility(4);
                }
                android.view.View view3 = this.f278414r;
                if (view3 != null) {
                    view3.setBackgroundColor(0);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f278412p;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f278413q;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.setVisibility(0);
            }
            android.view.View view5 = this.f278414r;
            if (view5 != null) {
                view5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b7a);
            }
        }
    }

    public C21393xf9902968(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278411o = context;
        a();
    }
}
