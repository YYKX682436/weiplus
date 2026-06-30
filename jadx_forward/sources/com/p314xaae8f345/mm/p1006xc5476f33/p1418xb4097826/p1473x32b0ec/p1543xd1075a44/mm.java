package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class mm implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm f200614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zi2.w f200615e;

    public mm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar, zi2.w wVar) {
        this.f200614d = wmVar;
        this.f200615e = wVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.y0 y0Var = (mm2.y0) obj;
        int ordinal = y0Var.f411081a.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = this.f200614d;
        if (ordinal != 0) {
            if (ordinal == 1 || ordinal == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(wmVar.f201741f, "Gift send failed: " + y0Var.f411081a);
                return;
            }
            return;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_KTV_SEND_GIFT_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.os.Bundle bundle = y0Var.f411083c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bundle.getString("PARAM_FINDER_LIVE_GIFT_ID"), wmVar.f201745m)) {
            ce2.i e17 = dk2.u7.f315714a.e(wmVar.f201745m);
            java.lang.String R0 = e17 != null ? e17.R0() : null;
            boolean z17 = bundle.getBoolean("PARAM_FINDER_LIVE_IS_LONG_CLICK_GIFT", false);
            int[] iArr = new int[2];
            android.view.ViewGroup viewGroup = wmVar.f201742g;
            viewGroup.getLocationOnScreen(iArr);
            int width = iArr[0] + (viewGroup.getWidth() / 2);
            int height = iArr[1] + (viewGroup.getHeight() / 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wmVar.f201741f, "Gift send success, triggering flower animation");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("gift_thumb_url", R0);
            bundle2.putBoolean("gift_is_long_click", z17);
            bundle2.putInt("gift_start_x", width);
            bundle2.putInt("gift_start_y", height);
            this.f200615e.f554686p.mo46557x60d69242(qo0.b.S, bundle2);
        }
    }
}
