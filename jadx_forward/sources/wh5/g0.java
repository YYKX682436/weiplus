package wh5;

/* loaded from: classes12.dex */
public final class g0 extends vf3.i {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f527595g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f527596h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f527597i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f527598m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f527599n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f527595g = new java.util.LinkedHashMap();
        this.f527596h = new java.util.LinkedHashMap();
        this.f527597i = new java.util.LinkedHashMap();
        this.f527598m = jz5.h.b(wh5.a0.f527549d);
        this.f527599n = jz5.h.b(wh5.z.f527645d);
    }

    public static final void b7(wh5.g0 g0Var, mf3.k kVar, java.lang.String str) {
        g0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b Ai = ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).Ai(str);
        if (Ai == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ChatLiveStateManager", "checkVideoInfo failed, mediaId: " + kVar.mo2110x5db1b11() + " , mediaLevel: " + kVar.mo147256x74bf41ce().name() + " , videoPath: " + str);
            return;
        }
        sf3.g e17 = kVar.e();
        lf3.k a17 = lf3.l.f399859a.a(e17 != null ? e17.c() : null);
        wh5.v vVar = (wh5.v) kVar;
        vf3.d dVar = new vf3.d(Ai.f243934t, Ai.f243933s, ((be0.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class))).Bi(str), a17 != null ? a17.f399855a : 0, a17 != null ? a17.f399856b : 0);
        vf3.b T4 = g0Var.T4(vVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parserLiveInfo MMBitmapFactory.decodeFile , mediaId: ");
        sb6.append(kVar.mo2110x5db1b11());
        sb6.append(" , imageWidth: ");
        sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f399855a) : null);
        sb6.append(" , imageHeight: ");
        sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f399856b) : null);
        sb6.append(" isHorizontalLong: ");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.f399857c) : null);
        sb6.append(" isVerticalLong: ");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.f399858d) : null);
        sb6.append(" imageHDFileLen: ");
        sb6.append(T4 != null ? java.lang.Long.valueOf(T4.f517899b) : null);
        sb6.append(" videoHDFileLen: ");
        sb6.append(T4 != null ? java.lang.Long.valueOf(T4.f517901d) : null);
        sb6.append(" videoInfo:");
        sb6.append(Ai);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.ChatLiveStateManager", sb6.toString());
        g0Var.f527596h.put(g0Var.W6(kVar), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c7(wh5.g0 r11, wh5.v r12, l70.d r13, java.lang.String r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh5.g0.c7(wh5.g0, wh5.v, l70.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public vf3.d K(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        return (vf3.d) ((java.util.LinkedHashMap) this.f527596h).get(W6(mediaInfo));
    }

    @Override // vf3.a
    public vf3.c S3(mf3.k mediaInfo) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        sf3.g e17 = mediaInfo.e();
        java.lang.String c17 = e17 != null ? e17.c() : null;
        wh5.v vVar = (wh5.v) mediaInfo;
        if (c17 == null || !com.p314xaae8f345.mm.vfs.w6.j(c17)) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.g0a;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = vVar.f527629a;
            if (tg3.s1.a(f9Var)) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.o6k;
            } else if (f9Var.z2()) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.g07;
            } else {
                jx3.f.INSTANCE.d(31328, 1, 5000);
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.g08;
            }
        }
        java.lang.String string = m158354x19263085().getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return new vf3.c(string);
    }

    @Override // vf3.a
    public vf3.b T4(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        wh5.v vVar = (wh5.v) mediaInfo;
        java.util.Map map = this.f527597i;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        if (linkedHashMap.get(mediaInfo.mo2110x5db1b11()) == null) {
            j15.d dVar = new j15.d();
            java.lang.String j17 = vVar.f527629a.j();
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
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg = vVar.f527629a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            map.put(mediaInfo.mo2110x5db1b11(), new vf3.b(m140204x23255ddc, r17, m140208xfb854877, o17, p17, ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(msg) <= 0));
        }
        return (vf3.b) linkedHashMap.get(mediaInfo.mo2110x5db1b11());
    }

    @Override // vf3.i
    public void V6() {
        v65.i.b(this.f517934f, null, new wh5.x(this, null), 1, null);
    }

    @Override // vf3.a
    public boolean c2(mf3.k mediaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        vf3.d dVar = (vf3.d) ((java.util.LinkedHashMap) this.f527596h).get(W6(mediaInfo));
        if (dVar != null) {
            return dVar.f517907c;
        }
        return false;
    }

    public final java.util.HashSet d7() {
        return (java.util.HashSet) ((jz5.n) this.f527599n).mo141623x754a37bb();
    }

    public final java.util.HashSet e7() {
        return (java.util.HashSet) ((jz5.n) this.f527598m).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f7(wh5.v r23, l70.d r24, java.lang.String r25, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r26) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh5.g0.f7(wh5.v, l70.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // vf3.a
    public void p1(mf3.k mediaInfo, java.lang.String path, vf3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        wh5.v vVar = mediaInfo instanceof wh5.v ? (wh5.v) mediaInfo : null;
        if (vVar == null) {
            return;
        }
        java.lang.String mediaId = mediaInfo.mo2110x5db1b11();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        sf3.m mVar = sf3.m.f488938g;
        linkedHashMap.put(mVar, path);
        sf3.g a17 = new sf3.g(linkedHashMap, mediaId, null, null, null, null, 60, null).a(mVar);
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(a17.c());
        java.lang.String str = a18.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
            vf3.i.Z6(this, vVar, vf3.e.f517917n, null, null, a17, 6, null);
        } else {
            vf3.i.Z6(this, vVar, vf3.e.f517915i, null, null, null, 14, null);
        }
    }

    @Override // vf3.a
    public void v2(mf3.k mediaInfo, vf3.g listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        a7(mediaInfo, listener);
        wh5.v vVar = mediaInfo instanceof wh5.v ? (wh5.v) mediaInfo : null;
        if (vVar == null) {
            return;
        }
        if (tg3.s1.a(((wh5.v) mediaInfo).f527629a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ChatLiveStateManager", "updateState SEC_INVALID, isSecExpired. mediaId: " + mediaInfo.mo2110x5db1b11());
            vf3.i.Z6(this, mediaInfo, vf3.e.f517919p, null, null, null, 14, null);
            return;
        }
        mediaInfo.mo2110x5db1b11();
        l70.d h17 = vVar.h();
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ChatLiveStateManager", "updateState INVALID, videoDownloadParam null. mediaId: " + mediaInfo.mo2110x5db1b11());
            vf3.i.Z6(this, mediaInfo, vf3.e.f517918o, null, null, null, 14, null);
            return;
        }
        l70.d d17 = vVar.d();
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.ChatLiveStateManager", "updateState INVALID, imageDownloadParam null. mediaId: " + mediaInfo.mo2110x5db1b11());
            vf3.i.Z6(this, mediaInfo, vf3.e.f517918o, null, null, null, 14, null);
            return;
        }
        java.lang.String mo2110x5db1b11 = mediaInfo.mo2110x5db1b11();
        wh5.w wVar = new wh5.w(vVar, new wh5.e0(this, mediaInfo));
        this.f527595g.put(mo2110x5db1b11, wVar);
        d17.f398346n = new java.lang.ref.WeakReference(wVar);
        h17.f398346n = new java.lang.ref.WeakReference(wVar);
        v65.i.b(this.f517934f, null, new wh5.d0(h17, d17, mediaInfo, this, vVar, null), 1, null);
    }

    @Override // vf3.a
    public void x6(mf3.k mediaInfo) {
        l70.d d17;
        l70.d h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        wh5.v vVar = mediaInfo instanceof wh5.v ? (wh5.v) mediaInfo : null;
        if (vVar == null || (d17 = vVar.d()) == null || (h17 = vVar.h()) == null) {
            return;
        }
        v65.i.b(this.f517934f, null, new wh5.y(this, d17, vVar, h17, null), 1, null);
    }
}
