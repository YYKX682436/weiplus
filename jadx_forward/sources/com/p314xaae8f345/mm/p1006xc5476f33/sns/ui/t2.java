package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class t2 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7 {
    public m21.h K;
    public java.lang.String L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.L = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(abstractActivityC21394xb3d2c0cf).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crj, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n8c);
        m21.h hVar = this.K;
        if (hVar != null && hVar.b() != null) {
            int[] c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(abstractActivityC21394xb3d2c0cf);
            java.lang.Object obj = m21.y.k(c17[0], c17[1], abstractActivityC21394xb3d2c0cf, false).first;
            java.lang.Integer num = (java.lang.Integer) obj;
            int floatValue = (int) ((((java.lang.Number) obj).floatValue() * 3.5f) / 3.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(num.intValue(), floatValue));
            inflate.requestLayout();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.r2(imageView, this.L).d("");
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s2(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        java.util.Map d17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        super.i(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("sns_kemdia_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.L = stringExtra;
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("ksnsupload_finder_live_xml");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(stringExtra2, "finderLive", null)) != null) {
            m21.h hVar = new m21.h();
            hVar.d("", d17);
            this.K = hVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p7
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y7 y7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        m21.h hVar = this.K;
        if (hVar != null && y7Var != null) {
            y7Var.L(hVar);
        }
        super.t(y7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepareCommitPack", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
    }
}
