package zl4;

/* loaded from: classes14.dex */
public final class h implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2302x7e650cbf.p2303x822d9a5b.C18729x76efb8aa f555614a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2302x7e650cbf.p2303x822d9a5b.C18729x76efb8aa c18729x76efb8aa) {
        this.f555614a = c18729x76efb8aa;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2302x7e650cbf.p2303x822d9a5b.C18729x76efb8aa c18729x76efb8aa = this.f555614a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2302x7e650cbf.p2303x822d9a5b.C18729x76efb8aa.f256263i;
            c18729x76efb8aa.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingRadioChannelFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new zl4.g(c18729x76efb8aa));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = c18729x76efb8aa.f256264d;
        if (c22628xfde5d61d == null) {
            return;
        }
        c22628xfde5d61d.setVisibility(0);
    }
}
