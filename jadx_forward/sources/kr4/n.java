package kr4;

/* loaded from: classes8.dex */
public final class n extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f393051g = {l75.n0.m145250x3fdc6f77(kr4.o.f393055z, "W1wSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f393052d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f393053e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f393054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 db6) {
        super(db6, kr4.o.f393055z, "W1wSessionInfo", dm.xb.f322634o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = kr4.o.f393055z;
        this.f393052d = db6;
        this.f393053e = new java.util.concurrent.ConcurrentHashMap();
        this.f393054f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void D0(java.lang.String sessionId, java.lang.String talkerUserName, java.lang.String selfUserName, int i17, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUserName, "talkerUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUserName, "selfUserName");
        kr4.o oVar = new kr4.o();
        oVar.f69158xbed8694c = sessionId;
        oVar.f69160x3e123854 = talkerUserName;
        oVar.f69161xa783a79b = c01.id.c();
        oVar.f69157x5568d387 = selfUserName;
        oVar.f69159x10a0fed7 = i17;
        oVar.f69155xa5ffa630 = z17;
        oVar.f69156xef647383 = i18;
        if (mo55864x413cb2b4(oVar, false)) {
            this.f393053e.remove(oVar.f69160x3e123854 + '_' + oVar.f69157x5568d387);
            this.f393054f.remove(sessionId);
            mo145247xf35bbb4(oVar.f69158xbed8694c);
        }
    }

    public final kr4.o y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new kr4.o();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f393054f;
        kr4.o oVar = (kr4.o) concurrentHashMap.get(str);
        if (oVar != null) {
            return oVar;
        }
        kr4.o oVar2 = new kr4.o();
        android.database.Cursor B = this.f393052d.B("select * , rowid from W1wSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                oVar2.mo9015xbf5d97fd(B);
            }
            vz5.b.a(B, null);
            if (oVar2.f72763xa3c65b86 > 0) {
                concurrentHashMap.put(str, oVar2);
                this.f393053e.put(oVar2.f69160x3e123854 + '_' + oVar2.f69157x5568d387, oVar2);
            }
            return oVar2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public final java.lang.String z0(java.lang.String str) {
        java.lang.String str2 = y0(str).f69160x3e123854;
        return str2 == null ? "" : str2;
    }
}
