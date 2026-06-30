package ia2;

/* loaded from: classes2.dex */
public final class n0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79 {

    /* renamed from: d, reason: collision with root package name */
    public final int f371486d;

    /* renamed from: e, reason: collision with root package name */
    public final int f371487e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628 f371488f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0 f371489g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f371490h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f371491i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f371492m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 f371493n;

    /* renamed from: o, reason: collision with root package name */
    public long f371494o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f371495p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f371496q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f371497r;

    /* renamed from: s, reason: collision with root package name */
    public r45.f96 f371498s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f371499t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f371500u;

    /* renamed from: v, reason: collision with root package name */
    public final ia2.j0 f371501v;

    public n0(int i17, int i18, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context, ia2.o0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f371486d = i17;
        this.f371487e = i18;
        this.f371490h = true;
        this.f371495p = new java.util.LinkedHashMap();
        this.f371496q = new java.util.LinkedHashMap();
        this.f371499t = "";
        this.f371500u = new java.util.LinkedHashMap();
        this.f371491i = new java.lang.ref.WeakReference(context);
        this.f371492m = new java.lang.ref.WeakReference(delegate);
        this.f371501v = new ia2.j0(this);
    }

    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("ref_commenscene", this.f371487e);
        jSONObject.put("ref_json", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23966x2bb6c1fd b(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa c13924x37151faa, boolean z17) {
        java.lang.Iterable<so2.j5> m56409x97891cf7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) ((java.util.LinkedHashMap) this.f371495p).get(e(i17, i18));
        if (z17) {
            if (c13879x1453fa95 != null) {
                m56409x97891cf7 = c13879x1453fa95.m56387xe6796cde();
            }
            m56409x97891cf7 = null;
        } else {
            if (c13924x37151faa != null) {
                m56409x97891cf7 = c13924x37151faa.m56409x97891cf7();
            }
            m56409x97891cf7 = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (m56409x97891cf7 != null) {
            for (so2.j5 j5Var : m56409x97891cf7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                if (abstractC14490x69736cb5 != null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    c19792x256d2725.m76877x684351d(feedObject.m76784x5db1b11());
                    c19792x256d2725.m76894x7ac946f0(feedObject.m76801x8010e5e4());
                    c19792x256d2725.m76929x66bc2758(feedObject.m76836x6c03c64c());
                    c19792x256d2725.m76896xfefec3e9(feedObject.m76803x6c285d75());
                    c19792x256d2725.m76899x71cce6d8(feedObject.m76806xdef68064());
                    c19792x256d2725.m76895x5bf46472(feedObject.m76802x2dd01666());
                    c19792x256d2725.m76887xcb0dd23c(feedObject.m76794xd0557130());
                    c19792x256d2725.m76853xe9f5ad5e(feedObject.m76760x76845fea());
                    c19792x256d2725.m76884x50740976(feedObject.m76791xf4204902());
                    c19792x256d2725.m76861xb2c72d36(feedObject.m76768xb80ecc2a());
                    c19792x256d2725.m76862x71208265(feedObject.m76769xfdaf34f1());
                    arrayList.add(c19792x256d2725.mo14344x5f01b1f6());
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "generateUpdateData: " + this.f371497r + ' ' + z17);
        java.lang.Object response = c13924x37151faa != null ? c13924x37151faa.getResponse() : null;
        r45.zo2 zo2Var = response instanceof r45.zo2 ? (r45.zo2) response : null;
        r45.xo2 xo2Var = zo2Var != null ? (r45.xo2) zo2Var.m75936x14adae67(15) : null;
        if (xo2Var == null && z17) {
            if ((c13879x1453fa95 != null ? c13879x1453fa95.f189075o : null) != null) {
                xo2Var = new r45.xo2();
                xo2Var.set(1, c13879x1453fa95.f189076p);
                java.lang.Integer num = c13879x1453fa95.f189075o;
                xo2Var.set(0, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
            }
        }
        return new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23966x2bb6c1fd(arrayList, xo2Var != null ? xo2Var.mo14344x5f01b1f6() : null, (zo2Var != null ? zo2Var.m75939xb282bd08(14) : 0) > 0, z17, zo2Var != null ? zo2Var.m75939xb282bd08(16) : 0);
    }

    public final r45.qt2 c() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (activityC0065xcd7aa112 == null) {
            return null;
        }
        return ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(activityC0065xcd7aa112);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: callNativeShowMoreMenuPanel */
    public void mo88624x33b2087e() {
        z80.s0 s0Var;
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var;
            z80.n0 n0Var = (z80.n0) i95.n0.c(z80.n0.class);
            java.lang.ref.WeakReference weakReference = activityC13656x51707ca3.f183314u;
            android.app.Activity context = weakReference != null ? (p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) weakReference.get() : null;
            if (context == null) {
                context = activityC13656x51707ca3.m81186xd24c19fa();
            }
            ia2.e eVar = new ia2.e(activityC13656x51707ca3);
            y80.n1 n1Var = (y80.n1) n0Var;
            n1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, 0, false);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.lang.Integer num = activityC13656x51707ca3.E1;
            int intValue = num != null ? num.intValue() : 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = eVar.f371449a;
            if ((intValue == 6 || intValue == 8 || intValue == 11) && ia2.e0.a(c16279x64cea23)) {
                linkedHashSet.add(new z80.v0(z80.u0.f552211e, true));
            } else {
                linkedHashSet.add(new z80.v0(z80.u0.f552210d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.d7(activityC13656x51707ca3)));
            }
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            java.lang.Integer num2 = activityC13656x51707ca3.E1;
            int intValue2 = num2 != null ? num2.intValue() : 0;
            linkedHashSet2.add(new z80.v0(z80.u0.f552212f, false));
            if (intValue2 != 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226122h) && !ia2.e0.a(c16279x64cea23)) {
                linkedHashSet2.add(new z80.v0(z80.u0.f552213g, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.d7(activityC13656x51707ca3)));
            }
            z80.s0 s0Var2 = new z80.s0(linkedHashSet, linkedHashSet2, eVar.f371449a, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.d7(activityC13656x51707ca3) || ia2.e0.a(c16279x64cea23)) ? false : true, new ia2.c(eVar), new ia2.d(eVar));
            if (s0Var2.f552205d) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                s0Var = s0Var2;
                new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Di(context, k0Var, 1, null, new y80.h1(s0Var2.f552204c, context, s0Var2, n1Var));
            } else {
                s0Var = s0Var2;
            }
            k0Var.f293405n = new y80.i1(s0Var, n1Var);
            k0Var.f293414s = new y80.j1(n1Var, context, s0Var);
            k0Var.f293407o = new y80.k1(s0Var, n1Var);
            k0Var.f293417v = new y80.l1(n1Var, context, s0Var);
            k0Var.v();
        }
    }

    public final long d(long j17, long j18, long j19, long j27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 g17 = g((int) j19, (int) j27);
        if (j18 <= 0) {
            return j17;
        }
        java.lang.Integer num = g17.f189075o;
        int intValue = num != null ? num.intValue() : 0;
        long j28 = j17 + intValue;
        return g17.m56387xe6796cde().get(intValue) instanceof so2.l4 ? j28 + 1 : j28;
    }

    public final java.lang.String e(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        return sb6.toString();
    }

    public final void f(java.lang.String str, int i17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        yw.h1.f547865a.s(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23335x4dbe57d1(null, null, null, null, 332L, java.lang.Long.valueOf(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d), str, java.lang.Long.valueOf(i17), null, null, null, null, null, null, null, null, null, null, 261903, null), activityC0065xcd7aa112);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 g(int i17, int i18) {
        r45.bp2 bp2Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.String e17 = e(i17, i18);
        java.util.Map map = this.f371495p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95) ((java.util.LinkedHashMap) map).get(e17);
        if (c13879x1453fa95 == null) {
            c13879x1453fa95 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95(c());
            c13879x1453fa95.mo56107xaf4f6e2e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa952 = this.f371493n;
            if (c13879x1453fa952 != null) {
                int i19 = 0;
                r45.ap2 ap2Var = (c13879x1453fa952 == null || (bp2Var = c13879x1453fa952.f189079s) == null || (m75941xfb821914 = bp2Var.m75941xfb821914(0)) == null) ? null : (r45.ap2) m75941xfb821914.get(i17);
                c13879x1453fa95.f189071h = ap2Var != null ? ap2Var.m75939xb282bd08(0) : 0;
                c13879x1453fa95.f189072i = i17;
                c13879x1453fa95.m56377x73095078(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa953 = this.f371493n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13879x1453fa953);
                c13879x1453fa95.f189068e = c13879x1453fa953.f189068e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa954 = this.f371493n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c13879x1453fa954);
                c13879x1453fa95.f189074n = c13879x1453fa954.f189074n;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa955 = this.f371493n;
                c13879x1453fa95.f189069f = c13879x1453fa955 != null ? c13879x1453fa955.f189069f : null;
                c13879x1453fa95.f189070g = c13879x1453fa955 != null ? c13879x1453fa955.f189070g : null;
                if (ap2Var != null && i18 < ap2Var.m75941xfb821914(2).size()) {
                    i19 = ((r45.vo2) ap2Var.m75941xfb821914(2).get(i18)).m75939xb282bd08(0);
                }
                c13879x1453fa95.f189073m = i19;
            }
            map.put(e17, c13879x1453fa95);
        }
        return c13879x1453fa95;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: getUserLocationInfoFromNativeMap */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23967x8ad963b8 mo88625x5237b6b7() {
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var == null) {
            return null;
        }
        yz5.a aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var).S;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = aVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) aVar.mo152xb9724478() : null;
        if (c16279x64cea23 == null || !c16279x64cea23.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "getUserLocationFromMap: not Valid");
            return null;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23967x8ad963b8 c23967x8ad963b8 = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23967x8ad963b8(c16279x64cea23.f226120f, c16279x64cea23.f226119e, 0.0d, 0.0d);
        c23967x8ad963b8.m88684x2605e9e2();
        c23967x8ad963b8.m88685x79d7af9();
        return c23967x8ad963b8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(r45.f96 r20, zy2.o9 r21, long r22, java.lang.Integer r24, int r25, java.lang.String r26, yz5.p r27, yz5.a r28) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia2.n0.h(r45.f96, zy2.o9, long, java.lang.Integer, int, java.lang.String, yz5.p, yz5.a):void");
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: makePhoneCall */
    public void mo88626x4ebeaa9e(java.lang.String phoneNumber) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneNumber, "phoneNumber");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6025x5a5ef32a c6025x5a5ef32a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6025x5a5ef32a();
        am.ru ruVar = c6025x5a5ef32a.f136316g;
        ruVar.f89376a = activityC0065xcd7aa112;
        ruVar.f89377b = phoneNumber;
        ruVar.f89379d = bundle;
        c6025x5a5ef32a.e();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onAddressEntranceTap */
    public void mo88627x67afb4b8() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3;
        gx2.q qVar;
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var == null || (qVar = (activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var).f183309J) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, true, null, false, new ia2.j(activityC13656x51707ca3), 6, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79.Companion.m88644x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f371488f = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23922xf4e16628(m137983x3b5b91dc2, null, 2, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc3 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc3, "getBinaryMessenger(...)");
        this.f371489g = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23936xb436cdb0(m137983x3b5b91dc3, null, 2, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onChangeFavoriteState */
    public void mo88628x68399e26(boolean z17) {
        android.content.Intent intent;
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var;
            activityC13656x51707ca3.A = z17;
            activityC13656x51707ca3.B = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.la) ((o72.a5) i95.n0.c(o72.a5.class))).wi(activityC13656x51707ca3.k7());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "doFavorite favId=" + activityC13656x51707ca3.B + ", isFavorite=" + activityC13656x51707ca3.A);
            if (!activityC13656x51707ca3.A) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53 c5296x2dd9a53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53();
                int i17 = activityC13656x51707ca3.B;
                am.w3 w3Var = c5296x2dd9a53.f135617g;
                w3Var.f89792b = i17;
                w3Var.f89793c = 9;
                w3Var.f89794d = "";
                c5296x2dd9a53.e();
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("kfavorite", true);
            r45.f96 f96Var = activityC13656x51707ca3.f183317x;
            if (f96Var != null) {
                java.lang.String m75945x2fec8307 = f96Var.m75945x2fec8307(3);
                intent2.putExtra("kPoiName", m75945x2fec8307 != null ? m75945x2fec8307 : "");
                intent2.putExtra("kwebmap_slat", f96Var.m75938x746dc8a6(1));
                intent2.putExtra("kwebmap_lng", f96Var.m75938x746dc8a6(0));
                intent2.putExtra("Kwebmap_locaion", f96Var.m75945x2fec8307(4));
                intent2.putExtra("kPoiid", f96Var.m75945x2fec8307(5));
                intent2.putExtra("KIsFromPoiList", f96Var.m75933x41a8a7f2(16));
                intent2.putExtra("KPoiCategoryTips", f96Var.m75945x2fec8307(17));
                intent2.putExtra("kPoiBusinessHour", f96Var.m75945x2fec8307(18));
                intent2.putExtra("KPoiPhone", f96Var.m75945x2fec8307(19));
                intent2.putExtra("KPoiPriceTips", f96Var.m75938x746dc8a6(20));
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13656x51707ca3.mo55332x76847179();
            if (mo55332x76847179 != null && (intent = mo55332x76847179.getIntent()) != null) {
                java.lang.String stringExtra = intent.getStringExtra("kBuildingID");
                if (stringExtra != null) {
                    intent2.putExtra("kBuildingID", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("kFloorName");
                if (stringExtra2 != null) {
                    intent2.putExtra("kFloorName", stringExtra2);
                }
                java.lang.String stringExtra3 = intent.getStringExtra("kRemark");
                if (stringExtra3 != null) {
                    intent2.putExtra("kRemark", stringExtra3);
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.l(c5303xc75d2f73, intent2);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            r45.bq0 bq0Var = c4Var.f87848a;
            r45.jq0 jq0Var = bq0Var != null ? bq0Var.f452495d : null;
            if (jq0Var != null) {
                jq0Var.i(activityC13656x51707ca3.k7());
            }
            c4Var.f87856i = activityC13656x51707ca3.mo55332x76847179();
            c4Var.f87860m = 42;
            c5303xc75d2f73.e();
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onChangeScrollState */
    public void mo88629x5a6157d5(boolean z17) {
        this.f371490h = z17;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79.Companion.m88644x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f371488f = null;
        this.f371489g = null;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onETATap */
    public void mo88630x400cd770(java.lang.String weAppId, java.lang.String weAppUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppId, "weAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppUrl, "weAppUrl");
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var != null) {
            z80.r0 r0Var = new z80.r0(weAppId, weAppUrl, 1146);
            z80.l0 l0Var = (z80.l0) i95.n0.c(z80.l0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var).mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ((y80.a1) l0Var).wi(mo55332x76847179, r0Var);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onFeedExpose */
    public void mo88631xbdb41641(long j17, long j18, long j19, long j27, boolean z17, double d17, double d18, double d19, double d27) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95;
        long j28;
        long j29;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 g17 = g((int) j19, (int) j27);
        long d28 = d(j17, j18, j19, j27);
        if (d28 >= g17.m56387xe6796cde().size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "onFeedExpose - indexInTotalList:" + d28 + " is out of range:" + g17.m56387xe6796cde().size());
            return;
        }
        int i17 = (int) d28;
        java.lang.Object obj = g17.m56387xe6796cde().get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "cannot get feed at indexInTotalList: " + d28 + ", sectionIndex: " + j18 + ", tabIndex: " + j19);
            return;
        }
        java.util.Map map = this.f371496q;
        if (z17) {
            c13879x1453fa95 = g17;
        } else {
            c13879x1453fa95 = g17;
            map.put(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        ia2.r0[] r0VarArr = ia2.r0.f371509d;
        int i18 = z17 ? 0 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "reportFlowExpose, itemIndex: " + j17 + ", sectionIndex: " + j18 + ", indexInTotalList:" + d28 + " tabIndex: " + j19 + ", isEnd: " + z17);
        if (z17) {
            java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            if (l17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "feed at itemIndex: " + j17 + ", sectionIndex: " + j18 + ", indexInTotalList:" + d28 + " tabIndex: " + j19 + " has no expose timestamp!");
                return;
            }
            j28 = l17.longValue();
            map.remove(java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            j29 = java.lang.System.currentTimeMillis();
        } else {
            j28 = 0;
            j29 = 0;
        }
        r45.qt2 c17 = c();
        if (c17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 f5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5(abstractC14490x69736cb5.mo2128x1ed62e84(), j28, abstractC14490x69736cb5.getFeedObject());
        f5Var.f206564i = j29;
        f5Var.f206562g = new in5.v0((int) d17, (int) d19, (int) d27);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r0.f206812q.d(c17, f5Var, abstractC14490x69736cb5.getUdfKv(), !z17);
        r45.ni4 ni4Var = new r45.ni4();
        ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
        ni4Var.set(6, java.lang.Integer.valueOf(i17));
        ni4Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), null, c17.m75939xb282bd08(5)));
        ni4Var.set(11, java.lang.Integer.valueOf(i18));
        ni4Var.set(5, java.lang.Integer.valueOf((int) (j29 - j28)));
        so2.h3 h3Var = so2.h3.f491925d;
        h3Var.f(ni4Var, c17.m75939xb282bd08(5), c17.m75939xb282bd08(7));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ni4Var);
        h3Var.d(linkedList);
        java.lang.Object obj2 = c13879x1453fa95.m56387xe6796cde().get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2 : null;
        if (abstractC14490x69736cb52 == null || !zl2.q4.f555466a.C(abstractC14490x69736cb52)) {
            return;
        }
        i95.m c18 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb.E9((zy2.zb) c18, abstractC14490x69736cb52, ml2.x1.f409735f, java.lang.String.valueOf(this.f371486d), a(), null, 0, 48, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onFeedTap */
    public void mo88632x15791646(long j17, long j18, long j19, long j27, java.lang.String visibleCellsInfoJSON) {
        java.lang.String str;
        so2.j5 j5Var;
        java.lang.String str2;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa95;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var;
        java.lang.String str3;
        r45.jq4 jq4Var;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var2;
        so2.j5 j5Var2;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        java.lang.String m59273x80025a04;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibleCellsInfoJSON, "visibleCellsInfoJSON");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 g17 = g((int) j19, (int) j27);
        long d17 = d(j17, j18, j19, j27);
        if (d17 >= g17.m56387xe6796cde().size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "indexInTotalList:" + d17 + " is out of range");
            return;
        }
        int i19 = (int) d17;
        so2.j5 j5Var3 = (so2.j5) g17.m56387xe6796cde().get(i19);
        if (!(j5Var3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "feed is not a BaseFinderFeed");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "onFeedTap, itemIndex: " + j17 + ", sectionIndex: " + j18 + ", indexInTotalList:" + d17 + ", tabIndex: " + j19);
        r45.qt2 c17 = c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0 l0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a;
        if (c17 != null) {
            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var3;
            str = "getService(...)";
            str2 = "FinderPOIPlugin";
            i17 = i19;
            c13879x1453fa95 = g17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18, c17, abstractC14490x69736cb5.getFeedObject().m59251x5db1b11(), abstractC14490x69736cb5.w(), null, 0, null, 0L, visibleCellsInfoJSON, 120, null);
            l0Var = l0Var3;
            j5Var = j5Var3;
            l0Var.b(c17, j5Var, 18);
        } else {
            str = "getService(...)";
            j5Var = j5Var3;
            str2 = "FinderPOIPlugin";
            i17 = i19;
            c13879x1453fa95 = g17;
            l0Var = l0Var3;
        }
        boolean z17 = ((java.lang.Number) ae2.in.f85221a.s().r()).intValue() == 1 && !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
        boolean C = zl2.q4.f555466a.C(abstractC14490x69736cb52);
        int i27 = this.f371486d;
        r9 = null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = null;
        str3 = "";
        if (!C || z17) {
            r45.dm2 m76806xdef68064 = abstractC14490x69736cb52.getFeedObject().getFeedObject().m76806xdef68064();
            if (m76806xdef68064 != null && (jq4Var = (r45.jq4) m76806xdef68064.m75936x14adae67(54)) != null) {
                java.lang.String m75945x2fec8307 = jq4Var.m75945x2fec8307(0);
                f(m75945x2fec8307 != null ? m75945x2fec8307 : "", jq4Var.m75939xb282bd08(1));
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 c13879x1453fa952 = c13879x1453fa95;
            r45.f96 f96Var = c13879x1453fa952.f189068e;
            intent.putExtra("key_location", f96Var != null ? f96Var.mo14344x5f01b1f6() : null);
            intent.putExtra("key_from_type", zy2.o9.f559049d);
            intent.putExtra("key_from_scene", c13879x1453fa952.f189070g);
            intent.putExtra("key_tab_id", c13879x1453fa952.f189071h);
            intent.putExtra("key_enable_mixed_timeline_with_liveroom", z17);
            java.lang.String stringExtra = intent.getStringExtra("key_extra_info");
            str3 = stringExtra != null ? stringExtra : "";
            org.json.JSONObject jSONObject = str3.length() > 0 ? new org.json.JSONObject(str3) : new org.json.JSONObject();
            jSONObject.put("ref_commentscene", i27);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            intent.putExtra("key_extra_info", r26.i0.t(jSONObject2, ",", ";", false));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56348xdbd6b4a2(c13879x1453fa952, intent, i17, null, 4, null);
            if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Xk(activityC0065xcd7aa112, intent);
                return;
            }
            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
            ia2.f0 f0Var = new ia2.f0(activityC0065xcd7aa112, intent);
            ((vd0.j2) q1Var).getClass();
            v24.o0.h(activityC0065xcd7aa112, 34359738368L, null, f0Var, 3);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(abstractC14490x69736cb52.getFeedObject().m59299x6bf53a6c(), xy2.c.e(activityC0065xcd7aa112))) {
            i95.m c19 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            java.lang.String str5 = str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, str5);
            c61.ub ubVar = (c61.ub) c19;
            long m59251x5db1b11 = abstractC14490x69736cb52.getFeedObject().m59251x5db1b11();
            java.lang.String m59276x6c285d75 = abstractC14490x69736cb52.getFeedObject().m59276x6c285d75();
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb52.getFeedObject().m59258xd0557130();
            if (m59258xd0557130 == null) {
                m59258xd0557130 = new r45.nw1();
            }
            str4 = str5;
            i18 = i27;
            l0Var2 = l0Var;
            j5Var2 = j5Var;
            c61.ub.Rf(ubVar, activityC0065xcd7aa112, m59251x5db1b11, m59276x6c285d75, m59258xd0557130, null, null, null, null, abstractC14490x69736cb52.g0(), null, null, 1776, null);
        } else {
            i18 = i27;
            l0Var2 = l0Var;
            j5Var2 = j5Var;
            str4 = str;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(j5Var2);
            android.content.Intent intent2 = new android.content.Intent();
            jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, j5Var2);
            java.util.List list = (java.util.List) Ai.f384366d;
            int intValue = ((java.lang.Number) Ai.f384367e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(i18));
            boolean z18 = j5Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2 : null;
            if (abstractC14490x69736cb53 != null && (feedObject2 = abstractC14490x69736cb53.getFeedObject()) != null && (m59273x80025a04 = feedObject2.m59273x80025a04()) != null) {
                str3 = m59273x80025a04;
            }
            y74Var.set(2, str3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb54 = z18 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2 : null;
            if (abstractC14490x69736cb54 != null && (feedObject = abstractC14490x69736cb54.getFeedObject()) != null) {
                c19792x256d2725 = feedObject.getFeedObject();
            }
            y74Var.set(5, c19792x256d2725);
            wk0Var.set(6, y74Var);
            java.lang.String a17 = a();
            i95.m c27 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, str4);
            zy2.zb.s3((zy2.zb) c27, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2, -1L, ml2.x1.f409740n, java.lang.String.valueOf(i18), a17, null, 32, null);
            intent2.putExtra("key_chnl_extra", a17);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(activityC0065xcd7aa112, intent2, list, intValue, wk0Var, null);
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        i95.m c28 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, str4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.wj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c28, V6, j5Var2.mo2128x1ed62e84(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var2).w(), null, 0, null, 0L, visibleCellsInfoJSON, 120, null);
        l0Var2.b(V6, j5Var2, 18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onGridItemClick return for live feed, commentScene:" + i18);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onFlutterUIParamUpdate */
    public void mo88633x74964a65(long j17, double d17) {
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "onFlutterUIParamUpdate: " + j17 + ", " + d17);
            long raw = (long) com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23965x92b5c493.f42664xb6532c8c.getRaw();
            p3325xe03a0797.p3326xc267989b.y0 y0Var = activityC13656x51707ca3.f183312p1;
            if (j17 == raw) {
                if (activityC13656x51707ca3.D) {
                    return;
                }
                ia2.k kVar = new ia2.k(activityC13656x51707ca3, d17);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = activityC13656x51707ca3.f183319x1;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                activityC13656x51707ca3.f183319x1 = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ia2.d0(activityC13656x51707ca3, d17, kVar, null), 3, null);
                return;
            }
            if (j17 != com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23965x92b5c493.f42663x9f4fc51d.getRaw() || activityC13656x51707ca3.C) {
                return;
            }
            ia2.l lVar = new ia2.l(activityC13656x51707ca3, d17);
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = activityC13656x51707ca3.f183322y1;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            activityC13656x51707ca3.f183322y1 = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new ia2.c0(activityC13656x51707ca3, d17, lVar, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onForwardButtonTap */
    public void mo88634x18ea09cb() {
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onMpFeedTap */
    public void mo88635xbadccee3(long j17, long j18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.content.Context context = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (context == null) {
            return;
        }
        int i17 = (int) j18;
        bw5.sf sfVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? null : bw5.sf.FinderFeedTabTypeCount : bw5.sf.FinderFeedTabTypeLatest : bw5.sf.FinderFeedTabTypeRecommend;
        if (sfVar == null) {
            return;
        }
        java.util.Map map = this.f371500u;
        if (map.size() > j18) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(sfVar);
            if (list == null || list.size() <= j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPOIPlugin", "onFeedTapItemIndex not found");
                return;
            }
            bw5.li0 li0Var = (bw5.li0) list.get((int) j17);
            boolean z17 = li0Var.f111330f[2];
            bw5.dr drVar = bw5.dr.FinderMpFeedTypeEntry;
            if ((z17 ? li0Var.f111329e : drVar) != drVar) {
                if (z17) {
                    drVar = li0Var.f111329e;
                }
                if (drVar == bw5.dr.FinderMpFeedTypeNewPublished) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "onFeedTapItemIndex new published");
                    str = li0Var.f111330f[1] ? li0Var.f111328d : "";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getFeedUrl(...)");
                    f(str, 0);
                    return;
                }
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            tk.t tVar = tk.u.f501404e;
            jSONObject.put("mpPublishAction", 2);
            jSONObject.put("publishScene", "poi");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, wc1.o.f77343x366c91de);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            r45.f96 f96Var = this.f371498s;
            if (f96Var == null || (str2 = f96Var.m75945x2fec8307(3)) == null) {
                str2 = "";
            }
            jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str2);
            r45.f96 f96Var2 = this.f371498s;
            if (f96Var2 == null || (str3 = f96Var2.m75945x2fec8307(4)) == null) {
                str3 = "";
            }
            jSONObject4.put("address", str3);
            r45.f96 f96Var3 = this.f371498s;
            jSONObject4.put("longitude", f96Var3 != null ? java.lang.Float.valueOf(f96Var3.m75938x746dc8a6(0)) : "");
            r45.f96 f96Var4 = this.f371498s;
            jSONObject4.put("latitude", f96Var4 != null ? java.lang.Float.valueOf(f96Var4.m75938x746dc8a6(1)) : "");
            r45.f96 f96Var5 = this.f371498s;
            java.lang.String m75945x2fec8307 = f96Var5 != null ? f96Var5.m75945x2fec8307(5) : null;
            str = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            this.f371499t = str;
            if (r26.i0.y(str, "nearby_", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "onFeedTapItemIndex nearby address.");
                r26.i0.x(this.f371499t, "nearby_", "qqmap_", false, 4, null);
                this.f371499t = r26.i0.x(this.f371499t, "nearby_", "qqmap_", false, 4, null);
            } else if (r26.i0.A(this.f371499t, "UgcPoiEx_", false, 2, null)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "onFeedTapItemIndex self defined address.");
                this.f371499t = r26.i0.x(this.f371499t, "UgcPoiEx_", "qqmap_", false, 4, null);
            }
            jSONObject4.put("poiid", this.f371499t);
            jSONObject3.put("poiInfo", jSONObject4);
            jSONObject2.put("nativeExtraData", jSONObject3);
            jSONObject.put("weAppParam", jSONObject2);
            tk.q qVar = (tk.q) i95.n0.c(tk.q.class);
            if (qVar != null) {
                ((ox.o) qVar).Di(context, jSONObject, null, new ia2.g0(this));
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onNavigateButtonTap */
    public void mo88636xf0757081() {
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var;
            p3325xe03a0797.p3326xc267989b.l.d(activityC13656x51707ca3.f183312p1, null, null, new ia2.m(activityC13656x51707ca3, null), 3, null);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onRequestPOIStream */
    public void mo88637xf82adc9a(long j17, long j18, boolean z17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13879x1453fa95 g17 = g((int) j17, (int) j18);
        java.lang.String str = z17 ? "FirstPage" : "NextPage";
        if (g17.f189078r) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23920x7709af6c("POIStream" + str + "Error", "isRequesting", null, 4, null)))));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPOIPlugin", "POIStream - start requesting " + str + ". tabIndex:" + j17 + ", filterIndex:" + j18);
        ia2.j0 j0Var = this.f371501v;
        g17.m56132x100e954(j0Var);
        g17.m56119x39289cd(j0Var);
        g17.m56119x39289cd(new ia2.i0(callback, str, g17));
        if (z17) {
            g17.mo56155xd210094c();
        } else {
            g17.mo55589x84fe90a(true);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onTakeCarButtonTap */
    public void mo88638x24a053c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3;
        r45.f96 f96Var;
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var == null || (f96Var = (activityC13656x51707ca3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var).f183317x) == null) {
            return;
        }
        java.lang.String m75945x2fec8307 = f96Var.m75945x2fec8307(5);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        java.lang.String m75945x2fec83072 = f96Var.m75945x2fec8307(3);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        boolean m75933x41a8a7f2 = f96Var.m75933x41a8a7f2(16);
        float m75938x746dc8a6 = f96Var.m75938x746dc8a6(0);
        float m75938x746dc8a62 = f96Var.m75938x746dc8a6(1);
        boolean z17 = activityC13656x51707ca3.f183310l1;
        z80.o0 o0Var2 = (z80.o0) i95.n0.c(z80.o0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13656x51707ca3.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        y80.r1 r1Var = (y80.r1) o0Var2;
        r1Var.getClass();
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        java.lang.String str = r1Var.f541462d;
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "jumpTakeCar: failed");
        } else {
            r45.aq aqVar = new r45.aq();
            aqVar.f451715e = "wx65cc950f42e8fff1";
            aqVar.f451717g = "";
            aqVar.f451714d = "gh_ad64296dc8bd@app";
            aqVar.f451719i = "modules/aggretakecar/pages/tripdetail/tripdetail.html?from=locationnew";
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = aqVar.f451715e;
            b1Var.f398545a = aqVar.f451714d;
            b1Var.f398549c = 0;
            b1Var.f398551d = aqVar.f451720m;
            b1Var.f398555f = aqVar.f451719i;
            b1Var.f398565k = 1146;
            l81.d1 d1Var = new l81.d1();
            d1Var.f398585d = m75938x746dc8a62;
            d1Var.f398586e = m75938x746dc8a6;
            d1Var.f398590i = c01.id.a();
            d1Var.f398588g = "";
            d1Var.f398589h = "";
            d1Var.f398587f = m75945x2fec83072;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307) && m75933x41a8a7f2 && !z17) {
                d1Var.f398591m = m75945x2fec8307;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "openAppBrand,versionType：%s extra data: %s. poiId:%s isFromPoiList:%s", 0, d1Var.a(), m75945x2fec8307, java.lang.Boolean.valueOf(m75933x41a8a7f2));
            b1Var.f398561i = d1Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 20, b1Var.f398547b, "", m75945x2fec8307);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(mo55332x76847179, b1Var);
        }
        yz5.a aVar = activityC13656x51707ca3.R;
        if (aVar != null) {
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: onWaServiceTap */
    public void mo88639x83820a97(java.lang.String weAppId, java.lang.String weAppUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppId, "weAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppUrl, "weAppUrl");
        ia2.o0 o0Var = (ia2.o0) this.f371492m.get();
        if (o0Var != null) {
            z80.r0 r0Var = new z80.r0(weAppId, weAppUrl, 1430);
            z80.l0 l0Var = (z80.l0) i95.n0.c(z80.l0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3) o0Var).mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            ((y80.a1) l0Var).wi(mo55332x76847179, r0Var);
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: showSuccessToast */
    public void mo88640x860c8b81(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC0065xcd7aa112);
        e4Var.f293309c = msg;
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.c();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: showTextToast */
    public void mo88641x9b50e67d(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC0065xcd7aa112);
        e4Var.f293309c = message;
        e4Var.c();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23943x3e615b79
    /* renamed from: showTipsDialog */
    public void mo88642x904bd17d(java.lang.String message, java.lang.String btnWording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btnWording, "btnWording");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) this.f371491i.get();
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC0065xcd7aa112);
        u1Var.g(message);
        u1Var.n(btnWording);
        u1Var.l(ia2.m0.f371484a);
        u1Var.q(false);
    }
}
