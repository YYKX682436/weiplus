package rt0;

/* loaded from: classes5.dex */
public final class c extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f480907b;

    @Override // ot0.h
    public ot0.h a() {
        rt0.c cVar = new rt0.c();
        cVar.f480907b = this.f480907b;
        return cVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (sb6 != null) {
            sb6.append("<opensdk_share_is_modified>" + this.f480907b + "</opensdk_share_is_modified>");
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f480907b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(map != null ? (java.lang.String) map.get(".msg.appmsg.opensdk_share_is_modified") : null, 0);
    }
}
