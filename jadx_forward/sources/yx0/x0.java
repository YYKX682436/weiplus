package yx0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549285e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549285e = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.x0(this.f549285e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549284d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if ((this.f549285e.S instanceof rx0.f) && (lVar = this.f549285e.f548723q) != null) {
                rx0.h hVar = this.f549285e.S;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(hVar, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.model.SelectedTemplate.Normal");
                lVar.mo146xb9724478(((rx0.f) hVar).f482449a);
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f549285e.f548727u;
            if (r2Var == null) {
                return null;
            }
            yx0.b8 b8Var = this.f549285e;
            this.f549284d = 1;
            if (yx0.b8.a(b8Var, r2Var, "SwitchingTemplateJob doPauseShooting", this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
