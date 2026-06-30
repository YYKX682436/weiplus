package ek4;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.g f335166f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335167g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn.h f335168h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ek4.s sVar, java.lang.String str, dn.g gVar, java.lang.String str2, dn.h hVar) {
        super(0);
        this.f335164d = sVar;
        this.f335165e = str;
        this.f335166f = gVar;
        this.f335167g = str2;
        this.f335168h = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dn.g gVar;
        ek4.s sVar = this.f335164d;
        dn.o oVar = (dn.o) sVar.f335219b.get(this.f335165e);
        if (oVar != null) {
            java.lang.String str = this.f335167g;
            dn.h hVar = this.f335168h;
            dn.k kVar = oVar.f323320f;
            if (kVar != null && (gVar = this.f335166f) != null) {
                ek4.s.a(sVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onProgress mediaId:" + str + " progressFinishLength:" + gVar.f69496x83ec3dd);
                kVar.r4(str, 0, gVar, hVar, oVar.f69607x9bef5d80);
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f335222e;
                java.lang.String field_mediaId = oVar.f69601xaca5bdda;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                ek4.t.b(copyOnWriteArrayList, field_mediaId, gVar.f69496x83ec3dd, gVar.f69500x8ab84c59);
            }
        }
        return jz5.f0.f384359a;
    }
}
