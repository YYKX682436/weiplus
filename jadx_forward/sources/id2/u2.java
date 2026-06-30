package id2;

/* loaded from: classes2.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372348d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f372349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372350f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(id2.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372350f = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        id2.u2 u2Var = new id2.u2(this.f372350f, interfaceC29045xdcb5ca57);
        u2Var.f372349e = obj;
        return u2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.u2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372348d;
        id2.u3 u3Var = this.f372350f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f372349e;
            android.content.Intent intent = u3Var.m158354x19263085().getIntent();
            int intExtra = intent != null ? intent.getIntExtra("KEY_ENTER_LIVE_SCENE_STAMP", 0) : 0;
            id2.t2 t2Var = new id2.t2(16);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            zk2.c cVar = new zk2.c(t2Var, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), u3Var.m158354x19263085(), 16, intExtra);
            this.f372348d = 1;
            obj = ay1.l.j(cVar, false, this, 1, null);
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
        oz5.l f93115e2 = u3Var.m158345xefc66565().getF93115e();
        id2.s2 s2Var = new id2.s2((com.p314xaae8f345.mm.p944x882e457a.f) obj, u3Var, null);
        this.f372348d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(f93115e2, s2Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
