package bk4;

/* loaded from: classes11.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f21558a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f21559b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f21560c;

    public t(java.lang.String prefix, java.util.Map xmlMap) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(xmlMap, "xmlMap");
        java.lang.String str = (java.lang.String) xmlMap.get(prefix.concat(".$categoryId"));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String z18 = com.tencent.mm.sdk.platformtools.t8.z1(str == null ? "" : str, "");
        kotlin.jvm.internal.o.f(z18, "safeFormatString(...)");
        this.f21558a = z18;
        this.f21559b = new java.util.LinkedList();
        this.f21560c = new java.util.HashMap();
        java.lang.String concat = prefix.concat(".iconArray.iconItem");
        java.lang.String str2 = concat;
        int i17 = 1;
        while (xmlMap.get(str2) != null) {
            bk4.u uVar = new bk4.u(str2, xmlMap);
            str2 = concat + i17;
            i17++;
            this.f21559b.add(uVar);
            bk4.y yVar = bk4.y.f21618a;
            bk4.y.f21619b.put(uVar.f21567a, uVar);
        }
        bk4.y.f21618a.b0(this.f21560c, xmlMap, prefix.concat(".description"));
    }
}
