package nv2;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f422156a;

    public x() {
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(synchronizedSet, "synchronizedSet(...)");
        this.f422156a = synchronizedSet;
    }

    /* renamed from: toString */
    public java.lang.String m150154x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f422156a.iterator();
        while (it.hasNext()) {
            sb6.append(((java.lang.String) it.next()) + ';');
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
