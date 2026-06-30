package oj2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.l f427305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(oj2.l lVar, java.lang.String str) {
        super(0);
        this.f427305d = lVar;
        this.f427306e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oj2.l lVar = this.f427305d;
        android.widget.ImageView m151526xb464ae51 = lVar.m151526xb464ae51();
        if (m151526xb464ae51 != null) {
            m151526xb464ae51.setVisibility(0);
        }
        java.lang.String str = this.f427306e;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (com.p314xaae8f345.mm.vfs.w6.j(str == null ? "" : str)) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str != null ? str : "");
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "openRead(...)");
                android.graphics.Bitmap O = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(D);
                android.widget.ImageView m151526xb464ae512 = lVar.m151526xb464ae51();
                if (m151526xb464ae512 != null) {
                    m151526xb464ae512.setImageDrawable(new android.graphics.drawable.BitmapDrawable(lVar.getContext().getResources(), O));
                }
                lj2.t0 a07 = lVar.m174009x3a33aac1().a0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O);
                a07.D(O);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.m145853xb5886c64(), "liveCoverUrl:" + str + ", business(LiveCommonSlice::class.java).audioModeHolderBm:" + lVar.m174009x3a33aac1().a0().f());
                return jz5.f0.f384359a;
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.j0(str != null ? str : ""));
            a18.f529406d = new oj2.i(lVar);
            a18.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.m145853xb5886c64(), "liveCoverUrl:" + str + ", business(LiveCommonSlice::class.java).audioModeHolderBm:" + lVar.m174009x3a33aac1().a0().f());
        return jz5.f0.f384359a;
    }
}
