package tb2;

/* loaded from: classes2.dex */
public abstract class f extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final float f498500e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f498501f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f498502g;

    /* renamed from: h, reason: collision with root package name */
    public final float f498503h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f498504i;

    public f(float f17, boolean z17, boolean z18, float f18, yz5.p jumProfileCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumProfileCallback, "jumProfileCallback");
        this.f498500e = f17;
        this.f498501f = z17;
        this.f498502g = z18;
        this.f498503h = f18;
        this.f498504i = jumProfileCallback;
    }

    @Override // in5.r
    public int e() {
        return this.f498502g ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f570869c61 : this.f498501f ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f570870c62 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570868c60;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        d92.f fVar = d92.f.f309003a;
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.e_e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        d92.f.o(fVar, p17, false, false, false, 7, null);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.fuv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        d92.f.o(fVar, p18, false, false, false, 7, null);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.f564832a85);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
        d92.f.o(fVar, p19, false, false, false, 7, null);
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.f569217pg0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
        d92.f.o(fVar, p27, false, false, false, 7, null);
    }

    public final void n(in5.s0 s0Var, r45.mb4 mb4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        java.lang.String str;
        java.lang.Class cls;
        java.lang.Class cls2;
        boolean z17;
        mn2.g1 g1Var;
        r45.co1 co1Var;
        java.lang.String m75945x2fec8307;
        r45.co1 co1Var2;
        int i17;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.icp);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.e_l);
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.Loader", "bindCover return for thumbIv is null.");
            return;
        }
        tb2.b bVar = new tb2.b(imageView, abstractC14490x69736cb5, this, mb4Var, p17);
        if (com.p314xaae8f345.mm.ui.bk.Q()) {
            s0Var.f3639x46306858.getViewTreeObserver().addOnPreDrawListener(new tb2.a(s0Var, bVar));
        } else {
            com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.System.nanoTime();
            boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i18 = a17.f278668a;
            if (!z18 && i18 > (i17 = a17.f278669b)) {
                i18 = i17;
            }
            bVar.mo146xb9724478(java.lang.Integer.valueOf((i18 - ((int) this.f498500e)) / 2));
        }
        java.lang.String y17 = zl2.q4.f555466a.y(mb4Var, 1);
        java.lang.String str3 = "";
        if (!(y17.length() > 0)) {
            java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(16);
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(20);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            y17 = m75945x2fec83072.concat(m75945x2fec83073);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83074 = mb4Var.m75945x2fec8307(19);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            sb6.append(m75945x2fec83074);
            y17 = sb6.toString();
        }
        r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        boolean z27 = m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1;
        pf5.u uVar = pf5.u.f435469a;
        mn2.g1 g1Var2 = mn2.g1.f411508a;
        boolean z28 = this.f498501f;
        if (z27) {
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).c(new mn2.q3(y17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, z28 ? g1Var2.h(mn2.f1.f411501v) : g1Var2.h(mn2.f1.f411486d));
            str = "getService(...)";
            cls = zy2.b6.class;
            cls2 = mn2.i4.class;
            z17 = z28;
            g1Var = g1Var2;
        } else {
            i95.m c17 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            str = "getService(...)";
            cls = zy2.b6.class;
            cls2 = mn2.i4.class;
            z17 = z28;
            g1Var = g1Var2;
            c61.zb.g7((c61.zb) c17, imageView, y17, 0, 4, null);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = abstractC14490x69736cb5.getFeedObject().m59240x7c94657b();
        r45.nw1 m59258xd05571302 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        if (!(m59258xd05571302 != null && m59258xd05571302.m75939xb282bd08(2) == 1)) {
            i95.m c18 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, str);
            c61.zb.g7((c61.zb) c18, imageView, y17, 0, 4, null);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        r45.nw1 m76794xd0557130 = m59240x7c94657b.m76794xd0557130();
        if (!((m76794xd0557130 == null || (co1Var2 = (r45.co1) m76794xd0557130.m75936x14adae67(43)) == null || co1Var2.m75939xb282bd08(0) != 1) ? false : true)) {
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(cls).c(cls2))).H).mo141623x754a37bb()).c(new mn2.q3(y17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, z17 ? g1Var.h(mn2.f1.f411501v) : g1Var.h(mn2.f1.f411486d));
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        i95.m c19 = i95.n0.c(vd2.i5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, str);
        vd2.i5.l7((vd2.i5) c19, y17, imageView, null, 4, null);
        if (textView != null) {
            r45.nw1 m76794xd05571302 = m59240x7c94657b.m76794xd0557130();
            if (m76794xd05571302 != null && (co1Var = (r45.co1) m76794xd05571302.m75936x14adae67(43)) != null && (m75945x2fec8307 = co1Var.m75945x2fec8307(1)) != null) {
                str3 = m75945x2fec8307;
            }
            textView.setText(str3);
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public final void o(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(item.getFeedObject().m59226x730bcac6())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(item.getFeedObject().getDescriptionSpan());
        }
    }

    public final void p(in5.s0 s0Var, so2.h1 h1Var) {
        java.lang.Object obj;
        r45.an1 an1Var = h1Var.f491910d;
        if (an1Var == null) {
            obj = null;
        } else if (an1Var.m75933x41a8a7f2(5)) {
            ((android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f4p)).setVisibility(8);
            obj = jz5.f0.f384359a;
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f4p);
            viewGroup.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a;
            a3Var.a(viewGroup, an1Var);
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f4q);
            textView.setText(an1Var.m75945x2fec8307(0));
            java.util.LinkedList m75941xfb821914 = an1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getWording_color(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.e(a3Var, textView, m75941xfb821914, null, null, 6, null);
            java.lang.Object p17 = s0Var.p(com.p314xaae8f345.mm.R.id.r6b);
            android.widget.ImageView imageView = (android.widget.ImageView) p17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a3Var.b(imageView, an1Var);
            obj = p17;
        }
        if (obj == null) {
            ((android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f4p)).setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x0105, code lost:
    
        if (r11 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
    
        if (r11 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0107, code lost:
    
        r11 = r11.m176700xe5e0d2a0();
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(in5.s0 r21, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb2.f.q(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int, boolean, java.util.List):void");
    }
}
