package x03;

/* loaded from: classes15.dex */
public final class v0 {
    public v0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final x03.x0 a() {
        x03.x0 x0Var;
        x03.x0 x0Var2 = x03.x0.f532695e;
        if (x0Var2 != null) {
            return x0Var2;
        }
        synchronized (this) {
            x0Var = x03.x0.f532695e;
            if (x0Var == null) {
                x0Var = new x03.x0();
                x03.x0.f532695e = x0Var;
            }
        }
        return x0Var;
    }
}
