package c01;

/* loaded from: classes.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c01.c1 f118610d = new c01.c1();

    public c1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_teen_mode_h5_no_access_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=teenmodeban/index", true);
        if (Zi == null) {
            return "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=teenmodeban/index";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTeenModeService", "webViewTeenModeNoAccessUrl: ".concat(Zi));
        return Zi;
    }
}
