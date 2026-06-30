package e1;

/* loaded from: classes14.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e1.z0 f327859d = new e1.z0(0, 0, 0.0f, 7, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f327860a;

    /* renamed from: b, reason: collision with root package name */
    public final long f327861b;

    /* renamed from: c, reason: collision with root package name */
    public final float f327862c;

    public z0(long j17, long j18, float f17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f327860a = j17;
        this.f327861b = j18;
        this.f327862c = f17;
    }

    /* renamed from: equals */
    public boolean m126680xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1.z0)) {
            return false;
        }
        e1.z0 z0Var = (e1.z0) obj;
        if (e1.y.c(this.f327860a, z0Var.f327860a) && d1.e.a(this.f327861b, z0Var.f327861b)) {
            return (this.f327862c > z0Var.f327862c ? 1 : (this.f327862c == z0Var.f327862c ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m126681x8cdac1b() {
        int i17 = e1.y.f327854l;
        int hashCode = java.lang.Long.hashCode(this.f327860a) * 31;
        int i18 = d1.e.f307159e;
        return ((hashCode + java.lang.Long.hashCode(this.f327861b)) * 31) + java.lang.Float.hashCode(this.f327862c);
    }

    /* renamed from: toString */
    public java.lang.String m126682x9616526c() {
        return "Shadow(color=" + ((java.lang.Object) e1.y.i(this.f327860a)) + ", offset=" + ((java.lang.Object) d1.e.h(this.f327861b)) + ", blurRadius=" + this.f327862c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(long r8, long r10, float r12, int r13, p3321xbce91901.jvm.p3324x21ffc6bd.i r14) {
        /*
            r7 = this;
            r14 = r13 & 1
            if (r14 == 0) goto Ld
            r8 = 4278190080(0xff000000, double:2.113706745E-314)
            long r8 = e1.a0.c(r8)
        Ld:
            r1 = r8
            r8 = r13 & 2
            if (r8 == 0) goto L16
            int r8 = d1.e.f307159e
            long r10 = d1.e.f307156b
        L16:
            r3 = r10
            r8 = r13 & 4
            if (r8 == 0) goto L1c
            r12 = 0
        L1c:
            r5 = r12
            r6 = 0
            r0 = r7
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.z0.<init>(long, long, float, int, kotlin.jvm.internal.i):void");
    }
}
