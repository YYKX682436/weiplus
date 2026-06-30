package rt0;

/* loaded from: classes5.dex */
public final class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f480904b;

    @Override // ot0.h
    public ot0.h a() {
        rt0.a aVar = new rt0.a();
        aVar.f480904b = this.f480904b;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (sb6 != null) {
            sb6.append("<secretmsg>");
            sb6.append("<issecretmsg>");
            sb6.append(this.f480904b ? 1 : 0);
            sb6.append("</issecretmsg>");
            sb6.append("</secretmsg>");
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f480904b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(map != null ? (java.lang.String) map.get(".msg.appmsg.secretmsg.issecretmsg") : null, 0) == 1;
    }
}
