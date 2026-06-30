package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class p1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 f219847a;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722) {
        this.f219847a = abstractC15625xeb0f7722;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722 = this.f219847a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoiceInputLayout", "Recognized revealTime force finished %s", java.lang.Integer.valueOf(abstractC15625xeb0f7722.f219766f));
            }
        }
        int i18 = abstractC15625xeb0f7722.f219766f;
        if (abstractC15625xeb0f7722.f219766f != 3) {
            return;
        }
        abstractC15625xeb0f7722.f219771n.mo50303x856b99f0(0);
        abstractC15625xeb0f7722.f219771n.mo50303x856b99f0(1);
        z21.e eVar = abstractC15625xeb0f7722.f219765e;
        if (eVar != null) {
            eVar.mo48278xae7a2e7a(true);
        }
        abstractC15625xeb0f7722.k(true);
    }
}
