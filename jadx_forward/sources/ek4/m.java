package ek4;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.o f335200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.w f335201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ek4.s sVar, dn.o oVar, ek4.w wVar) {
        super(0);
        this.f335199d = sVar;
        this.f335200e = oVar;
        this.f335201f = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek4.s sVar = this.f335199d;
        java.util.HashMap hashMap = sVar.f335218a;
        dn.o oVar = this.f335200e;
        boolean containsKey = hashMap.containsKey(oVar.f69601xaca5bdda);
        ek4.w wVar = this.f335201f;
        if (!containsKey) {
            dn.c cVar = new dn.c();
            java.lang.String field_mediaId = oVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            ek4.s.d(sVar, field_mediaId, cVar);
            oVar.f69615x1bb3b54a = c01.id.c();
            int b17 = oVar.Z == 8 ? ek4.s.b(sVar, oVar) : -1;
            if (wVar != null) {
                wVar.b(b17, oVar);
            }
        } else if (wVar != null) {
            wVar.b(-1, oVar);
        }
        return jz5.f0.f384359a;
    }
}
