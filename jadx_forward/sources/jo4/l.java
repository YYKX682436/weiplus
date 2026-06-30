package jo4;

/* loaded from: classes10.dex */
public final class l implements t21.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f382453a = "MicroMsg.CompositionVideoTranscoderImpl@" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public d11.n f382454b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f382455c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382456d;

    public l() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97812xedc5400c(new p05.f2());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.m97811x534d5c42(2);
        xm5.b.f536931a = new p05.g2();
        this.f382456d = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v27, types: [uo4.f, uo4.e] */
    public static final void a(jo4.l lVar, int i17, float f17, rm5.v vVar, t21.c cVar, rm5.q qVar, long j17, java.lang.String str, int i18) {
        uo4.g gVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        lVar.getClass();
        int i19 = i17 < 0 ? -i17 : i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report export result: ");
        sb6.append(i17);
        sb6.append(" message:[");
        java.util.Map map = xo4.a.f537300a;
        sb6.append(map.containsKey(java.lang.Integer.valueOf(i19)) ? java.lang.String.valueOf(((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i19))) : "");
        sb6.append("] path:");
        sb6.append(lVar.f382456d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f382453a, sb6.toString());
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596 c17 = xo4.d.f537303a.c(uuid);
        c17.f143098g = qVar.f479071c;
        c17.f143103l = i19;
        c17.f143106o = j17;
        c17.f143104m = 1L;
        c17.A = 0L;
        if (lVar.f382454b == null) {
            c17.B = 0L;
        } else {
            c17.B = ((d11.d) r0).f307189a;
        }
        uo4.h hVar = new uo4.h();
        hVar.f511241d = false;
        java.util.Iterator it = vVar.f479117l.iterator();
        while (it.hasNext()) {
            rm5.j it6 = (rm5.j) it.next();
            xo4.d dVar = xo4.d.f537303a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it6, "it");
            int i27 = it6.f479033b;
            if (i27 == 2) {
                uo4.g gVar2 = new uo4.g();
                gVar2.f511222f = it6.f479039h;
                dVar.e(gVar2, it6.f479032a);
                gVar = gVar2;
            } else if (i27 == 1) {
                ?? eVar = new uo4.e();
                java.util.ArrayList arrayList3 = eVar.f511218b;
                arrayList3.add(java.lang.Integer.valueOf(it6.f479042k));
                arrayList3.add(java.lang.Integer.valueOf(it6.f479043l));
                gVar = eVar;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                gVar.f511217a = i27;
            }
            if (gVar != null && (arrayList2 = gVar.f511219c) != null) {
                arrayList2.add(java.lang.Long.valueOf(it6.f479035d));
            }
            if (gVar != null && (arrayList = gVar.f511219c) != null) {
                arrayList.add(java.lang.Long.valueOf(it6.f479036e));
            }
            uo4.g gVar3 = gVar instanceof uo4.g ? gVar : null;
            if (gVar3 != null) {
                gVar3.f511234r = vVar.f479119n != null;
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f.f257122a.d(gVar.f511225i);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(d17, "<set-?>");
                gVar3.f511235s = d17;
            }
            if (gVar != null) {
                hVar.f511238a.add(gVar);
            }
        }
        java.lang.String jSONObject = hVar.b().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        c17.C = c17.b("OriginMediaInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("colorRange", qVar.f479082n);
        jSONObject2.put("colorStandard", qVar.f479083o);
        jSONObject2.put("colorTransfer", qVar.f479084p);
        java.lang.String jSONObject3 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        c17.D = c17.b(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3165xdc770fa5, r26.i0.t(jSONObject3, ",", ";", false), true);
        t21.x1 x1Var = cVar.f496246g;
        c17.G = x1Var.f496594a ? x1Var.f496595b : -1;
        c17.N = i18;
        xo4.d dVar2 = xo4.d.f537303a;
        dVar2.d(uuid, str);
        if (cVar.f496244e && cVar.f496243d) {
            c17.f143113v = 1;
        } else if (cVar.f496243d) {
            c17.f143113v = 2;
        }
        com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f interfaceC25652xcd3d9f6f = vVar.f479123r;
        com.p314xaae8f345.tav.p2946x5a71016.C25649x2dc0947 c25649x2dc0947 = interfaceC25652xcd3d9f6f instanceof com.p314xaae8f345.tav.p2946x5a71016.C25649x2dc0947 ? (com.p314xaae8f345.tav.p2946x5a71016.C25649x2dc0947) interfaceC25652xcd3d9f6f : null;
        com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25650x9122a0cf decoderFactory = c25649x2dc0947 != null ? c25649x2dc0947.getDecoderFactory() : null;
        ko4.e eVar2 = decoderFactory instanceof ko4.e ? (ko4.e) decoderFactory : null;
        if (eVar2 != null) {
            c17.T = eVar2.f391602f;
            c17.U = eVar2.f391603g;
        }
        c17.f143116y = cVar.f496244e ? 1L : 0L;
        c17.E = c17.b("CpuName", r26.i0.v(st3.n.f494089b, ",", ";", false, 4, null), true);
        wm5.h hVar2 = vVar.f479115j;
        wm5.e eVar3 = hVar2 != null ? hVar2.f528897n : null;
        if (eVar3 != null) {
            c17.f143097f = ((java.lang.Number) ((wm5.d) eVar3.f528884d).mo152xb9724478()).longValue();
            c17.f143111t = eVar3.f528883c;
            c17.f143112u = eVar3.f528882b;
        }
        float f18 = 100;
        c17.f143114w = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17684x1bb265e8.a(str, qVar.f479073e / 1000.0f, qVar.f479074f, qVar.f479075g, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_audio_quality_analysis_switch, 0) == 1, vVar.f479118m) * f18;
        c17.f143115x = f17 * f18;
        cl0.g gVar4 = new cl0.g();
        gVar4.r("appUIStatus", com.p314xaae8f345.mm.app.w.INSTANCE.f135422n);
        c17.Y = c17.b("errorDesc", gVar4.toString(), true);
        dVar2.b(uuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0627 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0299  */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v44, types: [int] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r47, java.lang.String r48, t21.c r49, t21.f0 r50) {
        /*
            Method dump skipped, instructions count: 1597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jo4.l.b(java.lang.String, java.lang.String, t21.c, t21.f0):boolean");
    }

    public boolean c(java.lang.String sourcePath, java.lang.String outputPath, t21.c params, yz5.l outputCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePath, "sourcePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputPath, "outputPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputCallback, "outputCallback");
        return b(sourcePath, outputPath, params, new jo4.c(outputCallback));
    }
}
