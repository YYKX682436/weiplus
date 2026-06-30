package com.tencent.mm.modelavatar;

/* loaded from: classes11.dex */
public class f implements kv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.m0 f70444a;

    public f(com.tencent.mm.modelavatar.m0 m0Var) {
        this.f70444a = m0Var;
    }

    @Override // kv.g0
    public int a(int i17, int i18) {
        this.f70444a.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarLogic", "getHDHeadImage onSceneEnd: errType=%d, errCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return 0;
    }
}
