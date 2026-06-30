package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class r8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.t8 f108897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(com.tencent.mm.plugin.finder.feed.t8 t8Var) {
        super(0);
        this.f108897d = t8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.t8 t8Var = this.f108897d;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = t8Var.f106424g;
        com.tencent.mm.plugin.finder.feed.w8 w8Var = i0Var instanceof com.tencent.mm.plugin.finder.feed.w8 ? (com.tencent.mm.plugin.finder.feed.w8) i0Var : null;
        if (w8Var != null) {
            java.lang.String str = t8Var.P;
            if (str == null) {
                str = "";
            }
            w8Var.y(true, false, str, null);
        }
        return jz5.f0.f302826a;
    }
}
