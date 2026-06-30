package bk4;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f103091a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f103092b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f103093c;

    public t(java.lang.String prefix, java.util.Map xmlMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlMap, "xmlMap");
        java.lang.String str = (java.lang.String) xmlMap.get(prefix.concat(".$categoryId"));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(str == null ? "" : str, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z18, "safeFormatString(...)");
        this.f103091a = z18;
        this.f103092b = new java.util.LinkedList();
        this.f103093c = new java.util.HashMap();
        java.lang.String concat = prefix.concat(".iconArray.iconItem");
        java.lang.String str2 = concat;
        int i17 = 1;
        while (xmlMap.get(str2) != null) {
            bk4.u uVar = new bk4.u(str2, xmlMap);
            str2 = concat + i17;
            i17++;
            this.f103092b.add(uVar);
            bk4.y yVar = bk4.y.f103151a;
            bk4.y.f103152b.put(uVar.f103100a, uVar);
        }
        bk4.y.f103151a.b0(this.f103093c, xmlMap, prefix.concat(".description"));
    }
}
