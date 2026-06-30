package af5;

/* loaded from: classes9.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f4630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f4631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.g f4632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f4633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f4634h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView, z01.g gVar, android.widget.ImageView imageView, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f4631e = chattingAskShareMvvmView;
        this.f4632f = gVar;
        this.f4633g = imageView;
        this.f4634h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new af5.r(this.f4631e, this.f4632f, this.f4633g, this.f4634h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((af5.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f4630d;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView = this.f4631e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f4630d = 1;
            obj = com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView.i(chattingAskShareMvvmView, this.f4632f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int i18 = com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView.f204613i;
        chattingAskShareMvvmView.getClass();
        android.widget.ImageView imageView = this.f4633g;
        if (bitmap == null || bitmap.isRecycled()) {
            if (bitmap == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is null");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingAskShareMvvmView", "[setImageBitmap] bitmap is recycled");
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(imageView)) {
                imageView.post(new af5.u(chattingAskShareMvvmView, imageView));
            } else {
                imageView.addOnAttachStateChangeListener(new af5.t(imageView, chattingAskShareMvvmView, imageView));
            }
        } else {
            imageView.setImageBitmap(bitmap);
        }
        this.f4634h.invoke(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
