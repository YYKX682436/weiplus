package q7;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Class f441839a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Class f441840b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Class f441841c;

    public m(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3) {
        this.f441839a = cls;
        this.f441840b = cls2;
        this.f441841c = cls3;
    }

    /* renamed from: equals */
    public boolean m159553xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q7.m.class != obj.getClass()) {
            return false;
        }
        q7.m mVar = (q7.m) obj;
        return this.f441839a.equals(mVar.f441839a) && this.f441840b.equals(mVar.f441840b) && q7.p.a(this.f441841c, mVar.f441841c);
    }

    /* renamed from: hashCode */
    public int m159554x8cdac1b() {
        int hashCode = ((this.f441839a.hashCode() * 31) + this.f441840b.hashCode()) * 31;
        java.lang.Class cls = this.f441841c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m159555x9616526c() {
        return "MultiClassKey{first=" + this.f441839a + ", second=" + this.f441840b + '}';
    }
}
