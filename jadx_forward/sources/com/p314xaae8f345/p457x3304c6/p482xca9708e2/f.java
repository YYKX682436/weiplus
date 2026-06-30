package com.p314xaae8f345.p457x3304c6.p482xca9708e2;

/* loaded from: classes5.dex */
public class f extends com.p314xaae8f345.p457x3304c6.p482xca9708e2.AbstractC4199x9a901327 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.c f130098a;

    public f(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce c4198x4175a9ce, com.p314xaae8f345.p457x3304c6.p482xca9708e2.c cVar, boolean z17) {
        super(c4198x4175a9ce, z17);
        this.f130098a = cVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.AbstractC4199x9a901327
    /* renamed from: onInvoke */
    public void mo34689x48671b37(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce c4198x4175a9ce, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4200xb93a0434.AsyncSubmitCompleteArg asyncSubmitCompleteArg = (com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4200xb93a0434.AsyncSubmitCompleteArg) obj;
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.c cVar = this.f130098a;
        if (cVar == null || asyncSubmitCompleteArg == null) {
            return;
        }
        cVar.a(asyncSubmitCompleteArg.f16168x55c3e48f, asyncSubmitCompleteArg.f16167x5c4d208);
    }
}
