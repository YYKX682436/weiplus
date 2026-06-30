package vc1;

/* loaded from: classes13.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap[] f516713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.w f516715f;

    public u(vc1.w wVar, android.graphics.Bitmap[] bitmapArr, int i17) {
        this.f516715f = wVar;
        this.f516713d = bitmapArr;
        this.f516714e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a;
        vc1.w wVar = this.f516715f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "realMarker setGifIcon markerId:%s", wVar.f516724b.f516728f);
        vc1.x xVar = wVar.f516724b;
        vc1.o1 z17 = xVar.f516735p.z(xVar.f516728f);
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a2 = wVar.f516724b.f516729g;
        int i17 = this.f516714e;
        android.graphics.Bitmap[] bitmapArr = this.f516713d;
        if (interfaceC4409x88f1805a2 != null) {
            interfaceC4409x88f1805a2.mo37253xb2cd479b(bitmapArr, true, i17);
        } else if (z17 != null && (interfaceC4409x88f1805a = z17.f516563c) != null && interfaceC4409x88f1805a != null && i17 > 0) {
            interfaceC4409x88f1805a.mo37253xb2cd479b(bitmapArr, true, i17);
        }
        for (android.graphics.Bitmap bitmap : bitmapArr) {
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }
}
