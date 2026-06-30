package mu0;

/* loaded from: classes5.dex */
public final class a implements bu0.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 f412866a;

    public a(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 layer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layer, "layer");
        this.f412866a = layer;
    }

    @Override // bu0.a
    public java.lang.String a() {
        java.lang.String m33055xfd7ecc3d = this.f412866a.m33055xfd7ecc3d();
        return m33055xfd7ecc3d == null ? "" : m33055xfd7ecc3d;
    }

    @Override // bu0.a
    public boolean c(java.lang.String materialID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialID, "materialID");
        return this.f412866a.e(materialID);
    }

    @Override // bu0.a
    public java.lang.String d() {
        return this.f412866a.m33054xd8cf7878();
    }
}
