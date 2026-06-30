package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ah extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f109676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        super(1);
        this.f109676d = mMSwitchBtn;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_SELF_HISTORY_SETTING_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        } else {
            this.f109676d.setCheck(true);
        }
        return jz5.f0.f302826a;
    }
}
