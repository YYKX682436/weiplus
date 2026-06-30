package rc;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final org.p3343x72743996.net.AbstractC29500x62bc147f f475440a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f475441b;

    public c(rc.a aVar) {
        boolean z17;
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i("wcf://WxaChromiumCronetCache/", true);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(i17);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            z17 = true;
        } else {
            com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            z17 = !m18.a() ? false : m18.f294799a.r(m18.f294800b);
        }
        org.p3343x72743996.net.AbstractC29500x62bc147f.Builder builder = new org.p3343x72743996.net.AbstractC29500x62bc147f.Builder(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        builder.m153175x7e503dd5(true).mo153176xa991ece7(true).mo153180x70d74261(true).mo153177x84904997(0, 524288000L).mo153173x864dd1a6("launchwxacode.wxqcloud.qq.com.cn", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33726x366c91de);
        if (z17) {
            builder.mo153190x50e61f7e(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CronetGlobalEngine", "make cache dir failed. disable cronet storage path");
        }
        org.p3343x72743996.net.AbstractC29500x62bc147f mo153174x59bc66e = builder.mo153174x59bc66e();
        this.f475440a = mo153174x59bc66e;
        ((qo.c) ((qo.m) i95.n0.c(qo.m.class))).getClass();
        java.util.concurrent.Executor a18 = qo.q.f446854a.a("MicroMsg.CronetGlobalEngine", null);
        this.f475441b = a18;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            mo153174x59bc66e.mo153144x41aca14(new rc.a(this, a18));
        }
    }
}
