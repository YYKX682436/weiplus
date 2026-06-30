package ue2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue2.x f508391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f508392e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ue2.x xVar, java.lang.String str) {
        super(0);
        this.f508391d = xVar;
        this.f508392e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ue2.x xVar = this.f508391d;
        xVar.K0(0);
        mm2.c1 c1Var = (mm2.c1) xVar.P0(mm2.c1.class);
        java.lang.String str = this.f508392e;
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
            xVar.f508400q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(xVar.f446856d.getContext().getResources(), O));
            c1Var.I4 = O;
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.j0(str != null ? str : ""));
            a18.f529406d = new ue2.t(xVar, c1Var);
            a18.f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f508399p, "liveCoverUrl:" + str + ", audioModeHolderBm:" + c1Var.I4);
        return jz5.f0.f384359a;
    }
}
