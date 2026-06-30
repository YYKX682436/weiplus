package e23;

/* loaded from: classes12.dex */
public class h1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f328395q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f328396r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f328397s;

    /* renamed from: t, reason: collision with root package name */
    public int f328398t;

    /* renamed from: u, reason: collision with root package name */
    public final e23.g1 f328399u;

    /* renamed from: v, reason: collision with root package name */
    public final e23.f1 f328400v;

    public h1(int i17) {
        super(15, i17);
        this.f328399u = new e23.g1(this);
        this.f328400v = new e23.f1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f328396r = this.f328395q.f432720e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = this.f328395q.f432723h;
        float textSize = ((e23.f1) eVar).f328381b.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f328397s = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, str, textSize);
        java.lang.Object obj = this.f328395q.f432730o;
        if (obj instanceof java.lang.Integer) {
            this.f328398t = ((java.lang.Integer) obj).intValue();
        }
    }

    @Override // u13.g
    public int j() {
        return this.f328395q.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f328399u;
    }
}
