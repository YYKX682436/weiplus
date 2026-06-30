package pi5;

/* loaded from: classes.dex */
public final class r extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f436409d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f436410e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f436411f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f436412g;

    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f436409d = activity;
        this.f436410e = new java.util.ArrayList();
        this.f436411f = jz5.h.b(new pi5.q(this));
        this.f436412g = jz5.h.b(new pi5.p(this));
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        jz5.f0 f0Var;
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f436410e;
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
            while (i17 < i18) {
                java.lang.Object obj = arrayList.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                java.lang.String str3 = (java.lang.String) obj;
                ti5.d dVar2 = new ti5.d(null, null, 0, 0, 0, 0, null, false, 223, null);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(str3);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Z;
                ri5.j a17 = ti5.d.f501196i.a(this.f436409d, hVar.a(str3, i19, 0), z3Var, i19, dVar2);
                java.util.ArrayList arrayList2 = (java.util.ArrayList) ((jz5.n) this.f436411f).mo141623x754a37bb();
                jz5.f0 f0Var2 = jz5.f0.f384359a;
                if (arrayList2 == null || (str2 = (java.lang.String) arrayList2.get(i17)) == null) {
                    f0Var = null;
                } else {
                    a17.f477645g = str2;
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomApplicantsDataSource", "nickname of " + str3 + " is null");
                }
                java.util.ArrayList arrayList3 = (java.util.ArrayList) ((jz5.n) this.f436412g).mo141623x754a37bb();
                if (arrayList3 == null || (str = (java.lang.String) arrayList3.get(i17)) == null) {
                    f0Var2 = null;
                } else {
                    a17.E = str;
                }
                if (f0Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomApplicantsDataSource", "avatarUrl of " + str3 + " is null");
                }
                dVar.f544682c.add(a17);
                i17++;
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @Override // ym3.f
    /* renamed from: getPriority */
    public int mo57139x3662b71a() {
        return 1;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.ArrayList arrayList = this.f436410e;
        arrayList.clear();
        java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(this.f436409d.getIntent().getStringExtra("custom_contact"), ",");
        if (O1 != null) {
            java.util.Iterator it = O1.iterator();
            while (it.hasNext()) {
                arrayList.add((java.lang.String) it.next());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomApplicantsDataSource", "usernameList: " + arrayList.size());
    }
}
