package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f292599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.f3 f292600e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f292601f;

    public u4(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54, su4.f3 f3Var) {
        this.f292601f = c21357x5e7365bb;
        this.f292599d = c21549x15041e54;
        this.f292600e = f3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = this.f292599d;
        if (c21549x15041e54 == 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f292601f;
        c21357x5e7365bb.b1("find_friends_by_search", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a) c21549x15041e54;
        su4.f3 f3Var = this.f292600e;
        if (aVar.o0(f3Var != null && f3Var.a() && (i17 = f3Var.f494419f) >= 1 && i17 <= 4)) {
            return;
        }
        c21549x15041e54.a0(8);
        if (f3Var == null) {
            c21549x15041e54.c0(8);
            return;
        }
        if (f3Var.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "show red %s", c21549x15041e54.f279307h);
            int i18 = f3Var.f494419f;
            if (i18 == 1) {
                c21549x15041e54.c0(0);
                c21549x15041e54.b0(8);
                aVar.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT, true);
            } else if (i18 == 2) {
                c21549x15041e54.c0(8);
                c21549x15041e54.b0(0);
                c21549x15041e54.d0(f3Var.f494420g, -1, android.graphics.Color.parseColor("#8c8c8c"));
                c21549x15041e54.e0(true);
                c21549x15041e54.Y(8);
                aVar.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE, true);
            } else if (i18 == 3) {
                c21549x15041e54.Y(0);
                c21549x15041e54.T(0);
                c21549x15041e54.V(0);
                c21549x15041e54.e0(false);
                android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(f3Var.f494421h);
                if (Bi != null) {
                    c21357x5e7365bb.B = null;
                    c21549x15041e54.R(Bi);
                } else {
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(f3Var.f494421h, c21357x5e7365bb.C1);
                    c21357x5e7365bb.B = f3Var.f494421h;
                }
                aVar.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_ICON, true);
            } else if (i18 != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FindMoreFriendsUI", "search unknown red type %d", java.lang.Integer.valueOf(i18));
            } else {
                c21549x15041e54.Y(0);
                c21549x15041e54.T(0);
                c21549x15041e54.V(0);
                c21549x15041e54.b0(0);
                c21549x15041e54.e0(false);
                c21549x15041e54.d0(f3Var.f494420g, -1, android.graphics.Color.parseColor("#8c8c8c"));
                android.graphics.Bitmap Bi2 = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(f3Var.f494421h);
                if (Bi2 != null) {
                    c21357x5e7365bb.B = null;
                    c21549x15041e54.R(Bi2);
                } else {
                    ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(f3Var.f494421h, c21357x5e7365bb.C1);
                    c21357x5e7365bb.B = f3Var.f494421h;
                }
                aVar.e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT_TITLE_ICON, true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "hide red %s", c21549x15041e54.f279307h);
            c21549x15041e54.c0(8);
            c21549x15041e54.b0(8);
            c21549x15041e54.Y(8);
            c21549x15041e54.E(0);
            if (c21549x15041e54 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056) c21549x15041e54).h0();
            }
        }
        c21357x5e7365bb.b1("find_friends_by_search", f3Var.a());
        c21357x5e7365bb.f278189w.notifyDataSetChanged();
    }
}
