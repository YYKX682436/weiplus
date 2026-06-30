package ql2;

/* loaded from: classes10.dex */
public final class i0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public r45.g92 f446053c;

    /* renamed from: d, reason: collision with root package name */
    public int f446054d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f446055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ql2.j0 f446056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, ql2.j0 j0Var) {
        super(str);
        this.f446056f = j0Var;
        this.f446054d = 1;
    }

    @Override // bi4.o0
    public boolean b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.g92 g92Var = this.f446053c;
        if (g92Var == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g92Var.m75945x2fec8307(1), xy2.c.e(context));
        intent.putExtra("finder_username", g92Var.m75945x2fec8307(1));
        ya2.e1 e1Var = ya2.e1.f542005a;
        if (b17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.x(context, intent, 20, 2);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.w(context, intent);
        }
        return true;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pj4.j0 j0Var = this.f102607b;
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "2")) {
            return false;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j0Var.f436674f, "finderLive", null);
        if (d17 != null) {
            r45.g92 l17 = zy2.d5.l("", d17);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            long Z = pm0.v.Z(l17.m75945x2fec8307(2));
            long Z2 = pm0.v.Z(l17.m75945x2fec8307(0));
            java.lang.String m75945x2fec8307 = l17.m75945x2fec8307(1);
            ml2.x1 x1Var = ml2.x1.f409740n;
            ml2.q1 q1Var = ml2.q1.f409345e;
            zy2.zb.Ng((zy2.zb) c17, Z, Z2, null, m75945x2fec8307, -1L, 0L, x1Var, "temp_16", null, 0, null, 768, null);
            m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("share_scene", java.lang.String.valueOf(l17.m75939xb282bd08(44)));
            z17 = true;
            lVarArr[1] = new jz5.l("liveid", java.lang.String.valueOf(l17.m75945x2fec8307(0)));
            java.lang.String m75945x2fec83072 = l17.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            lVarArr[2] = new jz5.l("feedid", m75945x2fec83072);
            ((b92.y0) i0Var).Bi(false, kz5.c1.i(lVarArr));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(xy2.c.e(context), l17.m75945x2fec8307(1))) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_PARAMS_SOURCE_TYPE", l17.m75939xb282bd08(15));
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                long Z3 = pm0.v.Z(l17.m75945x2fec8307(2));
                java.lang.Long valueOf = java.lang.Long.valueOf(pm0.v.Z(l17.m75945x2fec8307(0)));
                java.lang.String m75945x2fec83073 = l17.m75945x2fec8307(12);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).oj(intent, context2, Z3, valueOf, m75945x2fec83073 == null ? "" : m75945x2fec83073, l17.m75945x2fec8307(4), "", "", "");
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                java.lang.String m75945x2fec83074 = l17.m75945x2fec8307(16);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                intent2.putExtra("key_enter_live_param_ecsource", m75945x2fec83074);
                int i17 = qs5.z.f448011a;
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 3);
                r45.m84 m84Var = new r45.m84();
                m84Var.set(0, java.lang.Long.valueOf(pm0.v.Z(l17.m75945x2fec8307(2))));
                m84Var.set(1, java.lang.Long.valueOf(pm0.v.Z(l17.m75945x2fec8307(0))));
                java.lang.String m75945x2fec83075 = l17.m75945x2fec8307(12);
                if (m75945x2fec83075 == null) {
                    m75945x2fec83075 = "";
                }
                m84Var.set(2, m75945x2fec83075);
                java.lang.String m75945x2fec83076 = l17.m75945x2fec8307(1);
                if (m75945x2fec83076 == null) {
                    m75945x2fec83076 = "";
                }
                m84Var.set(3, m75945x2fec83076);
                m84Var.set(4, "");
                m84Var.set(5, l17.m75945x2fec8307(4));
                m84Var.set(6, null);
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, "");
                wk0Var.set(1, "");
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, 1);
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                ((vd2.f1) e0Var).Ri(context3, intent2, m84Var, true, wk0Var, null);
            }
        } else {
            z17 = true;
        }
        return z17;
    }

    @Override // bi4.o0
    public java.lang.CharSequence f() {
        r45.g92 g92Var = this.f446053c;
        java.lang.String m75945x2fec8307 = g92Var != null ? g92Var.m75945x2fec8307(3) : null;
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // bi4.o0
    public java.lang.String h() {
        r45.g92 g92Var = this.f446053c;
        java.lang.String m75945x2fec8307 = g92Var != null ? g92Var.m75945x2fec8307(2) : null;
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // bi4.o0
    public java.lang.CharSequence i() {
        r45.g92 g92Var = this.f446053c;
        java.lang.String m75945x2fec8307 = g92Var != null ? g92Var.m75945x2fec8307(4) : null;
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        java.util.Map d17;
        super.m(str, j0Var);
        this.f446054d = 1;
        if (j0Var != null && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(j0Var.f436674f, "finderLive", null)) != null) {
            this.f446053c = zy2.d5.l("", d17);
        }
        s();
        r45.g92 g92Var = this.f446053c;
        if (g92Var != null) {
            r(this.f446053c, g92Var.m75939xb282bd08(13));
        }
    }

    @Override // bi4.o0
    public void n() {
        this.f446053c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bi4.o0
    public boolean o(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("Finder.TextStatusProvider");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView);
        r45.g92 g92Var = this.f446053c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = null;
        java.lang.Object[] objArr = 0;
        java.lang.String m75945x2fec8307 = g92Var != null ? g92Var.m75945x2fec8307(11) : null;
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.a().c(new mn2.n(m75945x2fec8307, y90Var, 2, objArr == true ? 1 : 0), imageView, g1Var.h(mn2.f1.f411490h));
        return true;
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        s();
        android.widget.ImageView imageView = new android.widget.ImageView(container.getContext());
        t(imageView);
        container.addView(imageView);
        container.setVisibility(0);
        this.f446055e = new java.lang.ref.WeakReference(imageView);
        return true;
    }

    @Override // bi4.o0
    public boolean q(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        ql2.j0 j0Var = this.f446056f;
        if (!j0Var.f446059e) {
            return true;
        }
        j0Var.f446059e = false;
        r45.g92 g92Var = this.f446053c;
        java.lang.String m75945x2fec8307 = g92Var != null ? g92Var.m75945x2fec8307(5) : null;
        if (m75945x2fec8307 == null || r26.n0.N(m75945x2fec8307)) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("Finder.TextStatusProvider");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
            imageView.setTag("Finder.TextStatusProvider");
            container.removeAllViews();
            container.addView(imageView);
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.post(new ql2.h0(m75945x2fec8307, imageView));
        return true;
    }

    public final void r(r45.g92 g92Var, int i17) {
        if (g92Var != null) {
            p52.c cVar = p52.h.f433549a;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p52.h.B;
            concurrentHashMap.clear();
            ml2.q1 q1Var = ml2.q1.f409345e;
            jz5.l[] lVarArr = new jz5.l[9];
            lVarArr[0] = new jz5.l("feed_id", g92Var.m75945x2fec8307(2));
            lVarArr[1] = new jz5.l("live_id", g92Var.m75945x2fec8307(0));
            lVarArr[2] = new jz5.l("comment_scene", "temp_16");
            lVarArr[3] = new jz5.l("finder_username", g92Var.m75945x2fec8307(1));
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            lVarArr[4] = new jz5.l("behaviour_session_id", Ri);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[5] = new jz5.l("finder_context_id", b52.b.b());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[6] = new jz5.l("finder_tab_context_id", b52.b.c());
            lVarArr[7] = new jz5.l("session_buffer", "");
            lVarArr[8] = new jz5.l("share_scene", java.lang.Integer.valueOf(g92Var.m75939xb282bd08(44)));
            concurrentHashMap.putAll(kz5.c1.k(lVarArr));
        }
        if (i17 == 1) {
            p52.c cVar2 = p52.h.f433549a;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = p52.h.B;
            ml2.v1 v1Var = ml2.v1.f409673e;
            concurrentHashMap2.put("live_enter_status", 1L);
            return;
        }
        p52.c cVar3 = p52.h.f433549a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = p52.h.B;
        ml2.v1 v1Var2 = ml2.v1.f409673e;
        concurrentHashMap3.put("live_enter_status", 2L);
    }

    public final void s() {
        java.lang.String m75945x2fec8307;
        r45.g92 g92Var = this.f446053c;
        if (g92Var == null || (m75945x2fec8307 = g92Var.m75945x2fec8307(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(m75945x2fec8307), false, null, new ql2.e0(this), 0, null, null, null, 246, null);
    }

    public final void t(android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        if (this.f446054d == 2) {
            drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
            com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        } else {
            drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
