package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class e3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f103219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f103220b;

    public e3(com.tencent.mm.plugin.finder.convert.u4 u4Var, long j17) {
        this.f103219a = u4Var;
        this.f103220b = j17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            this.f103219a.f104670e.j().e(this.f103220b);
        }
    }
}
