package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e f191269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e activityC13932x386ad3e) {
        super(0);
        this.f191269d = activityC13932x386ad3e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] byteArrayExtra = this.f191269d.getIntent().getByteArrayExtra("STREAM_CARD");
        if (byteArrayExtra == null) {
            return null;
        }
        r45.ww2 ww2Var = new r45.ww2();
        ww2Var.mo11468x92b714fd(byteArrayExtra);
        return ww2Var;
    }
}
