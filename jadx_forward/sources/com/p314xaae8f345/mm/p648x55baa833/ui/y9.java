package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public final class y9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 f146221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0) {
        super(0);
        this.f146221d = activityC10359x5d5d51f0;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f146221d.getIntent().getStringExtra("RoomInfo_Id");
        return stringExtra == null ? "" : stringExtra;
    }
}
