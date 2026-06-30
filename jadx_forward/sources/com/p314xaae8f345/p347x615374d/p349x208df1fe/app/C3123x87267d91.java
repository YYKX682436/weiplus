package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaCacheStg */
/* loaded from: classes12.dex */
public class C3123x87267d91 extends l75.n0 {

    /* renamed from: SQL_CREATE */
    public static final java.lang.String[] f11966xcb8b0ad = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908.f11965x3164ae, "KindaCacheTable")};

    /* renamed from: TABLE_NAME */
    public static final java.lang.String f11967xc4fe047c = "KindaCacheTable";
    public static final java.lang.String TAG = "MicroMsg.KindaCacheStg";

    /* renamed from: db, reason: collision with root package name */
    private l75.k0 f127486db;

    public C3123x87267d91(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908.f11965x3164ae, "KindaCacheTable", null);
        this.f127486db = k0Var;
    }

    public com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 get(java.lang.String str) {
        android.database.Cursor B = this.f127486db.B("select * from KindaCacheTable where key=?", new java.lang.String[]{str});
        if (B == null) {
            return null;
        }
        if (B.getCount() == 0) {
            B.close();
            return null;
        }
        B.moveToFirst();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 c3122x5da4a908 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908();
        c3122x5da4a908.mo9015xbf5d97fd(B);
        B.close();
        return c3122x5da4a908;
    }

    /* renamed from: save */
    public void m25113x35c17d(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3122x5da4a908 c3122x5da4a908) {
        super.mo11260x413cb2b4(c3122x5da4a908);
    }
}
