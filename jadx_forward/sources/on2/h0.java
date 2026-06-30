package on2;

/* loaded from: classes3.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f428457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(on2.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f428457e = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new on2.h0(this.f428457e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((on2.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        on2.v0 v0Var;
        java.lang.Object a17;
        boolean z18;
        r45.yl4 yl4Var;
        r45.zl4 zl4Var;
        r45.am4 am4Var;
        r45.zl4 zl4Var2;
        r45.am4 am4Var2;
        r45.zl4 zl4Var3;
        r45.am4 am4Var3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f428456d;
        on2.v0 v0Var2 = this.f428457e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mm2.q4 q4Var = mm2.v4.f411008p;
            java.lang.String W6 = v0Var2.W6();
            long j17 = v0Var2.K;
            long j18 = v0Var2.f428561J;
            r45.gn3 gn3Var = new r45.gn3();
            gn3Var.set(0, 3);
            r45.h02 h02Var = new r45.h02();
            h02Var.f457236d = 1;
            h02Var.f457237e = v0Var2.I;
            h02Var.f457238f = "";
            h02Var.f457239g = "";
            gn3Var.set(1, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(h02Var.mo14344x5f01b1f6()));
            this.f428456d = 1;
            z17 = true;
            v0Var = v0Var2;
            a17 = q4Var.a("FinderLiveLotteryAudienceUIC", W6, null, j17, j18, gn3Var, r45.i02.class, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
            z17 = true;
            v0Var = v0Var2;
        }
        r45.i02 i02Var = (r45.i02) a17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("page resume,coupon updateInfo:");
        sb6.append(pm0.b0.b(i02Var != 0 ? i02Var : ""));
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLotteryAudienceUIC", sb6.toString());
        if ((i02Var != 0 ? i02Var.f458146e : null) != null) {
            v0Var.g7(i02Var.f458145d == 2 ? z17 ? 1 : 0 : false);
            r45.ht1 ht1Var = v0Var.R;
            r45.yl4 yl4Var2 = (ht1Var == null || (zl4Var3 = (r45.zl4) ht1Var.m75936x14adae67(11)) == null || (am4Var3 = (r45.am4) zl4Var3.m75936x14adae67(z17 ? 1 : 0)) == null) ? null : (r45.yl4) am4Var3.m75936x14adae67(0);
            if (yl4Var2 != null) {
                yl4Var2.set(z17 ? 1 : 0, java.lang.Integer.valueOf(i02Var.f458145d));
            }
            r45.ht1 ht1Var2 = v0Var.R;
            r45.yl4 yl4Var3 = (ht1Var2 == null || (zl4Var2 = (r45.zl4) ht1Var2.m75936x14adae67(11)) == null || (am4Var2 = (r45.am4) zl4Var2.m75936x14adae67(z17 ? 1 : 0)) == null) ? null : (r45.yl4) am4Var2.m75936x14adae67(0);
            if (yl4Var3 != null) {
                r45.zd4 zd4Var = i02Var.f458146e;
                yl4Var3.set(3, zd4Var != null ? zd4Var.f473468g : null);
            }
            r45.ht1 ht1Var3 = v0Var.R;
            if (ht1Var3 == null || (zl4Var = (r45.zl4) ht1Var3.m75936x14adae67(11)) == null || (am4Var = (r45.am4) zl4Var.m75936x14adae67(z17 ? 1 : 0)) == null) {
                z18 = false;
                yl4Var = null;
            } else {
                z18 = false;
                yl4Var = (r45.yl4) am4Var.m75936x14adae67(0);
            }
            if (yl4Var != null) {
                r45.zd4 zd4Var2 = i02Var.f458146e;
                yl4Var.set(2, zd4Var2 != null ? zd4Var2.f473467f : null);
            }
            r45.zd4 zd4Var3 = i02Var.f458146e;
            java.lang.String str = zd4Var3 != null ? zd4Var3.f473467f : null;
            if (str != null && str.length() != 0) {
                z17 = z18;
            }
            if (z17) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("page resume,button_text:");
                r45.zd4 zd4Var4 = i02Var.f458146e;
                sb7.append(zd4Var4 != null ? zd4Var4.f473467f : null);
                sb7.append('!');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveLotteryAudienceUIC", sb7.toString());
            } else {
                android.widget.TextView S6 = v0Var.S6();
                r45.zd4 zd4Var5 = i02Var.f458146e;
                S6.setText(zd4Var5 != null ? zd4Var5.f473467f : null);
            }
        }
        return jz5.f0.f384359a;
    }
}
