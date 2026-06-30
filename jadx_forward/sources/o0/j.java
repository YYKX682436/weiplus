package o0;

/* loaded from: classes5.dex */
public abstract class j {
    public static final void a(java.util.List list, int i17) {
        int size = list.size();
        if (i17 < 0 || i17 >= size) {
            throw new java.lang.IndexOutOfBoundsException("Index " + i17 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    public static final void b(java.util.List list, int i17, int i18) {
        int size = list.size();
        if (i17 > i18) {
            throw new java.lang.IllegalArgumentException("Indices are out of order. fromIndex (" + i17 + ") is greater than toIndex (" + i18 + ").");
        }
        if (i17 < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i17 + ") is less than 0.");
        }
        if (i18 <= size) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i18 + ") is more than than the list size (" + size + ')');
    }
}
