package he5;

/* loaded from: classes9.dex */
public class j implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f362471a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362473c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362474d;

    /* renamed from: e, reason: collision with root package name */
    public final long f362475e;

    public j(java.lang.String str, int i17, int i18, long j17) {
        this.f362472b = str;
        this.f362473c = i17;
        this.f362474d = i18;
        this.f362475e = j17;
    }

    @Override // he5.t
    public int a() {
        return this.f362474d;
    }

    @Override // he5.t
    public void b(final java.util.List list, he5.s sVar) {
        sd5.p.a("fillItem", new yz5.a() { // from class: he5.j$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                java.util.List list2 = list;
                he5.j jVar = he5.j.this;
                jVar.getClass();
                java.lang.System.currentTimeMillis();
                try {
                    jVar.f362471a.moveToFirst();
                    while (!jVar.f362471a.isAfterLast()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.mo9015xbf5d97fd(jVar.f362471a);
                        list2.add(f9Var);
                        jVar.f362471a.moveToNext();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLoader.ChattingNormalDataSource", e17, "", new java.lang.Object[0]);
                }
                if (!com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                    return null;
                }
                list2.size();
                java.lang.System.currentTimeMillis();
                return null;
            }
        });
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        xg3.m0 u17 = c01.d9.b().u();
        this.f362471a = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17).M4(this.f362472b, this.f362473c, this.f362475e);
        oVar.mo133232x338af3();
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
        this.f362471a.close();
    }

    @Override // he5.t
    public long d() {
        return this.f362475e;
    }
}
