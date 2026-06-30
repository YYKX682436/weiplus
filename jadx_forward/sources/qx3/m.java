package qx3;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448902d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx3.o f448904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qx3.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448904f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qx3.m mVar = new qx3.m(this.f448904f, interfaceC29045xdcb5ca57);
        mVar.f448903e = obj;
        return mVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qx3.m) mo148xaf65a0fc((qx3.f) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        qx3.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f448902d;
        qx3.o oVar = this.f448904f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qx3.f fVar2 = (qx3.f) this.f448903e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePlayerFlow", "actionFlow collect, state:" + fVar2.f448888c);
            if (fVar2.f448888c == 3) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) oVar.f448908e).k(new qx3.e(0L, 1));
                oVar.R6();
            } else {
                long j17 = fVar2.f448886a;
                vx3.i iVar = fVar2.f448887b;
                if (iVar == null) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) oVar.f448908e).k(new qx3.e(j17, 1));
                    oVar.R6();
                } else {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) oVar.f448908e).k(new qx3.e(j17, 1));
                    oVar.R6();
                    this.f448903e = fVar2;
                    this.f448902d = 1;
                    oVar.getClass();
                    java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new qx3.h(oVar, iVar, null), this);
                    if (g17 == aVar) {
                        return aVar;
                    }
                    fVar = fVar2;
                    obj = g17;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fVar = (qx3.f) this.f448903e;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vx3.i iVar2 = (vx3.i) obj;
        if (iVar2 != null) {
            long j18 = fVar.f448886a;
            kk4.v vVar = oVar.f448913m;
            if (vVar == null) {
                oVar.f448912i = j18;
                oVar.O6(iVar2);
            } else if (j18 != oVar.f448912i) {
                oVar.R6();
                oVar.f448912i = j18;
                oVar.O6(iVar2);
            } else {
                if (vVar.s()) {
                    oVar.R6();
                } else {
                    oVar.R6();
                    oVar.f448912i = j18;
                    oVar.O6(iVar2);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
