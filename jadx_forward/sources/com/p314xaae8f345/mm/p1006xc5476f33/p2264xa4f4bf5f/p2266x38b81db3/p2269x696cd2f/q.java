package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f254875f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f254876g;

    /* renamed from: h, reason: collision with root package name */
    public final float f254877h;

    /* renamed from: i, reason: collision with root package name */
    public final float f254878i;

    /* renamed from: m, reason: collision with root package name */
    public final int f254879m;

    /* renamed from: n, reason: collision with root package name */
    public final int f254880n;

    /* renamed from: o, reason: collision with root package name */
    public final float f254881o;

    /* renamed from: p, reason: collision with root package name */
    public final float f254882p;

    /* renamed from: q, reason: collision with root package name */
    public final mj4.h f254883q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f254884r;

    /* renamed from: s, reason: collision with root package name */
    public final int f254885s;

    /* renamed from: t, reason: collision with root package name */
    public final float f254886t;

    /* renamed from: u, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f254887u;

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f254888v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f254889w;

    public q(int i17, android.content.Context activity) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f254875f = new java.util.HashMap();
        this.f254876g = new java.util.HashMap();
        this.f254877h = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f254878i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561253dd);
        int i19 = 0;
        if (valueOf != null) {
            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf.intValue());
        } else {
            i18 = 0;
        }
        this.f254879m = i18;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        if (valueOf2 != null) {
            i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(valueOf2.intValue());
        }
        this.f254880n = i19;
        this.f254881o = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f254882p = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
        this.f254883q = ai4.m0.f86706a.M(en1.a.a());
        this.f254884r = new java.util.HashMap();
        this.f254885s = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f278668a;
        this.f254886t = 1.3f;
        this.f254888v = activity;
    }

    public static final void o(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.q qVar, ym3.p pVar, in5.s0 s0Var, nj4.e eVar, android.view.View view) {
        ai4.e eVar2;
        java.lang.String a17;
        java.lang.String string;
        ai4.e eVar3;
        qVar.getClass();
        if (pVar == ym3.p.f544714f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.SquareItemConvert", "handleListLoadStateChanged: UIRefresh size=" + eVar.f419469d.f86668b.size() + ", itemHash=" + eVar.mo148315x8cdac1b() + ", holderHash=" + s0Var.hashCode());
            boolean z17 = qVar.f254889w;
            ai4.e eVar4 = eVar.f419469d;
            if (z17) {
                eVar2 = eVar4;
            } else {
                int i17 = (int) (((((qVar.f254885s - qVar.f254879m) - qVar.f254880n) - qVar.f254881o) / 2) * qVar.f254886t);
                int size = eVar4.f86668b.size();
                float f17 = qVar.f254882p;
                if (size <= 2) {
                    view.getLayoutParams().height = ((int) f17) + i17;
                }
                if (3 <= size && size < 5) {
                    eVar3 = eVar4;
                    int ceil = (int) java.lang.Math.ceil(size / 2);
                    view.getLayoutParams().height = (i17 * ceil) + (ceil * ((int) f17));
                } else {
                    eVar3 = eVar4;
                }
                if (size > 4) {
                    android.content.Context context = s0Var.f374654e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    java.util.HashMap hashMap = (java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg.class)).f255640d;
                    eVar2 = eVar3;
                    java.lang.String str = eVar2.f86667a;
                    if ((hashMap.containsKey(str) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hashMap.get(str), java.lang.Boolean.TRUE)) || !hashMap.containsKey(str)) {
                        android.content.Context context2 = view.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18645xc7db3eec c18645xc7db3eec = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18645xc7db3eec(context2, null, 0, 6, null);
                        c18645xc7db3eec.measure(0, 0);
                        view.getLayoutParams().height = (i17 * 2) + (((int) f17) * 2) + c18645xc7db3eec.getMeasuredHeight();
                    } else {
                        int ceil2 = (int) java.lang.Math.ceil(size / 2);
                        view.getLayoutParams().height = (i17 * ceil2) + (ceil2 * ((int) f17));
                    }
                } else {
                    eVar2 = eVar3;
                }
            }
            android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.d0v);
            imageView.setVisibility(0);
            if (bk4.i.a().K()) {
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) qVar.f254877h);
                imageView.setLayoutParams(layoutParams2);
            }
            android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.f567190ii3);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/topic/SquareItemConvert", "initStatusTitle", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/textstatus/convert/topic/SquareItemConvert", "initStatusTitle", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/textstatus/model/topic/SameTopicFriendsItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.om7);
            android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.hnv);
            boolean K = bk4.i.a().K();
            android.content.Context context3 = qVar.f254888v;
            if (K) {
                imageView2.setVisibility(8);
                textView.setTextColor(context3.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560753t8));
                android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = (int) qVar.f254878i;
                textView.setLayoutParams(layoutParams4);
                textView.setTextSize(0, context3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3));
            } else {
                com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
                imageView2.setVisibility(0);
                if (bk4.i.a().y()) {
                    java.lang.String c17 = ((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).c();
                    mj4.h hVar = qVar.f254883q;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, hVar != null ? ((mj4.k) hVar).c() : null)) {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        java.util.Iterator it = eVar2.f86668b.iterator();
                        while (it.hasNext()) {
                            java.lang.String h17 = ((mj4.k) ((mj4.h) it.next())).h();
                            if (hashMap2.containsKey(h17)) {
                                java.lang.Integer num = (java.lang.Integer) hashMap2.get(h17);
                                hashMap2.put(h17, java.lang.Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                            } else {
                                hashMap2.put(h17, 1);
                            }
                        }
                        java.util.HashSet hashSet = new java.util.HashSet();
                        int i18 = 0;
                        for (java.util.Map.Entry entry : hashMap2.entrySet()) {
                            if (((java.lang.Number) entry.getValue()).intValue() >= i18) {
                                i18 = ((java.lang.Number) entry.getValue()).intValue();
                                hashSet.add(entry.getKey());
                            }
                        }
                        if (hashSet.size() != 1) {
                            java.util.Iterator it6 = eVar2.f86668b.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    a17 = mj4.d.a((mj4.h) eVar2.f86668b.get(0));
                                    break;
                                }
                                mj4.k kVar = (mj4.k) ((mj4.h) it6.next());
                                if (hashSet.contains(kVar.h())) {
                                    a17 = kVar.h();
                                    break;
                                }
                            }
                        } else {
                            java.util.Iterator it7 = hashSet.iterator();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it7, "iterator(...)");
                            a17 = it7.hasNext() ? (java.lang.String) it7.next() : mj4.d.a((mj4.h) eVar2.f86668b.get(0));
                        }
                    } else {
                        a17 = ((mj4.k) hVar).h();
                    }
                    if (a17 == null) {
                        a17 = mj4.d.a((mj4.h) eVar2.f86668b.get(0));
                    }
                } else {
                    a17 = mj4.d.a((mj4.h) eVar2.f86668b.get(0));
                }
                bk4.f.V(bk4.i.a(), imageView2, a17, bi4.d.OUTLINED, bi4.b.FG_0, (mj4.h) eVar2.f86668b.get(0), false, true, 32, null);
            }
            int size2 = eVar2.f86668b.size();
            if (size2 > 0) {
                pj4.o0 a18 = xe0.j0.a((xe0.j0) eVar2.f86668b.get(0), false, 1, null);
                mj4.h M = ai4.m0.f86706a.M(en1.a.a());
                int i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(M != null ? ((mj4.k) M).o() : null, ((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).o()) ? size2 == 1 ? 4 : 3 : 2;
                if (bk4.i.a().K()) {
                    long f18 = c01.id.f(((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).f408600b.f76512x81959a6e) / 3600;
                    string = f18 < 1 ? context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jx8) : context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jx6, java.lang.Long.valueOf(f18));
                } else {
                    string = bk4.i.a().G() ? context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvq, java.lang.Integer.valueOf(eVar2.f86668b.size())) : bk4.i.a().c(a18, size2, bk4.i.a().m(a18), i19);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.SquareItemConvert", "initStatusTitle: " + string + ", type=" + i19 + ", firstUser=" + ((mj4.k) ((mj4.h) eVar2.f86668b.get(0))).o() + ", itemSize=" + eVar2.f86668b.size() + ", itemHash=" + eVar.mo148315x8cdac1b());
                if (string.length() == 0) {
                    if (i19 == 1) {
                        string = context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvt, java.lang.Integer.valueOf(eVar2.f86668b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f86668b.get(0), false, 1, null)));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    } else if (i19 == 3) {
                        string = context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvu, java.lang.Integer.valueOf(eVar2.f86668b.size() - 1), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f86668b.get(0), false, 1, null)));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    } else if (i19 != 4) {
                        string = context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvs, java.lang.Integer.valueOf(eVar2.f86668b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f86668b.get(0), false, 1, null)));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    } else {
                        string = context3.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvr, bk4.i.a().m(xe0.j0.a((xe0.j0) eVar2.f86668b.get(0), false, 1, null)));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    }
                }
                textView.setText(string);
            }
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.doo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r23, in5.c r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.q.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.a
    public void n(android.content.Context context, nj4.e item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = item.f419469d.f86667a;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = (com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) this.f254875f.get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.Object obj = this.f254876g.get(str);
        h0Var.f391656d = obj;
        if (obj != null && this.f254786e > 0) {
            int size = ((java.util.List) obj).size();
            int i17 = this.f254786e;
            if (size >= i17 + 1) {
                this.f254889w = true;
                int size2 = ((java.util.List) h0Var.f391656d).size();
                while (i17 < size2) {
                    if (c16718x7059cefe != null) {
                        c16718x7059cefe.u((xm3.d) ((java.util.List) h0Var.f391656d).get(i17));
                    }
                    i17++;
                }
                java.lang.Object obj2 = h0Var.f391656d;
                java.util.List subList = ((java.util.List) obj2).subList(this.f254786e + 1, ((java.util.List) obj2).size());
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
                java.util.Iterator it = subList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d) it.next()).f254798e);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.SquareItemConvert", "[closeArrowClick] otherFriendsList = " + arrayList);
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.l(this, c16718x7059cefe, item, h0Var, arrayList);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(lVar, 150L, false);
            }
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg.class)).f255640d).put(str, java.lang.Boolean.TRUE);
    }

    public void p(android.content.Context context, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (str == null || r26.n0.N(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = (com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe) this.f254875f.get(str);
        java.util.List list = (java.util.List) this.f254876g.get(str);
        if (list != null && this.f254786e > 0) {
            int size = list.size();
            int i17 = this.f254786e;
            if (size >= i17 + 1) {
                if (c16718x7059cefe != null) {
                    c16718x7059cefe.u((xm3.d) list.get(i17));
                }
                java.util.List subList = list.subList(this.f254786e + 1, list.size());
                if (c16718x7059cefe != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.p(c16718x7059cefe, subList, false, 2, null);
                }
            }
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mg.class)).f255640d).put(str, java.lang.Boolean.FALSE);
    }
}
