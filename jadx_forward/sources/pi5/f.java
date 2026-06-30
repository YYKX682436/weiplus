package pi5;

/* loaded from: classes.dex */
public final class f extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f436375d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f436376e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f436377f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f436378g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f436379h;

    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, java.lang.String chatroom, java.lang.String recentAtDisplay) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recentAtDisplay, "recentAtDisplay");
        this.f436375d = activity;
        this.f436376e = chatroom;
        this.f436377f = recentAtDisplay;
        this.f436379h = new java.util.LinkedList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0120, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.coroutines.Continuation, java.lang.Object, kotlinx.coroutines.a1] */
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i r32, ym3.c r33) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi5.f.a(v65.i, ym3.c):kotlinx.coroutines.flow.j");
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return -2;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.Collection K0;
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = this.f436376e;
        this.f436378g = a17.z0(str);
        ((qd0.c) ((rd0.s0) i95.n0.c(rd0.s0.class))).getClass();
        if (str == null || r26.n0.N(str)) {
            K0 = kz5.p0.f395529d;
        } else {
            g15.b a18 = ti3.c.f501112a.a(str);
            if (a18 == null) {
                a18 = new g15.b();
            }
            java.util.LinkedList n17 = a18.n();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(n17, "<this>");
            java.util.Collections.reverse(n17);
            java.util.Iterator it = n17.iterator();
            while (it.hasNext()) {
                java.util.Iterator it6 = ((g15.c) it.next()).j().iterator();
                while (it6.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it6.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(str2);
                    linkedHashMap.put(str2, java.lang.Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            java.util.List v17 = kz5.e1.v(linkedHashMap);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : v17) {
                if (1 <= ((java.lang.Number) ((jz5.l) obj).f384367e).intValue()) {
                    arrayList.add(obj);
                }
            }
            java.util.List F0 = kz5.n0.F0(arrayList, new qd0.a());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(F0, 10));
            java.util.Iterator it7 = F0.iterator();
            while (it7.hasNext()) {
                arrayList2.add((java.lang.String) ((jz5.l) it7.next()).f384366d);
            }
            K0 = kz5.n0.K0(arrayList2, 3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeoneRecentFeatureService", "getAtSomeoneRecent: ".concat(kz5.n0.g0(K0, ", ", null, null, 0, null, null, 62, null)));
        }
        this.f436379h = new java.util.LinkedList(K0);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(this.f436379h);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        this.f436379h.clear();
        java.util.List<java.lang.String> m17 = c01.v1.m(str);
        if (m17 != null) {
            for (java.lang.String str3 : m17) {
                java.util.Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it8.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str4)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                        linkedHashMap2.put(str4, java.lang.Boolean.TRUE);
                    }
                }
            }
        }
        java.util.Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            java.lang.String str5 = (java.lang.String) it9.next();
            if (linkedHashMap2.get(str5) != null) {
                java.lang.Object obj2 = linkedHashMap2.get(str5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                if (((java.lang.Boolean) obj2).booleanValue()) {
                    this.f436379h.add(str5);
                }
            }
        }
    }
}
