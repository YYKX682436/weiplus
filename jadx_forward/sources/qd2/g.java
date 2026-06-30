package qd2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f443260a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f443261b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f443262c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f443263d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f443264e;

    /* renamed from: f, reason: collision with root package name */
    public wt3.h0 f443265f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f443266g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f443267h;

    /* renamed from: i, reason: collision with root package name */
    public dn.m f443268i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f443269j;

    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, yz5.p doPostCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(doPostCallback, "doPostCallback");
        this.f443260a = activity;
        this.f443261b = c14994x9b99c079;
        this.f443262c = doPostCallback;
        this.f443267h = jz5.h.b(qd2.f.f443256d);
        this.f443269j = new qd2.a(this);
        activity.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.finder.helper.FinderAudioExtractor$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                    qd2.g gVar = qd2.g.this;
                    dn.m mVar = gVar.f443268i;
                    if (mVar != null) {
                        c50.y0 y0Var = (c50.y0) ((jz5.n) gVar.f443267h).mo141623x754a37bb();
                        java.lang.String field_mediaId = mVar.f69601xaca5bdda;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                        ((mn2.q0) y0Var).c(field_mediaId);
                    }
                    pm0.v.C(gVar.f443269j);
                }
            }
        });
    }

    public final java.lang.String a() {
        java.lang.String str = this.f443266g;
        if (str != null) {
            return str;
        }
        wt3.h0 h0Var = this.f443265f;
        java.lang.String str2 = h0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) h0Var).f237248i : null;
        return str2 == null ? "" : str2;
    }

    public final boolean b(java.lang.String str) {
        return o35.a.b(str) && o35.a.g(str) > 0;
    }

    public final void c(boolean z17) {
        java.lang.String a17 = a();
        if (z17 && b(a17)) {
            try {
                i95.m c17 = i95.n0.c(m40.k0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ((c61.p7) ((m40.k0) c17)).fj(a17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAudioExtractor", "[onResult] insertOrUpdateMusicDownloaded fail:" + th6.getMessage());
            }
        }
        pm0.v.X(new qd2.d(this, z17, a17));
    }

    public final void d(r45.zi2 zi2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f443261b;
        if (c14994x9b99c079 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAudioExtractor", "preloadAudioFile: feed is null");
            return;
        }
        if (c14994x9b99c079.getMediaType() == 4) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = c14994x9b99c079.getFeedObject();
            long m76784x5db1b11 = feedObject.m76784x5db1b11();
            java.lang.String u17 = pm0.v.u(m76784x5db1b11);
            i95.m c17 = i95.n0.c(w40.e.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String aj6 = ((qs2.q) ((w40.e) c17)).aj(m76784x5db1b11);
            if (!b(aj6)) {
                this.f443268i = c50.y0.a((c50.y0) ((jz5.n) this.f443267h).mo141623x754a37bb(), feedObject, 0, null, new qd2.c(u17, this), 6, null);
                return;
            }
            this.f443266g = aj6;
            this.f443263d = true;
            java.lang.String str = this.f443266g;
            if (str != null) {
                if (!(str.length() == 0)) {
                    r4 = true;
                }
            }
            c(r4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[downloadVideo] audio existed feedId:" + u17 + " destPath:" + aj6);
            return;
        }
        if (zi2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderAudioExtractor", "preloadAudioFile: musicInfo is null");
            return;
        }
        java.lang.String m75945x2fec8307 = zi2Var.m75945x2fec8307(5);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            this.f443265f = null;
            this.f443263d = true;
            pm0.v.X(new qd2.e(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[downloadImgBgm] music url is null");
            return;
        }
        ((pc0.k2) ((qc0.i1) i95.n0.c(qc0.i1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
        c16997xb0aa383a.f237244e = (int) java.lang.System.currentTimeMillis();
        c16997xb0aa383a.f237245f = zi2Var.m75945x2fec8307(5);
        c16997xb0aa383a.f237248i = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a.c(zi2Var);
        this.f443265f = c16997xb0aa383a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderAudioExtractor", "[downloadImgBgm] musicUrl=" + c16997xb0aa383a.f237245f + " path=" + c16997xb0aa383a.f237248i + " downloadFinish=" + this.f443263d);
        ((pc0.k2) ((qc0.i1) i95.n0.c(qc0.i1.class))).wi(this.f443260a, c16997xb0aa383a, new qd2.b(this, c16997xb0aa383a));
    }

    public final boolean e(android.content.Context context) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f443263d) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f443264e;
        if (u3Var2 == null) {
            this.f443264e = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cxo), true, 2, null);
        } else {
            if ((u3Var2.isShowing() ? false : true) && (u3Var = this.f443264e) != null) {
                u3Var.show();
            }
        }
        pm0.v.C(this.f443269j);
        pm0.v.U(((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.W7).mo141623x754a37bb()).r()).longValue() * 1000, this.f443269j);
        return true;
    }
}
