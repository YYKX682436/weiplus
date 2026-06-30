package rn2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f479177a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f479178b;

    /* renamed from: c, reason: collision with root package name */
    public final int f479179c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f479180d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f479181e;

    /* renamed from: f, reason: collision with root package name */
    public final int f479182f;

    /* renamed from: g, reason: collision with root package name */
    public int f479183g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f479184h;

    public b(java.lang.String title, java.lang.String desc, int i17, boolean z17, boolean z18, int i18, int i19, java.lang.String unableDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unableDesc, "unableDesc");
        this.f479177a = title;
        this.f479178b = desc;
        this.f479179c = i17;
        this.f479180d = z17;
        this.f479181e = z18;
        this.f479182f = i18;
        this.f479183g = i19;
        this.f479184h = unableDesc;
    }

    /* renamed from: equals */
    public boolean m162752xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn2.b)) {
            return false;
        }
        rn2.b bVar = (rn2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479177a, bVar.f479177a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479178b, bVar.f479178b) && this.f479179c == bVar.f479179c && this.f479180d == bVar.f479180d && this.f479181e == bVar.f479181e && this.f479182f == bVar.f479182f && this.f479183g == bVar.f479183g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f479184h, bVar.f479184h);
    }

    /* renamed from: hashCode */
    public int m162753x8cdac1b() {
        return (((((((((((((this.f479177a.hashCode() * 31) + this.f479178b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f479179c)) * 31) + java.lang.Boolean.hashCode(this.f479180d)) * 31) + java.lang.Boolean.hashCode(this.f479181e)) * 31) + java.lang.Integer.hashCode(this.f479182f)) * 31) + java.lang.Integer.hashCode(this.f479183g)) * 31) + this.f479184h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m162754x9616526c() {
        return "title:" + this.f479177a + "-:desc:" + this.f479178b + "-type:" + this.f479179c + "-state:" + this.f479180d + "-choose:" + this.f479181e + "-timeLimit:" + this.f479182f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.String r10, java.lang.String r11, int r12, boolean r13, boolean r14, int r15, int r16, java.lang.String r17, int r18, p3321xbce91901.jvm.p3324x21ffc6bd.i r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r10
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r11
        L12:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L19
            r4 = r5
            goto L1a
        L19:
            r4 = r12
        L1a:
            r6 = r0 & 8
            if (r6 == 0) goto L20
            r6 = r5
            goto L21
        L20:
            r6 = r13
        L21:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            goto L27
        L26:
            r5 = r14
        L27:
            r7 = r0 & 32
            if (r7 == 0) goto L33
            rn2.a r7 = rn2.e.f479228r
            r7.getClass()
            int r7 = rn2.e.f479229s
            goto L34
        L33:
            r7 = r15
        L34:
            r8 = r0 & 64
            if (r8 == 0) goto L3b
            r8 = 180(0xb4, float:2.52E-43)
            goto L3d
        L3b:
            r8 = r16
        L3d:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L42
            goto L44
        L42:
            r2 = r17
        L44:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r6
            r15 = r5
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.b.<init>(java.lang.String, java.lang.String, int, boolean, boolean, int, int, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
