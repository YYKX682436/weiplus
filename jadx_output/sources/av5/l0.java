package av5;

/* loaded from: classes16.dex */
public class l0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f14413e;

    public l0(int i17, java.lang.String str) {
        super(i17);
        this.f14413e = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f14413e.compareTo(((av5.l0) obj).f14413e);
    }

    @Override // av5.m0
    public boolean equals(java.lang.Object obj) {
        return (obj instanceof av5.l0) && this.f14413e.compareTo(((av5.l0) obj).f14413e) == 0;
    }

    @Override // av5.m0
    public int hashCode() {
        return this.f14413e.hashCode();
    }
}
