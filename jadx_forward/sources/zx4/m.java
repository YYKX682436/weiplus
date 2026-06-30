package zx4;

/* loaded from: classes8.dex */
public final class m extends zx4.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f558699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        str = (i17 & 1) != 0 ? null : str;
        this.f558699a = str;
    }

    /* renamed from: equals */
    public boolean m179871xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx4.m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f558699a, ((zx4.m) obj).f558699a);
    }

    /* renamed from: hashCode */
    public int m179872x8cdac1b() {
        java.lang.String str = this.f558699a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179873x9616526c() {
        return "Failed(errMsg=" + this.f558699a + ')';
    }
}
