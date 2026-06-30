package bd2;

/* loaded from: classes2.dex */
public final class g implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f100782d;

    /* renamed from: e, reason: collision with root package name */
    public final long f100783e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f100784f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f100785g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f100786h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23863x1bd5fbd f100787i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f100788m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23874xcbecf254 f100789n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f100790o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f100791p;

    public g(android.content.Context context, long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        this.f100782d = context;
        this.f100783e = j17;
        this.f100784f = str;
        this.f100785g = objectNonceId;
        this.f100786h = z17;
        this.f100788m = new java.lang.ref.WeakReference(c15196x85976f5f);
        this.f100789n = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23874xcbecf254(true, false, null, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f100790o = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209538wb).mo141623x754a37bb()).r()).intValue() == 1;
        this.f100791p = kz5.p0.f395529d;
    }

    public final void a() {
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23874xcbecf254 c23874xcbecf254 = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23874xcbecf254(true, false, null, 4, null);
        this.f100789n = c23874xcbecf254;
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23863x1bd5fbd c23863x1bd5fbd = this.f100787i;
        if (c23863x1bd5fbd != null) {
            c23863x1bd5fbd.m88451x5dfa2dd7(c23874xcbecf254, bd2.f.f100781d);
        }
        bd2.r.f100817a.a(this.f100782d, this.f100783e, this.f100784f, this.f100786h, new bd2.c(this), new bd2.d(this));
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44
    /* renamed from: getPlayPercent */
    public long mo10187x8efd753b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) this.f100788m.get();
        if (c15196x85976f5f != null) {
            cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
            boolean z17 = false;
            if (playInfo != null && (c14989xf862ae88 = playInfo.f305278a) != null && c14989xf862ae88.getFeedId() == this.f100783e) {
                z17 = true;
            }
            if (!z17) {
                c15196x85976f5f = null;
            }
            if (c15196x85976f5f != null) {
                return c15196x85976f5f.m61479x8efd753b();
            }
        }
        return 0L;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44.Companion.m88457x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f100787i = new com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23863x1bd5fbd(m137983x3b5b91dc2, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44.Companion.m88457x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f100787i = null;
        this.f100788m.clear();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44
    /* renamed from: onDislikePanelDismiss */
    public void mo10188xe3c50d4c(com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23873x663ef05f dismissType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dismissType, "dismissType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFlutterDislikePlugin", "onDislikePanelDismiss: " + dismissType);
        bd2.r rVar = bd2.r.f100817a;
        if (rVar.b()) {
            com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23873x663ef05f enumC23873x663ef05f = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23873x663ef05f.f42466x760d227a;
            android.content.Context context = this.f100782d;
            long j17 = this.f100783e;
            if (dismissType != enumC23873x663ef05f) {
                boolean z17 = this.f100786h;
                if (z17) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5681x10014e2 c5681x10014e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5681x10014e2();
                    c5681x10014e2.f136007g.f89914a = j17;
                    c5681x10014e2.e();
                }
                rVar.c(this.f100782d, this.f100783e, this.f100784f, this.f100785g, java.lang.Boolean.valueOf(z17), this.f100791p);
                rVar.d(context, j17, false);
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5516x15e2361e c5516x15e2361e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5516x15e2361e();
                am.tc tcVar = c5516x15e2361e.f135847g;
                tcVar.f89531a = false;
                tcVar.f89532b = j17;
                c5516x15e2361e.e();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oex);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                e4Var.c();
            }
        }
        this.f100788m.clear();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44
    /* renamed from: retryFetchDislikeReasons */
    public void mo10189x8046875c() {
        a();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.InterfaceC23867x26055b44
    /* renamed from: submitFeedDislikeReasons */
    public void mo10190xb9959940(java.util.List selectedReasons) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedReasons, "selectedReasons");
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        java.util.Iterator it = selectedReasons.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((byte[]) next) != null) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList<r45.rw4> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (byte[] bArr : arrayList) {
            r45.rw4 rw4Var = new r45.rw4();
            rw4Var.mo11468x92b714fd(bArr);
            arrayList2.add(rw4Var);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("submitFeedDislikeReasons:");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (r45.rw4 rw4Var2 : arrayList2) {
            arrayList3.add(rw4Var2.m75939xb282bd08(0) + '-' + rw4Var2.m75945x2fec8307(1));
        }
        sb6.append(kz5.n0.g0(arrayList3, ",", null, null, 0, null, null, 62, null));
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFlutterDislikePlugin", sb6.toString());
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        for (r45.rw4 rw4Var3 : arrayList2) {
            r45.qw4 qw4Var = new r45.qw4();
            qw4Var.set(0, java.lang.Integer.valueOf(rw4Var3.m75939xb282bd08(0)));
            qw4Var.set(1, rw4Var3.m75945x2fec8307(2));
            arrayList4.add(qw4Var);
        }
        this.f100791p = arrayList4;
        bd2.r rVar = bd2.r.f100817a;
        if (!rVar.b()) {
            rVar.c(this.f100782d, this.f100783e, this.f100784f, this.f100785g, java.lang.Boolean.valueOf(this.f100786h), this.f100791p);
        }
        if (this.f100790o) {
            return;
        }
        rVar.d(this.f100782d, this.f100783e, true);
    }
}
