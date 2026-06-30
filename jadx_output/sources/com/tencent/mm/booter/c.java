package com.tencent.mm.booter;

/* loaded from: classes11.dex */
public class c implements com.tencent.mm.sdk.platformtools.t2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.CoreService f63310a;

    public c(com.tencent.mm.booter.CoreService coreService) {
        this.f63310a = coreService;
    }

    @Override // com.tencent.mm.sdk.platformtools.t2
    public void cancel() {
        com.tencent.mm.booter.MMReceivers$AlarmReceiver.d(this.f63310a.getApplicationContext());
    }

    @Override // com.tencent.mm.sdk.platformtools.t2
    public void prepare() {
        com.tencent.mm.booter.MMReceivers$AlarmReceiver.b(this.f63310a.getApplicationContext());
    }
}
