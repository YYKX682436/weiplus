package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes.dex */
public final class f0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f174124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f174125b;

    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f174124a = h0Var;
        this.f174125b = countDownLatch;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a1
    public final void a(int i17, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[+] Get all backup packages complete, error = " + i17 + ", pkgs.size= " + arrayList.size());
        this.f174124a.f391656d = arrayList;
        this.f174125b.countDown();
    }
}
