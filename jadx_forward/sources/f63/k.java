package f63;

/* loaded from: classes8.dex */
public final class k extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f341393g = {l75.n0.m145250x3fdc6f77(f63.e.f341384t, "GameLifeSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f341394d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f341395e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f341396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l75.k0 db6) {
        super(db6, f63.e.f341384t, "GameLifeSessionInfo", dm.o5.f320470i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = f63.e.f341384t;
        this.f341394d = db6;
        this.f341395e = new java.util.concurrent.ConcurrentHashMap();
        this.f341396f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final java.lang.String D0(java.lang.String str, java.lang.String str2) {
        return str + '_' + str2;
    }

    public final f63.e y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new f63.e();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f341396f;
        f63.e eVar = (f63.e) concurrentHashMap.get(str);
        if (eVar != null) {
            return eVar;
        }
        android.database.Cursor B = this.f341394d.B("select * , rowid from GameLifeSessionInfo where sessionId = '" + str + "' ", null);
        f63.e eVar2 = new f63.e();
        eVar2.f67825xbed8694c = str;
        if (B != null) {
            if (B.moveToFirst()) {
                eVar2.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        if (eVar2.f72763xa3c65b86 > 0) {
            concurrentHashMap.put(str, eVar2);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f341395e;
            java.lang.String field_selfUserName = eVar2.f67824x5568d387;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
            java.lang.String field_talker = eVar2.f67826x114ef53e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
            concurrentHashMap2.put(D0(field_selfUserName, field_talker), eVar2);
        }
        return eVar2;
    }

    public final void z0(java.lang.String sessionId, java.lang.String selfUsername, java.lang.String talker, v53.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUsername, "selfUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        f63.e eVar = new f63.e();
        eVar.f67825xbed8694c = sessionId;
        eVar.f67826x114ef53e = talker;
        eVar.f67824x5568d387 = selfUsername;
        eVar.f67823x26b3182a = cVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replaceSessionInfo] sessionId=");
        sb6.append(sessionId);
        sb6.append(", talker=");
        sb6.append(talker);
        sb6.append(", selfUsername=");
        sb6.append(eVar.f67824x5568d387);
        sb6.append(" extInfo:");
        v53.c cVar2 = eVar.f67823x26b3182a;
        sb6.append(cVar2 != null ? java.lang.Long.valueOf(cVar2.f514864e) : null);
        sb6.append('/');
        v53.c cVar3 = eVar.f67823x26b3182a;
        sb6.append(cVar3 != null ? java.lang.Long.valueOf(cVar3.f514863d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.GameLifeSessionInfoStorage", sb6.toString());
        this.f341396f.put(sessionId, eVar);
        this.f341395e.put(D0(selfUsername, talker), eVar);
        mo11260x413cb2b4(eVar);
    }
}
