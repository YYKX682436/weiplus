package yn2;

/* loaded from: classes2.dex */
public final class m extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e f545527e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f545528f = jz5.h.b(yn2.k.f545525d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f545529g = jz5.h.b(yn2.l.f545526d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f545530h = jz5.h.b(new yn2.f(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f545531i = jz5.h.b(new yn2.e(this));

    /* renamed from: m, reason: collision with root package name */
    public final boolean f545532m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f545533n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f545534o;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f545527e = r5
            yn2.k r0 = yn2.k.f545525d
            jz5.g r0 = jz5.h.b(r0)
            r4.f545528f = r0
            yn2.l r0 = yn2.l.f545526d
            jz5.g r0 = jz5.h.b(r0)
            r4.f545529g = r0
            yn2.f r0 = new yn2.f
            r0.<init>(r4)
            jz5.g r0 = jz5.h.b(r0)
            r4.f545530h = r0
            yn2.e r0 = new yn2.e
            r0.<init>(r4)
            jz5.g r0 = jz5.h.b(r0)
            r4.f545531i = r0
            r0 = 0
            if (r5 == 0) goto L5c
            r1 = r5
            xn2.p0 r1 = (xn2.p0) r1
            java.lang.Boolean r2 = r1.C
            if (r2 != 0) goto L57
            com.tencent.mm.plugin.finder.storage.t70 r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.I7
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            lb2.j r2 = (lb2.j) r2
            java.lang.Object r2 = r2.r()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 2
            if (r2 != r3) goto L50
            r2 = 1
            goto L51
        L50:
            r2 = r0
        L51:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.C = r2
        L57:
            boolean r1 = r2.booleanValue()
            goto L5d
        L5c:
            r1 = r0
        L5d:
            r4.f545532m = r1
            if (r5 == 0) goto L68
            r0 = r5
            xn2.p0 r0 = (xn2.p0) r0
            boolean r0 = r0.h()
        L68:
            r4.f545533n = r0
            if (r5 == 0) goto La5
            xn2.p0 r5 = (xn2.p0) r5
            android.app.Activity r5 = r5.f537076a
            if (r5 == 0) goto La5
            pf5.z r0 = pf5.z.f435481a
            boolean r1 = r5 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r1 == 0) goto L99
            androidx.appcompat.app.AppCompatActivity r5 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r5
            pf5.v r5 = r0.a(r5)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r5 = r5.a(r0)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r5
            r0 = 9
            fc2.c r5 = r5.Y6(r0)
            if (r5 == 0) goto La5
            yn2.a r0 = new yn2.a
            r0.<init>(r4)
            r5.a(r0)
            jz5.f0 r5 = jz5.f0.f384359a
            goto La6
        L99:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        La5:
            r5 = 0
        La6:
            if (r5 != 0) goto Laf
            java.lang.String r5 = "init fail, context is null!"
            java.lang.String r0 = "Finder.MegaVideoCardConvert"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r5)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.m.<init>(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e):void");
    }

    public static final void n(yn2.m mVar, in5.s0 s0Var, android.view.View view, zn2.a aVar, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", "[onMediaLongClick] feedId=".concat(pm0.v.u(aVar.mo2128x1ed62e84())));
        if (aVar.getIsPreview() || (eVar = mVar.f545527e) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(s0Var.f374654e, 1, false);
        xn2.p0 p0Var = (xn2.p0) eVar;
        k0Var.f293405n = new xn2.o(aVar, p0Var);
        k0Var.f293414s = new xn2.p(p0Var, aVar, s0Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Ni(s0Var, aVar.mo2128x1ed62e84(), aVar.getFeedObject());
        view.performHapticFeedback(0, 2);
        k0Var.v();
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dk9;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        this.f545534o = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x05a6, code lost:
    
        if (r2 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0311, code lost:
    
        if (pf5.e.m158343xd39de650((pf5.e) r5, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new vn2.h(r0, r3, r1, r40, r41, r2, 0.05f, null), 2, null) == null) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020a  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r51, in5.c r52, int r53, int r54, boolean r55, java.util.List r56) {
        /*
            Method dump skipped, instructions count: 2424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yn2.m.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        android.widget.FrameLayout frameLayout;
        jz5.f0 f0Var;
        cw2.f8 f8Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.C14435x7088aa5 c14435x7088aa5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.C14435x7088aa5) holder.p(com.p314xaae8f345.mm.R.id.hqu);
        android.view.ViewGroup.LayoutParams layoutParams = c14435x7088aa5.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.height = a06.d.b((o() / 16.0f) * 9.0f);
            marginLayoutParams.width = o();
        }
        vn2.u0 u0Var = vn2.u0.f519920a;
        if (u0Var.g() && (frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.iqf)) != null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(holder.f374654e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2j, (android.view.ViewGroup) null, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) inflate;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = this.f545527e;
            if (eVar == null || (f8Var = ((xn2.p0) eVar).f537083h) == null) {
                f0Var = null;
            } else {
                c15196x85976f5f.m61512xab2cb478(f8Var);
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.MegaVideoCardConvert", "create video layout fail,video core is null!");
            }
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            frameLayout.addView(c15196x85976f5f, 0, layoutParams2);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hih);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(holder.hashCode());
        sb6.append(" MegaVideoCreateViewHolder screenWidth=");
        sb6.append(((java.lang.Number) ((jz5.n) this.f545528f).mo141623x754a37bb()).intValue());
        sb6.append(",cover size=(");
        android.view.ViewGroup.LayoutParams layoutParams3 = c14435x7088aa5.getLayoutParams();
        sb6.append(layoutParams3 != null ? java.lang.Integer.valueOf(layoutParams3.width) : null);
        sb6.append(" * ");
        android.view.ViewGroup.LayoutParams layoutParams4 = c14435x7088aa5.getLayoutParams();
        sb6.append(layoutParams4 != null ? java.lang.Integer.valueOf(layoutParams4.height) : null);
        sb6.append(')');
        u0Var.l("Finder.MegaVideoCardConvert", sb6.toString());
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        this.f545534o = null;
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", "Debug " + holder.hashCode() + " onViewDetachedFromWindow");
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f != null) {
            c15196x85976f5f.P();
            c15196x85976f5f.m61499x6ec2df6f(null);
            c15196x85976f5f.S();
        }
        boolean z18 = false;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", "Debug " + holder.hashCode() + " onViewRecycled");
        }
    }

    public final int o() {
        return ((java.lang.Number) ((jz5.n) this.f545530h).mo141623x754a37bb()).intValue();
    }

    public final float p(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, r45.mb4 mb4Var) {
        float m75942xfb822ef2;
        java.lang.String str;
        boolean z17;
        if (j17 <= 0 || mb4Var.m75942xfb822ef2(24) <= 0) {
            java.lang.String n17 = ds2.h.f324399a.c(abstractC14490x69736cb5.mo2128x1ed62e84(), mb4Var, false).n();
            float f17 = cu2.x.c(cu2.x.f303982a, n17, false, false, false, 14, null).f68986xa6baeca6;
            if (f17 > 0.0f) {
                str = n17;
                m75942xfb822ef2 = f17;
            } else {
                r45.no2 m76812x1c39ba23 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76812x1c39ba23();
                int m75939xb282bd08 = m76812x1c39ba23 != null ? m76812x1c39ba23.m75939xb282bd08(0) : 0;
                m75942xfb822ef2 = (m75939xb282bd08 <= 0 || mb4Var.m75942xfb822ef2(24) <= 0) ? 0.0f : (m75939xb282bd08 * 1.0f) / ((float) mb4Var.m75942xfb822ef2(24));
                str = n17;
            }
        } else {
            m75942xfb822ef2 = (((float) j17) * 1.0f) / ((float) mb4Var.m75942xfb822ef2(24));
            str = "";
        }
        boolean z18 = true;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Debug setPlayProgress lastPlayTimeMs=");
            sb6.append(j17);
            sb6.append(",cachePlayProgress=");
            sb6.append(cu2.x.c(cu2.x.f303982a, str, false, false, false, 14, null).f68986xa6baeca6);
            sb6.append(",breakPointTimeMs=");
            r45.no2 m76812x1c39ba232 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76812x1c39ba23();
            sb6.append(m76812x1c39ba232 != null ? java.lang.Integer.valueOf(m76812x1c39ba232.m75939xb282bd08(0)) : null);
            sb6.append(",videoDuration=");
            sb6.append(mb4Var.m75942xfb822ef2(24));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", sb6.toString());
        }
        return m75942xfb822ef2;
    }

    public final void q(in5.s0 s0Var, int i17, zn2.a aVar) {
        int i18;
        int i19;
        java.lang.String m76084x8010e5e4;
        java.lang.String m76102x6c03c64c;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        nv2.h1 h1Var = nv2.n1.f422083g;
        nv2.n1 n1Var = nv2.n1.f422084h;
        java.util.LinkedList h17 = n1Var.h(aVar.getFeedObject().getFeedObject());
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.qnz);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        int size = h17.size();
        android.content.Context context = s0Var.f374654e;
        if (size <= 0) {
            ((android.widget.RelativeLayout) s0Var.p(com.p314xaae8f345.mm.R.id.qlo)).setVisibility(8);
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.lo8);
            if (textView == null) {
                return;
            }
            r45.ru2 m76771x17e42f9f = aVar.getFeedObject().getFeedObject().m76771x17e42f9f();
            java.lang.String str2 = "";
            if (m76771x17e42f9f != null) {
                java.lang.String m75945x2fec8307 = m76771x17e42f9f.m75945x2fec8307(0);
                str2 = "";
                if (m75945x2fec8307 != null) {
                    str2 = m75945x2fec8307;
                }
            }
            r45.ru2 m76771x17e42f9f2 = aVar.getFeedObject().getFeedObject().m76771x17e42f9f();
            int m75939xb282bd08 = m76771x17e42f9f2 != null ? m76771x17e42f9f2.m75939xb282bd08(1) : 0;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.qnz);
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                textView.setVisibility(8);
                return;
            }
            android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.qnz);
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            textView.setVisibility(0);
            textView.setText(str2);
            if (m75939xb282bd08 != 3) {
                if (m75939xb282bd08 == 4) {
                    i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24;
                } else if (m75939xb282bd08 == 5) {
                    i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880;
                }
                textView.setTextColor(context.getColor(i18));
                return;
            }
            i18 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19;
            textView.setTextColor(context.getColor(i18));
            return;
        }
        ((android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.lo8)).setVisibility(8);
        java.util.LinkedList h18 = n1Var.h(aVar.getFeedObject().getFeedObject());
        int g17 = n1Var.g(aVar.getFeedObject().getFeedObject());
        ((android.widget.RelativeLayout) s0Var.p(com.p314xaae8f345.mm.R.id.qlo)).setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(s0Var.p(com.p314xaae8f345.mm.R.id.f566593ge5));
        arrayList.add(s0Var.p(com.p314xaae8f345.mm.R.id.ge7));
        arrayList.add(s0Var.p(com.p314xaae8f345.mm.R.id.ge9));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.ge6);
        android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.ge8);
        android.widget.FrameLayout frameLayout6 = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.ge_);
        android.widget.FrameLayout frameLayout7 = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.gef);
        java.lang.Integer valueOf = java.lang.Integer.valueOf((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = intValue;
        layoutParams2.height = intValue;
        frameLayout4.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout5.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams4 = (android.widget.FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = intValue;
        layoutParams4.width = intValue;
        layoutParams4.height = intValue;
        frameLayout5.setLayoutParams(layoutParams4);
        android.view.ViewGroup.LayoutParams layoutParams5 = frameLayout6.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams6 = (android.widget.FrameLayout.LayoutParams) layoutParams5;
        layoutParams6.leftMargin = intValue * 2;
        layoutParams6.width = intValue;
        layoutParams6.height = intValue;
        frameLayout6.setLayoutParams(layoutParams6);
        android.view.ViewGroup.LayoutParams layoutParams7 = frameLayout7.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams8 = (android.widget.FrameLayout.LayoutParams) layoutParams7;
        layoutParams8.width = intValue;
        layoutParams8.height = intValue;
        frameLayout7.setLayoutParams(layoutParams8);
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) it.next();
            android.view.ViewGroup.LayoutParams layoutParams9 = imageView != null ? imageView.getLayoutParams() : null;
            if (layoutParams9 != null) {
                layoutParams9.width = intValue2;
            }
            if (layoutParams9 != null) {
                layoutParams9.height = intValue2;
            }
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams9);
            }
        }
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.geb);
        android.view.ViewGroup.LayoutParams layoutParams10 = p17 != null ? p17.getLayoutParams() : null;
        if (layoutParams10 != null) {
            layoutParams10.width = intValue2;
        }
        if (layoutParams10 != null) {
            layoutParams10.height = intValue2;
        }
        if (p17 != null) {
            p17.setLayoutParams(layoutParams10);
        }
        arrayList2.add(frameLayout4);
        arrayList2.add(frameLayout5);
        arrayList2.add(frameLayout6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d) s0Var.p(com.p314xaae8f345.mm.R.id.agf);
        if (c13821x319c273d != null) {
            c13821x319c273d.m56020x205ac394(0.1f);
            i19 = 0;
            c13821x319c273d.getChildAt(0).setBackground(null);
        } else {
            i19 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d) s0Var.p(com.p314xaae8f345.mm.R.id.agg);
        if (c13821x319c273d2 != null) {
            c13821x319c273d2.m56020x205ac394(0.1f);
            c13821x319c273d2.getChildAt(i19).setBackground(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d) s0Var.p(com.p314xaae8f345.mm.R.id.agh);
        if (c13821x319c273d3 != null) {
            c13821x319c273d3.m56020x205ac394(0.1f);
            c13821x319c273d3.getChildAt(i19).setBackground(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d) s0Var.p(com.p314xaae8f345.mm.R.id.gec);
        if (c13821x319c273d4 != null) {
            c13821x319c273d4.m56020x205ac394(0.1f);
        }
        java.util.Iterator it6 = arrayList.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) next;
            if (imageView2 != null) {
                android.view.ViewParent parent = imageView2.getParent();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d c13821x319c273d5 = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d) parent : null;
                if (c13821x319c273d5 != null) {
                    c13821x319c273d5.m56020x205ac394(0.1f);
                }
                if (i27 >= h18.size()) {
                    android.view.View view = (android.view.View) arrayList2.get(i27);
                    if (view != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    android.view.View view2 = (android.view.View) arrayList2.get(i27);
                    if (view2 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "realNameLayoutSetAvatar", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    int size2 = h18.size();
                    if (size2 < 0) {
                        size2 = 0;
                    }
                    if (size2 > 3) {
                        size2 = 3;
                    }
                    int i29 = (size2 - i27) - 1;
                    java.lang.String m76074x6d346f39 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) h18.get(i29)).m76074x6d346f39();
                    if (m76074x6d346f39 == null) {
                        m76074x6d346f39 = "";
                    }
                    java.lang.String m76102x6c03c64c2 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) h18.get(i29)).m76102x6c03c64c();
                    java.lang.String r17 = c01.z1.r();
                    imageView2.setImageDrawable(null);
                    boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76102x6c03c64c2, r17);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    if (b17) {
                        g1Var.i().c(new mn2.n("", null, 2, null), imageView2, g1Var.h(mn2.f1.f411493n));
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView2, r17, 0.0f);
                    } else {
                        g1Var.i().c(new mn2.n(m76074x6d346f39, null, 2, null), imageView2, g1Var.h(mn2.f1.f411493n));
                    }
                }
            }
            i27 = i28;
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.Z(h18);
        java.lang.String str3 = (c19781xd1c47b87 == null || (m76102x6c03c64c = c19781xd1c47b87.m76102x6c03c64c()) == null) ? "" : m76102x6c03c64c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b872 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) kz5.n0.Z(h18);
        java.lang.String f17 = hc2.x0.f(c61.yb.md(ybVar, str3, (c19781xd1c47b872 == null || (m76084x8010e5e4 = c19781xd1c47b872.m76084x8010e5e4()) == null) ? "" : m76084x8010e5e4, false, 4, null), 7);
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.lkh);
        if (textView2 != null) {
            textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg, null));
            com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
            textView2.setTextSize(1, 12.0f);
            textView2.setText(f17);
        }
        android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.lke);
        textView3.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg, null));
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        textView3.setTextSize(1, 12.0f);
        boolean m59316xb1cf450c = aVar.getFeedObject().m59316xb1cf450c();
        int m76785x6e4908f2 = aVar.getFeedObject().getFeedObject().m76785x6e4908f2();
        int i37 = g17 - m76785x6e4908f2;
        r45.bm2 e17 = cu2.f0.f303924a.e(aVar.getFeedObject().getFeedObject().m76805x2dd7a70f());
        java.lang.String string = g17 <= 1 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ch8) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ch7, java.lang.String.valueOf(i37 + m76785x6e4908f2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        zy2.s6 s6Var = (zy2.s6) i95.n0.c(zy2.s6.class);
        zy2.m6 m6Var = new zy2.m6();
        m6Var.f558999a = e17;
        m6Var.f559000b = aVar.getFeedObject().getFeedObject();
        m6Var.f559001c = g17;
        m6Var.f559002d = false;
        m6Var.f559003e = m59316xb1cf450c;
        m6Var.f559004f = i17;
        m6Var.f559005g = "";
        m6Var.f559006h = new so2.m6();
        m6Var.f559007i = com.p314xaae8f345.mm.R.C30859x5a72f63.adg;
        ((ht2.y0) s6Var).Ri(textView3, m6Var);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.lkg);
        java.lang.Object obj = "";
        obj = "";
        if (m76785x6e4908f2 > 0 && m59316xb1cf450c) {
            int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573481er0, java.lang.Integer.valueOf(m76785x6e4908f2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            obj = hc2.x0.k(string2, context, '#', com.p314xaae8f345.mm.R.raw.f79668x47e8ad96, com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6, dimension, dimension, 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        }
        if (viewGroup != null) {
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e79, f17);
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e5o, string);
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.e5p, obj);
        }
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.gan);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "setLikeRecommendLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ILcom/tencent/mm/plugin/finder/megavideo/topstory/flow/feed/MegaVideoCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert", "setLikeRecommendLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ILcom/tencent/mm/plugin/finder/megavideo/topstory/flow/feed/MegaVideoCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
