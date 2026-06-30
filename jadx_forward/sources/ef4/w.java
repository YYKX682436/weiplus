package ef4;

@j95.b
/* loaded from: classes4.dex */
public final class w extends i95.w {

    /* renamed from: t, reason: collision with root package name */
    public static final ef4.v f334001t = new ef4.v(null);

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f334002u;

    /* renamed from: v, reason: collision with root package name */
    public static long f334003v;

    /* renamed from: d, reason: collision with root package name */
    public boolean f334004d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f334005e;

    /* renamed from: f, reason: collision with root package name */
    public nf4.l f334006f;

    /* renamed from: g, reason: collision with root package name */
    public nf4.g f334007g;

    /* renamed from: h, reason: collision with root package name */
    public nf4.n f334008h;

    /* renamed from: i, reason: collision with root package name */
    public nf4.a f334009i;

    /* renamed from: m, reason: collision with root package name */
    public nf4.p f334010m;

    /* renamed from: n, reason: collision with root package name */
    public nf4.i f334011n;

    /* renamed from: o, reason: collision with root package name */
    public hf4.f f334012o;

    /* renamed from: p, reason: collision with root package name */
    public ef4.f0 f334013p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.C18460x8c2f9b02 f334014q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.p2236x633fb29.C18465x49dc6136 f334015r;

    /* renamed from: s, reason: collision with root package name */
    public volatile d95.b0 f334016s;

    static {
        new android.graphics.Point();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f334002u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.story.model.StoryCore$Companion$exptChangeListener$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ef4.v vVar = ef4.w.f334001t;
                return true;
            }
        };
        f334003v = -1L;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.story.PluginStory$StorySynclistener] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.story.model.StoryCore$ConfigChangedListener] */
    public w() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f334005e = hashMap;
        this.f334014q = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6139xfc5b076a>() { // from class: com.tencent.mm.plugin.story.PluginStory$StorySynclistener
            {
                com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                this.f39173x3fe91575 = 1194890618;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6139xfc5b076a c6139xfc5b076a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6139xfc5b076a event = c6139xfc5b076a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                gm0.j1.n().f354821b.g(new ff4.m(128));
                return false;
            }
        };
        this.f334015r = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80>() { // from class: com.tencent.mm.plugin.story.model.StoryCore$ConfigChangedListener
            {
                super(com.p314xaae8f345.mm.app.a0.f134821d);
                this.f39173x3fe91575 = -443124368;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 c5313xa7be6d80) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 event = c5313xa7be6d80;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ef4.v vVar = ef4.w.f334001t;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCore", "dynamicCfg changed, will loadConfig.");
                ef4.w.this.getClass();
                int i17 = bf4.i.f101252b;
                return false;
            }
        };
        hashMap.put(541145475, ef4.o.f333994a);
        hashMap.put(391276095, ef4.p.f333995a);
        hashMap.put(-2097386107, ef4.q.f333996a);
        hashMap.put(1540233546, ef4.r.f333997a);
        hashMap.put(-860939664, ef4.s.f333998a);
        hashMap.put(917584926, ef4.t.f333999a);
        hashMap.put(2106223442, ef4.u.f334000a);
    }

    public static final void wi(ef4.w wVar) {
        if (wVar.f334016s != null) {
            return;
        }
        wVar.f334016s = new d95.b0();
        java.lang.String str = gm0.j1.u().h() + "StoryMicroMsg.db";
        d95.b0 b0Var = wVar.f334016s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
        if (b0Var.S(str, wVar.f334005e, true, true)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCore", "removeDirtyDB.");
        java.lang.String h17 = gm0.j1.u().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getPrivateAccountPath(...)");
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17 = com.p314xaae8f345.mm.vfs.w6.s(h17, false);
        if (s17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StoryCore", "removeDirtyDB files null");
            return;
        }
        for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
            if (!x1Var.f294769f) {
                java.lang.String name = x1Var.f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                if (r26.n0.B(name, "StoryMicroMsg", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCore", "removeDirtyDB will delete:%s", x1Var.f294764a);
                    x1Var.a();
                }
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f334004d) {
            return;
        }
        this.f334004d = true;
        com.p314xaae8f345.mm.vfs.w6.u(((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi());
        ye4.e eVar = (ye4.e) ((ze4.f) i95.n0.c(ze4.f.class));
        eVar.getClass();
        com.p314xaae8f345.mm.vfs.w6.u(gm0.j1.u().d() + eVar.f542769e);
        mo48813x58998cd();
        q25.b.b(new ef4.l(), "//story");
        ef4.v vVar = f334001t;
        nf4.g g17 = vVar.g();
        g17.add(g17);
        gf4.l lVar = gf4.l.f352887d;
        java.lang.String str = gf4.l.f352888e;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        java.lang.String str2 = gf4.l.f352889f;
        if (j17 && !com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            com.p314xaae8f345.mm.vfs.w6.w(str, str2);
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str2, 0, -1);
        if (N != null) {
            if (true ^ (N.length == 0)) {
                gf4.l.f352892i.mo11468x92b714fd(N);
            }
        }
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m.f34560x366c91de, lVar);
        gm0.j1.n().f354821b.a(764, lVar);
        lVar.m();
        kf4.o oVar = kf4.o.f389017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncFetcher", "init: ");
        vVar.g().add(oVar);
        vVar.i().add(oVar);
        pm0.v.V(1000L, kf4.e.f389006d);
        kf4.o.f389025o.mo48813x58998cd();
        lVar.a(kf4.o.f389026p);
        f334002u.mo48813x58998cd();
        ef4.c0.f333972b = "";
        com.p314xaae8f345.mm.vfs.w6.u(vVar.b().concat("coming/"));
        com.p314xaae8f345.mm.vfs.w6.u(vVar.b().concat("pic/"));
        com.p314xaae8f345.mm.vfs.w6.u(vVar.b().concat("video/"));
        mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mo48814x2efc64();
        mo48814x2efc64();
        q25.b.c("//story");
        ef4.v vVar = f334001t;
        nf4.g g17 = vVar.g();
        g17.mo49775xc84af884(g17);
        gf4.l lVar = gf4.l.f352887d;
        com.p314xaae8f345.mm.vfs.w6.R(gf4.l.f352889f, gf4.l.f352892i.mo14344x5f01b1f6());
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.m.f34560x366c91de, lVar);
        gm0.j1.n().f354821b.q(764, lVar);
        kf4.o oVar = kf4.o.f389017d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncFetcher", "destroy: ");
        vVar.g().mo49775xc84af884(oVar);
        vVar.i().mo49775xc84af884(oVar);
        kf4.o.f389024n.clear();
        kf4.o.f389025o.mo48814x2efc64();
        lVar.j(kf4.o.f389026p);
        f334002u.mo48814x2efc64();
    }
}
