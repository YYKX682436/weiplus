package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44;

/* renamed from: com.tencent.mm.live.core.core.trtc.widget.BaseSettingFragmentDialog */
/* loaded from: classes10.dex */
public abstract class AbstractC10837x402023b7 extends p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8 {
    /* renamed from: getLayoutId */
    public abstract int mo46504x2ee31f5b();

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        m7412x53b6de6f(1, 0);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(mo46504x2ee31f5b(), viewGroup, false);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        android.view.Window window = m7393x15b1203e().getWindow();
        if (window != null) {
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            mo7430x19263085().getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
            window.setAttributes(attributes);
            android.app.Dialog m7393x15b1203e = m7393x15b1203e();
            if (m7393x15b1203e != null) {
                m7393x15b1203e.getWindow().setLayout((int) (r2.widthPixels * 0.9d), (int) (r2.heightPixels * 0.8d));
            }
        }
    }
}
