package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f172223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f172224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(java.util.concurrent.atomic.AtomicInteger atomicInteger, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        super(0);
        this.f172223d = atomicInteger;
        this.f172224e = interfaceC11702x4ae7c33;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int decrementAndGet = this.f172223d.decrementAndGet();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotServiceImpl", "done#onCommLibUsingVersionUpdate, theCreatingCount: " + decrementAndGet);
        if (decrementAndGet <= 0) {
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.b3(this.f172224e), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
        }
        return jz5.f0.f384359a;
    }
}
