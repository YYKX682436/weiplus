package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes11.dex */
public final class r6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19736xc88c6c70 f273412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19736xc88c6c70 activityC19736xc88c6c70) {
        super(0);
        this.f273412d = activityC19736xc88c6c70;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f273412d.getIntent().getStringExtra("to_user");
        if (stringExtra != null) {
            return stringExtra;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBFileShareProxyUI", "username null?");
        return "";
    }
}
