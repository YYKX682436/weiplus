package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.z f177869d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.z zVar) {
        this.f177869d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13135x13db66fd activityC13135x13db66fd = this.f177869d.f177871a;
        if (!activityC13135x13db66fd.G) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) ((android.view.ViewStub) activityC13135x13db66fd.findViewById(com.p314xaae8f345.mm.R.id.lg9)).inflate();
            activityC13135x13db66fd.f177775u = scrollView;
            android.widget.TextView textView = (android.widget.TextView) scrollView.findViewById(com.p314xaae8f345.mm.R.id.lge);
            java.lang.String I = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.I(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.x(activityC13135x13db66fd.I), 10);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = activityC13135x13db66fd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hp9, I);
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13135x13db66fd, string, textSize));
            activityC13135x13db66fd.G = true;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) activityC13135x13db66fd.f177775u.findViewById(com.p314xaae8f345.mm.R.id.lgb);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) activityC13135x13db66fd.f177775u.findViewById(com.p314xaae8f345.mm.R.id.lgu);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13135x13db66fd.B)) {
            android.widget.TextView textView2 = (android.widget.TextView) activityC13135x13db66fd.f177775u.findViewById(com.p314xaae8f345.mm.R.id.lgd);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string2 = activityC13135x13db66fd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hpj, activityC13135x13db66fd.B);
            float textSize2 = activityC13135x13db66fd.f177771q.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC13135x13db66fd, string2, textSize2));
        }
        activityC13135x13db66fd.f177775u.setVisibility(4);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.r(activityC13135x13db66fd, viewGroup, imageView), 250L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14721, 1, 5);
    }
}
