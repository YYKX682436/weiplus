package nr1;

/* loaded from: classes8.dex */
public final class k extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final nr1.j f420685g = new nr1.j(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f420686h;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f420687d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f420688e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f420689f;

    static {
        l75.e0 e0Var = hr1.m.f364889x;
        f420686h = new java.lang.String[]{l75.n0.m145250x3fdc6f77(hr1.m.f364889x, "BizPhotoFansSessionInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l75.k0 db6) {
        super(db6, hr1.m.f364889x, "BizPhotoFansSessionInfo", dm.f1.f318312n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = hr1.m.f364889x;
        this.f420687d = db6;
        this.f420688e = new java.util.concurrent.ConcurrentHashMap();
        this.f420689f = new java.util.concurrent.ConcurrentHashMap();
    }

    public void D0(hr1.m sessionInfo, int i17, hr1.u source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionInfo, "sessionInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        sessionInfo.f66481x2262335f = i17;
        sessionInfo.f66482xa783a79b = c01.id.c();
        boolean mo55864x413cb2b4 = mo55864x413cb2b4(sessionInfo, false);
        if (mo55864x413cb2b4) {
            this.f420688e.remove(sessionInfo.f66480x114ef53e + '_' + sessionInfo.f66478x1362f030);
            this.f420689f.remove(sessionInfo.f66479xbed8694c);
            mo145247xf35bbb4(sessionInfo.f66479xbed8694c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizPhotoFans.SessionStorage", "[replaceSessionInfo] source=" + source + ", ret=" + mo55864x413cb2b4 + ", sessionId=" + sessionInfo.f66479xbed8694c + ", isGreetSession=" + sessionInfo.f66477xb4776b7c);
    }

    public boolean y0(java.lang.String sessionId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        hr1.m z07 = z0(sessionId);
        this.f420689f.remove(sessionId);
        this.f420688e.remove(z07.f66480x114ef53e + '_' + z07.f66478x1362f030);
        return mo49766xb06685ab(z07, z17, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
    }

    public hr1.m z0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new hr1.m();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f420689f;
        hr1.m mVar = (hr1.m) concurrentHashMap.get(str);
        if (mVar != null) {
            return mVar;
        }
        hr1.m mVar2 = new hr1.m();
        android.database.Cursor B = this.f420687d.B("select * , rowid from BizPhotoFansSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                mVar2.mo9015xbf5d97fd(B);
            }
            vz5.b.a(B, null);
            if (mVar2.f72763xa3c65b86 > 0) {
                concurrentHashMap.put(str, mVar2);
                this.f420688e.put(mVar2.f66480x114ef53e + '_' + mVar2.f66478x1362f030, mVar2);
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
}
