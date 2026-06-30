package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public final class w6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f146152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120) {
        super(0);
        this.f146152d = activityC10349x67700120;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f146152d.getIntent().getStringExtra("intent_chatroom_username");
        return stringExtra == null ? "" : stringExtra;
    }
}
