package aq;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f12849a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f12850b;

    public d(java.lang.String header, java.util.ArrayList imageDataList) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(imageDataList, "imageDataList");
        this.f12849a = header;
        this.f12850b = imageDataList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.d)) {
            return false;
        }
        aq.d dVar = (aq.d) obj;
        return kotlin.jvm.internal.o.b(this.f12849a, dVar.f12849a) && kotlin.jvm.internal.o.b(this.f12850b, dVar.f12850b);
    }

    public int hashCode() {
        return (this.f12849a.hashCode() * 31) + this.f12850b.hashCode();
    }

    public java.lang.String toString() {
        return "ImageDataListItem(header=" + this.f12849a + ", imageDataList=" + this.f12850b + ')';
    }
}
