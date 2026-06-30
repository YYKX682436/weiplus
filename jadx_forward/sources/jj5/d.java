package jj5;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f381572d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f381573e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f381574f;

    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f381572d = activity;
        jz5.h.b(jj5.a.f381567d);
        this.f381573e = new java.util.ArrayList();
        new java.util.HashSet();
        this.f381574f = new java.util.ArrayList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        ri5.j a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        int size = this.f381573e.size();
        java.util.ArrayList arrayList = dVar.f544682c;
        int i17 = request.f544677b;
        if (i17 < size) {
            int size2 = this.f381573e.size();
            int i18 = request.f544678c + i17;
            if (size2 > i18) {
                dVar.f544681b = true;
            } else {
                i18 = this.f381573e.size();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (i17 < i18) {
                arrayList2.add(this.f381573e.get(i17));
                i17++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectedDataSource", "usernameList=" + arrayList2);
            java.util.Map d17 = d75.b.d(g95.e.f351334a.f(arrayList2), jj5.c.f381571d);
            int i19 = 0;
            for (java.lang.Object obj : arrayList2) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String username = (java.lang.String) obj;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.LinkedHashMap) d17).get(username);
                if (z3Var == null) {
                    z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(username);
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = z3Var;
                vi5.f fVar = new vi5.f(0L, 0L, null, null, 0, 0, false, 60, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                int i28 = ri5.j.f477638J;
                ri5.h hVar = ri5.j.I;
                int i29 = ri5.j.Z;
                java.lang.String d18 = z3Var2.d1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getUsername(...)");
                java.lang.String id6 = hVar.a(d18, i28, 0);
                java.util.Set set = c01.e2.f118650a;
                boolean z17 = set != null && ((java.util.HashSet) set).contains(username);
                vi5.e eVar = vi5.f.f519153h;
                if (z17) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f381572d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                    a17 = eVar.a(activity, id6, z3Var2, i28, fVar, i29);
                    a17.f477662z = true;
                    a17.A = true;
                } else {
                    a17 = eVar.a(this.f381572d, id6, z3Var2, i28, fVar, i29);
                }
                arrayList.add(a17);
                i19 = i27;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectedDataSource", "response.dataList=" + arrayList);
        v65.i.b(scope, null, new jj5.b(b17, dVar, null), 1, null);
        return b17;
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 0;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        this.f381573e.clear();
        this.f381573e = this.f381574f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectedDataSource", "conversationList=" + this.f381573e);
    }
}
