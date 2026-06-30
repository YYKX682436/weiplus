package b50;

/* loaded from: classes11.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.lr4 f17973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizMinimizeInfo f17974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.k97 f17976g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r45.lr4 lr4Var, com.tencent.pigeon.biz_base.BizMinimizeInfo bizMinimizeInfo, com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, r45.k97 k97Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f17973d = lr4Var;
        this.f17974e = bizMinimizeInfo;
        this.f17975f = boxFlutterBizPlugin;
        this.f17976g = k97Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b50.o0(this.f17973d, this.f17974e, this.f17975f, this.f17976g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        b50.o0 o0Var = (b50.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin = this.f17975f;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cs1.a aVar2 = cs1.b.f222057a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.pigeon.biz_base.BizMinimizeInfo bizMinimizeInfo = this.f17974e;
        java.lang.Long itemShowType = bizMinimizeInfo.getItemShowType();
        int longValue = itemShowType != null ? (int) itemShowType.longValue() : 0;
        java.lang.String userName = bizMinimizeInfo.getUserName();
        if (userName == null) {
            userName = "";
        }
        java.lang.String title = bizMinimizeInfo.getTitle();
        this.f17973d.set(1, aVar2.a(context, longValue, userName, title != null ? title : ""));
        byte[] bArr = null;
        try {
            bitmap = com.tencent.mm.sdk.platformtools.x.G(bizMinimizeInfo.getCoverImage());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(boxFlutterBizPlugin.f67061d, e17, "onMinimizeArticle", new java.lang.Object[0]);
            bitmap = null;
        }
        byte[] byteArray = this.f17976g.toByteArray();
        java.lang.String url = bizMinimizeInfo.getUrl();
        if (url != null) {
            bArr = url.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        }
        java.lang.String str = bizMinimizeInfo.getLocalId() + '_' + kk.k.g(bArr);
        com.tencent.mars.xlog.Log.i(boxFlutterBizPlugin.f67061d, "addTaskInfoByBitmap, id = " + str);
        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).Ai(str, 2, this.f17973d, bitmap, byteArray, new mk3.a(null, false, false, 7, null));
        return jz5.f0.f302826a;
    }
}
