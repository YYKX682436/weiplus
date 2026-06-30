package av5;

/* loaded from: classes16.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final cv5.a f14362a;

    /* renamed from: b, reason: collision with root package name */
    public int f14363b;

    /* renamed from: c, reason: collision with root package name */
    public int f14364c;

    /* renamed from: d, reason: collision with root package name */
    public int f14365d;

    public d0(cv5.a aVar, int i17) {
        this.f14362a = aVar;
        this.f14363b = i17;
    }

    public final void a(int i17) {
        if (b() != i17) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Expected %x but was %x", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b())));
        }
    }

    public int b() {
        if (this.f14363b == -1) {
            int readByte = this.f14362a.readByte() & 255;
            this.f14363b = readByte & 31;
            this.f14365d = (readByte & 224) >> 5;
        }
        return this.f14363b;
    }

    public int c() {
        a(28);
        this.f14363b = -1;
        return av5.f0.b(this.f14362a);
    }

    public double d() {
        a(17);
        this.f14363b = -1;
        long j17 = 0;
        for (int i17 = this.f14365d; i17 >= 0; i17--) {
            j17 = (j17 >>> 8) | ((this.f14362a.readByte() & 255) << 56);
        }
        return java.lang.Double.longBitsToDouble(j17);
    }

    public long e() {
        a(6);
        this.f14363b = -1;
        int i17 = this.f14365d;
        long j17 = 0;
        for (int i18 = i17; i18 >= 0; i18--) {
            j17 = (j17 >>> 8) | ((this.f14362a.readByte() & 255) << 56);
        }
        return j17 >> ((7 - i17) * 8);
    }

    public void f() {
        int b17 = b();
        int i17 = 0;
        cv5.a aVar = this.f14362a;
        if (b17 == 0) {
            a(0);
            this.f14363b = -1;
            av5.c0.a(aVar, this.f14365d);
            return;
        }
        if (b17 == 6) {
            e();
            return;
        }
        if (b17 == 2) {
            a(2);
            this.f14363b = -1;
            av5.c0.a(aVar, this.f14365d);
            return;
        }
        if (b17 == 3) {
            a(3);
            this.f14363b = -1;
            av5.c0.b(aVar, this.f14365d, false);
            return;
        }
        if (b17 == 4) {
            a(4);
            this.f14363b = -1;
            av5.c0.a(aVar, this.f14365d);
            return;
        }
        if (b17 == 16) {
            a(16);
            this.f14363b = -1;
            java.lang.Float.intBitsToFloat(av5.c0.b(aVar, this.f14365d, true));
            return;
        }
        if (b17 == 17) {
            d();
            return;
        }
        switch (b17) {
            case 21:
                a(21);
                this.f14363b = -1;
                av5.c0.b(aVar, this.f14365d, false);
                return;
            case 22:
                a(22);
                this.f14363b = -1;
                av5.c0.b(aVar, this.f14365d, false);
                return;
            case 23:
                a(23);
                this.f14363b = -1;
                av5.c0.b(aVar, this.f14365d, false);
                return;
            case 24:
                a(24);
                this.f14363b = -1;
                av5.c0.b(aVar, this.f14365d, false);
                return;
            case 25:
                a(25);
                this.f14363b = -1;
                av5.c0.b(aVar, this.f14365d, false);
                return;
            case 26:
                a(26);
                this.f14363b = -1;
                av5.c0.b(aVar, this.f14365d, false);
                return;
            case 27:
                a(27);
                this.f14363b = -1;
                av5.c0.b(aVar, this.f14365d, false);
                return;
            case 28:
                a(28);
                this.f14363b = -1;
                int b18 = av5.f0.b(aVar);
                while (i17 < b18) {
                    f();
                    i17++;
                }
                return;
            case 29:
                a(29);
                this.f14363b = -1;
                this.f14364c = av5.f0.b(aVar);
                int b19 = av5.f0.b(aVar);
                while (i17 < b19) {
                    av5.f0.b(aVar);
                    f();
                    i17++;
                }
                return;
            case 30:
                a(30);
                this.f14363b = -1;
                return;
            case 31:
                a(31);
                this.f14363b = -1;
                return;
            default:
                throw new av5.z("Unexpected type: " + java.lang.Integer.toHexString(this.f14363b));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(av5.b0 b0Var, int i17) {
        this(new av5.a0(b0Var), i17);
        b0Var.getClass();
    }
}
