package f65;

/* loaded from: classes12.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.y0 f341552a = new f65.y0();

    /* renamed from: b, reason: collision with root package name */
    public static final xs.j1 f341553b = (xs.j1) i95.n0.c(xs.j1.class);

    public static final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7000x9f9cdd79 a(f65.y0 y0Var, r45.qz6 qz6Var) {
        y0Var.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7000x9f9cdd79 c7000x9f9cdd79 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7000x9f9cdd79();
        c7000x9f9cdd79.f143152g = c7000x9f9cdd79.b("ToUsername", qz6Var.f465918h, true);
        c7000x9f9cdd79.f143153h = qz6Var.f465919i;
        c7000x9f9cdd79.f143149d = c7000x9f9cdd79.b("SessionId", qz6Var.f465915e, true);
        c7000x9f9cdd79.f143155j = qz6Var.f465921n;
        c7000x9f9cdd79.f143154i = qz6Var.f465920m;
        c7000x9f9cdd79.f143151f = qz6Var.f465917g;
        c7000x9f9cdd79.f143150e = qz6Var.f465916f;
        c7000x9f9cdd79.f143158m = c7000x9f9cdd79.b("ExtraInfo", qz6Var.f465924q, true);
        return c7000x9f9cdd79;
    }

    public static final void b(f65.y0 y0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        r45.pz6 d17 = y0Var.d(str);
        if (d17 != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f65.z0.f341555a;
            java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(str);
            long longValue = (l17 == null || l17.longValue() <= 0) ? d17.f465038e : l17.longValue();
            if (l17 != null) {
                concurrentHashMap.remove(str);
            }
            jSONObject.put("compressType", d17.f465044n);
            jSONObject.put("encodeType", d17.f465045o);
            jSONObject.put("uploadMs", d17.f465041h);
            jSONObject.put("uploadRawMs", d17.f465043m);
            jSONObject.put("compressMs", d17.f465039f);
            jSONObject.put("sendSuccMs", java.lang.System.currentTimeMillis() - longValue);
            jSONObject.put("rawVideoHitCacheType", d17.f465048r);
            jSONObject.put("videoHitCacheType", d17.f465047q);
            jSONObject.put("unCompressReason", d17.f465046p);
            jSONObject.put("uploadVideoWay", d17.f465049s);
            jSONObject.put("isNewSend", d17.f465050t);
            if (d17.f465038e == 0) {
                jSONObject.put("lostStartTime", "1");
            }
            jSONObject.put("resend_scene", d17.f465051u);
            jSONObject.put("inner_version", 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [r45.pz6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [yz5.l] */
    public static final r45.qz6 c(f65.y0 y0Var, java.lang.String str, yz5.l lVar) {
        r45.pz6 pz6Var;
        y0Var.getClass();
        f65.z zVar = new f65.z(str);
        r45.pz6 d17 = y0Var.d(str);
        if ((d17 != 0 ? d17.f465037d : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSendReporter", "getOrCreateAndUpdateCache get[" + str + "] no cache,will create new value");
            d17 = zVar.mo152xb9724478();
            y0Var.m((r45.pz6) d17, str);
        }
        if (lVar != 0) {
            pz6Var = (r45.pz6) lVar.mo146xb9724478(d17);
            f341552a.m(pz6Var, str);
        } else {
            pz6Var = d17;
        }
        r45.qz6 reporter_struct2 = pz6Var.f465037d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(reporter_struct2, "reporter_struct2");
        return reporter_struct2;
    }

    public final r45.pz6 d(java.lang.String filename) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filename, "filename");
        return (r45.pz6) ((q04.r) f341553b).Di(19, filename, r45.pz6.class);
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new f65.b0(str), "MicroMsg.VideoSendReporter");
    }

    public final void f(java.lang.String str, int i17, int i18) {
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new f65.d0(str, i17, i18), "MicroMsg.VideoSendReporter");
    }

    public final void g(java.lang.String str) {
        if (str == null) {
            return;
        }
        f65.z0.f341555a.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void h(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoSendReporter", "markUnCompress: ".concat(str));
        boolean containsKey = f65.z0.f341555a.containsKey(str);
        ((ku5.t0) ku5.t0.f394148d).b(new f65.j0(str, i17, containsKey), "MicroMsg.VideoSendReporter");
    }

    public final void i(java.lang.String str, int i17) {
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new f65.l0(str, i17), "MicroMsg.VideoSendReporter");
    }

    public final void j(java.lang.String str, f65.y uploadType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uploadType, "uploadType");
        if (str == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new f65.n0(str, uploadType), "MicroMsg.VideoSendReporter");
    }

    public final void k(java.lang.String str, java.lang.String str2, long j17, long j18, long j19, long j27, boolean z17, boolean z18) {
        if (str2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new f65.v0(str2, z18, str, j17, j19, j18, z17, j27), "MicroMsg.VideoSendReporter");
    }

    public final void l(java.lang.String str, java.lang.String str2, int i17, long j17, long j18, long j19, long j27, boolean z17, int i18) {
        if (str2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).b(new f65.x0(str2, i18, i17, j17, j18, j19, z17, j27, str), "MicroMsg.VideoSendReporter");
    }

    public final void m(r45.pz6 pz6Var, java.lang.String str) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        ((q04.r) f341553b).m134976x2690a4ac();
        if (str != null) {
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(r04.a.class);
            }
            r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
            java.lang.String concat = "19_".concat(str);
            r04.b X6 = dVar.X6(concat);
            if (X6 != null) {
                X6.f66004x6ff59086 = str;
                X6.f66005x2262335f = 19;
                X6.f66000x225a93cf = pz6Var != null ? pz6Var.mo14344x5f01b1f6() : null;
                long c17 = c01.id.c();
                X6.f66006xa783a79b = c17;
                X6.f66001x876650f1 = c17 + 259200000;
                com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.V6(dVar, X6, false, false, 6, null);
                return;
            }
            r04.b bVar = new r04.b();
            bVar.f66002xc8a07680 = concat;
            bVar.f66004x6ff59086 = str;
            long c18 = c01.id.c();
            bVar.f65999xac3be4e = c18;
            bVar.f66006xa783a79b = c18;
            bVar.f66001x876650f1 = c18 + 259200000;
            bVar.f66005x2262335f = 19;
            bVar.f66000x225a93cf = pz6Var != null ? pz6Var.mo14344x5f01b1f6() : null;
            com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.U6(dVar, bVar, false, false, false, 14, null);
        }
    }
}
