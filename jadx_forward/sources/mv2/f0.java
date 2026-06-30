package mv2;

/* loaded from: classes10.dex */
public final class f0 {

    /* renamed from: d, reason: collision with root package name */
    public static int f413097d;

    /* renamed from: a, reason: collision with root package name */
    public static final mv2.f0 f413094a = new mv2.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final fp0.o f413095b = new fp0.o(new gp0.g(new gp0.b(100, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "finderUploadImage"));

    /* renamed from: c, reason: collision with root package name */
    public static final ov2.c f413096c = new ov2.c();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f413098e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f413099f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final int f413100g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a7n);

    public void a(mv2.w0 w0Var) {
        pm0.v.X(new mv2.s(w0Var));
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 b(java.lang.String tag, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 objectDesc, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectDesc, "objectDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        if (feedObject.m76824xa52af937() != 0) {
            return objectDesc;
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e = objectDesc.m76962x74cd162e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76962x74cd162e, "getMedia(...)");
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e : m76962x74cd162e) {
            java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c19788xd7cfd73e.m76625xb5887639());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMD5String(...)");
            r45.mb4 m59349xca4ee79d = finderItem.m59349xca4ee79d(a17);
            if (m59349xca4ee79d != null) {
                mv2.t0.f413164a.a(c19788xd7cfd73e, m59349xca4ee79d);
                if (c19788xd7cfd73e.m76613x7f025288() == 4) {
                    c19788xd7cfd73e.m76684xbbf6ce80(m59349xca4ee79d.m75939xb282bd08(50));
                    c19788xd7cfd73e.m76643x5a2cd8fe(m59349xca4ee79d.m75939xb282bd08(49));
                    if (c19788xd7cfd73e.m76629x36bbd779() <= 0 || c19788xd7cfd73e.m76629x36bbd779() > 2000) {
                        qc0.e1 e1Var = (qc0.e1) i95.n0.c(qc0.e1.class);
                        java.lang.String m75945x2fec8307 = m59349xca4ee79d.m75945x2fec8307(0);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        qc0.d1 wi6 = ((pc0.g2) e1Var).wi(m75945x2fec8307);
                        c19788xd7cfd73e.m76682xc9923ded((wi6 != null ? (int) wi6.f442899d : 0) / 1000);
                        if (c19788xd7cfd73e.m76629x36bbd779() <= 0 || c19788xd7cfd73e.m76629x36bbd779() > 2000) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(tag, "NetSceneFinderPost videoDuration invalid:" + m59349xca4ee79d.m75939xb282bd08(3));
                            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        }
                    }
                }
            }
        }
        return objectDesc;
    }

    public void c() {
        f413096c.b(null);
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z result, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.d1().r()).intValue() == 5) {
            result.f257327b = false;
            result.f257326a = false;
        }
        if (result.f257327b || result.f257326a) {
            return;
        }
        finderObj.m59405x1b47e60d(0);
        cu2.u.f303974a.l(finderObj);
    }

    public final r45.mb4 e(java.lang.String filePath, java.lang.String thumbUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "gen img media url %s, thumbUrl %s", filePath, thumbUrl);
        r45.mb4 mb4Var = new r45.mb4();
        mb4Var.set(2, 2);
        if (com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(filePath).m43592x7a249f0b() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l);
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(filePath.getBytes()));
            sb6.append('_');
            sb6.append(com.p314xaae8f345.mm.vfs.w6.l(filePath));
            sb6.append("_rotated");
            java.lang.String sb7 = sb6.toString();
            if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
                filePath = sb7;
            }
        }
        mb4Var.set(0, filePath);
        mb4Var.set(1, thumbUrl);
        mb4Var.set(25, thumbUrl);
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(0)));
        mb4Var.set(46, hc2.l.k(mb4Var.m75945x2fec8307(1)));
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        android.graphics.Point h17 = h(m75945x2fec8307);
        mb4Var.set(4, java.lang.Float.valueOf(h17.x));
        mb4Var.set(5, java.lang.Float.valueOf(h17.y));
        mb4Var.set(10, 1);
        mb4Var.set(13, java.lang.Boolean.FALSE);
        return mb4Var;
    }

    public final r45.mb4 f(java.lang.String filePath, java.lang.String thumbUrl, r45.dd4 dd4Var, java.lang.String coverUrl, java.lang.String fullCoverUrl, r45.fp5 fp5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullCoverUrl, "fullCoverUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "gen video media url %s, thumbUrl %s", filePath, thumbUrl);
        r45.mb4 mb4Var = new r45.mb4();
        mb4Var.set(2, 4);
        mb4Var.set(0, filePath);
        mb4Var.set(1, thumbUrl);
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(filePath.getBytes()));
        mb4Var.set(46, hc2.l.k(thumbUrl));
        mb4Var.set(7, java.lang.Integer.valueOf((int) com.p314xaae8f345.mm.vfs.w6.k(filePath)));
        mb4Var.set(16, coverUrl);
        mb4Var.set(41, fullCoverUrl);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b e17 = hc2.l.e(filePath);
        if (e17 != null) {
            mb4Var.set(4, java.lang.Float.valueOf(e17.f243917c));
            mb4Var.set(5, java.lang.Float.valueOf(e17.f243918d));
            mb4Var.set(8, java.lang.Integer.valueOf(e17.f243916b));
            mb4Var.set(3, java.lang.Integer.valueOf(e17.a()));
            if (dd4Var == null || dd4Var.m75939xb282bd08(3) <= 0) {
                mb4Var.set(24, java.lang.Long.valueOf(e17.f243915a));
            } else {
                mb4Var.set(3, java.lang.Integer.valueOf(dd4Var.m75939xb282bd08(3) / 1000));
                mb4Var.set(24, java.lang.Long.valueOf(dd4Var.m75939xb282bd08(3)));
            }
        }
        mb4Var.set(10, 1);
        if (dd4Var == null) {
            mb4Var.set(13, java.lang.Boolean.FALSE);
        } else {
            mb4Var.set(13, java.lang.Boolean.TRUE);
            mb4Var.set(4, java.lang.Float.valueOf(dd4Var.m75939xb282bd08(4)));
            mb4Var.set(5, java.lang.Float.valueOf(dd4Var.m75939xb282bd08(5)));
            mb4Var.set(14, dd4Var);
        }
        mb4Var.set(52, fp5Var);
        return mb4Var;
    }

    public final android.graphics.Point h(java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        android.graphics.Point point = new android.graphics.Point();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(filePath, options);
        point.x = options.outWidth;
        point.y = options.outHeight;
        if (com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(filePath).m43592x7a249f0b() % 180 != 0) {
            int i17 = point.y;
            point.y = point.x;
            point.x = i17;
        }
        return point;
    }

    public final r45.zi2 i(android.os.Bundle bundle) {
        r45.zi2 zi2Var;
        byte[] byteArray;
        byte[] byteArray2;
        if (bundle == null || (byteArray2 = bundle.getByteArray("MEDIA_EXTRA_MUSIC")) == null) {
            zi2Var = null;
        } else {
            r45.mh4 mh4Var = new r45.mh4();
            try {
                mh4Var.mo11468x92b714fd(byteArray2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                mh4Var = null;
            }
            if (mh4Var == null) {
                zi2Var = null;
            } else {
                zi2Var = new r45.zi2();
                zi2Var.set(0, mh4Var.f462056v >= 1 ? pm0.v.u(mh4Var.f462057w) : java.lang.String.valueOf(mh4Var.f462041d));
                zi2Var.set(11, java.lang.Integer.valueOf(mh4Var.f462056v));
                zi2Var.set(1, mh4Var.f462049o);
                zi2Var.set(2, mh4Var.f462046i);
                java.util.LinkedList linkedList = mh4Var.f462047m;
                zi2Var.set(3, linkedList != null ? (java.lang.String) kz5.n0.Z(linkedList) : null);
                zi2Var.set(5, mh4Var.f462044g);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("post with extra music sid: ");
            sb6.append(mh4Var != null ? java.lang.Integer.valueOf(mh4Var.f462041d) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb6.toString());
        }
        if (bundle != null && (byteArray = bundle.getByteArray("ORIGIN_MUSIC_INFO")) != null) {
            zi2Var = new r45.zi2();
            try {
                zi2Var.mo11468x92b714fd(byteArray);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
                zi2Var = null;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("post with origin music sid: ");
            sb7.append(zi2Var != null ? zi2Var.m75945x2fec8307(12) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[getMusicInfo] name:");
        sb8.append(zi2Var != null ? zi2Var.m75945x2fec8307(2) : null);
        sb8.append(" doc_type:");
        sb8.append(zi2Var != null ? java.lang.Integer.valueOf(zi2Var.m75939xb282bd08(11)) : null);
        sb8.append(" docId:");
        sb8.append(zi2Var != null ? zi2Var.m75945x2fec8307(0) : null);
        sb8.append(" song_id:");
        sb8.append(zi2Var != null ? zi2Var.m75945x2fec8307(12) : null);
        sb8.append(" mediaStreamingUrl:");
        sb8.append(zi2Var != null ? zi2Var.m75945x2fec8307(5) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb8.toString());
        return zi2Var;
    }

    public final long j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = finderItem.getFeedObject();
        long j17 = feedObject.m76830x805d0e64() ? 1L : 0L;
        r45.dm2 m76806xdef68064 = feedObject.m76806xdef68064();
        return ((m76806xdef68064 != null ? m76806xdef68064.m75939xb282bd08(2) : 0) & 4) > 0 ? j17 | 2 : j17;
    }

    public final int k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem) {
        r45.z31 m76952x1a600de1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = finderItem.getFeedObject().m76802x2dd01666();
        if (9 == ((m76802x2dd01666 == null || (m76952x1a600de1 = m76802x2dd01666.m76952x1a600de1()) == null) ? 0 : m76952x1a600de1.m75939xb282bd08(6))) {
            return 2;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = finderItem.f66946x284ddcb8;
        int m76275xbcc8608a = c19783xd9a946b7 != null ? c19783xd9a946b7.m76275xbcc8608a() : 0;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = finderItem.f66946x284ddcb8;
        if ((c19783xd9a946b72 != null ? c19783xd9a946b72.m76250x38d97590() : 0) == 1) {
            if (m76275xbcc8608a != 38 && m76275xbcc8608a != 43 && m76275xbcc8608a != 44) {
                return 4;
            }
        } else {
            if (m76275xbcc8608a == 13) {
                return 3;
            }
            if (m76275xbcc8608a != 16) {
                return (m76275xbcc8608a == 60 || m76275xbcc8608a == 61) ? 6 : 0;
            }
        }
        return 1;
    }

    public final int l() {
        int i17;
        if (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a.a().r()).booleanValue()) {
            return f413100g;
        }
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z17 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        return (i18 - 2) / 3;
    }

    public final boolean m(r45.qb4 postInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "[isDraftToManyTry] tryCount:" + postInfo + ".tryCount, configMax:5");
        return postInfo.m75939xb282bd08(1) > 5;
    }

    public final boolean n(r45.qb4 postInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postInfo, "postInfo");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "[isToManyTry] tryCount:" + postInfo.m75939xb282bd08(1) + ", configMax:5");
        return postInfo.m75939xb282bd08(1) > 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if ((r5 == 1.0f) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.o o(int r4, int r5, int r6) {
        /*
            r3 = this;
            float r5 = (float) r5
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r0
            float r4 = (float) r4
            float r5 = r5 / r4
            int r4 = r3.l()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 1068149419(0x3faaaaab, float:1.3333334)
            if (r5 > 0) goto L20
            r2 = 1
            if (r6 == r2) goto L20
            if (r6 != 0) goto L1d
            if (r5 != 0) goto L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L1d
            goto L20
        L1d:
            float r5 = (float) r4
            float r5 = r5 * r0
            goto L22
        L20:
            float r5 = (float) r4
            float r5 = r5 * r1
        L22:
            jz5.o r6 = new jz5.o
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            int r0 = r0.ordinal()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.<init>(r0, r4, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.f0.o(int, int, int):jz5.o");
    }

    public final void p(mv2.g0 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        java.lang.String m76317x2a881cd1 = c19783xd9a946b7 != null ? c19783xd9a946b7.m76317x2a881cd1() : null;
        if (m76317x2a881cd1 == null) {
            m76317x2a881cd1 = "";
        }
        if (m76317x2a881cd1.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LogPost.FinderPostManager", "notifyPrePostEvent postId isEmpty");
        } else {
            pm0.v.X(new mv2.z(m76317x2a881cd1, event));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x051d A[LOOP:3: B:124:0x04e7->B:138:0x051d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0521 A[EDGE_INSN: B:139:0x0521->B:140:0x0521 BREAK  A[LOOP:3: B:124:0x04e7->B:138:0x051d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 r55, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 r56, java.lang.String r57, int r58) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.f0.q(com.tencent.mm.plugin.finder.storage.FinderItem, com.tencent.mm.protocal.protobuf.FinderObject, java.lang.String, int):void");
    }

    public final java.lang.String r(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            java.lang.String query = new java.net.URI(str).getQuery();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(query, "getQuery(...)");
            java.util.List f07 = r26.n0.f0(query, new java.lang.String[]{"&"}, false, 0, 6, null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it = f07.iterator();
            while (it.hasNext()) {
                java.util.List f08 = r26.n0.f0((java.lang.String) it.next(), new java.lang.String[]{"="}, false, 0, 6, null);
                if (f08.size() == 2) {
                    linkedHashMap.put(f08.get(0), f08.get(1));
                }
            }
            return (java.lang.String) linkedHashMap.get("encfilekey");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "parseEncfilekey e:" + th6);
            return null;
        }
    }

    public void s(java.lang.Object feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.PostLog repost ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) feed;
            sb6.append(c14994x9b99c079.m59260x51f8f5b0());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = cu2.u.f303974a.f(c14994x9b99c079.m59260x51f8f5b0());
            if (f17 != null) {
                c14994x9b99c079 = f17;
            }
            ft2.b bVar = ft2.b.f348052a;
            ft2.d dVar = ft2.c.f348053a;
            ft2.b.d(bVar, ft2.c.f348054b, c14994x9b99c079, 0, 0, 12, null);
            c14994x9b99c079.m59409xd2aa5bcb();
            r45.qb4 m59277xa8f45ee4 = c14994x9b99c079.m59277xa8f45ee4();
            m59277xa8f45ee4.set(1, 0);
            m59277xa8f45ee4.set(4, 0);
            if (m59277xa8f45ee4.m75939xb282bd08(2) == 2) {
                m59277xa8f45ee4.set(2, 0);
            }
            java.util.Iterator<T> it = c14994x9b99c079.m59264x7efe73ec().iterator();
            while (it.hasNext()) {
                r45.dd4 dd4Var = (r45.dd4) ((r45.mb4) it.next()).m75936x14adae67(14);
                if (dd4Var != null) {
                    dd4Var.set(7, 0);
                }
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
            if (c19783xd9a946b7 != null) {
                c19783xd9a946b7.m76364xfc30156(c19783xd9a946b7.m76257x6bc66c4a() + 1);
                hc2.p0.b(c19783xd9a946b7, "clickRepost");
            }
            if (c14994x9b99c079.m59317xe8cd5cb1()) {
                java.util.Iterator<T> it6 = c14994x9b99c079.m59214x2de915fd().iterator();
                while (it6.hasNext()) {
                    java.util.Iterator<T> it7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()).m59264x7efe73ec().iterator();
                    while (it7.hasNext()) {
                        r45.dd4 dd4Var2 = (r45.dd4) ((r45.mb4) it7.next()).m75936x14adae67(14);
                        if (dd4Var2 != null) {
                            dd4Var2.set(7, 0);
                        }
                    }
                }
                cu2.u.f303974a.n(c14994x9b99c079);
            } else {
                cu2.u.f303974a.l(c14994x9b99c079);
            }
            c();
            boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.C(1253L, 15L, 1L);
            if (m59314x4d5c4d55) {
                if ((1253 == 1253 ? 1523L : 0L) > 0) {
                    g0Var.C(1253 == 1253 ? 1523L : 0L, 15L, 1L);
                }
            }
            boolean m59314x4d5c4d552 = c14994x9b99c079.m59314x4d5c4d55();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.C(1253L, 42L, 1L);
            if (m59314x4d5c4d552) {
                g0Var2.C(1523L, 42L, 1L);
            }
            if (c14994x9b99c079.m59314x4d5c4d55()) {
                g0Var2.C(1253L, 53L, 1L);
                g0Var2.C(1523L, 53L, 1L);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
            long m59260x51f8f5b0 = c14994x9b99c079.m59260x51f8f5b0();
            am.ga gaVar = c5442xd807898f.f135783g;
            gaVar.f88282a = m59260x51f8f5b0;
            gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
            c5442xd807898f.e();
        }
    }

    public void t(mv2.w0 w0Var) {
        pm0.v.X(new mv2.c0(w0Var));
    }

    public final void u(java.lang.String nickName, java.lang.String eventName, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (nickName.length() > 0) {
            if (eventName.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1253L, 70L, 1L);
                new db2.w2(nickName, eventName, null, null, null, null, 60, null).l().K(new mv2.d0(callback));
                return;
            }
        }
        callback.mo146xb9724478(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "nickName or eventName is Empty");
    }

    public final r45.qb4 v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        r45.qb4 m60705xa8f45ee4 = draftItem.m60705xa8f45ee4();
        m60705xa8f45ee4.set(1, java.lang.Integer.valueOf(m60705xa8f45ee4.m75939xb282bd08(1) + 1));
        draftItem.t0().m59408xa3acbff0(m60705xa8f45ee4);
        cu2.o.f303963a.b(draftItem);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "[updateDraftTryCount] tryCount:" + m60705xa8f45ee4.m75939xb282bd08(1));
        return m60705xa8f45ee4;
    }

    public final r45.qb4 w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObject, "feedObject");
        r45.qb4 m59277xa8f45ee4 = feedObject.m59277xa8f45ee4();
        m59277xa8f45ee4.set(1, java.lang.Integer.valueOf(m59277xa8f45ee4.m75939xb282bd08(1) + 1));
        feedObject.m59408xa3acbff0(m59277xa8f45ee4);
        cu2.u.f303974a.l(feedObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", "[updateTryCount] tryCount:" + m59277xa8f45ee4.m75939xb282bd08(1));
        return m59277xa8f45ee4;
    }

    public void x(java.lang.String path, java.lang.String userName, java.lang.Object callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        f413095b.b(new mv2.n0(path, userName), (fp0.p) callback);
    }
}
