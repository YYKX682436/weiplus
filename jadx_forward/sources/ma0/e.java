package ma0;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f406665a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f406666b;

    public e(ma0.h hVar) {
    }

    /* renamed from: equals */
    public boolean m147089xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof ma0.e)) {
            return super.equals(obj);
        }
        ma0.e eVar = (ma0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406665a, eVar.f406665a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f406666b, eVar.f406666b);
    }

    /* renamed from: hashCode */
    public int m147090x8cdac1b() {
        java.lang.String str = this.f406665a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f406666b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
