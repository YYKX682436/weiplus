package e23;

/* loaded from: classes11.dex */
public class o extends e23.g0 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f328450v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f328451w;

    /* renamed from: x, reason: collision with root package name */
    public int f328452x;

    /* renamed from: y, reason: collision with root package name */
    public final e23.m f328453y;

    /* renamed from: z, reason: collision with root package name */
    public final e23.n f328454z;

    public o(int i17) {
        super(i17);
        this.f328453y = new e23.m(this);
        this.f328454z = new e23.n(this);
    }

    @Override // e23.g0, u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f328386q = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idj, java.lang.Integer.valueOf(this.f328452x));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String d17 = o13.n.d(this.f328450v);
        float textSize = ((e23.n) eVar).f328439e.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f328451w = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, d17, textSize);
    }

    @Override // e23.g0, u13.g
    public u13.f k() {
        return this.f328453y;
    }

    @Override // e23.g0
    public u13.e o() {
        return this.f328454z;
    }
}
