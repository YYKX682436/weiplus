package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class t implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.console.u f64845d;

    public t(com.tencent.mm.console.u uVar) {
        this.f64845d = uVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa  NetSceneGetCert onSceneEnd [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 4 && i18 == -102) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.console.s(this));
            return;
        }
        com.tencent.mm.console.u uVar = this.f64845d;
        dp.a.makeText(uVar.f64847e, "DefaultRSA check pass", 0).show();
        com.tencent.mm.console.k0.a(uVar.f64847e, "");
    }
}
