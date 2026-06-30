package rm5;

/* loaded from: classes10.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public long f479106a;

    /* renamed from: b, reason: collision with root package name */
    public long f479107b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f479108c;

    /* renamed from: d, reason: collision with root package name */
    public int f479109d;

    /* renamed from: e, reason: collision with root package name */
    public int f479110e;

    /* renamed from: f, reason: collision with root package name */
    public float f479111f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f479112g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc f479113h;

    /* renamed from: i, reason: collision with root package name */
    public final wm5.g f479114i;

    /* renamed from: j, reason: collision with root package name */
    public wm5.h f479115j;

    /* renamed from: k, reason: collision with root package name */
    public sm5.c f479116k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f479117l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f479118m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f479119n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f479120o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f479121p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f479122q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2946x5a71016.InterfaceC25652xcd3d9f6f f479123r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode f479124s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 f479125t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.a f479126u;

    public v() {
        this.f479106a = -1L;
        this.f479107b = -1L;
        this.f479108c = new android.graphics.Rect();
        this.f479111f = 30.0f;
        this.f479112g = new android.graphics.Rect();
        this.f479114i = new wm5.g();
        this.f479117l = new java.util.ArrayList();
        this.f479121p = true;
        this.f479124s = com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode.aspectFill;
        xm5.b.c("VideoComposition", "create VLogComposition", new java.lang.Object[0]);
    }

    public static /* synthetic */ com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 c(rm5.v vVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildSource");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return vVar.b(z17);
    }

    public final void a(wm5.f fVar) {
        if (fVar != null) {
            wm5.g gVar = this.f479114i;
            gVar.getClass();
            synchronized (gVar.f528886a) {
                if (!gVar.f528886a.contains(fVar)) {
                    gVar.f528886a.add(fVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [uq5.y] */
    /* JADX WARN: Type inference failed for: r9v15 */
    public final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 b(boolean z17) {
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955 c25703x3f371955;
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e61;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e79;
        java.lang.String str2;
        java.util.List c17;
        boolean z18;
        java.util.ArrayList arrayList2 = this.f479117l;
        int i17 = 0;
        java.lang.String str3 = "VideoComposition";
        xm5.b.c("VideoComposition", "createComposition: track size " + arrayList2.size(), new java.lang.Object[0]);
        if (arrayList2.isEmpty()) {
            c25875x73210e61 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61();
            c25703x3f371955 = null;
        } else {
            com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61 c25875x73210e612 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25875x73210e61();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                rm5.j jVar = (rm5.j) it6.next();
                xm5.b.c(str3, "add track type:" + jVar.f479033b + " startTime:" + jVar.f479035d + ", endTime:" + jVar.f479036e + ", trackStartTime:" + jVar.f479037f + ", trackEndTime:" + jVar.f479038g, new java.lang.Object[i17]);
                boolean z19 = this.f479118m;
                int i18 = jVar.f479033b;
                if (i18 != 0) {
                    c25874xcf526e79 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79(rm5.l.f479053a.c(jVar));
                    arrayList = arrayList3;
                    c25874xcf526e79.mo98560xdcd6bc0d(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(jVar.f479035d, 1000));
                    str = str3;
                    it = it6;
                    c25874xcf526e79.mo98558xffd6ec16(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(jVar.f479036e - jVar.f479035d, 1000));
                    c25874xcf526e79.m98547x67860184().m98729x453dbfd3(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(jVar.f479037f, 1000), new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(jVar.f479038g - jVar.f479037f, 1000)));
                    if (i18 != 2 || z19) {
                        c25874xcf526e79.mo98543xf63bd6b6().m98675x27f73e1c(jVar.f479040i);
                    } else {
                        c25874xcf526e79.mo98543xf63bd6b6().m98675x27f73e1c(0.0f);
                    }
                    jVar.f479052u = c25874xcf526e79;
                    xm5.b.c("CompositionTrack", jVar.f479034c + " buildClip buildVideoClip, path:" + jVar.f479032a + ", video startEnd:[" + jVar.f479037f + ", " + jVar.f479038g + "], material startEnd:[" + jVar.f479035d + ", " + jVar.f479036e + "], volume: " + jVar.f479040i, new java.lang.Object[0]);
                } else {
                    str = str3;
                    arrayList = arrayList3;
                    it = it6;
                    c25874xcf526e79 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f));
                }
                sm5.c cVar = this.f479116k;
                if (cVar != null) {
                    c25874xcf526e79.mo98543xf63bd6b6().m98663xf39283ff(new sm5.a(jVar, (sm5.b) cVar));
                }
                c25874xcf526e79.mo98556xc4b1c358("key_extra_track", jVar);
                if (jVar.f479035d > 0) {
                    com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79 c25874xcf526e792 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25874xcf526e79(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2977xebabc40e.C25904x1e3cc372(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(jVar.f479035d, 1000)));
                    c25874xcf526e792.mo98560xdcd6bc0d(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57.f47863xfd8f99f);
                    c25874xcf526e792.mo98558xffd6ec16(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(jVar.f479035d, 1000));
                    str2 = str;
                    xm5.b.c(str2, "add front empty clip duration:" + jVar.f479035d, new java.lang.Object[0]);
                    c17 = kz5.c0.i(c25874xcf526e792, c25874xcf526e79);
                } else {
                    str2 = str;
                    c17 = kz5.b0.c(c25874xcf526e79);
                }
                java.util.ArrayList arrayList4 = arrayList;
                arrayList4.add(c17);
                str3 = str2;
                it6 = it;
                i17 = 0;
                arrayList3 = arrayList4;
            }
            java.util.ArrayList arrayList5 = arrayList3;
            java.lang.String str4 = str3;
            java.util.Iterator it7 = arrayList5.iterator();
            int i19 = 0;
            while (it7.hasNext()) {
                java.lang.Object next = it7.next();
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.util.List<? extends com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.InterfaceC25898x5fe17e9e> list = (java.util.List) next;
                int i28 = ((rm5.j) arrayList2.get(i19)).f479033b;
                if (i28 == 1 || i28 == 2) {
                    c25875x73210e612.m98567x9f05f349(list);
                }
                if (((rm5.j) arrayList2.get(i19)).f479033b == 2 || ((rm5.j) arrayList2.get(i19)).f479033b == 3 || ((rm5.j) arrayList2.get(i19)).f479033b == 1) {
                    c25875x73210e612.m98566x493d7f8e(list);
                }
                i19 = i27;
            }
            c25703x3f371955 = null;
            xm5.b.c(str4, "finish build composition, duration:" + (c25875x73210e612.m98572x51e8b0a().m97232x31040141() / 1000), new java.lang.Object[0]);
            c25875x73210e61 = c25875x73210e612;
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc = this.f479113h;
        uq5.k kVar = uq5.k.PAGTransitionEffect;
        if (c22979xbb268bc != null) {
            c22979xbb268bc.p(kVar);
        }
        int size = this.f479117l.size();
        for (int i29 = 1; i29 < size; i29++) {
            java.lang.Object obj = this.f479117l.get(i29 - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            rm5.j jVar2 = (rm5.j) obj;
            java.lang.Object obj2 = this.f479117l.get(i29);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            rm5.j jVar3 = (rm5.j) obj2;
            rm5.n nVar = jVar3.f479048q;
            if (nVar.a()) {
                if (nVar.f479063b == null) {
                    com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc2 = this.f479113h;
                    nVar.f479063b = c22979xbb268bc2 != null ? c22979xbb268bc2.i(kVar, nVar.f479062a) : c25703x3f371955;
                }
                uq5.y yVar = nVar.f479063b;
                if (yVar != null) {
                    yVar.b(jVar3.f479035d, jVar2.f479036e);
                }
                com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc3 = this.f479113h;
                if (c22979xbb268bc3 != null) {
                    c22979xbb268bc3.c(nVar.f479063b);
                }
            }
        }
        java.lang.System.currentTimeMillis();
        if (z17) {
            wm5.h hVar = new wm5.h();
            this.f479115j = hVar;
            hVar.b(this.f479109d, this.f479110e);
            com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc4 = this.f479113h;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c22979xbb268bc4, hVar.f528889f)) {
                hVar.f528889f = c22979xbb268bc4;
                hVar.f528891h = true;
            }
            android.graphics.Rect rect = this.f479112g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
            android.graphics.Rect rect2 = hVar.f528893j;
            rect2.set(rect);
            if (!rect2.isEmpty()) {
                hVar.f528894k = rect2.width();
                hVar.f528895l = rect2.height();
            }
            hVar.a(this.f479124s);
            z18 = false;
            hVar.f528898o = false;
            hVar.f528890g = this.f479114i;
            c25875x73210e61.m98591xcd6631d4(new wm5.b(hVar));
        } else {
            z18 = false;
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25889x1381b9fa c25889x1381b9fa = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25889x1381b9fa(c25875x73210e61);
        c25889x1381b9fa.m98647x6ec958b(z18);
        c25889x1381b9fa.m98648xad111597(this.f479121p);
        c25889x1381b9fa.m98646x1c6ef75c(z18);
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 m98645x86121029 = c25889x1381b9fa.m98645x86121029();
        if (!z17) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m98595x57d6f9a5 = m98645x86121029.m98595x57d6f9a5();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m98595x57d6f9a5, "null cannot be cast to non-null type com.tencent.tav.core.composition.MutableVideoComposition");
            ((com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955) m98595x57d6f9a5).m96932xcd6dcf0f(tm5.a.class);
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m98595x57d6f9a52 = m98645x86121029.m98595x57d6f9a5();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m98595x57d6f9a52, "null cannot be cast to non-null type com.tencent.tav.core.composition.MutableVideoComposition");
        ((com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955) m98595x57d6f9a52).m96933x3f91c0df(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1000L, (int) (this.f479111f * 1000)));
        if (this.f479119n != null) {
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f m98595x57d6f9a53 = m98645x86121029.m98595x57d6f9a5();
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955 c25703x3f3719552 = m98595x57d6f9a53 instanceof com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955 ? (com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25703x3f371955) m98595x57d6f9a53 : c25703x3f371955;
            if (c25703x3f3719552 != null) {
                c25703x3f3719552.m96959xda597388(this.f479119n);
            }
        }
        return m98645x86121029;
    }

    public final boolean d() {
        this.f479122q = true;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = this.f479125t;
        if (c25655x2c777b52 != null) {
            c25655x2c777b52.m96313x7be5eace();
        }
        return true;
    }

    public final void e(boolean z17) {
        xm5.b.c("VideoComposition", "enableVideoSound:" + z17, new java.lang.Object[0]);
        this.f479118m = z17;
    }

    public final com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 f(java.lang.String str, rm5.q qVar, boolean z17, yz5.p pVar, yz5.l lVar) {
        boolean z18;
        xm5.b.c("VideoComposition", "[VCTrace] exportImpl config print: ".concat(xm5.f.f536933a.a(qVar)), new java.lang.Object[0]);
        android.util.Size size = qVar.f479069a;
        android.util.Size size2 = qVar.f479081m;
        if (size2 == null) {
            size2 = size;
        }
        boolean z19 = (size2.getWidth() == size.getWidth() && size2.getHeight() == size.getHeight()) ? false : true;
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 b17 = b(z17);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036(size.getWidth(), size.getHeight(), size2.getWidth(), size2.getHeight());
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25800x8b670e73 m97833xaf65a0fc = com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25801x67b50bf9.f48380x4fbc8495.m97833xaf65a0fc(qVar.f479093y, qVar.f479094z);
        c25679xbb204036.m96761xf4bbd0e4(str);
        c25679xbb204036.m96760xf7b6b002(qVar.f479085q);
        c25679xbb204036.m96764x884f1014(qVar.f479070b);
        c25679xbb204036.m96765xe9ed06b4(qVar.f479071c);
        int i17 = qVar.f479072d;
        c25679xbb204036.m96766xa9d2a102(i17);
        c25679xbb204036.m96757x6b73674(qVar.f479077i);
        boolean z27 = qVar.f479076h;
        c25679xbb204036.m96756x4b0dc3e5(z27);
        int i18 = qVar.f479073e;
        c25679xbb204036.m96749x32869c59(i18);
        int i19 = qVar.f479074f;
        c25679xbb204036.m96752xd140b10(i19);
        int i27 = qVar.f479075g;
        c25679xbb204036.m96750x2b80080(i27);
        boolean z28 = qVar.f479078j;
        c25679xbb204036.m96751xf0bb792(z28);
        c25679xbb204036.m96754xff048da2(qVar.f479079k);
        c25679xbb204036.m96758x7f9cf8d4(qVar.f479091w);
        c25679xbb204036.m96759xb12e6ee2(qVar.f479092x);
        c25679xbb204036.f47466xc231f8f2 = m97833xaf65a0fc;
        c25679xbb204036.m96753x6898fd65(qVar.f479082n, qVar.f479083o, qVar.f479084p);
        xm5.b.c("VideoComposition", "export: config: " + c25679xbb204036.m96741xa83ce40f() + ", " + c25679xbb204036.m96739x4590a3fe() + "; video: " + c25679xbb204036.m96745x52061508() + ", " + c25679xbb204036.m96747x21f69ea8() + ", " + i17 + ", " + z27 + "; audio: " + i18 + ", " + i19 + ", " + i27 + ", aacEncodeNeedCodecSpecificData:" + z28 + ", outputHevc:" + qVar.f479079k + ", correctSizeByCodecCapabilities:" + qVar.f479085q, new java.lang.Object[0]);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52 c25655x2c777b52 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25655x2c777b52(b17.m98593x742a913a(), c25679xbb204036);
        if (z17) {
            z18 = true;
        } else {
            z18 = true;
            c25655x2c777b52.m96336x507dfc18(true);
        }
        if (z19) {
            c25655x2c777b52.m96338x8f1dd6c1(z18);
        }
        c25655x2c777b52.m96345xf4bbd0e4(str);
        c25655x2c777b52.m96346xf4bdfbf9("mp4");
        c25655x2c777b52.m96351xfbd38eb1(b17.m98595x57d6f9a5());
        c25655x2c777b52.m96337xb0bd9928(b17.m98594xb605381c());
        c25655x2c777b52.m96349x5d30e02e(h());
        c25655x2c777b52.m96348xedc90ba9(false);
        c25655x2c777b52.m96343x5750fe08(this.f479123r);
        c25655x2c777b52.m96350xa1d0ffca(qVar.f479086r, qVar.f479087s, qVar.f479088t);
        c25655x2c777b52.m96340x7668c57b(qVar.f479089u);
        c25655x2c777b52.m96339x715c8943(qVar.f479090v);
        c25655x2c777b52.m96342x596d8674(m97833xaf65a0fc);
        if (c25655x2c777b52.m96331x57d6f9a5() != null) {
            c25655x2c777b52.m96331x57d6f9a5().m96959xda597388(this.f479119n);
            c25655x2c777b52.m96331x57d6f9a5().m96962x3395d8b3(this.f479120o);
        }
        xm5.b.c("VideoComposition", "export duration:" + (j() - 0) + " playRange:" + h(), new java.lang.Object[0]);
        c25655x2c777b52.m96314xae405e7f(new rm5.r(lVar, new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), android.os.SystemClock.elapsedRealtime(), this, pVar));
        this.f479125t = c25655x2c777b52;
        return c25655x2c777b52;
    }

    public final long g() {
        long j17 = this.f479107b;
        return j17 >= 0 ? j17 : j();
    }

    public final com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 h() {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(i(), 1000), new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(g() - i(), 1000));
    }

    public final long i() {
        long j17 = this.f479106a;
        if (j17 >= 0) {
            return j17;
        }
        return 0L;
    }

    public final long j() {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f479117l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i17 = ((rm5.j) next).f479033b;
            boolean z17 = true;
            if (i17 != 1 && i17 != 2) {
                z17 = false;
            }
            if (z17) {
                arrayList2.add(next);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        if (it6.hasNext()) {
            java.lang.Object next2 = it6.next();
            if (it6.hasNext()) {
                long j17 = ((rm5.j) next2).f479036e;
                do {
                    java.lang.Object next3 = it6.next();
                    long j18 = ((rm5.j) next3).f479036e;
                    if (j17 < j18) {
                        next2 = next3;
                        j17 = j18;
                    }
                } while (it6.hasNext());
            }
            obj = next2;
        } else {
            obj = null;
        }
        rm5.j jVar = (rm5.j) obj;
        if (jVar != null) {
            return jVar.f479036e;
        }
        return 0L;
    }

    public final com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b k(java.lang.String path, rm5.q config, yz5.q qVar, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.C25876x5fee0d04 b17 = b(false);
        xm5.b.c("VideoComposition", "[VCTrace] parallelExport config print: ".concat(xm5.f.f536933a.a(config)), new java.lang.Object[0]);
        android.util.Size size = config.f479069a;
        com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036 c25679xbb204036 = new com.p314xaae8f345.tav.p2947x2eaf9f.C25679xbb204036(size.getWidth(), size.getHeight());
        c25679xbb204036.m96761xf4bbd0e4(path);
        c25679xbb204036.m96764x884f1014(config.f479070b);
        c25679xbb204036.m96765xe9ed06b4(config.f479071c);
        int i17 = config.f479072d;
        c25679xbb204036.m96766xa9d2a102(i17);
        c25679xbb204036.m96757x6b73674(config.f479077i);
        boolean z17 = config.f479076h;
        c25679xbb204036.m96756x4b0dc3e5(z17);
        int i18 = config.f479073e;
        c25679xbb204036.m96749x32869c59(i18);
        int i19 = config.f479074f;
        c25679xbb204036.m96752xd140b10(i19);
        int i27 = config.f479075g;
        c25679xbb204036.m96750x2b80080(i27);
        boolean z18 = config.f479078j;
        c25679xbb204036.m96751xf0bb792(z18);
        c25679xbb204036.m96754xff048da2(config.f479079k);
        c25679xbb204036.m96763xc027e1a6(config.f479080l);
        c25679xbb204036.m96758x7f9cf8d4(config.f479091w);
        c25679xbb204036.m96759xb12e6ee2(config.f479092x);
        xm5.b.c("VideoComposition", "export: config: " + c25679xbb204036.m96741xa83ce40f() + ", " + c25679xbb204036.m96739x4590a3fe() + "; video: " + c25679xbb204036.m96745x52061508() + ", " + c25679xbb204036.m96747x21f69ea8() + ", " + i17 + ", " + z17 + "; audio: " + i18 + ", " + i19 + ", " + i27 + ", aacEncodeNeedCodecSpecificData:" + z18 + ",outputHevc:" + config.f479079k, new java.lang.Object[0]);
        com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b c25659xe2dfb08b = new com.p314xaae8f345.tav.p2947x2eaf9f.C25659xe2dfb08b(b17.m98593x742a913a(), c25679xbb204036);
        c25659xe2dfb08b.m96497x507dfc18(true);
        c25659xe2dfb08b.f47297x3e2d9be2 = path;
        c25659xe2dfb08b.f47298x3e2fc6f7 = "mp4";
        c25659xe2dfb08b.f47309xaffe922f = b17.m98595x57d6f9a5();
        c25659xe2dfb08b.m96498xb0bd9928(b17.m98594xb605381c());
        c25659xe2dfb08b.f47306x16fae70 = h();
        c25659xe2dfb08b.m96507xedc90ba9(false);
        c25659xe2dfb08b.m96502x5750fe08(this.f479123r);
        c25659xe2dfb08b.m96509xa1d0ffca(config.f479086r, config.f479087s, config.f479088t);
        c25659xe2dfb08b.m96500x7668c57b(config.f479089u);
        c25659xe2dfb08b.m96499x715c8943(config.f479090v);
        com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f = c25659xe2dfb08b.f47309xaffe922f;
        if (c25706x7dc2d64f != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25706x7dc2d64f);
            c25706x7dc2d64f.m96959xda597388(this.f479119n);
            com.p314xaae8f345.tav.p2947x2eaf9f.p2950xcdff09aa.C25706x7dc2d64f c25706x7dc2d64f2 = c25659xe2dfb08b.f47309xaffe922f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25706x7dc2d64f2);
            c25706x7dc2d64f2.m96962x3395d8b3(this.f479120o);
        }
        xm5.b.c("VideoComposition", "export duration:" + (j() - 0) + " playRange:" + h(), new java.lang.Object[0]);
        c25659xe2dfb08b.m96472xae405e7f(new rm5.u(lVar, android.os.SystemClock.elapsedRealtime(), qVar, this));
        return c25659xe2dfb08b;
    }

    public final void l(int i17, int i18) {
        xm5.b.c("VideoComposition", "setAssetSize: " + i17 + ", " + i18, new java.lang.Object[0]);
        this.f479109d = i17;
        this.f479110e = i18;
        wm5.h hVar = this.f479115j;
        if (hVar != null) {
            hVar.b(i17, i18);
        }
        this.f479108c.set(0, 0, i17, i18);
    }

    public final void m(android.graphics.Rect rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f479112g.set(rect);
    }

    public final void n(long j17, long j18) {
        xm5.b.c("VideoComposition", "setPlayRange:[" + j17 + ", " + j18 + ']', new java.lang.Object[0]);
        this.f479106a = j17;
        this.f479107b = j18;
    }

    public final void o(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2976x633fb29.C25902x4abb7fa4.TAVVideoConfigurationContentMode newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        this.f479124s = newMode;
        wm5.h hVar = this.f479115j;
        if (hVar != null) {
            hVar.a(newMode);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(java.util.List trackList) {
        this();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        this.f479117l.addAll(trackList);
    }
}
