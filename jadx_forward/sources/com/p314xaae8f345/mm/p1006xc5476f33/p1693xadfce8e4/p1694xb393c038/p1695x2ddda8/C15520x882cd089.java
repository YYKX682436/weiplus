package com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8;

/* renamed from: com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthFragment */
/* loaded from: classes14.dex */
public class C15520x882cd089 extends p012xc85e97e9.p016x746ad0e3.app.C0067xeeb05b7b {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f218513d;

    @Override // p012xc85e97e9.p016x746ad0e3.app.C0067xeeb05b7b, p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: onCreateDialog */
    public android.app.Dialog mo2553xb69168e3(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79 dialogC15522xdfb03a79 = new com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.DialogC15522xdfb03a79(mo7430x19263085(), null, null);
        this.f218513d = dialogC15522xdfb03a79;
        dialogC15522xdfb03a79.setCancelable(false);
        return this.f218513d;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        m7393x15b1203e().requestWindowFeature(1);
        return super.mo7503x18bad100(layoutInflater, viewGroup, bundle);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        android.app.Dialog dialog = this.f218513d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
