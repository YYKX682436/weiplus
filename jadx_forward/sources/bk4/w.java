package bk4;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f103128a;

    public w(java.lang.String prefix, java.util.Map xmlMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlMap, "xmlMap");
        this.f103128a = new java.util.LinkedList();
        java.lang.String concat = prefix.concat(".styleItem");
        int i17 = 1;
        while (xmlMap.get(concat) != null) {
            bk4.x xVar = new bk4.x(concat, xmlMap);
            concat = prefix + i17;
            i17++;
            this.f103128a.add(xVar);
        }
    }
}
