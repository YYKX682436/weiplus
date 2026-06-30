package th5;

/* loaded from: classes12.dex */
public final class q extends th5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f500979d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500980e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f500981f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f500982g;

    /* renamed from: h, reason: collision with root package name */
    public mf3.w f500983h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f500984i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f500985j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f500986k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f500987l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i17, java.lang.String originUrl, java.lang.String thumbUrl, java.lang.String liveVideoUrl, long j17, java.lang.String originLiveVideoUrl, com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d bizData) {
        super(i17, j17, bizData);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originUrl, "originUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveVideoUrl, "liveVideoUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originLiveVideoUrl, "originLiveVideoUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizData, "bizData");
        this.f500979d = originUrl;
        this.f500980e = thumbUrl;
        this.f500981f = liveVideoUrl;
        this.f500982g = originLiveVideoUrl;
        this.f500983h = mf3.w.f407661d;
        this.f500984i = "";
        this.f500985j = "";
        this.f500986k = "";
        this.f500987l = "";
        java.lang.String j18 = j();
        if ((this.f500984i.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(j18)) {
            this.f500984i = j18;
        }
        java.lang.String k17 = k();
        if ((this.f500985j.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(k17)) {
            this.f500985j = k17;
        }
        java.lang.String l17 = l();
        if ((this.f500986k.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(l17)) {
            this.f500986k = l17;
        }
        java.lang.String i18 = i();
        if ((this.f500987l.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(i18)) {
            this.f500987l = i18;
        }
        if (h()) {
            boolean z17 = (this.f500985j.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500985j);
            boolean z18 = (this.f500987l.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500987l);
            if (z17 && z18) {
                this.f500983h = mf3.w.f407662e;
                return;
            }
            return;
        }
        if ((r26.n0.N(originUrl) ^ true) && (r26.n0.N(thumbUrl) ^ true) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(originUrl, thumbUrl)) {
            if ((this.f500985j.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500985j)) {
                this.f500983h = mf3.w.f407662e;
            }
        }
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String str;
        java.lang.String c17 = e().a(sf3.m.f488937f).c();
        if (this.f500983h == mf3.w.f407662e) {
            if (this.f500987l.length() > 0) {
                str = this.f500987l;
                return new gg3.c(mo2110x5db1b11(), c17, str, null, 0L, false, 40, null);
            }
        }
        str = this.f500986k;
        return new gg3.c(mo2110x5db1b11(), c17, str, null, 0L, false, 40, null);
    }

    public final java.lang.String b() {
        if (this.f500983h == mf3.w.f407662e) {
            if ((this.f500985j.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500985j)) {
                return this.f500985j;
            }
        }
        if ((this.f500984i.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500984i)) {
            return this.f500984i;
        }
        if ((this.f500985j.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500985j)) {
            return this.f500985j;
        }
        java.lang.String str = this.f500984i;
        return str.length() == 0 ? this.f500985j : str;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    public final java.lang.String d() {
        th5.a1 a1Var = th5.a1.f500873a;
        java.lang.String a17 = a1Var.a(this.f500979d);
        java.lang.String a18 = a1Var.a(this.f500980e);
        java.lang.String a19 = a1Var.a(this.f500981f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f500875a);
        sb6.append('_');
        sb6.append(a17.hashCode());
        sb6.append('_');
        sb6.append(a18.hashCode());
        sb6.append('_');
        sb6.append(a19.hashCode());
        return r26.i0.u(sb6.toString(), '-', '_', false, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(r14.f500985j) != false) goto L16;
     */
    @Override // mf3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sf3.g e() {
        /*
            r14 = this;
            java.lang.String r0 = r14.f500984i
            int r1 = r0.length()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            if (r1 == 0) goto L13
            java.lang.String r0 = r14.j()
        L13:
            java.lang.String r1 = r14.f500985j
            int r4 = r1.length()
            if (r4 != 0) goto L1d
            r4 = r3
            goto L1e
        L1d:
            r4 = r2
        L1e:
            if (r4 == 0) goto L24
            java.lang.String r1 = r14.k()
        L24:
            java.lang.String r6 = r14.mo2110x5db1b11()
            java.lang.String r4 = "mediaId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r4)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            sf3.m r4 = sf3.m.f488939h
            java.lang.String r7 = "path"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r7)
            r5.put(r4, r0)
            sf3.m r13 = sf3.m.f488937f
            r5.put(r13, r0)
            sf3.m r0 = sf3.m.f488936e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r7)
            r5.put(r0, r1)
            sf3.g r1 = new sf3.g
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 60
            r12 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            mf3.w r4 = r14.f500983h
            int[] r5 = th5.p.f500975a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            if (r4 != r3) goto L65
        L63:
            r13 = r0
            goto L79
        L65:
            java.lang.String r4 = r14.f500985j
            int r4 = r4.length()
            if (r4 <= 0) goto L6e
            r2 = r3
        L6e:
            if (r2 == 0) goto L79
            java.lang.String r2 = r14.f500985j
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.j(r2)
            if (r2 == 0) goto L79
            goto L63
        L79:
            sf3.g r0 = r1.a(r13)
            th5.x r1 = new th5.x
            r1.<init>()
            r0.f488925f = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th5.q.e():sf3.g");
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        this.f500983h = level;
    }

    @Override // mf3.k
    public java.lang.String g() {
        if (this.f500983h == mf3.w.f407662e) {
            if ((this.f500987l.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500987l)) {
                return this.f500987l;
            }
        }
        return ((this.f500986k.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(this.f500986k)) ? this.f500986k : b();
    }

    @Override // mf3.k
    /* renamed from: getId */
    public java.lang.String mo2110x5db1b11() {
        long hashCode = ((d().hashCode() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) | ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & this.f500875a) << 32)) & com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        if (hashCode == 0) {
            hashCode = 1;
        }
        return java.lang.String.valueOf(hashCode);
    }

    @Override // mf3.k
    /* renamed from: getLevel */
    public mf3.w mo147256x74bf41ce() {
        return this.f500983h;
    }

    @Override // mf3.k
    /* renamed from: getType */
    public mf3.u mo2109xfb85f7b0() {
        return mf3.u.f407658g;
    }

    public final boolean h() {
        boolean z17;
        boolean z18 = !r26.n0.N(this.f500982g);
        java.lang.String str = this.f500979d;
        if (!r26.n0.N(str)) {
            java.lang.String str2 = this.f500980e;
            if ((!r26.n0.N(str2)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                z17 = true;
                return !z17 && z18;
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final java.lang.String i() {
        th5.m mVar = th5.m.f500940a;
        return ((java.lang.String) ((jz5.n) th5.m.f500941b).mo141623x754a37bb()) + d() + "_live_hd.mp4";
    }

    public final java.lang.String j() {
        return th5.m.f500940a.b(d().concat("_mid"));
    }

    public final java.lang.String k() {
        return th5.m.f500940a.a(d().concat("_raw"));
    }

    public final java.lang.String l() {
        th5.m mVar = th5.m.f500940a;
        return ((java.lang.String) ((jz5.n) th5.m.f500941b).mo141623x754a37bb()) + d() + "_live.mp4";
    }
}
