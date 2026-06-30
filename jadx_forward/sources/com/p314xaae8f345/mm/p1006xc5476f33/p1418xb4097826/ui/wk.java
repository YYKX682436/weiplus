package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class wk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 f211527d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 activityC15084x4121bf5) {
        super(0);
        this.f211527d = activityC15084x4121bf5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f211527d.getIntent().getStringExtra("InteractionNickname");
        return stringExtra == null ? "" : stringExtra;
    }
}
