package si0;

/* loaded from: classes13.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.v f489700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 f489701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(si0.v vVar, com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 c24030xcb335ec8, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489700e = vVar;
        this.f489701f = c24030xcb335ec8;
        this.f489702g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.t(this.f489700e, this.f489701f, this.f489702g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.rfx.C20948xd56d46d3 c20948xd56d46d3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489699d;
        si0.v vVar = this.f489700e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 c24030xcb335ec8 = this.f489701f;
            int m88908x3781c2fe = (int) c24030xcb335ec8.m88908x3781c2fe();
            vVar.getClass();
            android.animation.ValueAnimator valueAnimator = vVar.f489725o;
            valueAnimator.setRepeatCount(m88908x3781c2fe);
            double m88909x755bd410 = c24030xcb335ec8.m88909x755bd410();
            double m88904x1c4fb41d = c24030xcb335ec8.m88904x1c4fb41d();
            vVar.f489727q = (int) m88909x755bd410;
            vVar.f489728r = (int) m88904x1c4fb41d;
            java.lang.String pagPath = c24030xcb335ec8.m88903x500f7917();
            boolean m88911x49655f5c = c24030xcb335ec8.m88911x49655f5c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagPath, "pagPath");
            java.lang.String concat = "rfx: pagPath=".concat(pagPath);
            java.lang.String str = vVar.f489714d;
            io.p3284xd2ae381c.Log.i(str, concat);
            vVar.f489717g = null;
            si0.b bVar = vVar.C;
            if (bVar != null) {
                bVar.f489570a.stop();
            }
            si0.b bVar2 = vVar.C;
            if (bVar2 != null) {
                bVar2.f489570a.release();
            }
            vVar.C = null;
            if (m88911x49655f5c) {
                vVar.f489717g = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(vVar.f489711a.getAssets(), pagPath);
            } else {
                vVar.f489717g = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(pagPath);
            }
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee = vVar.f489717g;
            vVar.f489726p = c20942x379cf5ee != null ? c20942x379cf5ee.m77463x89444d94() : 0L;
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = vVar.f489720j;
            if (surfaceProducer != null) {
                surfaceProducer.mo138098x76500f83(vVar.f489727q, vVar.f489728r);
            }
            com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = vVar.f489718h;
            if (c20951x8730befb != null) {
                c20951x8730befb.m77522xe496cc76();
            }
            com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb2 = vVar.f489718h;
            if (c20951x8730befb2 != null) {
                c20951x8730befb2.m77524x41012807();
            }
            vVar.f489718h = null;
            vVar.f489716f = new com.p314xaae8f345.mm.rfx.C20948xd56d46d3();
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = vVar.f489720j;
            vVar.f489718h = com.p314xaae8f345.mm.rfx.C20951x8730befb.m77506xf88c0183(surfaceProducer2 != null ? surfaceProducer2.mo138084xcf572877() : null);
            com.p314xaae8f345.mm.rfx.C20948xd56d46d3 c20948xd56d46d32 = vVar.f489716f;
            if (c20948xd56d46d32 != null) {
                c20948xd56d46d32.m77494x3e3ac3e8(vVar.f489717g);
            }
            com.p314xaae8f345.mm.rfx.C20948xd56d46d3 c20948xd56d46d33 = vVar.f489716f;
            if (c20948xd56d46d33 != null) {
                c20948xd56d46d33.m77499x42c875eb(vVar.f489718h);
            }
            com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 c24030xcb335ec82 = vVar.f489719i;
            java.lang.Double valueOf = c24030xcb335ec82 != null ? java.lang.Double.valueOf(c24030xcb335ec82.m88905x2c99c95f()) : null;
            if (valueOf != null && valueOf.doubleValue() > 0.0d && (c20948xd56d46d3 = vVar.f489716f) != null) {
                c20948xd56d46d3.m77496x62e2c46b((float) valueOf.doubleValue());
            }
            valueAnimator.setDuration((long) ((vVar.f489726p / 1000) / vVar.f489729s));
            io.p3284xd2ae381c.Log.i(str, "reset width:" + vVar.f489727q + ", height:" + vVar.f489728r + ", duration:" + vVar.f489726p);
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee2 = vVar.f489717g;
            java.nio.ByteBuffer m77359x5ac32a35 = c20942x379cf5ee2 != null ? c20942x379cf5ee2.m77359x5ac32a35() : null;
            com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee3 = vVar.f489717g;
            vVar.D = c20942x379cf5ee3 != null ? c20942x379cf5ee3.m77361x8e7cff19() : 0L;
            if (m77359x5ac32a35 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee4 = vVar.f489717g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c20942x379cf5ee4);
                sb6.append(c20942x379cf5ee4.m77406x346425());
                sb6.append("_aac");
                java.lang.String filePath = sb6.toString();
                try {
                    com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(filePath);
                    byte[] bArr = new byte[1024];
                    while (m77359x5ac32a35.hasRemaining()) {
                        try {
                            int min = java.lang.Math.min(m77359x5ac32a35.remaining(), 1024);
                            m77359x5ac32a35.get(bArr, 0, min);
                            y6Var.write(bArr, 0, min);
                        } catch (java.lang.Throwable th6) {
                            y6Var.close();
                            throw th6;
                        }
                    }
                    y6Var.close();
                    si0.b bVar3 = new si0.b();
                    vVar.C = bVar3;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
                    bVar3.f489570a.setDataSource(filePath);
                    si0.b bVar4 = vVar.C;
                    if (bVar4 != null) {
                        bVar4.f489571b = (int) c24030xcb335ec8.m88908x3781c2fe();
                    }
                    si0.b bVar5 = vVar.C;
                    if (bVar5 != null) {
                        bVar5.f489570a.prepare();
                    }
                } catch (java.lang.Exception e17) {
                    io.p3284xd2ae381c.Log.e(str, "write audio file error. " + e17);
                }
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = vVar.f489730t;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new si0.s(c24030xcb335ec8, vVar, null), 2, null);
            this.f489699d = 1;
            if (((p3325xe03a0797.p3326xc267989b.c3) d17).C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer3 = vVar.f489720j;
        this.f489702g.mo146xb9724478(new java.lang.Long(surfaceProducer3 != null ? surfaceProducer3.id() : 0L));
        return jz5.f0.f384359a;
    }
}
