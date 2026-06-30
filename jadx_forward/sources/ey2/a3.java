package ey2;

/* loaded from: classes2.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f338854a;

    /* renamed from: b, reason: collision with root package name */
    public final long f338855b;

    public a3(java.util.ArrayList data, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        data = (i17 & 1) != 0 ? new java.util.ArrayList() : data;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f338854a = data;
        this.f338855b = j17;
    }

    /* renamed from: equals */
    public boolean m128322xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.a3)) {
            return false;
        }
        ey2.a3 a3Var = (ey2.a3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338854a, a3Var.f338854a) && this.f338855b == a3Var.f338855b;
    }

    /* renamed from: hashCode */
    public int m128323x8cdac1b() {
        return (this.f338854a.hashCode() * 31) + java.lang.Long.hashCode(this.f338855b);
    }

    /* renamed from: toString */
    public java.lang.String m128324x9616526c() {
        return "SubTabCache(data=" + this.f338854a + ", timestamp=" + this.f338855b + ')';
    }
}
