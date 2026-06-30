package yx3;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.v f549447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yx3.v vVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549447d = vVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx3.l(this.f549447d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yx3.l lVar = (yx3.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yx3.v vVar = this.f549447d;
        if (vVar.f549490q != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneServiceHelper", "old vibrate has not release");
            ao4.b bVar = vVar.f549490q;
            if (bVar != null) {
                bVar.c();
            }
            vVar.f549490q = null;
        }
        vVar.f549490q = new ao4.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", "init vibrate player in do shake only " + vVar.f549490q);
        vx3.i iVar = vVar.f549475b;
        if (iVar != null) {
            ey3.a i17 = iVar.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneServiceHelper", "do shake only " + i17);
            ao4.b bVar2 = vVar.f549490q;
            if (bVar2 != null) {
                bVar2.a(i17, null);
            }
            ao4.b bVar3 = vVar.f549490q;
            if (bVar3 != null) {
                bVar3.b();
            }
            vVar.C = true;
        }
        return jz5.f0.f384359a;
    }
}
