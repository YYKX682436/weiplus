package kz5;

/* loaded from: classes5.dex */
public abstract class o extends kz5.b implements java.util.Set {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set other = (java.util.Set) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (size() != other.size()) {
            return false;
        }
        return containsAll(other);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        java.util.Iterator<E> it = iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i17 += next != null ? next.hashCode() : 0;
        }
        return i17;
    }
}
