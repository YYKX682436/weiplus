package vd0;

/* loaded from: classes8.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f517051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd0.c1 f517052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd0.m2 f517053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f517054g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(wd0.c1 c1Var, wd0.m2 m2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f517052e = c1Var;
        this.f517053f = m2Var;
        this.f517054g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd0.u1(this.f517052e, this.f517053f, this.f517054g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.u1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f517051d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.jx6 jx6Var = new r45.jx6();
            wd0.m2 m2Var = this.f517053f;
            zt5.s sVar = m2Var.f526287c;
            jx6Var.f459733d = sVar != null ? sVar.f557162j : null;
            jx6Var.f459734e = sVar != null ? sVar.f557163k : null;
            jx6Var.f459735f = this.f517054g;
            jx6Var.f459736g = wo.w0.k();
            zt5.s sVar2 = m2Var.f526287c;
            jx6Var.f459737h = sVar2 != null ? sVar2.f557161i : 0;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 12925;
            lVar.f152199c = "/cgi-bin/micromsg-bin/verifyfingerprintfornonlogin";
            lVar.f152197a = jx6Var;
            lVar.f152198b = new r45.kx6();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            com.p314xaae8f345.mm.p944x882e457a.o oVar = iVar.f152179f;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152243a.f152217a;
            r45.jx6 jx6Var2 = fVar2 instanceof r45.jx6 ? (r45.jx6) fVar2 : null;
            if (jx6Var2 != null) {
                jx6Var2.f76494x2de60e5e = o45.bh.a(oVar.mo47979x2d63726f());
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = iVar.f152179f;
            oVar2.f152247e = 1;
            oVar2.m48033x97bfc4c(o45.pi.d());
            this.f517051d = 1;
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
        com.p314xaae8f345.mm.p944x882e457a.f fVar3 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] verifyFingerprintLoginCGI errType: " + fVar3.f152148a + ", errCode: " + fVar3.f152149b + ", errMsg: " + fVar3.f152151d);
        wd0.e1 e1Var = new wd0.e1(0, null, null, null, null, null, 0, null, 255, null);
        e1Var.f526236a = fVar3.f152149b;
        java.lang.String str = fVar3.f152150c;
        if (str == null) {
            str = "";
        }
        e1Var.f526237b = str;
        if (fVar3.f152149b != 0 || (fVar = fVar3.f152151d) == null) {
            wd0.d1[] d1VarArr = wd0.d1.f526235d;
            e1Var.f526236a = 8;
        } else {
            java.lang.String RandomPwd = ((r45.kx6) fVar).f460566f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(RandomPwd, "RandomPwd");
            e1Var.f526239d = RandomPwd;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = fVar3.f152151d;
        if (fVar4 != null && ((r45.kx6) fVar4).f460565e != 0 && ((r45.kx6) fVar4).f460564d != null) {
            e1Var.f526242g = ((r45.kx6) fVar4).f460565e;
            r45.vt4 network_sect_resp = ((r45.kx6) fVar4).f460564d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(network_sect_resp, "network_sect_resp");
            e1Var.f526241f = network_sect_resp;
            wd0.d1[] d1VarArr2 = wd0.d1.f526235d;
            e1Var.f526236a = 12;
        }
        this.f517052e.a(e1Var);
        return jz5.f0.f384359a;
    }
}
