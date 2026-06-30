package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class h2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1 {

    /* renamed from: m, reason: collision with root package name */
    public int f188411m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f188412n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.r03 f188413o;

    /* renamed from: p, reason: collision with root package name */
    public long f188414p;

    /* renamed from: q, reason: collision with root package name */
    public int f188415q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f188416r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f188417s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f188418t;

    /* renamed from: u, reason: collision with root package name */
    public int f188419u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f188420v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f188421w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ProgressBar f188422x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.vj0 f188423y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r12, int r13, int r14, boolean r15, boolean r16, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.t1 r17, int r18, p3321xbce91901.jvm.p3324x21ffc6bd.i r19) {
        /*
            r11 = this;
            r8 = r11
            r9 = r12
            r0 = r18 & 8
            r1 = 0
            if (r0 == 0) goto L9
            r4 = r1
            goto La
        L9:
            r4 = r15
        La:
            r0 = r18 & 16
            if (r0 == 0) goto L10
            r10 = r1
            goto L12
        L10:
            r10 = r16
        L12:
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = ""
            r8.f188412n = r0
            pf5.z r0 = pf5.z.f435481a
            pf5.v r0 = r0.a(r12)
            java.lang.Class<com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f) r0
            r45.r03 r0 = r0.f183362y
            r8.f188413o = r0
            r0 = 1
            r8.f188415q = r0
            r8.f188418t = r0
            com.tencent.mm.plugin.finder.feed.d2 r0 = new com.tencent.mm.plugin.finder.feed.d2
            r0.<init>(r12)
            jz5.h.b(r0)
            com.tencent.mm.plugin.finder.storage.pj0 r0 = new com.tencent.mm.plugin.finder.storage.pj0
            r0.<init>(r10)
            r8.f188423y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h2.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, boolean, com.tencent.mm.plugin.finder.feed.t1, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.s1
    public android.view.View a() {
        return this.f188411m == 7 ? this.f188417s : this.f190493d.findViewById(com.p314xaae8f345.mm.R.id.f565762dg3);
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f190493d;
    }

    public final void l(org.json.JSONObject jSONObject) {
        java.lang.String stringExtra = this.f190493d.getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        jSONObject.put("topicid", pm0.v.u(this.f188414p));
        jSONObject.put("topictag", stringExtra);
        jSONObject.put("topictab", this.f188415q);
    }

    public final void o(java.lang.String coverUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(coverUrl)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f190496g.findViewById(com.p314xaae8f345.mm.R.id.ili);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f190493d;
        if (textView != null) {
            textView.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        }
        android.view.View findViewById = this.f190496g.findViewById(com.p314xaae8f345.mm.R.id.i0a);
        if (findViewById != null) {
            findViewById.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        }
        android.view.View findViewById2 = this.f190496g.findViewById(com.p314xaae8f345.mm.R.id.m3v);
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        }
        android.view.View findViewById3 = this.f190496g.findViewById(com.p314xaae8f345.mm.R.id.bdv);
        if (findViewById3 != null) {
            findViewById3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563171ys);
        }
        android.widget.TextView textView2 = (android.widget.TextView) this.f190496g.findViewById(com.p314xaae8f345.mm.R.id.dft);
        if (textView2 != null) {
            textView2.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
        }
        android.widget.TextView textView3 = (android.widget.TextView) this.f190496g.findViewById(com.p314xaae8f345.mm.R.id.m2g);
        if (textView3 != null) {
            textView3.setTextColor(abstractActivityC21394xb3d2c0cf.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
        }
    }
}
