package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes8.dex */
public final class pi implements fb0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qi f281250a;

    public pi(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qi qiVar) {
        this.f281250a = qiVar;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgComponent", "isShow:" + z17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qi qiVar = this.f281250a;
        if (qiVar.f281320e == null) {
            android.view.View c17 = qiVar.f280113d.c(com.p314xaae8f345.mm.R.id.blo);
            qiVar.f281320e = c17 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21615x5b594e4d ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21615x5b594e4d) c17 : null;
            if (qiVar.f281320e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgComponent", "chatting_footer_more_btn_bar not found");
            }
        }
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21615x5b594e4d c21615x5b594e4d = qiVar.f281320e;
            if (c21615x5b594e4d == null || c21615x5b594e4d.f279747h.getVisibility() == 8) {
                return;
            }
            c21615x5b594e4d.f279751o.remove(5);
            c21615x5b594e4d.f279747h.animate().alpha(0.0f).setDuration(500L).setListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.c5(c21615x5b594e4d));
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21615x5b594e4d c21615x5b594e4d2 = qiVar.f281320e;
        if (c21615x5b594e4d2 == null || c21615x5b594e4d2.f279747h.getVisibility() == 0) {
            return;
        }
        c21615x5b594e4d2.f279751o.add(5);
        c21615x5b594e4d2.f279747h.setVisibility(0);
        c21615x5b594e4d2.f279747h.animate().alpha(1.0f).setDuration(500L).setListener(null);
    }
}
