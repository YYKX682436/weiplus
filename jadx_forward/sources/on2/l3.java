package on2;

/* loaded from: classes3.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final on2.l3 f428499a = new on2.l3();

    public static final void b(android.widget.TextView textView, boolean z17) {
        textView.setEnabled(z17);
        if (z17) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 a(android.app.Activity activity, r45.cz1 lotteryInfo, yz5.l claimCallback) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfo, "lotteryInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(claimCallback, "claimCallback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1 c1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.c1(activity);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570543b13, (android.view.ViewGroup) new android.widget.FrameLayout(activity), false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.c_x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        b(textView, false);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565272bx0);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hdg);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        zl2.r4.f555483a.Z2(editText, textView2, 96, 48, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new on2.d3(h0Var, editText, textView));
        android.content.res.Resources resources = editText.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.yy1 yy1Var = (r45.yy1) lotteryInfo.m75936x14adae67(13);
        if (yy1Var == null || (str = yy1Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        objArr[0] = str;
        editText.setHint(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dpm, objArr));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b5w)).setOnClickListener(new on2.e3(c1Var));
        textView.setOnClickListener(new on2.f3(c1Var, claimCallback, h0Var));
        c1Var.k(inflate);
        c1Var.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/LotteryUtil", "claimByCustomize", "(Landroid/app/Activity;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/view/CustomInputBottomPage;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/finder/lottery/LotteryUtil", "claimByCustomize", "(Landroid/app/Activity;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/view/CustomInputBottomPage;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.animate().alpha(1.0f).start();
        c1Var.s();
        inflate.postDelayed(new on2.c3(inflate), 300L);
        return c1Var;
    }

    public final boolean c(android.content.Context context, java.lang.String finderUsername, int i17, java.lang.String lotteryId, long j17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryId, "lotteryId");
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.G().r()).intValue() <= 0) {
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn9), 0).show();
            return false;
        }
        r45.zy1 zy1Var = new r45.zy1();
        zy1Var.set(0, finderUsername);
        zy1Var.set(5, java.lang.Boolean.FALSE);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Vi(context, i17, zy1Var, lotteryId, j17, qt2Var, false);
        return true;
    }

    public final java.lang.String d(s71.b obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(obj.f485505f)) {
            sb6.append(obj.f485505f);
        }
        if (!android.text.TextUtils.isEmpty(obj.f485506g)) {
            sb6.append(" ");
            sb6.append(obj.f485506g);
        }
        if (!android.text.TextUtils.isEmpty(obj.f485507h)) {
            sb6.append(" ");
            sb6.append(obj.f485507h);
        }
        if (!android.text.TextUtils.isEmpty(obj.f485513q)) {
            sb6.append(" ");
            sb6.append(obj.f485513q);
        }
        if (!android.text.TextUtils.isEmpty(obj.f485509m)) {
            sb6.append(" ");
            sb6.append(obj.f485509m);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.Object e(long j17, byte[] bArr, android.content.Context context, java.lang.String str, r45.p30 p30Var, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LotteryUtil", str + " postClaim!");
        r45.az1 az1Var = new r45.az1();
        az1Var.set(1, db2.t4.f309704a.a(11486));
        az1Var.set(2, java.lang.Long.valueOf(j17));
        az1Var.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        az1Var.set(4, str2 == null ? "" : str2);
        az1Var.set(5, p30Var);
        az1Var.set(6, java.lang.Boolean.TRUE);
        az2.j jVar = (az2.j) az1Var.d();
        az2.j.u(jVar, context, null, 0L, 6, null);
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            l17.K(new on2.h3(str, nVar, context));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final void f(android.widget.TextView tv6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        try {
            java.lang.String string = tv6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.drt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String str = tv6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.drs) + string;
            int L = r26.n0.L(str, string, 0, false, 6, null);
            int length = string.length() + L;
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new on2.a3(new java.lang.ref.WeakReference(tv6.getContext())), L, length, 33);
            tv6.setHighlightColor(tv6.getContext().getResources().getColor(android.R.color.transparent));
            tv6.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            tv6.setText(spannableString);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LotteryUtil-normalLotteryLicense");
        }
    }

    public final void g(android.widget.TextView tv6, r45.cz1 lotteryInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lotteryInfo, "lotteryInfo");
        java.lang.String m75945x2fec8307 = lotteryInfo.m75945x2fec8307(17);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            f(tv6);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LotteryUtil", "normalLotteryLicense wording:" + m75945x2fec8307);
        try {
            java.lang.String string = tv6.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.drt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String v17 = r26.i0.v(m75945x2fec8307, "%@", string, false, 4, null);
            int L = r26.n0.L(v17, string, 0, false, 6, null);
            int length = string.length() + L;
            android.text.SpannableString spannableString = new android.text.SpannableString(v17);
            spannableString.setSpan(new on2.a3(new java.lang.ref.WeakReference(tv6.getContext())), L, length, 33);
            tv6.setHighlightColor(tv6.getContext().getResources().getColor(android.R.color.transparent));
            tv6.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            tv6.setText(spannableString);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LotteryUtil-normalLotteryLicense");
        }
    }

    public final java.lang.Object h(long j17, byte[] bArr, android.content.Context context, java.lang.String str, r45.p30 p30Var, r45.cz1 cz1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LotteryUtil", str + " postClaim!");
        r45.az1 az1Var = new r45.az1();
        az1Var.set(1, db2.t4.f309704a.a(11486));
        az1Var.set(2, java.lang.Long.valueOf(j17));
        az1Var.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        az1Var.set(4, cz1Var.m75945x2fec8307(0));
        az1Var.set(5, p30Var);
        pq5.g l17 = ((az2.j) az1Var.d()).l();
        if (l17 != null) {
            l17.K(new on2.j3(str, nVar, context));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }
}
