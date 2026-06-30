package vl2;

/* loaded from: classes3.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vl2.h f519398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(vl2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519398e = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vl2.q(this.f519398e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vl2.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f519397d;
        boolean z17 = true;
        vl2.h hVar = this.f519398e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (hVar == vl2.h.f519352e) {
                vl2.s sVar = vl2.s.f519401a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUdrResourceLoader", hVar.f519373d + " loadPagFile failed, resourceName is Unknown");
                return null;
            }
            vl2.s sVar2 = vl2.s.f519401a;
            this.f519397d = 1;
            obj = sVar2.a(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            vl2.s sVar3 = vl2.s.f519401a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUdrResourceLoader", hVar.f519373d + " loadPagFile failed, path.isNullOrEmpty");
            return null;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            vl2.s sVar4 = vl2.s.f519401a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUdrResourceLoader", hVar.f519373d + " loadPagFile failed, file not exists, path:" + str);
            return null;
        }
        org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str);
        if (m154716x243906 == null) {
            vl2.s sVar5 = vl2.s.f519401a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveUdrResourceLoader", hVar.f519373d + " loadPagFile failed, file not pag, path:" + str);
        }
        return m154716x243906;
    }
}
