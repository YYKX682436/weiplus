package lt3;

/* loaded from: classes4.dex */
public final class g extends dm.rb {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f402773y0 = dm.rb.m125456x3593deb(lt3.g.class);

    /* renamed from: l1, reason: collision with root package name */
    public static final java.lang.String f402771l1 = "VideoEditInfo";

    /* renamed from: p1, reason: collision with root package name */
    public static final java.lang.String[] f402772p1 = dm.rb.C;

    public g() {
        new r45.tl5();
        new r45.hi0();
    }

    @Override // dm.rb, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 INFO = f402773y0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INFO, "INFO");
        return INFO;
    }

    public r45.on0 t0() {
        r45.on0 on0Var = new r45.on0();
        byte[] bArr = this.f68203xa1900fad;
        if (bArr != null) {
            try {
                on0Var.mo11468x92b714fd(bArr);
                return on0Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
