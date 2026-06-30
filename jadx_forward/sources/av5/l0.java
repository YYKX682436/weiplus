package av5;

/* loaded from: classes16.dex */
public class l0 extends av5.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f95946e;

    public l0(int i17, java.lang.String str) {
        super(i17);
        this.f95946e = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f95946e.compareTo(((av5.l0) obj).f95946e);
    }

    @Override // av5.m0
    /* renamed from: equals */
    public boolean mo9117xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof av5.l0) && this.f95946e.compareTo(((av5.l0) obj).f95946e) == 0;
    }

    @Override // av5.m0
    /* renamed from: hashCode */
    public int mo9118x8cdac1b() {
        return this.f95946e.hashCode();
    }
}
