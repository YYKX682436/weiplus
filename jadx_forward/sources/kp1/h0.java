package kp1;

/* loaded from: classes11.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 f392439d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3) {
        this.f392439d = c12881xbe3683d3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendV2$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.C12881xbe3683d3 c12881xbe3683d3 = this.f392439d;
        np1.a currentPlayInfo = c12881xbe3683d3.getCurrentPlayInfo();
        if (currentPlayInfo != null) {
            pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
            if (c12881xbe3683d3.f174547x != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bw5.xb0 xb0Var = c12881xbe3683d3.f174547x;
                bundle2.putInt("key_listen_sync_item_type", xb0Var != null ? xb0Var.f116578e : 0);
                bundle = bundle2;
            } else {
                bundle = null;
            }
            ((ov.b) zVar).N9(1, currentPlayInfo, 1, bundle, new kp1.f0(c12881xbe3683d3));
        } else {
            if (c12881xbe3683d3.f174547x != null) {
                ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).L(true);
                ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).N(false);
            }
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.os.Bundle bundle3 = new android.os.Bundle();
            bw5.xb0 xb0Var2 = c12881xbe3683d3.f174547x;
            bundle3.putInt("key_listen_sync_item_type", xb0Var2 != null ? xb0Var2.f116578e : 0);
            ((rk4.k8) aj6).y(context, bundle3, bw5.ar0.TingScene_MediaControlCenter, new il4.e(null, 0, 5, false, null, null, 0, 0, false, false, null, 1, null, null, null, null, false, false, null, null, false, null, false, null, false, 33552379, null), new kp1.g0(c12881xbe3683d3));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendV2$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
