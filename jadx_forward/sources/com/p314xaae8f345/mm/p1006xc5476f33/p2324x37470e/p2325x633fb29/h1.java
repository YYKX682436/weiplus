package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class h1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final rm5.v f257128a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f257129b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f257130c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f257131d;

    /* renamed from: e, reason: collision with root package name */
    public long f257132e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f257133f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f257134g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f257135h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f257136i;

    /* renamed from: j, reason: collision with root package name */
    public int f257137j;

    /* renamed from: k, reason: collision with root package name */
    public final int f257138k;

    /* renamed from: l, reason: collision with root package name */
    public int f257139l;

    /* renamed from: m, reason: collision with root package name */
    public int f257140m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f257141n;

    public h1(java.util.List trackList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        rm5.v vVar = new rm5.v();
        this.f257128a = vVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f257130c = arrayList;
        this.f257131d = new android.graphics.Rect();
        this.f257133f = true;
        this.f257135h = "";
        this.f257137j = 30;
        this.f257138k = -1;
        this.f257139l = 44100;
        this.f257140m = 1;
        arrayList.clear();
        arrayList.addAll(trackList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l);
        }
        java.util.ArrayList arrayList3 = vVar.f479117l;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multivideo_edit_preview_high_fps_enable, 1) == 1) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = this.f257130c.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if ((((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next).f257150b == 2 ? 1 : 0) != 0) {
                    arrayList4.add(next);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                qc0.d1 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.c(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it7.next()).f257149a, true);
                arrayList5.add(java.lang.Integer.valueOf(c17 != null ? (int) c17.f442898c : 0));
            }
            java.lang.Integer num = (java.lang.Integer) kz5.n0.m0(arrayList5);
            int intValue = num != null ? num.intValue() : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogComposition", "selectMaxFpsFromTrackList maxFps:" + intValue);
            this.f257138k = intValue;
        }
        this.f257128a.e(this.f257133f);
    }

    public final void a(java.lang.String musicPath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPath, "musicPath");
        this.f257134g = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(musicPath);
        this.f257135h = musicPath;
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(musicPath, false);
        if (i17 == null) {
            i17 = "";
        }
        qc0.d1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p2015x36f002.C17096x4dad80a5.f237984a.a(i17);
        long j17 = a17 != null ? a17.f442899d : 0L;
        rm5.v vVar = this.f257128a;
        if (!z17 || j17 == 0) {
            rm5.j jVar = new rm5.j(i17, 3);
            jVar.c(j());
            jVar.b(vVar.j() - 0);
            jVar.e(0L);
            jVar.d(jVar.f479036e);
            vVar.f479117l.add(jVar);
        } else {
            long j18 = j();
            while (j18 <= h()) {
                rm5.j jVar2 = new rm5.j(i17, 3);
                jVar2.c(j18);
                jVar2.b(jVar2.f479041j + j18);
                vVar.getClass();
                vVar.f479117l.add(jVar2);
                j18 += jVar2.f479041j;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogComposition", "addCompositionMusic musicPath:" + musicPath + ", fillUp:" + z17);
    }

    public final void b(int i17, int i18, java.lang.Integer num) {
        ((ag0.o) ((bg0.w) i95.n0.c(bg0.w.class))).wi(this.f257128a, i17, i18, num);
    }

    public final void c(rm5.q config, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        ag0.o oVar = (ag0.o) ((bg0.w) i95.n0.c(bg0.w.class));
        oVar.getClass();
        int i17 = config.f479083o;
        int i18 = config.f479084p;
        rm5.v vVar = this.f257128a;
        oVar.wi(vVar, i17, i18, num);
        if (!fp.h.c(24) || vVar.f479119n == null) {
            return;
        }
        config.f479083o = 1;
        config.f479084p = 3;
    }

    public void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogComposition", "enableVideoSound:" + z17);
        this.f257133f = z17;
        this.f257128a.e(z17);
    }

    public final rm5.v e() {
        int i17;
        int i18;
        java.util.Iterator it = this.f257130c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
            rm5.j jVar = i1Var.f257160l;
            i1Var.f257153e.d(jVar.f479049r, jVar.f479050s);
        }
        rm5.v vVar = this.f257128a;
        long i19 = vVar.i();
        if (this.f257132e > 0) {
            long g17 = vVar.g() - i19;
            long j17 = this.f257132e;
            if (g17 > j17) {
                vVar.n(i19, j17 + i19);
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multivideo_edit_preview_high_fps_enable, 1) == 1 && (i17 = this.f257137j) > 0 && (i18 = this.f257138k) > 0) {
            float min = java.lang.Math.min(i17, i18);
            if (min > 0.0f) {
                vVar.f479111f = min;
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_use_audio_resampler, 1) == 1) {
            vVar.f479116k = new sm5.b(new l55.b(this.f257139l, this.f257140m));
        }
        vVar.f479123r = new com.p314xaae8f345.tav.p2946x5a71016.C25649x2dc0947(null, new ko4.e(false, false, 3, null));
        return vVar;
    }

    public final jz5.l f() {
        rm5.v vVar = this.f257128a;
        return new jz5.l(java.lang.Long.valueOf(vVar.f479106a), java.lang.Long.valueOf(vVar.f479107b));
    }

    public long g() {
        rm5.v vVar = this.f257128a;
        return vVar.g() - vVar.i();
    }

    public final long h() {
        return this.f257128a.g();
    }

    public final com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 i() {
        return this.f257128a.h();
    }

    public final long j() {
        return this.f257128a.i();
    }

    public final long k() {
        return this.f257128a.j() - 0;
    }

    public final void l(int i17, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        rm5.v vVar = this.f257128a;
        vVar.getClass();
        rm5.h b17 = rm5.h.f479022h.b(vVar);
        int height = !vVar.f479112g.isEmpty() ? (int) (((r2.height() * 1.0f) / r2.width()) * i17) : (int) (((vVar.f479110e * 1.0f) / vVar.f479109d) * i17);
        b17.mo122876x76500f83(i17, height);
        xm5.b.c("VideoComposition", "getThumbBitmap request width:" + i17 + ", height:" + height, new java.lang.Object[0]);
        b17.a(kz5.b0.c(java.lang.Long.valueOf(vVar.i())), new rm5.s(callback));
    }

    public final java.util.List m() {
        java.util.ArrayList arrayList = this.f257130c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj).f257150b;
            boolean z17 = true;
            if (i17 != 1 && i17 != 2) {
                z17 = false;
            }
            if (z17) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final java.lang.String n() {
        int i17;
        java.util.ArrayList arrayList = this.f257130c;
        if (arrayList.isEmpty()) {
            return "";
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Float.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l.f479039h));
        }
        if (arrayList2.isEmpty()) {
            i17 = 0;
        } else {
            java.util.Iterator it6 = arrayList2.iterator();
            i17 = 0;
            while (it6.hasNext()) {
                if ((!(((java.lang.Number) it6.next()).floatValue() == 1.0f)) && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        java.lang.String gVar = new cl0.g(kz5.c1.k(new jz5.l("usePlayRateTrackCount", java.lang.Integer.valueOf(i17)), new jz5.l("playRateStatus", kz5.n0.g0(arrayList2, "|", null, null, 0, null, null, 62, null)))).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return r26.i0.t(gVar, ",", ";", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if ((((java.lang.CharSequence) kz5.n0.W(r0)).length() > 0) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String o() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.f257130c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r0 = ""
            return r0
        Lb:
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.util.List r0 = kz5.n0.L0(r0, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = kz5.d0.q(r0, r1)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.vlog.model.i1 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) r1
            rm5.j r1 = r1.f257160l
            rm5.n r1 = r1.f479048q
            java.lang.String r1 = r1.f479062a
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.b(r1)
            r3.add(r1)
            goto L24
        L3e:
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L47
            r4 = r1
            goto L6d
        L47:
            java.util.Iterator r0 = r3.iterator()
            r4 = r1
        L4c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L60
            r5 = r2
            goto L61
        L60:
            r5 = r1
        L61:
            if (r5 == 0) goto L4c
            int r4 = r4 + 1
            if (r4 < 0) goto L68
            goto L4c
        L68:
            kz5.c0.o()
            r0 = 0
            throw r0
        L6d:
            java.util.Set r0 = kz5.n0.X0(r3)
            int r5 = r0.size()
            if (r5 != r2) goto L89
            java.lang.Object r0 = kz5.n0.W(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L85
            r0 = r2
            goto L86
        L85:
            r0 = r1
        L86:
            if (r0 == 0) goto L89
            goto L8a
        L89:
            r2 = r1
        L8a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            jz5.l r12 = new jz5.l
            java.lang.String r4 = "transCount"
            r12.<init>(r4, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            jz5.l r2 = new jz5.l
            java.lang.String r4 = "isApplyToAll"
            r2.<init>(r4, r0)
            java.lang.String r4 = "|"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            r11 = 0
            java.lang.String r0 = kz5.n0.g0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jz5.l r3 = new jz5.l
            java.lang.String r4 = "transStatus"
            r3.<init>(r4, r0)
            jz5.l[] r0 = new jz5.l[]{r12, r2, r3}
            java.util.Map r0 = kz5.c1.k(r0)
            cl0.g r2 = new cl0.g
            r2.<init>(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r0 = r26.i0.t(r0, r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1.o():java.lang.String");
    }

    public final void p(yz5.l blendBitmapProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blendBitmapProvider, "blendBitmapProvider");
        this.f257128a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.e(blendBitmapProvider, this.f257129b));
    }

    public final void q(com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc) {
        this.f257129b = c22979xbb268bc;
        this.f257128a.f479113h = c22979xbb268bc;
    }

    public final void r(long j17) {
        this.f257132e = j17;
        rm5.v vVar = this.f257128a;
        long i17 = vVar.i();
        if (this.f257132e > 0) {
            long g17 = vVar.g() - i17;
            long j18 = this.f257132e;
            if (g17 > j18) {
                vVar.n(i17, j18 + i17);
            }
        }
    }

    public void s(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogComposition", "setPlayRange:[" + j17 + ", " + j18 + ']');
        this.f257128a.n(j17, j18);
    }

    public void t(android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        android.graphics.Rect rect2 = this.f257131d;
        rect2.set(rect);
        this.f257128a.m(rect2);
    }

    public void u(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogComposition", "setRenderSize: " + i17 + ", " + i18);
        this.f257128a.l(i17, i18);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 origin) {
        this(origin.f257130c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        rm5.v e17 = origin.e();
        e17.getClass();
        android.util.Size size = new android.util.Size(e17.f479109d, e17.f479110e);
        u(size.getWidth(), size.getHeight());
        s(origin.j(), origin.h());
        this.f257131d.set(origin.f257131d);
        this.f257136i = origin.f257136i;
        android.graphics.Bitmap bitmap = origin.f257141n;
        this.f257141n = bitmap;
        this.f257128a.f479119n = bitmap;
    }
}
