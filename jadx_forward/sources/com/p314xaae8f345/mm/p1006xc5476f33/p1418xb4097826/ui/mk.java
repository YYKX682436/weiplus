package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class mk extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        super(0);
        this.f211060d = activityC15076x7a6c76b6;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] byteArrayExtra = this.f211060d.getIntent().getByteArrayExtra("streamtabtipsinfo");
        if (byteArrayExtra != null) {
            if (!(byteArrayExtra.length == 0)) {
                r45.sf6 sf6Var = new r45.sf6();
                sf6Var.mo11468x92b714fd(byteArrayExtra);
                return sf6Var;
            }
        }
        return null;
    }
}
