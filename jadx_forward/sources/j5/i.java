package j5;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f379280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f379281b;

    public i(java.lang.String str, int i17) {
        this.f379280a = str;
        this.f379281b = i17;
    }

    /* renamed from: equals */
    public boolean m140345xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5.i)) {
            return false;
        }
        j5.i iVar = (j5.i) obj;
        if (this.f379281b != iVar.f379281b) {
            return false;
        }
        return this.f379280a.equals(iVar.f379280a);
    }

    /* renamed from: hashCode */
    public int m140346x8cdac1b() {
        return (this.f379280a.hashCode() * 31) + this.f379281b;
    }
}
