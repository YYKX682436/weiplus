package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class le implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.se f290611d;

    public le(com.p314xaae8f345.mm.ui.se seVar) {
        this.f290611d = seVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).getClass();
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("UpdaterConfigSharedPreferences", 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sharedPreferences, "getSharedPreferences(...)");
        if (sharedPreferences.getInt("RedDotBottomTab", 0) == 1) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.ke(this));
        }
    }
}
