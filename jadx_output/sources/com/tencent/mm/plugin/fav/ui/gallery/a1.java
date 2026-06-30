package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f100892a;

    /* renamed from: b, reason: collision with root package name */
    public int f100893b;

    public final int a(boolean z17) {
        int i17 = z17 ? 2 : 1;
        if (i17 != this.f100893b) {
            if (i17 == 1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_select_all_btn", "view_exp", b(), 32903);
            } else {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_cancel_select_all_btn", "view_exp", b(), 32903);
            }
            this.f100893b = i17;
        }
        return i17;
    }

    public final java.util.HashMap b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fav_session_id", d());
        return hashMap;
    }

    public final java.util.HashMap c(com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var) {
        long j17;
        int i17;
        int i18;
        int i19;
        com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var;
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var;
        r45.gp0 gp0Var;
        java.util.ArrayList arrayList = com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.f100918a;
        long j18 = 0;
        int i27 = 0;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            j17 = 0;
            i17 = 0;
            i18 = 0;
            while (it.hasNext()) {
                com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var2 = (com.tencent.mm.plugin.fav.ui.gallery.b1) it.next();
                r45.gp0 gp0Var2 = b1Var2.f100898b;
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
        if (y1Var == null || (x1Var = ((com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var).f100996d) == null) {
            i19 = 0;
        } else {
            int itemCount = x1Var.getItemCount();
            int i28 = 0;
            i19 = 0;
            while (i27 < itemCount) {
                com.tencent.mm.plugin.fav.ui.gallery.o1 x17 = x1Var.x(i27);
                if (x17 != null && x17.f101037c == 0 && (b1Var = x17.f101036b) != null && (gp0Var = b1Var.f100898b) != null) {
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
        java.lang.String str = this.f100892a;
        if (str == null || str.length() == 0) {
            this.f100892a = com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r()) + '_' + java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getOrGenerateSessionId] Generated session id: ");
            sb6.append(this.f100892a);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMediaHistoryGalleryReporter", sb6.toString());
        }
        java.lang.String str2 = this.f100892a;
        return str2 == null ? "" : str2;
    }

    public final void e(int i17, com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var) {
        java.util.HashMap c17 = c(y1Var);
        c17.put("fav_clk_btn", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_half_screen_btn", "view_clk", c17, 32903);
    }
}
