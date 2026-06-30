package ps2;

/* loaded from: classes10.dex */
public final class f extends ps2.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, java.lang.String TAG) {
        super(str, TAG);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
    }

    @Override // ps2.d, bi4.o0
    public bi4.d1 a() {
        return null;
    }

    @Override // ps2.d, bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var = this.f102607b;
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "14")) {
            return false;
        }
        java.lang.String str = j0Var.f436675g;
        if (!(str == null || r26.n0.N(str))) {
            byte[] decode = android.util.Base64.decode(j0Var.f436675g, 0);
            pj4.u1 u1Var = new pj4.u1();
            u1Var.mo11468x92b714fd(decode);
            pj4.s1 s1Var = u1Var.f436839f;
            if (!(s1Var != null && s1Var.f436819d == 0)) {
                java.lang.String str2 = s1Var != null ? s1Var.f436820e : null;
                if (!(str2 == null || str2.length() == 0)) {
                    i95.m c17 = i95.n0.c(ed0.a1.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                    android.app.Activity activity = (android.app.Activity) context;
                    java.lang.String string = bundle != null ? bundle.getString("userName", "") : "";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getClickUserName(...)");
                    vx3.i iVar = new vx3.i();
                    pj4.s1 s1Var2 = u1Var.f436839f;
                    iVar.f522831o = s1Var2 != null ? s1Var2.f436819d : 0L;
                    java.lang.String str3 = s1Var2 != null ? s1Var2.f436820e : null;
                    iVar.f522832p = str3 != null ? str3 : "";
                    pj4.v1 v1Var = u1Var.f436838e;
                    iVar.f522833q = v1Var != null ? v1Var.f436843d : 0;
                    pf5.z zVar = pf5.z.f435481a;
                    if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    ((hy2.f) ((iz2.b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).c(iz2.b.class))).O6(7, new mx3.l(1, 10, string, iVar, activity, false));
                }
            }
            return false;
        }
        return true;
    }

    @Override // ps2.d, bi4.o0
    public java.lang.CharSequence i() {
        return "";
    }

    @Override // ps2.d, bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        return false;
    }
}
