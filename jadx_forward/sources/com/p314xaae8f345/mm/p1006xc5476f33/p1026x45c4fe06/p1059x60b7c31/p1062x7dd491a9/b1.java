package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* loaded from: classes15.dex */
public class b1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r f160473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2 f160474b;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2 c11970x4f4ad5f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar) {
        this.f160474b = c11970x4f4ad5f2;
        this.f160473a = rVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.d1
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.r rVar = this.f160473a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11970x4f4ad5f2 c11970x4f4ad5f2 = this.f160474b;
        if (z17) {
            c11970x4f4ad5f2.f160417q = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.o) rVar).a();
        } else {
            c11970x4f4ad5f2.f160417q = false;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.o) rVar).a();
        }
    }
}
