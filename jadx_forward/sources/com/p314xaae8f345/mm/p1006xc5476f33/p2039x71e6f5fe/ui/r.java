package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17297x425494c0 f241151d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17297x425494c0 c17297x425494c0) {
        this.f241151d = c17297x425494c0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17297x425494c0 c17297x425494c0 = this.f241151d;
        if (c17297x425494c0.T == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.p314xaae8f345.mm.R.id.l2t) {
            int i17 = 0;
            if (c17297x425494c0.N) {
                c17297x425494c0.N = false;
                c17297x425494c0.M.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auw);
            } else {
                c17297x425494c0.N = true;
                c17297x425494c0.M.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auy);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.m0) c17297x425494c0.T;
            m0Var.getClass();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17297x425494c0.Q);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = m0Var.f241122a;
            if (K0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17297x425494c0.R)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.ProductUI", "wifiurl = null,  wapurl = null");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17297x425494c0.S)) {
                    java.lang.String str = c17297x425494c0.S;
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3.S;
                    activityC17301x38c077a3.g7(str);
                }
            } else {
                java.lang.String format = java.lang.String.format("%s_cd_%s", c17297x425494c0.Q, c17297x425494c0.f279313q);
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3.S;
                if (activityC17301x38c077a3.c7(format)) {
                    b21.m.j();
                } else if (c17297x425494c0.f279307h == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ProductUI", "onPlayBtnClick, getTitle() == null");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b1 b1Var = activityC17301x38c077a3.f240861z;
                    java.lang.String k17 = b1Var == null ? null : b1Var.k();
                    java.lang.String format2 = java.lang.String.format("%s_cd_%s", c17297x425494c0.Q, c17297x425494c0.f279313q);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) activityC17301x38c077a3.P).iterator();
                    int i27 = -1;
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17297x425494c0 c17297x425494c02 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17297x425494c0) it.next();
                        java.lang.String format3 = java.lang.String.format("%s_cd_%s", c17297x425494c02.Q, c17297x425494c02.f279313q);
                        int i28 = format2.equals(format3) ? i17 : i27;
                        arrayList2.add(b21.s.a(5, k17, c17297x425494c02.f279307h.toString(), "", c17297x425494c02.S, c17297x425494c02.R, c17297x425494c02.Q, format3, gm0.j1.u().d(), k17, "", "wx482a4001c37e2b74"));
                        i17++;
                        i27 = i28;
                    }
                    if (i27 >= 0) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new b21.l(arrayList2, i27));
                    }
                }
                activityC17301x38c077a3.e7();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
