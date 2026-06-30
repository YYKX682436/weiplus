package re2;

/* loaded from: classes3.dex */
public final class y extends re2.z {

    /* renamed from: a, reason: collision with root package name */
    public final long f476036a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476037b;

    public y(long j17, long j18) {
        super(null);
        this.f476036a = j17;
        this.f476037b = j18;
    }

    /* renamed from: equals */
    public boolean m162227xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re2.y)) {
            return false;
        }
        re2.y yVar = (re2.y) obj;
        return this.f476036a == yVar.f476036a && this.f476037b == yVar.f476037b;
    }

    /* renamed from: hashCode */
    public int m162228x8cdac1b() {
        return (java.lang.Long.hashCode(this.f476036a) * 31) + java.lang.Long.hashCode(this.f476037b);
    }

    /* renamed from: toString */
    public java.lang.String m162229x9616526c() {
        return "AnchorLiveStarted(objectId=" + this.f476036a + ", liveId=" + this.f476037b + ')';
    }
}
