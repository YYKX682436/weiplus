package il4;

/* loaded from: classes9.dex */
public class b extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f373629b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f373630c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373631d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373632e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o50 f373633f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v70 f373634g;

    @Override // ot0.h
    public ot0.h a() {
        il4.b bVar = new il4.b();
        bVar.f373629b = this.f373629b;
        bVar.f373630c = this.f373630c;
        bVar.f373631d = this.f373631d;
        bVar.f373632e = this.f373632e;
        bVar.f373633f = this.f373633f;
        bVar.f373634g = this.f373634g;
        return bVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<tingChatRoomItem>");
        sb6.append("<type>");
        sb6.append(this.f373629b);
        sb6.append("</type>");
        sb6.append("<categoryItem>");
        sb6.append(this.f373630c);
        sb6.append("</categoryItem>");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f373632e)) {
            sb6.append("<categoryId>");
            sb6.append(this.f373632e);
            sb6.append("</categoryId>");
        } else if (this.f373633f != null) {
            sb6.append("<categoryId>");
            java.lang.String c17 = this.f373633f.c();
            if (c17 == null) {
                c17 = "";
            }
            sb6.append(c17);
            sb6.append("</categoryId>");
        }
        sb6.append("<listenItem>");
        sb6.append(this.f373631d);
        sb6.append("</listenItem>");
        sb6.append("</tingChatRoomItem>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f373630c = (java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.categoryItem");
        this.f373629b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.type"), 0);
        this.f373632e = (java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.categoryId");
        this.f373631d = (java.lang.String) map.get(".msg.appmsg.tingChatRoomItem.listenItem");
        this.f373633f = il4.d.v(this.f373630c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f373632e)) {
            bw5.o50 o50Var = this.f373633f;
            this.f373632e = o50Var != null ? o50Var.c() : "";
        }
        this.f373634g = il4.d.w(this.f373631d);
    }
}
