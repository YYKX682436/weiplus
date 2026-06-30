package sl0;

/* loaded from: classes13.dex */
public class c implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f490594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f490596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f490597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f490598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490599f;

    public c(sl0.e eVar, int i17, java.lang.String str, int i18, long j17, long j18, int i19) {
        this.f490594a = i17;
        this.f490595b = str;
        this.f490596c = i18;
        this.f490597d = j17;
        this.f490598e = j18;
        this.f490599f = i19;
    }

    @Override // ll0.b
    /* renamed from: getData */
    public java.lang.Object mo145883xfb7e5820() {
        android.database.Cursor B;
        int i17;
        int i18 = this.f490599f;
        long j17 = this.f490598e;
        long j18 = this.f490597d;
        int i19 = this.f490596c;
        java.lang.String str = this.f490595b;
        int i27 = this.f490594a;
        if (i27 == 2) {
            ul0.a aVar = tl0.b.f501727a;
            aVar.getClass();
            B = aVar.f510088d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 2)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19)});
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
        B = aVar2.f510088d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 1)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19)});
        try {
            i17 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return java.lang.Integer.valueOf(i17);
        } finally {
        }
    }
}
