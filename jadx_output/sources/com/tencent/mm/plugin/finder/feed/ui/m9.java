package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class m9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f110299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(0);
        this.f110299d = finderLiveDelManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f110299d.f109365h;
        if (hpVar != null) {
            hpVar.l0();
        }
        return jz5.f0.f302826a;
    }
}
