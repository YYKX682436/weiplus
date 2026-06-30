package q55;

/* loaded from: classes.dex */
public abstract class e extends q55.h {
    public java.lang.String h() {
        return "Int";
    }

    public java.lang.Object i() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h(), "Int")) {
            return 0;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h(), "Float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h(), "String")) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h(), "Long")) {
                return 0L;
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        return "";
    }

    public java.lang.String j() {
        return "";
    }

    public java.lang.String k() {
        return "";
    }

    public java.lang.String l() {
        return b() + '_' + h();
    }

    public int m() {
        return 0;
    }
}
