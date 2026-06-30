package d83;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f308483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f f308484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f c3017xbcf84e3f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f308484e = c3017xbcf84e3f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new d83.a0(this.f308484e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((d83.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f308483d;
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3017xbcf84e3f c3017xbcf84e3f = this.f308484e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = c3017xbcf84e3f.m23122xb72c57bb() && c3017xbcf84e3f.m23114x46a55b77() == com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3061x826bf2c5.kIlinkNetworkTypeMobile;
            d83.e0 e0Var = d83.e0.f308491a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent: taskid " + c3017xbcf84e3f.m23109x7fabcabf() + ", type " + c3017xbcf84e3f.m23108x6888f529() + ", timeout " + c3017xbcf84e3f.m23113x27ef431() + ", longPolling " + c3017xbcf84e3f.m23111x62ab8871() + ", bindCellular " + z17);
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.EnumC3018xa502518a m23108x6888f529 = c3017xbcf84e3f.m23108x6888f529();
            int i18 = m23108x6888f529 == null ? -1 : d83.z.f308577a[m23108x6888f529.ordinal()];
            d83.o oVar = d83.o.f308535a;
            if (i18 == 1) {
                byte[] g17 = c3017xbcf84e3f.m23112x1e5b079b().g();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(g17, 0, g17.length);
                int m23113x27ef431 = c3017xbcf84e3f.m23113x27ef431();
                this.f308483d = 1;
                obj = oVar.a(gVar, m23113x27ef431, this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = (jz5.l) obj;
            } else if (i18 != 2) {
                lVar = null;
            } else {
                byte[] g18 = c3017xbcf84e3f.m23112x1e5b079b().g();
                com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(g18, 0, g18.length);
                int m23113x27ef4312 = c3017xbcf84e3f.m23113x27ef431();
                boolean m23111x62ab8871 = c3017xbcf84e3f.m23111x62ab8871();
                java.lang.String m23110x1de1337 = c3017xbcf84e3f.m23118x21fe1d73() ? c3017xbcf84e3f.m23110x1de1337() : "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m23110x1de1337);
                this.f308483d = 2;
                obj = oVar.b(gVar2, m23113x27ef4312, m23111x62ab8871, m23110x1de1337, z17, this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = (jz5.l) obj;
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            lVar = (jz5.l) obj;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            lVar = (jz5.l) obj;
        }
        if (lVar != null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) d83.e0.f308495e.get(new java.lang.Integer(c3017xbcf84e3f.m23109x7fabcabf()));
            int intValue = ((java.lang.Number) lVar.f384366d).intValue();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) lVar.f384367e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkInitMgr", "onSendCloudCgiRequestEvent: resp taskid " + c3017xbcf84e3f.m23109x7fabcabf() + ", errcode " + intValue);
            if (r2Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ILinkInitMgr", "job already been canceled");
            } else {
                d83.e0 e0Var2 = d83.e0.f308491a;
                com.p314xaae8f345.p342x5fa53e3.C2950xf0971ac1 c2950xf0971ac1 = d83.e0.f308496f;
                if (c2950xf0971ac1 != null) {
                    c2950xf0971ac1.m22071xd377b74(c3017xbcf84e3f.m23109x7fabcabf(), intValue, gVar3.g());
                }
            }
        }
        d83.e0.f308495e.remove(new java.lang.Integer(c3017xbcf84e3f.m23109x7fabcabf()));
        return jz5.f0.f384359a;
    }
}
