package mm2;

/* loaded from: classes10.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410716a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f410717b;

    public j7(java.lang.String str, java.lang.String str2) {
        this.f410716a = str;
        this.f410717b = str2;
    }

    public final boolean a() {
        java.lang.String str = this.f410716a;
        if (!(str == null || str.length() == 0)) {
            return false;
        }
        java.lang.String str2 = this.f410717b;
        return str2 == null || str2.length() == 0;
    }

    /* renamed from: equals */
    public boolean m147975xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.j7)) {
            return false;
        }
        mm2.j7 j7Var = (mm2.j7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410716a, j7Var.f410716a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410717b, j7Var.f410717b);
    }

    /* renamed from: hashCode */
    public int m147976x8cdac1b() {
        java.lang.String str = this.f410716a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f410717b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m147977x9616526c() {
        return "SingSongPanelLocateInfo(songName=" + this.f410716a + ", uniqueAddId=" + this.f410717b + ')';
    }
}
