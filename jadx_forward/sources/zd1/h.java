package zd1;

/* loaded from: classes7.dex */
public final class h extends zd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f553065a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        str = (i17 & 1) != 0 ? null : str;
        this.f553065a = str;
    }

    /* renamed from: equals */
    public boolean m178714xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd1.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f553065a, ((zd1.h) obj).f553065a);
    }

    /* renamed from: hashCode */
    public int m178715x8cdac1b() {
        java.lang.String str = this.f553065a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m178716x9616526c() {
        return "Failed(errMsg=" + this.f553065a + ')';
    }
}
