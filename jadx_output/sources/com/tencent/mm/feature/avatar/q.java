package com.tencent.mm.feature.avatar;

/* loaded from: classes11.dex */
public final class q implements kv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.h0 f65177a;

    public q(kv.h0 h0Var) {
        this.f65177a = h0Var;
    }

    @Override // kv.g0
    public final int a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AnyProcessAvatarAttacher", "resultCallback#GetHDHeadImg, errType: " + i17 + ", errCode: " + i18);
        ((com.tencent.mm.modelavatar.m0) this.f65177a).b();
        return 0;
    }
}
