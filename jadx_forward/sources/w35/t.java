package w35;

/* loaded from: classes8.dex */
public final class t extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 params, w35.a aVar) {
        super(params, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f524301e = "MicroMsg.OpenWayControllerMiniProgram";
    }

    @Override // w35.b
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622;
        java.lang.String str = this.f524258c;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "text/html");
        java.lang.String str2 = this.f524259d;
        if (b17) {
            if (str2 == null) {
                str2 = "";
            }
            c12476xea20f622 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("text/html", "html", str2);
        } else {
            if (str == null) {
                str = "";
            }
            java.lang.String str3 = this.f524256a.f270844d;
            if (str3 == null) {
                str3 = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            c12476xea20f622 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622(str, str3, str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 k5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5.class);
        if (k5Var != null) {
            ((zh1.p) k5Var).Ni(c12476xea20f622, new w35.r(new java.lang.ref.WeakReference(this)));
        }
    }

    @Override // w35.b
    public void b(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = info.f272548e;
        if (c12474x8b872a21 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f524301e, "tryLaunchAppBrand, appId: " + c12474x8b872a21.f167788d.f167795d + ", versionType: " + c12474x8b872a21.f167788d.f167796e + ", enterPath: " + c12474x8b872a21.f167788d.f167797f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            w35.a aVar = this.f524257b;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
            }
            if (h6Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f524301e, "tryLaunchAppBrand, appBrandLauncher is null");
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0.f272496a.a(info.b(), this.f524258c);
            w35.s sVar = new w35.s(this, h6Var, context, c12474x8b872a21);
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                sVar.run();
            } else {
                ((ku5.t0) ku5.t0.f394148d).B(sVar);
            }
        }
    }
}
