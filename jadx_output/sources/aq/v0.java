package aq;

/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f12986a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f12987b;

    public v0(java.lang.String labelName, java.util.List labelId) {
        kotlin.jvm.internal.o.g(labelName, "labelName");
        kotlin.jvm.internal.o.g(labelId, "labelId");
        this.f12986a = labelName;
        this.f12987b = labelId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.v0)) {
            return false;
        }
        aq.v0 v0Var = (aq.v0) obj;
        return kotlin.jvm.internal.o.b(this.f12986a, v0Var.f12986a) && kotlin.jvm.internal.o.b(this.f12987b, v0Var.f12987b);
    }

    public int hashCode() {
        return (this.f12986a.hashCode() * 31) + this.f12987b.hashCode();
    }

    public java.lang.String toString() {
        return "SearchBarConnectListItem(labelName=" + this.f12986a + ", labelId=" + this.f12987b + ')';
    }
}
