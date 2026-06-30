package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBannerView */
/* loaded from: classes5.dex */
public class ViewOnClickListenerC15938x425ae5a3 extends android.widget.LinearLayout implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222188d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f222189e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v f222190f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce f222191g;

    /* renamed from: h, reason: collision with root package name */
    public int f222192h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f222193i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f222194m;

    /* renamed from: n, reason: collision with root package name */
    public float f222195n;

    /* renamed from: o, reason: collision with root package name */
    public float f222196o;

    public ViewOnClickListenerC15938x425ae5a3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f222192h = 0;
        this.f222194m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.t(this), true);
        this.f222195n = 0.0f;
        this.f222196o = 0.0f;
        this.f222188d = context;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bdy, this);
        this.f222193i = new java.util.LinkedList();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u)) {
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u) view.getTag();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = uVar.f223308a;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uVar.f223310c);
        android.content.Context context = this.f222188d;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameBannerView", "null or nil url");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putCharSequence("game_app_id", mVar.f67370x28d45f97);
            bundle.putInt("game_report_from_scene", 5);
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this.f222188d, 11, 1101, 1, r53.f.o(context, mVar.f67370x28d45f97, null, bundle, 0), this.f222192h, null);
        } else {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this.f222188d, 11, 1101, 1, r53.f.v(context, uVar.f223310c, null, null), this.f222192h, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f222191g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce) findViewById(com.p314xaae8f345.mm.R.id.gik);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.gil);
        this.f222189e = c1190x18d3c3fe;
        c1190x18d3c3fe.m8322x2d3430b4(this);
        this.f222190f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.v(this, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0 != 3) goto L19;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            float r1 = r7.getRawX()
            float r2 = r7.getRawY()
            r3 = 3
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 == r4) goto L34
            r5 = 2
            if (r0 == r5) goto L18
            if (r0 == r3) goto L34
            goto L48
        L18:
            float r0 = r6.f222195n
            float r1 = r1 - r0
            int r0 = (int) r1
            float r1 = r6.f222196o
            float r2 = r2 - r1
            int r1 = (int) r2
            int r0 = java.lang.Math.abs(r0)
            int r1 = java.lang.Math.abs(r1)
            if (r0 <= r1) goto L48
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L48
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L48
        L34:
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L3e
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L3e:
            r0 = 0
            r6.f222195n = r0
            r6.f222196o = r0
            goto L48
        L44:
            r6.f222195n = r1
            r6.f222196o = r2
        L48:
            int r0 = r7.getAction()
            com.tencent.mm.sdk.platformtools.b4 r1 = r6.f222194m
            if (r0 == 0) goto L5b
            if (r0 == r4) goto L55
            if (r0 == r3) goto L55
            goto L5e
        L55:
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.c(r2, r2)
            goto L5e
        L5b:
            r1.d()
        L5e:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ViewOnClickListenerC15938x425ae5a3.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        java.util.LinkedList linkedList = this.f222193i;
        int size = i17 % linkedList.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameBannerView", "now selected page %d, now exactly positon : %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(size));
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u) linkedList.get(size)).f223308a == null || !gm0.j1.a()) {
            return;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this.f222188d, 11, 1101, size + 1, 1, this.f222192h, null);
    }

    /* renamed from: setBannerList */
    public void m64732xdee333ec(java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.u> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameBannerView", "Empty banner list");
            setVisibility(8);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameBannerView", "bannerList size", java.lang.Integer.valueOf(linkedList.size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f222194m;
        b4Var.d();
        java.util.LinkedList linkedList2 = this.f222193i;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        this.f222189e.m8315x6cab2c8d(this.f222190f);
        this.f222189e.m8317x940d026a(linkedList.size() * 1000, false);
        if (linkedList2.size() > 1) {
            b4Var.c(5000L, 5000L);
        }
        this.f222191g.setVisibility(8);
        setVisibility(0);
    }

    /* renamed from: setSourceScene */
    public void m64733x6a7f536f(int i17) {
        this.f222192h = i17;
    }
}
