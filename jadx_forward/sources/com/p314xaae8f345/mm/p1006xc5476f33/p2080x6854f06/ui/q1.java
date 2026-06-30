package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f243859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17682xe4b6906f f243860e;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17682xe4b6906f c17682xe4b6906f, android.graphics.Bitmap bitmap) {
        this.f243860e = c17682xe4b6906f;
        this.f243859d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17682xe4b6906f c17682xe4b6906f = this.f243860e;
        c17682xe4b6906f.N.setImageBitmap(this.f243859d);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = c17682xe4b6906f.P;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
    }
}
