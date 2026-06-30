package tj3;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f501315a;

    /* renamed from: b, reason: collision with root package name */
    public final tj3.i0 f501316b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16590x183309fa f501317c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16590x183309fa f501318d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f501319e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f501320f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t f501321g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f501322h;

    /* renamed from: i, reason: collision with root package name */
    public int f501323i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f501324j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f501325k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f501326l;

    public p(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t defaultMemberInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultMemberInfo, "defaultMemberInfo");
        this.f501315a = context;
        this.f501316b = new tj3.i0(context);
        this.f501317c = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16590x183309fa(context, null, 2, null);
        this.f501318d = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16590x183309fa(context, null, 2, null);
        this.f501319e = jz5.h.b(new tj3.j(this));
        this.f501320f = jz5.h.b(new tj3.n(this));
        this.f501321g = defaultMemberInfo;
        this.f501322h = jz5.h.b(new tj3.o(this));
        this.f501323i = -1;
        this.f501326l = c01.z1.r();
        e(defaultMemberInfo, true);
    }

    public final int a() {
        return d().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9) + (this.f501325k ? d().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr) : 0) + d().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561249d9) + (d().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * 2);
    }

    public final tj3.h b() {
        return (tj3.h) ((jz5.n) this.f501319e).mo141623x754a37bb();
    }

    public final android.widget.RelativeLayout c() {
        return (android.widget.RelativeLayout) ((jz5.n) this.f501320f).mo141623x754a37bb();
    }

    public final android.widget.TextView d() {
        return (android.widget.TextView) this.f501322h.mo141623x754a37bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4.f501321g.f231830b, r1) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "memberInfo"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            com.tencent.mm.plugin.multitalk.ui.t r0 = r4.f501321g
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r5, r0)
            if (r0 == 0) goto L10
            if (r6 != 0) goto L10
            return
        L10:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "update member info "
            r0.<init>(r1)
            java.lang.String r1 = r5.f231830b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.MT.MultiTalkAvatarHolder"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r0 = r4.f501317c
            r0.b(r5)
            com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout r0 = r4.f501318d
            r0.a(r5)
            tj3.i0 r0 = r4.f501316b
            if (r6 != 0) goto L50
            com.tencent.mm.plugin.multitalk.ui.t r6 = r4.f501321g
            boolean r2 = r6.f231832d
            boolean r3 = r5.f231832d
            if (r2 != r3) goto L50
            boolean r6 = r6.a()
            boolean r2 = r5.a()
            if (r6 != r2) goto L50
            com.tencent.mm.plugin.multitalk.ui.t r6 = r4.f501321g
            java.lang.String r6 = r6.f231830b
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r6, r1)
            if (r6 != 0) goto L81
        L50:
            r0.d(r5)
            android.widget.TextView r6 = r4.d()
            java.lang.Class<vg3.x3> r2 = vg3.x3.class
            lm0.a r2 = gm0.j1.s(r2)
            vg3.x3 r2 = (vg3.x3) r2
            com.tencent.mm.plugin.messenger.foundation.h2 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r2
            com.tencent.mm.storage.k4 r2 = r2.Bi()
            if (r2 == 0) goto L75
            r3 = 1
            com.tencent.mm.storage.z3 r2 = r2.n(r1, r3)
            if (r2 == 0) goto L75
            java.lang.String r2 = r2.f2()
            if (r2 == 0) goto L75
            goto L76
        L75:
            r2 = r1
        L76:
            r6.setText(r2)
            java.lang.String r6 = r4.f501326l
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r6)
            r4.f501325k = r6
        L81:
            r0.e(r5)
            r4.f501321g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tj3.p.e(com.tencent.mm.plugin.multitalk.ui.t, boolean):void");
    }
}
