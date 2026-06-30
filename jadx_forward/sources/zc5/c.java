package zc5;

/* loaded from: classes12.dex */
public final class c extends zc5.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f552974a;

    public c(int i17) {
        super(null);
        this.f552974a = i17;
    }

    /* renamed from: equals */
    public boolean m178684xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc5.c) && this.f552974a == ((zc5.c) obj).f552974a;
    }

    /* renamed from: hashCode */
    public int m178685x8cdac1b() {
        return java.lang.Integer.hashCode(this.f552974a);
    }

    /* renamed from: toString */
    public java.lang.String m178686x9616526c() {
        return "Failed(errorCode=" + this.f552974a + ')';
    }

    public /* synthetic */ c(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17);
    }
}
