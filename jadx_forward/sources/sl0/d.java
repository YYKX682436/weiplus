package sl0;

/* loaded from: classes13.dex */
public class d implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f490611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f490613c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f490614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f490615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f490617g;

    public d(sl0.e eVar, int i17, java.lang.String str, int i18, long j17, long j18, int i19, int i27) {
        this.f490611a = i17;
        this.f490612b = str;
        this.f490613c = i18;
        this.f490614d = j17;
        this.f490615e = j18;
        this.f490616f = i19;
        this.f490617g = i27;
    }

    @Override // ll0.b
    /* renamed from: getData */
    public java.lang.Object mo145883xfb7e5820() {
        android.database.Cursor B;
        int i17;
        int i18 = this.f490617g;
        int i19 = this.f490616f;
        long j17 = this.f490615e;
        long j18 = this.f490614d;
        int i27 = this.f490613c;
        java.lang.String str = this.f490612b;
        int i28 = this.f490611a;
        if (i28 == 2) {
            ul0.a aVar = tl0.b.f501727a;
            aVar.getClass();
            B = aVar.f510088d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 2)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i19), java.lang.String.valueOf(i18), java.lang.String.valueOf(i27)});
            try {
                i17 = B.moveToFirst() ? B.getInt(0) : 0;
                B.close();
                return java.lang.Integer.valueOf(i17);
            } finally {
            }
        }
        if (i28 != 1) {
            return 0;
        }
        ul0.a aVar2 = tl0.b.f501727a;
        aVar2.getClass();
        B = aVar2.f510088d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 1)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i19), java.lang.String.valueOf(i18), java.lang.String.valueOf(i27)});
        try {
            i17 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return java.lang.Integer.valueOf(i17);
        } finally {
        }
    }
}
