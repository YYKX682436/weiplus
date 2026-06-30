package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class j implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.g6 f70456d;

    public j(com.tencent.mm.modelavatar.r rVar, com.tencent.mm.sdk.platformtools.g6 g6Var) {
        this.f70456d = g6Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AvatarService#putAsyncTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.g6 g6Var = this.f70456d;
        g6Var.a();
        g6Var.b();
    }
}
