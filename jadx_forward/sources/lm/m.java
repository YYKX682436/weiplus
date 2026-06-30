package lm;

/* loaded from: classes12.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f400850d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w65.m f400852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f400853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f400854h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w65.m mVar, p3325xe03a0797.p3326xc267989b.q qVar, java.lang.ref.WeakReference weakReference, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f400852f = mVar;
        this.f400853g = qVar;
        this.f400854h = weakReference;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        lm.m mVar = new lm.m(this.f400852f, this.f400853g, this.f400854h, interfaceC29045xdcb5ca57);
        mVar.f400851e = obj;
        return mVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((lm.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f400850d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f400851e;
            w65.m mVar = this.f400852f;
            w65.q qVar = mVar != null ? ((w65.g) mVar).f524889e : null;
            w65.q qVar2 = w65.q.f524903h;
            p3325xe03a0797.p3326xc267989b.q qVar3 = this.f400853g;
            if (qVar == qVar2) {
                p3325xe03a0797.p3326xc267989b.z0.e(y0Var, null, 1, null);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar3.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(mVar.f0()));
            } else if (mVar != null && (i2Var = ((w65.g) mVar).f524890f) != null) {
                lm.l lVar = new lm.l(this.f400854h, y0Var, qVar3);
                this.f400850d = 1;
                if (i2Var.a(lVar, this) == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        throw new jz5.d();
    }
}
