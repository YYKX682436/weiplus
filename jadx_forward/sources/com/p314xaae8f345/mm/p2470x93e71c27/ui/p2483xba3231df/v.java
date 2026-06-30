package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public class v implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m2, w35.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f272533a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 f272534b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f272535c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f272536d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f272537e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f272538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f272539g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f272540h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.HashMap f272541i;

    /* renamed from: j, reason: collision with root package name */
    public kb0.b f272542j;

    /* renamed from: k, reason: collision with root package name */
    public kb0.g f272543k;

    /* renamed from: l, reason: collision with root package name */
    public db5.t4 f272544l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f272545m;

    /* renamed from: n, reason: collision with root package name */
    public rl5.r f272546n;

    public v(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f272533a = context;
        this.f272534b = params;
        this.f272535c = "MicroMsg.BaseBottomSheetOpenWayEnhance";
        this.f272536d = params.f270841a;
        this.f272537e = new java.util.ArrayList();
        this.f272538f = new java.util.ArrayList();
        this.f272541i = new java.util.HashMap();
        i();
        this.f272545m = new java.util.HashMap();
    }

    public void a(java.util.ArrayList openWayList) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openWayList, "openWayList");
        if (openWayList.isEmpty()) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.util.Iterator it = openWayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it.next();
                java.lang.String wi6 = ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).wi(wVar.a());
                if (wi6 == null) {
                    wi6 = wVar.a();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wi6, "<set-?>");
                wVar.f272559s = wi6;
            }
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(openWayList, 10));
            java.util.Iterator it6 = openWayList.iterator();
            while (it6.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it6.next()).a());
            }
            bundle.putStringArrayList("name_list", new java.util.ArrayList<>(arrayList));
            android.os.Bundle bundle2 = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.b.class);
            if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("pin_yin_list")) != null) {
                int i17 = 0;
                for (java.lang.Object obj : stringArrayList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str = (java.lang.String) obj;
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) kz5.n0.a0(openWayList, i17);
                    if (wVar2 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        wVar2.f272559s = str;
                    }
                    i17 = i18;
                }
            }
        }
        java.util.ArrayList arrayList2 = this.f272537e;
        arrayList2.addAll(openWayList);
        this.f272538f = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0.f272478a.f(arrayList2, this.f272536d);
        java.lang.ref.WeakReference weakReference = this.f272539g;
        if (weakReference == null || (k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) weakReference.get()) == null) {
            return;
        }
        f(k0Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = k0Var.G1;
        if (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }

    public void b(java.lang.String str, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        if (this.f272538f.removeIf(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.c(str)) && (weakReference = this.f272539g) != null && (k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) weakReference.get()) != null) {
            f(k0Var);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = k0Var.G1;
            if (c1163xf1deaba4 != null && (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        }
        if (z17) {
            return;
        }
        this.f272534b.f270847g.add(str);
        this.f272537e.removeIf(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.d(str));
    }

    public final void c(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data) {
        jz5.f0 f0Var;
        yz5.l lVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.ref.WeakReference weakReference = this.f272539g;
        if (weakReference != null && (k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) weakReference.get()) != null) {
            k0Var.u();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f272540h;
        if (z2Var != null) {
            z2Var.B();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2 f2Var = this.f272534b.f270851k;
        if (f2Var == null || (lVar = f2Var.f270832c) == null) {
            f0Var = null;
        } else {
            lVar.mo146xb9724478(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.e(this, context, data));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            d(context, data);
        }
    }

    public final void d(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h(), "clickItem " + wVar.a() + ", " + wVar.h() + ' ' + wVar.b());
        w35.b bVar = (w35.b) this.f272541i.get(java.lang.Integer.valueOf(wVar.h()));
        if (bVar != null) {
            bVar.b(context, wVar);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            if (wVar.f272551h) {
                l(context);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(h(), "clickItem, unknown item type: " + wVar.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((!r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 r8) {
        /*
            r7 = this;
            kb0.b r0 = r7.f272542j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1e
            if (r8 == 0) goto Ld
            int r3 = r8.hashCode()
            goto Le
        Ld:
            r3 = r2
        Le:
            int r4 = r0.f387722c
            if (r4 != r3) goto L14
            r0 = r1
            goto L17
        L14:
            r0.f387722c = r3
            r0 = r2
        L17:
            if (r0 != 0) goto L1b
            r0 = r1
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto Lb4
        L1e:
            com.tencent.mm.pluginsdk.model.g2 r0 = r7.f272534b
            r3 = 0
            r0.f270852l = r3
            java.util.ArrayList r0 = r7.f272537e
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.tencent.mm.pluginsdk.ui.otherway.w r5 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) r5
            boolean r5 = r5.f272552i
            if (r5 == 0) goto L29
            goto L3c
        L3b:
            r4 = r3
        L3c:
            com.tencent.mm.pluginsdk.ui.otherway.w r4 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) r4
            kb0.b r0 = new kb0.b
            kb0.j r5 = kb0.j.f387742a
            com.tencent.mm.pluginsdk.model.g2 r6 = r7.f272534b
            java.util.HashMap r5 = r5.b(r6)
            java.util.HashMap r6 = r7.f272545m
            r0.<init>(r5, r6, r4)
            r7.f272542j = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            jz5.l r4 = new jz5.l
            java.lang.String r5 = "style_type"
            r4.<init>(r5, r1)
            jz5.l[] r1 = new jz5.l[]{r4}
            java.util.HashMap r1 = kz5.c1.i(r1)
            java.util.HashMap r0 = r0.f387720a
            r1.putAll(r0)
            java.lang.Class<dy1.r> r0 = dy1.r.class
            i95.m r0 = i95.n0.c(r0)
            dy1.r r0 = (dy1.r) r0
            cy1.a r0 = (cy1.a) r0
            java.lang.String r4 = "view_exp"
            r5 = 35480(0x8a98, float:4.9718E-41)
            java.lang.String r6 = "view_share_sheet"
            r0.Hj(r6, r4, r1, r5)
            kb0.b r0 = r7.f272542j
            if (r0 == 0) goto La3
            if (r8 == 0) goto L86
            androidx.recyclerview.widget.RecyclerView r3 = r8.G1
        L86:
            java.lang.ref.WeakReference r1 = r0.f387724e
            androidx.recyclerview.widget.w2 r4 = r0.f387725f
            if (r1 == 0) goto L97
            java.lang.Object r1 = r1.get()
            androidx.recyclerview.widget.RecyclerView r1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) r1
            if (r1 == 0) goto L97
            r1.V0(r4)
        L97:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.f387724e = r1
            if (r3 == 0) goto La3
            r3.i(r4)
        La3:
            kb0.b r0 = r7.f272542j
            if (r0 == 0) goto Lb4
            if (r8 == 0) goto Lad
            int r2 = r8.hashCode()
        Lad:
            int r1 = r0.f387722c
            if (r1 != r2) goto Lb2
            goto Lb4
        Lb2:
            r0.f387722c = r2
        Lb4:
            r7.f(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v.e(com.tencent.mm.ui.widget.dialog.k0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r9 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 r18) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v.f(com.tencent.mm.ui.widget.dialog.k0):void");
    }

    public final java.util.ArrayList g() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f272538f);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
        wVar.f272551h = true;
        arrayList.add(wVar);
        return arrayList;
    }

    public java.lang.String h() {
        return this.f272535c;
    }

    public final void i() {
        java.util.HashMap i17 = kz5.c1.i(new jz5.l(2, new w35.q(this.f272534b, this)), new jz5.l(3, new w35.t(this.f272534b, this)), new jz5.l(4, new w35.l(this.f272534b, this)), new jz5.l(5, new w35.g(this.f272534b, this)), new jz5.l(7, new w35.g(this.f272534b, this)), new jz5.l(6, new w35.d(this.f272534b, this)));
        this.f272541i = i17;
        if (this.f272534b.f270842b != null) {
            for (java.util.Map.Entry entry : i17.entrySet()) {
                ((java.lang.Number) entry.getKey()).intValue();
                ((w35.b) entry.getValue()).a();
            }
        }
    }

    public void j() {
        yz5.a aVar = this.f272534b.f270850j;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final void k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, java.lang.String str, yz5.l onMenuItemSelected) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onMenuItemSelected, "onMenuItemSelected");
        if (c1163xf1deaba4 != null) {
            if (str == null || r26.n0.N(str)) {
                return;
            }
            rl5.r rVar = this.f272546n;
            if (rVar != null) {
                rVar.a();
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            android.view.View mo7935xa188593e = layoutManager != null ? layoutManager.mo7935xa188593e(i17) : null;
            android.view.View findViewById = mo7935xa188593e != null ? mo7935xa188593e.findViewById(i18) : null;
            if (findViewById == null) {
                findViewById = mo7935xa188593e;
            }
            if (findViewById != null) {
                rl5.r rVar2 = new rl5.r(findViewById.getContext());
                rVar2.D = true;
                rVar2.L = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.l(this);
                this.f272546n = rVar2;
                int[] iArr = {0, 0};
                findViewById.getLocationInWindow(iArr);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n nVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n(this, str, onMenuItemSelected);
                int f17 = i65.a.f(findViewById.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                rl5.r rVar3 = this.f272546n;
                if (rVar3 != null) {
                    int width = (int) (iArr[0] + (findViewById.getWidth() / 2.0f));
                    int i19 = iArr[1] - f17;
                    rVar3.f478887x = nVar;
                    rVar3.f478871f = mo7935xa188593e;
                    if (!(mo7935xa188593e instanceof android.widget.TextView) && (width == 0 || i19 == 0)) {
                        rVar3.l();
                    }
                    rVar3.f478889z.clear();
                    rVar3.f478889z.a(0, com.p314xaae8f345.mm.R.C30867xcad56011.o_u);
                    if (width == 0 && i19 == 0) {
                        rVar3.m();
                    } else {
                        rVar3.n(width, i19);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    public void l(android.content.Context context) {
        final java.util.ArrayList arrayList;
        ?? r47;
        android.view.View view;
        android.content.pm.ResolveInfo resolveInfo;
        android.content.pm.ActivityInfo activityInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0 h0Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.h0.f272478a;
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        java.lang.String str = this.f272536d;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = this.f272534b;
        java.lang.String str2 = g2Var.f270842b;
        java.lang.String str3 = g2Var.f270843c;
        int i17 = g2Var.f270848h;
        java.util.HashSet blockSet = g2Var.f270847g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockSet, "blockSet");
        android.content.Intent e17 = h0Var.e(context2, str, str2, str3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        hashSet.addAll(blockSet);
        h0Var.a(context2, e17, hashSet, arrayList2);
        android.content.Intent c17 = h0Var.c(context2, str, str2, str3);
        h0Var.a(context2, c17, hashSet, arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x) it.next();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
            wVar.f272547d = xVar;
            arrayList3.add(wVar);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
        if (kz5.c0.i(3, 4, 2, 1, 5, 6).contains(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0 o0Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0("common_local_app");
            o0Var.f270925d = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80956x2b043bc1);
            o0Var.f270923b = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obc);
            o0Var.f270927f = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.b0(i17, str2, c17);
            wVar2.f272553m = 1;
            wVar2.f272550g = o0Var;
            arrayList4.add(wVar2);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mimeType: ");
        sb6.append(str);
        sb6.append(", displayList: ");
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it6 = arrayList4.iterator();
        while (true) {
            java.lang.String str4 = null;
            if (!it6.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar2 = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it6.next()).f272547d;
            if (xVar2 != null && (resolveInfo = xVar2.f272561d) != null && (activityInfo = resolveInfo.activityInfo) != null) {
                str4 = activityInfo.packageName;
            }
            arrayList5.add(str4);
        }
        sb6.append(kz5.n0.g0(arrayList5, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenByOtherAppHelper", sb6.toString());
        java.util.Iterator it7 = arrayList4.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            arrayList = this.f272537e;
            if (!hasNext) {
                break;
            } else {
                arrayList.removeIf(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.o((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it7.next()));
            }
        }
        a(arrayList4);
        if (arrayList.isEmpty()) {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.o_t);
            e4Var.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(h(), "dataList is empty");
            return;
        }
        h0Var.g(arrayList, this.f272536d, this.f272534b.f270848h);
        boolean Bi = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(this.f272534b.f270848h);
        java.util.Collection collection = kz5.p0.f395529d;
        if (Bi) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.util.Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                java.lang.Object next = it8.next();
                if (((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) next).h() == 6) {
                    arrayList6.add(next);
                }
            }
            r47 = new java.util.ArrayList();
            java.util.Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                xj.m mVar = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it9.next()).f272555o;
                java.lang.String str5 = mVar != null ? mVar.f536291f : null;
                if (str5 != null) {
                    r47.add(str5);
                }
            }
        } else {
            r47 = collection;
        }
        arrayList.removeIf(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p(r47));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f272540h;
        if (z2Var == null || !z2Var.h()) {
            java.util.Iterator it10 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it10.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (((java.util.ArrayList) kz5.n0.t0(kz5.c0.i(2, 3, 4, 5), Bi ? kz5.b0.c(6) : collection)).contains(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) it10.next()).h()))) {
                    break;
                } else {
                    i19++;
                }
            }
            java.util.Iterator it11 = arrayList.iterator();
            int i27 = 0;
            while (it11.hasNext()) {
                java.lang.Object next2 = it11.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w) next2;
                wVar3.f272557q = i27 == i19;
                wVar3.f272558r = i19 >= 0 && i27 == arrayList.size() - 1;
                i27 = i28;
            }
            this.f272540h = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 3, true, false);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var2 = this.f272534b;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f2 f2Var = g2Var2.f270851k;
            this.f272543k = new kb0.g(g2Var2, f2Var != null ? f2Var.f270834e : null, arrayList);
            java.lang.Object obj = this.f272541i.get(6);
            w35.d dVar = obj instanceof w35.d ? (w35.d) obj : null;
            if (dVar != null) {
                dVar.f524262e = this.f272543k;
            }
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eli, (android.view.ViewGroup) null);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.qlj).setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.q(this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = this.f272540h;
            if (z2Var2 != null && (view = z2Var2.f293591g) != null) {
                view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cw_);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = this.f272540h;
            if (z2Var3 != null) {
                z2Var3.s(inflate);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570 = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570(context, null);
            c22843x6b8c5570.m82895x25bfb969((int) (context.getResources().getDisplayMetrics().heightPixels * 0.7d));
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.otherway.BottomSheetOpenWayEnhance$showMoreOpenWay$adapter$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    if (type != 6) {
                        return type != 7 ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.p0() : new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.q0();
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u uVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u(arrayList, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v.this);
                    return ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Bi(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v.this.f272534b.f270848h) ? new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.m0(uVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v.this.f272543k) : new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.l0(uVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v.this.f272543k);
                }
            }, arrayList, false);
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.r(arrayList, this, context);
            kb0.g gVar = this.f272543k;
            if (gVar != null) {
                c22843x6b8c5570.i(new kb0.d(gVar));
            }
            android.view.View view2 = new android.view.View(context);
            view2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df)));
            c22848x6ddd90cf.O(view2, 2147483646, false);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 1, false);
            c22843x6b8c5570.mo7960x6cab2c8d(c22848x6ddd90cf);
            c22843x6b8c5570.mo7967x900dcbe1(c1162x665295de);
            c22843x6b8c5570.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
            c22843x6b8c5570.setClipToPadding(false);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var4 = this.f272540h;
            if (z2Var4 != null) {
                z2Var4.k(c22843x6b8c5570, 0, 0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var5 = this.f272540h;
            if (z2Var5 != null) {
                z2Var5.w(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.s(this));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var6 = this.f272540h;
            if (z2Var6 != null) {
                z2Var6.l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.t(this));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var7 = this.f272540h;
            if (z2Var7 != null) {
                z2Var7.C();
            }
        }
    }
}
