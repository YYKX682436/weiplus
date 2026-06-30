package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44;

/* renamed from: com.tencent.mm.live.core.core.trtc.widget.BaseTabSettingFragmentDialog */
/* loaded from: classes5.dex */
public abstract class AbstractC10838x5dd409a4 extends com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.AbstractC10837x402023b7 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f150099d;

    @Override // com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p823x2eaf9f.p826x36756d.p830xd1075a44.AbstractC10837x402023b7
    /* renamed from: getLayoutId */
    public int mo46504x2ee31f5b() {
        return 0;
    }

    public abstract java.util.List l0();

    public abstract java.util.List m0();

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        super.mo7518x594b1124(view, bundle);
        this.f150099d = l0();
        m0();
        if (this.f150099d == null) {
            this.f150099d = new java.util.ArrayList();
        }
        throw null;
    }
}
