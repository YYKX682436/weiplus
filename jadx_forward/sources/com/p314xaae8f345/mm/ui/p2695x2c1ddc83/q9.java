package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class q9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5 f289560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5 activityC22379xa796fab5) {
        super(0);
        this.f289560d = activityC22379xa796fab5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f289560d.getIntent();
        return java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("open_im_kefu_conversation_list_ui_from_scene", -1) : -1);
    }
}
