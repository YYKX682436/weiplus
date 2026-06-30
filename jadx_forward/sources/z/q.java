package z;

/* loaded from: classes13.dex */
public abstract class q {
    public static z.p0 a(z.g0 animation, z.j1 j1Var, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j1Var = z.j1.Restart;
        }
        z.j1 repeatMode = j1Var;
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(repeatMode, "repeatMode");
        return new z.p0(animation, repeatMode, j17, null);
    }

    public static final z.d1 b(yz5.l init) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(init, "init");
        z.c1 c1Var = new z.c1();
        init.mo146xb9724478(c1Var);
        return new z.d1(c1Var);
    }

    public static z.p1 c(float f17, float f18, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if ((i17 & 1) != 0) {
            f17 = 1.0f;
        }
        if ((i17 & 2) != 0) {
            f18 = 1500.0f;
        }
        if ((i17 & 4) != 0) {
            obj = null;
        }
        return new z.p1(f17, f18, obj);
    }

    public static z.v2 d(int i17, int i18, z.h0 easing, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 300;
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        if ((i19 & 4) != 0) {
            easing = z.j0.f550237a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(easing, "easing");
        return new z.v2(i17, i18, easing);
    }
}
