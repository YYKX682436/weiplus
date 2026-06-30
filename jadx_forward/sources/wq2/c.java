package wq2;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f530047d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f530048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wq2.h f530049f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f530050g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f530051h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f530052i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wq2.h hVar, int i17, int i18, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530049f = hVar;
        this.f530050g = i17;
        this.f530051h = i18;
        this.f530052i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wq2.c cVar = new wq2.c(this.f530049f, this.f530050g, this.f530051h, this.f530052i, interfaceC29045xdcb5ca57);
        cVar.f530048e = obj;
        return cVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wq2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f530047d;
        boolean z17 = this.f530052i;
        wq2.h hVar = this.f530049f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f530048e;
            wq2.b bVar = new wq2.b(this.f530050g, this.f530051h, z17, hVar);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
            android.app.Activity activity = hVar.f530062a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            aq2.g gVar = new aq2.g(bVar, r2Var, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity, hVar.f530068g);
            this.f530047d = 1;
            obj = ay1.l.j(gVar, false, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        oz5.l lVar = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) hVar.f530063b).f392029d;
        wq2.a aVar2 = new wq2.a((com.p314xaae8f345.mm.p944x882e457a.f) obj, hVar, z17, null);
        this.f530047d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(lVar, aVar2, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
