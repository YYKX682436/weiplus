package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes9.dex */
public class i0 implements xw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xw1.h f177839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13136x6a993bc8 f177840b;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13136x6a993bc8 activityC13136x6a993bc8, xw1.h hVar) {
        this.f177840b = activityC13136x6a993bc8;
        this.f177839a = hVar;
    }

    @Override // xw1.b
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.lx lxVar = this.f177839a.f539208n;
        java.lang.String str2 = lxVar.f461438f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13136x6a993bc8 activityC13136x6a993bc8 = this.f177840b;
        activityC13136x6a993bc8.f177794t = str2;
        activityC13136x6a993bc8.f177795u = lxVar.f461442m;
        activityC13136x6a993bc8.f177796v = lxVar.f461446q;
        activityC13136x6a993bc8.f177797w = lxVar.f461447r;
        activityC13136x6a993bc8.f177798x = lxVar.f461440h;
        activityC13136x6a993bc8.f177799y = lxVar.f461444o;
        activityC13136x6a993bc8.f177800z = lxVar.f461445p;
        activityC13136x6a993bc8.A = lxVar.f461443n;
        activityC13136x6a993bc8.B = lxVar.f461441i;
        java.util.LinkedList linkedList = lxVar.f461439g;
        activityC13136x6a993bc8.f177781d = linkedList;
        activityC13136x6a993bc8.C = lxVar.f461448s;
        activityC13136x6a993bc8.D = lxVar.f461449t;
        activityC13136x6a993bc8.E = lxVar.f461450u;
        if (linkedList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSelectMoneyUI", "amt_list is null");
            activityC13136x6a993bc8.f177781d = new java.util.LinkedList();
        }
        activityC13136x6a993bc8.f177782e.setVisibility(0);
        activityC13136x6a993bc8.f177788n.setVisibility(0);
        activityC13136x6a993bc8.f177786i.setVisibility(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13136x6a993bc8.D)) {
            java.lang.String str3 = activityC13136x6a993bc8.f177794t;
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str3);
            if (f07 == null || ((int) f07.E2) <= 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                ((c01.k7) c01.n8.a()).b(str3, 4, new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.j0(activityC13136x6a993bc8, currentTimeMillis));
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(activityC13136x6a993bc8.f177782e, str3, 0.03f);
                activityC13136x6a993bc8.V6(str3);
            }
        } else {
            int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(activityC13136x6a993bc8, 50.0f);
            activityC13136x6a993bc8.f177782e.m75394x3288e7c1(true);
            activityC13136x6a993bc8.f177782e.b(activityC13136x6a993bc8.D, d17, d17, com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
            activityC13136x6a993bc8.V6(activityC13136x6a993bc8.f177794t);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13136x6a993bc8.f177798x)) {
            android.widget.TextView textView = activityC13136x6a993bc8.f177785h;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = activityC13136x6a993bc8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hpj, activityC13136x6a993bc8.f177798x);
            float textSize = activityC13136x6a993bc8.f177785h.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13136x6a993bc8, string, textSize));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13136x6a993bc8.B)) {
            activityC13136x6a993bc8.f177783f.setVisibility(8);
        } else {
            activityC13136x6a993bc8.f177783f.setText(activityC13136x6a993bc8.B);
        }
        activityC13136x6a993bc8.f177790p.notifyDataSetChanged();
        activityC13136x6a993bc8.f177789o.m83148xdedf72f8(activityC13136x6a993bc8.E);
    }
}
