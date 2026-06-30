package com.tencent.mm.feature.avatar;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65171d;

    public m(java.lang.String str) {
        this.f65171d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.m0 m0Var = new com.tencent.mm.modelavatar.m0();
        m0Var.a(this.f65171d, new com.tencent.mm.feature.avatar.n(m0Var));
    }
}
