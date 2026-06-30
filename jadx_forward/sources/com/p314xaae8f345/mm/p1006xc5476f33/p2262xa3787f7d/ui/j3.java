package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class j3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 f254572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18578x68ca6165 activityC18578x68ca6165) {
        super(0);
        this.f254572d = activityC18578x68ca6165;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6 a6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.a6();
        java.lang.String stringExtra = this.f254572d.getIntent().getStringExtra("IntentKey_TeenModeIntroData");
        if (stringExtra == null) {
            stringExtra = "";
        }
        a6Var.m126728xdc93280d(stringExtra);
        return a6Var;
    }
}
