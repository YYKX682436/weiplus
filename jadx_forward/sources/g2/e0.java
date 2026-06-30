package g2;

/* loaded from: classes14.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f349226a;

    /* renamed from: b, reason: collision with root package name */
    public final long f349227b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.m1 f349228c;

    static {
        w0.b0.a(g2.c0.f349222d, g2.d0.f349223d);
    }

    public e0(a2.d dVar, long j17, a2.m1 m1Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        a2.m1 m1Var2;
        this.f349226a = dVar;
        this.f349227b = a2.n1.b(j17, 0, dVar.f82214d.length());
        if (m1Var != null) {
            m1Var2 = new a2.m1(a2.n1.b(m1Var.f82316a, 0, dVar.f82214d.length()));
        } else {
            m1Var2 = null;
        }
        this.f349228c = m1Var2;
    }

    public static g2.e0 a(g2.e0 e0Var, a2.d dVar, long j17, a2.m1 m1Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            dVar = e0Var.f349226a;
        }
        a2.d annotatedString = dVar;
        if ((i17 & 2) != 0) {
            j17 = e0Var.f349227b;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            m1Var = e0Var.f349228c;
        }
        e0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotatedString, "annotatedString");
        return new g2.e0(annotatedString, j18, m1Var, null);
    }

    /* renamed from: equals */
    public boolean m130685xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.e0)) {
            return false;
        }
        g2.e0 e0Var = (g2.e0) obj;
        return a2.m1.a(this.f349227b, e0Var.f349227b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349228c, e0Var.f349228c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349226a, e0Var.f349226a);
    }

    /* renamed from: hashCode */
    public int m130686x8cdac1b() {
        int m340x8cdac1b = this.f349226a.m340x8cdac1b() * 31;
        int i17 = a2.m1.f82315c;
        int hashCode = (m340x8cdac1b + java.lang.Long.hashCode(this.f349227b)) * 31;
        a2.m1 m1Var = this.f349228c;
        return hashCode + (m1Var != null ? java.lang.Long.hashCode(m1Var.f82316a) : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130687x9616526c() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.f349226a) + "', selection=" + ((java.lang.Object) a2.m1.h(this.f349227b)) + ", composition=" + this.f349228c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(a2.d r7, long r8, a2.m1 r10, int r11, p3321xbce91901.jvm.p3324x21ffc6bd.i r12) {
        /*
            r6 = this;
            r12 = r11 & 2
            if (r12 == 0) goto L8
            int r8 = a2.m1.f82315c
            long r8 = a2.m1.f82314b
        L8:
            r2 = r8
            r8 = r11 & 4
            if (r8 == 0) goto Le
            r10 = 0
        Le:
            r4 = r10
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.e0.<init>(a2.d, long, a2.m1, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(java.lang.String r9, long r10, a2.m1 r12, int r13, p3321xbce91901.jvm.p3324x21ffc6bd.i r14) {
        /*
            r8 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            java.lang.String r9 = ""
        L6:
            r1 = r9
            r9 = r13 & 2
            if (r9 == 0) goto Lf
            int r9 = a2.m1.f82315c
            long r10 = a2.m1.f82314b
        Lf:
            r9 = r13 & 4
            if (r9 == 0) goto L14
            r12 = 0
        L14:
            r6 = r12
            a2.d r9 = new a2.d
            r2 = 0
            r3 = 0
            r4 = 6
            r7 = 0
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.e0.<init>(java.lang.String, long, a2.m1, int, kotlin.jvm.internal.i):void");
    }
}
