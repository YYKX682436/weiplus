package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes9.dex */
public class s implements com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f237099c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f237100a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f237101b = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.r(this);

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var) {
        this.f237100a = f0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570916cd1, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) inflate.findViewById(com.p314xaae8f345.mm.R.id.h88)).mo69274xd5e29286(i65.a.b(context, 260));
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    public void b(android.view.View view, int i17, et3.b bVar, java.lang.Object obj) {
        int i18;
        view.setTag(bVar);
        view.setOnClickListener(this.f237101b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) view.findViewById(com.p314xaae8f345.mm.R.id.h88);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.nhn);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda c22626x3e1b8dda = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) view.findViewById(com.p314xaae8f345.mm.R.id.lbi);
        aVar.mo69275xa32537ab(i17);
        et3.c cVar = (et3.c) bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.f0 f0Var = this.f237100a;
        java.util.Map map = f237099c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.e0();
        r45.gp0 gp0Var = cVar.f338123a;
        e0Var.f236913a = gp0Var;
        int i19 = cVar.f338127e;
        if (i19 == 0) {
            long j17 = cVar.f338125c;
            e0Var.f236914b = j17;
            java.lang.String str = cVar.f338133k;
            e0Var.f236915c = str;
            if (bt3.g2.K(gp0Var, str, j17)) {
                imageView.setVisibility(8);
                c22626x3e1b8dda.setVisibility(8);
                java.lang.String t17 = bt3.g2.t(cVar.f338123a, cVar.f338133k, cVar.f338125c, 1);
                if (!t17.equals(aVar.mo69272x4edea88a())) {
                    aVar.mo69276xd3f79a51(f0Var.a(e0Var));
                }
                aVar.d(t17, false, 0);
                return;
            }
            zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(bt3.g2.y(cVar.f338123a.T, cVar.f338133k, cVar.f338125c, true));
            if (D0 == null || 2 == (i18 = D0.f68328x10a0fed7)) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
            } else if (3 == i18 || 4 == i18) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.brn);
            } else {
                if (i18 == 0 || 1 == i18) {
                    imageView.setVisibility(8);
                    c22626x3e1b8dda.setVisibility(0);
                    c22626x3e1b8dda.m81381x3ae760af((int) ((((float) D0.f68325x90a9378) / ((float) java.lang.Math.max(1L, D0.f68330xeb1a61d6))) * 100.0f));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) aVar;
                    c17689x58a87b4f.p();
                    c17689x58a87b4f.mo69276xd3f79a51(f0Var.a(e0Var));
                    return;
                }
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
            }
            imageView.setVisibility(0);
            c22626x3e1b8dda.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) aVar;
            c17689x58a87b4f2.p();
            c17689x58a87b4f2.mo69276xd3f79a51(f0Var.a(e0Var));
            return;
        }
        if (i19 == 1) {
            ((java.util.HashMap) map).put(gp0Var.T, view);
            e0Var.f236914b = cVar.f338124b.f67645x88be67a1;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            am.z9 z9Var = c5432x35bb364f.f135776g;
            z9Var.f90061a = 14;
            z9Var.f90066f = cVar.f338123a;
            c5432x35bb364f.e();
            boolean I0 = cVar.f338124b.I0();
            am.aa aaVar = c5432x35bb364f.f135777h;
            if (!I0 && aaVar.f87667a != 1) {
                o72.r2 r2Var = cVar.f338124b;
                if ((r2Var.f67644x3059914a == 8) || r2Var.P0()) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
                } else {
                    if (cVar.f338124b.J0()) {
                        imageView.setVisibility(8);
                        c22626x3e1b8dda.setVisibility(0);
                        c22626x3e1b8dda.a();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) aVar;
                        c17689x58a87b4f3.p();
                        c17689x58a87b4f3.mo69276xd3f79a51(f0Var.a(e0Var));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightRecordData", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                    imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
                }
            } else {
                if (aaVar.f87667a == 1) {
                    imageView.setVisibility(8);
                    c22626x3e1b8dda.setVisibility(8);
                    z9Var.f90061a = 2;
                    c5432x35bb364f.e();
                    java.lang.String str2 = aaVar.f87669c;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightRecordData", "videoPath is null!");
                        return;
                    }
                    if (!str2.equals(aVar.mo69272x4edea88a())) {
                        aVar.mo69276xd3f79a51(f0Var.a(e0Var));
                    }
                    aVar.d(str2, false, 0);
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cVar.f338123a.f456967s)) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.brn);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightRecordData", "? info is done, source file not exist, cdn data url is not null");
                    imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
                }
            }
            imageView.setVisibility(0);
            c22626x3e1b8dda.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f c17689x58a87b4f4 = (com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17689x58a87b4f) aVar;
            c17689x58a87b4f4.p();
            c17689x58a87b4f4.mo69276xd3f79a51(f0Var.a(e0Var));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    /* renamed from: destroy */
    public void mo67872x5cd39ffa() {
        this.f237100a = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g0
    /* renamed from: pause */
    public void mo67873x65825f6() {
    }
}
