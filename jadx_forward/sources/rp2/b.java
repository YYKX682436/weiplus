package rp2;

/* loaded from: classes3.dex */
public final class b extends mn0.a {
    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        if (i17 == 2001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_CONNECT_SUCC");
            return;
        }
        if (i17 != 2009) {
            if (i17 == 2033) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW");
                return;
            } else if (i17 == 2003) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_RCV_FIRST_I_FRAME");
                return;
            } else {
                if (i17 != 2004) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_PLAY_BEGIN");
                return;
            }
        }
        int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePreloadVideoView", "rcv PLAY_EVT_CHANGE_RESOLUTION videoWidth=" + i18 + " videoHeight=" + i19 + " videoRatioWH=" + ((i18 * 1.0f) / i19));
    }
}
