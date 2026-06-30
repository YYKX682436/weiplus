package j00;

/* loaded from: classes5.dex */
public final class q0 implements j00.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f378398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f378399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f378400c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f378402e;

    public q0(int i17, int i18, boolean z17, j00.k1 k1Var, android.widget.ImageView imageView) {
        this.f378398a = i17;
        this.f378399b = i18;
        this.f378400c = z17;
        this.f378401d = k1Var;
        this.f378402e = imageView;
    }

    public void a(android.graphics.Bitmap bitmap, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, bitmap is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgService", "loadGiftMsgBubbleCover, create bubble, url:" + url + ", viewHeight:" + this.f378398a + ", viewWitdh:" + this.f378399b + ", isSender:" + this.f378400c);
        ((ku5.t0) ku5.t0.f394148d).h(new j00.p0(this.f378401d, bitmap, this.f378399b, this.f378398a, this.f378400c, url, this.f378402e), "MicroMsg.EcsGiftMsgService");
    }
}
