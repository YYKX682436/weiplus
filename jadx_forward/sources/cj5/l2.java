package cj5;

/* loaded from: classes.dex */
public final class l2 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123714d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123715e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f123716f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f123717g;

    /* renamed from: h, reason: collision with root package name */
    public xm3.t0 f123718h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f123719i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f123720m;

    /* renamed from: n, reason: collision with root package name */
    public final jn5.i f123721n;

    /* renamed from: o, reason: collision with root package name */
    public final cj5.s1 f123722o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f123723p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123714d = jz5.h.b(new cj5.i2(this));
        this.f123715e = jz5.h.b(new cj5.k2(activity));
        this.f123716f = jz5.h.b(new cj5.q1(this));
        this.f123717g = jz5.h.b(new cj5.z1(activity));
        this.f123719i = jz5.h.b(new cj5.h2(this, activity));
        long j17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2554x6e06889c.C20571x39adcdea()) == 1 ? 5000L : 250L;
        jn5.i iVar = new jn5.i(new cj5.r1(this));
        iVar.f93702d = j17;
        iVar.f93703e = j17;
        iVar.f93701c = j17;
        iVar.f93704f = 0L;
        this.f123721n = iVar;
        this.f123722o = new cj5.s1();
        this.f123723p = jz5.h.b(new cj5.w1(this));
    }

    public static final void U6(cj5.l2 l2Var, android.content.Intent intent) {
        int intExtra = l2Var.m158354x19263085().getIntent().getIntExtra("max_limit_num", -1);
        if (intExtra > 0) {
            intent.putExtra("max_limit_num", intExtra);
        }
        int intExtra2 = l2Var.m158354x19263085().getIntent().getIntExtra("Select_Conv_Type", -1);
        if (intExtra2 >= 0) {
            intent.putExtra("Select_Conv_Type", intExtra2);
        }
    }

    public final void V6() {
        int a07;
        int a08;
        android.view.View mo7935xa188593e;
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        xm3.t0 t0Var = this.f123718h;
        if (t0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if ((P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null || (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) == null) ? false : n0Var.f527854q) {
            if (this.f123721n.A != null) {
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = Y6().k().getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int y17 = c1162x665295de.y();
            int w17 = c1162x665295de.w();
            if (y17 == -1 || w17 == -1 || w17 > y17) {
                return;
            }
            java.util.ArrayList arrayList = t0Var.I.f233598o;
            if (!arrayList.isEmpty() && arrayList.size() > (a08 = y17 - (a07 = t0Var.a0()))) {
                int i17 = Integer.MAX_VALUE;
                if (w17 <= y17) {
                    while (true) {
                        int i18 = w17 - a07;
                        if (i18 >= 0 && arrayList.size() > i18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ri5.j) arrayList.get(i18)).f477644f, "message_fold")) {
                            i17 = w17;
                        }
                        if (w17 == y17) {
                            break;
                        } else {
                            w17++;
                        }
                    }
                }
                si5.c cVar = ((ri5.j) arrayList.get(a08)).f477646h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type T of com.tencent.mm.ui.mvvm.item.SelectContactListItem.getItemExtension");
                vi5.f fVar = (vi5.f) cVar;
                if (i17 > y17) {
                    r2 = fVar.f519160g;
                } else if (i17 == y17 && (mo7935xa188593e = c1162x665295de.mo7935xa188593e(i17)) != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    mo7935xa188593e.getGlobalVisibleRect(rect);
                    r2 = !(rect.height() >= mo7935xa188593e.getHeight());
                    rect.toString();
                    rect.height();
                    rect.width();
                    mo7935xa188593e.getHeight();
                    mo7935xa188593e.getWidth();
                }
                c7(r2);
            }
        }
    }

    public final void W6(android.content.Intent intent, int i17) {
        java.lang.String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("Select_Conv_User")) == null) {
            return;
        }
        java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList(f07);
            pm0.v.d0(linkedList, cj5.o1.f123739d);
            int i18 = i17 == 2306836 ? 2 : 1;
            if (!((wi5.n0) Q6.mo140437x75286adb()).e()) {
                Q6.B3(new wi5.c0(linkedList, -1));
                return;
            }
            wi5.m0 m0Var = new wi5.m0(linkedList, -1);
            m0Var.f527844c = i18;
            Q6.B3(m0Var);
        }
    }

    public final android.widget.LinearLayout X6() {
        return (android.widget.LinearLayout) ((jz5.n) this.f123716f).mo141623x754a37bb();
    }

    public final em.l2 Y6() {
        return (em.l2) ((jz5.n) this.f123714d).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj5.l2.Z6():void");
    }

    public final boolean a7() {
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null || (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) == null) {
            return false;
        }
        return n0Var.f527855r;
    }

    public final void b7(java.util.List list) {
        j75.f m67437x4bd5310;
        if (list != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
            wi5.n0 n0Var = (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) ? null : (wi5.n0) m67437x4bd5310.mo140437x75286adb();
            if (n0Var != null) {
                n0Var.f527856s = list.size();
            }
        }
        this.f123720m = list;
    }

    public final void c7(boolean z17) {
        int visibility = X6().getVisibility();
        X6().setVisibility(z17 ? 0 : 8);
        if (visibility != X6().getVisibility()) {
            X6().post(new cj5.j2(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7() {
        /*
            r6 = this;
            em.l2 r0 = r6.Y6()
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.k()
            java.lang.String r1 = "getSelectContactRv(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            com.tencent.mm.plugin.mvvmlist.MvvmList r0 = xm3.u0.a(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L40
            java.util.ArrayList r0 = r0.f233598o
            if (r0 == 0) goto L40
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            r4 = r3
            ri5.j r4 = (ri5.j) r4
            int r4 = r4.f477643e
            ri5.h r5 = ri5.j.I
            int r5 = ri5.j.f477639p0
            if (r4 != r5) goto L34
            r4 = 1
            goto L35
        L34:
            r4 = r1
        L35:
            if (r4 == 0) goto L1d
            goto L39
        L38:
            r3 = r2
        L39:
            ri5.j r3 = (ri5.j) r3
            if (r3 == 0) goto L40
            si5.c r0 = r3.f477646h
            goto L41
        L40:
            r0 = r2
        L41:
            boolean r3 = r0 instanceof vi5.d
            if (r3 == 0) goto L48
            r2 = r0
            vi5.d r2 = (vi5.d) r2
        L48:
            if (r2 == 0) goto L68
            boolean r0 = r6.a7()
            r2.f519151i = r0
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r0 = r6.P6()
            if (r0 == 0) goto L66
            j75.f r0 = r0.m67437x4bd5310()
            if (r0 == 0) goto L66
            j75.a r0 = r0.mo140437x75286adb()
            wi5.n0 r0 = (wi5.n0) r0
            if (r0 == 0) goto L66
            int r1 = r0.f527856s
        L66:
            r2.f519152j = r1
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj5.l2.d7():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 2306836 && i18 == -1 && intent != null) {
            W6(intent, 2306836);
        } else if (i17 == 2306837 && i18 == -1 && intent != null) {
            W6(intent, 2306837);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        wi5.n0 n0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate() called isHasPlaceTopFoldFlowBtn:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        sb6.append((P6 == null || (m67437x4bd53102 = P6.m67437x4bd5310()) == null || (n0Var = (wi5.n0) m67437x4bd53102.mo140437x75286adb()) == null) ? false : n0Var.f527854q);
        sb6.append(" isPlaceTopFoldStatus:");
        sb6.append(a7());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.f2(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }
}
