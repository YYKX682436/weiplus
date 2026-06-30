package m0;

/* loaded from: classes14.dex */
public abstract class i implements a0.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f404005a;

    /* renamed from: b, reason: collision with root package name */
    public final float f404006b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.e5 f404007c;

    public i(boolean z17, float f17, n0.e5 e5Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f404005a = z17;
        this.f404006b = f17;
        this.f404007c = e5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r4 == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012f, code lost:
    
        if (r4 == r7) goto L38;
     */
    @Override // a0.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.s1 a(c0.n r17, n0.o r18, int r19) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.i.a(c0.n, n0.o, int):a0.s1");
    }

    /* renamed from: equals */
    public boolean m146557xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0.i)) {
            return false;
        }
        m0.i iVar = (m0.i) obj;
        return this.f404005a == iVar.f404005a && p2.h.a(this.f404006b, iVar.f404006b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f404007c, iVar.f404007c);
    }

    /* renamed from: hashCode */
    public int m146558x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f404005a) * 31) + java.lang.Float.hashCode(this.f404006b)) * 31) + this.f404007c.hashCode();
    }
}
