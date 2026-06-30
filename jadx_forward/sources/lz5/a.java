package lz5;

/* loaded from: classes14.dex */
public abstract class a extends kz5.n {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        return ((lz5.n) this).f403951d.f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry element = (java.util.Map.Entry) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        lz5.m mVar = ((lz5.n) this).f403951d;
        mVar.getClass();
        mVar.c();
        int h17 = mVar.h(element.getKey());
        if (h17 < 0) {
            return false;
        }
        java.lang.Object[] objArr = mVar.f403939e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(objArr[h17], element.getValue())) {
            return false;
        }
        mVar.l(h17);
        return true;
    }
}
