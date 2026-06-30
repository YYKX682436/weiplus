package rf2;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.q f476357f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r45.f02 f02Var, rf2.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476356e = f02Var;
        this.f476357f = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.n(this.f476356e, this.f476357f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476355d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.f02 f02Var = this.f476356e;
            r45.fm4 fm4Var = f02Var.f455413f;
            java.lang.Object[] objArr = fm4Var != null && fm4Var.f455981g == 1;
            rf2.q qVar = this.f476357f;
            if (objArr == true) {
                mm2.v4 v4Var = (mm2.v4) qVar.f476387e.m56788xbba4bfc0(mm2.v4.class);
                java.lang.String str = f02Var.f455411d;
                if (str == null) {
                    str = "";
                }
                java.lang.Object O6 = v4Var.O6(str);
                r45.i02 i02Var = O6 instanceof r45.i02 ? (r45.i02) O6 : null;
                java.lang.String str2 = qVar.f476388f;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPageResume cacheCouponInfo:");
                sb6.append(pm0.b0.g(i02Var != null ? i02Var : ""));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
                this.f476355d = 1;
                if (rf2.q.a(qVar, f02Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if ((fm4Var != null && fm4Var.f455981g == 0) != false) {
                    mm2.v4 v4Var2 = (mm2.v4) qVar.f476387e.m56788xbba4bfc0(mm2.v4.class);
                    java.lang.String str3 = f02Var.f455411d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.Object O62 = v4Var2.O6(str3);
                    r45.i52 i52Var = O62 instanceof r45.i52 ? (r45.i52) O62 : null;
                    java.lang.String str4 = qVar.f476388f;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onPageResume cacheRedPacketInfo:");
                    sb7.append(pm0.b0.g(i52Var != null ? i52Var : ""));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb7.toString());
                    if (!(i52Var != null && i52Var.m75933x41a8a7f2(0))) {
                        this.f476355d = 2;
                        if (rf2.q.c(qVar, f02Var, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
