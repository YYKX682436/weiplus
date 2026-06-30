package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class pf implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f104261b;

    public pf(com.tencent.mm.plugin.finder.convert.zf zfVar, so2.h1 h1Var) {
        this.f104260a = zfVar;
        this.f104261b = h1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return this.f104260a.U1(this.f104261b.getFeedObject().getLiveInfo());
    }
}
