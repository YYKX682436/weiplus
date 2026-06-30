package qi5;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f445343d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f445344e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f445345f;

    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f445343d = activity;
        jz5.h.b(qi5.a.f445327d);
        this.f445344e = new java.util.ArrayList();
        this.f445345f = kz5.p0.f395529d;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        j75.f m67437x4bd5310;
        wi5.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        java.util.ArrayList arrayList = this.f445344e;
        int size = arrayList.size();
        int i17 = request.f544677b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f544678c + i17;
            if (size2 > i18) {
                dVar.f544681b = true;
            } else {
                i18 = arrayList.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(arrayList.get(i17));
                i17++;
            }
            java.util.List d17 = g95.x.f351360a.d(kz5.p0.f395529d, arrayList2);
            java.util.Map d18 = d75.b.d(g95.e.f351334a.f(arrayList2), qi5.c.f445342d);
            int d19 = kz5.b1.d(kz5.d0.q(d17, 10));
            if (d19 < 16) {
                d19 = 16;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d19);
            java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                linkedHashMap.put(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) next).h1(), next);
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.LinkedHashMap) d18).get(str);
                if (z3Var == null) {
                    z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(str);
                }
                boolean z17 = linkedHashMap.get(str) != null;
                vi5.a aVar = new vi5.a(z17, z17 ? java.lang.System.currentTimeMillis() : 0L);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Z;
                java.lang.String a17 = hVar.a(str, i19, 0);
                java.lang.String g27 = z3Var.g2();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g27);
                ri5.j jVar = new ri5.j(a17, i19, str, g27, aVar, 0, 32, null);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f445343d;
                if ((activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) && (m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) activityC0065xcd7aa112).m67437x4bd5310()) != null && (n0Var = (wi5.n0) m67437x4bd5310.mo140437x75286adb()) != null) {
                    jVar.f477660x = n0Var.e();
                    java.lang.String str2 = jVar.f477644f;
                    jVar.f477659w = n0Var.f(str2);
                    jVar.f477658v = n0Var.d(str2);
                }
                dVar.f544682c.add(jVar);
            }
        }
        v65.i.b(scope, null, new qi5.b(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.List list;
        java.util.ArrayList arrayList = this.f445344e;
        arrayList.clear();
        android.content.Intent intent = this.f445343d.getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("already_select_contact") : null;
        if (stringExtra != null) {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            list = new java.util.ArrayList();
            for (java.lang.Object obj : f07) {
                if (((java.lang.String) obj).length() > 0) {
                    list.add(obj);
                }
            }
        } else {
            list = kz5.p0.f395529d;
        }
        this.f445345f = list;
        if (list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Forward.ClawBotDataSource", "onCreate no clawbot usernames provided");
            return;
        }
        jz5.g gVar = px.g.f440280a;
        java.util.List usernames = this.f445345f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernames, "usernames");
        arrayList.addAll(kz5.n0.F0(usernames, px.f.f440279d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Forward.ClawBotDataSource", "onCreate clawBotConversationListSize=" + arrayList.size());
    }
}
