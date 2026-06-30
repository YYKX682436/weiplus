package com.tencent.mm.modelsimple;

/* loaded from: classes10.dex */
public class o1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71388d;

    public o1(java.lang.String str) {
        this.f71388d = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskUploadHDHeadImg", "onSceneEnd errType:%d, erCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.vfs.w6.h(this.f71388d);
        }
        com.tencent.mm.modelsimple.p1.f71395b = false;
        gm0.j1.d().q(157, com.tencent.mm.modelsimple.p1.f71394a);
    }
}
