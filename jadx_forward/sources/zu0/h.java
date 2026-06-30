package zu0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f557206a;

    public h(java.lang.Object obj) {
        this.f557206a = obj;
    }

    /* renamed from: equals */
    public boolean m179476xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu0.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557206a, ((zu0.h) obj).f557206a);
    }

    /* renamed from: hashCode */
    public int m179477x8cdac1b() {
        java.lang.Object obj = this.f557206a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179478x9616526c() {
        return "MaterialInfoPack(material=" + this.f557206a + ')';
    }
}
