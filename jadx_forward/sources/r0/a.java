package r0;

/* loaded from: classes14.dex */
public abstract class a extends kz5.n {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        java.lang.Object key = element.getKey();
        r0.f fVar = ((r0.h) this).f449511d;
        java.lang.Object obj2 = fVar.get(key);
        return obj2 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, element.getValue()) : element.getValue() == null && fVar.containsKey(element.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return ((r0.h) this).f449511d.remove(element.getKey(), element.getValue());
    }
}
