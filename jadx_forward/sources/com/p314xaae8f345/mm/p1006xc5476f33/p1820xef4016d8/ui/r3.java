package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s3 f228898e;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s3 s3Var, java.lang.String str) {
        this.f228898e = s3Var;
        this.f228897d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.s3 s3Var = this.f228898e;
        ((java.util.HashSet) s3Var.f228935c.f228975e.f227626r2).remove(s3Var.f228933a.f226852n);
        if (s3Var.f228934b.getTag() != null) {
            if (this.f228897d.equals((java.lang.String) s3Var.f228934b.getTag())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(s3Var.f228935c.f228975e.mo55332x76847179(), s3Var.f228934b, s3Var.f228933a.f226845d);
            }
        }
    }
}
