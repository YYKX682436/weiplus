package com.p314xaae8f345.p457x3304c6.p476x11d36527;

/* loaded from: classes5.dex */
public class e extends com.p314xaae8f345.p457x3304c6.p476x11d36527.AbstractC4106x27355aac {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.b f129768a;

    public e(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 c4105x45a51929, com.p314xaae8f345.p457x3304c6.p476x11d36527.b bVar) {
        super(c4105x45a51929);
        this.f129768a = bVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p476x11d36527.AbstractC4106x27355aac
    /* renamed from: onInvoke */
    public void mo33813x48671b37(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4105x45a51929 c4105x45a51929, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4107x5fb41b3e.MaterialPackCompleteArg materialPackCompleteArg = (com.p314xaae8f345.p457x3304c6.p476x11d36527.C4107x5fb41b3e.MaterialPackCompleteArg) obj;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.b bVar = this.f129768a;
        if (bVar == null || materialPackCompleteArg == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d c4108x6d452a1d = materialPackCompleteArg.f16090x81e44fe0;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = materialPackCompleteArg.f16089x5c4d208;
        du0.l0 l0Var = (du0.l0) bVar;
        com.p314xaae8f345.p457x3304c6.p476x11d36527.g gVar = l0Var.f324912a;
        if (c4093x6b88526b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaterialResourceLoadUIC", "onComplete: MaterialScene = " + gVar + ", mjError " + c4093x6b88526b.f129708ec.m33752x130a215f() + ", " + c4093x6b88526b.f16057x38eb0007);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialResourceLoadUIC", "onComplete: MaterialScene = " + gVar + ", load success");
        }
        l0Var.f324913b.mo149xb9724478(c4108x6d452a1d, c4093x6b88526b);
    }
}
