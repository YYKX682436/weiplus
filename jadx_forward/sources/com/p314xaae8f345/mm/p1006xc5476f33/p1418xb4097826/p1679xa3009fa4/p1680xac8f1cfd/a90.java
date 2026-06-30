package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class a90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f215280d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f215281e;

    /* renamed from: f, reason: collision with root package name */
    public int f215282f;

    /* renamed from: g, reason: collision with root package name */
    public int f215283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 f215284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f215285i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f215286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 f215287n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f215288o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f215289p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var, java.lang.ref.WeakReference weakReference, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 v80Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.widget.FrameLayout frameLayout, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f215284h = e90Var;
        this.f215285i = weakReference;
        this.f215286m = s0Var;
        this.f215287n = v80Var;
        this.f215288o = abstractC14490x69736cb5;
        this.f215289p = frameLayout;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a90(this.f215284h, this.f215285i, this.f215286m, this.f215287n, this.f215288o, this.f215289p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a90) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var;
        boolean z17;
        java.lang.Object wi6;
        android.widget.FrameLayout frameLayout;
        java.lang.String str;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar;
        android.content.Context context;
        pz5.a aVar2 = pz5.a.f440719d;
        int i18 = this.f215283g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 v80Var = this.f215287n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f215288o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var2 = this.f215284h;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e90Var2.f215771n = new ku2.a(new java.lang.ref.WeakReference(this.f215285i.get()));
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(e90Var2.m80379x76847179());
            frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            if (e90Var2.f215767g == null) {
                in5.s0 s0Var = this.f215286m;
                android.content.Context context2 = s0Var.f3639x46306858.getContext();
                if (context2 != null) {
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.a4.class)).U6(e90Var2.m158358x197d1fc6(), v80Var.f217756a, s0Var);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderTingEntryUIC", "无法获取有效 Context");
                    aVar = null;
                }
                e90Var2.f215768h = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc(aVar);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String P6 = e90Var2.P6(abstractC14490x69736cb5.mo2128x1ed62e84());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context3 = e90Var2.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            int i19 = abstractC14490x69736cb5.getEnhanceFromEventType() == 16 ? 1 : 0;
            if (i19 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[TeenagerRest] show teenager rest feed. feedid:");
                sb6.append(P6);
                sb6.append(", commentScene:");
                sb6.append(V6 != null ? new java.lang.Integer(V6.m75939xb282bd08(5)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingEntryUIC", sb6.toString());
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42505x9cd51cf8.getRaw()), new java.lang.Integer(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23919xb44528d8.f42584x2653d4.getRaw()));
                java.lang.String valueOf = java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42504x6152b077.getRaw());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                linkedHashMap.put(valueOf, ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209159bg).mo141623x754a37bb()).r());
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42487xf09f435c.getRaw()), P6);
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42483xae64126c.getRaw()), new java.lang.Integer(V6 != null ? V6.m75939xb282bd08(5) : 0));
                java.lang.String valueOf2 = java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42488xef210384.getRaw());
                java.lang.Object m75945x2fec8307 = V6 != null ? V6.m75945x2fec8307(1) : null;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = new java.lang.Integer(0);
                }
                linkedHashMap.put(valueOf2, m75945x2fec8307);
                java.lang.String valueOf3 = java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42489xcc83460e.getRaw());
                java.lang.Object m75945x2fec83072 = V6 != null ? V6.m75945x2fec8307(2) : null;
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = new java.lang.Integer(0);
                }
                linkedHashMap.put(valueOf3, m75945x2fec83072);
            } else {
                linkedHashMap.put(java.lang.String.valueOf(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23877x641165a8.f42505x9cd51cf8.getRaw()), new java.lang.Integer(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23919xb44528d8.f42585x4b536b7.getRaw()));
            }
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = e90Var2.m158354x19263085().mo273xed6858b4();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
            ku2.a aVar3 = e90Var2.f215771n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar3, "null cannot be cast to non-null type io.flutter.embedding.engine.plugins.FlutterPlugin");
            java.util.List c18 = kz5.b0.c(aVar3);
            this.f215280d = frameLayout2;
            this.f215281e = P6;
            this.f215282f = i19;
            this.f215283g = 1;
            i17 = i19;
            e90Var = e90Var2;
            z17 = true;
            wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.x4) c17).wi(frameLayout2, mo273xed6858b4, "tingEntry", (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : c18, (r18 & 32) != 0 ? null : linkedHashMap, this);
            if (wi6 == aVar2) {
                return aVar2;
            }
            frameLayout = frameLayout2;
            str = P6;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i27 = this.f215282f;
            str = (java.lang.String) this.f215281e;
            frameLayout = (android.widget.FrameLayout) this.f215280d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i17 = i27;
            e90Var = e90Var2;
            z17 = true;
            wi6 = obj;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e90 e90Var3 = e90Var;
        e90Var3.f215767g = (pi0.n1) wi6;
        android.widget.FrameLayout frameLayout3 = this.f215289p;
        frameLayout3.setVisibility(0);
        frameLayout3.removeAllViews();
        frameLayout3.addView(frameLayout);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc rcVar = e90Var3.f215768h;
        if (rcVar != null) {
            rcVar.b(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc rcVar2 = e90Var3.f215768h;
        if (rcVar2 != null) {
            rcVar2.c(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rc rcVar3 = e90Var3.f215768h;
        if (rcVar3 != null) {
            rcVar3.b(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTingEntryUIC", "realPopupFlutterSurvey, feedId = " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a, this.f215289p, "listen_page_thumbnail", "view_exp", true, e90Var3.Q6(abstractC14490x69736cb5), null, 32, null);
        if (i17 != 0 && !v80Var.f217758c && (context = frameLayout3.getContext()) != null) {
            hc2.v0.c(context, iy1.c.FinderBreakReminder, "page_in", false, kz5.b1.e(new jz5.l("feed_id", str)), 4, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v80 V62 = e90Var3.V6(abstractC14490x69736cb5);
        if (V62 != null) {
            V62.f217758c = false;
        }
        return jz5.f0.f384359a;
    }
}
