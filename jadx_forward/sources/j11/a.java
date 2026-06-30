package j11;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f378629a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f378630b;

    public a(java.lang.String str, java.lang.String str2) {
        this.f378629a = str;
        this.f378630b = str2;
    }

    /* renamed from: equals */
    public boolean m140174xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j11.a)) {
            return false;
        }
        j11.a aVar = (j11.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f378629a, aVar.f378629a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f378630b, aVar.f378630b);
    }

    /* renamed from: hashCode */
    public int m140175x8cdac1b() {
        java.lang.String str = this.f378629a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f378630b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m140176x9616526c() {
        return "CustomSceneUser(user=" + this.f378629a + ", room=" + this.f378630b + ')';
    }
}
