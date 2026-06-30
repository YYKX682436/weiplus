package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class nb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e f211079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15048xbc5a5f5e activityC15048xbc5a5f5e) {
        super(0);
        this.f211079d = activityC15048xbc5a5f5e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f211079d.getIntent().getStringExtra("key_show_thank_tips_content");
        return stringExtra == null ? "" : stringExtra;
    }
}
