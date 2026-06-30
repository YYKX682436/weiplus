package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes11.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94549d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(1);
        this.f94549d = bizTestUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.sdk.platformtools.o4.R("brandService").A("BizTimeLineReSortMsgCheck", 0);
        com.tencent.wechat.mm.biz.g0 c17 = yw.q3.f466437a.c();
        if (c17 != null) {
            c17.o(1);
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.T6(this.f94549d);
        return jz5.f0.f302826a;
    }
}
