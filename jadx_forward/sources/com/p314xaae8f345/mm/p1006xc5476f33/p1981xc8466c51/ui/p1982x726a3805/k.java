package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ et3.b f237058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f237059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f237060f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m f237061g;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar, et3.b bVar, android.widget.ImageView imageView, android.widget.ProgressBar progressBar) {
        this.f237061g = mVar;
        this.f237058d = bVar;
        this.f237059e = imageView;
        this.f237060f = progressBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap b17;
        android.graphics.Bitmap a17;
        final android.graphics.Bitmap bitmap;
        et3.a aVar = (et3.a) this.f237058d;
        int i17 = aVar.f338127e;
        int i18 = (i17 != 0 ? !(i17 == 1 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f338123a.f456967s)) : !bt3.g2.k(aVar.f338123a, aVar.f338133k, aVar.f338125c)) ? -1 : com.p314xaae8f345.mm.R.raw.f80953x70a0a111;
        if (i18 == -1) {
            i18 = com.p314xaae8f345.mm.R.raw.f79106xd105c448;
        }
        final int i19 = i18;
        et3.a aVar2 = (et3.a) this.f237058d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar = this.f237061g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var = mVar.f237070a;
        int i27 = mVar.f237071b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d0 d0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d0();
        r45.gp0 gp0Var = aVar2.f338123a;
        d0Var.f236900a = gp0Var;
        d0Var.f236904e = false;
        d0Var.f236903d = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e0();
        e0Var.f236913a = gp0Var;
        int i28 = aVar2.f338127e;
        if (i28 == 0) {
            if (!bt3.g2.k(gp0Var, aVar2.f338133k, aVar2.f338125c)) {
                d0Var.f236901b = aVar2.f338125c;
                d0Var.f236902c = aVar2.f338133k;
                b17 = f0Var.b(d0Var);
                aVar2.f338122l = true;
                if (b17 == null) {
                    e0Var.f236914b = aVar2.f338125c;
                    e0Var.f236915c = aVar2.f338133k;
                    a17 = f0Var.a(e0Var);
                    aVar2.f338122l = false;
                    bitmap = a17;
                }
                bitmap = b17;
            }
            bitmap = null;
        } else {
            if (i28 == 1) {
                d0Var.f236901b = aVar2.f338124b.f67645x88be67a1;
                b17 = f0Var.b(d0Var);
                aVar2.f338122l = true;
                if (b17 == null) {
                    e0Var.f236914b = aVar2.f338124b.f67645x88be67a1;
                    a17 = f0Var.a(e0Var);
                    aVar2.f338122l = false;
                    bitmap = a17;
                }
                bitmap = b17;
            }
            bitmap = null;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        final android.widget.ImageView imageView = this.f237059e;
        final android.widget.ProgressBar progressBar = this.f237060f;
        final et3.b bVar = this.f237058d;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.record.ui.viewWrappers.k$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.widget.ImageView imageView2 = imageView;
                android.widget.ProgressBar progressBar2 = progressBar;
                android.graphics.Bitmap bitmap2 = bitmap;
                int i29 = i19;
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.k.this.f237061g;
                et3.b bVar2 = bVar;
                mVar2.d(imageView2, progressBar2, bitmap2, ((et3.a) bVar2).f338122l, i29, bVar2.f338123a.T);
            }
        });
    }

    /* renamed from: toString */
    public java.lang.String m67879x9616526c() {
        return super.toString() + "|fillView";
    }
}
