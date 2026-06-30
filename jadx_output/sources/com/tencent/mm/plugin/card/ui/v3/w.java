package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class w implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public r45.wt f95391d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f95392e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95393f;

    public w(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
    }

    public final r45.wt a() {
        r45.wt wtVar = this.f95391d;
        if (wtVar != null) {
            return wtVar;
        }
        kotlin.jvm.internal.o.o("couponCardInfo");
        throw null;
    }

    @Override // in5.c
    public long getItemId() {
        return a().f389427d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
