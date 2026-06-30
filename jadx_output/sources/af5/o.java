package af5;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f4616d;

    /* renamed from: e, reason: collision with root package name */
    public int f4617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f4618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4619g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4620h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4621i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, int i17, int i18, com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4618f = str;
        this.f4619g = i17;
        this.f4620h = i18;
        this.f4621i = chattingAskShareMvvmView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new af5.o(this.f4618f, this.f4619g, this.f4620h, this.f4621i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((af5.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        int cropLongerLenThreshold;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f4617e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gk0.h hVar = new gk0.h(this.f4618f);
            gk0.k kVar = new gk0.k(0, 0);
            java.lang.String Bi = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(hVar, kVar);
            i95.m c17 = i95.n0.c(gk0.n0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c17, Bi, kVar, null, null, 8, null);
            x66.l("Common_HttpParams", hVar);
            gk0.b Ni = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ni();
            this.f4616d = "[loadThumbFromNetwork] ";
            this.f4617e = 1;
            obj = Ni.a(x66, this);
            if (obj == aVar) {
                return aVar;
            }
            str = "[loadThumbFromNetwork] ";
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f4616d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", str + "bitmap is null");
            return null;
        }
        if (!bitmap.isRecycled()) {
            cropLongerLenThreshold = this.f4621i.getCropLongerLenThreshold();
            return com.tencent.mm.sdk.platformtools.x.R(bitmap, this.f4619g, this.f4620h, cropLongerLenThreshold);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", str + "bitmap is recycled");
        return null;
    }
}
