package ek4;

/* loaded from: classes12.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f335171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335172g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ek4.s sVar, java.lang.String str, dn.h hVar, java.lang.String str2) {
        super(0);
        this.f335169d = sVar;
        this.f335170e = str;
        this.f335171f = hVar;
        this.f335172g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dn.h hVar;
        ek4.s sVar = this.f335169d;
        java.util.HashMap hashMap = sVar.f335219b;
        java.lang.String str = this.f335170e;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            sVar.f335219b.remove(str);
            dn.l lVar = oVar.f323329p0;
            if (lVar != null && (hVar = this.f335171f) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onPreloadCompleted mediaId:" + this.f335172g + " retCode:" + hVar.f69553xb5f54fe9);
                lVar.x(str, hVar);
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f335222e;
                java.lang.String field_mediaId = oVar.f69601xaca5bdda;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                ek4.t.a(copyOnWriteArrayList, field_mediaId, 0, oVar, hVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
