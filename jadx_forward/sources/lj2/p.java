package lj2;

/* loaded from: classes10.dex */
public class p implements ai2.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f400441a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f400442b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f400443c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400444d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400445e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f400446f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f400447g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f400448h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f400449i;

    /* renamed from: j, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f400450j;

    /* renamed from: k, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f400451k;

    public p(android.view.ViewGroup root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f400441a = root;
        this.f400442b = "MultiBattleResultBarWidget_" + hashCode();
        this.f400443c = "finder_live_pk_result_win.pag";
        this.f400444d = "finder_live_pk_result_win_en.pag";
        this.f400445e = "finder_live_pk_result_win_streak.pag";
        this.f400446f = "finder_live_pk_result_win_streak_en.pag";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.eoi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f400447g = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.eog);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f400448h = textView;
        this.f400451k = p3325xe03a0797.p3326xc267989b.z0.b();
        textView.setTextSize(1, 24.0f);
        zl2.r4.f555483a.b3(textView);
    }

    public final void a(java.lang.String userName, java.lang.String userId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        this.f400449i = userId;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400442b, "onBind userName: " + userName + " userId: " + userId);
        mo2073x6761d4f();
    }

    @Override // ai2.a
    public android.view.View h() {
        return this.f400441a;
    }

    @Override // ai2.a
    public void i(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400442b, "battleStart withAnim:" + z17);
        this.f400447g.setVisibility(8);
        this.f400448h.setVisibility(8);
    }

    @Override // ai2.a
    public void j(boolean z17, dk2.u4 u4Var) {
        km2.k kVar;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400442b, "battleEnd bindCurrentUserSdkId: " + this.f400449i + " curBattle:" + u4Var);
        jz5.f0 f0Var = null;
        if (u4Var != null) {
            java.util.List list = u4Var.f315696j;
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    if (((r45.r22) obj3).m75939xb282bd08(2) == 1) {
                        arrayList.add(obj3);
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.util.LinkedList m75941xfb821914 = ((r45.r22) it.next()).m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
                synchronized (m75941xfb821914) {
                    java.util.Iterator it6 = m75941xfb821914.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj = it6.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.wk6) obj).m75945x2fec8307(1), this.f400449i)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                }
                r45.wk6 wk6Var = (r45.wk6) obj;
                if (wk6Var != null) {
                    java.util.List list2 = u4Var.f315692f;
                    synchronized (list2) {
                        java.util.Iterator it7 = list2.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                obj2 = it7.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.k) obj2).f390647a, wk6Var.m75945x2fec8307(0))) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                    }
                    kVar = (km2.k) obj2;
                    if (kVar != null) {
                        break;
                    }
                }
            }
        }
        kVar = null;
        if (kVar != null) {
            int i17 = kVar.f390650d;
            java.lang.String str = i17 > 1 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? this.f400445e : this.f400446f : com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j() ? this.f400443c : this.f400444d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400442b, "battleEnd pagRes:" + str + ", winningStreakCount:" + i17);
            this.f400448h.setVisibility(8);
            this.f400441a.setVisibility(0);
            if (!(str == null || str.length() == 0)) {
                ym5.l2 l2Var = ym5.l2.f544957a;
                ym5.j2[] j2VarArr = ym5.j2.f544925d;
                this.f400447g.o(ae2.in.f85221a.a(ym5.f6.Q));
                p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f400450j;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                this.f400450j = p3325xe03a0797.p3326xc267989b.l.d(this.f400451k, null, null, new lj2.o(str, this, null), 3, null);
                this.f400447g.setVisibility(0);
                if (i17 > 1) {
                    this.f400448h.setVisibility(0);
                    this.f400448h.setText("x" + i17);
                    this.f400448h.setAlpha(0.0f);
                    this.f400448h.animate().alpha(1.0f).setListener(null).setDuration(500L).setInterpolator(new android.view.animation.AccelerateInterpolator()).setStartDelay(500L).start();
                }
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            this.f400447g.setVisibility(8);
            this.f400448h.setVisibility(8);
        }
    }

    @Override // ai2.a
    /* renamed from: reset */
    public void mo2073x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400442b, "reset");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f400447g;
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.setVisibility(8);
        this.f400448h.setVisibility(8);
        this.f400441a.setVisibility(8);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f400450j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f400450j = null;
    }
}
