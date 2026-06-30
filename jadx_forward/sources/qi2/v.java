package qi2;

/* loaded from: classes10.dex */
public final class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f445162h;

    /* renamed from: i, reason: collision with root package name */
    public final zh2.c f445163i;

    /* renamed from: m, reason: collision with root package name */
    public final si2.b f445164m;

    /* renamed from: n, reason: collision with root package name */
    public fg2.e0 f445165n;

    /* renamed from: o, reason: collision with root package name */
    public int f445166o;

    /* renamed from: p, reason: collision with root package name */
    public int f445167p;

    /* renamed from: q, reason: collision with root package name */
    public ce2.i f445168q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f445169r;

    /* renamed from: s, reason: collision with root package name */
    public int f445170s;

    /* renamed from: t, reason: collision with root package name */
    public int f445171t;

    /* renamed from: u, reason: collision with root package name */
    public r45.wz1 f445172u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f445173v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f445174w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f445175x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk2.e liveData, zh2.c pluginAbility, android.content.Context context, si2.b callback) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f445162h = liveData;
        this.f445163i = pluginAbility;
        this.f445164m = callback;
        this.f445166o = 1;
        this.f445169r = new java.util.LinkedList();
        this.f445173v = jz5.h.b(new qi2.t(context, this));
        this.f445174w = jz5.h.b(new qi2.r(context, this));
        this.f445175x = jz5.h.b(new qi2.p(context, this));
        this.f199917g.c(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0m));
    }

    public final void A() {
        this.f445166o = 2;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var.f343545s.setVisibility(8);
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var2.f343538l.setVisibility(8);
        fg2.e0 e0Var3 = this.f445165n;
        if (e0Var3 != null) {
            e0Var3.f343546t.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void B() {
        this.f445167p = 0;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var.f343543q.setVisibility(0);
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var2.f343539m.setVisibility(8);
        fg2.e0 e0Var3 = this.f445165n;
        if (e0Var3 != null) {
            e0Var3.f343542p.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void C() {
        this.f445167p = 1;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var.f343543q.setVisibility(8);
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var2.f343539m.setVisibility(0);
        fg2.e0 e0Var3 = this.f445165n;
        if (e0Var3 != null) {
            e0Var3.f343542p.setVisibility(this.f445168q != null ? 0 : 8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void D() {
        boolean z17;
        gk2.e eVar = this.f445162h;
        int o76 = ((mm2.o4) eVar.a(mm2.o4.class)).o7();
        int q76 = ((mm2.o4) eVar.a(mm2.o4.class)).q7();
        boolean z18 = ((mm2.c1) eVar.a(mm2.c1.class)).K;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var.f343536j.setVisibility(8);
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.view.View view = e0Var2.f343544r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (z18 && o76 <= 1 && q76 == 0) {
            if (((mm2.c1) eVar.a(mm2.c1.class)).M) {
                km2.q l76 = ((mm2.o4) eVar.a(mm2.o4.class)).l7();
                if (l76 != null && pm0.v.z((int) l76.D, 1)) {
                    z17 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAFinderLiveAnchorNewPkWayPanelWidgetnchorNewPkWa", "isEnableShowPkFullLayout: " + z17 + ' ');
                    if (z17 || this.f445166o != 1) {
                    }
                    fg2.e0 e0Var3 = this.f445165n;
                    if (e0Var3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    e0Var3.f343536j.setVisibility(0);
                    fg2.e0 e0Var4 = this.f445165n;
                    if (e0Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    android.view.View view2 = e0Var4.f343544r;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "checkPkFullLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
            }
            z17 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAFinderLiveAnchorNewPkWayPanelWidgetnchorNewPkWa", "isEnableShowPkFullLayout: " + z17 + ' ');
            if (z17) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            r6 = this;
            gk2.e r0 = r6.f445162h
            java.lang.Class<mm2.y2> r1 = mm2.y2.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            mm2.y2 r0 = (mm2.y2) r0
            dk2.m r0 = r0.f411101u
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L48
            int r4 = r6.f445166o
            int r5 = r0.f315271a
            if (r5 != r4) goto L48
            int r4 = r6.f445167p
            int r5 = r0.f315272b
            if (r5 != r4) goto L48
            ce2.i r4 = r6.f445168q
            if (r4 == 0) goto L24
            java.lang.String r4 = r4.f67814x2c488eb6
            goto L25
        L24:
            r4 = r3
        L25:
            if (r4 != 0) goto L29
            java.lang.String r4 = ""
        L29:
            java.lang.String r5 = r0.f315273c
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r4)
            if (r4 == 0) goto L48
            int r4 = r6.f445170s
            int r5 = r0.f315274d
            if (r5 != r4) goto L48
            int r4 = r6.G()
            int r5 = r0.f315275e
            if (r5 != r4) goto L48
            int r0 = r0.f315277g
            int r4 = r6.f445171t
            if (r0 == r4) goto L46
            goto L48
        L46:
            r0 = r1
            goto L49
        L48:
            r0 = r2
        L49:
            android.view.View r4 = r6.f199916f
            if (r0 != 0) goto L6c
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L54
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L54:
            if (r3 == 0) goto L8a
            r3.setEnabled(r1)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099680(0x7f060020, float:1.781172E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
            goto L8a
        L6c:
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L73
            r3 = r4
            android.widget.TextView r3 = (android.widget.TextView) r3
        L73:
            if (r3 == 0) goto L8a
            r3.setEnabled(r2)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131102743(0x7f060c17, float:1.7817933E38)
            int r0 = r0.getColor(r1)
            r3.setTextColor(r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.v.E():void");
    }

    public final java.util.LinkedList F() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.Object obj;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.r22 r22Var = new r45.r22();
        java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
        r45.wk6 wk6Var = new r45.wk6();
        km2.q a76 = ((mm2.o4) this.f445162h.a(mm2.o4.class)).a7();
        if (a76 != null) {
            wk6Var.set(1, a76.f390703a);
            wk6Var.set(0, a76.f390705c);
            wk6Var.set(2, 1);
        }
        m75941xfb821914.add(wk6Var);
        java.util.List list = ((mm2.o4) this.f445162h.a(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj2).f390722t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj2);
                }
            }
        }
        int i17 = 2;
        while (true) {
            java.lang.Object obj3 = null;
            if (i17 >= 6) {
                break;
            }
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((km2.q) next).f390725w == i17) {
                        obj3 = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj3;
            if (qVar != null) {
                java.util.LinkedList m75941xfb8219142 = r22Var.m75941xfb821914(0);
                r45.wk6 wk6Var2 = new r45.wk6();
                wk6Var2.set(1, qVar.f390703a);
                wk6Var2.set(0, qVar.f390705c);
                wk6Var2.set(2, java.lang.Integer.valueOf(qVar.f390725w));
                m75941xfb8219142.add(wk6Var2);
            } else {
                java.util.LinkedList m75941xfb8219143 = r22Var.m75941xfb821914(0);
                r45.wk6 wk6Var3 = new r45.wk6();
                wk6Var3.set(2, java.lang.Integer.valueOf(i17));
                m75941xfb8219143.add(wk6Var3);
            }
            i17++;
        }
        linkedList.add(r22Var);
        r45.r22 r22Var2 = new r45.r22();
        java.util.LinkedList m75941xfb8219144 = r22Var2.m75941xfb821914(0);
        r45.wk6 wk6Var4 = new r45.wk6();
        km2.q l76 = ((mm2.o4) this.f445162h.a(mm2.o4.class)).l7();
        if (l76 != null) {
            wk6Var4.set(1, l76.f390703a);
            wk6Var4.set(0, l76.f390705c);
            wk6Var4.set(2, 1);
        }
        m75941xfb8219144.add(wk6Var4);
        java.util.List list2 = ((mm2.o4) this.f445162h.a(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-audienceLinkMicUserList>(...)");
        synchronized (list2) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list2) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((km2.q) obj4).f390722t, java.lang.Boolean.TRUE)) {
                    arrayList2.add(obj4);
                }
            }
        }
        int i18 = 2;
        while (i18 < 6) {
            synchronized (arrayList2) {
                java.util.Iterator it6 = arrayList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it6.next();
                    if (((km2.q) obj).f390725w == i18) {
                        break;
                    }
                }
            }
            km2.q qVar2 = (km2.q) obj;
            if (qVar2 != null) {
                java.util.LinkedList m75941xfb8219145 = r22Var2.m75941xfb821914(0);
                r45.wk6 wk6Var5 = new r45.wk6();
                wk6Var5.set(1, qVar2.f390703a);
                wk6Var5.set(0, qVar2.f390705c);
                wk6Var5.set(2, java.lang.Integer.valueOf(qVar2.f390725w));
                m75941xfb8219145.add(wk6Var5);
            } else {
                java.util.LinkedList m75941xfb8219146 = r22Var2.m75941xfb821914(0);
                r45.wk6 wk6Var6 = new r45.wk6();
                wk6Var6.set(2, java.lang.Integer.valueOf(i18));
                m75941xfb8219146.add(wk6Var6);
            }
            i18++;
        }
        linkedList.add(r22Var2);
        return linkedList;
    }

    public final int G() {
        if (this.f445166o != 2) {
            return 0;
        }
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (e0Var.f343538l.getVisibility() != 0) {
            return 0;
        }
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 != null) {
            return e0Var2.f343528b.getVisibility() == 0 ? 3 : 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
        throw null;
    }

    public final void H(ce2.i iVar) {
        this.f445168q = iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAFinderLiveAnchorNewPkWayPanelWidgetnchorNewPkWa", "notifyGiftSelect giftId: " + iVar.f67814x2c488eb6 + " selectGiftInfo: " + this.f445168q);
        ce2.i iVar2 = this.f445168q;
        if (iVar2 != null) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(iVar2.f67819x7194d06c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            fg2.e0 e0Var = this.f445165n;
            if (e0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            android.widget.ImageView selectGiftIcon = e0Var.f343541o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(selectGiftIcon, "selectGiftIcon");
            a17.c(selectGiftIcon);
        }
    }

    public final void I(r45.wz1 wz1Var, boolean z17) {
        jz5.f0 f0Var;
        int m75939xb282bd08;
        r45.jm1 jm1Var;
        r45.jm1 jm1Var2;
        java.util.LinkedList m75941xfb821914;
        w();
        this.f445172u = wz1Var;
        r45.kl4 kl4Var = wz1Var != null ? (r45.kl4) wz1Var.m75936x14adae67(10) : null;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec8307 = kl4Var != null ? kl4Var.m75945x2fec8307(3) : null;
        boolean z18 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        android.content.Context context = this.f199914d;
        e0Var.f343548v.setText(!z18 ? kl4Var != null ? kl4Var.m75945x2fec8307(3) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573206dw2));
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec83072 = kl4Var != null ? kl4Var.m75945x2fec8307(4) : null;
        e0Var2.f343550x.setText(!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0) ? kl4Var != null ? kl4Var.m75945x2fec8307(4) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573208dw5));
        fg2.e0 e0Var3 = this.f445165n;
        if (e0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec83073 = kl4Var != null ? kl4Var.m75945x2fec8307(9) : null;
        e0Var3.f343529c.setText(!(m75945x2fec83073 == null || m75945x2fec83073.length() == 0) ? kl4Var != null ? kl4Var.m75945x2fec8307(9) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8s));
        fg2.e0 e0Var4 = this.f445165n;
        if (e0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec83074 = kl4Var != null ? kl4Var.m75945x2fec8307(5) : null;
        e0Var4.f343533g.setText(!(m75945x2fec83074 == null || m75945x2fec83074.length() == 0) ? kl4Var != null ? kl4Var.m75945x2fec8307(5) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljh));
        fg2.e0 e0Var5 = this.f445165n;
        if (e0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        java.lang.String m75945x2fec83075 = kl4Var != null ? kl4Var.m75945x2fec8307(6) : null;
        e0Var5.f343531e.setText(!(m75945x2fec83075 == null || m75945x2fec83075.length() == 0) ? kl4Var != null ? kl4Var.m75945x2fec8307(6) : null : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljf));
        if (wz1Var != null && (jm1Var2 = (r45.jm1) wz1Var.m75936x14adae67(14)) != null && (m75941xfb821914 = jm1Var2.m75941xfb821914(0)) != null) {
            java.util.LinkedList linkedList = this.f445169r;
            linkedList.clear();
            linkedList.addAll(m75941xfb821914);
        }
        gk2.e eVar = this.f445162h;
        if (z17) {
            dk2.u4 u4Var = ((mm2.o4) eVar.a(mm2.o4.class)).Z;
            if (u4Var != null) {
                this.f445171t = u4Var.f315701o;
                int i17 = u4Var.f315693g;
                if (i17 == 1) {
                    z();
                } else if (i17 == 2) {
                    if (u4Var.f315699m == 3) {
                        y();
                    } else {
                        A();
                    }
                }
                int i18 = u4Var.f315694h;
                if (i18 == 0) {
                    B();
                } else if (i18 == 1) {
                    ce2.i e17 = dk2.u7.f315714a.e(u4Var.f315695i);
                    if (e17 != null) {
                        H(e17);
                    }
                    C();
                }
                this.f445170s = u4Var.f315700n;
                fg2.e0 e0Var6 = this.f445165n;
                if (e0Var6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var6.f343535i.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(this.f445170s / 60)));
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                this.f445171t = 0;
                z();
                B();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.y2) eVar.a(mm2.y2.class)).f411100t);
                if (!(valueOf.intValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    m75939xb282bd08 = valueOf.intValue();
                } else {
                    r45.wz1 wz1Var2 = this.f445172u;
                    m75939xb282bd08 = (wz1Var2 == null || (jm1Var = (r45.jm1) wz1Var2.m75936x14adae67(14)) == null) ? 0 : jm1Var.m75939xb282bd08(1);
                }
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(m75939xb282bd08);
                if (!(valueOf2.intValue() > 0)) {
                    valueOf2 = null;
                }
                this.f445170s = valueOf2 != null ? valueOf2.intValue() : 300;
                fg2.e0 e0Var7 = this.f445165n;
                if (e0Var7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var7.f343535i.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(this.f445170s / 60)));
            }
        }
        fg2.e0 e0Var8 = this.f445165n;
        if (e0Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var8.f343535i.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzf, java.lang.Integer.valueOf(this.f445170s / 60)));
        J();
        E();
        int o76 = ((mm2.o4) eVar.a(mm2.o4.class)).o7();
        int q76 = ((mm2.o4) eVar.a(mm2.o4.class)).q7();
        if (((mm2.c1) eVar.a(mm2.c1.class)).K) {
            if (o76 <= 1 && q76 == 0) {
                fg2.e0 e0Var9 = this.f445165n;
                if (e0Var9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var9.f343547u.setVisibility(0);
                fg2.e0 e0Var10 = this.f445165n;
                if (e0Var10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var10.f343528b.setVisibility(0);
                fg2.e0 e0Var11 = this.f445165n;
                if (e0Var11 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var11.f343549w.setVisibility(8);
            } else if (o76 > 1 || q76 <= 0) {
                fg2.e0 e0Var12 = this.f445165n;
                if (e0Var12 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var12.f343528b.setVisibility(8);
                fg2.e0 e0Var13 = this.f445165n;
                if (e0Var13 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var13.f343547u.setVisibility(0);
                fg2.e0 e0Var14 = this.f445165n;
                if (e0Var14 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var14.f343549w.setVisibility(0);
            } else {
                fg2.e0 e0Var15 = this.f445165n;
                if (e0Var15 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var15.f343528b.setVisibility(0);
                fg2.e0 e0Var16 = this.f445165n;
                if (e0Var16 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var16.f343547u.setVisibility(8);
                fg2.e0 e0Var17 = this.f445165n;
                if (e0Var17 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                e0Var17.f343549w.setVisibility(8);
                y();
            }
        } else if (o76 <= 1) {
            fg2.e0 e0Var18 = this.f445165n;
            if (e0Var18 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var18.f343547u.setVisibility(0);
            fg2.e0 e0Var19 = this.f445165n;
            if (e0Var19 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var19.f343528b.setVisibility(8);
            fg2.e0 e0Var20 = this.f445165n;
            if (e0Var20 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var20.f343549w.setVisibility(8);
            z();
        } else {
            fg2.e0 e0Var21 = this.f445165n;
            if (e0Var21 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var21.f343528b.setVisibility(8);
            fg2.e0 e0Var22 = this.f445165n;
            if (e0Var22 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var22.f343547u.setVisibility(0);
            fg2.e0 e0Var23 = this.f445165n;
            if (e0Var23 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var23.f343549w.setVisibility(0);
        }
        dk2.u4 u4Var2 = ((mm2.o4) eVar.a(mm2.o4.class)).Z;
        if (u4Var2 != null && u4Var2.f315699m == 3) {
            fg2.e0 e0Var24 = this.f445165n;
            if (e0Var24 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var24.f343547u.setVisibility(8);
            fg2.e0 e0Var25 = this.f445165n;
            if (e0Var25 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var25.f343549w.setVisibility(8);
            fg2.e0 e0Var26 = this.f445165n;
            if (e0Var26 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var26.f343528b.setVisibility(0);
        }
        D();
    }

    public final void J() {
        int i17 = this.f445171t;
        android.content.Context context = this.f199914d;
        if (i17 == 1) {
            fg2.e0 e0Var = this.f445165n;
            if (e0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            e0Var.f343537k.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.exv));
            return;
        }
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var2.f343537k.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eru));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        android.widget.TextView f17 = f();
        f17.setEnabled(true);
        f17.setTextColor(f17.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
        f17.setText(f17.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6t));
        return f17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570458do1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dvn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        int id6 = e0Var.f343547u.getId();
        if (valueOf != null && valueOf.intValue() == id6) {
            z();
            D();
        } else {
            fg2.e0 e0Var2 = this.f445165n;
            if (e0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            int id7 = e0Var2.f343549w.getId();
            boolean z17 = false;
            if (valueOf != null && valueOf.intValue() == id7) {
                if (((mm2.o4) this.f445164m.a().P0(mm2.o4.class)).f410857s.size() <= 1) {
                    android.content.Context context = this.f199914d;
                    db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ljb), 0).show();
                } else {
                    z17 = true;
                }
                if (z17) {
                    A();
                } else {
                    z();
                }
            } else {
                fg2.e0 e0Var3 = this.f445165n;
                if (e0Var3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                    throw null;
                }
                int id8 = e0Var3.f343528b.getId();
                if (valueOf != null && valueOf.intValue() == id8) {
                    y();
                    D();
                } else {
                    fg2.e0 e0Var4 = this.f445165n;
                    if (e0Var4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                        throw null;
                    }
                    int id9 = e0Var4.f343532f.getId();
                    if (valueOf != null && valueOf.intValue() == id9) {
                        B();
                    } else {
                        fg2.e0 e0Var5 = this.f445165n;
                        if (e0Var5 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                            throw null;
                        }
                        int id10 = e0Var5.f343530d.getId();
                        jz5.g gVar = this.f445174w;
                        if (valueOf == null || valueOf.intValue() != id10) {
                            fg2.e0 e0Var6 = this.f445165n;
                            if (e0Var6 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                throw null;
                            }
                            int id11 = e0Var6.f343542p.getId();
                            if (valueOf != null && valueOf.intValue() == id11) {
                                a();
                                qi2.w0 w0Var = (qi2.w0) ((jz5.n) gVar).mo141623x754a37bb();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(w0Var.f445180h.a(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qi2.v0(w0Var, 0, null), 2, null);
                                w0Var.w();
                            } else {
                                fg2.e0 e0Var7 = this.f445165n;
                                if (e0Var7 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                    throw null;
                                }
                                int id12 = e0Var7.f343534h.getId();
                                if (valueOf != null && valueOf.intValue() == id12) {
                                    ((qi2.m0) ((jz5.n) this.f445175x).mo141623x754a37bb()).y(this.f445169r, this.f445170s);
                                    a();
                                } else {
                                    fg2.e0 e0Var8 = this.f445165n;
                                    if (e0Var8 == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                        throw null;
                                    }
                                    int id13 = e0Var8.f343536j.getId();
                                    if (valueOf != null && valueOf.intValue() == id13) {
                                        a();
                                        ((ni2.x) ((jz5.n) this.f445173v).mo141623x754a37bb()).g0(this.f445171t);
                                    }
                                }
                            }
                        } else if (this.f445168q == null) {
                            a();
                            qi2.w0 w0Var2 = (qi2.w0) ((jz5.n) gVar).mo141623x754a37bb();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(w0Var2.f445180h.a(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new qi2.v0(w0Var2, 0, null), 2, null);
                            w0Var2.w();
                        } else {
                            C();
                        }
                    }
                }
            }
        }
        E();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorPkSettingPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        int i17 = com.p314xaae8f345.mm.R.id.r5u;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r5u);
        if (c1073x7e08a787 != null) {
            i17 = com.p314xaae8f345.mm.R.id.r5v;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r5v);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.r5w;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r5w);
                if (textView2 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.lly;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.lly);
                    if (c22699x3dcdb352 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.q6g;
                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q6g);
                        if (c1073x7e08a7872 != null) {
                            i17 = com.p314xaae8f345.mm.R.id.q6h;
                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q6h);
                            if (textView3 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.q6i;
                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q6i);
                                if (textView4 != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.f566697q72;
                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f566697q72);
                                    if (c22699x3dcdb3522 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.q7e;
                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q7e);
                                        if (c1073x7e08a7873 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.q7f;
                                            android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q7f);
                                            if (textView5 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.q7g;
                                                android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q7g);
                                                if (textView6 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.rri;
                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.rri);
                                                    if (c22699x3dcdb3523 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.qv8;
                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7874 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qv8);
                                                        if (c1073x7e08a7874 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.qv9;
                                                            android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qv9);
                                                            if (textView7 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.qv_;
                                                                android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qv_);
                                                                if (textView8 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.s8w;
                                                                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7875 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s8w);
                                                                    if (c1073x7e08a7875 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.s_a;
                                                                        android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s_a);
                                                                        if (textView9 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.s_b;
                                                                            android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.s_b);
                                                                            if (textView10 != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.q9q;
                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q9q);
                                                                                if (c22644xc8fbf3b2 != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.q9r;
                                                                                    android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q9r);
                                                                                    if (textView11 != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.r8n;
                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.r8n);
                                                                                        if (c22699x3dcdb3524 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.q_r;
                                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_r);
                                                                                            if (c22699x3dcdb3525 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.q_s;
                                                                                                android.view.View a17 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_s);
                                                                                                if (a17 != null) {
                                                                                                    i17 = com.p314xaae8f345.mm.R.id.q_t;
                                                                                                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_t);
                                                                                                    if (imageView != null) {
                                                                                                        i17 = com.p314xaae8f345.mm.R.id.q_u;
                                                                                                        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7876 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_u);
                                                                                                        if (c1073x7e08a7876 != null) {
                                                                                                            i17 = com.p314xaae8f345.mm.R.id.q_v;
                                                                                                            android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_v);
                                                                                                            if (textView12 != null) {
                                                                                                                i17 = com.p314xaae8f345.mm.R.id.q_w;
                                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_w);
                                                                                                                if (c22699x3dcdb3526 != null) {
                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.sag;
                                                                                                                    android.view.View a18 = x4.b.a(rootView, com.p314xaae8f345.mm.R.id.sag);
                                                                                                                    if (a18 != null) {
                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.q_y;
                                                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_y);
                                                                                                                        if (c22699x3dcdb3527 != null) {
                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.q_z;
                                                                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3528 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.q_z);
                                                                                                                            if (c22699x3dcdb3528 != null) {
                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.mz6;
                                                                                                                                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7877 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mz6);
                                                                                                                                if (c1073x7e08a7877 != null) {
                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.mz7;
                                                                                                                                    android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mz7);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.mz8;
                                                                                                                                        android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.mz8);
                                                                                                                                        if (textView14 != null) {
                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.f568770nz5;
                                                                                                                                            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7878 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.f568770nz5);
                                                                                                                                            if (c1073x7e08a7878 != null) {
                                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.nz6;
                                                                                                                                                android.widget.TextView textView15 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.nz6);
                                                                                                                                                if (textView15 != null) {
                                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.nz7;
                                                                                                                                                    android.widget.TextView textView16 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.nz7);
                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.qcb;
                                                                                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b22 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qcb);
                                                                                                                                                        if (c22644xc8fbf3b22 != null) {
                                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.qcc;
                                                                                                                                                            android.widget.TextView textView17 = (android.widget.TextView) x4.b.a(rootView, com.p314xaae8f345.mm.R.id.qcc);
                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                this.f445165n = new fg2.e0((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) rootView, c1073x7e08a787, textView, textView2, c22699x3dcdb352, c1073x7e08a7872, textView3, textView4, c22699x3dcdb3522, c1073x7e08a7873, textView5, textView6, c22699x3dcdb3523, c1073x7e08a7874, textView7, textView8, c1073x7e08a7875, textView9, textView10, c22644xc8fbf3b2, textView11, c22699x3dcdb3524, c22699x3dcdb3525, a17, imageView, c1073x7e08a7876, textView12, c22699x3dcdb3526, a18, c22699x3dcdb3527, c22699x3dcdb3528, c1073x7e08a7877, textView13, textView14, c1073x7e08a7878, textView15, textView16, c22644xc8fbf3b22, textView17);
                                                                                                                                                                c1073x7e08a7877.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var = this.f445165n;
                                                                                                                                                                if (e0Var == null) {
                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var.f343549w.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var2 = this.f445165n;
                                                                                                                                                                if (e0Var2 == null) {
                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var2.f343528b.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var3 = this.f445165n;
                                                                                                                                                                if (e0Var3 == null) {
                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var3.f343530d.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var4 = this.f445165n;
                                                                                                                                                                if (e0Var4 == null) {
                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var4.f343532f.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var5 = this.f445165n;
                                                                                                                                                                if (e0Var5 == null) {
                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var5.f343542p.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var6 = this.f445165n;
                                                                                                                                                                if (e0Var6 == null) {
                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var6.f343534h.setOnClickListener(this);
                                                                                                                                                                fg2.e0 e0Var7 = this.f445165n;
                                                                                                                                                                if (e0Var7 == null) {
                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                e0Var7.f343536j.setOnClickListener(this);
                                                                                                                                                                z();
                                                                                                                                                                B();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void u() {
        a();
        this.f445164m.mo164628x3d6f0539();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        java.util.LinkedList linkedList;
        dk2.u4 u4Var = ((mm2.o4) this.f445162h.a(mm2.o4.class)).Z;
        if (u4Var != null && u4Var.h()) {
            android.content.Context context = this.f199914d;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8t), 0).show();
            a();
            return;
        }
        if (((mm2.o4) this.f445162h.a(mm2.o4.class)).l7() == null) {
            android.content.Context context2 = this.f199914d;
            db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8u), 0).show();
            a();
            return;
        }
        int i17 = this.f445166o;
        if (i17 != 1) {
            linkedList = i17 != 2 ? new java.util.LinkedList() : G() == 3 ? F() : new java.util.LinkedList();
        } else {
            linkedList = new java.util.LinkedList();
            r45.r22 r22Var = new r45.r22();
            java.util.LinkedList m75941xfb821914 = r22Var.m75941xfb821914(0);
            r45.wk6 wk6Var = new r45.wk6();
            km2.q a76 = ((mm2.o4) this.f445162h.a(mm2.o4.class)).a7();
            if (a76 != null) {
                wk6Var.set(1, a76.f390703a);
                wk6Var.set(0, a76.f390705c);
                wk6Var.set(2, java.lang.Integer.valueOf(a76.f390725w));
            }
            m75941xfb821914.add(wk6Var);
            linkedList.add(r22Var);
            java.util.List<km2.q> list = ((mm2.o4) this.f445162h.a(mm2.o4.class)).f410857s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                for (km2.q qVar : list) {
                    r45.r22 r22Var2 = new r45.r22();
                    java.util.LinkedList m75941xfb8219142 = r22Var2.m75941xfb821914(0);
                    r45.wk6 wk6Var2 = new r45.wk6();
                    wk6Var2.set(1, qVar.f390703a);
                    wk6Var2.set(0, qVar.f390705c);
                    wk6Var2.set(2, java.lang.Integer.valueOf(qVar.f390725w));
                    m75941xfb8219142.add(wk6Var2);
                    linkedList.add(r22Var2);
                }
            }
        }
        java.util.LinkedList linkedList2 = linkedList;
        if (G() != 0 && this.f445166o != 1) {
            this.f445171t = 0;
        }
        si2.b bVar = this.f445164m;
        int i18 = this.f445166o;
        int i19 = this.f445167p;
        int G = G();
        int i27 = this.f445170s;
        ce2.i iVar = this.f445168q;
        java.lang.String str = iVar != null ? iVar.f67814x2c488eb6 : null;
        if (str == null) {
            str = "";
        }
        bVar.b(new dk2.m(i18, i19, str, i27, G, linkedList2, this.f445171t), new qi2.u(this));
    }

    public final void y() {
        this.f445166o = 2;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var.f343538l.setVisibility(0);
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var2.f343546t.setVisibility(8);
        fg2.e0 e0Var3 = this.f445165n;
        if (e0Var3 != null) {
            e0Var3.f343545s.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }

    public final void z() {
        this.f445166o = 1;
        fg2.e0 e0Var = this.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var.f343545s.setVisibility(0);
        fg2.e0 e0Var2 = this.f445165n;
        if (e0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var2.f343546t.setVisibility(8);
        fg2.e0 e0Var3 = this.f445165n;
        if (e0Var3 != null) {
            e0Var3.f343538l.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }
}
