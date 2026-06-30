package sc3;

/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f488030a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f488031b;

    public l1(java.lang.String instanceName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f488030a = instanceName;
        this.f488031b = z17;
    }

    /* renamed from: equals */
    public boolean m164295xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc3.l1)) {
            return false;
        }
        sc3.l1 l1Var = (sc3.l1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488030a, l1Var.f488030a) && this.f488031b == l1Var.f488031b;
    }

    /* renamed from: hashCode */
    public int m164296x8cdac1b() {
        return (this.f488030a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f488031b);
    }

    /* renamed from: toString */
    public java.lang.String m164297x9616526c() {
        return "InstanceWithState(instanceName=" + this.f488030a + ", isPause=" + this.f488031b + ')';
    }
}
