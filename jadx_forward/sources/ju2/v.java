package ju2;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f383381a;

    /* renamed from: b, reason: collision with root package name */
    public final long f383382b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f383383c;

    /* renamed from: d, reason: collision with root package name */
    public final so2.f1 f383384d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f383385e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f383386f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f383387g;

    /* renamed from: h, reason: collision with root package name */
    public final int f383388h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.hn2 f383389i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.nv2 f383390j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15004x9e715ad4 f383391k;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1] */
    public v() {
        this.f383381a = 1;
        this.f383388h = 5;
        ?? r17 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f210020d;

            {
                this.f210020d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 1097932050;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
                am.md mdVar;
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 event = c5542xa257d922;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ju2.v vVar = (ju2.v) this.f210020d.get();
                if (vVar == null || (mdVar = event.f135866g) == null) {
                    return false;
                }
                int i17 = mdVar.f88873d;
                java.lang.String str2 = vVar.f383387g;
                long j17 = vVar.f383382b;
                if (i17 != 6) {
                    if (i17 != 7 || (str = mdVar.f88872c) == null) {
                        return false;
                    }
                    long j18 = mdVar.f88870a;
                    if (j17 != j18 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                        return false;
                    }
                    pm0.v.X(new ju2.u(j18, str, event, vVar));
                    return false;
                }
                java.lang.String str3 = mdVar.f88872c;
                if (str3 == null) {
                    return false;
                }
                long j19 = mdVar.f88870a;
                if (j17 != j19 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str2)) {
                    return false;
                }
                pm0.v.X(new ju2.t(j19, str3, event, vVar));
                return false;
            }
        };
        this.f383391k = r17;
        r17.mo48813x58998cd();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1] */
    public v(boolean z17, long j17, java.lang.String wxUsername, int i17, ju2.w delegate, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, so2.f1 f1Var, int i18, r45.hn2 hn2Var, r45.nv2 nv2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f383381a = 1;
        this.f383388h = 5;
        ?? r17 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f210020d;

            {
                this.f210020d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 1097932050;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
                am.md mdVar;
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 event = c5542xa257d922;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ju2.v vVar = (ju2.v) this.f210020d.get();
                if (vVar == null || (mdVar = event.f135866g) == null) {
                    return false;
                }
                int i172 = mdVar.f88873d;
                java.lang.String str2 = vVar.f383387g;
                long j172 = vVar.f383382b;
                if (i172 != 6) {
                    if (i172 != 7 || (str = mdVar.f88872c) == null) {
                        return false;
                    }
                    long j18 = mdVar.f88870a;
                    if (j172 != j18 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                        return false;
                    }
                    pm0.v.X(new ju2.u(j18, str, event, vVar));
                    return false;
                }
                java.lang.String str3 = mdVar.f88872c;
                if (str3 == null) {
                    return false;
                }
                long j19 = mdVar.f88870a;
                if (j172 != j19 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str2)) {
                    return false;
                }
                pm0.v.X(new ju2.t(j19, str3, event, vVar));
                return false;
            }
        };
        this.f383391k = r17;
        r17.mo48813x58998cd();
        this.f383382b = j17;
        this.f383386f = z17;
        this.f383381a = i17;
        this.f383387g = wxUsername;
        this.f383383c = c19781xd1c47b87;
        this.f383384d = f1Var;
        this.f383388h = i18;
        this.f383389i = hn2Var;
        this.f383390j = nv2Var;
        this.f383385e = new java.lang.ref.WeakReference(delegate);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderThanksButtonViewModel", "init with isThank:" + z17 + ", feedId:" + j17 + ", wxUsername:" + wxUsername + ", interactionType:" + i17 + ", commentInfo:" + c19781xd1c47b87 + ", likeInfo:" + f1Var + ", thankForwardScene:" + i18 + ", thankInfo:" + hn2Var + ", shareUserInfo:" + nv2Var);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1] */
    public v(dm.pd mention, ju2.w delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f383381a = 1;
        this.f383388h = 5;
        ?? r27 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f210020d;

            {
                this.f210020d = new java.lang.ref.WeakReference(this);
                this.f39173x3fe91575 = 1097932050;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922) {
                am.md mdVar;
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 event = c5542xa257d922;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ju2.v vVar = (ju2.v) this.f210020d.get();
                if (vVar == null || (mdVar = event.f135866g) == null) {
                    return false;
                }
                int i172 = mdVar.f88873d;
                java.lang.String str2 = vVar.f383387g;
                long j172 = vVar.f383382b;
                if (i172 != 6) {
                    if (i172 != 7 || (str = mdVar.f88872c) == null) {
                        return false;
                    }
                    long j18 = mdVar.f88870a;
                    if (j172 != j18 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
                        return false;
                    }
                    pm0.v.X(new ju2.u(j18, str, event, vVar));
                    return false;
                }
                java.lang.String str3 = mdVar.f88872c;
                if (str3 == null) {
                    return false;
                }
                long j19 = mdVar.f88870a;
                if (j172 != j19 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, str2)) {
                    return false;
                }
                pm0.v.X(new ju2.t(j19, str3, event, vVar));
                return false;
            }
        };
        this.f383391k = r27;
        r27.mo48813x58998cd();
        this.f383386f = (mention.f66082x26b1b2e8 & 32) > 0;
        this.f383385e = new java.lang.ref.WeakReference(delegate);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderThanksButtonViewModel", "init with mention:" + mention);
    }
}
