package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class m1 implements sc2.b8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.s1 f107340a;

    public m1(com.tencent.mm.plugin.finder.feed.s1 s1Var) {
        this.f107340a = s1Var;
    }

    @Override // sc2.b8
    public boolean a() {
        android.view.View refreshHeader = this.f107340a.f108963g.getRefreshHeader();
        boolean z17 = false;
        if (refreshHeader != null && refreshHeader.getVisibility() == 0) {
            z17 = true;
        }
        return !z17;
    }

    @Override // sc2.b8
    public boolean b(boolean z17) {
        return this.f107340a.f108963g.J(z17);
    }
}
