package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f279609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.d5 f279610f;

    public c5(com.p314xaae8f345.mm.ui.d5 d5Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f279610f = d5Var;
        this.f279608d = str;
        this.f279609e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download url ");
        java.lang.String str = this.f279608d;
        sb6.append(str);
        sb6.append(" , result ");
        android.graphics.Bitmap bitmap = this.f279609e;
        sb6.append(bitmap == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", sb6.toString());
        com.p314xaae8f345.mm.ui.d5 d5Var = this.f279610f;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) d5Var.f289861a.f278189w.h("jd_market_entrance");
        if (c21549x15041e54 != null) {
            if (str.equals(d5Var.f289861a.C)) {
                c21549x15041e54.R(bitmap);
                d5Var.f289861a.C = null;
            }
            d5Var.f289861a.f278189w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f289861a.f278196z)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) d5Var.f289861a.f278189w.h("find_friends_by_look")).U = new android.graphics.drawable.BitmapDrawable(d5Var.f289861a.mo7438x76847179().getResources(), bitmap);
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = d5Var.f289861a;
            c21357x5e7365bb.f278196z = null;
            c21357x5e7365bb.f278189w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f289861a.A)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) d5Var.f289861a.f278189w.h("find_friends_by_search")).U = new android.graphics.drawable.BitmapDrawable(d5Var.f289861a.mo7438x76847179().getResources(), bitmap);
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb2 = d5Var.f289861a;
            c21357x5e7365bb2.A = null;
            c21357x5e7365bb2.f278189w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f289861a.f278187u.f290567b)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) d5Var.f289861a.f278189w.h("find_friends_by_look")).R(bitmap);
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb3 = d5Var.f289861a;
            c21357x5e7365bb3.f278187u.f290567b = null;
            c21357x5e7365bb3.f278189w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f289861a.B)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) d5Var.f289861a.f278189w.h("find_friends_by_search")).R(bitmap);
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb4 = d5Var.f289861a;
            c21357x5e7365bb4.B = null;
            c21357x5e7365bb4.f278189w.notifyDataSetChanged();
        }
        if (str.equals(d5Var.f289861a.f278184p1)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) d5Var.f289861a.f278189w.h("my_life_around")).R(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(bitmap, false, bitmap.getWidth() * 0.1f));
            com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb5 = d5Var.f289861a;
            c21357x5e7365bb5.f278184p1 = null;
            c21357x5e7365bb5.f278189w.notifyDataSetChanged();
        }
    }
}
