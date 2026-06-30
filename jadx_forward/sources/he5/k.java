package he5;

/* loaded from: classes9.dex */
public final class k implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362478a;

    /* renamed from: b, reason: collision with root package name */
    public final long f362479b;

    /* renamed from: c, reason: collision with root package name */
    public final long f362480c;

    /* renamed from: d, reason: collision with root package name */
    public android.database.Cursor f362481d;

    public k(java.lang.String talker, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f362478a = talker;
        this.f362479b = j17;
        this.f362480c = j18;
    }

    @Override // he5.t
    public int a() {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).j7(this.f362478a);
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        android.database.Cursor cursor;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(success, "success");
        try {
            cursor = this.f362481d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLoader.ChattingSearchDataSource", e17, "", new java.lang.Object[0]);
        }
        if (cursor == null) {
            return;
        }
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.mo9015xbf5d97fd(cursor);
            list.add(f9Var);
            cursor.moveToNext();
        }
        ((hd5.f) success).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(this.f362478a);
        android.database.Cursor V2 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).V2(this.f362478a, java.lang.Math.max(m07, this.f362479b), this.f362480c);
        this.f362481d = V2;
        if (V2 != null) {
            V2.moveToFirst();
        }
        if (oVar != null) {
            oVar.mo133232x338af3();
        }
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
        android.database.Cursor cursor = this.f362481d;
        if (cursor != null) {
            cursor.close();
        }
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}
