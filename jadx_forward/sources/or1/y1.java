package or1;

/* loaded from: classes12.dex */
public class y1 extends fb5.c {

    /* renamed from: h, reason: collision with root package name */
    public static fb5.b f429131h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f429132d;

    /* renamed from: e, reason: collision with root package name */
    public final long f429133e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f429134f;

    /* renamed from: g, reason: collision with root package name */
    public final int f429135g;

    public y1(java.lang.Object obj, long j17, int i17, java.lang.String str) {
        super(2, obj);
        this.f429133e = j17;
        this.f429134f = str;
        this.f429135g = i17;
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
        this.f429132d = "";
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.x1();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f429131h == null) {
            f429131h = new or1.w1(this);
        }
        return f429131h;
    }
}
