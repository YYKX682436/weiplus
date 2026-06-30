package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f102307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f102308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102309f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(android.widget.FrameLayout frameLayout, gx2.q qVar, yz5.a aVar) {
        super(1);
        this.f102307d = frameLayout;
        this.f102308e = qVar;
        this.f102309f = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.vas.VASActivity vASActivity = (com.tencent.mm.ui.vas.VASActivity) obj;
        gx2.q qVar = this.f102308e;
        if (vASActivity != null) {
            this.f102307d.post(new com.tencent.mm.plugin.finder.assist.i3(vASActivity, qVar));
        }
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = vASActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) vASActivity : null;
        if (finderProfileUI != null) {
            finderProfileUI.f109513u = new com.tencent.mm.plugin.finder.assist.j3(qVar, this.f102309f, vASActivity);
        }
        return jz5.f0.f302826a;
    }
}
