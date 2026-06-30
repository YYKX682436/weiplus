package e72;

/* loaded from: classes14.dex */
public class v implements e72.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331461a;

    /* renamed from: b, reason: collision with root package name */
    public final int f331462b;

    /* renamed from: c, reason: collision with root package name */
    public final e72.e f331463c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f331464d;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.animation.Animation f331473m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.animation.Animation f331474n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.animation.AnimationSet f331475o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.animation.Animation f331476p;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f331484x;

    /* renamed from: e, reason: collision with root package name */
    public int f331465e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f331466f = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f331467g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13530x39aaabeb f331468h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f331469i = false;

    /* renamed from: j, reason: collision with root package name */
    public long f331470j = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f331471k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f331472l = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f331477q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public boolean f331478r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f331479s = false;

    /* renamed from: t, reason: collision with root package name */
    public e72.f f331480t = null;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f331481u = new e72.l(this, android.os.Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public final android.os.CountDownTimer f331482v = new e72.m(this, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 1000);

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f331483w = new e72.n(this);

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e72.v.<init>(java.lang.String):void");
    }

    public static void j(e72.v vVar) {
        vVar.f331466f = 0;
        synchronized (vVar.f331477q) {
            vVar.f331472l = false;
        }
        vVar.o();
        if (vVar.f331465e == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: triggered start record");
            e72.e eVar = vVar.f331463c;
            e72.r rVar = new e72.r(vVar);
            eVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "start record");
            s75.d.c(new e72.c(eVar, rVar, null), "FaceVoice_record", 10);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE.f181576d.f181577i.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new e72.s(vVar), 2000L);
    }

    @Override // e72.h
    public e72.g a() {
        return new e72.g(90004, "user cancelled in processing");
    }

    @Override // e72.h
    public void b(java.lang.String str) {
        ((android.widget.TextView) this.f331484x.findViewById(com.p314xaae8f345.mm.R.id.h0f)).setText(str);
    }

    @Override // e72.h
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8 c13513x253b41f8) {
        this.f331471k = true;
        return this.f331479s;
    }

    @Override // e72.h
    public e72.f d() {
        return this.f331480t;
    }

    @Override // e72.h
    public void e(android.content.Context context, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aad, viewGroup2);
        this.f331467g = inflate;
        this.f331468h = (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13530x39aaabeb) inflate.findViewById(com.p314xaae8f345.mm.R.id.don);
        this.f331484x = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aab, viewGroup);
        m(this.f331464d.length, -1);
        android.widget.TextView l17 = l();
        android.view.animation.Animation animation = this.f331473m;
        l17.startAnimation(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13530x39aaabeb c13530x39aaabeb = this.f331468h;
        if (c13530x39aaabeb != null) {
            c13530x39aaabeb.setVisibility(0);
            this.f331468h.startAnimation(animation);
            this.f331465e = 0;
            n(false);
            this.f331466f = -1;
            o();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            this.f331470j = android.os.SystemClock.elapsedRealtime();
            this.f331478r = false;
        }
    }

    @Override // e72.h
    public boolean f(int i17, java.lang.CharSequence charSequence) {
        this.f331471k = true;
        return this.f331479s;
    }

    @Override // e72.h
    public boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8 c13513x253b41f8) {
        this.f331471k = false;
        return this.f331479s;
    }

    @Override // e72.h
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e[] c13529xca5dc69eArr;
        this.f331478r = true;
        this.f331479s = false;
        e72.e eVar = this.f331463c;
        eVar.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
        eVar.f331424a = null;
        com.p314xaae8f345.mm.vfs.w6.h(eVar.f331426c);
        if (h72.s.e().f361007h && h72.s.e().h()) {
            tl.c f17 = h72.s.e().f();
            synchronized (eVar.f331429f) {
                eVar.f331429f.remove(f17);
            }
            if (this.f331469i) {
                h72.s.e().l(null);
            } else {
                h72.s.e().d();
            }
        }
        this.f331482v.cancel();
        this.f331481u.mo50302x6b17ad39(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13530x39aaabeb c13530x39aaabeb = this.f331468h;
        if (c13530x39aaabeb != null && (c13529xca5dc69eArr = c13530x39aaabeb.f181678g) != null && c13529xca5dc69eArr.length > 0) {
            int i17 = 0;
            while (true) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13529xca5dc69e[] c13529xca5dc69eArr2 = c13530x39aaabeb.f181678g;
                if (i17 >= c13529xca5dc69eArr2.length) {
                    break;
                }
                c13529xca5dc69eArr2[i17].f181668d.e();
                i17++;
            }
        }
        if (this.f331467g != null) {
            this.f331469i = false;
            this.f331467g = null;
            this.f331468h = null;
        }
    }

    @Override // e72.h
    public boolean i() {
        return this.f331469i;
    }

    public final java.lang.String k(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7a);
        }
        if (i17 == 2) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7b);
        }
        if (i17 == 3) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7d);
        }
        if (i17 == 4) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NumberFaceMotion", "hy: unknown length!!");
        return "";
    }

    public android.widget.TextView l() {
        android.view.View view = this.f331467g;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.h0f);
        }
        return null;
    }

    public final void m(int i17, int i18) {
        java.lang.String string;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "groupIndex: %d, itemDataLength: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (l() != null) {
            if (i17 == 1) {
                l().setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7h));
                return;
            }
            android.widget.TextView l17 = l();
            if (i18 == -1) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = i17 != 2 ? k(i17) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7c);
                string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7g, objArr);
            } else {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7f, k(this.f331465e + 1));
            }
            l17.setText(string);
            if (i18 >= 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "start %d group number", java.lang.Integer.valueOf(i18 + 1));
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE.f181576d.f181577i.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
            }
        }
    }

    public final void n(boolean z17) {
        if (this.f331468h != null) {
            m(this.f331464d.length, this.f331465e);
            this.f331468h.m55285x8f3eb021(this.f331464d[this.f331465e].length());
            if (!z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new e72.q(this), 500L);
                return;
            }
            e72.p pVar = new e72.p(this);
            android.view.animation.Animation animation = this.f331473m;
            animation.setAnimationListener(pVar);
            android.view.View view = this.f331467g;
            if (view != null) {
                view.startAnimation(animation);
            }
        }
    }

    public final void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13530x39aaabeb c13530x39aaabeb = this.f331468h;
        if (c13530x39aaabeb != null) {
            int i17 = this.f331465e;
            if (i17 >= 0) {
                c13530x39aaabeb.a(this.f331464d[i17].substring(0, this.f331466f + 1));
            } else {
                c13530x39aaabeb.a(null);
            }
        }
    }
}
