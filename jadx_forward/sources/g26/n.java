package g26;

/* loaded from: classes16.dex */
public final class n extends f26.z0 implements i26.d {

    /* renamed from: e, reason: collision with root package name */
    public final i26.b f349529e;

    /* renamed from: f, reason: collision with root package name */
    public final g26.s f349530f;

    /* renamed from: g, reason: collision with root package name */
    public final f26.c3 f349531g;

    /* renamed from: h, reason: collision with root package name */
    public final f26.r1 f349532h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f349533i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f349534m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(i26.b r8, g26.s r9, f26.c3 r10, f26.r1 r11, boolean r12, boolean r13, int r14, p3321xbce91901.jvm.p3324x21ffc6bd.i r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto Lb
            f26.q1 r11 = f26.r1.f340747e
            r11.getClass()
            f26.r1 r11 = f26.r1.f340748f
        Lb:
            r4 = r11
            r11 = r14 & 16
            r15 = 0
            if (r11 == 0) goto L13
            r5 = r15
            goto L14
        L13:
            r5 = r12
        L14:
            r11 = r14 & 32
            if (r11 == 0) goto L1a
            r6 = r15
            goto L1b
        L1a:
            r6 = r13
        L1b:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g26.n.<init>(i26.b, g26.s, f26.c3, f26.r1, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // f26.z0, f26.c3
    public f26.c3 A0(boolean z17) {
        return new g26.n(this.f349529e, this.f349530f, this.f349531g, this.f349532h, z17, false, 32, null);
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        return new g26.n(this.f349529e, this.f349530f, this.f349531g, this.f349532h, z17, false, 32, null);
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return new g26.n(this.f349529e, this.f349530f, this.f349531g, newAttributes, this.f349533i, this.f349534m);
    }

    @Override // f26.o0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g26.n y0(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        i26.b bVar = this.f349529e;
        g26.s b17 = this.f349530f.b(kotlinTypeRefiner);
        f26.c3 c3Var = this.f349531g;
        return new g26.n(bVar, b17, c3Var != null ? c3Var.z0() : null, this.f349532h, this.f349533i, false, 32, null);
    }

    @Override // f26.o0
    public y16.s V() {
        return h26.m.a(h26.i.f359869e, true, new java.lang.String[0]);
    }

    @Override // f26.o0
    public java.util.List u0() {
        return kz5.p0.f395529d;
    }

    @Override // f26.o0
    public f26.r1 v0() {
        return this.f349532h;
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return this.f349530f;
    }

    @Override // f26.o0
    public boolean x0() {
        return this.f349533i;
    }

    public n(i26.b captureStatus, g26.s constructor, f26.c3 c3Var, f26.r1 attributes, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captureStatus, "captureStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(constructor, "constructor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributes, "attributes");
        this.f349529e = captureStatus;
        this.f349530f = constructor;
        this.f349531g = c3Var;
        this.f349532h = attributes;
        this.f349533i = z17;
        this.f349534m = z18;
    }
}
