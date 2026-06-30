package aq;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f12826a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f12827b;

    public a(java.lang.String labelId, java.lang.String cropImagePath) {
        kotlin.jvm.internal.o.g(labelId, "labelId");
        kotlin.jvm.internal.o.g(cropImagePath, "cropImagePath");
        this.f12826a = labelId;
        this.f12827b = cropImagePath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.a)) {
            return false;
        }
        aq.a aVar = (aq.a) obj;
        return kotlin.jvm.internal.o.b(this.f12826a, aVar.f12826a) && kotlin.jvm.internal.o.b(this.f12827b, aVar.f12827b);
    }

    public int hashCode() {
        return (this.f12826a.hashCode() * 31) + this.f12827b.hashCode();
    }

    public java.lang.String toString() {
        return "CropImageItem(labelId=" + this.f12826a + ", cropImagePath=" + this.f12827b + ')';
    }
}
