package b50;

/* loaded from: classes11.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f17940e;

    public f(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, java.lang.String str) {
        this.f17939d = boxFlutterBizPlugin;
        this.f17940e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f17939d.f67062e;
        if (bizBaseCallbackApi != null) {
            java.lang.String cardId = this.f17940e;
            kotlin.jvm.internal.o.f(cardId, "$cardId");
            bizBaseCallbackApi.deleteRecCard(cardId, b50.e.f17936d);
        }
    }
}
