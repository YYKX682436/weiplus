package hk0;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final hk0.l f363290a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f363291b;

    public k(hk0.l editType, java.lang.String editId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editType, "editType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editId, "editId");
        this.f363290a = editType;
        this.f363291b = editId;
    }

    /* renamed from: equals */
    public boolean m133644xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.k)) {
            return false;
        }
        hk0.k kVar = (hk0.k) obj;
        return this.f363290a == kVar.f363290a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363291b, kVar.f363291b);
    }

    /* renamed from: hashCode */
    public int m133645x8cdac1b() {
        return (this.f363290a.hashCode() * 31) + this.f363291b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133646x9616526c() {
        return "EditStateData(editType=" + this.f363290a + ", editId=" + this.f363291b + ')';
    }
}
