package il4;

/* loaded from: classes9.dex */
public class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f373625b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f373626c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373627d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.o50 f373628e;

    public static r45.km6 f(il4.a aVar) {
        r45.km6 km6Var = new r45.km6();
        if (aVar != null) {
            km6Var.f460371d = aVar.f373625b;
            km6Var.f460372e = aVar.f373626c;
            km6Var.f460373f = aVar.f373627d;
        }
        return km6Var;
    }

    @Override // ot0.h
    public ot0.h a() {
        il4.a aVar = new il4.a();
        aVar.f373625b = this.f373625b;
        aVar.f373626c = this.f373626c;
        aVar.f373627d = this.f373627d;
        aVar.f373628e = this.f373628e;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (this.f373625b > 0) {
            sb6.append("<tingCategoryItem>");
            sb6.append("<type>");
            sb6.append(this.f373625b);
            sb6.append("</type>");
            sb6.append("<categoryItem>");
            sb6.append(this.f373626c);
            sb6.append("</categoryItem>");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f373627d)) {
                sb6.append("<categoryId>");
                sb6.append(this.f373627d);
                sb6.append("</categoryId>");
            } else if (this.f373628e != null) {
                sb6.append("<categoryId>");
                java.lang.String c17 = this.f373628e.c();
                if (c17 == null) {
                    c17 = "";
                }
                sb6.append(c17);
                sb6.append("</categoryId>");
            }
            sb6.append("</tingCategoryItem>");
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f373626c = (java.lang.String) map.get(".msg.appmsg.tingCategoryItem.categoryItem");
        this.f373625b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msg.appmsg.tingCategoryItem.type"), 0);
        this.f373627d = (java.lang.String) map.get(".msg.appmsg.tingCategoryItem.categoryId");
        this.f373628e = il4.d.v(this.f373626c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f373627d)) {
            bw5.o50 o50Var = this.f373628e;
            this.f373627d = o50Var != null ? o50Var.c() : "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(qVar.f430187f);
    }
}
