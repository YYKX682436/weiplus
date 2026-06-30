package dk2;

/* loaded from: classes5.dex */
public final class gg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f315063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f315064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f315065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f315066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f315067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f315068i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f315069m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f315070n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315071o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f315072p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f315073q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(long j17, boolean z17, boolean z18, int i17, int i18, boolean z19, int i19, java.lang.Integer num, java.lang.String str, boolean z27, boolean z28) {
        super(0);
        this.f315063d = j17;
        this.f315064e = z17;
        this.f315065f = z18;
        this.f315066g = i17;
        this.f315067h = i18;
        this.f315068i = z19;
        this.f315069m = i19;
        this.f315070n = num;
        this.f315071o = str;
        this.f315072p = z27;
        this.f315073q = z28;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String message;
        try {
            cl0.g gVar = new cl0.g();
            long j17 = this.f315063d;
            boolean z17 = this.f315064e;
            boolean z18 = this.f315065f;
            int i17 = this.f315066g;
            int i18 = this.f315067h;
            boolean z19 = this.f315068i;
            int i19 = this.f315069m;
            java.lang.Integer num = this.f315070n;
            java.lang.String str = this.f315071o;
            boolean z27 = this.f315072p;
            boolean z28 = this.f315073q;
            gVar.s("liveId", java.lang.Long.valueOf(j17));
            gVar.s("isFloat", java.lang.Boolean.valueOf(z17));
            gVar.s("isForeground", java.lang.Boolean.valueOf(z18));
            gVar.s("threadCntInProcess", java.lang.Integer.valueOf(i17));
            gVar.s("threadCntInJava", java.lang.Integer.valueOf(i18));
            gVar.s("screenOff", java.lang.Boolean.valueOf(z19));
            gVar.s("battery", java.lang.Integer.valueOf(i19));
            gVar.s("curBattery", num);
            gVar.s("memInfo", str);
            gVar.s("hasStack", java.lang.Boolean.valueOf(z27));
            gVar.s("deleteSuc", java.lang.Boolean.valueOf(z28));
            message = gVar.toString();
        } catch (java.lang.Exception e17) {
            message = e17.getMessage();
            if (message == null) {
                message = "";
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(message);
        return message;
    }
}
