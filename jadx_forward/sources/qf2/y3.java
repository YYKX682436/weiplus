package qf2;

/* loaded from: classes3.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.z3 f444195e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(qf2.z3 z3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444195e = z3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.y3(this.f444195e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.y3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444194d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f444194d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        qf2.z3 z3Var = this.f444195e;
        if (!((mm2.e1) z3Var.m56788xbba4bfc0(mm2.e1.class)).c7()) {
            return f0Var;
        }
        if (!z3Var.Z6()) {
            z3Var.a7(134217728, false, null);
        }
        if (((mm2.o4) z3Var.m56788xbba4bfc0(mm2.o4.class)).G) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f409878b2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("result", 1);
            jSONObject.put("type", 1);
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            qf2.x3 x3Var = new qf2.x3(z3Var, null);
            this.f444194d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, x3Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
