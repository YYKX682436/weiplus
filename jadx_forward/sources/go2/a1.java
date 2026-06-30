package go2;

/* loaded from: classes8.dex */
public final class a1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f355480d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f355481e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f355482f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f355483g;

    /* renamed from: h, reason: collision with root package name */
    public long f355484h;

    /* renamed from: i, reason: collision with root package name */
    public final int f355485i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f355486m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f355480d = true;
        this.f355485i = 2000;
    }

    public static final void O6(go2.a1 a1Var, android.content.Context context) {
        a1Var.getClass();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf == null || abstractActivityC21394xb3d2c0cf.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED || abstractActivityC21394xb3d2c0cf.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.RESUMED || abstractActivityC21394xb3d2c0cf.isFinishing() || ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Zi(abstractActivityC21394xb3d2c0cf) || !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3.class)).Di(abstractActivityC21394xb3d2c0cf)) {
            return;
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Yj(abstractActivityC21394xb3d2c0cf, null);
    }

    public final void P6(android.content.Context context, java.lang.String str, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pm0.v.T(new ho2.c(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6(), str, 0, 4, null).l(), new go2.f0(this, str, context, z17, z18)).f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(1:(2:11|12)(2:14|15))(2:16|17))(4:18|19|20|21))(2:58|(12:60|(1:89)(1:65)|(1:67)(1:88)|68|69|70|71|72|73|74|75|(1:77)(1:78))(2:90|91))|22|23|24|(2:26|27)(2:28|(5:30|(1:32)(1:38)|(1:34)|35|(1:37)(1:17))(5:39|(1:41)(1:47)|(1:43)|44|(1:46)(1:12)))))|92|6|(0)(0)|22|23|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
    
        r5 = r0;
        r0 = r2;
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(android.content.Context r26, java.lang.String r27, int r28, java.lang.Integer r29, boolean r30, int r31, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r32) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go2.a1.Q6(android.content.Context, java.lang.String, int, java.lang.Integer, boolean, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String authorFinderUsername, android.view.View view, int i17, int i18, yz5.l lVar) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17 || num == null) {
            return;
        }
        synchronized (eo2.f.f337098a) {
            ((java.util.HashMap) eo2.f.f337099b).remove(authorFinderUsername);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209250gc).mo141623x754a37bb()).r()).intValue() != 1 && (num3 == null || num3.intValue() != 1)) {
            if (i18 == 1) {
                db5.t7.m(m80379x76847179(), m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573435m42));
                return;
            }
            if (view != null) {
                view.setClickable(false);
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new go2.l0(this, authorFinderUsername, num, num2, i17, view, lVar, null), 3, null);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(m80379x76847179());
        android.view.View inflate = android.view.LayoutInflater.from(m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2p, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.hci);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.btf);
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MEMBER_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        checkBox.setChecked(((java.lang.Boolean) m17).booleanValue());
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.kqx);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567809kr0);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kqy);
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567810kr1);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567813kr4);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567811kr2);
        textView2.setText((num2 == null || num2.intValue() <= 0) ? num.toString() : num2.toString());
        textView4.setText(num.toString());
        qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        ((pg0.s3) h0Var).getClass();
        textView2.setTypeface(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(m158354x19263085, 3));
        qg0.h0 h0Var2 = (qg0.h0) i95.n0.c(qg0.h0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        ((pg0.s3) h0Var2).getClass();
        textView4.setTypeface(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(m158354x192630852, 3));
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564323o2);
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564317nw);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.jfe);
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kqz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView5);
        S6(textView5, checkBox, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        T6(true, findViewById3, textView, textView2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        T6(false, findViewById4, textView3, textView4);
        findViewById3.setOnClickListener(new go2.m0(this, textView6, button, findViewById3, textView, textView2, findViewById4, textView3, textView4, textView5, checkBox));
        findViewById4.setOnClickListener(new go2.n0(this, textView6, button, findViewById3, textView, textView2, findViewById4, textView3, textView4, textView5, checkBox));
        if (this.f355483g) {
            return;
        }
        button.setOnClickListener(new go2.p0(i18, this, checkBox, findViewById5, button, findViewById4, findViewById3, y1Var, authorFinderUsername, num, num2, i17, lVar));
        findViewById.setOnClickListener(new go2.q0(y1Var));
        findViewById2.setOnClickListener(new go2.s0(this, y1Var));
        y1Var.k(inflate);
        this.f355480d = true;
        y1Var.s();
    }

    public final void S6(android.widget.TextView textView, android.widget.CheckBox checkBox, boolean z17) {
        textView.setOnClickListener(new go2.t0(checkBox));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f183625a;
        if (!z17) {
            java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.emm, m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ema), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.end));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/XUitUE77PrSs1E17");
            java.lang.String format = java.lang.String.format("https://weixin.qq.com/cgi-bin/readtemplate?lang=%s&t=wxbean", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(m80379x76847179())}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            arrayList.add(format);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ema));
            arrayList2.add(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.end));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f(d8Var, m80379x76847179(), textView, "Finder.FinderMemberPayUIC", string, arrayList, arrayList2, null, 64, null);
            return;
        }
        java.lang.String string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.emn, m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ema), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.en8), m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.end));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/XUitUE77PrSs1E17");
        arrayList3.add("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/3iJr1veYBdD6XWTI");
        java.lang.String format2 = java.lang.String.format("https://weixin.qq.com/cgi-bin/readtemplate?lang=%s&t=wxbean", java.util.Arrays.copyOf(new java.lang.Object[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(m80379x76847179())}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        arrayList3.add(format2);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ema));
        arrayList4.add(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.en8));
        arrayList4.add(m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.end));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d8.f(d8Var, m80379x76847179(), textView, "Finder.FinderMemberPayUIC", string2, arrayList3, arrayList4, null, 64, null);
    }

    public final void T6(boolean z17, android.view.View layout, android.widget.TextView tvType, android.widget.TextView tvPrice) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tvType, "tvType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tvPrice, "tvPrice");
        if (!z17) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
            gradientDrawable.setStroke(m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560645qb));
            layout.setBackground(gradientDrawable);
            tvType.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
            tvPrice.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        gradientDrawable2.setStroke(m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
        gradientDrawable2.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560644qa));
        layout.setBackground(gradientDrawable2);
        tvType.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        tvPrice.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 U6(android.content.Context context, java.lang.String authorFinderUsername, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2q, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.c9x);
        com.p314xaae8f345.mm.ui.bk.r0(button.getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9m);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_w);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        ya2.b2 b17 = ya2.h.f542017a.b(authorFinderUsername);
        boolean z17 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String w07 = b17 != null ? b17.w0() : null;
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        objArr[0] = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, w07, textSize);
        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.emc, objArr));
        if (i17 != 1 && i17 != 2) {
            textView.setVisibility(0);
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        }
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        android.graphics.Point b18 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i19 = b18.x;
        int i27 = b18.y;
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            z17 = false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i18 = i27 - c17;
        } else {
            if (i27 >= i19) {
                i19 = i27;
            }
            i18 = i19 - c17;
        }
        if (layoutParams == null) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams.height = (int) (i18 * 0.7d);
        inflate.setLayoutParams(layoutParams);
        ng5.a.a(imageView, c01.z1.r());
        findViewById.setOnClickListener(new go2.u0(y1Var));
        button.setOnClickListener(new go2.w0(context, i17, authorFinderUsername, y1Var));
        y1Var.k(inflate);
        y1Var.s();
        return y1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPayUIC", "onResume:has startSubscribe " + this.f355481e);
        if (!this.f355481e || (str = this.f355482f) == null) {
            return;
        }
        P6(m80379x76847179(), str, true, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f355480d = true;
        this.f355485i = 2000;
    }
}
