package aw0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f96008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.a f96009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ aw0.f f96010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vv0.b f96011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vv0.a aVar, aw0.f fVar, vv0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96009e = aVar;
        this.f96010f = fVar;
        this.f96011g = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aw0.d(this.f96009e, this.f96010f, this.f96011g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aw0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f96008d;
        vv0.b bVar = this.f96011g;
        vv0.a clipData = this.f96009e;
        aw0.f fVar = this.f96010f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zu0.i iVar = clipData.f521903b;
            if (iVar != zu0.i.f557207d) {
                if (iVar == zu0.i.f557209f) {
                    fVar.getClass();
                    bVar.getClass();
                    zu0.h b17 = fVar.b(bVar);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipData, "clipData");
                    zu0.h hVar = new zu0.h(vv0.c.a((vv0.c) b17.f557206a, null, null, new vv0.h(clipData), 3, null));
                    fVar.getClass();
                    fVar.f96014c.mo523x53d8522f(hVar);
                }
                return jz5.f0.f384359a;
            }
            fVar.getClass();
            bVar.getClass();
            zu0.h e17 = fv0.e.e(fVar.b(bVar), vv0.a.a(clipData, null, zu0.i.f557208e, 1, null));
            fVar.getClass();
            fVar.f96014c.mo523x53d8522f(e17);
            du0.t0 t0Var = fVar.f96012a;
            java.lang.String str = clipData.f521902a.f129757b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
            this.f96008d = 1;
            if (t0Var.S6(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        fVar.getClass();
        bVar.getClass();
        zu0.h e18 = fv0.e.e(fVar.b(bVar), vv0.a.a(clipData, null, zu0.i.f557209f, 1, null));
        fVar.getClass();
        fVar.f96014c.mo523x53d8522f(e18);
        return jz5.f0.f384359a;
    }
}
