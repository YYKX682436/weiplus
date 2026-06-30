package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f102351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment) {
        super(0);
        this.f102351d = vASCommonFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f102351d.f211121p;
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = vASActivity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) vASActivity : null;
        return java.lang.Boolean.valueOf(finderProfileUI != null ? finderProfileUI.d7() : true);
    }
}
