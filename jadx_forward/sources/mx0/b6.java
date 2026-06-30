package mx0;

/* loaded from: classes5.dex */
public final class b6 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f413383d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413384e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f413385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f413386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413387h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f413386g = c16993xacc19624;
        this.f413387h = c10977x8e40eced;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mx0.b6 b6Var = new mx0.b6(this.f413386g, this.f413387h, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        b6Var.f413384e = (java.lang.String) obj;
        b6Var.f413385f = (rx0.k) obj2;
        return b6Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String resultMediaFilePath;
        java.lang.Object e17;
        rx0.k kVar;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413383d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            resultMediaFilePath = (java.lang.String) this.f413384e;
            rx0.k kVar2 = (rx0.k) this.f413385f;
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultMediaFilePath, "resultMediaFilePath");
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            m7Var.hj("Completed", resultMediaFilePath);
            m7Var.rj(9);
            iy1.c cVar = iy1.c.MainUI;
            m7Var.qj(30097);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai = m7Var.Ai();
            Ai.put("view_id", "sc_asset_generate_complete");
            ((cy1.a) rVar).yj("sc_asset_generate_complete", null, Ai, 6, false);
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCAssetGenerateToPost", "MJShootComposing", m7Var.Ni(), 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump2VideoPostPageForMaterialImportPreview: cover start time: ");
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = kVar2.f482473g;
            sb6.append(c4128x879fba0a2 != null ? new java.lang.Double(c4128x879fba0a2.m33988x124aa384()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
            vt3.l lVar = vt3.l.f521538a;
            lVar.b(kz5.b0.c(resultMediaFilePath), 4, true);
            this.f413384e = resultMediaFilePath;
            this.f413385f = kVar2;
            this.f413383d = 1;
            e17 = lVar.e(this);
            if (e17 == aVar) {
                return aVar;
            }
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (rx0.k) this.f413385f;
            resultMediaFilePath = (java.lang.String) this.f413384e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e17 = obj;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) e17;
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.rewind();
            byteBuffer.get(bArr);
            gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        } else {
            gVar = null;
        }
        vt3.l.f521538a.d();
        r45.q23 q23Var = kVar.f482470d;
        com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5 = kVar.f482469c;
        java.lang.Number num = (c3981x30b9dbd5 == null || (c4128x879fba0a = c3981x30b9dbd5.f129352c) == null) ? new java.lang.Integer(0) : new java.lang.Double(c4128x879fba0a.m33987xd22e7c2d());
        xt0.d dVar = new xt0.d();
        long longValue = num.longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = this.f413386g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        r45.h70 a17 = fx0.b.f348642a.a(resultMediaFilePath, resultMediaFilePath, ou0.d0.b(configProvider, longValue, false));
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingPluginLayout", "jump2VideoPostPageForMaterialImportPreview: compositionInfo == null");
            return f0Var;
        }
        nu3.i.f421751a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(0));
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413387h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f413386g;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4012xe1ac9984 c4012xe1ac9984 = c10977x8e40eced.f151090v.T;
        dVar.a(c10977x8e40eced.Q0(c16993xacc19624, c4012xe1ac9984 != null ? c4012xe1ac9984.m32610x92013dca() : null, this.f413387h.f151090v.U));
        xt0.g gVar2 = new xt0.g(resultMediaFilePath, a17);
        android.content.Context context = this.f413387h.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        dVar.c(context, num.doubleValue(), this.f413386g, q23Var, false, gVar2, kVar.f482473g, null, null, null, null, null, gVar, null);
        i95.m c17 = i95.n0.c(m40.k0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((c61.p7) ((m40.k0) c17)).bj()) {
            i95.m c18 = i95.n0.c(bg0.v.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((b92.u2) ((bg0.v) c18)).bj(resultMediaFilePath);
        }
        return f0Var;
    }
}
