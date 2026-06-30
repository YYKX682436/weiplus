package c01;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c01.c1 f37077d = new c01.c1();

    public c1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_teen_mode_h5_no_access_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=teenmodeban/index", true);
        if (Zi == null) {
            return "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=teenmodeban/index";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTeenModeService", "webViewTeenModeNoAccessUrl: ".concat(Zi));
        return Zi;
    }
}
