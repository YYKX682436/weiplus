package pm;

/* loaded from: classes11.dex */
public class a implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public int f438277d;

    /* renamed from: e, reason: collision with root package name */
    public long f438278e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f438279f;

    /* renamed from: g, reason: collision with root package name */
    public int f438280g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f438281h;

    /* renamed from: i, reason: collision with root package name */
    public int f438282i;

    public a(int i17, long j17, java.lang.String str, int i18, boolean z17, int i19) {
        this.f438277d = i17;
        this.f438278e = j17;
        this.f438279f = str;
        this.f438280g = i18;
        this.f438281h = z17;
        this.f438282i = i19;
    }

    /* renamed from: toString */
    public java.lang.String m158696x9616526c() {
        return this.f438279f + " id:" + this.f438278e + " unReadCount:" + this.f438280g + "\u3000notificationId:" + this.f438277d;
    }

    public a(int i17, boolean z17) {
        this.f438278e = -1L;
        this.f438279f = "";
        this.f438282i = 0;
        this.f438277d = i17;
        this.f438281h = z17;
    }
}
