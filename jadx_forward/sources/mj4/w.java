package mj4;

/* loaded from: classes9.dex */
public final class w extends rj4.h {
    public static final l75.e0 Q = rj4.h.m162525x3593deb(rj4.h.class);
    public pj4.b0 P;

    @Override // rj4.h, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 _dbInfo = Q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(_dbInfo, "_dbInfo");
        return _dbInfo;
    }

    public final pj4.b0 t0() {
        java.lang.String str = this.f76646x287b39eb;
        boolean z17 = true;
        if (str != null && str.hashCode() == 0) {
            return this.P;
        }
        java.lang.String str2 = this.f76646x287b39eb;
        if (str2 != null && !r26.n0.N(str2)) {
            z17 = false;
        }
        if (z17) {
            return null;
        }
        pj4.b0 b0Var = new pj4.b0();
        try {
            b0Var.mo11468x92b714fd(android.util.Base64.decode(str2, 0));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.TextStatusStrangerContact", th6, "getStatus err", new java.lang.Object[0]);
        }
        this.P = b0Var;
        return b0Var;
    }
}
