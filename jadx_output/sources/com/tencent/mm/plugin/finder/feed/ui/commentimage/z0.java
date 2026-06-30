package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class z0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 f109917a;

    public z0(com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d1Var) {
        this.f109917a = d1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        kotlinx.coroutines.flow.i2 i2Var = this.f109917a.f109835v;
        java.lang.Object obj2 = ((com.tencent.mm.plugin.finder.feed.m2) obj).f107344b;
        if (obj2 == null) {
            obj2 = kz5.p0.f313996d;
        }
        return java.lang.Boolean.valueOf(((kotlinx.coroutines.flow.q2) i2Var).e(obj2));
    }
}
