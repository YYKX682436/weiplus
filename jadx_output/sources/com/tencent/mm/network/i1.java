package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.g1 f72025d;

    public i1(com.tencent.mm.network.g1 g1Var) {
        this.f72025d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMAutoAuth", "makeSureAuth AUTH_HOLD_KEY hold  clearTaskAndCallback");
        com.tencent.mm.network.x2.h().e(4, -100, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.gqo));
        this.f72025d.reset();
    }
}
