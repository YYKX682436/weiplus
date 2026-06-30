package cc1;

/* loaded from: classes7.dex */
public abstract class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: g, reason: collision with root package name */
    public static final cc1.m f121977g = new cc1.m(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f121978h = {"ECB", "CBC", "CTR", "GCM"};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f121979i = {"AES"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f121980m = {"RSA", "EC"};

    /* renamed from: n, reason: collision with root package name */
    public static java.security.KeyStore f121981n;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l env, org.json.JSONObject data, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new cc1.o(this, env, data, i17, null), 2, null);
    }

    public abstract java.lang.Object C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);
}
