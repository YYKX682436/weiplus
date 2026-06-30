package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class p3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 f272585a;

    public p3(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722) {
        this.f272585a = abstractC19655xeb0f7722;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f272585a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", java.lang.Integer.valueOf(abstractC19655xeb0f7722.f271389g));
            }
        }
        int i18 = abstractC19655xeb0f7722.f271389g;
        if (abstractC19655xeb0f7722.f271389g != 3) {
            return;
        }
        abstractC19655xeb0f7722.f271394o.mo50303x856b99f0(0);
        abstractC19655xeb0f7722.f271394o.mo50303x856b99f0(1);
        z21.w wVar = abstractC19655xeb0f7722.f271387e;
        if (wVar != null) {
            wVar.mo48278xae7a2e7a(true);
        }
        abstractC19655xeb0f7722.h(true);
    }
}
