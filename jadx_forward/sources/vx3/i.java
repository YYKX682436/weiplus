package vx3;

/* loaded from: classes10.dex */
public class i {
    public static final vx3.h D = new vx3.h(null);
    public java.lang.String A;
    public java.lang.String B;
    public boolean C;

    /* renamed from: a, reason: collision with root package name */
    public dk4.a f522817a;

    /* renamed from: b, reason: collision with root package name */
    public long f522818b;

    /* renamed from: c, reason: collision with root package name */
    public long f522819c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f522820d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f522821e;

    /* renamed from: f, reason: collision with root package name */
    public t45.n0 f522822f;

    /* renamed from: g, reason: collision with root package name */
    public long f522823g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f522824h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f522825i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f522826j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f522827k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f522828l;

    /* renamed from: m, reason: collision with root package name */
    public vx3.g f522829m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f522830n;

    /* renamed from: o, reason: collision with root package name */
    public long f522831o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f522832p;

    /* renamed from: q, reason: collision with root package name */
    public int f522833q;

    /* renamed from: r, reason: collision with root package name */
    public t45.e1 f522834r;

    /* renamed from: s, reason: collision with root package name */
    public long f522835s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f522836t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f522837u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f522838v;

    /* renamed from: w, reason: collision with root package name */
    public int f522839w;

    /* renamed from: x, reason: collision with root package name */
    public int f522840x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f522841y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f522842z;

    public i() {
        this.f522824h = "";
        this.f522825i = "";
        this.f522826j = "";
        this.f522827k = "";
        this.f522828l = "";
        this.f522829m = vx3.g.f522812f;
        this.f522832p = "";
        this.f522836t = "";
        this.f522837u = "";
        this.f522838v = "";
        this.f522842z = "";
        this.A = "";
        this.B = "";
    }

    public final boolean a() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return true;
        }
        try {
            return notificationManager.getNotificationChannel(this.f522828l) != null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TPMediaInfoDesc", "checkIfChannelValid fail:" + e17.getLocalizedMessage());
            return false;
        }
    }

    public final java.lang.String b(java.lang.Object obj) {
        java.lang.String str;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        java.lang.String p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "escapeStringForXml(...)");
        return p17;
    }

    public final long c() {
        if (k()) {
            return 1L;
        }
        return j() ? 2L : 3L;
    }

    public final java.lang.String d() {
        java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(this.f522831o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
        return r07;
    }

    public final java.lang.String e() {
        long j17 = this.f522831o;
        if (j17 != 0) {
            java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
            return r07;
        }
        int i17 = this.f522833q;
        if (i17 != 0) {
            return java.lang.String.valueOf(i17);
        }
        java.lang.String str = this.f522821e;
        return str == null ? "" : str;
    }

    public final java.lang.String f() {
        return this.f522824h;
    }

    public final java.lang.String g() {
        dk4.a aVar = this.f522817a;
        java.lang.String str = aVar != null ? aVar.f316015s : null;
        return str == null ? "" : str;
    }

    public final java.lang.String h() {
        dk4.a aVar = this.f522817a;
        java.lang.String str = aVar != null ? aVar.f316016t : null;
        return str == null ? "" : str;
    }

    public final ey3.a i() {
        ey3.a aVar = new ey3.a();
        dk4.a aVar2 = this.f522817a;
        aVar.f339137b = aVar2 != null ? aVar2.f316015s : null;
        t45.e1 e1Var = this.f522834r;
        aVar.f339136a = e1Var != null ? e1Var.f497081d : null;
        return aVar;
    }

    public final boolean j() {
        if (this.f522831o != 0) {
            return this.f522832p.length() > 0;
        }
        return false;
    }

    public final boolean k() {
        return this.f522833q != 0;
    }

    public final void l(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.f522824h = str;
    }

    public final void m(boolean z17) {
        java.lang.String str;
        this.C = z17;
        dk4.a aVar = this.f522817a;
        if (aVar == null) {
            return;
        }
        if (z17) {
            bm5.o1 o1Var = bm5.o1.f104252a;
            bm5.h0 h0Var = bm5.h0.RepairerConfig_VOIP_RingBackAudio_Int;
            boolean z18 = false;
            if (o1Var.g(h0Var, 0) != 0 && o1Var.g(h0Var, 0) == 1) {
                z18 = true;
            }
            if (z18) {
                str = "A2";
            } else {
                str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingBackAudioFlag");
                if (str == null) {
                    str = "A0";
                }
            }
        } else {
            str = "";
        }
        aVar.f316014r = str;
    }

    public final java.lang.String n() {
        cl0.g gVar = new cl0.g();
        dk4.a aVar = this.f522817a;
        gVar.h("mInfo", aVar != null ? D.b(aVar) : "{}");
        gVar.p("mStartTime", this.f522818b);
        gVar.p("mEndTime", this.f522819c);
        gVar.h("mHashCode", this.f522821e);
        gVar.p("mDuration", this.f522823g);
        gVar.h("mShortSongName", this.f522825i);
        gVar.h("mSongName", this.f522824h);
        gVar.h("mSingerName", this.f522826j);
        gVar.h("cover", this.f522827k);
        gVar.h(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e, this.f522828l);
        gVar.o("ringtoneSource", this.f522829m.ordinal());
        gVar.p("finderObjectId", this.f522831o);
        gVar.h("finderNonceId", this.f522832p);
        gVar.o("musicSid", this.f522833q);
        gVar.r("unAvailable", this.f522830n);
        gVar.h("finderAuthorHeadUrl", this.f522836t);
        gVar.h("finderAuthIconUrl", this.f522837u);
        gVar.h("finderAuthProfession", this.f522838v);
        gVar.o("finderAuthProfessionType", this.f522839w);
        gVar.o("authProfessionType", this.f522840x);
        t45.e1 e1Var = this.f522834r;
        gVar.h("mVibrateInfo", e1Var != null ? e1Var.f497081d : null);
        gVar.p("createTime", this.f522835s);
        gVar.h("singerFinderUserName", this.A);
        gVar.h("singerBaikeURL", this.B);
        gVar.h("finderUserName", this.f522842z);
        gVar.r("hasBgm", this.f522841y);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return gVar2;
    }

    public i(dk4.a info, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f522824h = "";
        this.f522825i = "";
        this.f522826j = "";
        this.f522827k = "";
        this.f522828l = "";
        this.f522829m = vx3.g.f522812f;
        this.f522832p = "";
        this.f522836t = "";
        this.f522837u = "";
        this.f522838v = "";
        this.f522842z = "";
        this.A = "";
        this.B = "";
        this.f522817a = info;
        this.f522818b = j17;
        this.f522819c = j18;
    }
}
