package gf5;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f352985a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f352986b;

    public t(java.util.Set startChars, java.util.Set bodyChars) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startChars, "startChars");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyChars, "bodyChars");
        this.f352985a = startChars;
        this.f352986b = bodyChars;
    }

    /* renamed from: equals */
    public boolean m131493xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.t)) {
            return false;
        }
        gf5.t tVar = (gf5.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352985a, tVar.f352985a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352986b, tVar.f352986b);
    }

    /* renamed from: hashCode */
    public int m131494x8cdac1b() {
        return (this.f352985a.hashCode() * 31) + this.f352986b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131495x9616526c() {
        return "NumberRule(startChars=" + this.f352985a + ", bodyChars=" + this.f352986b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(java.util.Set r4, java.util.Set r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r3 = this;
            r7 = r6 & 1
            r0 = 57
            r1 = 48
            if (r7 == 0) goto L11
            e06.c r4 = new e06.c
            r4.<init>(r1, r0)
            java.util.Set r4 = kz5.n0.X0(r4)
        L11:
            r7 = 2
            r6 = r6 & r7
            if (r6 == 0) goto Lc8
            lz5.q r5 = new lz5.q
            r5.<init>()
            e06.c r6 = new e06.c
            r6.<init>(r1, r0)
            kz5.h0.u(r5, r6)
            r6 = 14
            java.lang.Character[] r6 = new java.lang.Character[r6]
            r0 = 95
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1 = 0
            r6[r1] = r0
            r0 = 46
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1 = 1
            r6[r1] = r0
            r0 = 120(0x78, float:1.68E-43)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r6[r7] = r0
            r7 = 88
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r0 = 3
            r6[r0] = r7
            r7 = 98
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r0 = 4
            r6[r0] = r7
            r7 = 66
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r0 = 5
            r6[r0] = r7
            r7 = 76
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r0 = 6
            r6[r0] = r7
            r7 = 108(0x6c, float:1.51E-43)
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r0 = 7
            r6[r0] = r7
            r7 = 8
            r0 = 102(0x66, float:1.43E-43)
            java.lang.Character r1 = java.lang.Character.valueOf(r0)
            r6[r7] = r1
            r7 = 9
            r1 = 70
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            r6[r7] = r2
            r7 = 101(0x65, float:1.42E-43)
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r2 = 10
            r6[r2] = r7
            r7 = 69
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r2 = 11
            r6[r2] = r7
            r7 = 43
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r2 = 12
            r6[r2] = r7
            r7 = 45
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            r2 = 13
            r6[r2] = r7
            java.util.Set r6 = kz5.z.D0(r6)
            r5.addAll(r6)
            e06.c r6 = new e06.c
            r7 = 97
            r6.<init>(r7, r0)
            kz5.h0.u(r5, r6)
            e06.c r6 = new e06.c
            r7 = 65
            r6.<init>(r7, r1)
            kz5.h0.u(r5, r6)
            java.util.Set r5 = kz5.o1.a(r5)
        Lc8:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf5.t.<init>(java.util.Set, java.util.Set, int, kotlin.jvm.internal.i):void");
    }
}
