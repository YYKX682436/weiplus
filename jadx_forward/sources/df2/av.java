package df2;

/* loaded from: classes3.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    public long f311286a;

    /* renamed from: b, reason: collision with root package name */
    public int f311287b;

    public av(long j17, int i17, long j18, int i18) {
        this.f311286a = j18;
        this.f311287b = i18;
    }

    /* renamed from: equals */
    public boolean m124169xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.av)) {
            return false;
        }
        df2.av avVar = (df2.av) obj;
        avVar.getClass();
        return this.f311286a == avVar.f311286a && this.f311287b == avVar.f311287b;
    }

    /* renamed from: hashCode */
    public int m124170x8cdac1b() {
        return (((((java.lang.Long.hashCode(0L) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Long.hashCode(this.f311286a)) * 31) + java.lang.Integer.hashCode(this.f311287b);
    }

    /* renamed from: toString */
    public java.lang.String m124171x9616526c() {
        return "VisibleModifyInfo(lastChangeToVisibleTimeStamp=0, fastChangeToVisibleTimes=0, lastChangeToInvisibleTimes=" + this.f311286a + ", fastChangeToInvisibleTimes=" + this.f311287b + ')';
    }
}
