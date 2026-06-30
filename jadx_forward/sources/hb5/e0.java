package hb5;

/* loaded from: classes9.dex */
public class e0 extends android.widget.BaseAdapter implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int N = 0;
    public hb5.k0 A;
    public hb5.k0 C;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f361697d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361698e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f361699f;

    /* renamed from: g, reason: collision with root package name */
    public o11.g f361700g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f361701h;

    /* renamed from: i, reason: collision with root package name */
    public int f361702i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f361703m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f361704n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f361705o;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f361710t;

    /* renamed from: u, reason: collision with root package name */
    public hb5.k0 f361711u;

    /* renamed from: w, reason: collision with root package name */
    public hb5.k0 f361713w;

    /* renamed from: x, reason: collision with root package name */
    public hb5.k0 f361714x;

    /* renamed from: z, reason: collision with root package name */
    public hb5.k0 f361716z;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f361706p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f361707q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f361708r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f361709s = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f361712v = new java.util.ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f361715y = new java.util.ArrayList();
    public final java.util.ArrayList B = new java.util.ArrayList();
    public boolean D = true;
    public boolean E = false;
    public boolean F = false;
    public boolean G = true;
    public boolean H = true;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f361696J = 0;
    public int K = 0;
    public boolean L = false;
    public int M = 0;

    public e0(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        boolean z17 = false;
        this.f361701h = context;
        this.f361697d = str;
        this.f361698e = i17;
        this.f361703m = i17 == 1 || i17 == 2;
        this.f361704n = i17 == 1 || i17 == 3;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (i17 == 1 || i17 == 4)) {
            z17 = true;
        }
        this.f361705o = z17;
        this.f361702i = i17 != 1 ? Integer.MAX_VALUE : 3;
        o11.f fVar = new o11.f();
        java.lang.String str3 = s01.r.f483457a;
        fVar.f423616g = qk.b.a(str);
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
        fVar.f423630u = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561300eo) * 0.1f;
        fVar.f423629t = true;
        this.f361700g = fVar.a();
        if (this.f361705o) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor o17 = r01.q3.cj().o1(str2, true);
            while (o17.moveToNext()) {
                r45.co coVar = new r45.co();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(o17);
                qk.o oVar = new qk.o();
                oVar.mo9015xbf5d97fd(o17);
                coVar.f453209d = z3Var.d1();
                coVar.f453210e = z3Var;
                coVar.f453211f = oVar;
                fb5.n nVar = new fb5.n();
                nVar.f342431b = coVar;
                if (oVar.F0()) {
                    nVar.f342430a = "!1";
                } else if (coVar.f453210e.w2()) {
                    nVar.f342430a = "!2";
                } else {
                    int c27 = coVar.f453210e.c2();
                    if (c27 >= 97 && c27 <= 122) {
                        c27 -= 32;
                    }
                    if (c27 < 65 || c27 > 90) {
                        nVar.f342430a = "#";
                    } else {
                        nVar.f342430a = ((char) c27) + "";
                    }
                }
                arrayList.add(nVar);
            }
            o17.close();
            java.util.Collections.sort(arrayList, new hb5.d0(this, null));
            this.f361710t = arrayList;
        }
        if (this.f361703m) {
            c01.d9.e().a(1364, this);
        }
    }

    public final void a() {
        this.M = 0;
        this.f361707q.clear();
        this.f361706p.clear();
        this.f361708r.clear();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public hb5.k0 getItem(int i17) {
        int i18 = this.I;
        if (i17 >= i18) {
            int i19 = this.f361696J;
            if (i17 < i19) {
                if (i17 == i18) {
                    if (this.f361714x == null) {
                        this.f361714x = new hb5.k0(5, 2);
                    }
                    return this.f361714x;
                }
                if (i17 == this.K - 1 && this.G && d()) {
                    if (this.f361716z == null) {
                        this.f361716z = new hb5.k0(3, 2);
                    }
                    return this.f361716z;
                }
                int i27 = (i17 - this.I) - 1;
                if (i27 >= 0) {
                    java.util.ArrayList arrayList = this.f361715y;
                    if (i27 < arrayList.size()) {
                        return (hb5.k0) arrayList.get(i27);
                    }
                }
            } else {
                if (i17 == i19) {
                    if (this.A == null) {
                        this.A = new hb5.k0(5, 3);
                    }
                    return this.A;
                }
                if (i17 == this.K - 1 && this.H && d()) {
                    if (this.C == null) {
                        this.C = new hb5.k0(3, 3);
                    }
                    return this.C;
                }
                int i28 = (i17 - this.f361696J) - 1;
                if (i28 >= 0) {
                    java.util.ArrayList arrayList2 = this.B;
                    if (i28 < arrayList2.size()) {
                        return (hb5.k0) arrayList2.get(i28);
                    }
                }
            }
        } else {
            if (i17 == 0) {
                if (this.f361711u == null) {
                    this.f361711u = new hb5.k0(5, 1);
                }
                return this.f361711u;
            }
            if (i17 == i18 - 1 && this.E && d()) {
                if (this.f361713w == null) {
                    this.f361713w = new hb5.k0();
                }
                hb5.k0 k0Var = this.f361713w;
                k0Var.f361743a = 4;
                k0Var.f361744b = 1;
                return this.f361713w;
            }
            if (i17 == this.I - 1 && this.D && d()) {
                if (this.f361713w == null) {
                    this.f361713w = new hb5.k0();
                }
                hb5.k0 k0Var2 = this.f361713w;
                k0Var2.f361743a = 3;
                k0Var2.f361744b = 1;
                return this.f361713w;
            }
            int i29 = i17 - 1;
            if (i29 >= 0) {
                java.util.ArrayList arrayList3 = this.f361712v;
                if (i29 < arrayList3.size()) {
                    return (hb5.k0) arrayList3.get(i29);
                }
            }
        }
        return new hb5.k0();
    }

    public final boolean d() {
        return this.f361698e == 1;
    }

    public final boolean f() {
        return this.f361698e == 2;
    }

    public final void g() {
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47 activityC21587xf1094a47 = (com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21587xf1094a47) this.f361701h;
        activityC21587xf1094a47.getClass();
        if (d()) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f361699f)) {
                activityC21587xf1094a47.f279466n.setVisibility(8);
                activityC21587xf1094a47.f279465m.setVisibility(8);
                return;
            } else if (this.K <= 0) {
                activityC21587xf1094a47.f279466n.setVisibility(0);
                activityC21587xf1094a47.f279465m.setVisibility(8);
                return;
            } else {
                activityC21587xf1094a47.f279466n.setVisibility(8);
                activityC21587xf1094a47.f279465m.setVisibility(0);
                return;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f361699f)) {
            activityC21587xf1094a47.f279466n.setVisibility(0);
            activityC21587xf1094a47.f279466n.setText("");
            activityC21587xf1094a47.f279465m.setVisibility(8);
        } else if (f() && this.E) {
            activityC21587xf1094a47.f279466n.setVisibility(0);
            activityC21587xf1094a47.f279466n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ao7);
            activityC21587xf1094a47.f279465m.setVisibility(8);
        } else if (f() && this.L) {
            activityC21587xf1094a47.f279466n.setVisibility(0);
            activityC21587xf1094a47.f279466n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ao8);
            activityC21587xf1094a47.f279465m.setVisibility(8);
        } else if (this.K <= 0) {
            activityC21587xf1094a47.f279466n.setVisibility(0);
            android.widget.TextView textView = activityC21587xf1094a47.f279466n;
            java.lang.String string = activityC21587xf1094a47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icq);
            java.lang.String string2 = activityC21587xf1094a47.getString(com.p314xaae8f345.mm.R.C30867xcad56011.icp);
            java.lang.String str = this.f361699f;
            textView.setText(o13.q.d(string, string2, p13.i.a(str, str, false, false)).f432638a);
            activityC21587xf1094a47.f279465m.setVisibility(8);
        } else {
            activityC21587xf1094a47.f279466n.setVisibility(8);
            activityC21587xf1094a47.f279465m.setVisibility(0);
        }
        if (f()) {
            if (this.F) {
                activityC21587xf1094a47.U6(1);
            } else if (this.D) {
                activityC21587xf1094a47.U6(2);
            } else {
                activityC21587xf1094a47.U6(0);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.K;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        hb5.k0 item = getItem(i17);
        if (item != null) {
            return item.f361743a;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x035b, code lost:
    
        if (r3 != r26.K) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0325  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb5.e0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 7;
    }

    public final void h(boolean z17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4 = this.f361712v;
        arrayList4.clear();
        java.util.ArrayList arrayList5 = this.f361715y;
        arrayList5.clear();
        java.util.ArrayList arrayList6 = this.B;
        arrayList6.clear();
        int i17 = 0;
        while (true) {
            int i18 = this.f361702i;
            arrayList = this.f361707q;
            if (i17 >= java.lang.Math.min(i18, arrayList.size())) {
                break;
            }
            arrayList4.add(new hb5.k0(1, arrayList.get(i17)));
            i17++;
        }
        int i19 = 0;
        while (true) {
            int i27 = this.f361702i;
            arrayList2 = this.f361708r;
            if (i19 >= java.lang.Math.min(i27, arrayList2.size())) {
                break;
            }
            arrayList5.add(new hb5.k0(2, arrayList2.get(i19)));
            i19++;
        }
        int i28 = 0;
        while (true) {
            int i29 = this.f361702i;
            arrayList3 = this.f361709s;
            if (i28 >= java.lang.Math.min(i29, arrayList3.size())) {
                break;
            }
            arrayList6.add(new hb5.k0(6, arrayList3.get(i28)));
            i28++;
        }
        int size = arrayList.size();
        int size2 = arrayList2.size();
        int size3 = arrayList3.size();
        if (this.f361698e != 2) {
            this.D = arrayList.size() > this.f361702i;
        }
        this.G = arrayList2.size() > this.f361702i;
        int size4 = arrayList3.size();
        int i37 = this.f361702i;
        this.H = size4 > i37;
        if (size > 0 || this.E) {
            int min = java.lang.Math.min(size, i37) + 1;
            if (d()) {
                r3 = ((this.E || this.D) ? 1 : 0) + min;
            } else {
                r3 = min;
            }
        }
        this.I = r3;
        if (size2 > 0) {
            r3 = r3 + 1 + java.lang.Math.min(size2, this.f361702i);
            if (d()) {
                r3 += this.G ? 1 : 0;
            }
        }
        this.f361696J = r3;
        if (size3 > 0) {
            r3 = r3 + 1 + java.lang.Math.min(size3, this.f361702i);
            if (d()) {
                r3 += this.H ? 1 : 0;
            }
        }
        this.K = r3;
        if (z17) {
            notifyDataSetChanged();
            g();
        }
    }

    public final void j(java.lang.String str) {
        java.util.List list;
        r45.co coVar;
        java.util.ArrayList arrayList = this.f361709s;
        arrayList.clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (list = this.f361710t) != null) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                fb5.n nVar = (fb5.n) it.next();
                boolean z17 = false;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && nVar != null && (coVar = (r45.co) nVar.f342431b) != null) {
                    java.lang.String g27 = coVar.f453210e.g2();
                    java.lang.String T0 = coVar.f453210e.T0();
                    java.lang.String U0 = coVar.f453210e.U0();
                    java.lang.String upperCase = str.toUpperCase();
                    if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g27) && g27.toUpperCase().indexOf(upperCase) != -1) || ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T0) && T0.toUpperCase().indexOf(upperCase) != -1) || (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(U0) && U0.toUpperCase().startsWith(upperCase)))) {
                        z17 = true;
                    }
                }
                if (z17) {
                    arrayList.add(nVar);
                }
            }
        }
        h(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r7.moveToFirst() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        r0 = new s01.h();
        r0.mo9015xbf5d97fd(r7);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0056, code lost:
    
        if (r7.moveToNext() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            s01.g r0 = r01.q3.aj()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            r3 = 0
            if (r2 == 0) goto L14
            goto L5b
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "select BizChatInfo.* from BizChatConversation , BizChatInfo where BizChatConversation.brandUserName = '"
            r2.<init>(r4)
            java.lang.String r4 = r6.f361697d
            r2.append(r4)
            java.lang.String r5 = "' and BizChatInfo.brandUserName = '"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r4 = "' and BizChatConversation.bizChatId = BizChatInfo.bizChatLocalId and BizChatInfo.chatName like '%"
            r2.append(r4)
            r2.append(r7)
            java.lang.String r7 = "%' order by BizChatConversation.flag desc , BizChatConversation.lastMsgTime desc"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String[] r2 = new java.lang.String[r3]
            android.database.Cursor r7 = r0.m145256x1d3f4980(r7, r2)
            if (r7 == 0) goto L5b
            boolean r0 = r7.moveToFirst()
            if (r0 == 0) goto L58
        L47:
            s01.h r0 = new s01.h
            r0.<init>()
            r0.mo9015xbf5d97fd(r7)
            r1.add(r0)
            boolean r0 = r7.moveToNext()
            if (r0 != 0) goto L47
        L58:
            r7.close()
        L5b:
            r6.a()
            java.util.Iterator r7 = r1.iterator()
        L62:
            boolean r0 = r7.hasNext()
            java.util.ArrayList r1 = r6.f361707q
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r7.next()
            s01.h r0 = (s01.h) r0
            boolean r2 = r0.y0()
            if (r2 == 0) goto L80
            boolean r4 = r6.f361704n
            if (r4 == 0) goto L80
            java.util.ArrayList r1 = r6.f361708r
            r1.add(r0)
            goto L62
        L80:
            if (r2 != 0) goto L62
            boolean r2 = r6.f361703m
            if (r2 == 0) goto L62
            r1.add(r0)
            java.util.ArrayList r1 = r6.f361706p
            r1.add(r0)
            goto L62
        L8f:
            boolean r7 = r6.f361703m
            if (r7 == 0) goto L9e
            int r7 = r1.size()
            int r0 = r6.f361702i
            if (r7 > r0) goto L9c
            r3 = 1
        L9c:
            r6.E = r3
        L9e:
            r6.h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb5.e0.k(java.lang.String, boolean):void");
    }

    public final android.text.SpannableString l(android.content.Context context, android.text.Spannable spannable, int i17, boolean z17) {
        android.text.SpannableString n17;
        if (z17) {
            n17 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, spannable, i17);
        } else {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            n17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, spannable, i17);
        }
        android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), android.text.style.ForegroundColorSpan.class);
        if (foregroundColorSpanArr != null) {
            for (android.text.style.ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                n17.setSpan(foregroundColorSpan, spannable.getSpanStart(foregroundColorSpan), spannable.getSpanEnd(foregroundColorSpan), spannable.getSpanFlags(foregroundColorSpan));
            }
        }
        return n17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.gi5 gi5Var;
        boolean z17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2;
        if (this.f361703m && m1Var.mo808xfb85f7b0() == 1364 && (m1Var instanceof s01.e0)) {
            this.F = false;
            s01.e0 e0Var = (s01.e0) m1Var;
            r45.wj wjVar = null;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = e0Var.f483397e;
            r45.vj vjVar = (oVar == null || (fVar2 = oVar.f152243a.f152217a) == null) ? null : (r45.vj) fVar2;
            java.lang.String str2 = vjVar.f469831e;
            java.lang.String str3 = vjVar.f469830d;
            if (str2.equals(this.f361699f) && str3.equals(this.f361697d) && this.M == vjVar.f469832f) {
                if (i17 != 0 || i18 != 0) {
                    if (f()) {
                        this.E = false;
                        this.L = true;
                        g();
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = e0Var.f483397e;
                if (oVar2 != null && (fVar = oVar2.f152244b.f152233a) != null) {
                    wjVar = (r45.wj) fVar;
                }
                if (wjVar == null || (gi5Var = wjVar.f470746d) == null || gi5Var.f456821d != 0) {
                    if (f()) {
                        this.E = false;
                        this.L = true;
                        g();
                        return;
                    }
                    return;
                }
                java.util.LinkedList<r45.uj> linkedList = wjVar.f470747e;
                boolean z18 = wjVar.f470748f;
                if (str2.equals(this.f361699f)) {
                    this.E = false;
                    this.M += linkedList.size();
                    boolean d17 = d();
                    java.util.ArrayList arrayList = this.f361706p;
                    java.util.ArrayList arrayList2 = this.f361707q;
                    if (d17) {
                        if (arrayList2.size() < arrayList.size()) {
                            k(str2, true);
                            return;
                        } else if (arrayList2.size() > arrayList.size()) {
                            h(true);
                            return;
                        }
                    }
                    if (f()) {
                        this.D = z18;
                    }
                    if (this.f361698e == 3) {
                        return;
                    }
                    for (r45.uj ujVar : linkedList) {
                        r45.xj xjVar = ujVar.f468940d;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xjVar.f471686d)) {
                            java.util.Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (xjVar.f471686d.equals(((s01.h) it.next()).f69169xf75e5c37)) {
                                        z17 = true;
                                        break;
                                    }
                                } else {
                                    z17 = false;
                                    break;
                                }
                            }
                            if (!z17) {
                                arrayList2.add(ujVar);
                            }
                        }
                    }
                    h(true);
                }
            }
        }
    }
}
