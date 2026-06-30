package bk4;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f103122a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f103123b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f103124c;

    public v(java.util.Map xmlMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlMap, "xmlMap");
        this.f103122a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) xmlMap.get(".textStateResource.version"), 0);
        this.f103123b = new java.util.LinkedList();
        java.lang.String str = ".textStateResource.categoryArray.categoryItem";
        int i17 = 1;
        while (xmlMap.get(str) != null) {
            bk4.t tVar = new bk4.t(str, xmlMap);
            str = ".textStateResource.categoryArray.categoryItem" + i17;
            i17++;
            this.f103123b.add(tVar);
        }
        this.f103124c = new java.util.LinkedList();
        java.lang.String str2 = ".textStateResource.otherIcons.iconArray.iconItem";
        int i18 = 1;
        while (xmlMap.get(str2) != null) {
            bk4.u uVar = new bk4.u(str2, xmlMap);
            str2 = ".textStateResource.otherIcons.iconArray.iconItem" + i18;
            i18++;
            this.f103124c.add(uVar);
            bk4.y yVar = bk4.y.f103151a;
            bk4.y.f103152b.put(uVar.f103100a, uVar);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InitStatusResItem categories:");
        sb6.append(this.f103123b.size());
        sb6.append(" iconItemMap:");
        bk4.y yVar2 = bk4.y.f103151a;
        sb6.append(bk4.y.f103152b.size());
        sb6.append(" hideItems:");
        sb6.append(this.f103124c.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusIconHelper", sb6.toString());
    }
}
