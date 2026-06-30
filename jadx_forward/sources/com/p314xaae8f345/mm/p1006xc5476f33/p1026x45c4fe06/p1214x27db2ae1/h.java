package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.ServiceC12737xad93c887 f172253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f172254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f172255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 f172256g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f172257h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.os.ResultReceiver f172258i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f172259m;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.ServiceC12737xad93c887 serviceC12737xad93c887, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80, boolean z18, android.os.ResultReceiver resultReceiver, yz5.a aVar) {
        this.f172253d = serviceC12737xad93c887;
        this.f172254e = interfaceC11702x4ae7c33;
        this.f172255f = z17;
        this.f172256g = c12745x1ee4df80;
        this.f172257h = z18;
        this.f172258i = resultReceiver;
        this.f172259m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.ServiceC12737xad93c887 serviceC12737xad93c887 = this.f172253d;
        java.util.Set set = serviceC12737xad93c887.f172183d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f172254e;
        set.add(interfaceC11702x4ae7c33);
        boolean z17 = this.f172255f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = this.f172256g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l2.f172302a;
        serviceC12737xad93c887.a(this.f172258i, z17 ? l2Var.a(interfaceC11702x4ae7c33, c12745x1ee4df80) : l2Var.b(interfaceC11702x4ae7c33, c12745x1ee4df80, this.f172257h));
        serviceC12737xad93c887.f172183d.remove(interfaceC11702x4ae7c33);
        this.f172259m.mo152xb9724478();
    }
}
