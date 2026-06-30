package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "Ljz5/f0;", "onClick", "Landroid/view/View;", "getTitleGroup", "()Landroid/view/View;", "setTitleGroup", "(Landroid/view/View;)V", "titleGroup", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/wd", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveVisitorWhiteListUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements android.view.View.OnClickListener {
    public static final com.tencent.mm.plugin.finder.feed.ui.wd J1 = new com.tencent.mm.plugin.finder.feed.ui.wd(null);
    public r45.hn1 A1;
    public boolean B1;
    public int C1;
    public final java.util.LinkedList D1;
    public java.util.LinkedList E1;
    public java.util.LinkedList F1;
    public java.util.LinkedList G1;
    public java.util.LinkedList H1;
    public r45.re2 I1;
    public int W;
    public boolean Z;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f109425p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f109426p1;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public android.view.View titleGroup;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f109428w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f109429x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f109430x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f109431x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f109432y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f109433y0;

    /* renamed from: z1, reason: collision with root package name */
    public int f109436z1;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109435z = jz5.h.b(com.tencent.mm.plugin.finder.feed.ui.xd.f110732d);
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.oe(this));
    public final jz5.g B = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ne(this));
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.le(this));
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.je(this));
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ke(this));
    public final jz5.g F = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.me(this));
    public final jz5.g G = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ue(this));
    public final jz5.g H = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.se(this));
    public final jz5.g I = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.we(this));

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f109423J = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.te(this));
    public final jz5.g K = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ve(this));
    public final jz5.g L = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.he(this));
    public final jz5.g M = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.fe(this));
    public final jz5.g N = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ge(this));
    public final jz5.g P = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ie(this));
    public final jz5.g Q = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.be(this));
    public final jz5.g R = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.zd(this));
    public final jz5.g S = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ae(this));
    public final jz5.g T = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ce(this));
    public final jz5.g U = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ee(this));
    public final jz5.g V = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.de(this));
    public com.tencent.mm.plugin.finder.feed.ui.vd X = com.tencent.mm.plugin.finder.feed.ui.vd.f110649d;
    public com.tencent.mm.plugin.finder.feed.ui.ud Y = com.tencent.mm.plugin.finder.feed.ui.ud.f110604d;

    /* renamed from: l1, reason: collision with root package name */
    public final java.util.ArrayList f109424l1 = new java.util.ArrayList();

    /* renamed from: y1, reason: collision with root package name */
    public boolean f109434y1 = true;

    public FinderLiveVisitorWhiteListUI() {
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        this.f109436z1 = 3;
        this.A1 = new r45.hn1();
        this.D1 = new java.util.LinkedList();
        this.E1 = new java.util.LinkedList();
        this.F1 = new java.util.LinkedList();
        this.G1 = new java.util.LinkedList();
        this.H1 = new java.util.LinkedList();
        this.I1 = new r45.re2();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return "FinderLiveVisitorWhiteListUI";
    }

    public final void d7() {
        java.lang.String str = this.f109433y0;
        if (!(str == null || str.length() == 0)) {
            java.util.LinkedList linkedList = this.F1;
            java.lang.String str2 = this.f109433y0;
            if (str2 == null) {
                str2 = "";
            }
            if (!linkedList.contains(str2)) {
                java.util.LinkedList linkedList2 = this.F1;
                java.lang.String str3 = this.f109433y0;
                if (str3 == null) {
                    str3 = "";
                }
                linkedList2.add(str3);
            }
            java.util.LinkedList list = this.I1.getList(2);
            java.lang.String str4 = this.f109433y0;
            if (str4 == null) {
                str4 = "";
            }
            if (!list.contains(str4)) {
                java.util.LinkedList list2 = this.I1.getList(2);
                java.lang.String str5 = this.f109433y0;
                if (str5 == null) {
                    str5 = "";
                }
                list2.add(str5);
            }
            java.util.LinkedList list3 = this.I1.getList(0);
            java.lang.String str6 = this.f109433y0;
            if (str6 == null) {
                str6 = "";
            }
            if (!list3.contains(str6)) {
                java.util.LinkedList list4 = this.I1.getList(0);
                java.lang.String str7 = this.f109433y0;
                list4.add(str7 != null ? str7 : "");
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "append from chatRoom: " + this.f109433y0);
        }
        for (java.lang.String str8 : this.f109424l1) {
            if (!this.F1.contains(str8)) {
                this.F1.add(str8);
            }
            if (!this.I1.getList(0).contains(str8)) {
                this.I1.getList(0).add(str8);
            }
            if (!this.I1.getList(2).contains(str8)) {
                this.I1.getList(2).add(str8);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "append lucky money chatRoom:" + str8);
        }
    }

    public final void e7(int i17) {
        int i18 = this.W;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        o7(i17 | i18);
    }

    public final void f7() {
        this.E1.clear();
        this.G1.clear();
        this.F1.clear();
        this.H1.clear();
        r45.re2 re2Var = (r45.re2) this.A1.getCustom(2);
        if (re2Var != null) {
            re2Var.getList(0).clear();
            re2Var.getList(1).clear();
            re2Var.getList(2).clear();
            re2Var.getList(3).clear();
            re2Var.getList(4).clear();
        }
    }

    public final android.view.View g7() {
        java.lang.Object value = ((jz5.n) this.L).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ec6;
    }

    public final android.view.View h7() {
        java.lang.Object value = ((jz5.n) this.E).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View i7() {
        java.lang.Object value = ((jz5.n) this.C).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView j7() {
        java.lang.Object value = ((jz5.n) this.F).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.view.View k7() {
        java.lang.Object value = ((jz5.n) this.G).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void l7(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goBack isCancel:");
        sb6.append(z17);
        sb6.append(" chooseMode:");
        sb6.append(this.W);
        sb6.append(", chooseWhiteList.size:");
        sb6.append(this.E1.size());
        sb6.append(", partician whiteList:");
        cm2.a aVar = cm2.a.f43328a;
        sb6.append(aVar.q(this.I1));
        sb6.append(", chargeInfo:");
        sb6.append(aVar.k(this.A1));
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", sb6.toString());
        if (z17) {
            setResult(0);
        } else {
            android.content.Intent intent = new android.content.Intent();
            if (this.X == com.tencent.mm.plugin.finder.feed.ui.vd.f110651f) {
                intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", 0);
                intent.putExtra("KEY_PARAMS_LIVE_CHARGE", this.A1.toByteArray());
                intent.putExtra("KEY_PARAMS_LIVE_CHARGE_VIP_FREE", this.f109434y1);
                intent.putExtra("KEY_PARAMS_LIVE_CHARGE_FREE_FLAG", this.f109436z1);
            } else {
                boolean z18 = this.Y == com.tencent.mm.plugin.finder.feed.ui.ud.f110605e;
                intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", this.W);
                intent.putExtra("KEY_PARAMS_IS_TEST_LIVE", z18);
                java.util.LinkedList linkedList = this.E1;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r45.il1) it.next()).toByteArray());
                }
                intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList);
                intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM", new java.util.ArrayList<>(this.F1));
                intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER", new java.util.ArrayList<>(this.G1));
                intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LABEL_LIST", new java.util.ArrayList<>(this.H1));
                intent.putExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST", this.I1.toByteArray());
            }
            setResult(-1, intent);
        }
        finish();
    }

    public final boolean m7() {
        return this.E1.isEmpty() && this.G1.isEmpty() && this.H1.isEmpty() && this.F1.isEmpty();
    }

    public final boolean n7() {
        zl2.q4 q4Var = zl2.q4.f473933a;
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        boolean z17 = false;
        if (c1Var != null && c1Var.f328778a5) {
            z17 = true;
        }
        return q4Var.F(z17);
    }

    public final void o7(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "chooseMode from:" + this.W + " - to:" + i17);
        this.W = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.b5w) {
            l7(true);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.g6h) {
            l7(false);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.l0l) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.finder.feed.ui.pe(this);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.feed.ui.qe(this);
            k0Var.v();
            android.app.Dialog dialog = k0Var.f211864i;
            kotlin.jvm.internal.o.f(dialog, "getDialog(...)");
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.view.x7.a(dialog, context);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.lcp) {
            s7(com.tencent.mm.plugin.finder.feed.ui.vd.f110649d, this.Y);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.kp8) {
            com.tencent.mm.plugin.finder.feed.ui.vd vdVar = com.tencent.mm.plugin.finder.feed.ui.vd.f110650e;
            s7(vdVar, this.Y);
            if (m7()) {
                r7(vdVar);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.vnh) {
            s7(com.tencent.mm.plugin.finder.feed.ui.vd.f110652g, this.Y);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.uoj) {
            com.tencent.mm.plugin.finder.feed.ui.vd vdVar2 = com.tencent.mm.plugin.finder.feed.ui.vd.f110651f;
            s7(vdVar2, this.Y);
            if (m7()) {
                r7(vdVar2);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.u5z) {
            com.tencent.mm.plugin.finder.feed.ui.vd vdVar3 = com.tencent.mm.plugin.finder.feed.ui.vd.f110653h;
            s7(vdVar3, this.Y);
            if (m7()) {
                r7(vdVar3);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f486187un1) {
            s7(com.tencent.mm.plugin.finder.feed.ui.vd.f110654i, this.Y);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.up7) {
            r7(com.tencent.mm.plugin.finder.feed.ui.vd.f110650e);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.vng) {
            r7(com.tencent.mm.plugin.finder.feed.ui.vd.f110652g);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.uoi) {
            r7(com.tencent.mm.plugin.finder.feed.ui.vd.f110651f);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.u5y) {
            r7(com.tencent.mm.plugin.finder.feed.ui.vd.f110653h);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1280);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        getController().O0(com.tencent.mm.ui.bk.C());
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "[onCreate]");
        getIntent().getBooleanExtra("KEY_PARAMS_IS_NOTICE_PAY_LIVE", false);
        this.Z = getIntent().getBooleanExtra("KEY_PARAMS_IS_SUPER_FANS_CLUB", true);
        this.f109430x0 = getIntent().getBooleanExtra("KEY_PARAMS_WHITE_LIST_UNSELECT", false);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_PARAMS_WHITE_LIST_CHATROOM_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f109433y0 = stringExtra;
        java.util.ArrayList arrayList = this.f109424l1;
        arrayList.clear();
        java.util.RandomAccess stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_PARAMS_LUCKY_MONEY_LIST");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = kz5.p0.f313996d;
        }
        arrayList.addAll(stringArrayListExtra);
        this.f109425p0 = getIntent().getBooleanExtra("KEY_PARAMS_IS_CO_LIVE", false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.oca);
        this.titleGroup = findViewById;
        if (findViewById != null) {
            findViewById.post(new com.tencent.mm.plugin.finder.feed.ui.yd(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b5w);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g6h);
        this.f109428w = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l0l);
        this.f109429x = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        this.f109432y = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l0p);
        java.lang.Object value = ((jz5.n) this.A).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.View) value).setOnClickListener(this);
        i7().setOnClickListener(this);
        k7().setOnClickListener(this);
        g7().setOnClickListener(this);
        java.lang.Object value2 = ((jz5.n) this.Q).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setOnClickListener(this);
        java.lang.Object value3 = ((jz5.n) this.U).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.view.View) value3).setOnClickListener(this);
        h7().setOnClickListener(this);
        java.lang.Object value4 = ((jz5.n) this.f109423J).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.view.View) value4).setOnClickListener(this);
        java.lang.Object value5 = ((jz5.n) this.N).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        ((android.view.View) value5).setOnClickListener(this);
        java.lang.Object value6 = ((jz5.n) this.S).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        ((android.view.View) value6).setOnClickListener(this);
        if (this.f109425p0 && (view = this.f109429x) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI", "initLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI", "initLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        int integer = I1 != null ? I1.u0().getInteger(6) : 0;
        this.f109426p1 = integer;
        this.f109431x1 = pm0.v.z(integer, 8);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(getIntent().getBooleanExtra("KEY_PARAMS_LIVE_CHARGE_HIDE", false));
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            this.f109431x1 = false;
        }
        this.f109436z1 = getIntent().getIntExtra("KEY_PARAMS_FREE_OF_CHARGE_FLAG", this.f109436z1);
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "init liveFlag:" + this.f109426p1 + ",livePurchaseEnable:" + this.f109431x1 + ",isMemberLiveEnabled:" + n7());
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_PARAMS_LIVE_CHARGE");
        if (byteArrayExtra != null) {
            r45.hn1 hn1Var = new r45.hn1();
            hn1Var.parseFrom(byteArrayExtra);
            this.A1 = hn1Var;
        }
        if (((r45.re2) this.A1.getCustom(2)) == null) {
            this.A1.set(2, new r45.re2());
        } else {
            r45.re2 re2Var = (r45.re2) this.A1.getCustom(2);
            kotlin.jvm.internal.o.d(re2Var);
            this.I1 = re2Var;
            this.E1.clear();
            this.E1.addAll(this.I1.getList(3));
            this.G1.clear();
            this.G1.addAll(this.I1.getList(1));
            this.F1.clear();
            this.F1.addAll(this.I1.getList(0));
            this.H1.clear();
            this.H1.addAll(this.I1.getList(4));
        }
        if (((r45.hf5) this.A1.getCustom(3)) == null) {
            this.A1.set(3, new r45.hf5());
        }
        r45.hf5 hf5Var = (r45.hf5) this.A1.getCustom(3);
        if (hf5Var != null) {
            if (hf5Var.getInteger(0) == 0) {
                hf5Var.set(0, 1);
            }
            if (hf5Var.getInteger(1) == 0) {
                hf5Var.set(1, 180);
            }
            if (hf5Var.getInteger(2) == 0) {
                hf5Var.set(2, 180);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live_charge_step init liveChargeInfo:");
        cm2.a aVar = cm2.a.f43328a;
        sb6.append(aVar.k(this.A1));
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", sb6.toString());
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra("KEY_PARAMS_WHITE_LIST");
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        java.util.LinkedList linkedList = this.D1;
        if (list != null) {
            zl2.r4.f473950a.G2(list, linkedList);
        }
        java.io.Serializable serializableExtra2 = getIntent().getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST");
        java.util.List list2 = serializableExtra2 instanceof java.util.List ? (java.util.List) serializableExtra2 : null;
        if (list2 != null) {
            zl2.r4.f473950a.G2(list2, this.E1);
            java.util.LinkedList linkedList2 = this.E1;
            if (!(linkedList2 == null || linkedList2.isEmpty())) {
                e7(1);
            }
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM");
        if (stringArrayListExtra2 != null && (!stringArrayListExtra2.isEmpty())) {
            this.F1.clear();
            this.F1.addAll(stringArrayListExtra2);
            java.util.LinkedList linkedList3 = this.F1;
            if (!(linkedList3 == null || linkedList3.isEmpty())) {
                e7(2);
            }
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER");
        if (stringArrayListExtra3 != null && (!stringArrayListExtra3.isEmpty())) {
            this.G1.clear();
            this.G1.addAll(stringArrayListExtra3);
            java.util.LinkedList linkedList4 = this.G1;
            if (!(linkedList4 == null || linkedList4.isEmpty())) {
                e7(4);
            }
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra4 = getIntent().getStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LABEL_LIST");
        if (stringArrayListExtra4 != null && (!stringArrayListExtra4.isEmpty())) {
            this.H1.clear();
            this.H1.addAll(stringArrayListExtra4);
            java.util.LinkedList linkedList5 = this.H1;
            if (!(linkedList5 == null || linkedList5.isEmpty())) {
                e7(32);
            }
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST");
        if (byteArrayExtra2 != null) {
            r45.re2 re2Var2 = new r45.re2();
            re2Var2.parseFrom(byteArrayExtra2);
            this.I1.set(2, re2Var2.getList(2));
            this.I1.set(4, re2Var2.getList(4));
            this.I1.set(1, re2Var2.getList(1));
            this.I1.set(0, re2Var2.getList(0));
            this.I1.set(3, re2Var2.getList(3));
        }
        java.io.Serializable serializableExtra3 = getIntent().getSerializableExtra("KEY_PARAMS_WHITE_LIST");
        java.util.List list3 = serializableExtra3 instanceof java.util.List ? (java.util.List) serializableExtra3 : null;
        if (list3 != null) {
            zl2.r4.f473950a.G2(list3, linkedList);
        }
        this.C1 = getIntent().getIntExtra("KEY_PARAMS_MAX_USER_COUNT", 0);
        o7(getIntent().getIntExtra("KEY_PARAMS_VISIBILITY_MODE", 0));
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "init chooseMode:" + this.W + ", visitorWhiteList size:" + linkedList.size() + ",chooseWhiteList size:" + this.E1.size() + ",chooseWhiteListRoom size:" + this.F1.size() + ",chooseWhiteUser size:" + this.G1.size() + ",chooseWhiteLabel size:" + this.H1.size() + ",whiteList:" + aVar.q(this.I1));
        if (this.f109430x0) {
            q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110649d);
            p7(com.tencent.mm.plugin.finder.feed.ui.ud.f110604d);
        } else if (getIntent().getByteArrayExtra("KEY_PARAMS_LIVE_CHARGE") != null) {
            q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110651f);
            p7(com.tencent.mm.plugin.finder.feed.ui.ud.f110604d);
        } else if (getIntent().getBooleanExtra("KEY_PARAMS_IS_TEST_LIVE", false)) {
            q7(pm0.v.z(this.W, 128) ? com.tencent.mm.plugin.finder.feed.ui.vd.f110654i : com.tencent.mm.plugin.finder.feed.ui.vd.f110650e);
            p7(com.tencent.mm.plugin.finder.feed.ui.ud.f110605e);
        } else if (pm0.v.z(this.W, 8) || pm0.v.z(this.W, 16)) {
            q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110652g);
            p7(com.tencent.mm.plugin.finder.feed.ui.ud.f110604d);
        } else if (pm0.v.z(this.W, 64)) {
            q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110653h);
            p7(com.tencent.mm.plugin.finder.feed.ui.ud.f110604d);
        } else {
            int i17 = this.W;
            if (pm0.v.z(i17, 39) && !pm0.v.z(i17, 88)) {
                q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110650e);
                p7(com.tencent.mm.plugin.finder.feed.ui.ud.f110604d);
            } else {
                q7(com.tencent.mm.plugin.finder.feed.ui.vd.f110649d);
                p7(com.tencent.mm.plugin.finder.feed.ui.ud.f110604d);
            }
        }
        s7(this.X, this.Y);
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "initLogic chooseMode:" + this.W + ",viewMode:" + this.X + ",liveModeCategory:" + this.Y);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        l7(true);
    }

    public final void p7(com.tencent.mm.plugin.finder.feed.ui.ud udVar) {
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "liveModeCategory from:" + this.Y + " - to:" + udVar);
        this.Y = udVar;
    }

    public final void q7(com.tencent.mm.plugin.finder.feed.ui.vd value) {
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorWhiteListUI", "viewMode from:" + this.X + " - to:" + value);
        this.X = value;
    }

    public final void r7(com.tencent.mm.plugin.finder.feed.ui.vd vdVar) {
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = new com.tencent.mm.plugin.finder.feed.ui.kd(this, this.D1, this.F1, this.G1, this.E1, this.H1, this, vdVar, this.C1, this.f109433y0, this.f109424l1, this.Z, this.B1, this.f109434y1, this.f109436z1, this.A1);
        kdVar.D = new com.tencent.mm.plugin.finder.feed.ui.re(this, vdVar);
        kdVar.V(null, true, 0);
        kdVar.g0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x05d9, code lost:
    
        if (r9 == null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s7(com.tencent.mm.plugin.finder.feed.ui.vd r48, com.tencent.mm.plugin.finder.feed.ui.ud r49) {
        /*
            Method dump skipped, instructions count: 3079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI.s7(com.tencent.mm.plugin.finder.feed.ui.vd, com.tencent.mm.plugin.finder.feed.ui.ud):void");
    }

    public final void setTitleGroup(android.view.View view) {
        this.titleGroup = view;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r0 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (m7() == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t7() {
        /*
            r5 = this;
            com.tencent.mm.plugin.finder.feed.ui.vd r0 = r5.X
            com.tencent.mm.plugin.finder.feed.ui.vd r1 = com.tencent.mm.plugin.finder.feed.ui.vd.f110653h
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L52
            com.tencent.mm.plugin.finder.feed.ui.vd r1 = com.tencent.mm.plugin.finder.feed.ui.vd.f110650e
            if (r0 != r1) goto Ld
            goto L52
        Ld:
            com.tencent.mm.plugin.finder.feed.ui.vd r1 = com.tencent.mm.plugin.finder.feed.ui.vd.f110651f
            if (r0 != r1) goto L58
            r45.hn1 r0 = r5.A1
            int r0 = r0.getInteger(r3)
            if (r0 <= 0) goto L59
            r45.hn1 r0 = r5.A1
            r1 = 3
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.hf5 r0 = (r45.hf5) r0
            r4 = 2
            if (r0 == 0) goto L2d
            int r0 = r0.getInteger(r2)
            if (r0 != r4) goto L2d
            r0 = r3
            goto L2e
        L2d:
            r0 = r2
        L2e:
            if (r0 == 0) goto L3f
            r45.hn1 r0 = r5.A1
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.hf5 r0 = (r45.hf5) r0
            if (r0 == 0) goto L4e
            int r0 = r0.getInteger(r4)
            goto L4f
        L3f:
            r45.hn1 r0 = r5.A1
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            r45.hf5 r0 = (r45.hf5) r0
            if (r0 == 0) goto L4e
            int r0 = r0.getInteger(r3)
            goto L4f
        L4e:
            r0 = r2
        L4f:
            if (r0 <= 0) goto L59
            goto L58
        L52:
            boolean r0 = r5.m7()
            if (r0 != 0) goto L59
        L58:
            r2 = r3
        L59:
            android.widget.TextView r0 = r5.f109428w
            if (r0 != 0) goto L5e
            goto L61
        L5e:
            r0.setEnabled(r2)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI.t7():void");
    }

    public final void u7() {
        com.tencent.mm.plugin.finder.feed.ui.vd vdVar = this.X;
        if (vdVar == com.tencent.mm.plugin.finder.feed.ui.vd.f110649d) {
            f7();
            o7(0);
            return;
        }
        if (vdVar == com.tencent.mm.plugin.finder.feed.ui.vd.f110654i) {
            f7();
            o7(0);
            e7(128);
            return;
        }
        int i17 = this.W;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        o7(i17 & (-129));
        if (!this.E1.isEmpty()) {
            e7(1);
        }
        if (!this.F1.isEmpty()) {
            e7(2);
        }
        if (!this.G1.isEmpty()) {
            e7(4);
        }
        if (!this.H1.isEmpty()) {
            e7(32);
        }
        if (this.X == com.tencent.mm.plugin.finder.feed.ui.vd.f110653h) {
            e7(64);
        } else {
            o7(this.W & (-65));
        }
        if (!(this.X == com.tencent.mm.plugin.finder.feed.ui.vd.f110652g)) {
            o7(this.W & (-17));
            o7(this.W & (-9));
            return;
        }
        o7(0);
        if (this.Z) {
            e7(16);
        }
        if (n7()) {
            e7(8);
        }
    }
}
