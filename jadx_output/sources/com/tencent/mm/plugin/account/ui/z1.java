package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.GateWayMobileUI f74353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.account.ui.GateWayMobileUI gateWayMobileUI) {
        super(0);
        this.f74353d = gateWayMobileUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f74353d.getIntent().getStringExtra("IntentKey_ProtocalUrl");
    }
}
