package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class s9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5 f289601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22379xa796fab5 activityC22379xa796fab5) {
        super(0);
        this.f289601d = activityC22379xa796fab5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f289601d.getIntent();
        return java.lang.Boolean.valueOf(intent != null ? intent.getBooleanExtra("key_is_confirm_page_shown", false) : false);
    }
}
