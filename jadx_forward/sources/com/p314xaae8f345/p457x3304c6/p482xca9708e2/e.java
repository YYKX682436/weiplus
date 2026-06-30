package com.p314xaae8f345.p457x3304c6.p482xca9708e2;

/* loaded from: classes5.dex */
public class e extends com.p314xaae8f345.p457x3304c6.p482xca9708e2.AbstractC4199x9a901327 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p482xca9708e2.b f130097a;

    public e(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce c4198x4175a9ce, com.p314xaae8f345.p457x3304c6.p482xca9708e2.b bVar, boolean z17) {
        super(c4198x4175a9ce, z17);
        this.f130097a = bVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.AbstractC4199x9a901327
    /* renamed from: onInvoke */
    public void mo34689x48671b37(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4198x4175a9ce c4198x4175a9ce, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4200xb93a0434.AsyncQueryCompleteArg asyncQueryCompleteArg = (com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4200xb93a0434.AsyncQueryCompleteArg) obj;
        com.p314xaae8f345.p457x3304c6.p482xca9708e2.b bVar = this.f130097a;
        if (bVar == null || asyncQueryCompleteArg == null) {
            return;
        }
        bVar.a(asyncQueryCompleteArg.f16166x55c3e48f, asyncQueryCompleteArg.f16165x5c4d208);
    }
}
