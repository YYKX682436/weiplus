package gr5;

/* loaded from: classes8.dex */
public final class d0 implements gr5.c0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f356446b;

    /* renamed from: c, reason: collision with root package name */
    public final float f356447c;

    public d0(float f17, float f18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 1) != 0 ? 2.5f : f17;
        f18 = (i17 & 2) != 0 ? 5.0f : f18;
        this.f356446b = f17;
        this.f356447c = f18;
    }

    /* renamed from: equals */
    public boolean m132092xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gr5.d0.class != obj.getClass()) {
            return false;
        }
        gr5.d0 d0Var = (gr5.d0) obj;
        if (this.f356446b == d0Var.f356446b) {
            return (this.f356447c > d0Var.f356447c ? 1 : (this.f356447c == d0Var.f356447c ? 0 : -1)) == 0;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m132093x8cdac1b() {
        return (java.lang.Float.hashCode(this.f356446b) * 31) + java.lang.Float.hashCode(this.f356447c);
    }

    /* renamed from: toString */
    public java.lang.String m132094x9616526c() {
        return "LongImageDecider(" + this.f356446b + ':' + this.f356447c + ')';
    }
}
