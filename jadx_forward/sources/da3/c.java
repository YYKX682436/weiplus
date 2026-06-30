package da3;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean[] f309295e = {false};

    /* renamed from: f, reason: collision with root package name */
    public static final boolean[] f309296f = {false};

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc f309297a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309298b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f309299c;

    /* renamed from: d, reason: collision with root package name */
    public final long f309300d;

    public c(java.lang.String str, long j17, long j18, long j19, long j27) {
        boolean[] zArr = f309295e;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                    try {
                        com.p314xaae8f345.mm.p818xc991f70.c.f150066a.mo32201xeb57c8f5("mmmedia");
                        com.p314xaae8f345.mm.p818xc991f70.c.f150066a.mo32201xeb57c8f5("wxaudio");
                        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.m46435x2d426967(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets());
                        f309296f[0] = true;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppAudioBinding", e17, "init WxAudioFailed", new java.lang.Object[0]);
                    }
                    f309295e[0] = true;
                }
            }
        }
        this.f309298b = str;
        this.f309300d = j17;
        if (f309296f[0]) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new da3.a(this));
            com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc c10824x1e0081cc = new com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc(j19, j18, 0L);
            this.f309297a = c10824x1e0081cc;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAudioBinding", "create wxaudio appId:%s ret:%d", str, java.lang.Integer.valueOf(c10824x1e0081cc.m46444x8696a1b5(new da3.b(this))));
            this.f309297a.m46450xe58d01ef(j27);
        }
    }
}
