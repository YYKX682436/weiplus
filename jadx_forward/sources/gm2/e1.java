package gm2;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm2.h1 f354891a = new gm2.h1(null, null, 0, 0, false, 0, 0, false, 0, 0, 0, 0, 0, 0, 0.0f, null, null, 0, 262143, null);

    public final gm2.i1 a() {
        gm2.h1 h1Var = this.f354891a;
        float f17 = h1Var.f354912j;
        gm2.c1 c1Var = gm2.c1.f354853a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) h1Var.f354903a);
        sb6.append((java.lang.Object) h1Var.f354904b);
        h1Var.f354921s = (int) (f17 + c1Var.p(sb6.toString(), h1Var.f354906d) + h1Var.f354914l + h1Var.f354913k);
        h1Var.f354922t = h1Var.f354908f + h1Var.f354921s + h1Var.f354911i;
        gm2.i1 i1Var = new gm2.i1(gm2.c1.c(c1Var, h1Var.f354922t, 0, 2, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(h1Var, "<set-?>");
        i1Var.f354946e = h1Var;
        return i1Var;
    }

    public final gm2.e1 b(int i17, gm2.z1 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        int c17 = config.c(java.lang.Integer.valueOf(i17));
        gm2.h1 h1Var = this.f354891a;
        h1Var.f354915m = c17;
        h1Var.f354916n = gm2.c1.f354853a.g();
        h1Var.f354905c = config.a(java.lang.Integer.valueOf(i17));
        h1Var.f354907e = config.b(java.lang.Integer.valueOf(i17)) == 1;
        return this;
    }

    public final gm2.e1 c(int i17) {
        gm2.h1 h1Var = this.f354891a;
        h1Var.f354913k = i17;
        h1Var.f354912j = i17;
        return this;
    }

    public final gm2.e1 d(java.lang.String str, boolean z17) {
        boolean z18 = str == null || str.length() == 0;
        gm2.h1 h1Var = this.f354891a;
        if (!z18) {
            try {
                h1Var.f354915m = android.graphics.Color.parseColor(str);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLevelImageSpan", e17 + ",serverColor:" + str);
            }
        } else if (z17) {
            h1Var.f354915m = 0;
        }
        return this;
    }

    public final gm2.e1 e(java.lang.CharSequence content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        gm2.h1 h1Var = this.f354891a;
        h1Var.getClass();
        h1Var.f354903a = content;
        return this;
    }

    public final gm2.e1 f(int i17) {
        this.f354891a.f354906d = gm2.c1.f354853a.e();
        return this;
    }
}
