package ql2;

/* loaded from: classes10.dex */
public final class n extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql2.r f446067d;

    public n(ql2.r rVar) {
        this.f446067d = rVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        if (i17 == 2009) {
            int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
            int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
            ql2.r rVar = this.f446067d;
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 c25485x5a0a6891 = rVar.f446079i;
            if (c25485x5a0a6891 != null) {
                c25485x5a0a6891.m94528x1c9cdc8c(i18, i19);
            }
            android.graphics.SurfaceTexture surfaceTexture = rVar.f446080m;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i18, i19);
            }
            rVar.f446083p.a(i18, i19, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AbsTXLivePlayListener", "PLAY_EVT_CHANGE_RESOLUTION width:" + i18 + " height:" + i19);
        }
    }
}
