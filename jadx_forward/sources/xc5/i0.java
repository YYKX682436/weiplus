package xc5;

/* loaded from: classes12.dex */
public final class i0 extends xc5.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        super(msgInfo, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
    }

    @Override // mf3.k
    public gg3.c a() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return new eg3.i(i(), "", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // xc5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co.a d() {
        /*
            r4 = this;
            sf3.g r0 = r4.e()
            r1 = 0
            if (r0 == 0) goto L27
            sf3.m r2 = sf3.m.f488936e
            sf3.m r3 = sf3.m.f488937f
            sf3.m[] r2 = new sf3.m[]{r2, r3}
            sf3.g r0 = r0.b(r2)
            sf3.m r2 = r0.f488924e
            sf3.m r3 = sf3.m.f488935d
            if (r2 == r3) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.c()
            goto L28
        L27:
            r0 = r1
        L28:
            java.lang.String r2 = ""
            if (r0 != 0) goto L2d
            r0 = r2
        L2d:
            boolean r3 = r26.n0.N(r0)
            if (r3 == 0) goto L37
            java.lang.String r0 = r4.i()
        L37:
            boolean r3 = r26.n0.N(r0)
            if (r3 == 0) goto L57
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "createForwardViewModel: empty imgPath, msgId="
            r0.<init>(r2)
            com.tencent.mm.storage.f9 r2 = r4.f534932a
            long r2 = r2.m124847x74d37ac6()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.ImageMsgHistoryGalleryMediaInfo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r0)
            return r1
        L57:
            jd5.a r1 = new jd5.a
            r1.<init>()
            r4.h(r1)
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r0 != 0) goto L64
            goto L65
        L64:
            r2 = r0
        L65:
            r1.p(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.i0.d():co.a");
    }

    @Override // mf3.k
    public sf3.g e() {
        java.lang.String path;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f534932a;
        java.lang.String path2 = "";
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            path = m11.b1.Di().D2(f9Var, f9Var.z0(), false);
            if (path == null) {
                path = "";
            }
            if ((path.length() > 0) && !r26.i0.n(path, "hd", false) && com.p314xaae8f345.mm.vfs.w6.j(path.concat("hd"))) {
                path = path.concat("hd");
            }
        } catch (java.lang.Exception unused) {
            path = "";
        }
        java.lang.String path3 = i();
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.l0 Di = m11.b1.Di();
            m11.b0 S1 = Di.S1(f9Var);
            if (S1 != null && S1.j()) {
                long j17 = S1.f404182q;
                if (j17 > 0) {
                    m11.b0 C1 = Di.C1(java.lang.Long.valueOf(j17));
                    if (C1.f404166a == S1.f404182q) {
                        path2 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(this.f534932a, bm5.f0.f104095g, C1.f404170e, "", "");
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageMsgHistoryGalleryMediaInfo", "getOriginImagePath failed: " + e17.getMessage());
        }
        if (path3.length() == 0) {
            path3 = path;
        }
        if (path3.length() == 0) {
            return null;
        }
        java.lang.String mediaId = mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488939h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        linkedHashMap.put(mVar, path);
        sf3.m mVar2 = sf3.m.f488937f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path3, "path");
        linkedHashMap.put(mVar2, path3);
        if (path2.length() > 0) {
            sf3.m mVar3 = sf3.m.f488936e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path2, "path");
            linkedHashMap.put(mVar3, path2);
        }
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar2);
        a17.f488925f = new sf3.a();
        return a17;
    }

    @Override // mf3.k
    public java.lang.String g() {
        return i();
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407656e;
    }

    public final java.lang.String i() {
        boolean z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f534932a;
        try {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(f9Var);
            if (S1 == null || S1.f404166a <= 0) {
                return "";
            }
            if (f9Var.o2()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(f9Var.m124847x74d37ac6(), f9Var.Q0());
                java.lang.String str = J0 != null ? J0.f68099xfeae815 : null;
                if (str != null && !r26.n0.N(str)) {
                    z17 = false;
                    if (!z17 && com.p314xaae8f345.mm.vfs.w6.j(str)) {
                        return str;
                    }
                }
                z17 = true;
                if (!z17) {
                    return str;
                }
            }
            ((j70.e) ((k70.z) i95.n0.c(k70.z.class))).getClass();
            java.lang.String c17 = m11.c0.c(f9Var, S1);
            return c17 == null ? "" : c17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageMsgHistoryGalleryMediaInfo", "getMidImagePath failed: " + e17.getMessage());
            return "";
        }
    }
}
