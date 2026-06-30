package kn0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams f391088f = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams(1400188366, "852082", "eJwtzE0LgkAUheH-creF3pnG8SK0iGhnEOiiwE01U1w-YlBTI-rvibo8zwvnC2mceJ2tIQLpIaynzca*Wn7wxBRIJLmUxhRX59hAJBSiINpoPRc7OK4tRBoVIc7WcjWKCEhK0oFYtOHneFvcM99w5ueZX6hdyQntb6XrkiqPV314HK7qlL9TbM-hof9ctvD7AxQcMac_", 12081, "", "");

    /* renamed from: g, reason: collision with root package name */
    public static final kn0.g f391089g = new kn0.g("test", 12081, 0, null, 0, 0, null, 0, 0, 0, null, 0, 0, 0, null, null, 0, 0, false, 524284, null);

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams f391090a;

    /* renamed from: b, reason: collision with root package name */
    public kn0.g f391091b;

    /* renamed from: c, reason: collision with root package name */
    public kn0.h f391092c;

    /* renamed from: d, reason: collision with root package name */
    public final kn0.f f391093d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f391094e;

    public i(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCParams trtcParams, kn0.g liveRoomInfo, kn0.h jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trtcParams, "trtcParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveRoomInfo, "liveRoomInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        this.f391090a = trtcParams;
        this.f391091b = liveRoomInfo;
        this.f391092c = jumpInfo;
        kn0.f fVar = new kn0.f(false, false, false, 0, false, 31, null);
        this.f391093d = fVar;
        fVar.f391064c = false;
        fVar.f391062a = true;
    }

    /* renamed from: equals */
    public boolean m143746xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.i)) {
            return false;
        }
        kn0.i iVar = (kn0.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391090a, iVar.f391090a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391091b, iVar.f391091b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391092c, iVar.f391092c);
    }

    /* renamed from: hashCode */
    public int m143747x8cdac1b() {
        return (((this.f391090a.hashCode() * 31) + this.f391091b.m143740x8cdac1b()) * 31) + this.f391092c.m143743x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m143748x9616526c() {
        return "LiveRoomModel(liveRoomInfo=" + this.f391091b + " liveName:" + this.f391091b.f391067a + ", trtcParams=(sdkAppId:" + this.f391090a.f57079xe756702 + ",uid:" + this.f391090a.f57083xce2b2e46 + ",roomId:" + this.f391090a.f57078xc8d8bf56 + "))";
    }
}
