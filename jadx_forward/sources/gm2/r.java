package gm2;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.o f354998a = new gm2.o(0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, false, null, 0, 0, 0, false, false, 524287, null);

    /* renamed from: b, reason: collision with root package name */
    public gm2.u1 f354999b;

    /* renamed from: c, reason: collision with root package name */
    public gm2.v1 f355000c;

    public final gm2.q a(android.view.View view) {
        gm2.o oVar = this.f354998a;
        float f17 = oVar.f354969a + oVar.f354971c + oVar.f354983o + oVar.f354973e;
        gm2.c1 c1Var = gm2.c1.f354853a;
        oVar.f354988t = (int) (f17 + c1Var.p(oVar.f354978j.toString(), oVar.f354980l) + oVar.f354972d + oVar.f354970b);
        gm2.u1 u1Var = this.f354999b;
        gm2.v1 v1Var = this.f355000c;
        if (u1Var == null || v1Var == null) {
            gm2.q qVar = new gm2.q(gm2.c1.c(c1Var, oVar.f354988t, 0, 2, null));
            qVar.f354995d = oVar;
            return qVar;
        }
        gm2.x1 x1Var = new gm2.x1(gm2.c1.c(c1Var, oVar.f354988t, 0, 2, null));
        x1Var.f355063o = view;
        x1Var.f354995d = oVar;
        x1Var.f355058g = u1Var;
        x1Var.f355059h = v1Var;
        return x1Var;
    }

    public final gm2.r b(int i17, java.lang.String textContent, gm2.z1 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textContent, "textContent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        int B = zl2.q4.f555466a.B(i17);
        int f17 = config.f(java.lang.Integer.valueOf(B));
        gm2.o oVar = this.f354998a;
        oVar.f354975g = f17;
        gm2.c1 c1Var = gm2.c1.f354853a;
        oVar.f354976h = c1Var.g();
        oVar.f354979k = config.a(java.lang.Integer.valueOf(B));
        oVar.f354980l = c1Var.e();
        oVar.f354981m = config.b(java.lang.Integer.valueOf(B)) == 1;
        oVar.f354987s = B < 80;
        this.f354999b = config.g(B);
        this.f355000c = config.h(B);
        oVar.f354977i = oVar.f354976h / 2;
        gm2.u1 u1Var = this.f354999b;
        if (u1Var != null) {
            u1Var.f355025a = r0 / 2;
        }
        int[] e17 = config.e(java.lang.Integer.valueOf(B));
        if (e17.length == 2) {
            oVar.f354983o = e17[0];
            oVar.f354984p = e17[1];
            zl2.r4.f555483a.M2("FinderLiveLevelImageSpan", "setLevel iconSize:" + e17[0] + '-' + e17[1]);
        }
        oVar.f354982n = gm2.q.f354993e.a(config.d(java.lang.Integer.valueOf(B)), (oVar.f354984p * 2.0f) / 30);
        oVar.getClass();
        oVar.f354978j = textContent;
        return this;
    }

    public final gm2.r c(java.lang.String str) {
        gm2.o oVar = this.f354998a;
        if (!(str == null || str.length() == 0)) {
            try {
                oVar.f354974f = android.graphics.Color.parseColor(str);
            } catch (java.lang.Exception e17) {
                oVar.f354974f = 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLevelImageSpan", e17 + ",serverColor:" + str);
            }
        }
        return this;
    }
}
