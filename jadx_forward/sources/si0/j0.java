package si0;

/* loaded from: classes13.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f489624e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 f489625f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(si0.l0 l0Var, com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 c24030xcb335ec8, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489624e = l0Var;
        this.f489625f = c24030xcb335ec8;
        this.f489626g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new si0.j0(this.f489624e, this.f489625f, this.f489626g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af7;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489623d;
        si0.l0 l0Var = this.f489624e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 c24030xcb335ec8 = this.f489625f;
            int m88908x3781c2fe = (int) c24030xcb335ec8.m88908x3781c2fe();
            l0Var.getClass();
            android.animation.ValueAnimator valueAnimator = l0Var.f489645o;
            valueAnimator.setRepeatCount(m88908x3781c2fe);
            double m88909x755bd410 = c24030xcb335ec8.m88909x755bd410();
            double m88904x1c4fb41d = c24030xcb335ec8.m88904x1c4fb41d();
            l0Var.f489647q = (int) m88909x755bd410;
            l0Var.f489648r = (int) m88904x1c4fb41d;
            java.lang.String pagPath = c24030xcb335ec8.m88903x500f7917();
            boolean m88911x49655f5c = c24030xcb335ec8.m88911x49655f5c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagPath, "pagPath");
            l0Var.f489637g = null;
            si0.b bVar = l0Var.C;
            if (bVar != null) {
                bVar.f489570a.stop();
            }
            si0.b bVar2 = l0Var.C;
            if (bVar2 != null) {
                bVar2.f489570a.release();
            }
            l0Var.C = null;
            if (m88911x49655f5c) {
                l0Var.f489637g = org.p3363xbe4143f1.C29690xfae77312.m154715x243906(l0Var.f489631a.getAssets(), pagPath);
            } else {
                l0Var.f489637g = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(pagPath);
            }
            org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312 = l0Var.f489637g;
            l0Var.f489646p = c29690xfae77312 != null ? c29690xfae77312.m154837x89444d94() : 0L;
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = l0Var.f489640j;
            if (surfaceProducer != null) {
                surfaceProducer.mo138098x76500f83(l0Var.f489647q, l0Var.f489648r);
            }
            org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = l0Var.f489638h;
            if (c29703xc0897f57 != null) {
                c29703xc0897f57.m154928xe496cc76();
            }
            org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f572 = l0Var.f489638h;
            if (c29703xc0897f572 != null) {
                c29703xc0897f572.m154931x41012807();
            }
            l0Var.f489638h = null;
            l0Var.f489636f = new org.p3363xbe4143f1.C29699xf00d0af7();
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer2 = l0Var.f489640j;
            l0Var.f489638h = org.p3363xbe4143f1.C29703xc0897f57.m154910xf88c0183(surfaceProducer2 != null ? surfaceProducer2.mo138084xcf572877() : null);
            org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af72 = l0Var.f489636f;
            if (c29699xf00d0af72 != null) {
                c29699xf00d0af72.m154892x3e3ac3e8(l0Var.f489637g);
            }
            org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af73 = l0Var.f489636f;
            if (c29699xf00d0af73 != null) {
                c29699xf00d0af73.m154897x42c875eb(l0Var.f489638h);
            }
            com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 c24030xcb335ec82 = l0Var.f489639i;
            java.lang.Double valueOf = c24030xcb335ec82 != null ? java.lang.Double.valueOf(c24030xcb335ec82.m88905x2c99c95f()) : null;
            if (valueOf != null && valueOf.doubleValue() > 0.0d && (c29699xf00d0af7 = l0Var.f489636f) != null) {
                c29699xf00d0af7.m154894x62e2c46b((float) valueOf.doubleValue());
            }
            valueAnimator.setDuration((long) ((l0Var.f489646p / 1000) / l0Var.f489649s));
            java.lang.String str = "reset width:" + l0Var.f489647q + ", height:" + l0Var.f489648r + ", duration:" + l0Var.f489646p;
            java.lang.String str2 = l0Var.f489634d;
            io.p3284xd2ae381c.Log.i(str2, str);
            org.p3363xbe4143f1.C29690xfae77312 c29690xfae773122 = l0Var.f489637g;
            java.nio.ByteBuffer m154672x5ac32a35 = c29690xfae773122 != null ? c29690xfae773122.m154672x5ac32a35() : null;
            org.p3363xbe4143f1.C29690xfae77312 c29690xfae773123 = l0Var.f489637g;
            l0Var.D = c29690xfae773123 != null ? c29690xfae773123.m154674x8e7cff19() : 0L;
            if (m154672x5ac32a35 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                org.p3363xbe4143f1.C29690xfae77312 c29690xfae773124 = l0Var.f489637g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c29690xfae773124);
                sb6.append(c29690xfae773124.m154733x346425());
                sb6.append("_aac");
                java.lang.String filePath = sb6.toString();
                try {
                    com.p314xaae8f345.mm.vfs.y6 y6Var = new com.p314xaae8f345.mm.vfs.y6(filePath);
                    byte[] bArr = new byte[1024];
                    while (m154672x5ac32a35.hasRemaining()) {
                        try {
                            int min = java.lang.Math.min(m154672x5ac32a35.remaining(), 1024);
                            m154672x5ac32a35.get(bArr, 0, min);
                            y6Var.write(bArr, 0, min);
                        } catch (java.lang.Throwable th6) {
                            y6Var.close();
                            throw th6;
                        }
                    }
                    y6Var.close();
                    si0.b bVar3 = new si0.b();
                    l0Var.C = bVar3;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
                    bVar3.f489570a.setDataSource(filePath);
                    si0.b bVar4 = l0Var.C;
                    if (bVar4 != null) {
                        bVar4.f489571b = (int) c24030xcb335ec8.m88908x3781c2fe();
                    }
                    si0.b bVar5 = l0Var.C;
                    if (bVar5 != null) {
                        bVar5.f489570a.prepare();
                    }
                } catch (java.lang.Exception e17) {
                    io.p3284xd2ae381c.Log.e(str2, "write audio file error. " + e17);
                }
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = l0Var.f489650t;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.r2 d17 = p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new si0.i0(c24030xcb335ec8, l0Var, null), 2, null);
            this.f489623d = 1;
            if (((p3325xe03a0797.p3326xc267989b.c3) d17).C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer3 = l0Var.f489640j;
        this.f489626g.mo146xb9724478(new java.lang.Long(surfaceProducer3 != null ? surfaceProducer3.id() : 0L));
        return jz5.f0.f384359a;
    }
}
