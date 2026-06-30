package xc5;

/* loaded from: classes12.dex */
public final class k1 extends vf3.i {

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f535047g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f535048h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f535049i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f535050m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f535051n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ctx) {
        super(ctx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        this.f535047g = ctx;
        this.f535048h = new java.util.LinkedHashMap();
        this.f535049i = new java.util.LinkedHashMap();
        this.f535050m = jz5.h.b(xc5.f1.f534981d);
        this.f535051n = jz5.h.b(xc5.e1.f534969d);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(xc5.k1 r16, mf3.k r17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r18, mf3.w r19, l70.d r20, l70.d r21, gg3.c r22, sf3.g r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.b7(xc5.k1, mf3.k, com.tencent.mm.storage.f9, mf3.w, l70.d, l70.d, gg3.c, sf3.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public vf3.d K(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        return (vf3.d) ((java.util.LinkedHashMap) this.f535048h).get(W6(mediaInfo));
    }

    @Override // vf3.a
    public vf3.c S3(mf3.k mediaInfo) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        sf3.g e17 = mediaInfo.e();
        java.lang.String c17 = e17 != null ? e17.c() : null;
        if (c17 == null) {
            c17 = "";
        }
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar != null ? iVar.b() : null;
        if (r26.n0.N(c17) || !com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.g0a;
        } else {
            boolean z17 = false;
            if (b17 != null && tg3.s1.a(b17)) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.o6k;
            } else {
                if (b17 != null && b17.z2()) {
                    z17 = true;
                }
                if (z17) {
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.g07;
                } else {
                    jx3.f.INSTANCE.d(31328, 1, 5000);
                    i17 = com.p314xaae8f345.mm.R.C30867xcad56011.g08;
                }
            }
        }
        java.lang.String string = this.f535047g.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return new vf3.c(string);
    }

    @Override // vf3.a
    public vf3.b T4(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        java.lang.String mo2110x5db1b11 = mediaInfo.mo2110x5db1b11();
        java.util.Map map = this.f535049i;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        if (linkedHashMap.get(mo2110x5db1b11) != null) {
            return (vf3.b) linkedHashMap.get(mo2110x5db1b11);
        }
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar.b();
        j15.d dVar = new j15.d();
        java.lang.String j17 = b17.j();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "getContent(...)");
        dVar.m126728xdc93280d(j17);
        long m140204x23255ddc = dVar.o().m140204x23255ddc();
        long r17 = dVar.o().r();
        j15.c t17 = dVar.o().t();
        long m140208xfb854877 = t17 != null ? t17.m140208xfb854877() : 0L;
        j15.c t18 = dVar.o().t();
        long o17 = t18 != null ? t18.o() : 0L;
        j15.c t19 = dVar.o().t();
        long p17 = t19 != null ? t19.p() : 0L;
        wh5.f fVar = wh5.f.f527585a;
        vf3.b bVar = new vf3.b(m140204x23255ddc, r17, m140208xfb854877, o17, p17, ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(b17) <= 0);
        map.put(mo2110x5db1b11, bVar);
        return bVar;
    }

    @Override // vf3.i
    public void V6() {
        v65.i.b(this.f517934f, null, new xc5.c1(this, null), 1, null);
    }

    @Override // vf3.a
    public boolean c2(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        vf3.d dVar = (vf3.d) ((java.util.LinkedHashMap) this.f535048h).get(W6(mediaInfo));
        if (dVar != null) {
            return dVar.f517907c;
        }
        return false;
    }

    public final sf3.g c7(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488937f;
        linkedHashMap.put(mVar, "");
        return new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
    }

    public final gg3.c d7(java.lang.String str) {
        return new gg3.c(str, null, null, null, 0L, false, 62, null);
    }

    public final l70.d e7(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, mf3.w wVar) {
        try {
            return ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).cj(f9Var, xc5.b1.f534930a[wVar.ordinal()] == 1 ? s70.c.f485453h : s70.c.f485452g, true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.MsgHistoryGalleryLiveStateManager", "genImageDownloadParams failed: " + e17.getMessage());
            return null;
        }
    }

    public final l70.d f7(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, mf3.w wVar) {
        try {
            return ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).cj(f9Var, xc5.b1.f534930a[wVar.ordinal()] == 1 ? s70.c.f485455m : s70.c.f485454i, true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.MsgHistoryGalleryLiveStateManager", "genVideoDownloadParams failed: " + e17.getMessage());
            return null;
        }
    }

    public final java.util.HashSet g7() {
        return (java.util.HashSet) ((jz5.n) this.f535051n).mo141623x754a37bb();
    }

    public final java.util.HashSet h7() {
        return (java.util.HashSet) ((jz5.n) this.f535050m).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i7(mf3.k r10, mf3.w r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.i7(mf3.k, mf3.w, java.lang.String, java.lang.String):boolean");
    }

    public final void k7(mf3.k kVar, vf3.e eVar) {
        java.lang.String mo2110x5db1b11 = kVar.mo2110x5db1b11();
        Y6(kVar, eVar, new vf3.f(eVar, null, 0, 0.0f, 14, null), d7(mo2110x5db1b11), c7(mo2110x5db1b11));
    }

    public final void l7(mf3.k kVar, java.lang.String str, java.lang.String str2) {
        boolean Bi = ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).Bi(str2);
        lf3.k a17 = lf3.l.f399859a.a(str);
        this.f535048h.put(W6(kVar), new vf3.d("", "", Bi, a17 != null ? a17.f399855a : 0, a17 != null ? a17.f399856b : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7(mf3.k r22, l70.d r23, java.lang.String r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.m7(mf3.k, l70.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n7(mf3.k r11, l70.d r12, java.lang.String r13, mf3.w r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.k1.n7(mf3.k, l70.d, java.lang.String, mf3.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public void p1(mf3.k mediaInfo, java.lang.String path, vf3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        if ((mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null) == null) {
            return;
        }
        gg3.c a17 = mediaInfo.a();
        gg3.c cVar = a17 == null ? new gg3.c(mediaInfo.mo2110x5db1b11(), null, null, null, 0L, false, 62, null) : a17;
        java.lang.String mediaId = mediaInfo.mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488938g;
        linkedHashMap.put(mVar, path);
        sf3.g a18 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.p314xaae8f345.mm.vfs.z7 a19 = com.p314xaae8f345.mm.vfs.z7.a(a18.c());
        java.lang.String str = a19.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a19 = new com.p314xaae8f345.mm.vfs.z7(a19.f294810d, a19.f294811e, l17, a19.f294813g, a19.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a19, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            vf3.i.Z6(this, mediaInfo, vf3.e.f517917n, null, cVar, a18, 2, null);
        } else {
            vf3.i.Z6(this, mediaInfo, vf3.e.f517915i, null, cVar, a18, 2, null);
        }
    }

    @Override // vf3.a
    public void v2(mf3.k mediaInfo, vf3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        a7(mediaInfo, listener);
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null) {
            k7(mediaInfo, vf3.e.f517918o);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17 = iVar.b();
        mf3.w mo147256x74bf41ce = mediaInfo.mo147256x74bf41ce();
        l70.d f76 = f7(b17, mo147256x74bf41ce);
        if (f76 == null) {
            k7(mediaInfo, vf3.e.f517918o);
            return;
        }
        l70.d e76 = e7(b17, mo147256x74bf41ce);
        if (e76 == null) {
            k7(mediaInfo, vf3.e.f517918o);
            return;
        }
        gg3.c cVar = new gg3.c(mediaInfo.mo2110x5db1b11(), e76.f398338f, f76.f398338f, null, 0L, false, 40, null);
        java.lang.String mediaId = mediaInfo.mo2110x5db1b11();
        sf3.m mVar = xc5.b1.f534930a[mo147256x74bf41ce.ordinal()] == 1 ? sf3.m.f488936e : sf3.m.f488937f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.Map linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar2 = sf3.m.f488937f;
        java.lang.String path = e76.f398338f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        linkedHashMap.put(mVar2, path);
        linkedHashMap.put(sf3.m.f488939h, path);
        linkedHashMap.put(sf3.m.f488936e, path);
        if ((60 & 1) != 0) {
            linkedHashMap = kz5.q0.f395534d;
        }
        java.util.Map map = linkedHashMap;
        java.lang.String previewPath = (60 & 4) != 0 ? "" : null;
        java.lang.String detectPath = (60 & 8) != 0 ? "" : null;
        sf3.m detectType = (60 & 16) != 0 ? sf3.m.f488935d : null;
        sf3.b loadStrategy = (60 & 32) != 0 ? new sf3.b() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPath, "previewPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectPath, "detectPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectType, "detectType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadStrategy, "loadStrategy");
        sf3.g gVar = new sf3.g(map, mediaId, previewPath, detectPath, null, loadStrategy, 16, null);
        java.lang.String str = (java.lang.String) gVar.f488920a.get(mVar);
        gVar.f488923d = str != null ? str : "";
        gVar.f488924e = mVar;
        if (!tg3.s1.a(b17)) {
            xc5.a1 a1Var = new xc5.a1(this, mediaInfo, b17, e76.f398337e, f76.f398337e, cVar, gVar);
            e76.f398346n = new java.lang.ref.WeakReference(a1Var);
            f76.f398346n = new java.lang.ref.WeakReference(a1Var);
            v65.i.b(this.f517934f, null, new xc5.i1(this, mediaInfo, mo147256x74bf41ce, e76, f76, gVar, cVar, b17, null), 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.MsgHistoryGalleryLiveStateManager", "tryDownload SEC_INVALID, mediaId=" + mediaInfo.mo2110x5db1b11());
        vf3.e eVar = vf3.e.f517919p;
        Y6(mediaInfo, eVar, new vf3.f(eVar, null, 0, 0.0f, 14, null), cVar, gVar);
    }

    @Override // vf3.a
    public void x6(mf3.k mediaInfo) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 b17;
        mf3.w mo147256x74bf41ce;
        l70.d e76;
        l70.d f76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        uh5.i iVar = mediaInfo instanceof uh5.i ? (uh5.i) mediaInfo : null;
        if (iVar == null || (e76 = e7((b17 = iVar.b()), (mo147256x74bf41ce = mediaInfo.mo147256x74bf41ce()))) == null || (f76 = f7(b17, mo147256x74bf41ce)) == null) {
            return;
        }
        v65.i.b(this.f517934f, null, new xc5.d1(this, e76, mediaInfo, mo147256x74bf41ce, f76, null), 1, null);
    }
}
