package kv5;

/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final cv5.b f394289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv5.f f394290b;

    public e(kv5.f fVar, cv5.b bVar) {
        this.f394290b = fVar;
        this.f394289a = bVar;
    }

    public void a(av5.d0 d0Var) {
        int b17 = d0Var.b();
        int i17 = -1;
        cv5.a aVar = d0Var.f95895a;
        cv5.b bVar = this.f394289a;
        if (b17 == 0) {
            d0Var.a(0);
            d0Var.f95896b = -1;
            av5.c0.d(bVar, 0, (byte) av5.c0.a(aVar, d0Var.f95898d));
            return;
        }
        if (b17 == 6) {
            av5.c0.d(bVar, 6, d0Var.e());
            return;
        }
        if (b17 == 2) {
            d0Var.a(2);
            d0Var.f95896b = -1;
            av5.c0.d(bVar, 2, (short) av5.c0.a(aVar, d0Var.f95898d));
            return;
        }
        if (b17 == 3) {
            d0Var.a(3);
            d0Var.f95896b = -1;
            av5.c0.e(bVar, 3, (char) av5.c0.b(aVar, d0Var.f95898d, false));
            return;
        }
        if (b17 == 4) {
            d0Var.a(4);
            d0Var.f95896b = -1;
            av5.c0.d(bVar, 4, av5.c0.a(aVar, d0Var.f95898d));
            return;
        }
        if (b17 == 16) {
            d0Var.a(16);
            d0Var.f95896b = -1;
            av5.c0.c(bVar, 16, java.lang.Float.floatToIntBits(java.lang.Float.intBitsToFloat(av5.c0.b(aVar, d0Var.f95898d, true))) << 32);
            return;
        }
        if (b17 == 17) {
            av5.c0.c(bVar, 17, java.lang.Double.doubleToLongBits(d0Var.d()));
            return;
        }
        kv5.f fVar = this.f394290b;
        switch (b17) {
            case 21:
                d0Var.a(21);
                d0Var.f95896b = -1;
                av5.c0.e(bVar, 21, fVar.e(av5.c0.b(aVar, d0Var.f95898d, false)));
                return;
            case 22:
                d0Var.a(22);
                d0Var.f95896b = -1;
                int b18 = av5.c0.b(aVar, d0Var.f95898d, false);
                kv5.i iVar = (kv5.i) fVar;
                fv5.b bVar2 = iVar.f394299g;
                int d17 = bVar2.d(b18);
                if (d17 >= 0) {
                    i17 = bVar2.f348555e[d17];
                } else if (b18 < 0 || !iVar.f394315w.a(b18)) {
                    i17 = b18;
                }
                av5.c0.e(bVar, 22, i17);
                return;
            case 23:
                d0Var.a(23);
                d0Var.f95896b = -1;
                av5.c0.e(bVar, 23, fVar.f(av5.c0.b(aVar, d0Var.f95898d, false)));
                return;
            case 24:
                d0Var.a(24);
                d0Var.f95896b = -1;
                av5.c0.e(bVar, 24, fVar.g(av5.c0.b(aVar, d0Var.f95898d, false)));
                return;
            case 25:
                d0Var.a(25);
                d0Var.f95896b = -1;
                av5.c0.e(bVar, 25, fVar.b(av5.c0.b(aVar, d0Var.f95898d, false)));
                return;
            case 26:
                d0Var.a(26);
                d0Var.f95896b = -1;
                av5.c0.e(bVar, 26, fVar.c(av5.c0.b(aVar, d0Var.f95898d, false)));
                return;
            case 27:
                d0Var.a(27);
                d0Var.f95896b = -1;
                av5.c0.e(bVar, 27, fVar.b(av5.c0.b(aVar, d0Var.f95898d, false)));
                return;
            case 28:
                bVar.e(28);
                int c17 = d0Var.c();
                av5.f0.d(bVar, c17);
                while (r3 < c17) {
                    a(d0Var);
                    r3++;
                }
                return;
            case 29:
                bVar.e(29);
                b(d0Var);
                return;
            case 30:
                d0Var.a(30);
                d0Var.f95896b = -1;
                bVar.e(30);
                return;
            case 31:
                d0Var.a(31);
                d0Var.f95896b = -1;
                bVar.e(((d0Var.f95898d != 0 ? 1 : 0) << 5) | 31);
                return;
            default:
                throw new av5.z("Unexpected type: " + java.lang.Integer.toHexString(d0Var.b()));
        }
    }

    public final void b(av5.d0 d0Var) {
        d0Var.a(29);
        d0Var.f95896b = -1;
        cv5.a aVar = d0Var.f95895a;
        d0Var.f95897c = av5.f0.b(aVar);
        int b17 = av5.f0.b(aVar);
        int i17 = d0Var.f95897c;
        kv5.f fVar = this.f394290b;
        int g17 = fVar.g(i17);
        cv5.b bVar = this.f394289a;
        av5.f0.d(bVar, g17);
        av5.f0.d(bVar, b17);
        for (int i18 = 0; i18 < b17; i18++) {
            av5.f0.d(bVar, fVar.f(av5.f0.b(d0Var.f95895a)));
            a(d0Var);
        }
    }
}
