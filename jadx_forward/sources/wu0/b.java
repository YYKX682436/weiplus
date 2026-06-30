package wu0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f531183a;

    /* renamed from: b, reason: collision with root package name */
    public final float f531184b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f531185c;

    public b(float f17, float f18, boolean z17) {
        this.f531183a = f17;
        this.f531184b = f18;
        this.f531185c = z17;
    }

    public static wu0.b a(wu0.b bVar, float f17, float f18, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = bVar.f531183a;
        }
        if ((i17 & 2) != 0) {
            f18 = bVar.f531184b;
        }
        if ((i17 & 4) != 0) {
            z17 = bVar.f531185c;
        }
        bVar.getClass();
        return new wu0.b(f17, f18, z17);
    }

    /* renamed from: equals */
    public boolean m174446xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu0.b)) {
            return false;
        }
        wu0.b bVar = (wu0.b) obj;
        return java.lang.Float.compare(this.f531183a, bVar.f531183a) == 0 && java.lang.Float.compare(this.f531184b, bVar.f531184b) == 0 && this.f531185c == bVar.f531185c;
    }

    /* renamed from: hashCode */
    public int m174447x8cdac1b() {
        return (((java.lang.Float.hashCode(this.f531183a) * 31) + java.lang.Float.hashCode(this.f531184b)) * 31) + java.lang.Boolean.hashCode(this.f531185c);
    }

    /* renamed from: toString */
    public java.lang.String m174448x9616526c() {
        return "ProgressData(buildProgress=" + this.f531183a + ", serviceProgress=" + this.f531184b + ", isRecorded=" + this.f531185c + ')';
    }

    public /* synthetic */ b(float f17, float f18, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) != 0 ? false : z17);
    }
}
