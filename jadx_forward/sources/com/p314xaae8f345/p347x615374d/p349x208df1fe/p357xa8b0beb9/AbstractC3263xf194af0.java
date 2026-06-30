package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.BaseSnsSceneService */
/* loaded from: classes9.dex */
public abstract class AbstractC3263xf194af0 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98 {

    /* renamed from: mBean */
    com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d f12492x61f89bd;

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98
    /* renamed from: generateSnsUseCaseData */
    public com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e mo25994x63ee79de() {
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("req_key", this.f12492x61f89bd.m26005x2d6363d7());
        m27539xaf65a0fc.mo27557xc5c55e60("payChannel", this.f12492x61f89bd.m26000x69d8b8cd());
        m27539xaf65a0fc.mo27557xc5c55e60("payScene", this.f12492x61f89bd.m26003xccd4de3a());
        return m27539xaf65a0fc;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3266xa5a26a98
    /* renamed from: setData */
    public void mo25995x76491f2c(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this.f12492x61f89bd = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d(context, c19760x34448d56);
    }
}
