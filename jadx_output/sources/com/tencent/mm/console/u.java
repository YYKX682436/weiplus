package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class u implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f64846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f64847e;

    public u(boolean z17, android.content.Context context) {
        this.f64846d = z17;
        this.f64847e = context;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CommandProcessor", "summercert testdefaultrsa NetSceneManualAuth onSceneEnd [%d, %d, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 4 || i18 == -102 || this.f64846d) {
            new com.tencent.mm.modelsimple.l0(0).doScene(gm0.j1.n().f273288b.f70764d, new com.tencent.mm.console.t(this));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.console.r(this));
        }
    }
}
