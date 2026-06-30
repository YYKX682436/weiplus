package rn2;

/* loaded from: classes15.dex */
public final class c1 implements rn2.f {
    public r45.gz1 A;
    public r45.qa1 B;
    public p3325xe03a0797.p3326xc267989b.r2 C;
    public final p3325xe03a0797.p3326xc267989b.y0 D;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f479197d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f479198e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f479199f;

    /* renamed from: g, reason: collision with root package name */
    public rn2.g f479200g;

    /* renamed from: h, reason: collision with root package name */
    public int f479201h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f479202i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f479203m;

    /* renamed from: n, reason: collision with root package name */
    public int f479204n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f479205o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f479206p;

    /* renamed from: q, reason: collision with root package name */
    public r45.h32 f479207q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f479208r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f479209s;

    /* renamed from: t, reason: collision with root package name */
    public final long f479210t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f479211u;

    /* renamed from: v, reason: collision with root package name */
    public final long f479212v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f479213w;

    /* renamed from: x, reason: collision with root package name */
    public final int f479214x;

    /* renamed from: y, reason: collision with root package name */
    public final rn2.e f479215y;

    /* renamed from: z, reason: collision with root package name */
    public r45.gz1 f479216z;

    /* JADX WARN: Multi-variable type inference failed */
    public c1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        java.lang.String string;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f479197d = activity;
        this.f479198e = "FinderLiveLotteryCreatePresenter";
        ae2.in inVar = ae2.in.f85221a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85266e4).mo141623x754a37bb()).r()).intValue() == 1;
        this.f479199f = z18;
        this.f479202i = "";
        this.f479203m = "";
        this.f479205o = "";
        this.f479206p = "";
        this.f479211u = "";
        this.f479213w = "";
        rn2.e eVar = new rn2.e();
        this.f479215y = eVar;
        p3325xe03a0797.p3326xc267989b.y0 b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        this.D = b17;
        this.f479210t = activity.getIntent().getLongExtra("KEY_PARAMS_LIVE_ID", 0L);
        this.f479212v = activity.getIntent().getLongExtra("KEY_PARAMS_OBJECT_ID", 0L);
        java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_PARAMS_NONCE_ID");
        this.f479211u = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = activity.getIntent().getStringExtra("KEY_PARAMS_ANCHOR_USERNAME");
        java.lang.String str = stringExtra2 == null ? "" : stringExtra2;
        this.f479213w = str;
        int intExtra = activity.getIntent().getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
        this.f479214x = intExtra;
        rn2.b a17 = eVar.a();
        if (a17 != null) {
            a17.f479181e = true;
        }
        this.f479201h = a17 != null ? a17.f479179c : 1;
        if (a17 == null || (string = a17.f479177a) == null) {
            string = activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573158dp5);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        this.f479202i = string;
        gk2.e eVar2 = gk2.e.f354004n;
        if (eVar2 != null && (j0Var = ((on2.z2) eVar2.a(on2.z2.class)).f428628p) != null) {
            z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.mo3195x754a37bb(), java.lang.Boolean.TRUE);
        }
        if (z17) {
            c();
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(b17, null, null, new rn2.n0(this, null), 3, null);
        }
        az2.f a18 = az2.c.a(az2.f.f97658d, activity, null, 0L, null, 14, null);
        a18.a();
        r45.et1 et1Var = new r45.et1();
        et1Var.set(2, str);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8400;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetlotterypreparedata";
        lVar.f152197a = et1Var;
        lVar.f152198b = new r45.ft1();
        com.p314xaae8f345.mm.p944x882e457a.o a19 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a19);
        pq5.g l17 = wi6.l();
        if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            l17.f((im5.b) activity);
        }
        l17.K(new rn2.z0(a18, this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryCreatePresenter", "showAttendTypeCompatibility: " + z18 + ",lotterySource:" + intExtra);
    }

    public void A(rn2.b type) {
        int i17;
        rn2.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        rn2.e eVar = this.f479215y;
        eVar.getClass();
        java.util.LinkedList linkedList = eVar.f479240i;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = type.f479179c;
            boolean z17 = false;
            if (!hasNext) {
                break;
            }
            rn2.b bVar = (rn2.b) it.next();
            if (bVar.f479179c == i17) {
                z17 = true;
            }
            bVar.f479181e = z17;
        }
        eVar.f479244m = i17;
        java.util.LinkedList linkedList2 = eVar.f479242k;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        linkedList2.addAll(eVar.f479241j);
        int i18 = type.f479179c;
        if (i18 != 3) {
            this.f479203m = "";
        }
        if (i18 != 6) {
            this.f479207q = null;
        }
        this.f479201h = i18;
        this.f479202i = type.f479177a;
        g(i18, false);
        if (this.f479199f && this.f479201h == 4 && (gVar = this.f479200g) != null) {
            ((rn2.t2) gVar).s(0, 0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.doq), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v39, types: [rn2.w] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [r45.gz1] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v96 */
    public void B(int i17) {
        java.lang.Integer num;
        android.text.Editable editable;
        java.lang.Integer num2;
        java.lang.String str;
        rn2.e eVar = this.f479215y;
        r45.vc5 vc5Var = eVar.f479237f;
        boolean z17 = vc5Var != null && vc5Var.m75933x41a8a7f2(1);
        if (i17 == 0 && z17) {
            rn2.g gVar = this.f479200g;
            if (gVar != null) {
                r45.vc5 vc5Var2 = eVar.f479237f;
                if (vc5Var2 == null || (str = vc5Var2.m75945x2fec8307(2)) == null) {
                    str = "";
                }
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = ((rn2.t2) gVar).f479386e;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(abstractActivityC21394xb3d2c0cf);
                android.view.View inflate = android.view.LayoutInflater.from(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.deq, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qc8);
                if (str.length() == 0) {
                    str = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573165lj0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
                }
                textView.setText(str);
                inflate.findViewById(com.p314xaae8f345.mm.R.id.c9z).setOnClickListener(new rn2.l2(y1Var));
                y1Var.k(inflate);
                y1Var.s();
            }
            if (eVar.b() == i17) {
                eVar.g(i17);
            }
        } else {
            eVar.g(i17);
        }
        rn2.g gVar2 = this.f479200g;
        if (gVar2 != null) {
            int b17 = eVar.b();
            rn2.t2 t2Var = (rn2.t2) gVar2;
            android.view.View view = t2Var.f479400s;
            if (view == null) {
                num = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                num = 0;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "onSelectPrizeSource", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "onSelectPrizeSource", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rn2.f fVar = t2Var.f479387f;
            if (b17 != 0) {
                android.view.View view2 = t2Var.f479385d;
                if (b17 == 1) {
                    java.lang.Integer num3 = num;
                    editable = null;
                    android.view.View view3 = t2Var.D;
                    if (view3 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(num3);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view4 = t2Var.X;
                    if (view4 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view5 = t2Var.Y;
                    if (view5 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f567950l54)).setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dro));
                    android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.bx9);
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(num3);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view6 = t2Var.f479400s;
                    if (view6 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view6, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view7 = t2Var.f479401t;
                    if (view7 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(view7, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view8 = t2Var.V;
                    if (view8 != null) {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(num3);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(view8, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view9 = t2Var.f479384J;
                    if (view9 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        arrayList9.add(8);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(view9, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view10 = t2Var.f479407x1;
                    if (view10 != null) {
                        java.util.ArrayList arrayList10 = new java.util.ArrayList();
                        arrayList10.add(8);
                        java.util.Collections.reverse(arrayList10);
                        yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                        yj0.a.f(view10, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchProductPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.EditText editText = t2Var.C;
                    if (editText != null) {
                        editText.setText("");
                    }
                    if (fVar != null) {
                        ((rn2.c1) fVar).y(new rn2.b(null, null, 3, false, false, 0, 0, null, 251, null));
                    }
                    if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("type", 20);
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
                    } else {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("type", 9);
                        i95.m c18 = i95.n0.c(zy2.zb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                        ml2.c1 c1Var = ml2.c1.f408858e;
                        zy2.zb.j5((zy2.zb) c18, 6L, jSONObject2.toString(), null, 4, null);
                    }
                } else if (b17 != 2) {
                    if (b17 == 3) {
                        ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f567950l54)).setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkr));
                        android.view.View view11 = t2Var.D;
                        if (view11 != null) {
                            java.util.ArrayList arrayList11 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                            arrayList11.add(8);
                            java.util.Collections.reverse(arrayList11);
                            yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                            yj0.a.f(view11, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view12 = t2Var.X;
                        if (view12 != null) {
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                            arrayList12.add(8);
                            java.util.Collections.reverse(arrayList12);
                            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                            yj0.a.f(view12, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view13 = t2Var.Y;
                        if (view13 == null) {
                            num2 = num;
                        } else {
                            java.util.ArrayList arrayList13 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                            num2 = num;
                            arrayList13.add(num2);
                            java.util.Collections.reverse(arrayList13);
                            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                            yj0.a.f(view13, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.ViewGroup viewGroup = t2Var.Q;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(8);
                        }
                        android.view.View view14 = t2Var.V;
                        if (view14 != null) {
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                            arrayList14.add(8);
                            java.util.Collections.reverse(arrayList14);
                            yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                            yj0.a.f(view14, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view15 = t2Var.f479384J;
                        if (view15 != null) {
                            java.util.ArrayList arrayList15 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                            arrayList15.add(num2);
                            java.util.Collections.reverse(arrayList15);
                            yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                            yj0.a.f(view15, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view16 = t2Var.f479407x1;
                        if (view16 != null) {
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
                            arrayList16.add(8);
                            java.util.Collections.reverse(arrayList16);
                            yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                            yj0.a.f(view16, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view17 = t2Var.f479400s;
                        if (view17 != null) {
                            java.util.ArrayList arrayList17 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal12 = zj0.c.f554818a;
                            arrayList17.add(8);
                            java.util.Collections.reverse(arrayList17);
                            yj0.a.d(view17, arrayList17.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view17.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                            yj0.a.f(view17, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.bx9);
                        java.util.ArrayList arrayList18 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal13 = zj0.c.f554818a;
                        arrayList18.add(8);
                        java.util.Collections.reverse(arrayList18);
                        yj0.a.d(findViewById2, arrayList18.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (fVar != null) {
                            java.lang.String string = view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mkr);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            rn2.c1 c1Var2 = (rn2.c1) fVar;
                            c1Var2.f479205o = string;
                            c1Var2.g(c1Var2.f479201h, false);
                        }
                        android.widget.EditText editText2 = t2Var.C;
                        if (editText2 != null) {
                            editText2.setText("");
                        }
                        if (fVar != null) {
                            r45.gz1 gz1Var = new r45.gz1();
                            gz1Var.set(0, 3);
                            ((rn2.c1) fVar).f479216z = gz1Var;
                        }
                        android.view.View view18 = t2Var.f479401t;
                        if (view18 != null) {
                            java.util.ArrayList arrayList19 = new java.util.ArrayList();
                            arrayList19.add(num2);
                            java.util.Collections.reverse(arrayList19);
                            yj0.a.d(view18, arrayList19.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view18.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                            yj0.a.f(view18, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGameTeamUpPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view19 = t2Var.f479401t;
                        if (view19 != null) {
                            view19.setEnabled(false);
                        }
                        if (fVar != null) {
                            ((rn2.c1) fVar).y(new rn2.b(null, null, 5, false, false, 0, 0, null, 251, null));
                        }
                    }
                    editable = null;
                } else {
                    java.lang.Integer num4 = num;
                    if (fVar != null) {
                        rn2.c1 c1Var3 = (rn2.c1) fVar;
                        if (c1Var3.B == null) {
                            p3325xe03a0797.p3326xc267989b.r2 r2Var = c1Var3.C;
                            if (!(r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a())) {
                                c1Var3.C = p3325xe03a0797.p3326xc267989b.l.d(c1Var3.D, null, null, new rn2.b1(c1Var3, null), 3, null);
                            }
                        }
                    }
                    ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f567950l54)).setText(view2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573174lj2));
                    android.view.View view20 = t2Var.D;
                    if (view20 != null) {
                        java.util.ArrayList arrayList20 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal14 = zj0.c.f554818a;
                        arrayList20.add(8);
                        java.util.Collections.reverse(arrayList20);
                        yj0.a.d(view20, arrayList20.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view20.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                        yj0.a.f(view20, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view21 = t2Var.Y;
                    if (view21 != null) {
                        java.util.ArrayList arrayList21 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal15 = zj0.c.f554818a;
                        arrayList21.add(8);
                        java.util.Collections.reverse(arrayList21);
                        yj0.a.d(view21, arrayList21.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view21.setVisibility(((java.lang.Integer) arrayList21.get(0)).intValue());
                        yj0.a.f(view21, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view22 = t2Var.X;
                    if (view22 != null) {
                        java.util.ArrayList arrayList22 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal16 = zj0.c.f554818a;
                        arrayList22.add(num4);
                        java.util.Collections.reverse(arrayList22);
                        yj0.a.d(view22, arrayList22.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view22.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
                        yj0.a.f(view22, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.ViewGroup viewGroup2 = t2Var.Q;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(8);
                    }
                    android.view.View view23 = t2Var.V;
                    if (view23 != null) {
                        java.util.ArrayList arrayList23 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal17 = zj0.c.f554818a;
                        arrayList23.add(8);
                        java.util.Collections.reverse(arrayList23);
                        yj0.a.d(view23, arrayList23.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view23.setVisibility(((java.lang.Integer) arrayList23.get(0)).intValue());
                        yj0.a.f(view23, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view24 = t2Var.f479384J;
                    if (view24 != null) {
                        java.util.ArrayList arrayList24 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal18 = zj0.c.f554818a;
                        arrayList24.add(num4);
                        java.util.Collections.reverse(arrayList24);
                        yj0.a.d(view24, arrayList24.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view24.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
                        yj0.a.f(view24, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view25 = t2Var.f479407x1;
                    if (view25 != null) {
                        java.util.ArrayList arrayList25 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal19 = zj0.c.f554818a;
                        arrayList25.add(num4);
                        java.util.Collections.reverse(arrayList25);
                        yj0.a.d(view25, arrayList25.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view25.setVisibility(((java.lang.Integer) arrayList25.get(0)).intValue());
                        yj0.a.f(view25, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view26 = t2Var.f479400s;
                    if (view26 != null) {
                        java.util.ArrayList arrayList26 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal20 = zj0.c.f554818a;
                        arrayList26.add(num4);
                        java.util.Collections.reverse(arrayList26);
                        yj0.a.d(view26, arrayList26.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view26.setVisibility(((java.lang.Integer) arrayList26.get(0)).intValue());
                        yj0.a.f(view26, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.bx9);
                    java.util.ArrayList arrayList27 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal21 = zj0.c.f554818a;
                    arrayList27.add(8);
                    java.util.Collections.reverse(arrayList27);
                    yj0.a.d(findViewById3, arrayList27.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList27.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.widget.EditText editText3 = t2Var.C;
                    if (editText3 != null) {
                        editText3.setText("");
                    }
                    if (fVar != null) {
                        editable = null;
                        ((rn2.c1) fVar).C(null, null);
                    } else {
                        editable = null;
                    }
                    ?? r27 = t2Var.W;
                    if (r27 != 0) {
                        r27.b(fVar != null ? ((rn2.c1) fVar).A : editable, fVar != null ? ((rn2.c1) fVar).m() : editable);
                    }
                    android.view.View view27 = t2Var.f479401t;
                    if (view27 != null) {
                        java.util.ArrayList arrayList28 = new java.util.ArrayList();
                        arrayList28.add(num4);
                        java.util.Collections.reverse(arrayList28);
                        yj0.a.d(view27, arrayList28.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view27.setVisibility(((java.lang.Integer) arrayList28.get(0)).intValue());
                        yj0.a.f(view27, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "switchGiftPrize", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view28 = t2Var.f479401t;
                    if (view28 != null) {
                        view28.setEnabled(false);
                    }
                    if (fVar != null) {
                        ((rn2.c1) fVar).y(new rn2.b(null, null, 0, false, false, 0, 0, null, 251, null));
                    }
                }
            } else {
                editable = null;
                t2Var.t();
            }
            int c19 = fVar != null ? ((rn2.c1) fVar).f479215y.c() : 3;
            android.widget.EditText editText4 = t2Var.A;
            android.text.Editable text = editText4 != null ? editText4.getText() : editable;
            if (text == null || text.length() == 0) {
                android.widget.EditText editText5 = t2Var.A;
                if (editText5 == null) {
                    return;
                }
                editText5.setHint(java.lang.String.valueOf(c19));
                return;
            }
            android.widget.EditText editText6 = t2Var.A;
            if (editText6 != null) {
                editText6.setText(java.lang.String.valueOf(c19));
            }
        }
    }

    public void C(java.lang.Integer num, java.util.List list) {
        r45.gz1 gz1Var;
        r45.vd4 vd4Var;
        if (num == null) {
            gz1Var = this.A;
        } else {
            r45.gz1 gz1Var2 = this.f479215y.f479234c;
            r45.vd4 vd4Var2 = (r45.vd4) gz1Var2.m75936x14adae67(2);
            if (vd4Var2 != null) {
                vd4Var2.set(0, java.lang.Integer.valueOf(num.intValue()));
            }
            if (list != null && (vd4Var = (r45.vd4) gz1Var2.m75936x14adae67(2)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    rn2.y2 y2Var = (rn2.y2) it.next();
                    r45.wd4 wd4Var = new r45.wd4();
                    wd4Var.set(0, y2Var.f479461c);
                    wd4Var.set(1, y2Var.f479462d);
                    arrayList.add(wd4Var);
                }
                vd4Var.set(1, new java.util.LinkedList(arrayList));
            }
            gz1Var = gz1Var2;
        }
        this.f479216z = gz1Var;
        this.A = gz1Var;
    }

    public final void c() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f479197d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo78491xd9193382(0, ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dxs), new rn2.o0(this));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r1 == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r6.f479203m.length() > 0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r6 = this;
            boolean r0 = r6.f479208r
            boolean r1 = r6.f479209s
            r0 = r0 & r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isValidClaimPrize lastLotteryClaimPrizeType:"
            r1.<init>(r2)
            rn2.e r2 = r6.f479215y
            int r3 = r2.f479245n
            r1.append(r3)
            java.lang.String r3 = ",customClaimPrizeContent:"
            r1.append(r3)
            java.lang.String r3 = r6.f479206p
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = r6.f479198e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            int r1 = r2.f479245n
            r2 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L3d
            java.lang.String r1 = r6.f479206p
            int r1 = r1.length()
            if (r1 <= 0) goto L37
            r1 = r5
            goto L38
        L37:
            r1 = r4
        L38:
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            r1 = r4
            goto L3e
        L3d:
            r1 = r5
        L3e:
            r0 = r0 & r1
            int r1 = r6.f479201h
            switch(r1) {
                case 1: goto L77;
                case 2: goto L77;
                case 3: goto L5c;
                case 4: goto L77;
                case 5: goto L77;
                case 6: goto L45;
                default: goto L44;
            }
        L44:
            goto L78
        L45:
            r45.h32 r1 = r6.f479207q
            if (r1 == 0) goto L78
            r2 = 4
            java.lang.String r1 = r1.m75945x2fec8307(r2)
            if (r1 == 0) goto L78
            int r1 = r1.length()
            if (r1 <= 0) goto L58
            r1 = r5
            goto L59
        L58:
            r1 = r4
        L59:
            if (r1 != r5) goto L78
            goto L77
        L5c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "isValidWording wording:"
            r1.<init>(r2)
            java.lang.String r2 = r6.f479203m
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.lang.String r1 = r6.f479203m
            int r1 = r1.length()
            if (r1 <= 0) goto L78
        L77:
            r4 = r5
        L78:
            r0 = r0 & r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "checkLotteryState type:"
            r1.<init>(r2)
            int r2 = r6.f479201h
            r1.append(r2)
            java.lang.String r2 = ",canConfirm:"
            r1.append(r2)
            r1.append(r0)
            r2 = 33
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.c1.f():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.c1.g(int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(r45.dz1 dz1Var, int i17) {
        java.lang.String str;
        ek2.t0 t0Var;
        long j17;
        java.lang.String str2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f479197d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
        gk2.e eVar = gk2.e.f354004n;
        if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).T) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).qj(2);
        } else if (this.f479201h == 1) {
            if (this.f479203m.length() > 0) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409130m, this.f479203m);
            }
        }
        if (dz1Var == null) {
            rn2.e eVar2 = this.f479215y;
            int c17 = eVar2.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f479198e, "getCreateParamsFromMethodItem, default duration = " + c17);
            long j18 = this.f479210t;
            long j19 = this.f479212v;
            java.lang.String str3 = this.f479211u;
            int i18 = c17 * 60;
            java.lang.String str4 = this.f479205o;
            int i19 = this.f479201h;
            java.lang.String str5 = this.f479203m;
            int i27 = ek2.s0.f335063v;
            int i28 = this.f479204n;
            long d17 = eVar2.d();
            gk2.e eVar3 = gk2.e.f354004n;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(eVar3 != null ? ((mm2.e1) eVar3.a(mm2.e1.class)).f410518o : null);
            r45.yy1 yy1Var = new r45.yy1();
            yy1Var.set(0, java.lang.Integer.valueOf(eVar2.f479245n));
            yy1Var.set(1, this.f479206p);
            r45.gz1 gz1Var = this.f479216z;
            r45.h32 h32Var = this.f479207q;
            if (h32Var != null) {
                j17 = j19;
                str2 = h32Var.m75945x2fec8307(4);
            } else {
                j17 = j19;
                str2 = null;
            }
            t0Var = new ek2.t0(j18, j17, str3, i18, str4, i19, str5, 0, i28, d17, b17, yy1Var, i17, gz1Var, str2);
        } else {
            long j27 = this.f479210t;
            long j28 = this.f479212v;
            java.lang.String str6 = this.f479211u;
            int m75939xb282bd08 = dz1Var.m75939xb282bd08(1);
            java.lang.String valueOf = java.lang.String.valueOf(dz1Var.m75945x2fec8307(2));
            r45.xy1 xy1Var = (r45.xy1) dz1Var.m75936x14adae67(3);
            int m75939xb282bd082 = xy1Var != null ? xy1Var.m75939xb282bd08(0) : 0;
            int i29 = ek2.s0.f335063v;
            r45.xy1 xy1Var2 = (r45.xy1) dz1Var.m75936x14adae67(3);
            if (xy1Var2 == null || (str = xy1Var2.m75945x2fec8307(1)) == null) {
                str = "";
            }
            java.lang.String str7 = str;
            int m75939xb282bd083 = dz1Var.m75939xb282bd08(4);
            long m75942xfb822ef2 = dz1Var.m75942xfb822ef2(5);
            gk2.e eVar4 = gk2.e.f354004n;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g b18 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(eVar4 != null ? ((mm2.e1) eVar4.a(mm2.e1.class)).f410518o : null);
            r45.yy1 yy1Var2 = (r45.yy1) dz1Var.m75936x14adae67(6);
            r45.gz1 gz1Var2 = (r45.gz1) dz1Var.m75936x14adae67(9);
            r45.xy1 xy1Var3 = (r45.xy1) dz1Var.m75936x14adae67(3);
            t0Var = new ek2.t0(j27, j28, str6, m75939xb282bd08, valueOf, m75939xb282bd082, str7, 0, m75939xb282bd083, m75942xfb822ef2, b18, yy1Var2, i17, gz1Var2, xy1Var3 != null ? xy1Var3.m75945x2fec8307(3) : null);
        }
        pq5.g l17 = new ek2.s0(t0Var).l();
        l17.K(new rn2.v0(f17, t0Var, this));
        if (activityC0065xcd7aa112 instanceof im5.b) {
            l17.f((im5.b) activityC0065xcd7aa112);
        }
    }

    public final java.lang.Object i(boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        v65.n nVar = new v65.n(rVar);
        r45.pa1 pa1Var = new r45.pa1();
        pa1Var.set(1, db2.t4.f309704a.a(8970));
        pa1Var.set(3, java.lang.Boolean.TRUE);
        az2.j jVar = (az2.j) pa1Var.d();
        if (z17) {
            az2.j.u(jVar, this.f479197d, null, 0L, 6, null);
        }
        km5.d T = pm0.v.T(jVar.l(), new rn2.w0(nVar));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f479197d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC0065xcd7aa112 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            T.f(abstractActivityC21394xb3d2c0cf);
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public java.util.LinkedList m() {
        r45.gz1 gz1Var;
        r45.vd4 vd4Var;
        java.util.LinkedList<r45.wd4> m75941xfb821914;
        java.lang.Object obj;
        r45.vd4 vd4Var2;
        r45.vd4 vd4Var3;
        if (this.B == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.qa1 qa1Var = this.B;
        if (qa1Var != null) {
            linkedList.clear();
            java.util.LinkedList<r45.kv1> m75941xfb8219142 = qa1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getProduct_meta_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
            for (r45.kv1 kv1Var : m75941xfb8219142) {
                int m75942xfb822ef2 = (int) qa1Var.m75942xfb822ef2(6);
                r45.n30 n30Var = new r45.n30();
                n30Var.set(0, kv1Var.m75945x2fec8307(0));
                arrayList.add(new rn2.y2(false, m75942xfb822ef2, n30Var, kv1Var));
            }
            linkedList.addAll(arrayList);
            r45.gz1 gz1Var2 = this.f479216z;
            java.lang.Integer valueOf = (gz1Var2 == null || (vd4Var3 = (r45.vd4) gz1Var2.m75936x14adae67(2)) == null) ? null : java.lang.Integer.valueOf(vd4Var3.m75939xb282bd08(0));
            r45.gz1 gz1Var3 = this.A;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, (gz1Var3 == null || (vd4Var2 = (r45.vd4) gz1Var3.m75936x14adae67(2)) == null) ? null : java.lang.Integer.valueOf(vd4Var2.m75939xb282bd08(0))) && (gz1Var = this.A) != null && (vd4Var = (r45.vd4) gz1Var.m75936x14adae67(2)) != null && (m75941xfb821914 = vd4Var.m75941xfb821914(1)) != null) {
                for (r45.wd4 wd4Var : m75941xfb821914) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        java.lang.String m75945x2fec8307 = ((rn2.y2) obj).f479462d.m75945x2fec8307(0);
                        r45.n30 n30Var2 = (r45.n30) wd4Var.m75936x14adae67(0);
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, n30Var2 != null ? n30Var2.m75945x2fec8307(0) : null)) {
                            break;
                        }
                    }
                    rn2.y2 y2Var = (rn2.y2) obj;
                    if (y2Var != null) {
                        y2Var.f479459a = true;
                    }
                    r45.n30 n30Var3 = y2Var != null ? y2Var.f479461c : null;
                    if (n30Var3 != null) {
                        r45.n30 n30Var4 = (r45.n30) wd4Var.m75936x14adae67(0);
                        n30Var3.set(1, java.lang.Integer.valueOf(n30Var4 != null ? n30Var4.m75939xb282bd08(1) : 0));
                    }
                }
            }
        }
        return linkedList;
    }

    @Override // fs2.a
    /* renamed from: onAttach */
    public void mo56536x3b13c504(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str;
        android.widget.CheckBox checkBox;
        rn2.g callback = (rn2.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f479200g = callback;
        rn2.e eVar = this.f479215y;
        java.util.Iterator it = ((java.util.ArrayList) ((jz5.n) eVar.f479243l).mo141623x754a37bb()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((rn2.b) obj2).f479179c == eVar.f479245n) {
                    break;
                }
            }
        }
        rn2.b bVar = (rn2.b) obj2;
        if (bVar == null || (str = bVar.f479177a) == null) {
            str = "";
        }
        rn2.t2 t2Var = (rn2.t2) callback;
        android.view.View view = t2Var.f479385d;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ogm);
        t2Var.f479388g = textView;
        rn2.f fVar = t2Var.f479387f;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t2Var.f479386e;
        if (textView != null) {
            java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dq7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = fVar != null ? java.lang.Integer.valueOf(((rn2.c1) fVar).p()) : null;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView.setText(format);
        }
        t2Var.f479395p = view.findViewById(com.p314xaae8f345.mm.R.id.f565274bx2);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.irj);
        t2Var.f479398q = findViewById;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = findViewById != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById.findViewById(com.p314xaae8f345.mm.R.id.ly7) : null;
        t2Var.f479399r = viewOnClickListenerC22631x1cc07cc8;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new rn2.u1(t2Var));
        }
        t2Var.f479400s = view.findViewById(com.p314xaae8f345.mm.R.id.f565277bx5);
        t2Var.f479401t = view.findViewById(com.p314xaae8f345.mm.R.id.f565273bx1);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bx7);
        t2Var.f479402u = textView2;
        if (textView2 != null) {
            textView2.setText(str);
        }
        android.view.View view2 = t2Var.f479401t;
        if (view2 != null) {
            view2.setOnClickListener(new rn2.v1(t2Var));
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.cog);
        t2Var.f479403v = findViewById2;
        android.widget.EditText editText = findViewById2 != null ? (android.widget.EditText) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.coh) : null;
        t2Var.f479404w = editText;
        zl2.r4 r4Var = zl2.r4.f555483a;
        r4Var.Z2(editText, null, 20, 10, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new rn2.w1(t2Var));
        t2Var.f479405x = view.findViewById(com.p314xaae8f345.mm.R.id.a6d);
        t2Var.f479408y = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a6g);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.c6r);
        t2Var.f479389h = findViewById3;
        android.widget.EditText editText2 = findViewById3 != null ? (android.widget.EditText) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.c88) : null;
        t2Var.f479394o = editText2;
        r4Var.Z2(editText2, null, 20, 10, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new rn2.x1(t2Var));
        t2Var.f479411z = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f565670d53);
        android.widget.EditText editText3 = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.d57);
        t2Var.A = editText3;
        r4Var.Z2(editText3, null, 8, 4, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new rn2.y1(t2Var));
        t2Var.B = (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.pmw);
        android.widget.EditText editText4 = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.f569270pn0);
        t2Var.C = editText4;
        r4Var.Z2(editText4, null, 8, 4, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new rn2.z1(t2Var));
        t2Var.D = view.findViewById(com.p314xaae8f345.mm.R.id.q_4);
        t2Var.E = view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        android.widget.EditText editText5 = (android.widget.EditText) view.findViewById(com.p314xaae8f345.mm.R.id.cuw);
        t2Var.F = editText5;
        r4Var.Z2(editText5, null, 20, 10, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new rn2.a2(t2Var));
        t2Var.H = view.findViewById(com.p314xaae8f345.mm.R.id.c_1);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        t2Var.G = textView3;
        if (this.f479214x == 1 && textView3 != null) {
            textView3.setText(abstractActivityC21394xb3d2c0cf.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dr_));
        }
        android.widget.TextView textView4 = t2Var.G;
        com.p314xaae8f345.mm.ui.bk.r0(textView4 != null ? textView4.getPaint() : null, 0.8f);
        rn2.g.m(t2Var, false, 0, 2, null);
        view.findViewById(com.p314xaae8f345.mm.R.id.irp).setOnClickListener(new rn2.b2(t2Var));
        t2Var.I = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.iro);
        android.widget.TextView textView5 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.irq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView5);
        java.lang.String string2 = textView5.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String string3 = textView5.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dqu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String format2 = java.lang.String.format(string3, java.util.Arrays.copyOf(new java.lang.Object[]{string2}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        int L = r26.n0.L(format2, string2, 0, false, 6, null);
        int length = string2.length() + L;
        android.text.SpannableString spannableString = new android.text.SpannableString(format2);
        spannableString.setSpan(new rn2.l3(new java.lang.ref.WeakReference(abstractActivityC21394xb3d2c0cf)), L, length, 33);
        textView5.setHighlightColor(textView5.getContext().getResources().getColor(android.R.color.transparent));
        textView5.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView5.setText(spannableString);
        android.widget.CheckBox checkBox2 = t2Var.I;
        if (checkBox2 != null) {
            checkBox2.setOnCheckedChangeListener(new rn2.k1(t2Var));
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LOTTERY_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue() && (checkBox = t2Var.I) != null) {
            checkBox.setChecked(true);
        }
        t2Var.V = view.findViewById(com.p314xaae8f345.mm.R.id.q_x);
        t2Var.f479384J = view.findViewById(com.p314xaae8f345.mm.R.id.l5y);
        android.view.View view3 = t2Var.f479405x;
        if (view3 != null) {
            view3.setOnClickListener(new rn2.l1(t2Var));
        }
        android.widget.RelativeLayout relativeLayout = t2Var.f479411z;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new rn2.m1(t2Var));
        }
        android.widget.RelativeLayout relativeLayout2 = t2Var.B;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new rn2.n1(t2Var));
        }
        android.view.View view4 = t2Var.E;
        if (view4 != null) {
            view4.setOnClickListener(new rn2.o1(t2Var));
        }
        android.view.View view5 = t2Var.f479389h;
        if (view5 != null) {
            view5.setOnClickListener(new rn2.p1(t2Var));
        }
        android.view.View view6 = (android.view.View) ((jz5.n) t2Var.f479390i).mo141623x754a37bb();
        if (view6 != null) {
            view6.setOnClickListener(new rn2.q1(t2Var));
        }
        android.widget.TextView textView6 = t2Var.G;
        if (textView6 != null) {
            textView6.setOnClickListener(new rn2.s1(t2Var));
        }
        android.view.View view7 = t2Var.V;
        if (view7 != null) {
            view7.setOnClickListener(new rn2.t1(t2Var));
        }
        if (fVar != null) {
            rn2.c1 c1Var = (rn2.c1) fVar;
            rn2.b a17 = c1Var.f479215y.a();
            if (a17 != null) {
                t2Var.q(a17);
            }
            android.widget.EditText editText6 = t2Var.A;
            rn2.e eVar2 = c1Var.f479215y;
            if (editText6 != null) {
                editText6.setHint(java.lang.String.valueOf(eVar2.c()));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = t2Var.f479399r;
            if (viewOnClickListenerC22631x1cc07cc82 != null) {
                viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(eVar2.f479248q);
            }
        }
        android.view.View view8 = t2Var.f479400s;
        if (view8 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view8, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethod", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethod", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        t2Var.j(str);
        rn2.w wVar = t2Var.W;
        if (wVar == null) {
            wVar = new rn2.w(t2Var);
        }
        t2Var.W = wVar;
        t2Var.X = view.findViewById(com.p314xaae8f345.mm.R.id.q_5);
        t2Var.Y = view.findViewById(com.p314xaae8f345.mm.R.id.f567960s10);
        android.view.View view9 = t2Var.X;
        android.view.View findViewById4 = view9 != null ? view9.findViewById(com.p314xaae8f345.mm.R.id.q6m) : null;
        t2Var.Z = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new rn2.g1(t2Var));
        }
        android.view.View view10 = t2Var.X;
        t2Var.f479396p0 = view10 != null ? (android.widget.TextView) view10.findViewById(com.p314xaae8f345.mm.R.id.q6o) : null;
        android.view.View view11 = t2Var.X;
        android.view.View findViewById5 = view11 != null ? view11.findViewById(com.p314xaae8f345.mm.R.id.f566699q74) : null;
        t2Var.f479406x0 = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new rn2.h1(t2Var));
        }
        android.view.View view12 = t2Var.X;
        t2Var.f479409y0 = view12 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view12.findViewById(com.p314xaae8f345.mm.R.id.q77) : null;
        android.view.View view13 = t2Var.X;
        t2Var.f479391l1 = view13 != null ? view13.findViewById(com.p314xaae8f345.mm.R.id.q78) : null;
        android.view.View view14 = t2Var.X;
        t2Var.f479397p1 = view14 != null ? (android.widget.TextView) view14.findViewById(com.p314xaae8f345.mm.R.id.ohp) : null;
        t2Var.f479407x1 = view.findViewById(com.p314xaae8f345.mm.R.id.q5k);
        t2Var.f479410y1 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.qas);
        t2Var.f479412z1 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.q76);
        t2Var.A1 = view.findViewById(com.p314xaae8f345.mm.R.id.q4g);
        g(this.f479201h, false);
    }

    @Override // fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        jz5.f0 f0Var;
        int i17;
        r45.nw1 nw1Var;
        rn2.g gVar = this.f479200g;
        if (gVar != null) {
            ((rn2.t2) gVar).m162763x5cd39ffa();
        }
        this.f479200g = null;
        rn2.e eVar = this.f479215y;
        eVar.getClass();
        gk2.e eVar2 = gk2.e.f354004n;
        dk2.xf k17 = eVar2 != null ? dk2.ef.f314905a.k(eVar2) : null;
        gk2.e eVar3 = gk2.e.f354004n;
        r45.a94 a94Var = eVar3 != null ? ((on2.z2) eVar3.a(on2.z2.class)).f428630r : null;
        gk2.e eVar4 = gk2.e.f354004n;
        java.lang.Long valueOf = (eVar4 == null || (nw1Var = ((mm2.e1) eVar4.a(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
        gk2.e eVar5 = gk2.e.f354004n;
        java.lang.Long valueOf2 = eVar5 != null ? java.lang.Long.valueOf(((mm2.e1) eVar5.a(mm2.e1.class)).f410516m) : null;
        gk2.e eVar6 = gk2.e.f354004n;
        java.lang.Integer valueOf3 = eVar6 != null ? java.lang.Integer.valueOf((int) ((mm2.c1) eVar6.a(mm2.c1.class)).f410399q) : null;
        if (k17 == null || a94Var == null || valueOf == null || valueOf2 == null || valueOf3 == null) {
            f0Var = null;
        } else {
            valueOf3.intValue();
            long longValue = valueOf2.longValue();
            long longValue2 = valueOf.longValue();
            a94Var.f451391e = eVar.f479244m;
            if (eVar.f479248q) {
                int i18 = (int) a94Var.f451390d;
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                i17 = i18 | 1;
            } else {
                int i19 = (int) a94Var.f451390d;
                java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                i17 = i19 & (-2);
            }
            a94Var.f451390d = i17;
            rn2.d dVar = new rn2.d(a94Var);
            dk2.r4 r4Var = (dk2.r4) k17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "setMicSetting liveId:" + longValue2 + " objectId:" + longValue + " lotterySetting:" + a94Var.f451390d + ", " + a94Var.f451391e);
            pq5.g l17 = new ke2.g(longValue2, longValue, ((mm2.c1) r4Var.m(mm2.c1.class)).f410399q, xy2.c.f(r4Var.f315541c), 0, null, null, a94Var, null, 0L, dVar, null, 2416, null).l();
            java.lang.Object M = r4Var.M();
            if (M != null && (M instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                l17.f((im5.b) M);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryCreateConfig", "setLiveLotterySetting error!");
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.D, null, 1, null);
    }

    public int p() {
        java.lang.Object obj;
        rn2.e eVar = this.f479215y;
        java.util.Iterator it = eVar.f479236e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((rn2.b) obj).f479179c == eVar.b()) {
                break;
            }
        }
        rn2.b bVar = (rn2.b) obj;
        int i17 = bVar != null ? bVar.f479182f : 0;
        return i17 > 0 ? i17 / 60 : rn2.e.f479229s;
    }

    public r45.dz1 q() {
        rn2.e eVar = this.f479215y;
        int c17 = eVar.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f479198e, "getMethodItem, duration = " + c17);
        r45.dz1 dz1Var = new r45.dz1();
        dz1Var.set(1, java.lang.Integer.valueOf(c17 * 60));
        dz1Var.set(2, this.f479205o);
        r45.xy1 xy1Var = new r45.xy1();
        xy1Var.set(0, java.lang.Integer.valueOf(this.f479201h));
        xy1Var.set(1, this.f479203m);
        xy1Var.set(2, this.f479202i);
        r45.h32 h32Var = this.f479207q;
        xy1Var.set(3, h32Var != null ? h32Var.m75945x2fec8307(4) : null);
        dz1Var.set(3, xy1Var);
        dz1Var.set(4, java.lang.Integer.valueOf(this.f479204n));
        dz1Var.set(5, java.lang.Long.valueOf(eVar.d()));
        r45.yy1 yy1Var = new r45.yy1();
        yy1Var.set(0, java.lang.Integer.valueOf(eVar.f479245n));
        yy1Var.set(1, this.f479206p);
        dz1Var.set(6, yy1Var);
        dz1Var.set(9, this.f479216z);
        return dz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r17) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.c1.s(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v() {
        r45.dz1 q17 = q();
        r45.gz1 gz1Var = (r45.gz1) q17.m75936x14adae67(9);
        boolean z17 = gz1Var != null && gz1Var.m75939xb282bd08(0) == 2;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f479197d;
        if (z17) {
            rn2.g gVar = this.f479200g;
            if (gVar != null) {
                ((rn2.t2) gVar).m162763x5cd39ffa();
            }
            activityC0065xcd7aa112.setResult(-1, activityC0065xcd7aa112.getIntent());
            activityC0065xcd7aa112.finish();
            return;
        }
        r45.w02 w02Var = new r45.w02();
        w02Var.set(2, this.f479213w);
        w02Var.set(3, 0);
        w02Var.set(4, q17);
        az2.j jVar = (az2.j) w02Var.d();
        az2.j.u(jVar, this.f479197d, null, 0L, 6, null);
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                l17.f((im5.b) activityC0065xcd7aa112);
            }
            l17.K(new rn2.a1(this));
        }
    }

    public void y(rn2.b type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f479215y.f(type.f479179c);
        g(this.f479201h, false);
    }

    public void z(int i17) {
        java.lang.Object obj;
        rn2.e eVar = this.f479215y;
        if (i17 > 0) {
            java.util.Iterator it = eVar.f479236e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((rn2.b) obj).f479179c == eVar.b()) {
                        break;
                    }
                }
            }
            rn2.b bVar = (rn2.b) obj;
            if (bVar != null) {
                bVar.f479183g = i17 * 60;
            }
        } else {
            eVar.getClass();
        }
        g(this.f479201h, false);
    }
}
