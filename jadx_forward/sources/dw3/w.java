package dw3;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f325823d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        this.f325823d = c16991x15ced046;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String b17 = q75.c.b("mp4");
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = this.f325823d;
        ((yb0.g) b0Var).Ai(context, c16991x15ced046.f237194e, b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "handleRemuxVideo save video" + c16991x15ced046.f237194e + " exist:" + com.p314xaae8f345.mm.vfs.w6.j(c16991x15ced046.f237194e) + " to:" + b17);
        q75.c.f(b17, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }
}
