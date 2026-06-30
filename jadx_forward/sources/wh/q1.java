package wh;

/* loaded from: classes12.dex */
public abstract class q1 {
    static {
        new java.lang.InheritableThreadLocal();
    }

    public static wh.t1 a(java.lang.String str, byte[] bArr) {
        wh.p1 p1Var = new wh.p1(str, bArr);
        try {
            try {
                p1Var.f();
                boolean z17 = false;
                while (true) {
                    if (!p1Var.b()) {
                        break;
                    }
                    p1Var.c();
                    if (p1Var.f527386f != '(') {
                        if (z17) {
                            p1Var.g();
                            break;
                        }
                    } else {
                        z17 = true;
                    }
                }
                java.nio.CharBuffer d17 = p1Var.d(')', java.nio.CharBuffer.allocate(16));
                boolean z18 = false;
                while (true) {
                    if (!p1Var.b()) {
                        break;
                    }
                    p1Var.c();
                    if (p1Var.f527386f != ' ') {
                        if (z18) {
                            p1Var.g();
                            break;
                        }
                    } else {
                        z18 = true;
                    }
                }
                java.nio.CharBuffer e17 = p1Var.e(java.nio.CharBuffer.allocate(1));
                for (int i17 = 0; i17 < 11; i17++) {
                    boolean z19 = false;
                    while (true) {
                        if (p1Var.b()) {
                            p1Var.c();
                            if (p1Var.f527386f != ' ') {
                                if (z19) {
                                    p1Var.g();
                                    break;
                                }
                            } else {
                                z19 = true;
                            }
                        }
                    }
                }
                wh.t1 t1Var = new wh.t1();
                t1Var.f527406a = java.lang.String.valueOf(d17);
                t1Var.f527407b = java.lang.String.valueOf(e17);
                t1Var.f527408c = b(p1Var);
                t1Var.f527409d = b(p1Var);
                t1Var.f527410e = b(p1Var);
                t1Var.f527411f = b(p1Var);
                try {
                    p1Var.a();
                } catch (java.lang.Exception unused) {
                }
                return t1Var;
            } catch (java.lang.Throwable th6) {
                try {
                    p1Var.a();
                } catch (java.lang.Exception unused2) {
                }
                throw th6;
            }
        } catch (java.lang.Exception e18) {
            if (e18 instanceof wh.s1) {
                throw e18;
            }
            throw new wh.s1("ProcStatReader error: " + e18.getClass().getName() + ", " + e18.getMessage());
        }
    }

    public static long b(wh.p1 p1Var) {
        boolean z17;
        long j17 = 1;
        long j18 = 0;
        boolean z18 = true;
        while (true) {
            z17 = false;
            if (!p1Var.b()) {
                break;
            }
            p1Var.c();
            if (!java.lang.Character.isDigit(p1Var.f527386f)) {
                if (!z18) {
                    p1Var.g();
                    break;
                }
                if (p1Var.f527386f != '-') {
                    throw new wh.o1("Couldn't read number!");
                }
                j17 = -1;
            } else {
                j18 = (j18 * 10) + (p1Var.f527386f - '0');
            }
            z18 = false;
        }
        if (z18) {
            throw new wh.o1("Couldn't read number because the file ended!");
        }
        long j19 = j17 * j18;
        while (true) {
            if (!p1Var.b()) {
                break;
            }
            p1Var.c();
            if (p1Var.f527386f == ' ') {
                z17 = true;
            } else if (z17) {
                p1Var.g();
                break;
            }
        }
        return j19;
    }
}
