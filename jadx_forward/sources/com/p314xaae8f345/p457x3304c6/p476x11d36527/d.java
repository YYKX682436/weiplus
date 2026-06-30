package com.p314xaae8f345.p457x3304c6.p476x11d36527;

/* loaded from: classes5.dex */
public class d extends com.p314xaae8f345.p457x3304c6.p476x11d36527.AbstractC4106x27355aac {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.a f129767a;

    public d(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 c4105x45a51929, com.p314xaae8f345.p457x3304c6.p476x11d36527.a aVar) {
        super(c4105x45a51929);
        this.f129767a = aVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p476x11d36527.AbstractC4106x27355aac
    /* renamed from: onInvoke */
    public void mo33813x48671b37(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 c4105x45a51929, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4107x5fb41b3e.CompleteArg completeArg = (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4107x5fb41b3e.CompleteArg) obj;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.a aVar = this.f129767a;
        if (aVar == null || completeArg == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = completeArg.f16088x5c4d208;
        du0.k0 k0Var = (du0.k0) aVar;
        java.lang.String str = k0Var.f324906a;
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaterialResourceLoadUIC", "onComplete: materialID = " + str + ", mjError " + c4093x6b88526b.f129708ec.m33752x130a215f() + ", " + c4093x6b88526b.f16057x38eb0007);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialResourceLoadUIC", "onComplete: materialID = " + str + ", load success");
        }
        k0Var.f324907b.mo146xb9724478(c4093x6b88526b);
    }
}
