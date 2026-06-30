package xc2;

/* loaded from: classes2.dex */
public final class e extends xc2.r {
    @Override // xc2.r
    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, xc2.p cache, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cache, "cache");
        super.A(holder, jumpView, infoEx, cache, str);
        if (cache instanceof xc2.w0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            xc2.w0 w0Var = (xc2.w0) cache;
            y("reportAdExpose", (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? 0L : feedObject.m59251x5db1b11(), w0Var);
            B(jumpView, w0Var);
            xc2.d dVar = new xc2.d(this, jumpView, w0Var, holder, str);
            if (w0Var.f534854m == 0) {
                jumpView.post(dVar);
            } else {
                dVar.run();
            }
            java.lang.Runnable runnable = this.f534814k;
            jumpView.removeCallbacks(runnable);
            jumpView.postDelayed(runnable, 1000L);
        }
    }

    public final void B(android.view.View view, xc2.w0 w0Var) {
        if (w0Var.f534854m <= 0 || w0Var.f534855n <= 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getWidth());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(view.getHeight());
            w0Var.f534854m = valueOf.intValue();
            w0Var.f534855n = valueOf2.intValue();
        }
    }

    @Override // xc2.r
    public void w() {
        android.content.Context context;
        java.lang.String str;
        xc2.p pVar = this.f534811h;
        xc2.w0 w0Var = pVar instanceof xc2.w0 ? (xc2.w0) pVar : null;
        if (w0Var == null || (context = this.f534810g) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar2 == null || (str = nyVar2.f216915p) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        long j17 = ((sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sc2.a8.class)).f487299y;
        java.lang.String str3 = this.f534812i;
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f, str3) ? 2 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b("TWO_FLOW", str3) ? 4 : p3321xbce91901.jvm.p3324x21ffc6bd.o.b("single_comment", str3) ? 5 : 1;
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).Ok(str2, true, false, w0Var.f534760f, w0Var.f534854m, w0Var.f534855n, (r39 & 64) != 0 ? 0 : 0, (r39 & 128) != 0 ? 0 : 0, (r39 & 256) != 0 ? 0 : 0, (r39 & 512) != 0 ? "" : w0Var.f534764j, (r39 & 1024) != 0 ? 0L : w0Var.f534763i, j17, (r39 & 4096) != 0 ? 0 : i17, (r39 & 8192) != 0 ? 0.0f : 0.0f, (r39 & 16384) != 0 ? null : nyVar != null ? nyVar.V6() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    @Override // xc2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(in5.s0 r31, android.view.View r32, xc2.p0 r33, xc2.p r34, int r35, int r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.e.z(in5.s0, android.view.View, xc2.p0, xc2.p, int, int, java.lang.String):void");
    }
}
