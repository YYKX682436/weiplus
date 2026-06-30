package he5;

/* loaded from: classes9.dex */
public class r implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f362508a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362509b;

    /* renamed from: c, reason: collision with root package name */
    public int f362510c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362511d;

    /* renamed from: e, reason: collision with root package name */
    public final he5.q f362512e;

    /* renamed from: f, reason: collision with root package name */
    public long f362513f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f362514g = new java.util.ArrayList();

    public r(java.lang.String str, int i17, int i18, hd5.n nVar, he5.q qVar) {
        this.f362509b = str;
        this.f362510c = i17;
        this.f362511d = i18;
        this.f362512e = qVar;
    }

    @Override // he5.t
    public int a() {
        return this.f362511d;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        list.addAll(this.f362514g);
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        java.lang.String str = this.f362509b;
        this.f362513f = x4Var.m0(str);
        int i17 = this.f362510c;
        he5.q qVar = this.f362512e;
        if (i17 < ((ke5.b0) qVar).a() * 3) {
            this.f362510c = ((ke5.b0) qVar).a() * 3;
        }
        android.database.Cursor M4 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M4(str, this.f362510c, this.f362513f);
        this.f362508a = M4;
        java.util.List list = this.f362514g;
        try {
            M4.moveToFirst();
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
            while (!this.f362508a.isAfterLast()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var2.mo9015xbf5d97fd(this.f362508a);
                ((java.util.ArrayList) list).add(f9Var2);
                this.f362508a.moveToNext();
                if (f9Var != null) {
                    ((ke5.b0) qVar).b(f9Var, f9Var2);
                }
                f9Var = f9Var2;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLoader.ChattingServiceNotifyDataSource", e17, "", new java.lang.Object[0]);
        }
        oVar.mo133232x338af3();
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
        this.f362508a.close();
    }

    @Override // he5.t
    public long d() {
        return this.f362513f;
    }
}
