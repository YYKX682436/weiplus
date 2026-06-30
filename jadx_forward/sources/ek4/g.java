package ek4;

/* loaded from: classes12.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.g f335177f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f335178g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335179h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ek4.s sVar, java.lang.String str, dn.g gVar, dn.h hVar, java.lang.String str2) {
        super(0);
        this.f335175d = sVar;
        this.f335176e = str;
        this.f335177f = gVar;
        this.f335178g = hVar;
        this.f335179h = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek4.s sVar = this.f335175d;
        java.util.HashMap hashMap = sVar.f335218a;
        java.lang.String str = this.f335176e;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            java.lang.String str2 = this.f335179h;
            dn.n nVar = oVar.f323348c2;
            if (nVar != null) {
                java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f335222e;
                dn.g gVar = this.f335177f;
                if (gVar != null) {
                    ek4.s.a(sVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onProgress mediaId:" + str2 + " progressFinishLength:" + gVar.f69496x83ec3dd);
                    nVar.f(str2, gVar.f69496x83ec3dd, gVar.f69500x8ab84c59);
                    java.lang.String field_mediaId = oVar.f69601xaca5bdda;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                    ek4.t.b(copyOnWriteArrayList, field_mediaId, gVar.f69496x83ec3dd, gVar.f69500x8ab84c59);
                }
                dn.h hVar = this.f335178g;
                if (hVar != null) {
                    ek4.s.a(sVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "callback by CdnTaskController onFinish mediaId:" + str2 + " sceneResultRet:" + hVar.f69553xb5f54fe9);
                    sVar.f335218a.remove(str);
                    sVar.f335220c.put(str, oVar);
                    sVar.f335221d.put(str, hVar);
                    nVar.g(str2, hVar.f69553xb5f54fe9, hVar);
                    java.lang.String field_mediaId2 = oVar.f69601xaca5bdda;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId2, "field_mediaId");
                    ek4.t.a(copyOnWriteArrayList, field_mediaId2, hVar.f69553xb5f54fe9, oVar, hVar);
                    if (oVar.f323346a2 && hVar.f69553xb5f54fe9 == 0) {
                        r45.hv hvVar = new r45.hv();
                        hvVar.f457998d = oVar.f69595x6d25b0d9;
                        hvVar.f457999e = hVar.f69523x17c343e7;
                        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(6, oVar.f69601xaca5bdda, hvVar, new ek4.f(sVar));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
