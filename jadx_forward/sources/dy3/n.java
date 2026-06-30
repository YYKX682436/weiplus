package dy3;

/* loaded from: classes.dex */
public final class n extends hg5.d implements tj5.n {
    public static final /* synthetic */ int C = 0;
    public java.lang.String A;
    public final jz5.g B;

    /* renamed from: r, reason: collision with root package name */
    public final dy3.a f326119r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f326120s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f326121t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 f326122u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f326123v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f326124w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f326125x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f326126y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f326127z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, dy3.a callback) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f326119r = callback;
        this.f326123v = jz5.h.b(dy3.e.f326110d);
        this.f326124w = jz5.h.b(new dy3.m(this));
        this.f326125x = jz5.h.b(new dy3.j(this));
        this.f326126y = jz5.h.b(new dy3.d(this));
        this.f326127z = jz5.h.b(new dy3.i(context));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785 c6205xeec13785 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6205xeec13785();
        c6205xeec13785.f136457g.f87952a = 0L;
        c6205xeec13785.e();
        this.A = "";
        this.B = jz5.h.b(new dy3.l(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // tj5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C3(java.lang.String r1, java.lang.String r2, java.util.List r3, tj5.o r4) {
        /*
            r0 = this;
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            boolean r4 = r26.n0.N(r1)
            r4 = r4 ^ r2
            if (r4 == 0) goto Lc
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 == 0) goto L23
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r4 = r0.K()
            r4.D(r1)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f326122u
            if (r1 != 0) goto L1b
            goto L20
        L1b:
            r4 = 8
            r1.setVisibility(r4)
        L20:
            jz5.f0 r1 = jz5.f0.f384359a
            goto L24
        L23:
            r1 = r3
        L24:
            if (r1 != 0) goto L46
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r1 = r0.K()
            ym3.b r4 = r1.A
            r4.e()
            kotlinx.coroutines.r2 r1 = r1.B
            if (r1 == 0) goto L36
            p3325xe03a0797.p3326xc267989b.p2.a(r1, r3, r2, r3)
        L36:
            com.tencent.mm.plugin.ringtone.widget.at.RingtoneAtSomeoneLiveList r1 = r0.K()
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(r1, r3, r2, r3)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f326122u
            if (r1 != 0) goto L42
            goto L46
        L42:
            r2 = 0
            r1.setVisibility(r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dy3.n.C3(java.lang.String, java.lang.String, java.util.List, tj5.o):void");
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cgs, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f362936i;
        if (view != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null) {
            findViewById.setOnClickListener(new dy3.f(this));
        }
        android.view.View view2 = this.f362936i;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = view2 != null ? (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) view2.findViewById(com.p314xaae8f345.mm.R.id.gfl) : null;
        this.f326120s = c22479x68a26381;
        if (c22479x68a26381 != null) {
            c22479x68a26381.g();
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263812 = this.f326120s;
        if (c22479x68a263812 != null) {
            c22479x68a263812.m80988xce28f7ee(this);
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263813 = this.f326120s;
        if (c22479x68a263813 != null) {
            c22479x68a263813.m80989x764b0e09(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263814 = this.f326120s;
        if (c22479x68a263814 != null) {
            c22479x68a263814.f291349g.setTextSize(1, 17.0f);
        }
        android.view.View view3 = this.f362936i;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = view3 != null ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view3.findViewById(com.p314xaae8f345.mm.R.id.f565154bh0) : null;
        this.f326121t = c22849x81a93d25;
        jz5.g gVar = this.f326126y;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f326121t;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) this.f326127z).mo141623x754a37bb());
        }
        ((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb()).B = (dy3.k) ((jz5.n) this.B).mo141623x754a37bb();
        android.view.View view4 = this.f362936i;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3 = view4 != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3) view4.findViewById(com.p314xaae8f345.mm.R.id.f564479sj) : null;
        this.f326122u = c21465x84498b3;
        if (c21465x84498b3 != null) {
            c21465x84498b3.m79298x40d747ee(new dy3.g(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b32 = this.f326122u;
        if (c21465x84498b32 != null) {
            c21465x84498b32.m78861xe90b84f5(new java.lang.String[]{"🔍", "#"});
        }
        K().f233604u.mo7806x9d92d11c(this, new dy3.h(this));
    }

    @Override // tj5.n
    public boolean G0() {
        return true;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.at.C17247x7df03267 K() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44.at.C17247x7df03267) ((jz5.n) this.f326125x).mo141623x754a37bb();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
    }
}
