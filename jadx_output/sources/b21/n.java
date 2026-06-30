package b21;

/* loaded from: classes.dex */
public abstract class n {
    public static boolean a(java.lang.String str) {
        b21.r b17 = b21.m.b();
        return b17 != null && b17.f17352n.equals(str);
    }

    public static boolean b() {
        if (!b21.m.c()) {
            return false;
        }
        b21.m.f();
        return true;
    }

    public static boolean c() {
        if (!b21.m.d() || b21.m.c()) {
            return false;
        }
        b21.m.g();
        return true;
    }

    public static boolean d() {
        if (!b21.m.d()) {
            return false;
        }
        b21.m.j();
        return true;
    }
}
