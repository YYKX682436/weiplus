package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f11959a;

    /* renamed from: b, reason: collision with root package name */
    public int f11960b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f11961c;

    /* renamed from: d, reason: collision with root package name */
    public int f11962d;

    public b(int i17, int i18, int i19, java.lang.Object obj) {
        this.f11959a = i17;
        this.f11960b = i18;
        this.f11962d = i19;
        this.f11961c = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || androidx.recyclerview.widget.b.class != obj.getClass()) {
            return false;
        }
        androidx.recyclerview.widget.b bVar = (androidx.recyclerview.widget.b) obj;
        int i17 = this.f11959a;
        if (i17 != bVar.f11959a) {
            return false;
        }
        if (i17 == 8 && java.lang.Math.abs(this.f11962d - this.f11960b) == 1 && this.f11962d == bVar.f11960b && this.f11960b == bVar.f11962d) {
            return true;
        }
        if (this.f11962d != bVar.f11962d || this.f11960b != bVar.f11960b) {
            return false;
        }
        java.lang.Object obj2 = this.f11961c;
        if (obj2 != null) {
            if (!obj2.equals(bVar.f11961c)) {
                return false;
            }
        } else if (bVar.f11961c != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f11959a * 31) + this.f11960b) * 31) + this.f11962d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb6.append("[");
        int i17 = this.f11959a;
        sb6.append(i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb6.append(",s:");
        sb6.append(this.f11960b);
        sb6.append("c:");
        sb6.append(this.f11962d);
        sb6.append(",p:");
        sb6.append(this.f11961c);
        sb6.append("]");
        return sb6.toString();
    }
}
