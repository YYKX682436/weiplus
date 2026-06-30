package f1;

/* loaded from: classes14.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final double f340068a;

    /* renamed from: b, reason: collision with root package name */
    public final double f340069b;

    /* renamed from: c, reason: collision with root package name */
    public final double f340070c;

    /* renamed from: d, reason: collision with root package name */
    public final double f340071d;

    /* renamed from: e, reason: collision with root package name */
    public final double f340072e;

    /* renamed from: f, reason: collision with root package name */
    public final double f340073f;

    /* renamed from: g, reason: collision with root package name */
    public final double f340074g;

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if ((r17 == 0.0d) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        if ((r17 == r7) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(double r17, double r19, double r21, double r23, double r25, double r27, double r29, int r31, p3321xbce91901.jvm.p3324x21ffc6bd.i r32) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.z.<init>(double, double, double, double, double, double, double, int, kotlin.jvm.internal.i):void");
    }

    /* renamed from: equals */
    public boolean m128685xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1.z)) {
            return false;
        }
        f1.z zVar = (f1.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f340068a), java.lang.Double.valueOf(zVar.f340068a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f340069b), java.lang.Double.valueOf(zVar.f340069b)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f340070c), java.lang.Double.valueOf(zVar.f340070c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f340071d), java.lang.Double.valueOf(zVar.f340071d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f340072e), java.lang.Double.valueOf(zVar.f340072e)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f340073f), java.lang.Double.valueOf(zVar.f340073f)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Double.valueOf(this.f340074g), java.lang.Double.valueOf(zVar.f340074g));
    }

    /* renamed from: hashCode */
    public int m128686x8cdac1b() {
        return (((((((((((java.lang.Double.hashCode(this.f340068a) * 31) + java.lang.Double.hashCode(this.f340069b)) * 31) + java.lang.Double.hashCode(this.f340070c)) * 31) + java.lang.Double.hashCode(this.f340071d)) * 31) + java.lang.Double.hashCode(this.f340072e)) * 31) + java.lang.Double.hashCode(this.f340073f)) * 31) + java.lang.Double.hashCode(this.f340074g);
    }

    /* renamed from: toString */
    public java.lang.String m128687x9616526c() {
        return "TransferParameters(gamma=" + this.f340068a + ", a=" + this.f340069b + ", b=" + this.f340070c + ", c=" + this.f340071d + ", d=" + this.f340072e + ", e=" + this.f340073f + ", f=" + this.f340074g + ')';
    }
}
