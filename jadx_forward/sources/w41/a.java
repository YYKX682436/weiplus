package w41;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f524378a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f524379b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f524380c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f524381d;

    public a(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.String str, java.lang.String str2) {
        this.f524378a = charSequence;
        this.f524379b = charSequence2;
        this.f524380c = str;
        this.f524381d = str2;
    }

    /* renamed from: equals */
    public boolean m173201xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w41.a)) {
            return false;
        }
        w41.a aVar = (w41.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524378a, aVar.f524378a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524379b, aVar.f524379b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524380c, aVar.f524380c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524381d, aVar.f524381d);
    }

    /* renamed from: hashCode */
    public int m173202x8cdac1b() {
        java.lang.CharSequence charSequence = this.f524378a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        java.lang.CharSequence charSequence2 = this.f524379b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        java.lang.String str = this.f524380c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f524381d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m173203x9616526c() {
        return "OpenIMConfirmDialogData(name=" + ((java.lang.Object) this.f524378a) + ", companyName=" + ((java.lang.Object) this.f524379b) + ", userName=" + this.f524380c + ", spamWording=" + this.f524381d + ')';
    }
}
