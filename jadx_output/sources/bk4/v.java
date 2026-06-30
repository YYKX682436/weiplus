package bk4;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f21589a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f21590b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f21591c;

    public v(java.util.Map xmlMap) {
        kotlin.jvm.internal.o.g(xmlMap, "xmlMap");
        this.f21589a = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) xmlMap.get(".textStateResource.version"), 0);
        this.f21590b = new java.util.LinkedList();
        java.lang.String str = ".textStateResource.categoryArray.categoryItem";
        int i17 = 1;
        while (xmlMap.get(str) != null) {
            bk4.t tVar = new bk4.t(str, xmlMap);
            str = ".textStateResource.categoryArray.categoryItem" + i17;
            i17++;
            this.f21590b.add(tVar);
        }
        this.f21591c = new java.util.LinkedList();
        java.lang.String str2 = ".textStateResource.otherIcons.iconArray.iconItem";
        int i18 = 1;
        while (xmlMap.get(str2) != null) {
            bk4.u uVar = new bk4.u(str2, xmlMap);
            str2 = ".textStateResource.otherIcons.iconArray.iconItem" + i18;
            i18++;
            this.f21591c.add(uVar);
            bk4.y yVar = bk4.y.f21618a;
            bk4.y.f21619b.put(uVar.f21567a, uVar);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InitStatusResItem categories:");
        sb6.append(this.f21590b.size());
        sb6.append(" iconItemMap:");
        bk4.y yVar2 = bk4.y.f21618a;
        sb6.append(bk4.y.f21619b.size());
        sb6.append(" hideItems:");
        sb6.append(this.f21591c.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusIconHelper", sb6.toString());
    }
}
