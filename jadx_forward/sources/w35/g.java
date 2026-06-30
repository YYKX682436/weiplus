package w35;

/* loaded from: classes8.dex */
public final class g extends w35.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 params, w35.a aVar) {
        super(params, aVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f524269e = "MicroMsg.OpenWayControllerCustom";
    }

    @Override // w35.b
    public void a() {
    }

    @Override // w35.b
    public void b(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w info) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n0 n0Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k0 k0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0 o0Var = info.f272550g;
        jz5.f0 f0Var = null;
        if (o0Var != null && (n0Var = o0Var.f270927f) != null) {
            int h17 = info.h();
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (h17 == 7) {
                n0Var.a(context);
                w35.a aVar = this.f524257b;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
                    f0Var = f0Var2;
                }
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0 o0Var2 = info.f272550g;
                if (o0Var2 == null || (str = o0Var2.f270923b) == null) {
                    str = "";
                }
                u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_7, str));
                u1Var.a(true);
                u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571535i4);
                u1Var.l(new w35.e(n0Var, context, this, info));
                u1Var.i(new w35.f(this, info));
                u1Var.q(false);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var = this.f524256a.f270852l;
                if (p3Var != null && (k0Var = p3Var.f270939c) != null) {
                    ((kb0.f) k0Var).b(info);
                    f0Var = f0Var2;
                }
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f524269e, "customInfo.oncLick is null");
        }
    }
}
