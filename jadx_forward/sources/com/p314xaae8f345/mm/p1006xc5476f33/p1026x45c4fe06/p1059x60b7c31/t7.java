package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes15.dex */
public class t7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r f164996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280 f164997b;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280 c11924x1ce6280, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar) {
        this.f164997b = c11924x1ce6280;
        this.f164996a = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v7
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar = this.f164996a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11924x1ce6280 c11924x1ce6280 = this.f164997b;
        if (z17) {
            c11924x1ce6280.f160094q = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.o) rVar).a();
        } else {
            c11924x1ce6280.f160094q = false;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.o) rVar).a();
        }
    }
}
