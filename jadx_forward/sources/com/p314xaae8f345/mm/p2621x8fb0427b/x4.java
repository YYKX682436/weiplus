package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class x4 extends l75.s0 implements xg3.x {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f277858f = {"CREATE TABLE IF NOT EXISTS DeletedConversationInfo ( userName TEXT  PRIMARY KEY , lastSeq LONG  , reserved1 INT  , reserved2 LONG  , reserved3 TEXT  ) ", "CREATE INDEX IF NOT EXISTS createTimeIndex  ON DeletedConversationInfo ( reserved2 )"};

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f277859d = new jt0.j(50);

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f277860e;

    public x4(l75.k0 k0Var) {
        this.f277860e = k0Var;
    }

    public long m0(java.lang.String str) {
        if (str == null) {
            return 0L;
        }
        kk.j jVar = this.f277859d;
        java.lang.Long l17 = (java.lang.Long) ((lt0.f) jVar).get(str);
        if (l17 != null) {
            return l17.longValue();
        }
        long s07 = s0("SELECT max(reserved2) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new java.lang.String[]{str});
        long j17 = s07 != com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 ? s07 : 0L;
        ((lt0.f) jVar).put(str, java.lang.Long.valueOf(j17));
        return j17;
    }

    public boolean n0() {
        return s0("SELECT reserved2 FROM DeletedConversationInfo WHERE reserved2 > 0 LIMIT 1", null) > 0;
    }

    public final long s0(java.lang.String str, java.lang.String[] strArr) {
        try {
            android.database.Cursor B = this.f277860e.B(str, strArr);
            if (B == null) {
                return 0L;
            }
            long j17 = B.moveToFirst() ? B.getLong(0) : 0L;
            B.close();
            return j17;
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26958x769a621 unused) {
            return 0L;
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeletedConversationInfoStorage", e17, "longForQuery failed", new java.lang.Object[0]);
            return 0L;
        }
    }

    public boolean u0(java.lang.String str, long j17) {
        l75.k0 k0Var = this.f277860e;
        try {
            try {
                k0Var.b();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("reserved2", java.lang.Long.valueOf(j17));
                if (!(k0Var.p("DeletedConversationInfo", contentValues, "userName=?", new java.lang.String[]{str}) > 0)) {
                    contentValues.put("userName", str);
                    contentValues.put("lastSeq", (java.lang.Integer) 0);
                    contentValues.put("reserved2", java.lang.Long.valueOf(j17));
                    k0Var.m("DeletedConversationInfo", "userName", contentValues);
                }
                kk.j jVar = this.f277859d;
                if (str == null || !str.isEmpty()) {
                    ((lt0.f) jVar).put(str, java.lang.Long.valueOf(j17));
                } else {
                    ((lt0.f) jVar).mo143584x5a5b64d();
                }
                k0Var.r();
                if (k0Var.mo123783xb9a70294() && k0Var.G()) {
                    k0Var.t();
                }
                mo145247xf35bbb4(str);
                return true;
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeletedConversationInfoStorage", e17, "replaceCreateTime failed", new java.lang.Object[0]);
                if (k0Var.mo123783xb9a70294() && k0Var.G()) {
                    k0Var.t();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (k0Var.mo123783xb9a70294() && k0Var.G()) {
                k0Var.t();
            }
            throw th6;
        }
    }

    public boolean y0(java.lang.String str, long j17) {
        if (str == null) {
            return false;
        }
        l75.k0 k0Var = this.f277860e;
        try {
            try {
                k0Var.b();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("lastSeq", java.lang.Long.valueOf(j17));
                if (!(k0Var.p("DeletedConversationInfo", contentValues, "userName=?", new java.lang.String[]{str}) > 0)) {
                    contentValues.put("userName", str);
                    contentValues.put("lastSeq", java.lang.Long.valueOf(j17));
                    contentValues.put("reserved2", (java.lang.Integer) 0);
                    k0Var.m("DeletedConversationInfo", "userName", contentValues);
                }
                k0Var.r();
                if (k0Var.G()) {
                    k0Var.t();
                }
                mo145247xf35bbb4(str);
                return true;
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DeletedConversationInfoStorage", e17, "replaceLastSeq failed", new java.lang.Object[0]);
                if (k0Var.G()) {
                    k0Var.t();
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (k0Var.G()) {
                k0Var.t();
            }
            throw th6;
        }
    }
}
