package b50;

/* loaded from: classes11.dex */
public final class c1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f17930e;

    public c1(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, java.lang.ref.WeakReference weakReference) {
        this.f17929d = boxFlutterBizPlugin;
        this.f17930e = weakReference;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        if (valueOf != null && valueOf.intValue() == 385) {
            gm0.j1.d().q(385, this);
            boolean Bi = ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Bi();
            com.tencent.mars.xlog.Log.i(this.f17929d.f67061d, "onSceneEnd: %s, %s, %s, unReg: %s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(Bi));
            com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f17930e.get();
            if (bizPersonalCenterNativeToFlutterApi != null) {
                bizPersonalCenterNativeToFlutterApi.showRegisterPage(!Bi, b50.b1.f17925d);
            }
        }
    }
}
