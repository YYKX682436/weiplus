package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* loaded from: classes14.dex */
public class e extends com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b {
    public android.graphics.Bitmap A;
    public android.graphics.Bitmap B;
    public android.graphics.Bitmap C;
    public android.graphics.Bitmap D;
    public final java.lang.Runnable E;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d F;
    public final p012xc85e97e9.p093xedfae76a.k0 G;
    public final p012xc85e97e9.p093xedfae76a.k0 H;
    public boolean I;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a f258666h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a f258667i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f258668m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f258669n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f258670o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f258671p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f258672q;

    /* renamed from: r, reason: collision with root package name */
    public int f258673r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f258674s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f258675t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f258676u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f258677v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f258678w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f258679x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f258680y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f258681z;

    public e(android.content.Context context) {
        super(context, null);
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4);
        this.f258673r = -1;
        this.f258674s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f258679x = false;
        this.f258680y = false;
        this.f258681z = false;
        this.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.f(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18934xa6658e7f c18934xa6658e7f = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.C18934xa6658e7f(this, com.p314xaae8f345.mm.app.a0.f134821d);
        this.F = c18934xa6658e7f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.h(this);
        this.G = hVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.i iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.i(this);
        this.H = iVar;
        this.I = false;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d4v, this);
        this.f258675t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_q);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.p7z);
        this.f258676u = relativeLayout;
        relativeLayout.setVisibility(4);
        this.f258677v = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p7x);
        this.f258678w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p7y);
        this.f258666h = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a) findViewById(com.p314xaae8f345.mm.R.id.khr);
        this.f258675t = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_q);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a) findViewById(com.p314xaae8f345.mm.R.id.khq);
        this.f258667i = c18930xb402610a;
        c18930xb402610a.setClipToOutline(true);
        c18930xb402610a.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.f1(b17));
        this.f258668m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) findViewById(com.p314xaae8f345.mm.R.id.imt);
        this.f258669n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) findViewById(com.p314xaae8f345.mm.R.id.lxd);
        this.f258670o = findViewById(com.p314xaae8f345.mm.R.id.lxc);
        this.f258671p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) findViewById(com.p314xaae8f345.mm.R.id.lxe);
        this.f258672q = false;
        c18934xa6658e7f.mo48813x58998cd();
        if (gq4.v.Bi() != null && gq4.v.Bi().f258092b != null) {
            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.widget.e$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e.this;
                    eVar.getClass();
                    gq4.a aVar = gq4.v.Bi().f258092b;
                    java.lang.String r17 = c01.z1.r();
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                    android.graphics.Bitmap mo560xd586ddb5 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().mo560xd586ddb5(r17);
                    eVar.A = mo560xd586ddb5;
                    if (mo560xd586ddb5 == null) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                        eVar.A = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().uc();
                    }
                    if (aVar != null) {
                        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.d0) aVar).f257916p;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                        eVar.B = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().mo560xd586ddb5(str);
                    }
                    if (eVar.B == null) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
                        eVar.B = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().uc();
                    }
                    android.graphics.Bitmap bitmap = eVar.A;
                    if (bitmap != null) {
                        eVar.C = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(bitmap, 30);
                    }
                    android.graphics.Bitmap bitmap2 = eVar.B;
                    if (bitmap2 != null) {
                        eVar.D = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(bitmap2, 30);
                    }
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.widget.e$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e.this.m();
                        }
                    });
                }
            });
            boolean z17 = gq4.v.wi().f447509j;
            if (this.f258673r == -1 || z17 != this.f258680y) {
                this.f258680y = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "showLocalCaptureState: " + z17);
                n();
            }
            i(gq4.v.Bi().w());
        }
        gq4.v.wi().f447501b.mo7807xc74540ab(hVar);
        gq4.v.wi().f447506g.mo7807xc74540ab(iVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void c(boolean z17) {
        if (!z17) {
            super.c(false);
            return;
        }
        android.widget.TextView textView = this.f258675t;
        textView.setVisibility(0);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kcl);
        setContentDescription(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jps));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public boolean d() {
        super.d();
        this.f258675t.setVisibility(8);
        this.f258676u.setVisibility(0);
        this.f258677v.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79654xc8f97a92, android.graphics.Color.parseColor("#FFFFFF")));
        android.widget.TextView textView = this.f258678w;
        textView.setVisibility(0);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc_);
        textView.requestLayout();
        setContentDescription("");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void e(int i17) {
        qq4.b wi6 = gq4.v.wi();
        if (i17 > 0) {
            wi6.f447507h = i17;
        } else {
            wi6.getClass();
        }
        o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void f() {
        this.f258675t.setVisibility(8);
        this.f258676u.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void g() {
        this.f258675t.setVisibility(8);
        this.f258676u.setVisibility(0);
        this.f258677v.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79533x4d32081d, android.graphics.Color.parseColor("#FFFFFF")));
        android.widget.TextView textView = this.f258678w;
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kdc);
        textView.requestLayout();
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void h(int i17, int i18) {
        int i19 = this.f258673r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f258667i;
        if (i19 == 2 || i19 == 0 || i19 == 256 || this.f258679x) {
            c18930xb402610a.a(false);
        } else {
            this.f258672q = true;
            m();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "onRemoteReady");
            n();
            o();
            c18930xb402610a.b();
            this.f258666h.a(false);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void i(boolean z17) {
        if (this.f258673r == -1 || z17 != this.f258681z) {
            this.f258681z = z17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "showRemoteCaptureState: " + z17);
            n();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void j() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get()).g(this.f258667i);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get()).g(this.f258666h);
        this.f258621d = null;
        this.F.mo48814x2efc64();
        setVisibility(4);
        gq4.v.wi().f447501b.mo522xb5bdeb7a(this.G);
        gq4.v.wi().f447506g.mo522xb5bdeb7a(this.H);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void k(java.lang.String str) {
        android.widget.TextView textView = this.f258675t;
        textView.setTextSize(1, 12.0f);
        textView.setText(str);
        setContentDescription(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpu));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    public void l(java.lang.String str) {
        setContentDescription(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jpt));
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshAvatar: " + this.f258672q);
        this.f258668m.setImageBitmap(this.A);
        this.f258671p.setImageBitmap(this.f258672q ? this.B : this.A);
        this.f258669n.setImageBitmap(this.f258672q ? this.D : this.C);
    }

    public final void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus, mIsRemoteReady:" + this.f258672q + ", isLocalPause:" + this.f258680y + ", isRemotePause::" + this.f258681z);
        boolean z17 = this.f258672q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f258671p;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f258667i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a2 = this.f258666h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d2 = this.f258668m;
        if (z17) {
            c22628xfde5d61d2.setVisibility(this.f258680y ? 0 : 8);
            c18930xb402610a.setVisibility(this.f258680y ? 8 : 0);
            c22628xfde5d61d.setVisibility(this.f258681z ? 0 : 8);
            android.view.View view = this.f258670o;
            int i17 = this.f258681z ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18930xb402610a2.setVisibility(this.f258681z ? 8 : 0);
            return;
        }
        c22628xfde5d61d2.setVisibility(8);
        c18930xb402610a2.setVisibility(8);
        c18930xb402610a.setVisibility(this.f258680y ? 8 : 0);
        c22628xfde5d61d.setVisibility(!this.f258680y ? 8 : 0);
        android.view.View view2 = this.f258670o;
        int i18 = this.f258680y ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r8 != 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if ((r10 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshFloatBallSize:" + r11.f258673r + ", " + r0 + ", " + r7 + ", " + r10);
        r0 = iq4.b.f375331a;
        r0.h0(4, false, r2);
        r0.g();
        r0 = (float) ((-(r7 + r10)) * 90);
        r4.setRotation(r0);
        r3.setRotation(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        if ((((((vq4.b0.f520806d && vq4.b0.f520807e) && gq4.v.wi().f447505f) ? 0 : r7 + r10) + r0) % 2) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.e.o():void");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o();
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if (this.f258623f == null) {
            this.I = true;
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.NewVideoTalkingSmallView", "view added");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f258667i;
        gVar.h(c18930xb402610a, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get();
        int i17 = this.f258673r;
        gVar2.j(false, (260 == i17 || 6 == i17) ? false : true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a2 = this.f258666h;
        gVar3.h(c18930xb402610a2, 1);
        c18930xb402610a2.getClass();
        c18930xb402610a.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: setConnectSec */
    public void mo72913xee293109(long j17) {
        super.mo72913xee293109(j17);
        if (j17 != -1) {
            this.f258674s.mo50293x3498a0(this.E);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: setStatus */
    public void mo72916x231a26f4(int i17) {
        this.f258673r = i17;
        if (i17 == 2 || i17 == 256 || i17 == 0) {
            this.f258679x = true;
            this.f258666h.a(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f258667i;
            c18930xb402610a.setVisibility(0);
            c18930xb402610a.a(false);
            this.f258675t.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: setVoicePlayDevice */
    public void mo72882xbbf730ba(int i17) {
        if (this.f258622e != i17) {
            android.widget.TextView textView = this.f258675t;
            textView.setVisibility(8);
            this.f258622e = i17;
            this.f258676u.setVisibility(0);
            android.widget.ImageView imageView = this.f258677v;
            android.widget.TextView textView2 = this.f258678w;
            if (i17 == 1) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79947x15bb39c8, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc9);
            } else if (i17 == 2) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79714x614cd13e, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc7);
            } else if (i17 == 3) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79762x4abb86a, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc8);
            } else if (i17 == 4) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79650x9f0fe96, android.graphics.Color.parseColor("#FFFFFF")));
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kc6);
            }
            textView.setVisibility(8);
            textView2.requestLayout();
            super.mo72882xbbf730ba(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44.AbstractC18931xc27fcc5b
    /* renamed from: setVoipUIListener */
    public void mo72918x41815e0a(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar) {
        super.mo72918x41815e0a(gVar);
        if (this.I) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f258667i;
            gVar2.h(c18930xb402610a, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get();
            int i17 = this.f258673r;
            gVar3.j(false, (260 == i17 || 6 == i17) ? false : true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g gVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.g) this.f258623f.get();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a2 = this.f258666h;
            gVar4.h(c18930xb402610a2, 1);
            this.I = false;
            c18930xb402610a2.getClass();
            c18930xb402610a.getClass();
        }
    }
}
