package dz4;

/* loaded from: classes8.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f326855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz4.o0 f326856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f326857g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n f326858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(dn.m mVar, dz4.o0 o0Var, boolean z17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f326855e = mVar;
        this.f326856f = o0Var;
        this.f326857g = z17;
        this.f326858h = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dz4.k3(this.f326855e, this.f326856f, this.f326857g, this.f326858h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.k3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f326854d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(sx.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            dn.m mVar = this.f326855e;
            this.f326854d = 1;
            obj = sx.b0.Be((sx.b0) c17, mVar, 0L, null, this, 6, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) obj;
        if (n1Var != null) {
            int ordinal = n1Var.f152636a.ordinal();
            boolean z17 = this.f326857g;
            dz4.o0 o0Var = this.f326856f;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.n nVar = this.f326858h;
            if (ordinal == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MsgCdnDownloadListener err callback[");
                sb6.append(o0Var != null ? new java.lang.Integer(o0Var.hashCode()) : null);
                sb6.append("], ret ");
                sb6.append(n1Var.f152638c);
                sb6.append(", isThumb ");
                sb6.append(z17);
                sb6.append(", data_id ");
                sb6.append(nVar.b().b());
                sb6.append(", msg_id ");
                sb6.append(nVar.b().c().f298361e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMsgDownloadHelper", sb6.toString());
                nVar.f298372d = n1Var.f152638c;
                nVar.f298375g[1] = true;
                if (o0Var != null) {
                    ((dz4.p) o0Var).a(nVar);
                }
            } else if (ordinal == 1) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("MsgCdnDownloadListener success callback[");
                sb7.append(o0Var != null ? new java.lang.Integer(o0Var.hashCode()) : null);
                sb7.append("], ret ");
                sb7.append(n1Var.f152638c);
                sb7.append(", isThumb ");
                sb7.append(z17);
                sb7.append(", data_id ");
                sb7.append(nVar.b().b());
                sb7.append(", msg_id ");
                sb7.append(nVar.b().c().f298361e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterMsgDownloadHelper", sb7.toString());
                nVar.f298372d = 0;
                nVar.f298375g[1] = true;
                if (o0Var != null) {
                    ((dz4.p) o0Var).a(nVar);
                }
            } else if (ordinal == 2) {
                if (o0Var != null) {
                    new java.lang.Integer(o0Var.hashCode());
                }
                nVar.b().b();
                long j17 = nVar.b().c().f298361e;
            }
        }
        return jz5.f0.f384359a;
    }
}
