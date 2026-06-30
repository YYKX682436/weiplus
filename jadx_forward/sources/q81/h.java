package q81;

/* loaded from: classes7.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f442239d;

    /* renamed from: e, reason: collision with root package name */
    public int f442240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f442241f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f442242g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f442243h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z17, java.util.List list, java.util.UUID uuid, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f442241f = z17;
        this.f442242g = list;
        this.f442243h = uuid;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q81.h(this.f442241f, this.f442242g, this.f442243h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((q81.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q9 q9Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f442240e;
        java.util.UUID uuid = this.f442243h;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q9 aj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.aj();
                if (aj6 == null) {
                    return f0Var;
                }
                boolean z17 = this.f442241f;
                java.util.List<java.lang.String> list = this.f442242g;
                if (!z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        if (aj6.z0((java.lang.String) obj2) == null) {
                            arrayList.add(obj2);
                        }
                    }
                    list = arrayList;
                }
                if (list.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.CmdGetJsApiControlBytes", "doSyncJsApiControlBytes need sync appIdList is empty, requestId:" + uuid);
                    return f0Var;
                }
                og1.e eVar = new og1.e();
                r45.mr5 mr5Var = eVar.f149953a;
                r45.y50 y50Var = new r45.y50();
                y50Var.f472332f = 1;
                ((r45.zd7) mr5Var).f473479e = y50Var;
                java.util.LinkedList linkedList = ((r45.zd7) mr5Var).f473478d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (java.lang.String str : list) {
                    r45.be7 be7Var = new r45.be7();
                    be7Var.f452245d = str;
                    be7Var.f452246e = 1;
                    arrayList2.add(be7Var);
                }
                linkedList.addAll(arrayList2);
                this.f442239d = aj6;
                this.f442240e = 1;
                java.lang.Object h17 = og1.c.h(eVar, this);
                if (h17 == aVar) {
                    return aVar;
                }
                q9Var = aj6;
                obj = h17;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q9) this.f442239d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            java.util.LinkedList<r45.ce7> appinfo_list = ((r45.ae7) obj).f451507d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appinfo_list, "appinfo_list");
            for (r45.ce7 ce7Var : appinfo_list) {
                q9Var.y0(ce7Var.f453045d.f452245d, ce7Var.f453046e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CmdGetJsApiControlBytes", "doSyncJsApiControlBytes flush completed, requestId:" + uuid);
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CmdGetJsApiControlBytes", "doSyncJsApiControlBytes cgi.send failed:" + e17 + ", requestId:" + uuid);
        }
        return f0Var;
    }
}
