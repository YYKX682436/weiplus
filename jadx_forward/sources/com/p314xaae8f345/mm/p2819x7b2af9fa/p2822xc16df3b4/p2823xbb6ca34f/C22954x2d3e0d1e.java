package com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2823xbb6ca34f;

/* renamed from: com.tencent.mm.xcompat.viewpager2.adapter.FragmentStateAdapter$4 */
/* loaded from: classes2.dex */
class C22954x2d3e0d1e implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f296263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f296264e;

    public C22954x2d3e0d1e(com.p314xaae8f345.mm.p2819x7b2af9fa.p2822xc16df3b4.p2823xbb6ca34f.b bVar, android.os.Handler handler, java.lang.Runnable runnable) {
        this.f296263d = handler;
        this.f296264e = runnable;
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
            this.f296263d.removeCallbacks(this.f296264e);
            yVar.mo273xed6858b4().c(this);
        }
    }
}
