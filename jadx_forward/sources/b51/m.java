package b51;

/* loaded from: classes10.dex */
public final class m implements rj.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f99574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f99576c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f99577d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99578e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f99579f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f99580g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f99581h;

    public m(rj.o cfg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cfg, "cfg");
        this.f99574a = "PagLoader";
        this.f99575b = 3;
        this.f99576c = 5;
        this.f99577d = "";
        this.f99580g = jz5.h.b(b51.e.f99546d);
        this.f99581h = jz5.h.b(new b51.l(this));
        this.f99577d = cfg.f477677a;
        this.f99578e = cfg.f477678b;
        this.f99579f = cfg.f477679c;
    }

    public static final boolean e(b51.m mVar, java.lang.String str) {
        mVar.getClass();
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        java.lang.String str2 = mVar.f99574a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "fileExist = " + j17 + ", path = " + str);
        if (!j17) {
            return false;
        }
        org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str);
        if (!(m154716x243906 != null)) {
            m154716x243906 = null;
        }
        if (m154716x243906 != null) {
            return true;
        }
        if (!mVar.f99578e) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[checkFileLoadSuccess], del path:" + str);
        com.p314xaae8f345.mm.vfs.w6.h(str);
        return false;
    }

    public final boolean f(java.lang.String str) {
        if (!(this.f99577d.length() == 0)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f99574a, "tag = " + str + ", path is null, return ");
        return false;
    }

    public java.lang.String g(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f99577d);
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public java.lang.Object h(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        if (!f(str2)) {
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        boolean z17 = str.length() == 0;
        java.lang.String str3 = this.f99574a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", empty return");
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        java.lang.String g17 = g(str);
        v65.n nVar = new v65.n(rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
        if (e(this, g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load] finished-cache tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
            nVar.a(org.p3363xbe4143f1.C29690xfae77312.m154716x243906(g17));
        } else {
            ((fp0.o) ((jz5.n) this.f99581h).mo141623x754a37bb()).b(new c51.f(new d51.a(str, g17, this.f99578e, new b51.h(this, str2, str, g17, nVar))), new b51.i(this, str2, str, g17, nVar));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public void i(java.lang.String url, android.view.View pagView, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f99574a, "[load] tag:" + str + ", url:" + url);
        if (f(str)) {
            if (!(url.length() == 0)) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                ((ku5.t0) u0Var).h(new b51.g(this, url, str, pagView), this.f99574a + "-[load]");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f99574a, "[load] tag:" + str + ", url:" + url + ", empty return");
        }
    }

    public java.lang.Object j(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        if (!f(str2)) {
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        boolean z17 = str.length() == 0;
        java.lang.String str3 = this.f99574a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", empty return");
            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
        java.lang.String g17 = g(str);
        v65.n nVar = new v65.n(rVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
        if (e(this, g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load] finished-cache tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
            nVar.a(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906(g17));
        } else {
            ((fp0.o) ((jz5.n) this.f99581h).mo141623x754a37bb()).b(new c51.h(new d51.d(str, g17, this.f99578e, new b51.j(this, str2, str, g17, nVar))), new b51.k(this, str2, str, g17, nVar));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
