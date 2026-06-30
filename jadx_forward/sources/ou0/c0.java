package ou0;

/* loaded from: classes5.dex */
public abstract class c0 {
    public static final float a(float f17, float f18, float f19, float f27, ou0.b flag, yz5.l lVar) {
        float f28;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flag, "flag");
        if (!(f18 - f27 <= f17 && f17 <= f27 + f18)) {
            flag.f430420e = false;
            return f19;
        }
        flag.f430420e = true;
        boolean z17 = flag.f430421f;
        float f29 = flag.f430417b;
        if (z17) {
            flag.a(f19);
            flag.c();
            if (flag.c()) {
                return f29;
            }
            flag.f430421f = false;
            f28 = flag.f430418c;
            flag.f430418c = f29;
        } else {
            flag.f430421f = true;
            if (lVar != null) {
                lVar.mo146xb9724478(flag);
            }
            f28 = flag.b(f17, f18, f19);
            flag.f430418c = f29;
        }
        return f28;
    }
}
