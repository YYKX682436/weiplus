package hu3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f366615a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366616b;

    /* renamed from: c, reason: collision with root package name */
    public int f366617c;

    public a(int i17, int i18) {
        this.f366615a = i17;
        this.f366616b = i18;
    }

    /* renamed from: equals */
    public boolean m134153xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.a)) {
            return false;
        }
        hu3.a aVar = (hu3.a) obj;
        return this.f366615a == aVar.f366615a && this.f366616b == aVar.f366616b;
    }

    /* renamed from: hashCode */
    public int m134154x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f366615a) * 31) + java.lang.Integer.hashCode(this.f366616b);
    }

    /* renamed from: toString */
    public java.lang.String m134155x9616526c() {
        return "AudioConfig(sampleRate=" + this.f366615a + ", channelCount=" + this.f366616b + ')';
    }
}
