package th5;

/* loaded from: classes12.dex */
public final class p0 extends vf3.i {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f500976g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f500977h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f500978i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f500976g = new java.util.LinkedHashMap();
        this.f500977h = new java.util.LinkedHashMap();
        this.f500978i = new java.util.LinkedHashMap();
    }

    public static final void b7(th5.p0 p0Var, th5.q qVar, java.lang.String str) {
        java.util.Map map = p0Var.f500977h;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b Ai = ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).Ai(str);
            java.lang.String c17 = qVar.e().a(sf3.m.f488937f).c();
            if (c17 == null) {
                c17 = "";
            }
            lf3.k a17 = lf3.l.f399859a.a(c17);
            map.put(p0Var.W6(qVar), new vf3.d(Ai != null ? Ai.f243934t : null, Ai != null ? Ai.f243933s : null, ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).Bi(str), a17 != null ? a17.f399855a : 0, a17 != null ? a17.f399856b : 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizPhotoLiveStateManager", "parserLiveInfo", e17);
            map.put(p0Var.W6(qVar), new vf3.d("", "", true, 0, 0));
        }
    }

    @Override // vf3.a
    public vf3.d K(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        return (vf3.d) ((java.util.LinkedHashMap) this.f500977h).get(W6(mediaInfo));
    }

    @Override // vf3.a
    public vf3.c S3(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        return new vf3.c("");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r3 > 0) goto L16;
     */
    @Override // vf3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vf3.b T4(mf3.k r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "mediaInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            boolean r1 = r0 instanceof th5.q
            r2 = 0
            if (r1 == 0) goto Lf
            th5.q r0 = (th5.q) r0
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 != 0) goto L13
            return r2
        L13:
            r1 = r17
            java.util.Map r2 = r1.f500978i
            java.lang.String r3 = r0.mo2110x5db1b11()
            r4 = r2
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r3 = r4.get(r3)
            if (r3 != 0) goto L65
            java.lang.String r3 = r0.b()
            long r5 = com.p314xaae8f345.mm.vfs.w6.k(r3)
            java.lang.String r3 = r0.f500986k
            long r11 = com.p314xaae8f345.mm.vfs.w6.k(r3)
            java.lang.String r3 = r0.f500985j
            int r3 = r3.length()
            if (r3 <= 0) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L47
            java.lang.String r3 = r0.f500985j
            long r3 = com.p314xaae8f345.mm.vfs.w6.k(r3)
        L45:
            r7 = r3
            goto L50
        L47:
            long r3 = r0.f500876b
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L50
            goto L45
        L50:
            java.lang.String r3 = r0.mo2110x5db1b11()
            vf3.b r15 = new vf3.b
            r13 = 0
            r16 = 0
            r4 = r15
            r9 = r11
            r1 = r15
            r15 = r16
            r4.<init>(r5, r7, r9, r11, r13, r15)
            r2.put(r3, r1)
        L65:
            java.lang.String r0 = r0.mo2110x5db1b11()
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r0 = r2.get(r0)
            vf3.b r0 = (vf3.b) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th5.p0.T4(mf3.k):vf3.b");
    }

    @Override // vf3.i
    public void V6() {
        java.util.Map map = this.f500976g;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) it.next(), null, 1, null);
        }
        ((java.util.LinkedHashMap) map).clear();
    }

    @Override // vf3.a
    public boolean c2(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        vf3.d dVar = (vf3.d) ((java.util.LinkedHashMap) this.f500977h).get(W6(mediaInfo));
        if (dVar != null) {
            return dVar.f517907c;
        }
        return true;
    }

    @Override // vf3.a
    public void p1(mf3.k mediaInfo, java.lang.String path, vf3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
    }

    @Override // vf3.a
    public void v2(mf3.k mediaInfo, vf3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        a7(mediaInfo, listener);
        th5.q qVar = mediaInfo instanceof th5.q ? (th5.q) mediaInfo : null;
        if (qVar == null) {
            return;
        }
        boolean z17 = qVar.f500983h == mf3.w.f407662e;
        java.lang.String k17 = z17 ? qVar.k() : qVar.j();
        java.lang.String str = qVar.f500979d;
        java.lang.String str2 = qVar.f500980e;
        if (!z17 ? !r26.n0.N(str2) : r26.n0.N(str)) {
            str = str2;
        }
        java.lang.String str3 = str;
        java.lang.String str4 = qVar.f500982g;
        boolean z18 = z17 && (r26.n0.N(str4) ^ true);
        java.lang.String i17 = z18 ? qVar.i() : qVar.l();
        if (!z18) {
            str4 = qVar.f500981f;
        }
        java.lang.String str5 = str4;
        java.util.Map map = this.f500976g;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) ((java.util.LinkedHashMap) map).get(qVar.mo2110x5db1b11());
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        map.put(qVar.mo2110x5db1b11(), v65.i.b(this.f517934f, null, new th5.o0(qVar, str5, i17, k17, z18, z17, this, str3, null), 1, null));
    }

    @Override // vf3.a
    public void x6(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        java.util.Map map = this.f500976g;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) ((java.util.LinkedHashMap) map).get(mediaInfo.mo2110x5db1b11());
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        map.remove(mediaInfo.mo2110x5db1b11());
    }
}
