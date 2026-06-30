package vl4;

/* loaded from: classes14.dex */
public final class o implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2299x55baa833.C18726x3fbb17bf f519430a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2299x55baa833.C18726x3fbb17bf c18726x3fbb17bf) {
        this.f519430a = c18726x3fbb17bf;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2299x55baa833.C18726x3fbb17bf c18726x3fbb17bf = this.f519430a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2299x55baa833.C18726x3fbb17bf.f256245i;
            c18726x3fbb17bf.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingChatRoomFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new vl4.n(c18726x3fbb17bf));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = c18726x3fbb17bf.f256246d;
        if (c22628xfde5d61d == null) {
            return;
        }
        c22628xfde5d61d.setVisibility(0);
    }
}
