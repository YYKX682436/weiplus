package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class yg extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f110771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        super(1);
        this.f110771d = mMSwitchBtn;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f110771d.setCheck(!((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }
}
