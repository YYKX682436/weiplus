package rk2;

/* loaded from: classes3.dex */
public final class c extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final mn0.b0 f477980d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f477981e;

    /* renamed from: f, reason: collision with root package name */
    public final uk2.b f477982f;

    public c(mn0.b0 player, boolean z17, uk2.b data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f477980d = player;
        this.f477981e = z17;
        this.f477982f = data;
    }

    public final void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AbsTXLivePlayListener", "key: " + this.f477982f.a() + ' ' + str);
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        super.mo15376x8cd414a7(i17, bundle);
        if (i17 == -2301) {
            a("onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:" + (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == -1));
            return;
        }
        if (i17 == 1007) {
            a("onPlayEvent PUSH_EVT_FIRST_FRAME_AVAILABLE");
            return;
        }
        if (i17 == 2001) {
            a("onPlayEvent ".concat(i17 == 2004 ? "PLAY_EVT_PLAY_BEGIN" : "PLAY_EVT_CONNECT_SUCC"));
            return;
        }
        if (i17 != 2009) {
            if (i17 == 2033) {
                a("receive EVT_PLAY_VIEW_CHANGED_FIRST_I_FRAME");
                return;
            } else {
                if (i17 != 2103) {
                    return;
                }
                a("onPlayEvent PLAY_WARNING_RECONNECT, non_network:" + (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == -1));
                return;
            }
        }
        int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        mn0.y yVar = (mn0.y) this.f477980d;
        boolean z17 = this.f477981e;
        yVar.Q(z17 ? 1 : 0);
        a("onPlayEvent PLAY_EVT_CHANGE_RESOLUTION, w:h=" + i18 + ':' + i19 + " videoRatioWH:" + ((i18 * 1.0f) / i19) + " isLandscape: " + z17);
    }
}
