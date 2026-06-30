package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class bs extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f193601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f193603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar) {
        super(0);
        this.f193601d = j17;
        this.f193602e = str;
        this.f193603f = etVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID", this.f193601d);
        bundle.putString("PARAM_FINDER_LIVE_NOTIFY_SEND_MSG_CONTENT", this.f193602e);
        this.f193603f.f193981p.mo46557x60d69242(qo0.b.A4, bundle);
        return jz5.f0.f384359a;
    }
}
