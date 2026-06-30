package yw1;

/* loaded from: classes9.dex */
public class c implements dn.k {

    /* renamed from: f, reason: collision with root package name */
    public static yw1.c f548135f;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f548136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f548137e;

    public static java.lang.String b() {
        return lp0.b.D() + "wallet/img/";
    }

    public static yw1.c c() {
        if (f548135f == null) {
            f548135f = new yw1.c();
        }
        return f548135f;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public java.lang.String a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f548137e)) {
            this.f548137e = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r() + "_reward_img");
        }
        return this.f548137e;
    }

    public boolean d() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(b() + a());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardCdnDownloadHelper", "cdn callback, id: %s, ret: %s, sceneResult: %s", str, java.lang.Integer.valueOf(i17), hVar);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new yw1.a(this, str, hVar, i17));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
