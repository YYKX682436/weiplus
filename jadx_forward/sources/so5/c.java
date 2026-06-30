package so5;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f492332a;

    public c(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f492332a = (i18 & 1) != 0 ? 0 : i17;
    }

    /* renamed from: equals */
    public boolean m165002xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so5.c) && this.f492332a == ((so5.c) obj).f492332a;
    }

    /* renamed from: hashCode */
    public int m165003x8cdac1b() {
        return java.lang.Integer.hashCode(this.f492332a);
    }

    /* renamed from: toString */
    public java.lang.String m165004x9616526c() {
        return "CodecErrorInfo(errorNum=" + this.f492332a + ')';
    }
}
