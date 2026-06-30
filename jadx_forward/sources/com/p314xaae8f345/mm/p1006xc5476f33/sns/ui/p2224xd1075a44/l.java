package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f252717a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f252718b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f252719c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f252720d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f252721e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f252722f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f252723g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f252724h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f252725i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f252726j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f252727k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f252728l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f252729m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f252730n;

    public l(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view) {
        this.f252717a = str;
        this.f252718b = yVar;
        this.f252719c = view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsAd.");
        sb6.append(str == null ? "component" : str);
        sb6.append('.');
        sb6.append(hashCode());
        java.lang.String sb7 = sb6.toString();
        this.f252720d = sb7;
        this.f252721e = sb7 + ".dynamicad.living";
        this.f252724h = true;
        this.f252729m = new java.util.ArrayList();
        this.f252730n = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
    }

    public static final /* synthetic */ java.util.List b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getOnPreDrawListenerList$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.util.List list = lVar.f252729m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getOnPreDrawListenerList$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return list;
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.f listener) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSafeOnPreDrawListener", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f252720d, "addSafeOnPreDrawListener " + l(this.f252723g));
        ((java.util.ArrayList) this.f252729m).add(listener);
        java.lang.Object obj = this.f252723g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("triggerPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        android.view.View view = this.f252719c;
        if (view != null && (y0Var = this.f252722f) != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j(this, view, obj, obj, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("triggerPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (view != null) {
            view.requestLayout();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSafeOnPreDrawListener", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public abstract void d(java.lang.Object obj, boolean z17);

    public final void e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l> list = this.f252726j;
        if (list != null) {
            for (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar : list) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindSubComponents ");
                sb6.append(lVar != null ? lVar.f252717a : null);
                sb6.append(" model = ");
                sb6.append(l(obj));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f252720d, sb6.toString());
                lVar.f(obj);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final void f(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        p012xc85e97e9.p093xedfae76a.y yVar = this.f252718b;
        p012xc85e97e9.p093xedfae76a.n b17 = (yVar == null || (mo273xed6858b42 = yVar.mo273xed6858b4()) == null) ? null : mo273xed6858b42.b();
        p012xc85e97e9.p093xedfae76a.n nVar = p012xc85e97e9.p093xedfae76a.n.DESTROYED;
        java.lang.String str = this.f252720d;
        if (b17 == nVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "bind view on DESTROYED!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        boolean n17 = n(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "componentExist " + n17 + " name = " + this.f252717a + " model = " + l(obj));
        java.lang.Object obj2 = this.f252723g;
        if (!n17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            java.util.List list = this.f252726j;
            if (list != null) {
                java.util.Iterator it = new kz5.j1(list).iterator();
                while (true) {
                    kz5.i1 i1Var = (kz5.i1) it;
                    if (!i1Var.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l) i1Var.next();
                    lVar.t(lVar.f252723g);
                }
            }
            java.util.List list2 = this.f252726j;
            if (list2 != null) {
                ((java.util.ArrayList) list2).clear();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            t(obj2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        boolean o17 = obj2 == null ? false : o(obj2, obj);
        boolean z17 = this.f252725i;
        android.view.View view = this.f252719c;
        boolean z18 = (z17 || view == null) ? false : true;
        if (!o17 || z18 || view == null || this.f252724h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "try bind isSameContent=" + o17 + ", hasBindAfterDetach=" + this.f252725i + ", model=" + l(obj) + ", isReset=" + this.f252724h);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f252722f;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
            }
            this.f252722f = p3325xe03a0797.p3326xc267989b.z0.b();
            this.f252723g = obj;
            final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.g(this, obj);
            if (view != null) {
                if (view.isAttachedToWindow()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onViewAttachedToWindow in bind!: model = " + l(obj) + " v = " + view);
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f252730n).k(java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                }
                if (!(!this.f252728l)) {
                    view = null;
                }
                if (view != null) {
                    this.f252728l = true;
                    view.addOnAttachStateChangeListener(gVar);
                }
            }
            if (yVar != null && (mo273xed6858b4 = yVar.mo273xed6858b4()) != null) {
                p012xc85e97e9.p093xedfae76a.o oVar = !this.f252727k && mo273xed6858b4.b() != nVar ? mo273xed6858b4 : null;
                if (oVar != null) {
                    this.f252727k = true;
                    oVar.a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$6
                        @Override // p012xc85e97e9.p093xedfae76a.v
                        /* renamed from: onStateChanged */
                        public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                            java.lang.Object i17;
                            java.lang.Object i18;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStateChanged", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$6");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                            p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l.this;
                            if (event == mVar) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar2.j(), "onStateChanged() ON_DESTROY");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setObserverHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.f252727k = false;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setObserverHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                java.lang.Object i19 = lVar2.i();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.t(i19);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.f252718b.mo273xed6858b4().c(this);
                                android.view.View m17 = lVar2.m();
                                if (m17 != null) {
                                    m17.removeOnAttachStateChangeListener(gVar);
                                }
                                ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l.b(lVar2)).clear();
                                p3325xe03a0797.p3326xc267989b.y0 h17 = lVar2.h();
                                if (h17 != null) {
                                    p3325xe03a0797.p3326xc267989b.z0.c(h17, null);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                                lVar2.f252722f = null;
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
                            }
                            if (event == p012xc85e97e9.p093xedfae76a.m.ON_PAUSE && (i18 = lVar2.i()) != null) {
                                lVar2.r(i18);
                            }
                            if (event == p012xc85e97e9.p093xedfae76a.m.ON_RESUME && (i17 = lVar2.i()) != null) {
                                lVar2.s(i17);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStateChanged", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$6");
                        }
                    });
                }
            }
            t(obj2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "bindComponentModel model = " + l(obj));
            d(obj, o17);
            this.f252724h = false;
            this.f252725i = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "not bind!!  isSameContent = " + o17 + " ,hasBindAfterDetach = " + this.f252725i + " model = " + l(obj) + " isReset=" + this.f252724h);
        }
        q(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindView", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findSubComponentByName", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.util.List list = this.f252726j;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l lVar = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l) next).f252717a, str)) {
                    lVar = next;
                    break;
                }
            }
            lVar = lVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findSubComponentByName", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return lVar;
    }

    public final p3325xe03a0797.p3326xc267989b.y0 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f252722f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemScope", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return y0Var;
    }

    public final java.lang.Object i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getModel", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        java.lang.Object obj = this.f252723g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getModel", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return obj;
    }

    public final java.lang.String j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return this.f252720d;
    }

    public final java.lang.String k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG_LIVING", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG_LIVING", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return this.f252721e;
    }

    public final java.lang.String l(java.lang.Object obj) {
        java.lang.String sb6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getToId", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) {
            sb6 = ca4.z0.t0(((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj).f68891x29d1292e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb6);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("other_");
            sb7.append(obj != null ? java.lang.Integer.valueOf(obj.hashCode()) : null);
            sb6 = sb7.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getToId", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return sb6;
    }

    public final android.view.View m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return this.f252719c;
    }

    public abstract boolean n(java.lang.Object obj);

    public abstract boolean o(java.lang.Object obj, java.lang.Object obj2);

    public void p(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void q(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEveryFillItem", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void r(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void s(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final void t(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (!this.f252724h) {
            u();
            v(obj);
            this.f252724h = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final void w(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        if (this.f252726j == null) {
            this.f252726j = new java.util.ArrayList();
        }
        java.util.List list2 = this.f252726j;
        if (list2 != null) {
            list2.clear();
        }
        java.util.List list3 = this.f252726j;
        if (list3 != null) {
            list3.addAll(list);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    public final java.lang.Object x(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("waitForPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.k(this, rVar));
        java.lang.Object j17 = rVar.j();
        if (j17 == pz5.a.f440719d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("waitForPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return j17;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("waitForPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return f0Var;
    }
}
