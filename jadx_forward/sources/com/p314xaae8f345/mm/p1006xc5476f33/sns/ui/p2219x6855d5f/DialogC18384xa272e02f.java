package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog;", "Lhg5/d;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "refreshDataOnContextResume", "checkDismissOnContextDestroy", "Landroid/content/Context;", "uiContext", "", "mLocalId", "exposeScene", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "<init>", "(Landroid/content/Context;III)V", "SnsObjectDetailEventListener", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog */
/* loaded from: classes4.dex */
public final class DialogC18384xa272e02f extends hg5.d implements p012xc85e97e9.p093xedfae76a.x {
    public static final /* synthetic */ int M = 0;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.SnsObjectDetailEventListener G;
    public boolean H;
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.ArrayList f251993J;
    public boolean K;
    public final jz5.g L;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f251994r;

    /* renamed from: s, reason: collision with root package name */
    public final int f251995s;

    /* renamed from: t, reason: collision with root package name */
    public final int f251996t;

    /* renamed from: u, reason: collision with root package name */
    public final int f251997u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f251998v;

    /* renamed from: w, reason: collision with root package name */
    public int f251999w;

    /* renamed from: x, reason: collision with root package name */
    public int f252000x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f252001y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f252002z;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$SnsObjectDetailEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ReturnSnsObjectDetailEvent;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog;", "weakRef", "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener */
    /* loaded from: classes4.dex */
    public static final class SnsObjectDetailEventListener extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2> {

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.ref.WeakReference f252003d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f252004e;

        public SnsObjectDetailEventListener(java.lang.ref.WeakReference<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f> weakReference) {
            super(com.p314xaae8f345.mm.app.a0.f134821d);
            this.f252003d = weakReference;
            this.f252004e = "MicroMsg.SnsObjectDetailEventListener[" + hashCode() + ']';
            this.f39173x3fe91575 = -1656522510;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        
            if (r2 != false) goto L18;
         */
        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2 r11) {
            /*
                r10 = this;
                java.lang.String r0 = "callback"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener"
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
                com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent r11 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5943x201a82e2) r11
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
                java.lang.String r2 = "event"
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r2)
                r2 = 0
                java.lang.String r3 = r10.f252004e
                java.lang.ref.WeakReference r4 = r10.f252003d
                if (r4 != 0) goto L22
                java.lang.String r11 = "callback: snsGroupDialog weakRef null"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r11)
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
                goto Lc5
            L22:
                java.lang.Object r4 = r4.get()
                com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog r4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f) r4
                if (r4 != 0) goto L34
                java.lang.String r11 = "callback: snsGroupDialog had destroy"
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r11)
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
                goto Lc5
            L34:
                am.as r11 = r11.f136244g
                com.tencent.mm.protocal.protobuf.SnsObject r11 = r11.f87718a
                r5 = 1
                if (r11 == 0) goto La2
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "returnSnsObjectDetailEventListener snsid:"
                r6.<init>(r7)
                long r7 = r11.Id
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6)
                com.tencent.mm.protocal.protobuf.SnsObject r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.L(r4)
                if (r6 == 0) goto L66
                com.tencent.mm.protocal.protobuf.SnsObject r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.L(r4)
                if (r6 == 0) goto L64
                long r6 = r6.Id
                long r8 = r11.Id
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 != 0) goto L64
                r2 = r5
            L64:
                if (r2 == 0) goto Lc1
            L66:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r6 = "ReturnSnsObjectDetailEvent snsObject id:"
                r2.<init>(r6)
                com.tencent.mm.protocal.protobuf.SnsObject r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.L(r4)
                if (r6 == 0) goto L7a
                long r6 = r6.Id
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                goto L7c
            L7a:
                java.lang.String r6 = "-1"
            L7c:
                r2.append(r6)
                java.lang.String r2 = r2.toString()
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
                java.lang.String r2 = "access$setMSnsObject$p"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog"
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
                r4.f251998v = r11
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
                com.tencent.mm.protocal.protobuf.SnsObject r11 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.L(r4)
                java.lang.String r2 = "access$initView"
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
                r4.P(r11)
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
                goto Lc1
            La2:
                com.tencent.mm.protocal.protobuf.SnsObject r11 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.L(r4)
                if (r11 != 0) goto Lc1
                android.content.Context r11 = r4.getContext()
                android.content.Context r2 = r4.getContext()
                r3 = 2131776877(0x7f10556d, float:1.9185239E38)
                java.lang.String r2 = i65.a.r(r2, r3)
                com.tencent.mm.plugin.sns.ui.sheet.a r3 = new com.tencent.mm.plugin.sns.ui.sheet.a
                r3.<init>(r4)
                java.lang.String r4 = ""
                db5.e1.t(r11, r2, r4, r3)
            Lc1:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
                r2 = r5
            Lc5:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.SnsObjectDetailEventListener.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: dead */
        public void mo48814x2efc64() {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dead", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f252004e, "dead: ");
            super.mo48814x2efc64();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dead", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogC18384xa272e02f(android.content.Context uiContext, int i17, int i18, int i19) {
        super(uiContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiContext, "uiContext");
        this.f251994r = uiContext;
        this.f251995s = i17;
        this.f251996t = i18;
        this.f251997u = i19;
        this.f252001y = jz5.h.b(new wd4.v2(this));
        this.f252002z = jz5.h.b(new wd4.u2(this));
        this.A = jz5.h.b(new wd4.m2(this));
        this.B = jz5.h.b(new wd4.t2(this));
        this.C = jz5.h.b(new wd4.n2(this));
        this.D = jz5.h.b(new wd4.o2(this));
        this.E = jz5.h.b(new wd4.s2(this));
        this.F = jz5.h.b(wd4.l2.f526491d);
        this.I = new java.util.ArrayList();
        this.f251993J = new java.util.ArrayList();
        this.L = jz5.h.b(new wd4.k2(this));
        p012xc85e97e9.p093xedfae76a.y yVar = uiContext instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) uiContext : null;
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "init: addObserver to " + uiContext);
            yVar.mo273xed6858b4().a(this);
        }
    }

    public static final /* synthetic */ java.util.ArrayList K(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getItems$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        java.util.ArrayList arrayList = dialogC18384xa272e02f.f251993J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getItems$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return arrayList;
    }

    public static final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 L(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMSnsObject$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = dialogC18384xa272e02f.f251998v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMSnsObject$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return c19806x4c372b7;
    }

    @Override // hg5.d
    public android.view.View F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crx, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O;
        android.view.View findViewById;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        super.G();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "[" + hashCode() + "] initContentView");
        if (this.G == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "initContentView: create SnsObjectDetailEventListener");
            this.G = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.SnsObjectDetailEventListener(new java.lang.ref.WeakReference(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.SnsObjectDetailEventListener snsObjectDetailEventListener = this.G;
        if (snsObjectDetailEventListener != null) {
            snsObjectDetailEventListener.mo48813x58998cd();
        }
        android.view.View view = this.f362936i;
        if (view != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null) {
            findViewById.setOnClickListener(new wd4.p2(this));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O2 = O();
        if (O2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) this.E).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            O2.mo7967x900dcbe1(c22847x422a813d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O3 = O();
        if ((O3 != null ? O3.mo7946xf939df19() : null) == null && (O = O()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            wd4.j2 j2Var = (wd4.j2) ((jz5.n) this.L).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            O.mo7960x6cab2c8d(j2Var);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O4 = O();
        if (O4 != null) {
            O4.N(new wd4.q2(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSnsObject", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initSnsObject mLocalId:");
        int i17 = this.f251995s;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8 c5618x529c81c8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5618x529c81c8();
        c5618x529c81c8.f135943g.f88780a = i17;
        c5618x529c81c8.e();
        this.f251998v = c5618x529c81c8.f135944h.f88880a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initSnsObject try find snsObject localId:");
        sb7.append(i17);
        sb7.append(", snsObject id:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = this.f251998v;
        sb7.append(c19806x4c372b7 != null ? java.lang.Long.valueOf(c19806x4c372b7.Id) : "null");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", sb7.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSnsObject", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        P(this.f251998v);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    @Override // hg5.d
    public void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        super.J();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "[" + hashCode() + "] onDismiss");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.SnsObjectDetailEventListener snsObjectDetailEventListener = this.G;
        if (snsObjectDetailEventListener != null) {
            snsObjectDetailEventListener.mo48814x2efc64();
        }
        java.lang.Object obj = this.f251994r;
        p012xc85e97e9.p093xedfae76a.y yVar = obj instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) obj : null;
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "onDismiss: removeObserver to " + obj);
            yVar.mo273xed6858b4().c(this);
        }
        android.view.View M2 = M();
        boolean z17 = false;
        if (M2 != null && M2.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = this.f251998v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.G(this.f251996t, this.H, ca4.z0.s0(c19806x4c372b7 != null ? c19806x4c372b7.Id : 0L));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    public final android.view.View M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEditGroup", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        android.view.View view = (android.view.View) ((jz5.n) this.A).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEditGroup", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return view;
    }

    public final wd4.s0 N(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLabelItem", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        java.lang.String g17 = ((b93.b) c93.a.a()).g(java.lang.String.valueOf(i17));
        if (g17 == null) {
            g17 = "";
        }
        java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(i17));
        wd4.s0 s0Var = new wd4.s0(z17 ? 3 : 2, null, new wd4.t0(i17, g17, j17 != null ? j17.size() : 0), null, 10, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLabelItem", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return s0Var;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.f252002z).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return c22849x81a93d25;
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x01ae, code lost:
    
        if (r9 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x01f7, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x01f5, code lost:
    
        if (r7 != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x072c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 r43) {
        /*
            Method dump skipped, instructions count: 1905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.P(com.tencent.mm.protocal.protobuf.SnsObject):void");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: checkDismissOnContextDestroy */
    public final void m71196xe074238c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkDismissOnContextDestroy", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "checkDismissWhenContextDestroy: dialog lifecycle state:" + ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f93138c.name());
        if (((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f93138c != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            J();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkDismissOnContextDestroy", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
    /* renamed from: refreshDataOnContextResume */
    public final void m71197x53fb2738() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshDataOnContextResume", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", "refreshDataOnContextResume: dialog lifecycle state:" + ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f93138c.name());
        if (((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f93138c == p012xc85e97e9.p093xedfae76a.n.RESUMED) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refresh] localId = ");
            int i17 = this.f251995s;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().i1(i17);
            try {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(i18 != null ? i18.f68881x4c58c87d : null);
                if (c19806x4c372b7 == null) {
                    c19806x4c372b7 = this.f251998v;
                }
                this.f251998v = c19806x4c372b7;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsGroupDialog", e17, "", new java.lang.Object[0]);
            }
            if (i18 != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f251998v;
                int i19 = c19806x4c372b72 != null ? c19806x4c372b72.f38967x15579d0d : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                boolean z17 = (i19 & 3) == 3 || (i19 & 5) == 5 || (i19 & 1025) == 1025 || (i19 & 513) == 513 || (i19 & 4097) == 4097;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                boolean z18 = (i18.m70362xf8db520e() & 1) != 0;
                boolean z19 = i18.f68889xcb0372e6 == 0 && !z17;
                if (z18 || z19) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refresh private:");
                    sb7.append(i18.m70362xf8db520e() & 1);
                    sb7.append(" public:");
                    sb7.append(i18.f68889xcb0372e6 == 0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", sb7.toString());
                    dismiss();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                } else {
                    dismiss();
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("refresh id:");
            sb8.append(i18 != null ? i18.m70367x7525eefd() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", sb8.toString());
            P(this.f251998v);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            wd4.j2 j2Var = (wd4.j2) ((jz5.n) this.L).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            j2Var.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshDataOnContextResume", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }
}
