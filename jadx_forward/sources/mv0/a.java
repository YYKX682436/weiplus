package mv0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final mv0.b f413060a;

    /* renamed from: b, reason: collision with root package name */
    public final int f413061b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413062c;

    public a(mv0.b ratio, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ratio, "ratio");
        this.f413060a = ratio;
        this.f413061b = i17;
        this.f413062c = z17;
    }

    public static mv0.a a(mv0.a aVar, mv0.b ratio, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            ratio = aVar.f413060a;
        }
        if ((i18 & 2) != 0) {
            i17 = aVar.f413061b;
        }
        if ((i18 & 4) != 0) {
            z17 = aVar.f413062c;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ratio, "ratio");
        return new mv0.a(ratio, i17, z17);
    }

    /* renamed from: equals */
    public boolean m148440xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0.a)) {
            return false;
        }
        mv0.a aVar = (mv0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413060a, aVar.f413060a) && this.f413061b == aVar.f413061b && this.f413062c == aVar.f413062c;
    }

    /* renamed from: hashCode */
    public int m148441x8cdac1b() {
        return (((this.f413060a.m148444x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f413061b)) * 31) + java.lang.Boolean.hashCode(this.f413062c);
    }

    /* renamed from: toString */
    public java.lang.String m148442x9616526c() {
        return "CanvasAspectRatioInfo(ratio=" + this.f413060a + ", iconRes=" + this.f413061b + ", isSelected=" + this.f413062c + ')';
    }

    public /* synthetic */ a(mv0.b bVar, int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(bVar, i17, (i18 & 4) != 0 ? false : z17);
    }
}
