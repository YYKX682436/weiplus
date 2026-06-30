package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class su extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f201368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu f201369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f201370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f201371g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu vuVar, hn2.d dVar, r45.yx1 yx1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201369e = vuVar;
        this.f201370f = dVar;
        this.f201371g = yx1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.su(this.f201369e, this.f201370f, this.f201371g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.su) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f201368d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu vuVar = this.f201369e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sf2.d3 d3Var = vuVar.f201623b;
            hn2.d dVar = this.f201370f;
            r45.dy1 dy1Var = new r45.dy1();
            dy1Var.f454377d = 2;
            this.f201368d = 1;
            obj = d3Var.r7(dVar, dy1Var, false, null, this);
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
        r45.mx1 mx1Var = (r45.mx1) obj;
        if (mx1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSingingSongWidget", "Request item done");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveRequestSingingSongWidget", "Request item failed");
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = vuVar.f201624c;
        hn2.d dVar2 = this.f201370f;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qu(vuVar, dVar2, this.f201371g, null), 3, null);
        }
        if (mx1Var != null) {
            sf2.d3 d3Var2 = vuVar.f201623b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ru ruVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ru.f201222d;
            this.f201368d = 2;
            if (d3Var2.d7(dVar2, mx1Var, ruVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
