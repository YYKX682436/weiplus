package wl4;

/* loaded from: classes14.dex */
public final class k implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e f528624a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e c18727x606014e) {
        this.f528624a = c18727x606014e;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e c18727x606014e = this.f528624a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2300xaf968b71.C18727x606014e.f256251i;
            c18727x606014e.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingRadioChannelFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new wl4.j(c18727x606014e));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = c18727x606014e.f256252d;
        if (c22628xfde5d61d == null) {
            return;
        }
        c22628xfde5d61d.setVisibility(0);
    }
}
