package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class h6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f103556e;

    public h6(in5.s0 s0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f103555d = s0Var;
        this.f103556e = finderItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = this.f103555d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y2Var.t0(context, this.f103556e);
    }
}
