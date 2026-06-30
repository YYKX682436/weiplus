package dw3;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f325745a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f325746b;

    public h0(boolean z17, java.lang.String extData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extData, "extData");
        this.f325745a = z17;
        this.f325746b = extData;
    }

    /* renamed from: equals */
    public boolean m126357xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw3.h0)) {
            return false;
        }
        dw3.h0 h0Var = (dw3.h0) obj;
        return this.f325745a == h0Var.f325745a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325746b, h0Var.f325746b);
    }

    /* renamed from: hashCode */
    public int m126358x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f325745a) * 31) + this.f325746b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126359x9616526c() {
        return "Result(exist=" + this.f325745a + ", extData=" + this.f325746b + ')';
    }
}
