package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f241137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.q f241138e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.q qVar, android.graphics.Bitmap bitmap) {
        this.f241138e = qVar;
        this.f241137d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.q qVar = this.f241138e;
        qVar.M.setImageBitmap(this.f241137d);
        qVar.M.setBackgroundColor(0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = qVar.Q;
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
    }
}
