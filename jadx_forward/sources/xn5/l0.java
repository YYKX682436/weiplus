package xn5;

/* loaded from: classes13.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xn5.l0 f537225d = new xn5.l0();

    public l0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int next;
        if (xn5.q0.f537237c == null) {
            synchronized (xn5.q0.f537236b) {
                if (xn5.q0.f537237c == null) {
                    try {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.Object newInstance = com.p314xaae8f345.mm.p632xd97a1f41.p634xbddafb2a.C6290xb45498b3.class.newInstance();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.view.x2c.IViewCreatorFactory");
                        xn5.q0.f537237c = (xn5.f0) newInstance;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C", "init x2c factory success, cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                    } catch (java.lang.Exception unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.X2C", "create X2C Factory Fail className:com.tencent.mm.autogen.layout.BootX2CFactory");
                    }
                }
                if (xn5.q0.f537238d == null) {
                    android.content.res.XmlResourceParser layout = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getLayout(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8y);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layout, "getLayout(...)");
                    do {
                        next = layout.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    xn5.p0 p0Var = xn5.q0.f537235a;
                    xn5.q0.f537238d = android.util.Xml.asAttributeSet(layout);
                }
                bm5.o1.f104252a.n(xn5.q0.f537243i);
            }
        }
        bm5.o1.f104252a.n(xn5.q0.f537243i);
        pm0.v.X(xn5.k0.f537220d);
        return jz5.f0.f384359a;
    }
}
