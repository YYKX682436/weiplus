package tr1;

/* loaded from: classes7.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f502903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f502904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f502905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff f502906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(dn.m mVar, yz5.l lVar, com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff c23235xb7425dff, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502904e = mVar;
        this.f502905f = lVar;
        this.f502906g = c23235xb7425dff;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tr1.b(this.f502904e, this.f502905f, this.f502906g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr1.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object Hi;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f502903d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(sx.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            dn.m mVar = this.f502904e;
            this.f502903d = 1;
            Hi = sx.b0.Hi((sx.b0) c17, mVar, 0L, null, this, 6, null);
            if (Hi == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Hi = obj;
        }
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) Hi;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.l lVar = this.f502905f;
        if (n1Var != null) {
            if (n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152612h) {
                dn.h hVar = n1Var.f152641f;
                long j17 = hVar != null ? hVar.f69523x17c343e7 : 0L;
                long j18 = hVar != null ? hVar.f69523x17c343e7 : 0L;
                java.lang.String str = hVar != null ? hVar.f69524x419c440e : null;
                java.lang.String str2 = str == null ? "" : str;
                java.lang.String str3 = hVar != null ? hVar.f69560x7b284d5e : null;
                com.p314xaae8f345.p2845xc516c4b6.biz.C23092xb7b62965 c23092xb7b62965 = new com.p314xaae8f345.p2845xc516c4b6.biz.C23092xb7b62965(this.f502906g.m85571x75e04be9(), new java.lang.Long(3L), null, null, str2, new java.lang.Long(j18), new java.lang.Long(j17), null, str3 == null ? "" : str3, 140, null);
                if (z65.c.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInteractionCommentImgUploader", "uploadCommentCDNImpl success url: " + c23092xb7b62965.m84809xb5887639());
                }
                lVar.mo146xb9724478(c23092xb7b62965);
                return f0Var;
            }
        }
        lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.biz.C23092xb7b62965(null, null, null, null, null, null, null, new java.lang.Long(n1Var != null ? n1Var.f152638c : -1), null, 383, null));
        return f0Var;
    }
}
