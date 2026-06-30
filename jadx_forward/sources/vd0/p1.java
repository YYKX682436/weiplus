package vd0;

/* loaded from: classes8.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f517014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd0.f2 f517015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(wd0.f2 f2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f517015e = f2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd0.p1(this.f517015e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.p1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f517014d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.zf3 zf3Var = new r45.zf3();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 7496;
            lVar.f152199c = "/cgi-bin/micromsg-bin/getfingerprintticketfornonlogin";
            lVar.f152197a = zf3Var;
            lVar.f152198b = new r45.ag3();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            com.p314xaae8f345.mm.p944x882e457a.o oVar = iVar.f152179f;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
            r45.zf3 zf3Var2 = fVar instanceof r45.zf3 ? (r45.zf3) fVar : null;
            if (zf3Var2 != null) {
                zf3Var2.f76494x2de60e5e = o45.bh.a(oVar.mo47979x2d63726f());
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = iVar.f152179f;
            oVar2.f152247e = 1;
            oVar2.m48033x97bfc4c(o45.pi.d());
            this.f517014d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] getTicket errType: " + fVar2.f152148a + ", errCode: " + fVar2.f152149b + ", errMsg: " + fVar2.f152150c + ",ticket: " + ((r45.ag3) fVar2.f152151d).f451525d);
        int i18 = fVar2.f152149b;
        java.lang.String str = fVar2.f152150c;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = ((r45.ag3) fVar2.f152151d).f451525d;
        if (str2 == null) {
            str2 = "";
        }
        vd0.q1 q1Var = (vd0.q1) this.f517015e;
        q1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] initSoter getTicket onResult errCode: " + i18 + ", errMsg: " + str);
        boolean z17 = str2.length() > 0;
        wd0.h2 h2Var = q1Var.f517025a;
        if (z17) {
            wd0.d1[] d1VarArr = wd0.d1.f526235d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6) h2Var).a(0, str2);
        } else {
            wd0.d1[] d1VarArr2 = wd0.d1.f526235d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6) h2Var).a(4, "");
        }
        return jz5.f0.f384359a;
    }
}
