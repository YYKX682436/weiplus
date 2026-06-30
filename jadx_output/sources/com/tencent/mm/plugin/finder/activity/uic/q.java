package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC f101940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC finderActivityParticipateUIC) {
        super(0);
        this.f101940d = finderActivityParticipateUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f101940d.getIntent().getStringExtra("key_activity_newlife_enter_src_type");
        return stringExtra == null ? "3" : stringExtra;
    }
}
