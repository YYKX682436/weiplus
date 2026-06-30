package at4;

/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f13865a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f13866b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f13867c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f13868d;

    public h0(java.lang.String title, java.lang.String wording, java.lang.String cancelBtn, java.lang.String confirmBtn) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(wording, "wording");
        kotlin.jvm.internal.o.g(cancelBtn, "cancelBtn");
        kotlin.jvm.internal.o.g(confirmBtn, "confirmBtn");
        this.f13865a = title;
        this.f13866b = wording;
        this.f13867c = cancelBtn;
        this.f13868d = confirmBtn;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at4.h0)) {
            return false;
        }
        at4.h0 h0Var = (at4.h0) obj;
        return kotlin.jvm.internal.o.b(this.f13865a, h0Var.f13865a) && kotlin.jvm.internal.o.b(this.f13866b, h0Var.f13866b) && kotlin.jvm.internal.o.b(this.f13867c, h0Var.f13867c) && kotlin.jvm.internal.o.b(this.f13868d, h0Var.f13868d);
    }

    public int hashCode() {
        return (((((this.f13865a.hashCode() * 31) + this.f13866b.hashCode()) * 31) + this.f13867c.hashCode()) * 31) + this.f13868d.hashCode();
    }

    public java.lang.String toString() {
        return "HalfPageDialog(title=" + this.f13865a + ", wording=" + this.f13866b + ", cancelBtn=" + this.f13867c + ", confirmBtn=" + this.f13868d + ')';
    }
}
