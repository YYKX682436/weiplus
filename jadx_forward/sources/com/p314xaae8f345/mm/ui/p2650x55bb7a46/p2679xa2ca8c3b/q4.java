package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f286845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r4 f286847f;

    public q4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r4 r4Var, q11.b bVar, java.lang.String str) {
        this.f286847f = r4Var;
        this.f286845d = bVar;
        this.f286846e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f286845d.f441067d == null || !this.f286846e.equals(this.f286847f.f286941c.f287020h.getTag(com.p314xaae8f345.mm.R.id.nvv))) {
            return;
        }
        android.content.res.Resources resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.r4 r4Var = this.f286847f;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.s4 s4Var = r4Var.f286941c;
        java.lang.String str = s4Var.f287016d;
        android.graphics.Bitmap bitmap = this.f286845d.f441067d;
        int i17 = r4Var.f286939a;
        this.f286847f.f286941c.f287020h.setBackground(new android.graphics.drawable.BitmapDrawable(resources, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, r4Var.f286940b, i17, false), s4Var.f287019g ^ true ? com.p314xaae8f345.mm.R.C30861xcebc809e.bgs : com.p314xaae8f345.mm.R.C30861xcebc809e.bzy)));
    }
}
