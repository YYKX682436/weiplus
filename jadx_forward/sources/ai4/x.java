package ai4;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f86736d;

    public x(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ai4.x(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return new ai4.x((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f86736d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ai4.b0 b0Var = ai4.b0.f86656a;
        this.f86736d = 1;
        qi4.p pVar = qi4.p.f445309a;
        java.util.List x17 = ((ti4.d) ((jz5.n) qi4.p.f445313e).mo141623x754a37bb()).x();
        int i18 = 0;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.util.Iterator it = x17.iterator();
            while (it.hasNext()) {
                if (b0Var.h((mj4.l) it.next())) {
                    i18++;
                }
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transferFriendLikeDataToAffDB: oldCount=");
        sb6.append(((java.util.LinkedList) x17).size());
        sb6.append(", successCount=");
        sb6.append(i18);
        sb6.append(", result=");
        sb6.append(p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(m143895xf1229813));
        sb6.append(", err=");
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        sb6.append(m143898xd4a2fc34 != null ? jz5.a.b(m143898xd4a2fc34) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusAffDBTransfer", sb6.toString());
        ai4.j0 j0Var = new ai4.j0(p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(m143895xf1229813), r1.size(), i18);
        return j0Var == aVar ? aVar : j0Var;
    }
}
