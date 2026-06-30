package oc3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f425864a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f425865b;

    public c(java.lang.String instanceName, java.lang.String callerProcessName, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        callerProcessName = (i17 & 2) != 0 ? "" : callerProcessName;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callerProcessName, "callerProcessName");
        this.f425864a = instanceName;
        this.f425865b = callerProcessName;
    }

    public final java.lang.String a() {
        return this.f425864a;
    }

    /* renamed from: equals */
    public boolean m151032xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc3.c)) {
            return false;
        }
        oc3.c cVar = (oc3.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425864a, cVar.f425864a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425865b, cVar.f425865b);
    }

    /* renamed from: hashCode */
    public int m151033x8cdac1b() {
        return (this.f425864a.hashCode() * 31) + this.f425865b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151034x9616526c() {
        return "MBJsApiMetaInfo(instanceName=" + this.f425864a + ", callerProcessName=" + this.f425865b + ')';
    }
}
