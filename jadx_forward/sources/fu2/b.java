package fu2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f348407a;

    /* renamed from: b, reason: collision with root package name */
    public int f348408b;

    /* renamed from: c, reason: collision with root package name */
    public float f348409c;

    public b(long j17, int i17, float f17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i18 & 4) != 0 ? 1.0f : f17;
        this.f348407a = j17;
        this.f348408b = i17;
        this.f348409c = f17;
    }

    /* renamed from: equals */
    public boolean m130474xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2.b)) {
            return false;
        }
        fu2.b bVar = (fu2.b) obj;
        return this.f348407a == bVar.f348407a && this.f348408b == bVar.f348408b && java.lang.Float.compare(this.f348409c, bVar.f348409c) == 0;
    }

    /* renamed from: hashCode */
    public int m130475x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f348407a) * 31) + java.lang.Integer.hashCode(this.f348408b)) * 31) + java.lang.Float.hashCode(this.f348409c);
    }

    /* renamed from: toString */
    public java.lang.String m130476x9616526c() {
        return "StatusData(currentPlayMs=" + this.f348407a + ", currentSystemState=" + this.f348408b + ", playbackSpeed=" + this.f348409c + ')';
    }
}
