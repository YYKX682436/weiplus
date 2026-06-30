package c53;

/* loaded from: classes9.dex */
public class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f120177b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f120178c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f120179d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f120180e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f120181f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f120182g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f120183h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f120184i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f120185j;

    @Override // ot0.h
    public ot0.h a() {
        c53.a aVar = new c53.a();
        aVar.f120177b = this.f120177b;
        aVar.f120178c = this.f120178c;
        aVar.f120179d = this.f120179d;
        aVar.f120180e = this.f120180e;
        aVar.f120181f = this.f120181f;
        aVar.f120182g = this.f120182g;
        aVar.f120183h = this.f120183h;
        aVar.f120184i = this.f120184i;
        aVar.f120185j = this.f120185j;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<gamecenter>");
        sb6.append("<namecard>");
        sb6.append("<iconUrl>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120177b));
        sb6.append("</iconUrl>");
        sb6.append("<name>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120178c));
        sb6.append("</name>");
        sb6.append("<desc>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120179d));
        sb6.append("</desc>");
        sb6.append("<tail>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120180e));
        sb6.append("</tail>");
        sb6.append("<jumpUrl>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120181f));
        sb6.append("</jumpUrl>");
        sb6.append("<liteappId>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120182g));
        sb6.append("</liteappId>");
        sb6.append("<liteappPath>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120183h));
        sb6.append("</liteappPath>");
        sb6.append("<liteappQuery>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120184i));
        sb6.append("</liteappQuery>");
        sb6.append("<liteappMinVersion>");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(this.f120185j));
        sb6.append("</liteappMinVersion>");
        sb6.append("</namecard>");
        sb6.append("</gamecenter>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (map.get(".msg.appmsg.gamecenter.namecard") != null) {
            this.f120177b = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.iconUrl");
            this.f120178c = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.name");
            this.f120179d = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.desc");
            this.f120180e = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.tail");
            this.f120181f = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.jumpUrl");
            this.f120182g = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappId");
            this.f120183h = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappPath");
            this.f120184i = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappQuery");
            this.f120185j = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappMinVersion");
        }
    }
}
