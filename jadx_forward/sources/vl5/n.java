package vl5;

/* loaded from: classes15.dex */
public class n extends vl5.t {

    /* renamed from: p, reason: collision with root package name */
    public int f519475p;

    /* renamed from: q, reason: collision with root package name */
    public int f519476q;

    /* renamed from: r, reason: collision with root package name */
    public float f519477r;

    /* renamed from: s, reason: collision with root package name */
    public float f519478s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 f519479t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395, float f17, int i17, vl5.e eVar) {
        super(c22722xd3be5395, f17, i17, null);
        this.f519479t = c22722xd3be5395;
    }

    @Override // vl5.t
    public void a() {
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395.I1;
        this.f519479t.n();
    }

    @Override // vl5.t
    public void b(float f17, float f18) {
        int c17 = c();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519479t;
        int paddingLeft = c22722xd3be5395.getPaddingLeft();
        android.graphics.Point point = c22722xd3be5395.f294023e;
        float f19 = point.y - c17;
        float f27 = point.x - paddingLeft;
        float f28 = 1.0f - f18;
        if (f28 < java.lang.Math.abs(f19 / this.f519477r) || f28 < java.lang.Math.abs(f27 / this.f519478s)) {
            android.graphics.Point point2 = c22722xd3be5395.f294023e;
            point2.y = c17 + ((int) (this.f519477r * f28));
            point2.x = c22722xd3be5395.getPaddingLeft() + ((int) (this.f519478s * f28));
            c22722xd3be5395.k(true);
        }
    }

    public final int c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519479t;
        int firstVisiblePosition = c22722xd3be5395.getFirstVisiblePosition();
        int dividerHeight = (c22722xd3be5395.A + c22722xd3be5395.getDividerHeight()) / 2;
        android.view.View childAt = c22722xd3be5395.getChildAt(this.f519475p - firstVisiblePosition);
        if (childAt == null) {
            this.f519498n = true;
            return -1;
        }
        int i17 = this.f519475p;
        int i18 = this.f519476q;
        return i17 == i18 ? childAt.getTop() : i17 < i18 ? childAt.getTop() - dividerHeight : (childAt.getBottom() + dividerHeight) - c22722xd3be5395.B;
    }

    public void d() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2768x6318a73c.C22722xd3be5395 c22722xd3be5395 = this.f519479t;
        this.f519475p = c22722xd3be5395.f294031o;
        this.f519476q = c22722xd3be5395.f294037s;
        c22722xd3be5395.f294048z = 2;
        this.f519477r = c22722xd3be5395.f294023e.y - c();
        this.f519478s = c22722xd3be5395.f294023e.x - c22722xd3be5395.getPaddingLeft();
    }
}
