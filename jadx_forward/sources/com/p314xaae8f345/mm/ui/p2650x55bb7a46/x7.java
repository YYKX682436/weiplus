package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public final class x7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd f287767d;

    public x7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd) {
        this.f287767d = activityC21618x43234cfd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd activityC21618x43234cfd = this.f287767d;
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = activityC21618x43234cfd.A1;
        if (c10597xb1f0d2 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148125m, activityC21618x43234cfd.H1);
        java.lang.String str = activityC21618x43234cfd.J1;
        if (b17) {
            java.lang.String str2 = activityC21618x43234cfd.f279756d;
            try {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21618x43234cfd.b7(activityC21618x43234cfd, activityC21618x43234cfd.K1, null, null, null, 8, null);
                activityC21618x43234cfd.Y6(3);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5367x8049fccc c5367x8049fccc = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5367x8049fccc();
                am.x6 x6Var = c5367x8049fccc.f135696g;
                x6Var.f89884a = c10597xb1f0d2.f148119d;
                x6Var.f89885b = c10597xb1f0d2.f148120e;
                x6Var.f89887d = activityC21618x43234cfd.f279767p0;
                x6Var.f89886c = c10597xb1f0d2.f148123h;
                x6Var.f89891h = c10597xb1f0d2.f148127o;
                x6Var.f89892i = c10597xb1f0d2.f148128p;
                boolean z17 = activityC21618x43234cfd.M;
                if (z17) {
                    x6Var.f89889f = activityC21618x43234cfd.P;
                    x6Var.f89890g = z17;
                } else {
                    x6Var.f89888e = activityC21618x43234cfd.T;
                    x6Var.f89893j = activityC21618x43234cfd.f279780y0;
                    x6Var.f89894k = activityC21618x43234cfd.f279762l1;
                }
                c5367x8049fccc.e();
                if (!c5367x8049fccc.f135697h.f89970a) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597 c5368x6276f597 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597();
                    c5368x6276f597.f135698g.f90052a = str;
                    c5368x6276f597.e();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, " e.result.isSuccess is false, send fail!");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597 c5368x6276f5972 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5368x6276f597();
                c5368x6276f5972.f135698g.f90052a = str;
                c5368x6276f5972.e();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "send to device item click exception %s", e17);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148125m, str) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148125m, activityC21618x43234cfd.L1) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148125m, activityC21618x43234cfd.I1) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c10597xb1f0d2.f148125m, activityC21618x43234cfd.M1)) {
            if (activityC21618x43234cfd.f279768p1 == null && activityC21618x43234cfd.f279777x0 != null) {
                l81.b1 b1Var = new l81.b1();
                r45.xf4 xf4Var = activityC21618x43234cfd.f279777x0;
                b1Var.f398547b = xf4Var != null ? xf4Var.f471583e : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xf4Var);
                b1Var.f398555f = xf4Var.f471584f;
                r45.xf4 xf4Var2 = activityC21618x43234cfd.f279777x0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xf4Var2);
                b1Var.f398551d = xf4Var2.f471585g;
                r45.xf4 xf4Var3 = activityC21618x43234cfd.f279777x0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xf4Var3);
                b1Var.f398549c = xf4Var3.f471585g;
                try {
                    r45.xf4 xf4Var4 = activityC21618x43234cfd.f279777x0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xf4Var4);
                    b1Var.f398561i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.w7(new org.json.JSONObject(xf4Var4.f471582d));
                } catch (org.json.JSONException unused) {
                }
                l81.p0 p0Var = b1Var.f398561i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p0Var);
                p0Var.a();
                b1Var.f398565k = 1226;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(activityC21618x43234cfd.mo55332x76847179(), b1Var);
            }
            activityC21618x43234cfd.finish();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$confirmListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
