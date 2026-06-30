package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx2.q f102276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f102278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(gx2.q qVar, yz5.a aVar, com.tencent.mm.ui.vas.VASActivity vASActivity) {
        super(0);
        this.f102276d = qVar;
        this.f102277e = aVar;
        this.f102278f = vASActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(this.f102276d, false, null, false, null, 15, null);
        yz5.a aVar = this.f102277e;
        if (aVar != null) {
            aVar.invoke();
        }
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f102278f;
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = vASActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) vASActivity : null;
        if (finderProfileUI != null) {
            finderProfileUI.f109513u = null;
        }
        return jz5.f0.f302826a;
    }
}
