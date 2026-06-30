package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 f287021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 f287022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w05.d f287023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287024g;

    public s5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var2, w05.d dVar, yb5.d dVar2) {
        this.f287021d = w5Var;
        this.f287022e = w5Var2;
        this.f287023f = dVar;
        this.f287024g = dVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var = this.f287021d;
        if (w5Var.mo79417x33dec1ed() != null) {
            p3325xe03a0797.p3326xc267989b.y0 mo79417x33dec1ed = w5Var.mo79417x33dec1ed();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo79417x33dec1ed);
            if (p3325xe03a0797.p3326xc267989b.z0.h(mo79417x33dec1ed)) {
                int i17 = w5Var.f287435f;
                int i18 = w5Var.f287434e;
                if (i17 > i18) {
                    i17 = i18;
                }
                w5Var.f287435f = i17;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w5 w5Var2 = this.f287022e;
                android.widget.TextView textView = w5Var2.f287431b;
                if (textView != null) {
                    textView.setTextSize(0, i17);
                }
                c00.e3 e3Var = (c00.e3) i95.n0.c(c00.e3.class);
                w05.d dVar = this.f287023f;
                java.lang.String w17 = dVar.w();
                int n17 = dVar.n();
                yb5.d dVar2 = this.f287024g;
                java.lang.String cj6 = ((j00.k1) e3Var).cj(w17, n17, dVar2.x(), dVar.z(), w5Var2.f287431b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "exclusiveTitleStr:" + cj6);
                android.widget.TextView textView2 = w5Var2.f287431b;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                }
                android.widget.TextView textView3 = w5Var2.f287431b;
                if (textView3 == null) {
                    return;
                }
                textView3.setText(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(dVar2.g(), cj6, w5Var.f287435f));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgEcsGiftChatroom", "view holder scope is null or is deactivate");
    }
}
