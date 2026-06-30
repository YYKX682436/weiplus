package cz2;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final cz2.j f306541a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f306542b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f306543c;

    /* renamed from: d, reason: collision with root package name */
    public final fp.j f306544d;

    /* renamed from: e, reason: collision with root package name */
    public long f306545e;

    /* renamed from: f, reason: collision with root package name */
    public long f306546f;

    /* renamed from: g, reason: collision with root package name */
    public final int f306547g;

    /* renamed from: h, reason: collision with root package name */
    public long f306548h;

    /* renamed from: i, reason: collision with root package name */
    public int f306549i;

    public i(cz2.j cigTrack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cigTrack, "cigTrack");
        this.f306541a = cigTrack;
        this.f306542b = "Finder.FinderCgiReport";
        this.f306543c = "Finder.FinderCgiDetail" + hashCode();
        this.f306544d = new fp.j();
        this.f306547g = ((java.lang.Number) kb2.d.f387763a.r()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r27, int r28, java.lang.String r29, com.p314xaae8f345.mm.p944x882e457a.o r30) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cz2.i.a(int, int, java.lang.String, com.tencent.mm.modelbase.o):void");
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        java.lang.String substring;
        if (str2.length() < 4000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
            return;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < str2.length()) {
            int i19 = i17 + 4000;
            if (str2.length() <= i19) {
                substring = str2.substring(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            } else {
                substring = str2.substring(i17, i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "=>id:" + i18 + ' ' + substring);
            i18++;
            i17 = i19;
        }
    }

    public final void c(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        this.f306544d.b();
        this.f306548h = c01.id.c();
        boolean z17 = true;
        if (this.f306547g == 1) {
            cz2.e eVar = cz2.e.f306524a;
            java.lang.String str = oVar != null ? oVar.f152245c : null;
            if (str != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (!cz2.e.f306525b.contains(r26.n0.p0(str, "/", str))) {
                    z17 = false;
                }
            }
            if (z17 || oVar == null || (fVar = oVar.f152243a.f152217a) == null) {
                return;
            }
            java.lang.String str2 = "##########request uri: ===> " + oVar.f152245c;
            java.lang.String str3 = this.f306543c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            b(str3, "uri:" + oVar.f152245c + " request buf: " + pm0.b0.g(fVar));
        }
    }
}
