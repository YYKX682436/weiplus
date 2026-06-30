package xl4;

/* loaded from: classes14.dex */
public final class h implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2301x75874b70.C18728xcf9e270 f536663a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2301x75874b70.C18728xcf9e270 c18728xcf9e270) {
        this.f536663a = c18728xcf9e270;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2301x75874b70.C18728xcf9e270 c18728xcf9e270 = this.f536663a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2298xe294b26d.p2301x75874b70.C18728xcf9e270.f256257i;
            c18728xcf9e270.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingRadioChannelFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new xl4.g(c18728xcf9e270));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = c18728xcf9e270.f256258d;
        if (c22628xfde5d61d == null) {
            return;
        }
        c22628xfde5d61d.setVisibility(0);
    }
}
