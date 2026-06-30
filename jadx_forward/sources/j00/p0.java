package j00;

/* loaded from: classes5.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f378389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f378390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f378391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f378392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378393i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f378394m;

    public p0(j00.k1 k1Var, android.graphics.Bitmap bitmap, int i17, int i18, boolean z17, java.lang.String str, android.widget.ImageView imageView) {
        this.f378388d = k1Var;
        this.f378389e = bitmap;
        this.f378390f = i17;
        this.f378391g = i18;
        this.f378392h = z17;
        this.f378393i = str;
        this.f378394m = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        j00.k1 k1Var = this.f378388d;
        android.graphics.Bitmap bitmap2 = this.f378389e;
        int i17 = this.f378390f;
        int i18 = this.f378391g;
        boolean z17 = this.f378392h;
        k1Var.getClass();
        int b17 = z17 ? i17 : i17 - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i18 / bitmap2.getHeight()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "createEcsGiftMsgBubble, width: " + i17 + ", height: " + i18 + ", wantedBitmapWidth:" + ceil + ", srcBitMapWidth:" + bitmap2.getWidth() + ", srcBitMapHeight:" + bitmap2.getHeight());
        if (ceil <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "createEcsGiftMsgBubble, wantedBitmapWidth or height error");
            bitmap = null;
        } else {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i18, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
            int i19 = ceil - b17;
            if (i19 < 0) {
                i19 = 0;
            }
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i18), false), z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.dau : com.p314xaae8f345.mm.R.C30861xcebc809e.bzs);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new j00.o0(bitmap, this.f378393i, this.f378394m));
    }
}
