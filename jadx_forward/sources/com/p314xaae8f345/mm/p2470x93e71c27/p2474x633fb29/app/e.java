package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes12.dex */
public class e extends l75.n0 implements lt.g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f270394e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d.f270382y0, "appattach")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f270395f = {"DROP INDEX IF EXISTS statusIndex", "CREATE INDEX IF NOT EXISTS msgInfoIdIndex ON appattach ( msgInfoId )", "CREATE INDEX IF NOT EXISTS appattach_statusIndex ON appattach ( status )"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f270396g = {"CREATE INDEX IF NOT EXISTS msgInfoIdTalkerIndex ON appattach ( msgInfoId,msgInfoTalker ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f270397d;

    public e(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d.f270382y0, "appattach", f270395f);
        this.f270397d = k0Var;
        android.database.Cursor B = k0Var.B("PRAGMA table_info(appattach)", null);
        int columnIndex = B.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        boolean z17 = false;
        while (B.moveToNext()) {
            if (columnIndex >= 0 && "msgInfoTalker".equals(B.getString(columnIndex))) {
                z17 = true;
            }
        }
        B.close();
        long F = gm0.j1.u().f354686f.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachInfoStorage", "it had no [MSGINFOTALKER] column, alter table now: %s", java.lang.Boolean.valueOf(k0Var.A("appattach", "alter table appattach add msgInfoTalker TEXT")));
        }
        if (F > 0) {
            gm0.j1.u().f354686f.w(java.lang.Long.valueOf(F));
        }
        qt0.b.f448024a.b(new qt0.e(k0Var, f270396g, "appattach", null, 0));
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68105x2c1f0acb = str;
        if (!get(dVar, "mediaSvrId") && !get(dVar, "mediaId")) {
            return null;
        }
        java.lang.String str2 = dVar.f68099xfeae815;
        if (str2 != null) {
            if (str2.startsWith(gm0.j1.u().d() + "attachment/")) {
                com.p314xaae8f345.mm.vfs.q7.g(dVar.f68099xfeae815, -1L, 4, false);
            }
        }
        return dVar;
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar.f68106x315a5445 = j17;
        dVar.f68107xaaaa6883 = str;
        if (pt0.p.f439751a1.a("appattach")) {
            if (!get(dVar, "msgInfoId", "msgInfoTalker")) {
                return null;
            }
            java.lang.String str2 = dVar.f68099xfeae815;
            if (str2 != null) {
                if (str2.startsWith(gm0.j1.u().d() + "attachment/")) {
                    com.p314xaae8f345.mm.vfs.q7.g(dVar.f68099xfeae815, -1L, 4, false);
                }
            }
            return dVar;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
        dVar2.f68106x315a5445 = j17;
        if (!get(dVar2, "msgInfoId")) {
            return null;
        }
        java.lang.String str3 = dVar2.f68099xfeae815;
        if (str3 != null) {
            if (str3.startsWith(gm0.j1.u().d() + "attachment/")) {
                com.p314xaae8f345.mm.vfs.q7.g(dVar2.f68099xfeae815, -1L, 4, false);
            }
        }
        return dVar2;
    }

    public android.database.Cursor L0(int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        l75.k0 k0Var = this.f270397d;
        if (!(k0Var instanceof d95.b0)) {
            return null;
        }
        return ((d95.b0) k0Var).P().m107707x66f18c8(false, "appattach", com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d.f270382y0.f398487c, "msgInfoTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", c26987xeef691ab);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        if (dVar != null) {
            pt0.p.G6(dVar.f68106x315a5445, dVar.f68107xaaaa6883);
        }
        return super.mo880xb970c2b9(dVar);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, java.lang.String... strArr) {
        if (dVar != null) {
            pt0.p.G6(dVar.f68106x315a5445, dVar.f68107xaaaa6883);
        }
        boolean mo9952xce0038c9 = super.mo9952xce0038c9(dVar, strArr);
        java.lang.String str = dVar.f68104xaca5bdda;
        return mo9952xce0038c9;
    }

    public void b1(long j17, long j18) {
        this.f270397d.A("appattach", " update appattach set status = " + j18 + " , lastModifyTime = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() + " where rowid = " + j17);
        m145262xf35bbb4();
    }

    public /* bridge */ /* synthetic */ boolean y0(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, java.lang.String[] strArr) {
        return super.mo9951xb06685ab(dVar, strArr);
    }

    public /* bridge */ /* synthetic */ boolean z0(long j17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        return super.get(j17, dVar);
    }
}
