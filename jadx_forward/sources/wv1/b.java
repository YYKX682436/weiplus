package wv1;

/* loaded from: classes9.dex */
public class b extends wv1.g {

    /* renamed from: g, reason: collision with root package name */
    public ot0.q f531467g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f531468h;

    @Override // wv1.a
    public java.lang.String c() {
        return p() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(p().f430223o, "") : "";
    }

    @Override // wv1.a
    public java.lang.String d() {
        return p() != null ? p().n() : "";
    }

    @Override // wv1.a
    public long e() {
        if (p() != null) {
            return p().f430215m;
        }
        return 0L;
    }

    @Override // wv1.g, wv1.e
    public java.lang.String m() {
        if (this.f531468h == null && p() != null && p().f430227p != null && p().f430227p.length() > 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).D0(p().f430227p);
            if (D0 != null) {
                this.f531468h = D0.f68099xfeae815;
            }
        }
        java.lang.String str = this.f531468h;
        return str != null ? str : "";
    }

    public final ot0.q p() {
        if (this.f531467g == null) {
            this.f531467g = ot0.q.v(this.f531463b.j());
        }
        return this.f531467g;
    }
}
