package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class l implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f160292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f160293b;

    public l(yz5.a aVar, yz5.l lVar) {
        this.f160292a = aVar;
        this.f160293b = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate result: " + z17 + ", " + str);
        if (z17) {
            this.f160292a.mo152xb9724478();
            return;
        }
        if (str == null) {
            str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
        this.f160293b.mo146xb9724478("navigate_failed:".concat(str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.g
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 targetInitConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetInitConfig, "targetInitConfig");
    }
}
