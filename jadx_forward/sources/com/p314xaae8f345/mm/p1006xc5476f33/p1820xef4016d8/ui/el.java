package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class el implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.gl f228415e;

    public el(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.gl glVar) {
        this.f228414d = str;
        this.f228415e = glVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.n3.f226993a;
        com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = this.f228415e.f228491f;
        if (c10389xffc30b0 != null) {
            n3Var.f(1, this.f228414d, c10389xffc30b0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pagView");
            throw null;
        }
    }
}
