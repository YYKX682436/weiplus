package ck0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f123829a;

    /* renamed from: b, reason: collision with root package name */
    public final float f123830b;

    public a(java.lang.String labelName, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelName, "labelName");
        this.f123829a = labelName;
        this.f123830b = f17;
    }

    /* renamed from: equals */
    public boolean m14976xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0.a)) {
            return false;
        }
        ck0.a aVar = (ck0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123829a, aVar.f123829a) && java.lang.Float.compare(this.f123830b, aVar.f123830b) == 0;
    }

    /* renamed from: hashCode */
    public int m14977x8cdac1b() {
        return (this.f123829a.hashCode() * 31) + java.lang.Float.hashCode(this.f123830b);
    }

    /* renamed from: toString */
    public java.lang.String m14978x9616526c() {
        return "ClsResult(labelName=" + this.f123829a + ", labelScore=" + this.f123830b + ')';
    }
}
