package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f182425a;

    /* renamed from: b, reason: collision with root package name */
    public int f182426b;

    public final int a(boolean z17) {
        int i17 = z17 ? 2 : 1;
        if (i17 != this.f182426b) {
            if (i17 == 1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_select_all_btn", "view_exp", b(), 32903);
            } else {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_cancel_select_all_btn", "view_exp", b(), 32903);
            }
            this.f182426b = i17;
        }
        return i17;
    }

    public final java.util.HashMap b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fav_session_id", d());
        return hashMap;
    }

    public final java.util.HashMap c(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1 y1Var) {
        long j17;
        int i17;
        int i18;
        int i19;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var;
        r45.gp0 gp0Var;
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182451a;
        long j18 = 0;
        int i27 = 0;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            j17 = 0;
            i17 = 0;
            i18 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next();
                r45.gp0 gp0Var2 = b1Var2.f182431b;
                if (gp0Var2 != null) {
                    if (gp0Var2.I == 2) {
                        i17++;
                        j18 += gp0Var2.R;
                    } else if (b1Var2.d() || b1Var2.c()) {
                        i18++;
                        j17 += gp0Var2.R;
                    }
                }
            }
        } else {
            j17 = 0;
            i17 = 0;
            i18 = 0;
        }
        if (y1Var == null || (x1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) y1Var).f182529d) == null) {
            i19 = 0;
        } else {
            int mo1894x7e414b06 = x1Var.mo1894x7e414b06();
            int i28 = 0;
            i19 = 0;
            while (i27 < mo1894x7e414b06) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 x17 = x1Var.x(i27);
                if (x17 != null && x17.f182570c == 0 && (b1Var = x17.f182569b) != null && (gp0Var = b1Var.f182431b) != null) {
                    if (gp0Var.I == 2) {
                        i28++;
                    } else if (b1Var.d() || b1Var.c()) {
                        i19++;
                    }
                }
                i27++;
            }
            i27 = i28;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("select_image_cnt", java.lang.Integer.valueOf(i17));
        hashMap.put("select_video_cnt", java.lang.Integer.valueOf(i18));
        hashMap.put("total_image_cnt", java.lang.Integer.valueOf(i27));
        hashMap.put("total_video_cnt", java.lang.Integer.valueOf(i19));
        hashMap.put("select_image_size", java.lang.Long.valueOf(j18));
        hashMap.put("select_video_size", java.lang.Long.valueOf(j17));
        hashMap.put("fav_session_id", d());
        return hashMap;
    }

    public final java.lang.String d() {
        java.lang.String str = this.f182425a;
        if (str == null || str.length() == 0) {
            this.f182425a = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r()) + '_' + java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getOrGenerateSessionId] Generated session id: ");
            sb6.append(this.f182425a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaHistoryGalleryReporter", sb6.toString());
        }
        java.lang.String str2 = this.f182425a;
        return str2 == null ? "" : str2;
    }

    public final void e(int i17, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y1 y1Var) {
        java.util.HashMap c17 = c(y1Var);
        c17.put("fav_clk_btn", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_half_screen_btn", "view_clk", c17, 32903);
    }
}
