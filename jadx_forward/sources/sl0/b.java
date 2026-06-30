package sl0;

/* loaded from: classes13.dex */
public class b implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f490583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f490585c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f490586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f490587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490588f;

    public b(sl0.e eVar, int i17, java.lang.String str, int i18, long j17, long j18, int i19) {
        this.f490583a = i17;
        this.f490584b = str;
        this.f490585c = i18;
        this.f490586d = j17;
        this.f490587e = j18;
        this.f490588f = i19;
    }

    @Override // ll0.b
    /* renamed from: getData */
    public java.lang.Object mo145883xfb7e5820() {
        android.database.Cursor B;
        int i17;
        int i18 = this.f490588f;
        long j17 = this.f490587e;
        long j18 = this.f490586d;
        int i19 = this.f490585c;
        java.lang.String str = this.f490584b;
        int i27 = this.f490583a;
        if (i27 == 2) {
            ul0.a aVar = tl0.b.f501727a;
            aVar.getClass();
            B = aVar.f510088d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and talker = '" + str + "' and type = ? and action = 2)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19)});
            try {
                i17 = B.moveToFirst() ? B.getInt(0) : 0;
                B.close();
                return java.lang.Integer.valueOf(i17);
            } finally {
            }
        }
        if (i27 != 1) {
            return 0;
        }
        ul0.a aVar2 = tl0.b.f501727a;
        aVar2.getClass();
        B = aVar2.f510088d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and talker = '" + str + "' and type = ? and action = 1)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19)});
        try {
            i17 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return java.lang.Integer.valueOf(i17);
        } finally {
        }
    }
}
