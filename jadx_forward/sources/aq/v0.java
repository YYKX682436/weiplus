package aq;

/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94519a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f94520b;

    public v0(java.lang.String labelName, java.util.List labelId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelName, "labelName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        this.f94519a = labelName;
        this.f94520b = labelId;
    }

    /* renamed from: equals */
    public boolean m8809xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.v0)) {
            return false;
        }
        aq.v0 v0Var = (aq.v0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94519a, v0Var.f94519a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94520b, v0Var.f94520b);
    }

    /* renamed from: hashCode */
    public int m8810x8cdac1b() {
        return (this.f94519a.hashCode() * 31) + this.f94520b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8811x9616526c() {
        return "SearchBarConnectListItem(labelName=" + this.f94519a + ", labelId=" + this.f94520b + ')';
    }
}
