package gh4;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f353502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f353504f;

    public z(android.graphics.Bitmap bitmap, java.lang.String str, yz5.a aVar) {
        this.f353502d = bitmap;
        this.f353503e = str;
        this.f353504f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f353502d;
        yz5.a aVar = this.f353504f;
        java.lang.String str = this.f353503e;
        try {
            if (!gh4.l0.f353471a.a(bitmap, "", str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", "saveBitmapToImageProtected convertBmp2Wxam fail, saveBitmapToImage ret:%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, false)));
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
