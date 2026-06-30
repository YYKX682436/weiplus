package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class l0 implements sc2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f107263a;

    public l0(com.tencent.mm.plugin.finder.feed.a1 a1Var) {
        this.f107263a = a1Var;
    }

    @Override // sc2.b8
    public boolean a() {
        android.view.View refreshHeader = this.f107263a.f106180m.getRefreshHeader();
        boolean z17 = false;
        if (refreshHeader != null && refreshHeader.getVisibility() == 0) {
            z17 = true;
        }
        return !z17;
    }

    @Override // sc2.b8
    public boolean b(boolean z17) {
        return this.f107263a.f106180m.J(z17);
    }
}
