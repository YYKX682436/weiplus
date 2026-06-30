package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public class x implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f264891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f264892b;

    public x(java.util.concurrent.CountDownLatch countDownLatch, android.os.Bundle bundle) {
        this.f264891a = countDownLatch;
        this.f264892b = bundle;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartPickWordHelper", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        java.util.concurrent.CountDownLatch countDownLatch = this.f264891a;
        if (i17 != 0 || i18 != 0) {
            countDownLatch.countDown();
            return;
        }
        r45.w66 w66Var = (r45.w66) oVar.f152244b.f152233a;
        java.lang.String str2 = w66Var.f470441d;
        android.os.Bundle bundle = this.f264892b;
        bundle.putString("PickedWord", str2);
        bundle.putInt("PrefixOffset", w66Var.f470442e);
        bundle.putInt("SuffixOffset", w66Var.f470443f);
        bundle.putString("PrefixText", w66Var.f470444g);
        bundle.putString("SuffixText", w66Var.f470445h);
        bundle.putInt("IsMainOrSub", w66Var.f470446i);
        java.lang.String str3 = w66Var.f470441d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.y.f264897a = str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.y.f264899c = w66Var.f470448n;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.y.f264898b = w66Var.f470447m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartPickWordHelper", "response: PrefixText: %s, PickedWord: %s, SuffixText: %s, %d, %d, %d", w66Var.f470444g, str3, w66Var.f470445h, java.lang.Integer.valueOf(w66Var.f470442e), java.lang.Integer.valueOf(w66Var.f470443f), java.lang.Integer.valueOf(w66Var.f470446i));
        countDownLatch.countDown();
    }
}
