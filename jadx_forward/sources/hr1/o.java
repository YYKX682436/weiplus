package hr1;

/* loaded from: classes8.dex */
public final class o extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final hr1.n f364890g = new hr1.n(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f364891h;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f364892d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f364893e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f364894f;

    static {
        l75.e0 e0Var = hr1.m.f364889x;
        f364891h = new java.lang.String[]{l75.n0.m145250x3fdc6f77(hr1.m.f364889x, "BizFansSessionInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.k0 db6) {
        super(db6, hr1.m.f364889x, "BizFansSessionInfo", dm.f1.f318312n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = hr1.m.f364889x;
        this.f364892d = db6;
        this.f364893e = new java.util.concurrent.ConcurrentHashMap();
        this.f364894f = new java.util.concurrent.ConcurrentHashMap();
    }

    public hr1.m y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new hr1.m();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f364894f;
        hr1.m mVar = (hr1.m) concurrentHashMap.get(str);
        if (mVar != null) {
            return mVar;
        }
        hr1.m mVar2 = new hr1.m();
        android.database.Cursor B = this.f364892d.B("select * , rowid from BizFansSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                mVar2.mo9015xbf5d97fd(B);
            }
            vz5.b.a(B, null);
            if (mVar2.f72763xa3c65b86 > 0) {
                concurrentHashMap.put(str, mVar2);
                this.f364893e.put(mVar2.f66480x114ef53e + '_' + mVar2.f66478x1362f030, mVar2);
            }
            return mVar2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public void z0(hr1.m sessionInfo, int i17, hr1.u source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        sessionInfo.f66481x2262335f = i17;
        sessionInfo.f66482xa783a79b = c01.id.c();
        boolean mo55864x413cb2b4 = mo55864x413cb2b4(sessionInfo, false);
        if (mo55864x413cb2b4) {
            this.f364893e.remove(sessionInfo.f66480x114ef53e + '_' + sessionInfo.f66478x1362f030);
            this.f364894f.remove(sessionInfo.f66479xbed8694c);
            mo145247xf35bbb4(sessionInfo.f66479xbed8694c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.SessionStorage", "[replaceSessionInfo] source=" + source + ", ret=" + mo55864x413cb2b4 + ", sessionId=" + sessionInfo.f66479xbed8694c + ", isGreetSession=" + sessionInfo.f66477xb4776b7c);
    }
}
