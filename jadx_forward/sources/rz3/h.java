package rz3;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f483345a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f483346b;

    public h(int i17, java.lang.Object obj) {
        this.f483345a = i17;
        this.f483346b = obj;
    }

    /* renamed from: equals */
    public boolean m163475xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz3.h)) {
            return false;
        }
        rz3.h hVar = (rz3.h) obj;
        return this.f483345a == hVar.f483345a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f483346b, hVar.f483346b);
    }

    /* renamed from: hashCode */
    public int m163476x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f483345a) * 31;
        java.lang.Object obj = this.f483346b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m163477x9616526c() {
        return "ScanCodeProductMergeData(type=" + this.f483345a + ", data=" + this.f483346b + ')';
    }
}
