package lc3;

/* loaded from: classes7.dex */
public final class m0 extends lc3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.String wxaPath) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaPath, "wxaPath");
        this.f399443a = wxaPath;
    }

    /* renamed from: equals */
    public boolean m145580xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.m0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399443a, ((lc3.m0) obj).f399443a);
    }

    /* renamed from: hashCode */
    public int m145581x8cdac1b() {
        return this.f399443a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145582x9616526c() {
        return "FilePkgFsDescriptor(wxaPath=" + this.f399443a + ')';
    }
}
