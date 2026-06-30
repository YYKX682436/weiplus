package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Dialog f260285a = null;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f260286b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.c f260287c;

    public d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.c cVar) {
        this.f260286b = context;
        this.f260287c = cVar;
    }

    public void a() {
        android.app.Dialog dialog = this.f260285a;
        if (dialog != null) {
            dialog.dismiss();
            this.f260285a = null;
        }
    }

    public void b(boolean z17, int i17, java.lang.String str) {
        android.app.Dialog dialog;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7 c5585x857171c7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7();
        c5585x857171c7.f135908h = null;
        am.bf bfVar = c5585x857171c7.f135907g;
        bfVar.f87781a = z17;
        if (z17 && ((dialog = this.f260285a) == null || !dialog.isShowing())) {
            android.app.Dialog dialog2 = this.f260285a;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.f260285a = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.h(this.f260286b, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.b(this));
        }
        bfVar.f87782b = i17;
        bfVar.f87783c = str;
        c5585x857171c7.f273897d = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.a(this, c5585x857171c7);
        c5585x857171c7.b(android.os.Looper.getMainLooper());
    }
}
