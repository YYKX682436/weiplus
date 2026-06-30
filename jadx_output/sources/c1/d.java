package c1;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f37732a;

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof c1.d) {
            return this.f37732a == ((c1.d) obj).f37732a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f37732a);
    }

    public java.lang.String toString() {
        int i17 = this.f37732a;
        if (i17 == 1) {
            return "Next";
        }
        if (i17 == 2) {
            return "Previous";
        }
        if (i17 == 3) {
            return "Left";
        }
        if (i17 == 4) {
            return "Right";
        }
        if (i17 == 5) {
            return "Up";
        }
        if (i17 == 6) {
            return "Down";
        }
        if (i17 == 7) {
            return "In";
        }
        return i17 == 8 ? "Out" : "Invalid FocusDirection";
    }
}
