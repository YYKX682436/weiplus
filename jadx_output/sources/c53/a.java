package c53;

/* loaded from: classes9.dex */
public class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f38644b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f38645c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f38646d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f38647e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f38648f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f38649g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f38650h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f38651i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f38652j;

    @Override // ot0.h
    public ot0.h a() {
        c53.a aVar = new c53.a();
        aVar.f38644b = this.f38644b;
        aVar.f38645c = this.f38645c;
        aVar.f38646d = this.f38646d;
        aVar.f38647e = this.f38647e;
        aVar.f38648f = this.f38648f;
        aVar.f38649g = this.f38649g;
        aVar.f38650h = this.f38650h;
        aVar.f38651i = this.f38651i;
        aVar.f38652j = this.f38652j;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<gamecenter>");
        sb6.append("<namecard>");
        sb6.append("<iconUrl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38644b));
        sb6.append("</iconUrl>");
        sb6.append("<name>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38645c));
        sb6.append("</name>");
        sb6.append("<desc>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38646d));
        sb6.append("</desc>");
        sb6.append("<tail>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38647e));
        sb6.append("</tail>");
        sb6.append("<jumpUrl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38648f));
        sb6.append("</jumpUrl>");
        sb6.append("<liteappId>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38649g));
        sb6.append("</liteappId>");
        sb6.append("<liteappPath>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38650h));
        sb6.append("</liteappPath>");
        sb6.append("<liteappQuery>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38651i));
        sb6.append("</liteappQuery>");
        sb6.append("<liteappMinVersion>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f38652j));
        sb6.append("</liteappMinVersion>");
        sb6.append("</namecard>");
        sb6.append("</gamecenter>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        if (map.get(".msg.appmsg.gamecenter.namecard") != null) {
            this.f38644b = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.iconUrl");
            this.f38645c = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.name");
            this.f38646d = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.desc");
            this.f38647e = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.tail");
            this.f38648f = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.jumpUrl");
            this.f38649g = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappId");
            this.f38650h = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappPath");
            this.f38651i = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappQuery");
            this.f38652j = (java.lang.String) map.get(".msg.appmsg.gamecenter.namecard.liteappMinVersion");
        }
    }
}
