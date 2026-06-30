package com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9;

/* renamed from: com.tencent.kinda.framework.sns_cross.NewAAUseCaseCallback */
/* loaded from: classes9.dex */
public class C3272xe26a40fc implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d {

    /* renamed from: mBean */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d f12495x61f89bd;

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
    /* renamed from: call */
    public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        android.content.Context m26001x76847179 = this.f12495x61f89bd.m26001x76847179();
        if ("1".equals(abstractC3411xcfaed72e.mo27551x2fec8307("closeLoading")) && (m26001x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda) m26001x76847179).mo48627xce38d9a();
            return;
        }
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(ya.b.f77506xba41a63c);
        int i17 = abstractC3411xcfaed72e.mo27544xb58848b9("retcode") == 1 ? -1 : 0;
        if (m26001x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_trans_id", mo27551x2fec8307);
            ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda) m26001x76847179).m7(i17, intent);
        } else if (m26001x76847179 instanceof com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_trans_id", mo27551x2fec8307);
            ((com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2) m26001x76847179).j7(i17, intent2);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.InterfaceC3267x684dce4d
    /* renamed from: setData */
    public void mo25996x76491f2c(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56) {
        this.f12495x61f89bd = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p357xa8b0beb9.C3275x1c73078d(context, c19760x34448d56);
    }
}
