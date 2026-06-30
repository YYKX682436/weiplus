package ft2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a */
    public static final ft2.b f348052a = new ft2.b();

    public static /* synthetic */ void d(ft2.b bVar, ft2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        bVar.a(dVar, c14994x9b99c079, i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        if (r9.put("target", r8) == null) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ft2.d r15, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ft2.b.a(ft2.d, com.tencent.mm.plugin.finder.storage.FinderItem, int, int):void");
    }

    public final void b(java.lang.String str, ft2.d dVar) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7();
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        java.lang.String m76281x194b99df = c19783xd9a946b72 != null ? c19783xd9a946b72.m76281x194b99df() : null;
        if ((m76281x194b99df == null || m76281x194b99df.length() == 0) && (c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b) != null) {
            c19783xd9a946b7.m76388xc80cdeb(c01.id.c() + '_' + g92.b.f351302e.U());
        }
        c(str, dVar, "", "", 0, 0, 0);
    }

    public final void c(java.lang.String str, ft2.d dVar, java.lang.String mediaInfoJson, java.lang.String customInfoJson, int i17, int i18, int i19) {
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfoJson, "mediaInfoJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customInfoJson, "customInfoJson");
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6556x27d1c949 c6556x27d1c949 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6556x27d1c949();
            c6556x27d1c949.f139057d = 2;
            if (dVar == null || (str2 = dVar.f348072a) == null) {
                str2 = "";
            }
            c6556x27d1c949.f139060g = c6556x27d1c949.b("StageName", str2, true);
            c6556x27d1c949.f139059f = dVar != null ? dVar.f348073b : 0;
            c6556x27d1c949.f139061h = 1;
            if (str == null) {
                str = "";
            }
            c6556x27d1c949.f139058e = c6556x27d1c949.b("FlowId", str, true);
            c6556x27d1c949.f139062i = dVar != null ? dVar.f348074c : 0;
            c6556x27d1c949.f139063j = c6556x27d1c949.b("MediaInfoJson", mediaInfoJson, true);
            c6556x27d1c949.f139064k = c6556x27d1c949.b("CustomInfoJson", customInfoJson, true);
            c6556x27d1c949.f139065l = i17;
            c6556x27d1c949.f139066m = i18;
            c6556x27d1c949.f139067n = i19;
            c6556x27d1c949.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6556x27d1c949);
        } catch (java.lang.Throwable unused) {
        }
    }
}
