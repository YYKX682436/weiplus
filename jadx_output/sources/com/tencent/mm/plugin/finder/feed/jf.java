package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class jf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kf f107099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(com.tencent.mm.plugin.finder.feed.kf kfVar) {
        super(0);
        this.f107099d = kfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.kf kfVar = this.f107099d;
        int i17 = kfVar.f107188b;
        lj2.t0 t0Var = kfVar.f107200n;
        com.tencent.mm.plugin.finder.feed.y20 y20Var = kfVar.f107199m;
        if (i17 == 1) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            return new em2.i(context, y20Var, t0Var, 1);
        }
        if (i17 != 3) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            return new com.tencent.mm.plugin.finder.feed.og(context2, y20Var, t0Var, 0);
        }
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        return new em2.i(context3, y20Var, t0Var, 4);
    }
}
