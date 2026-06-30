package sp2;

/* loaded from: classes2.dex */
public final class l1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f492604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492606f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f492607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f492608h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f492609i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f492610m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f492611n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f492612o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.p314xaae8f345.mm.p944x882e457a.f fVar, int i17, sp2.o2 o2Var, boolean z17, int i18, yz5.a aVar, long j17, yz5.l lVar, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492604d = fVar;
        this.f492605e = i17;
        this.f492606f = o2Var;
        this.f492607g = z17;
        this.f492608h = i18;
        this.f492609i = aVar;
        this.f492610m = j17;
        this.f492611n = lVar;
        this.f492612o = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.l1(this.f492604d, this.f492605e, this.f492606f, this.f492607g, this.f492608h, this.f492609i, this.f492610m, this.f492611n, this.f492612o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sp2.l1 l1Var = (sp2.l1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        int m75939xb282bd08;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f492604d;
        sb6.append(fVar.f152148a);
        sb6.append(" errCode=");
        sb6.append(fVar.f152149b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        rq2.d dVar = rq2.d.f480349a;
        int i17 = this.f492605e;
        dVar.f(i17, 10000);
        cq2.q qVar = cq2.q.f302961a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        qVar.i("normalCgiBack", (r45.dk2) resp);
        int i18 = fVar.f152148a;
        yz5.l lVar = this.f492611n;
        sp2.o2 o2Var = this.f492606f;
        if (i18 == 0 && fVar.f152149b == 0) {
            o2Var.A = (r45.dk2) fVar.f152151d;
            java.lang.Integer num = new java.lang.Integer(this.f492608h);
            num.intValue();
            boolean z18 = this.f492607g;
            if (!(!z18)) {
                num = null;
            }
            o2Var.I(z18, num, (r45.dk2) fVar.f152151d);
            r45.dk2 dk2Var = o2Var.A;
            sp2.j.f492588b = dk2Var != null && dk2Var.m75933x41a8a7f2(10);
            r45.dk2 dk2Var2 = o2Var.A;
            tp2.f.f502670g = dk2Var2 != null && dk2Var2.m75933x41a8a7f2(10);
            rq2.o oVar = rq2.o.f480380a;
            r45.dk2 dk2Var3 = o2Var.A;
            rq2.o.f480381b = dk2Var3 != null && dk2Var3.m75933x41a8a7f2(10);
            sp2.b bVar = sp2.b.f492505a;
            sp2.b.f492508d = (o2Var.A != null ? r6.m75939xb282bd08(3) : 0) * 1000;
            if (z18 && i17 != 1 && i17 != 2) {
                o2Var.Y = ((r45.dk2) fVar.f152151d).m75934xbce7f2f(6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi firstCgiLastBuffer=" + o2Var.Y);
            }
            yz5.a aVar2 = this.f492609i;
            if (aVar2 != null && ((java.lang.Boolean) aVar2.mo152xb9724478()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadData complete, discardProcess");
            } else {
                sp2.o2 o2Var2 = this.f492606f;
                r45.dk2 dk2Var4 = o2Var2.A;
                boolean z19 = this.f492607g;
                o2Var2.G(dk2Var4, z19, this.f492610m, lVar == null && z19);
            }
            o2Var.D((r45.ha2) ((r45.dk2) fVar.f152151d).m75936x14adae67(13));
            z17 = true;
        } else {
            z17 = false;
        }
        dVar.e(i17, 10000);
        if (lVar != null) {
            lVar.mo146xb9724478(fVar);
        } else {
            if (z17) {
                gp2.l0 l0Var = o2Var.f492695x;
                if (l0Var != null) {
                    r45.dk2 dk2Var5 = o2Var.A;
                    l0Var.H(dk2Var5 != null ? dk2Var5.m75939xb282bd08(15) : 0);
                }
                p3325xe03a0797.p3326xc267989b.l.d(o2Var.f492662e, null, null, new sp2.j1(o2Var, null), 3, null);
                r45.dk2 dk2Var6 = o2Var.A;
                if (dk2Var6 != null && (m75939xb282bd08 = dk2Var6.m75939xb282bd08(5)) > 0) {
                    zl2.r4.f555483a.I0().putInt("finder_live_watch_count_down_refresh_interval", m75939xb282bd08);
                }
                if (!o2Var.f492666g) {
                    o2Var.f492666g = true;
                    o2Var.E();
                    r45.dk2 dk2Var7 = o2Var.A;
                    boolean m75933x41a8a7f2 = dk2Var7 != null ? dk2Var7.m75933x41a8a7f2(7) : false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "#loadDataWithCgi cgi end skipGetAllLiveTabs=" + m75933x41a8a7f2);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o2Var.f492654a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    ((sp2.b0) pf5.z.f435481a.a(activity).a(sp2.b0.class)).P6(o2Var.A, m75933x41a8a7f2);
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = o2Var.f492688r;
            if (c22851x22587864 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x22587864.i(z17);
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = o2Var.f492688r;
            if (c22851x225878642 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x225878642.e(z17);
            com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878643 = o2Var.f492688r;
            if (c22851x225878643 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                throw null;
            }
            c22851x225878643.setEnabled(true);
        }
        yz5.l lVar2 = this.f492612o;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(fVar);
        }
        o2Var.C(false);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
        if (c14595xffb7e034 != null) {
            c14595xffb7e034.getViewTreeObserver().addOnPreDrawListener(new sp2.k1(currentTimeMillis, i17, o2Var));
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }
}
