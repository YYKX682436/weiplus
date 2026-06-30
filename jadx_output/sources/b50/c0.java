package b50;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, int i17) {
        super(1);
        this.f17927d = boxFlutterBizPlugin;
        this.f17928e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((kotlin.Result) obj).getValue();
        com.tencent.mars.xlog.Log.i(this.f17927d.f67061d, "onBizFinderLiveInfoUpdate " + this.f17928e);
        return jz5.f0.f302826a;
    }
}
