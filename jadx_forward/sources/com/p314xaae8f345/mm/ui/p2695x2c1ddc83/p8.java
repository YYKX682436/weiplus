package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class p8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22378x56f312b8 f289500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22378x56f312b8 activityC22378x56f312b8) {
        super(0);
        this.f289500d = activityC22378x56f312b8;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f289500d.getIntent();
        return java.lang.Boolean.valueOf(intent != null ? intent.getBooleanExtra("key_is_confirm_page_shown", false) : false);
    }
}
