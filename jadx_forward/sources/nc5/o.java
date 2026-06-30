package nc5;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f417746a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f417747b;

    /* renamed from: c, reason: collision with root package name */
    public final int f417748c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f417749d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f417750e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f417751f;

    /* renamed from: g, reason: collision with root package name */
    public nc5.u f417752g;

    /* renamed from: h, reason: collision with root package name */
    public int f417753h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f417754i;

    /* renamed from: j, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f417755j;

    /* renamed from: k, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f417756k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f417757l;

    public o(android.content.Context activity, java.lang.String chatRoomId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomId, "chatRoomId");
        this.f417746a = activity;
        this.f417747b = chatRoomId;
        this.f417748c = i17;
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f417755j = b17;
        this.f417749d = ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ri();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "initView >> " + hashCode());
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ui();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Di(9);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity;
        android.view.View findViewById = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.me7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f417750e = abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.hii);
        this.f417751f = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.hik);
        if (!((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ni()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c("");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f417751f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1163xf1deaba4);
        this.f417752g = new nc5.u(c1163xf1deaba4, activity);
        this.f417753h = i65.a.c(activity, com.p314xaae8f345.mm.ui.bl.c(activity));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "navigationBarHeight: " + this.f417753h);
        if (this.f417749d) {
            if (!a()) {
                ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).wi(chatRoomId);
            }
            nc5.u uVar = this.f417752g;
            if (uVar != null) {
                uVar.a(new nc5.c(this), new nc5.d(this));
            }
            if (!a()) {
                aq.n nVar = aq.o.f94455c;
                boolean z17 = nVar != null ? nVar.f94443e : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "getManagerIsDoingWork >> " + z17);
                if (!z17) {
                    this.f417757l = true;
                    this.f417756k = p3325xe03a0797.p3326xc267989b.l.d(b17, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new nc5.e(this, null), 2, null);
                }
            }
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f417751f;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.setVisibility(8);
            }
            c("");
        }
        android.view.View view = this.f417750e;
        if (view != null) {
            view.setOnClickListener(new nc5.f(this));
        }
    }

    public final boolean a() {
        int i17 = this.f417748c;
        return i17 == 3 || i17 == 4;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "onFinish" + hashCode());
        if (a()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("RESULT_OPEN_FEATURE", this.f417754i);
            android.content.Context context = this.f417746a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).setResult(-1, intent);
        }
    }

    public final void c(java.lang.String exposeQuery) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeQuery, "exposeQuery");
        ((ku5.t0) ku5.t0.f394148d).q(new nc5.h(this, exposeQuery));
    }

    public final void d() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f417746a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmc, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this.f417746a, 0, 0, false, true);
        z2Var.j(inflate);
        z2Var.C();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(101);
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.czi)).setOnClickListener(new nc5.j(z2Var));
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.czr)).setOnClickListener(new nc5.l(this, z2Var));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565620cz2)).setOnClickListener(new nc5.m(this));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565621cz3)).setOnClickListener(new nc5.n(this, z2Var));
    }
}
