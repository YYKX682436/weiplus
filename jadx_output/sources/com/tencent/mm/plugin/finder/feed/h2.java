package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class h2 extends com.tencent.mm.plugin.finder.feed.s1 {

    /* renamed from: m, reason: collision with root package name */
    public int f106878m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f106879n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.r03 f106880o;

    /* renamed from: p, reason: collision with root package name */
    public long f106881p;

    /* renamed from: q, reason: collision with root package name */
    public int f106882q;

    /* renamed from: r, reason: collision with root package name */
    public androidx.fragment.app.Fragment f106883r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f106884s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f106885t;

    /* renamed from: u, reason: collision with root package name */
    public int f106886u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f106887v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f106888w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ProgressBar f106889x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f106890y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h2(com.tencent.mm.ui.MMActivity r12, int r13, int r14, boolean r15, boolean r16, com.tencent.mm.plugin.finder.feed.t1 r17, int r18, kotlin.jvm.internal.i r19) {
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
            kotlin.jvm.internal.o.g(r12, r0)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = ""
            r8.f106879n = r0
            pf5.z r0 = pf5.z.f353948a
            pf5.v r0 = r0.a(r12)
            java.lang.Class<com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC> r1 = com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC r0 = (com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC) r0
            r45.r03 r0 = r0.f101829y
            r8.f106880o = r0
            r0 = 1
            r8.f106882q = r0
            r8.f106885t = r0
            com.tencent.mm.plugin.finder.feed.d2 r0 = new com.tencent.mm.plugin.finder.feed.d2
            r0.<init>(r12)
            jz5.h.b(r0)
            com.tencent.mm.plugin.finder.storage.pj0 r0 = new com.tencent.mm.plugin.finder.storage.pj0
            r0.<init>(r10)
            r8.f106890y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.h2.<init>(com.tencent.mm.ui.MMActivity, int, int, boolean, boolean, com.tencent.mm.plugin.finder.feed.t1, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.s1
    public android.view.View a() {
        return this.f106878m == 7 ? this.f106884s : this.f108960d.findViewById(com.tencent.mm.R.id.f484229dg3);
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f108960d;
    }

    public final void l(org.json.JSONObject jSONObject) {
        java.lang.String stringExtra = this.f108960d.getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        jSONObject.put("topicid", pm0.v.u(this.f106881p));
        jSONObject.put("topictag", stringExtra);
        jSONObject.put("topictab", this.f106882q);
    }

    public final void o(java.lang.String coverUrl) {
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        if (com.tencent.mm.sdk.platformtools.t8.K0(coverUrl)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f108963g.findViewById(com.tencent.mm.R.id.ili);
        com.tencent.mm.ui.MMActivity mMActivity = this.f108960d;
        if (textView != null) {
            textView.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        }
        android.view.View findViewById = this.f108963g.findViewById(com.tencent.mm.R.id.i0a);
        if (findViewById != null) {
            findViewById.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        }
        android.view.View findViewById2 = this.f108963g.findViewById(com.tencent.mm.R.id.m3v);
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_1));
        }
        android.view.View findViewById3 = this.f108963g.findViewById(com.tencent.mm.R.id.bdv);
        if (findViewById3 != null) {
            findViewById3.setBackgroundResource(com.tencent.mm.R.drawable.f481638ys);
        }
        android.widget.TextView textView2 = (android.widget.TextView) this.f108963g.findViewById(com.tencent.mm.R.id.dft);
        if (textView2 != null) {
            textView2.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f479254u6));
        }
        android.widget.TextView textView3 = (android.widget.TextView) this.f108963g.findViewById(com.tencent.mm.R.id.m2g);
        if (textView3 != null) {
            textView3.setTextColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f479254u6));
        }
    }
}
