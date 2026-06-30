package ch2;

/* loaded from: classes10.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f122941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(ch2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122942e = o2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.m2(this.f122942e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.m2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f122941d;
        ch2.o2 o2Var = this.f122942e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sf2.d3 d3Var = (sf2.d3) o2Var.m56789x25fe639c(sf2.d3.class);
            if (d3Var != null) {
                this.f122941d = 1;
                obj = d3Var.k7(2, 0, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.gx1 gx1Var = (r45.gx1) obj;
        if (gx1Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLocalSingInfo success, version: ");
            sb6.append(gx1Var.f457127e);
            sb6.append(" listInfo: ");
            r45.zx1 zx1Var = gx1Var.f457126d;
            sb6.append((zx1Var == null || (linkedList = zx1Var.f473985d) == null) ? null : new java.lang.Integer(linkedList.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", sb6.toString());
            if (gx1Var.f457126d != null && gx1Var.f457127e > 0) {
                om2.g q76 = o2Var.q7();
                java.util.LinkedList to_sing_list = gx1Var.f457126d.f473985d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(to_sing_list, "to_sing_list");
                q76.V6("updateLocalSingInfo", to_sing_list, gx1Var.f457127e);
            }
        }
        return jz5.f0.f384359a;
    }
}
