package te2;

/* loaded from: classes14.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public x91.h f499832a;

    public p2(x91.h hVar) {
        this.f499832a = hVar;
    }

    /* renamed from: equals */
    public boolean m166320xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te2.p2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f499832a, ((te2.p2) obj).f499832a);
    }

    /* renamed from: hashCode */
    public int m166321x8cdac1b() {
        x91.h hVar = this.f499832a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166322x9616526c() {
        return "DeviceInfo(device=" + this.f499832a + ')';
    }
}
