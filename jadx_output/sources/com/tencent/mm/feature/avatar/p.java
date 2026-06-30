package com.tencent.mm.feature.avatar;

/* loaded from: classes11.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65176d;

    public p(java.lang.String str) {
        this.f65176d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.m0 m0Var = new com.tencent.mm.modelavatar.m0();
        m0Var.a(this.f65176d, new com.tencent.mm.feature.avatar.q(m0Var));
    }
}
