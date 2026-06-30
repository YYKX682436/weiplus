package dy4;

/* loaded from: classes8.dex */
public final class q0 implements dg.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326230a;

    public q0(dy4.f1 f1Var) {
        this.f326230a = f1Var;
    }

    @Override // dg.c
    public final void a(java.lang.String str, int i17, int i18) {
        dy4.w wVar;
        dy4.f1 f1Var = this.f326230a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(f1Var.x(), "send video error event, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (f1Var.J() && (wVar = f1Var.U) != null) {
            wVar.i();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dy4.v(wVar));
            try {
                org.json.JSONObject c17 = wVar.c();
                java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s(%d,%d)", java.util.Arrays.copyOf(new java.lang.Object[]{str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)}, 3));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                c17.put("errMsg", format);
                wVar.a("onVideoError", c17);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(wVar.f326248a, "OnXWebVideoError fail", e17);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        dy4.h1 h1Var = f1Var.X;
        h1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(1379L, 40L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewVideoProfileReport", "onMediaPlayerVideoError, what:%s, extra:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (r26.i0.p(str, "MEDIA_ERR_NETWORK", true)) {
                g0Var.mo68477x336bdfd8(1379L, 41L, 1L, false);
            } else if (r26.i0.p(str, "MEDIA_ERR_DECODE", true)) {
                g0Var.mo68477x336bdfd8(1379L, 42L, 1L, false);
            } else if (r26.i0.p(str, "MEDIA_ERR_SRC_NOT_SUPPORTED", true)) {
                g0Var.mo68477x336bdfd8(1379L, 43L, 1L, false);
            } else {
                g0Var.mo68477x336bdfd8(1379L, 44L, 1L, false);
            }
        }
        dy4.g1 g1Var = h1Var.f326197a;
        g1Var.f326190m = i17;
        g1Var.f326191n = i18;
        g1Var.f326192o = str;
        f1Var.K();
    }
}
