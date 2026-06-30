package on2;

/* loaded from: classes3.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f428446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(on2.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f428446e = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new on2.g0(this.f428446e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        on2.v0 v0Var;
        java.lang.Object a17;
        r45.im4 im4Var;
        r45.en5 en5Var;
        java.lang.String str;
        r45.im4 im4Var2;
        r45.en5 en5Var2;
        r45.im4 im4Var3;
        r45.im4 im4Var4;
        r45.en5 en5Var3;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f428445d;
        on2.v0 v0Var2 = this.f428446e;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mm2.q4 q4Var = mm2.v4.f411008p;
            java.lang.String W6 = v0Var2.W6();
            long j17 = v0Var2.K;
            long j18 = v0Var2.f428561J;
            r45.gn3 gn3Var = new r45.gn3();
            gn3Var.set(0, 1);
            r45.ht1 ht1Var = v0Var2.R;
            gn3Var.set(1, (ht1Var == null || (im4Var = (r45.im4) ht1Var.m75936x14adae67(12)) == null || (en5Var = (r45.en5) im4Var.m75936x14adae67(1)) == null) ? null : en5Var.m75934xbce7f2f(2));
            this.f428445d = 1;
            i17 = 1;
            v0Var = v0Var2;
            a17 = q4Var.a("FinderLiveLotteryAudienceUIC", W6, null, j17, j18, gn3Var, r45.i52.class, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
            i17 = 1;
            v0Var = v0Var2;
        }
        r45.i52 i52Var = (r45.i52) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("page resume,red packet is_received from:");
        r45.ht1 ht1Var2 = v0Var.R;
        sb6.append((ht1Var2 == null || (im4Var4 = (r45.im4) ht1Var2.m75936x14adae67(12)) == null || (en5Var3 = (r45.en5) im4Var4.m75936x14adae67(i17)) == null) ? null : java.lang.Boolean.valueOf(en5Var3.m75933x41a8a7f2(0)));
        sb6.append(" to ");
        sb6.append(i52Var != null ? java.lang.Boolean.valueOf(i52Var.m75933x41a8a7f2(0)) : null);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryAudienceUIC", sb6.toString());
        if (i52Var != null) {
            r45.ht1 ht1Var3 = v0Var.R;
            r45.en5 en5Var4 = (ht1Var3 == null || (im4Var3 = (r45.im4) ht1Var3.m75936x14adae67(12)) == null) ? null : (r45.en5) im4Var3.m75936x14adae67(i17);
            if (en5Var4 != null) {
                en5Var4.set(0, java.lang.Boolean.valueOf(i52Var.m75933x41a8a7f2(0)));
            }
            r45.ht1 ht1Var4 = v0Var.R;
            if (ht1Var4 == null || (im4Var2 = (r45.im4) ht1Var4.m75936x14adae67(12)) == null || (en5Var2 = (r45.en5) im4Var2.m75936x14adae67(i17)) == null || (str = en5Var2.m75945x2fec8307(4)) == null) {
                str = "";
            }
            v0Var.f7(str, i52Var.m75933x41a8a7f2(0));
        }
        return jz5.f0.f384359a;
    }
}
