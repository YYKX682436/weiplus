package pg2;

/* loaded from: classes3.dex */
public final class i implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435652e;

    public i(ug5.v vVar, pg2.j0 j0Var) {
        this.f435651d = vVar;
        this.f435652e = j0Var;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        if (i17 == 2003) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "rcv PLAY_EVT_RCV_FIRST_I_FRAME");
            return;
        }
        ug5.v vVar = this.f435651d;
        if (i17 != 2009) {
            if (i17 != 2033) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "rcv PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW");
            vVar.f509191a.f509128i.put("key_first_frame_render", java.lang.Boolean.TRUE);
            java.lang.Object obj = vVar.f509191a.f509128i.get("key_enter_anim_complete");
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 c10851x9baaeea1 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1) vVar.f509193c;
            this.f435652e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "handleStaticCoverImage animEnd=" + booleanValue + " firstFrameRender=true");
            if (!booleanValue || c10851x9baaeea1 == null) {
                return;
            }
            c10851x9baaeea1.a();
            return;
        }
        int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        vVar.f509191a.f509128i.put("key_video_w", java.lang.Integer.valueOf(i18));
        vVar.f509191a.f509128i.put("key_video_h", java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "rcv PLAY_EVT_CHANGE_RESOLUTION videoWidth=" + i18 + " videoHeight=" + i19 + " videoRatioWH=" + ((i18 * 1.0f) / i19));
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1 c10851x9baaeea12 = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10851x9baaeea1) vVar.f509193c;
        if (c10851x9baaeea12 != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            int intValue = java.lang.Integer.valueOf(i19).intValue();
            int intValue2 = valueOf.intValue();
            int i27 = com.p314xaae8f345.mm.ui.bl.b(c10851x9baaeea12.getContext()).x;
            int i28 = com.p314xaae8f345.mm.ui.bl.b(c10851x9baaeea12.getContext()).y;
            if (intValue <= 0 || intValue2 <= 0) {
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = c10851x9baaeea12.f150157e;
                if (c10850xc00cf614 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveVideoView");
                    throw null;
                }
                c10850xc00cf614.setAlpha(0.0f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveVideoViewCompatCover", "adjustLayout size = 0");
                return;
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) ((s40.b1) i95.n0.c(s40.b1.class))).getClass();
            android.graphics.Rect b17 = qg2.d.f444326a.b(intValue2, intValue, false);
            layoutParams.topMargin = b17.top;
            layoutParams.width = i27;
            int height = b17.height();
            layoutParams.height = height;
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf6142 = c10851x9baaeea12.f150157e;
            if (c10850xc00cf6142 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveVideoView");
                throw null;
            }
            int i29 = layoutParams.width;
            android.view.SurfaceView surfaceView = c10850xc00cf6142.f150155g;
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 c10846x3bc26740 = surfaceView instanceof com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740 ? (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740) surfaceView : null;
            if (c10846x3bc26740 != null) {
                c10846x3bc26740.a(i29, height);
            }
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf6143 = c10851x9baaeea12.f150157e;
            if (c10850xc00cf6143 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveVideoView");
                throw null;
            }
            c10850xc00cf6143.setLayoutParams(layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoViewCompatCover", "adjustLayout top=" + b17.top + " left=" + b17.left + " width=" + b17.width() + " height=" + b17.height() + " screenWidth=" + i27 + " screenHeight=" + i28);
        }
    }
}
