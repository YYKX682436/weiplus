package dw3;

/* loaded from: classes4.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325802d;

    public s(java.lang.String str) {
        this.f325802d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remuxComposition videoState : ");
        sb6.append(o17);
        sb6.append(" videoPath:");
        java.lang.String str = this.f325802d;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", sb6.toString());
        if (o17) {
            java.lang.String b17 = q75.c.b("mp4");
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((yb0.g) b0Var).Ai(context, str, b17);
            q75.c.f(b17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Bi(str);
    }
}
