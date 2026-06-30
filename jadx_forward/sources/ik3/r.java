package ik3;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f373444a;

    /* renamed from: b, reason: collision with root package name */
    public final int f373445b;

    public r(java.lang.String multiTaskId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskId, "multiTaskId");
        this.f373444a = multiTaskId;
        this.f373445b = i17;
    }

    /* renamed from: equals */
    public boolean m136698xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik3.r)) {
            return false;
        }
        ik3.r rVar = (ik3.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373444a, rVar.f373444a) && this.f373445b == rVar.f373445b;
    }

    /* renamed from: hashCode */
    public int m136699x8cdac1b() {
        return (this.f373444a.hashCode() * 31) + java.lang.Integer.hashCode(this.f373445b);
    }

    /* renamed from: toString */
    public java.lang.String m136700x9616526c() {
        return "MultiTaskKey(multiTaskId=" + this.f373444a + ", multiTaskType=" + this.f373445b + ')';
    }
}
