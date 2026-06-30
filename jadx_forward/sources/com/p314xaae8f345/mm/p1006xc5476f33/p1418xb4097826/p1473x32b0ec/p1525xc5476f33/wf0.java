package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class wf0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 f196460d;

    public wf0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var) {
        this.f196460d = ag0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean z17;
        int i17;
        int i18;
        mm2.j0 j0Var = (mm2.j0) obj;
        java.lang.Object[] objArr = j0Var != null && j0Var.f410685b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = this.f196460d;
        if (objArr == true) {
            ((mm2.c1) ag0Var.P0(mm2.c1.class)).E3.f411005e = 2;
            java.util.LinkedList m75941xfb821914 = j0Var.f410684a.m75941xfb821914(0);
            r45.nn1 nn1Var = j0Var.f410684a;
            ag0Var.M1(new mm2.i0(m75941xfb821914, nn1Var.m75945x2fec8307(1), nn1Var.m75933x41a8a7f2(2) ? 1 : 0));
        } else {
            ((mm2.c1) ag0Var.P0(mm2.c1.class)).E3.f411005e = 0;
            ag0Var.M1(((mm2.l0) ag0Var.P0(mm2.l0.class)).f410748q);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e30 e30Var = ag0Var.B;
        e30Var.getClass();
        java.lang.String str = e30Var.f199746r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showCheerAnimation data: " + j0Var);
        jz5.f0 f0Var = null;
        if (j0Var != null) {
            if (j0Var.f410685b) {
                r45.nn1 nn1Var2 = j0Var.f410684a;
                java.util.LinkedList<java.lang.String> m75941xfb8219142 = nn1Var2.m75941xfb821914(5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getColor(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                for (java.lang.String str2 : m75941xfb8219142) {
                    try {
                        i18 = android.graphics.Color.parseColor(str2);
                    } catch (java.lang.Throwable unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "changeCheerLikeBg exception: " + str2);
                        i18 = 0;
                    }
                    arrayList.add(java.lang.Integer.valueOf(i18));
                }
                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BR_TL, kz5.n0.R0(arrayList));
                gradientDrawable.setGradientType(0);
                gradientDrawable.setShape(1);
                android.widget.ImageView imageView = e30Var.f199754z;
                imageView.setImageDrawable(gradientDrawable);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1479x5a3e54d.C14181x8c64b469 c14181x8c64b469 = e30Var.f199753y;
                java.lang.Object[] objArr2 = c14181x8c64b469.getVisibility() == 8;
                p3325xe03a0797.p3326xc267989b.r2 r2Var = c14181x8c64b469.f193057h;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                c14181x8c64b469.f193059m = 360.0f;
                java.util.LinkedList<java.lang.String> m75941xfb8219143 = nn1Var2.m75941xfb821914(5);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75941xfb8219143);
                java.util.Collections.reverse(m75941xfb8219143);
                c14181x8c64b469.f193060n = 3.0f;
                c14181x8c64b469.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb8219143, 10));
                for (java.lang.String str3 : m75941xfb8219143) {
                    try {
                        i17 = android.graphics.Color.parseColor(str3);
                    } catch (java.lang.Throwable unused2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CheerCountDownView", "setCheerCountDown exception: " + str3);
                        i17 = 0;
                    }
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                }
                c14181x8c64b469.f193055f = kz5.n0.R0(arrayList2);
                c14181x8c64b469.requestLayout();
                long m75942xfb822ef2 = nn1Var2.m75942xfb822ef2(7) * 1000;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u20 u20Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.u20(e30Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CheerCountDownView", "startCountDown duration: " + m75942xfb822ef2 + " lineWidth: " + c14181x8c64b469.f193060n);
                if (m75942xfb822ef2 > 0) {
                    c14181x8c64b469.f193059m = 360.0f;
                    c14181x8c64b469.f193057h = p3325xe03a0797.p3326xc267989b.l.d(c14181x8c64b469.f193056g, null, null, new pe2.a(m75942xfb822ef2, c14181x8c64b469, u20Var, null), 3, null);
                }
                if (((mm2.w) e30Var.f199745q.P0(mm2.w.class)).O6()) {
                    imageView.setAlpha(0.0f);
                    c14181x8c64b469.setAlpha(0.0f);
                } else if (objArr2 == true) {
                    imageView.setAlpha(0.0f);
                    c14181x8c64b469.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(1000L).setListener(null).start();
                    c14181x8c64b469.animate().alpha(1.0f).setDuration(1000L).setListener(null).start();
                } else {
                    c14181x8c64b469.setAlpha(1.0f);
                    imageView.setAlpha(1.0f);
                }
                c14181x8c64b469.setVisibility(0);
                imageView.setVisibility(0);
                z17 = true;
            } else {
                z17 = true;
                e30Var.x1(true);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            z17 = true;
        }
        if (f0Var == null) {
            e30Var.x1(z17);
        }
    }
}
