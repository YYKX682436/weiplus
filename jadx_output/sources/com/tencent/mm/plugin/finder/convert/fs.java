package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fs implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.gs f103411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103412b;

    public fs(com.tencent.mm.plugin.finder.convert.gs gsVar, in5.s0 s0Var) {
        this.f103411a = gsVar;
        this.f103412b = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.b1.e(new jz5.l("shoot_status", java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.convert.gs.n(this.f103411a, this.f103412b))));
    }
}
