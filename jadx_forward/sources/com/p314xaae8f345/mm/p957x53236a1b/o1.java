package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes10.dex */
public class o1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152921d;

    public o1(java.lang.String str) {
        this.f152921d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostTaskUploadHDHeadImg", "onSceneEnd errType:%d, erCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.vfs.w6.h(this.f152921d);
        }
        com.p314xaae8f345.mm.p957x53236a1b.p1.f152928b = false;
        gm0.j1.d().q(157, com.p314xaae8f345.mm.p957x53236a1b.p1.f152927a);
    }
}
