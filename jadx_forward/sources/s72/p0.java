package s72;

/* loaded from: classes12.dex */
public final class p0 extends jm0.g implements o72.g4 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f485656f;

    /* renamed from: g, reason: collision with root package name */
    public int f485657g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f485658h;

    /* renamed from: i, reason: collision with root package name */
    public s72.l0 f485659i;

    /* renamed from: m, reason: collision with root package name */
    public final s72.v0 f485660m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f485661n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f485662o;

    /* renamed from: p, reason: collision with root package name */
    public o72.h4 f485663p;

    /* renamed from: q, reason: collision with root package name */
    public o72.o5 f485664q;

    /* renamed from: r, reason: collision with root package name */
    public o72.o5 f485665r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f485666s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f485667t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f485657g = -1;
        this.f485660m = new s72.v0(service);
        this.f485667t = jz5.h.b(new s72.o0(service));
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[onAccountInit] GetPinOnTopService initialized");
        if (!X6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "Sync on top service disabled.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "Sync on top service enabled.");
        new com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13543xc5e0e03f().e();
        this.f485659i = new s72.l0(this);
        this.f485661n = true;
        this.f485666s = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5211x107ec8e8> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5211x107ec8e8>(a0Var) { // from class: com.tencent.mm.plugin.fav.api.sync.GetPinOnTopService$onAccountInit$1
            {
                this.f39173x3fe91575 = -501799176;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5211x107ec8e8 c5211x107ec8e8) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5211x107ec8e8 event = c5211x107ec8e8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[FavPinTopInChat] notified.");
                s72.p0.this.V6();
                return true;
            }
        };
        this.f485658h = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        V6();
    }

    @Override // jm0.g
    public void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[onAccountRelease] GetPinOnTopService destroyed.");
        if (X6()) {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.f485658h;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
            this.f485658h = null;
            this.f485659i = null;
            this.f485661n = false;
        }
    }

    public boolean T6(o72.r2 r2Var) {
        if (r2Var == null) {
            return false;
        }
        return !U6() || r2Var.f67657x2262335f == 18;
    }

    public final boolean U6() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pin_note_enforce_note_type_check, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "check note type enabled, " + fj6);
        return fj6;
    }

    public void V6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getPinOnTop], callbacks ready: ");
        sb6.append(this.f485663p != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", sb6.toString());
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) this.f485667t).mo141623x754a37bb(), null, new s72.m0(this, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s72.p0.W6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean X6() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pin_note_sync_all_platform, false);
    }

    public void Y6(int i17, boolean z17, o72.o5 o5Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[GetPinOnTopService] pinOnTop with favId = " + i17 + ", onTop = " + z17);
        if (o5Var != null) {
            if (z17) {
                this.f485664q = o5Var;
            } else {
                this.f485665r = o5Var;
            }
        }
        s72.v0 v0Var = this.f485660m;
        v0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PinOnTopService", "[pinOnTop] with favId = " + i17 + ", onTop = " + z17);
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) v0Var.f485695f).mo141623x754a37bb(), null, new s72.t0(v0Var, i17, z17, null), 1, null);
    }

    public void Z6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[processCancelOnTopRequestFromExternal]");
        if (this.f485663p != null) {
            mz4.b0.c().d(null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ih0.RunnableC28513x321855());
        }
    }

    public void a7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetPinOnTopService", "[processOnTopRequestFromExternal]");
        if (this.f485663p != null) {
            int i17 = this.f485657g;
            if (i17 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavGetPinOnTopServiceCallbacksImpl", "pinOnTopCallbackFromExternal not a valid favId");
                return;
            }
            o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i17);
            if (re6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavGetPinOnTopServiceCallbacksImpl", "pinOnTopCallbackFromExternal no such item exists.");
                return;
            }
            if (!((s72.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).T6(re6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FavGetPinOnTopServiceCallbacksImpl", "pinOnTopCallbackFromExternal not a note type");
                return;
            }
            iz4.r rVar = new iz4.r();
            rVar.f377673e = re6.f67645x88be67a1;
            if (re6.f67640x5ab01132 != null) {
                rVar.f377677i = s82.e0.n(new java.util.ArrayList(), re6.f67640x5ab01132.f452497f, null, "");
            }
            if (rVar.f377677i.isEmpty()) {
                rVar.f377677i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_l);
            }
            mz4.b0.c().d(rVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ih0.RunnableC28512x321854());
        }
    }
}
