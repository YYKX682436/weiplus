package li4;

/* loaded from: classes10.dex */
public final class d extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f400322g = {l75.n0.m145250x3fdc6f77(hi4.n.F, "TextStatusSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f400323d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f400324e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f400325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, hi4.n.F, "TextStatusSessionInfo", rj4.g.f477864r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = hi4.n.F;
        this.f400323d = db6;
        this.f400324e = new java.util.concurrent.ConcurrentHashMap();
        this.f400325f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final hi4.n y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new hi4.n();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f400325f;
        hi4.n nVar = (hi4.n) concurrentHashMap.get(str);
        if (nVar != null) {
            return nVar;
        }
        hi4.n nVar2 = new hi4.n();
        android.database.Cursor B = this.f400323d.B("select * , rowid from TextStatusSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                nVar2.mo9015xbf5d97fd(B);
            }
            vz5.b.a(B, null);
            if (nVar2.f72763xa3c65b86 > 0) {
                concurrentHashMap.put(str, nVar2);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f400324e;
                java.lang.String field_talker = nVar2.f76632x114ef53e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
                java.lang.String field_senderUserName = nVar2.f76630x1362f030;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_senderUserName, "field_senderUserName");
                concurrentHashMap2.put(field_talker + '_' + field_senderUserName, nVar2);
            }
            return nVar2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public final void z0(java.lang.String sessionId, java.lang.String talker, int i17, int i18, int i19, int i27, java.lang.String senderUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(senderUserName, "senderUserName");
        hi4.n nVar = new hi4.n();
        nVar.f76631xbed8694c = sessionId;
        nVar.f76632x114ef53e = talker;
        nVar.f76633x2262335f = i17;
        nVar.f76634xa783a79b = c01.id.c();
        nVar.f76628x55775f67 = en1.a.a();
        nVar.f76625xaf64e94a = i18;
        nVar.f76627x36454e5d = i19;
        nVar.f76626x83e02cb6 = i27;
        nVar.f76630x1362f030 = senderUserName;
        android.os.SystemClock.uptimeMillis();
        boolean mo55864x413cb2b4 = mo55864x413cb2b4(nVar, false);
        if (mo55864x413cb2b4) {
            this.f400324e.remove(nVar.f76632x114ef53e + '_' + nVar.f76630x1362f030);
            this.f400325f.remove(sessionId);
            mo145247xf35bbb4(nVar.f76631xbed8694c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusSessionInfoStorage", "[replaceSessionInfo]  ret=" + mo55864x413cb2b4 + ", sessionId=" + sessionId + ", talker=" + talker + ", actionPermission=" + i18 + ", type=" + i17);
    }
}
