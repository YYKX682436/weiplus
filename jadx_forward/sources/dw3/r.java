package dw3;

/* loaded from: classes4.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325795d;

    public r(java.lang.String str) {
        this.f325795d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "handleMultiVideoResult videoState : " + o17 + ' ');
        if (o17) {
            java.lang.String a17 = q75.c.a("jpg");
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str = this.f325795d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((yb0.g) b0Var).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.b(context, str, a17);
            q75.c.f(a17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }
}
