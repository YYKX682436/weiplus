package b50;

/* loaded from: classes10.dex */
public final class a0 implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17920b;

    public a0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, yz5.l lVar) {
        this.f17919a = boxFlutterBizPlugin;
        this.f17920b = lVar;
    }

    @Override // gy1.d
    public final void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f17919a.f67061d, "bobkw getSessionJumpPaths paths=" + obj);
        yz5.l lVar = this.f17920b;
        if (lVar != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str == null) {
                str = "";
            }
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(str)));
        }
    }
}
