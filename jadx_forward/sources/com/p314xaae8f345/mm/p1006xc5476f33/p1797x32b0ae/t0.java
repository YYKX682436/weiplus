package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes7.dex */
public class t0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f225817a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, yz5.l lVar) {
        this.f225817a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check fail, errCode: " + i17);
        this.f225817a.mo146xb9724478("");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWxaLiteAppCenter", "checkLiteAppAndGetPath check success, path: " + c3712x3ed8a441.f14369x346425);
        this.f225817a.mo146xb9724478(c3712x3ed8a441.f14369x346425);
    }
}
