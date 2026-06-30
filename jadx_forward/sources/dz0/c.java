package dz0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.fz f326320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f326321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f326322g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326323h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bw5.fz fzVar, boolean z17, java.util.List list, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326320e = fzVar;
        this.f326321f = z17;
        this.f326322g = list;
        this.f326323h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz0.c(this.f326320e, this.f326321f, this.f326322g, this.f326323h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f326319d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f326319d = 1;
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            bw5.sz szVar = new bw5.sz();
            szVar.f114710d = this.f326320e;
            boolean[] zArr = szVar.f114714h;
            zArr[2] = true;
            szVar.f114711e = this.f326321f;
            zArr[3] = true;
            szVar.f114712f = new java.util.LinkedList(this.f326322g);
            zArr[4] = true;
            szVar.f114713g = this.f326323h;
            zArr[5] = true;
            lVar.f152197a = szVar;
            lVar.f152198b = new bw5.tz();
            lVar.f152200d = 8337;
            lVar.f152199c = "/cgi-bin/micromsg-bin/findertranscribe";
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            iVar.p(lVar.a());
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.b()) {
            return (bw5.tz) fVar.f152151d;
        }
        return null;
    }
}
