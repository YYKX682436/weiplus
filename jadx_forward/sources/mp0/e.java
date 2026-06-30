package mp0;

/* loaded from: classes15.dex */
public final class e extends mp0.h {

    /* renamed from: r, reason: collision with root package name */
    public final xo0.d f411969r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e f411970s;

    /* renamed from: t, reason: collision with root package name */
    public final zo0.i f411971t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ip0.a _url, cp0.f target, vo0.h reaper, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        super(_url, target, reaper, w1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_url, "_url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reaper, "reaper");
        vo0.h hVar = this.f411975h;
        this.f411969r = hVar.f520013j;
        this.f411970s = hVar.f520012i;
        this.f411971t = hVar.f520015l;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(yo0.h r20, mp0.f r21) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp0.e.h(yo0.h, mp0.f):void");
    }

    public final boolean i() {
        boolean z17;
        ip0.a aVar = this.f411973f;
        if (aVar == null) {
            return false;
        }
        if (aVar != null) {
            ip0.b bVar = ip0.b.ASSET_DATA;
            ip0.b bVar2 = aVar.f375107b;
            if (bVar2 != bVar && bVar2 != ip0.b.DRAWABLE_ID && bVar2 != ip0.b.LOCAL_PATH) {
                z17 = false;
                return !z17 || this.f411975h.f520005b.f545632d == yo0.h.f545625e;
            }
        }
        z17 = true;
        if (z17) {
            return true;
        }
    }

    public final mp0.a j(hp0.i iVar, jp0.f fVar) {
        hp0.g d17;
        try {
            zo0.i iVar2 = this.f411971t;
            vo0.h hVar = this.f411975h;
            hp0.g a17 = iVar2 != null ? iVar2.a(hVar.a().f302278a, hVar, fVar) : null;
            if (!(a17 instanceof hp0.g)) {
                a17 = null;
            }
            if (a17 != null) {
                dp0.a aVar = hVar.f520016m;
                boolean z17 = false;
                if (aVar != null && dp0.a.e(aVar, null, 1, null)) {
                    z17 = true;
                }
                if (!z17) {
                    mp0.a aVar2 = new mp0.a(a17, new mp0.d(this, iVar, a17));
                    vz5.b.a(fVar, null);
                    return aVar2;
                }
                dp0.a aVar3 = hVar.f520016m;
                if (aVar3 != null && (d17 = aVar3.d(hVar.a().f302278a, hVar, a17, dp0.c.f323645f)) != null) {
                    e(iVar, a17, d17, this);
                    mp0.a aVar4 = new mp0.a(d17, mp0.c.f411965d);
                    vz5.b.a(fVar, null);
                    return aVar4;
                }
            }
            vz5.b.a(fVar, null);
            return null;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(fVar, th6);
                throw th7;
            }
        }
    }

    public final void k(hp0.i iVar, long j17, mp0.f fVar) {
        jp0.f a17;
        com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e eVar;
        hp0.e eVar2 = new hp0.e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("whenDataReady ");
        ip0.a aVar = this.f411973f;
        sb6.append(aVar);
        sb6.append(" httpResponse ");
        sb6.append(iVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.ImageLoadWorkTask", sb6.toString());
        eVar2.f364442a = 2;
        vo0.h hVar = this.f411975h;
        if (iVar != null) {
            if ((iVar.f364447a != null ? iVar : null) != null && (a17 = iVar.a()) != null) {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    mp0.a j18 = j(iVar, a17);
                    if (j18 == null) {
                        ep0.a aVar2 = hVar.f520018o;
                        if (aVar2 != null) {
                            aVar2.a(false, new java.lang.Object[0]);
                        }
                        ((mp0.g) fVar).b();
                        vz5.b.a(a17, null);
                        return;
                    }
                    hp0.g gVar = j18.f411960a;
                    if (gVar != null) {
                        pm0.c cVar = new pm0.c("Transcoder");
                        dp0.a aVar3 = hVar.f520017n;
                        hp0.g d17 = aVar3 != null ? aVar3.d(hVar.a().f302278a, hVar, gVar, dp0.c.f323644e) : null;
                        if (d17 != null) {
                            gVar = d17;
                        }
                        dp0.a aVar4 = hVar.f520016m;
                        hp0.g d18 = aVar4 != null ? aVar4.d(hVar.a().f302278a, hVar, gVar, dp0.c.f323644e) : null;
                        if (d18 != null) {
                            gVar = d18;
                        }
                        hp0.g d19 = aVar4 != null ? aVar4.d(hVar.a().f302278a, hVar, gVar, dp0.c.f323643d) : null;
                        if (d19 != null) {
                            gVar = d19;
                        }
                        cVar.a();
                        java.lang.Object obj = gVar.f364446a;
                        eVar2.f364443b = obj;
                        byte[] a18 = a17.a();
                        eVar2.f364444c = a18 != null ? a18.length : 0;
                        ((mp0.g) fVar).a(eVar2);
                        if (obj != null && (eVar = this.f411970s) != null) {
                            eVar.c(hVar.f520024u, aVar4, obj);
                        }
                    }
                    pm0.c cVar2 = new pm0.c("lazytask commit");
                    j18.f411961b.mo152xb9724478();
                    cVar2.a();
                    long j19 = currentTimeMillis - j17;
                    ep0.f fVar2 = hVar.f520009f;
                    if (fVar2 != null) {
                        fVar2.b(j19);
                    }
                    ep0.a aVar5 = hVar.f520018o;
                    if (aVar5 != null) {
                        aVar5.a(true, new java.lang.Object[0]);
                    }
                    vz5.b.a(a17, null);
                    return;
                } finally {
                }
            }
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Loader.ImageLoadWorkTask", "httpRespone value is null %s %s", aVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        ep0.a aVar6 = hVar.f520018o;
        if (aVar6 != null) {
            aVar6.a(false, new java.lang.Object[0]);
        }
        ((mp0.g) fVar).b();
    }
}
