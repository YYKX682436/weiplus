package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 {

    /* renamed from: q, reason: collision with root package name */
    public jb4.v f250939q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p f250940r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 f250941s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f250942t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f250943u = true;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f250944v = null;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f250945w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: x, reason: collision with root package name */
    public int f250946x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final jb4.u f250947y = new ed4.s(this);

    /* renamed from: z, reason: collision with root package name */
    public final jb4.c0 f250948z = new ed4.v(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public void h(android.view.ViewStub viewStub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildContent", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0) baseViewHolder;
            this.f250941s = p0Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent, holder=" + baseViewHolder.hashCode());
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.cu9);
                if (!baseViewHolder.f250823q) {
                    p0Var.F0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.r(baseViewHolder).inflate();
                    baseViewHolder.f250823q = true;
                }
            } else if (!baseViewHolder.f250823q) {
                p0Var.F0 = baseViewHolder.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f81555new);
                baseViewHolder.f250823q = true;
            }
            p0Var.D0 = p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.ofu);
            p0Var.E0 = p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.aug);
            p0Var.H0 = (android.widget.TextView) p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.ofw);
            p0Var.I0 = (android.widget.TextView) p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.ofv);
            p0Var.J0 = (android.widget.TextView) p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.aui);
            p0Var.K0 = (android.widget.TextView) p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.auh);
            p0Var.G0 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.C17931xd3691933) p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.nex);
            p0Var.L0 = p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.aut);
            p0Var.M0 = (android.widget.ImageView) p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.f567394jc5);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) p0Var.f250805h.findViewById(com.p314xaae8f345.mm.R.id.lbi);
            p0Var.N0 = c22626x3e1b8dda;
            c22626x3e1b8dda.m81380xca027da2(50);
            float I = ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_q);
            float I2 = ca4.m0.I(com.p314xaae8f345.mm.R.C30860x5b28f31.a_l);
            int i17 = 0;
            p0Var.H0.setTextSize(0, I);
            p0Var.I0.setTextSize(0, I2);
            p0Var.J0.setTextSize(0, I);
            p0Var.K0.setTextSize(0, I2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent, disable touch and sensor");
            p0Var.G0.m70292xd5adfc84(false);
            p0Var.G0.m70291xc4a52ce5(false);
            p0Var.G0.i(1.8f, 30.0f, -2.0f);
            p0Var.G0.m70293x94523662(0.45f);
            p0Var.G0.m70289x2eac842c(this.f250948z);
            p0Var.G0.m70290x75222b5f(true);
            jb4.v vVar = new jb4.v();
            this.f250939q = vVar;
            jb4.u uVar = this.f250947y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            vVar.f380385a = uVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar = this.f250940r;
            if (pVar != null) {
                i17 = pVar.f247627f;
            }
            this.f250945w.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.n0(this, i17, p0Var), i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "viewHash=" + p0Var.G0.hashCode() + ", touchDelay=" + i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildContent", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x019f A[Catch: all -> 0x04dc, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f0 A[Catch: all -> 0x04dc, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0446 A[Catch: all -> 0x04dc, TRY_ENTER, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x047a A[Catch: all -> 0x04dc, TryCatch #0 {all -> 0x04dc, blocks: (B:23:0x0094, B:25:0x0171, B:27:0x0180, B:30:0x019f, B:31:0x01e8, B:33:0x01f0, B:35:0x021d, B:37:0x0266, B:39:0x026e, B:40:0x0289, B:42:0x0291, B:44:0x038c, B:46:0x0396, B:47:0x043f, B:50:0x0446, B:51:0x0460, B:53:0x047a, B:54:0x0485, B:56:0x0489, B:59:0x04be, B:60:0x04c7, B:64:0x0493, B:65:0x0225, B:68:0x02b1, B:70:0x02e1, B:72:0x0344, B:74:0x034c, B:75:0x0367, B:77:0x036f, B:78:0x02e9, B:80:0x0192, B:82:0x04c1), top: B:22:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ae  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r34, int r35, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns r36, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r37, int r38, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r39) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5
    public java.lang.String u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        return "SphereCardAdTimeLineItem";
    }
}
